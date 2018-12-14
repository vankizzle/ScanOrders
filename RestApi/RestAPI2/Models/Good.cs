using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Models
{
    public class Good
    {
        public int ID { get; set; }
     
        public int DetailID { get; set; }
        public GoodDetail Detail { get; set; }

        public int SupplierID { get; set; }
        public Supplier Supplier { get; set; }
        public ICollection<GoodsOrders> GoodOrders { get; set; }
    }
}
