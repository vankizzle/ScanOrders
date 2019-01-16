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
       
        public int CustomerID { get; set; }
        public Customer Customer { get; set; }

        public List<Good> Goods { get; set; }
        public int GoodID { get; set; }

        public int Qtty { get; set; }
        public double OrderTotalPrice { get; set; }

    }
}
