using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Models
{
    public class UserInfo
    {
        public int ID { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Phone { get; set; }
        public string City { get; set; }
        public string Country { get; set; }
        public string Address { get; set; }

        public int UserRef { get; set; }
        public User User { get; set; }

        public int CompanyInfoRef { get; set; }
        public CompanyInfo CompanyInfo { get; set; }

    }
}
