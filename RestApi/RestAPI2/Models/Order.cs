using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Models
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

        public ICollection<OrderedGoods> OrderedGoods { get; set; }
    }
}
