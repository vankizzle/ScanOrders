using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Models
{
    public class Order
    {
        public int ID { get; set; }
        public string OrderCode { get; set; }
        public double OrderTotalPrice { get; set; }

        //    public ICollection<GoodsOrders> GoodOrders { get; set; }
        public ICollection<Good> Goods { get; set; }

        public int CustomerID { get; set; }
        public Customer Customer { get; set; }
    }
}
