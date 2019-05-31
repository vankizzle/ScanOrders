using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesktopApp.Models
{
    class HelperListViewModelGood : Good
    {
        public HelperListViewModelGood(Good g)
        {
            ID = g.ID;
            Name = g.Name;
            PLU = g.PLU;
            Price = g.Price;
            SupplierID = g.SupplierID;
            Is_Discontinued = g.Is_Discontinued;
            OrderedGoods = g.OrderedGoods;
            Description = g.Description;
        }

        public int Qtty { get; set; }
    }
}
