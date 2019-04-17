using DesktopApp.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesktopApp.ViewModels
{
    class OrdersViewModel : BaseViewModel
    {
        #region Definitions
        private List<Order> currentOrders = new List<Order>();
        private List<Good> currentOrderGoods = new List<Good>();
        private Order currentOrder = new Order();
        private Customer currentOrderCustomer = new Customer();
        #endregion

        #region Properties

        public List<Order> CurrentOrders
        {
            get => currentOrders;
            set
            {
                if(currentOrders != value)
                {
                    currentOrders = value;
                    OnPropertyChanged("CurrentOrders");
                }
            }
        }

        public List<Good> CurrentOrderGoods
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
            for(int i = 0; i < 5; i++)
            {
                Order tmp = new Order();
                tmp.OrderCode = "ordercode" + i.ToString();
                tmp.OrderStatus = "status";
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

        private List<Good> GetOrderGoods(ICollection<OrderedGoods> orderedGoods)
        {
            List<Good> goodslist = new List<Good>();
            foreach(OrderedGoods o in orderedGoods)
            {
                Good tmp = new Good();
                try
                {
                    tmp = GetGoodByID(o.GoodID);
                    goodslist.Add(tmp);
                }
                catch(Exception e)
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
        #endregion
    }
}
