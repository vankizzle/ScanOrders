using System.Collections.Generic;

namespace DesktopApp.Models
{
    public class Order
    {
        public Order()
        {
            OrderedGoods = new HashSet<OrderedGoods>();
        }

        public int ID { get; set; }

        public string OrderCode { get; set; }
       
        public int CustomerID { get; set; }
        //public Customer Customer { get; set; }

        public double OrderTotalPrice { get; set; }

        public string OrderStatus { get; set; }

        public ICollection<OrderedGoods> OrderedGoods { get; set; }
    }
}
