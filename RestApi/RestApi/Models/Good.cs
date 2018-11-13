using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Models
{
    public class Good
    {
        public int ID { get; set; }
        public string Name { get; set; }
        public int PLU { get; set; }
        public double Price { get; set; }
        public string Description { get; set; }
        public ICollection<GoodOrder> GoodOrders { get; set; }
    }
}
