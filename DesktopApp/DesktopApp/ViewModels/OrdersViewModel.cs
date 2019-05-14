using DesktopApp.Commands;
using DesktopApp.Helpers;
using DesktopApp.Models;
using GalaSoft.MvvmLight.Ioc;
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

        private const int numberOfItemsPerPage = 20;

        private string pagingLabel;
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
            get
            {
                //CurrentOrderCustomer = GetCustomer(currentOrder.CustomerID);
               // CurrentOrderGoods = GetOrderGoods(currentOrder.OrderedGoods);
                return currentOrder;
            }

            set
            {
                if (currentOrder != value)
                {
                    currentOrder = value;
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
            //test
            for (int i = 0; i < 60; i++)
            {
                Order tmp = new Order();
                tmp.OrderCode = "ordercode" + i.ToString();
                tmp.OrderStatus = "waiting";
                tmp.OrderTotalPrice = 99.99;
                CurrentOrders.Add(tmp);
            }

            navigation = new PageNavigation(numberOfItemsPerPage, CurrentOrders.Count);
            Navigate(2);
        }
        #endregion

        #region Methods

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

        public Customer GetCustomer(int CustomerID)
        {
            //http request
            Customer tmp = new Customer();
            tmp.FirstName = "Ivan";
            tmp.LastName = "Draganov";
            tmp.Phone = "08995642571";
            tmp.Address = "Jitnica 1";
            tmp.Country = "Bulgaria";
            tmp.City = "Sofia";
            // return new Customer();
            return tmp;
        }

        private ObservableCollection<Good> GetOrderGoods(ICollection<OrderedGoods> orderedGoods)
        {
            ObservableCollection<Good> goodslist = new ObservableCollection<Good>();
            foreach (OrderedGoods o in orderedGoods)
            {
                Good tmp = new Good();
                try
                {
                    tmp = GetGoodByID(o.GoodID);
                    goodslist.Add(tmp);
                }
                catch (Exception e)
                {

                }
            }
            return goodslist;
        }

        private Good GetGoodByID(int goodID)
        {
            //http request
            throw new NotImplementedException();
        }

        private void ConfirmSelectedOrder()
        {
            CurrentOrder.OrderStatus = "Confirmed";
            CurrentOrders.Remove(CurrentOrder);
            UpdateOrder(CurrentOrder);
            //HTTP request to update the order status
        }

        private void RejectSelectedOrder()
        {
            CurrentOrder.OrderStatus = "Rejected";
            CurrentOrders.Remove(CurrentOrder);
            UpdateOrder(CurrentOrder);
            //HTTP request to update the order status
        }

        private async void UpdateOrder(Order order)
        {

            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri("http://" + base.IP + ":" + base.UpdateOrder_Url);
                var info = order;
                var content = JsonConvert.SerializeObject(info);
                var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                var byteContent = new ByteArrayContent(buffer);
                byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                var result = await client.PostAsync(base.ApiController + "/" + base.Login_Url, byteContent);
                string resultContent = await result.Content.ReadAsStringAsync();

                Thread.Sleep(4000);
                if (result.StatusCode != HttpStatusCode.OK)
                {
                    //message
                }
            }


        }

        #endregion

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

        /// <summary>
        /// Обновява визуално списъка с поръчките. 
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        //private void RefreshCurrentOrders(object sender, ElapsedEventArgs e)
        //{
            //Action refreshCurrentOrdersAction = new Action(() =>
            //{
            //    int currrentOrdersCount = CurrentOrders.Count();

            //    if (base.Database != null)
            //    {
            //        GetCurrentOrders();
            //        Navigate(1);
            //    }

            //    if (currrentOrdersCount > CurrentOrders.Count)
            //    {
            //        Media.PlaySound();

            //        if (SimpleIoc.Default.GetInstance<MainViewModel>().IsSelectedDelivery)
            //        {
            //            SimpleIoc.Default.GetInstance<DeliveryViewModel>().GetOnlyReadyOrders();
            //        }

            //        SimpleIoc.Default.GetInstance<MainViewModel>().IsFlashing = true;
            //        SimpleIoc.Default.GetInstance<MainViewModel>().BadgedValue += currrentOrdersCount - CurrentOrders.Count;
            //    }
            //});

            //Application.Current.Dispatcher.BeginInvoke(DispatcherPriority.Background, refreshCurrentOrdersAction);
        //}

    }
}
