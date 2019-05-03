using DesktopApp.Commands;
using DesktopApp.Models;
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
using System.Windows.Input;

namespace DesktopApp.ViewModels
{
    class OrdersViewModel : BaseViewModel
    {
        #region Definitions
        private ObservableCollection<Order> currentOrders = new ObservableCollection<Order>();
        private ObservableCollection<Good> currentOrderGoods = new ObservableCollection<Good>();
        private Order currentOrder = new Order();
        private Customer currentOrderCustomer = new Customer();
        private ICommand deleteCommand;
        private ICommand confirmCommand;
        #endregion

        #region Properties

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
            get => currentOrders;
            set
            {
                if (currentOrders != value)
                {
                    currentOrders = value;
                    OnPropertyChanged("CurrentOrders");
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
                CurrentOrderCustomer = GetCustomer(currentOrder.CustomerID);
                CurrentOrderGoods = GetOrderGoods(currentOrder.OrderedGoods);
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
            get => currentOrderCustomer;
            set
            {
                if (currentOrderCustomer != value)
                {
                    currentOrderCustomer = value;
                    OnPropertyChanged("CurrentOrderCustomer");
                }
            }
        }
        #endregion

        #region Constructor
        public OrdersViewModel()
        {
            //test
            for (int i = 0; i < 5; i++)
            {
                Order tmp = new Order();
                tmp.OrderCode = "ordercode" + i.ToString();
                tmp.OrderStatus = "waiting";
                tmp.OrderTotalPrice = 99.99;
                CurrentOrders.Add(tmp);
            }
        }
        #endregion

        #region Methods
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

            #endregion
        }
    }
}
