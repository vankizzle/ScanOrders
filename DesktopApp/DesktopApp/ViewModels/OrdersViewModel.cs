using DesktopApp.Commands;
using DesktopApp.Helpers;
using DesktopApp.Models;
using GalaSoft.MvvmLight.Ioc;
using MahApps.Metro.Controls;
using MahApps.Metro.Controls.Dialogs;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Data;
using System.Windows.Input;
using System.Windows.Threading;

namespace DesktopApp.ViewModels
{
    class OrdersViewModel : BaseViewModel
    {
        #region Definitions
        private ObservableCollection<Order> currentOrders;

        private ObservableCollection<Order> ordersToShow;

        private PageNavigation navigation;

        private ObservableCollection<Good> currentOrderGoods = new ObservableCollection<Good>();

        private Order currentOrder = new Order();

        private Customer currentOrderCustomer;

        private bool isEnabledButtons;

        private int currentPageIndex;

        private int numberOfPages;

        private int itemsPerPage = 15;

        private ICommand deleteCommand;

        private ICommand confirmCommand;

        private ICommand navigatePages;

        private ICommand loadOrderInfo;

        private const int numberOfItemsPerPage = 20;

        private string pagingLabel;

        DispatcherTimer ordersRefreshTimer;

        private IDialogCoordinator dialogCoordinator;
        #endregion

        #region Properties

        public int CurrentPageIndex
        {
            get
            {
                return currentPageIndex;
            }

            set
            {
                if (currentPageIndex != value)
                {
                    currentPageIndex = value;
                    OnPropertyChanged("CurrentPage");
                }
            }
        }

        public int ItemsPerPage
        {
            get
            {
                return itemsPerPage;
            }

            set
            {
                if (itemsPerPage != value)
                {
                    itemsPerPage = value;
                    OnPropertyChanged("ItemsPerPage");
                }
            }
        }

        public bool IsEnabledButtons
        {
            get => isEnabledButtons;

            set
            {
                if (isEnabledButtons != value)
                {
                    isEnabledButtons = value;
                    OnPropertyChanged("IsEnabledButtons");
                }
            }
        }

        public int CurrentPage
        {
            get { return currentPageIndex + 1; }
        }

        //public string CurrentPage
        //{
        //    get
        //    {
        //        return currentPage;
        //    }
        //    set
        //    {
        //        if (currentPage != value)
        //        {
        //            currentPage = value;
        //            OnPropertyChanged("CurrentPage");
        //        }
        //    }
        //}

        public int NumberOfPages
        {
            get
            {
                return numberOfPages;
            }
            set
            {
                if (numberOfPages != value)
                {
                    numberOfPages = value;
                    OnPropertyChanged("NumberOfPages");
                }
            }
        }

        public CollectionViewSource ViewList { get; set; }

        public ICommand NavigatePages => navigatePages ?? (navigatePages = new RelayCommand((s) => Navigate(s)));

        public ICommand LoadOrderInfo => loadOrderInfo ?? (loadOrderInfo = new RelayCommand((s) =>LoadCurrentOrderInfo()));

        public ICommand DeleteCommand
        {

            get
            {

                if (deleteCommand == null)
                {
                    deleteCommand = new DelegateCommand(RejectSelectedOrder);
                }
                return deleteCommand;
            }
        }

        public ICommand ConfirmCommand
        {

            get
            {

                if (confirmCommand == null)
                {
                    confirmCommand = new DelegateCommand(ConfirmSelectedOrder);
                }
                return confirmCommand;
            }
        }


        public ObservableCollection<Order> CurrentOrders
        {
            get => currentOrders ?? (CurrentOrders = new ObservableCollection<Order>());
            set
            {

                if (currentOrders != value)
                {
                    currentOrders = value;
                    OnPropertyChanged("CurrentOrders");
                }
            }
        }

        public ObservableCollection<Order> OrdersToShow
        {
            get => ordersToShow ?? (ordersToShow = new ObservableCollection<Order>());
            set
            {

                if (ordersToShow != value)
                {
                    ordersToShow = value;
                    OnPropertyChanged("OrdersToShow");
                }

            }
        }

        public PageNavigation Navigation
        {
            get => navigation;
            set
            {
                if (navigation != value)
                {
                    navigation = value;
                    OnPropertyChanged("Navigation");
                }
            }
        }

        public ObservableCollection<Good> CurrentOrderGoods
        {
            get => currentOrderGoods;
            set
            {
                if (currentOrderGoods != value)
                {
                    currentOrderGoods = value;
                    OnPropertyChanged("CurrentOrders");
                }
            }
        }

        public Order CurrentOrder
        {
            get => currentOrder ?? (currentOrder = new Order());
        
            set
            {
                if (currentOrder != value)
                {
                    currentOrder = value;
                    //xxxx
                    LoadCurrentOrderInfo();
                    OnPropertyChanged("CurrentOrder");
                }
            }
        }



        public Customer CurrentOrderCustomer
        {
            get => currentOrderCustomer ?? (currentOrderCustomer = new Customer());
            set
            {
                if (currentOrderCustomer != value)
                {
                    currentOrderCustomer = value;
                    OnPropertyChanged("CurrentOrderCustomer");
                }
            }
        }

        public string PagingLabel
        {
            get => pagingLabel;
            set{
                if(pagingLabel != value)
                {
                    pagingLabel = value;
                    OnPropertyChanged("PagingLabel");
                }
            }
        }
        #endregion

        #region Constructor

        public OrdersViewModel()
        {
                   
            ordersRefreshTimer = new System.Windows.Threading.DispatcherTimer();
            ordersRefreshTimer.Tick += DispatcherTimer_TickAsync;
            ordersRefreshTimer.Interval = new TimeSpan(0, 5, 0);
            ordersRefreshTimer.Start();
            DispatcherTimer_TickAsync(null, null);
           
        }


        #endregion

        #region Methods
        /// <summary>
        /// Метод,който се вика на всеки тик на таймера.
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private async void DispatcherTimer_TickAsync(object sender, EventArgs e)
        {
            await GetAllOrders();
        }

        /// <summary>
        /// HTTP заявка,която зарежда всички поръчки от базата със статус "Waiting"
        /// </summary>
        /// <returns></returns>
        private async Task GetAllOrders()
        {
            CurrentOrders.Clear();

            using (var client = new HttpClient())
            {
               // client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                client.BaseAddress = new Uri("http://" + base.Address);
                var info = 1;
                var content = JsonConvert.SerializeObject(info);
                var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                var byteContent = new ByteArrayContent(buffer);
                byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.GetOrders_Url, byteContent))
                {
                    using (HttpContent httpcontent = response.Content)
                    {
                        string mycontent = await httpcontent.ReadAsStringAsync();

                        if (mycontent != "")
                        {
                            CurrentOrders = JsonConvert.DeserializeObject<ObservableCollection<Order>>(mycontent);

                            await LoadCurrentOrdersGoods();
                        }
                        else
                        {
                            //await dialogCoordinator.ShowMessageAsync(this,"Error loading orders","Couldn't load customer orders!");

                            await DialogManager.ShowMessageAsync((MetroWindow)Application.Current.MainWindow, "Error updating order", "Couldn't update order status!");
                        }


                    }
                }
            }

            navigation = new PageNavigation(numberOfItemsPerPage, CurrentOrders.Count);
            Navigate(2);
        }

        /// <summary>
        /// HTTP заявка,която зарежда всички OrderedGoods обекти за всички поръчки от свързващата таблица
        /// </summary>
        /// <returns></returns>
        private async Task LoadCurrentOrdersGoods()
        {
            foreach (Order client_order in CurrentOrders)
            {
                using (var client = new HttpClient())
                {
                   // client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                    client.BaseAddress = new Uri("http://" + base.Address);
                    var info = new PostHelperModel_ID();
                    info.ID = client_order.ID;
                    var content = JsonConvert.SerializeObject(info);
                    var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                    var byteContent = new ByteArrayContent(buffer);
                    byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                    using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.GetOrderGoods_Url, byteContent))
                    {
                        using (HttpContent httpcontent = response.Content)
                        {
                            string mycontent = await httpcontent.ReadAsStringAsync();

                            if (mycontent != "")
                            {
                                List<OrderedGoods> orderedGoods = new List<OrderedGoods>();
                                orderedGoods = JsonConvert.DeserializeObject<List<OrderedGoods>>(mycontent);

                                foreach (OrderedGoods og in orderedGoods)
                                {
                                    client_order.OrderedGoods.Add(og);
                                }

                            }
                            else
                            {
                                //await dialogCoordinator.ShowMessageAsync(this, "Error loading ordered goods", "Couldn't load order goods!");

                                await DialogManager.ShowMessageAsync((MetroWindow)Application.Current.MainWindow, "Error updating order", "Couldn't update order status!");
                            }


                        }
                    }
                }
            }
        }

        public void ShowNextPage()
        {
            CurrentPageIndex++;
            ViewList.View.Refresh();
        }

        public void ShowPreviousPage()
        {
            CurrentPageIndex--;
            ViewList.View.Refresh();
        }

        public void ShowFirstPage()
        {
            CurrentPageIndex = 0;
            ViewList.View.Refresh();
        }

        public void ShowLastPage()
        {
            CurrentPageIndex = NumberOfPages - 1;
            ViewList.View.Refresh();
        }

        public async void LoadCurrentOrderInfo()
        {
      
            await LoadOrderCustomer();

            await LoadOrdLoadCurrentOrderGoods();
            //return tmp;
        }

        /// <summary>
        /// Зарежда поръчителя(клиента) на селектираната поръчка 
        /// </summary>
        /// <returns></returns>
        private async Task LoadOrderCustomer()
        {
            using (var client = new HttpClient())
            {
               // client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                client.BaseAddress = new Uri("http://" + base.Address);
                var info = new PostHelperModel_ID();
                info.ID = CurrentOrder.CustomerID;
                var content = JsonConvert.SerializeObject(info);
                var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                var byteContent = new ByteArrayContent(buffer);
                byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.GetCustomerByID, byteContent))
                {
                    using (HttpContent httpcontent = response.Content)
                    {
                        string mycontent = await httpcontent.ReadAsStringAsync();

                        if (mycontent != "")
                        {
                            try
                            {
                                CurrentOrderCustomer = JsonConvert.DeserializeObject<Customer>(mycontent);                                
                            }
                            catch (Exception e)
                            {
                                //message
                            }          

                        }
                        else
                        {                
                            await DialogManager.ShowMessageAsync((MetroWindow)Application.Current.MainWindow, "Error updating order", "Couldn't update order status!");
                        }

                    }
                }
            }
        }

        /// <summary>
        /// Зарежда стоките записани в селектираната поръчка и ги попълва в CurrentOrderGoods пропъртито
        /// </summary>
        /// <returns></returns>
        private async Task LoadOrdLoadCurrentOrderGoods()
        {
            CurrentOrderGoods.Clear();
            foreach (OrderedGoods og in CurrentOrder.OrderedGoods)
            {
                using (var client = new HttpClient())
                {
                    //client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                    client.BaseAddress = new Uri("http://" + base.Address);
                    var info = new PostHelperModel_ID();
                    info.ID = og.GoodID;
                    var content = JsonConvert.SerializeObject(info);
                    var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                    var byteContent = new ByteArrayContent(buffer);
                    byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                    using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.GetGoodByID_Url, byteContent))
                    {
                        using (HttpContent httpcontent = response.Content)
                        {
                            string mycontent = await httpcontent.ReadAsStringAsync();

                            if (mycontent != "")
                            {
                                Good good = JsonConvert.DeserializeObject<Good>(mycontent);
                                var helpgood = new HelperListViewModelGood(good);
                                helpgood.Qtty = og.Qtty;
                                CurrentOrderGoods.Add(helpgood);
                            }
                            else
                            {
                                //await dialogCoordinator.ShowMessageAsync(this, "Error loading order goods", "Couldn't load order goods!");

                                await DialogManager.ShowMessageAsync((MetroWindow)Application.Current.MainWindow, "Error updating order", "Couldn't update order status!");
                            }

                        }
                    }
                }
            }
        }

        /// <summary>
        /// сменяме статус на селектирана поръчка
        /// </summary>
        private void ConfirmSelectedOrder()
        {
            CurrentOrder.OrderStatus = "Confirmed";
          //  CurrentOrders.Remove(CurrentOrder);
            UpdateOrder(CurrentOrder);
            //HTTP request to update the order status
        }

        /// <summary>
        /// сменяме статус на селектирана поръчка
        /// </summary>
        private void RejectSelectedOrder()
        {
            CurrentOrder.OrderStatus = "Rejected";
          //  CurrentOrders.Remove(CurrentOrder);
            UpdateOrder(CurrentOrder);
            //HTTP request to update the order status
        }

        /// <summary>
        /// HTTP заявка за обновяване на дадена поръчка в базата
        /// </summary>
        /// <param name="order">поръчка,която искаме да обновим</param>
        private async void UpdateOrder(Order order)
        {

            using (var client = new HttpClient())
            {
               // client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                client.BaseAddress = new Uri("http://" + base.Address);
                var info = order;
                var content = JsonConvert.SerializeObject(info);
                var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                var byteContent = new ByteArrayContent(buffer);
                byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.UpdateOrder_Url, byteContent))
                {
                    using (HttpContent httpcontent = response.Content)
                    {
                        string mycontent = await httpcontent.ReadAsStringAsync();

                        if (mycontent == "200")
                        {
                            DispatcherTimer_TickAsync(null, null);

                        }
                        else
                        {
                            await DialogManager.ShowMessageAsync((MetroWindow)Application.Current.MainWindow, "Error updating order", "Couldn't update order status!");
                        }

                    }
                }
            }


        }


        /// <summary>
        /// Отговаря за страницирането на стоките и навигирането в страниците.
        /// </summary>
        /// <param name="pagingModeSelected">По подадения параметър се навигира към опраделена страница.</param>
        public void Navigate(object pagingModeSelected)
        {
            List<Order> currentOrdersLocal;
   
            int mode = Convert.ToInt32(pagingModeSelected);
            PagingModeEnum pagingMode = (PagingModeEnum)mode;

            switch (pagingMode)
            {
                case PagingModeEnum.Next:
                    Navigation.Next();
                    break;

                case PagingModeEnum.Previous:
                    Navigation.Previous();
                    break;

                case PagingModeEnum.First:
                    Navigation.First();
                    break;

                case PagingModeEnum.Last:
                    Navigation.Last();
                    break;
            }


            Navigation.RefreshPageNavigation(CurrentOrders.Count);

            currentOrdersLocal = CurrentOrders.Skip((Navigation.CurrentPage - 1) * Navigation.RecordsPerPage).ToList();

            OrdersToShow = new ObservableCollection<Order>(currentOrdersLocal.Take(Navigation.RecordsPerPage));

            if (OrdersToShow.Count == 0)
            {
                IsEnabledButtons = false;
                PagingLabel = "0/0";
                CurrentOrder = new Order();
            }
            else
            {
                IsEnabledButtons = true;
                PagingLabel = $"{Navigation.CurrentPage}/{Navigation.NumberOfPage}";
                CurrentOrder = OrdersToShow.First();
            }

        }
    
    }


    #endregion
}
