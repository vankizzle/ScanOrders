using System.Collections.Generic;

namespace DesktopApp.Models
{
    public class Supplier
    {
        public int ID { get; set; }
        public string SupplierName { get; set; }
        public string SupplierPhone{ get; set; }

        public ICollection<Good> Goods { get; set; }
    }
}
