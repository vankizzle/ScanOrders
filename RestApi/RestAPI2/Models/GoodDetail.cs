using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Models
{
    public class GoodDetail
    {
        public int ID { get; set; }
        public int PLU { get; set; }
        public string Name { get; set; }
        public double Price { get; set; }
        public string Description { get; set; }
        public int Is_Discontinued { get; set; }

        //public int GoodRef { get; set; }
        public Good Good { get; set; }
    }
}
