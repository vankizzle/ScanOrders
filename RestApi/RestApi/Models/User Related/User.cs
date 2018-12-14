﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Models
{
    public class User
    {
        public int ID { get; set; }
        public string username { get; set; }
        public string password { get; set; }
        public string email { get; set; }

        public int UserInfoID { get; set; }
        public UserInfo UserInfo { get; set; }

        public int CompanyInfoID { get; set; }
        public CompanyInfo CompanyInfo { get; set; }

        public List<Order> Orders { get; set; }
    }
}