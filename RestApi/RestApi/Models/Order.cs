﻿using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Models
{
    public class Order
    {
        public int ID { get; set; }

        public int ClientId { get; set; }
        public ClientInfo Client { get; set; }

        public ICollection<GoodOrder> GoodOrders { get; set; }
        public double OrderTotalPrice { get; set; }
    }
}
