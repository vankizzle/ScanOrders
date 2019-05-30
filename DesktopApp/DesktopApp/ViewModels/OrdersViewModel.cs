﻿using DesktopApp.Commands;
using DesktopApp.Helpers;
using DesktopApp.Models;
using GalaSoft.MvvmLight.Ioc;
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
        public OrdersViewModel(IDialogCoordinator instance)
        {
           
            CurrentOrder = null;
            dialogCoordinator = instance;
            ordersRefreshTimer = new System.Windows.Threading.DispatcherTimer();
            ordersRefreshTimer.Tick += dispatcherTimer_TickAsync;
            ordersRefreshTimer.Interval = new TimeSpan(0, 5, 0);
            ordersRefreshTimer.Start();
            dispatcherTimer_TickAsync(null, null);
           
        }

        private async void dispatcherTimer_TickAsync(object sender, EventArgs e)
        {
            await GetAllOrders();
        }

        private async Task GetAllOrders()
        {
            CurrentOrders.Clear();

            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
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
                            await dialogCoordinator.ShowMessageAsync(this,"Error loading orders","Couldn't load customer orders!");
                        }


                    }
                }
            }

            navigation = new PageNavigation(numberOfItemsPerPage, CurrentOrders.Count);
            Navigate(2);
        }

        private async Task LoadCurrentOrdersGoods()
        {
            foreach(Order client_order in CurrentOrders)
            {
                using (var client = new HttpClient())
                {
                    client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
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
                              
                                foreach(OrderedGoods og in orderedGoods)
                                {
                                    client_order.OrderedGoods.Add(og);
                                }
                            
                            }
                            else
                            {
                                await dialogCoordinator.ShowMessageAsync(this, "Error loading ordered goods", "Couldn't load order goods!");
                            }


                        }
                    }
                }
            }
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

        public async void LoadCurrentOrderInfo()
        {
      
            await LoadOrderCustomer();
            await LoadOrdLoadCurrentOrderGoods();
            //return tmp;
        }

        private async Task LoadOrderCustomer()
        {
            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
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

                        if (mycontent == "200")
                        {
                            dispatcherTimer_TickAsync(null, null);

                        }
                        else
                        {
                            await dialogCoordinator.ShowMessageAsync(this, "Error updating order", "Couldn't update order status!");
                        }

                    }
                }
            }
        }

        private async Task LoadOrdLoadCurrentOrderGoods()
        {
            foreach(OrderedGoods og in CurrentOrder.OrderedGoods)
            {
                using (var client = new HttpClient())
                {
                    client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
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
                                CurrentOrderGoods.Add(good);
                            }
                            else
                            {
                                await dialogCoordinator.ShowMessageAsync(this, "Error loading order goods", "Couldn't load order goods!");
                            }

                        }
                    }
                }
            }
        }
            //private ObservableCollection<Good> GetOrderGoods(ICollection<OrderedGoods> orderedGoods)
            //{
            //    ObservableCollection<Good> goodslist = new ObservableCollection<Good>();
            //    foreach (OrderedGoods o in orderedGoods)
            //    {
            //        Good tmp = new Good();
            //        try
            //        {
            //            tmp = GetGoodByID(o.GoodID);
            //            goodslist.Add(tmp);
            //        }
            //        catch (Exception e)
            //        {

            //        }
            //    }
            //    return goodslist;
            //}

            private Good GetGoodByID(int goodID)
        {
            //http request

            throw new NotImplementedException();
        }

        private void ConfirmSelectedOrder()
        {
            CurrentOrder.OrderStatus = "Confirmed";
          //  CurrentOrders.Remove(CurrentOrder);
            UpdateOrder(CurrentOrder);
            //HTTP request to update the order status
        }

        private void RejectSelectedOrder()
        {
            CurrentOrder.OrderStatus = "Rejected";
          //  CurrentOrders.Remove(CurrentOrder);
            UpdateOrder(CurrentOrder);
            //HTTP request to update the order status
        }

        private async void UpdateOrder(Order order)
        {

            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
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
                            dispatcherTimer_TickAsync(null, null);

                        }
                        else
                        {
                            await dialogCoordinator.ShowMessageAsync(this, "Error updating order", "Couldn't update order status!");
                        }

                    }
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
