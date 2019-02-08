using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Models
{
    public class Good
    {
        public Good()
        {
            OrderedGoods = new HashSet<OrderedGoods>();
        }

        public int ID { get; set; }
        public int PLU { get; set; }
        public string Name { get; set; }
        public double Price { get; set; }
        public string Description { get; set; }
        public int Is_Discontinued { get; set; }

        public int SupplierID { get; set; }
       // public Supplier Supplier { get; set; }

        public ICollection<OrderedGoods> OrderedGoods { get; set; }
    }
}
