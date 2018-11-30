using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Models
{
    public class CompanyInfo
    {
        public int ID { get; set; }
        public string CompanyName { get; set; }
        public string CompanyPhone { get; set; }

        public int UserInfoRef { get; set; }
        public UserInfo UserInfo { get; set; }
        public int SupplierRef { get; set; }
        public Supplier Supplier { get; set; }
    }
}
