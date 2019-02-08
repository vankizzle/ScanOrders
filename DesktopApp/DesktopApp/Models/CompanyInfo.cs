using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Models
{
    public class CompanyInfo
    {
        public int ID { get; set; }
        public string CompanyName { get; set; }
        public string CompanyPhone { get; set; }

        public User User { get; set; }
    }
}
