using System.Collections.Generic;

namespace DesktopApp.Models
{
    public class Customer
    {
        public int ID { get; set; }
        public string username { get; set; }
        public string password { get; set; }
        public string email { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Phone { get; set; }
        public string City { get; set; }
        public string Country { get; set; }
        public string Address { get; set; }

        public List<Order> Orders { get; set; }
    }
}
