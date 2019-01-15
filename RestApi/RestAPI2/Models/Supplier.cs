using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Models
{
    public class Supplier
    {
        public int ID { get; set; }
        public string SupplierName { get; set; }
        public string SupplierPhone{ get; set; }

        public ICollection<Good> Goods { get; set; }
    }
}
