using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Models
{
    public class GoodOrder
    {
        public int GoodOrderID { get; set; }
        public int GoodId { get; set; }
        public Good Good { get; set; }
        public int OrderId { get; set; }
        public Order Order { get; set; }

        public Double Unit_Price { get; set; }
        public int Qtty { get; set; }
    }
}
