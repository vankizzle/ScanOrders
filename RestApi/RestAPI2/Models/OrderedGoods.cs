using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Models
{
    public class OrderedGoods
    {

        public Order Order { get; set; }
        public int OrderID { get; set; }
        
        public int GoodID { get; set; }

        public int Qtty { get; set; }
    }
}
