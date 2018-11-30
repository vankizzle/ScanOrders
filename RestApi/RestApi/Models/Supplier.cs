using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Models
{
    public class Supplier
    {
        public int ID { get; set; }
        public string CompanyName { get; set; }
        public string CompanyPhone { get; set; }
        public ICollection<Good> Goods { get; set; }
    }
}
