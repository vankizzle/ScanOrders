using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Models
{
    public class Order
    {
        public int ID { get; set; }
        //public Dictionary<int, int> GoodsList { get; set; } //PLU : Qtty
        public List<GoodQtty> GoodsList { get; set; } //PLU : Qtty
        public ClientInfo Client { get; set; }
        public double OrderTotalPrice { get; set; }
        public Order()
        {
            GoodsList = new List<GoodQtty>();
        }
    }
}
