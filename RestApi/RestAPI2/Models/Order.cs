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

        public ICollection<GoodsOrders> GoodOrders { get; set; }

        public int UserID { get; set; }
        public User User { get; set; }
    }
}
