using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using RestApi.Models;
using RestApi.Services;

namespace RestApi.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class OrdersController : ControllerBase
    {
        DBService DBserv = new DBService();

        //// GET api/orders
        //[HttpGet]
        //public ActionResult<IEnumerable<string>> Get()
        //{
        //    return new string[] { "value1", "value2" };
        //}

        // GET api/orders/5
        [HttpGet("{id}")]
        public ActionResult<string> Get(int id)
        {
            return "value" + id;
        }

        // GET api/orders
        [HttpGet]
        public ActionResult<Order> Get()
        {
            Order ord = new Order();
            Good tst = new Good();
            ClientInfo newcl = new ClientInfo();
            GoodQtty test = new GoodQtty();
         //   ICollection<KeyValuePair<int, int>> asd = new List<KeyValuePair<int, int>>();
            tst.Name = "test";
            tst.PLU = 546;
            tst.Price = 6.99;
            tst.Description = "none";
           // asd.Add(new KeyValuePair<int, int>(tst.PLU, 2));

            newcl.FirstName = "Ivan";
            newcl.LastName = "Draganov";
            newcl.Phone = "0895642571";
            newcl.Address = "no address";
            newcl.City = "Sofia";
            newcl.Country = "Bulgaria";

            test.Id = 1;
           // test.Order = ord;
            test.PLU = tst.PLU;
            test.Qtty = 5;
            ord.ID = 156314;
            ord.GoodsList.Add(test);

            ord.Client = newcl;
            ord.OrderTotalPrice = tst.Price * 5;
            return ord;
        }

        // POST api/orders
        [HttpPost]
        public void Post([FromBody] Order value)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }

            if(value == null)
            {
                throw new Exception("Bad input");
            }
            else
            {
                DBserv.InsertOrder(value);
            }
        }

        // PUT api/orders/5
        [HttpPut("{id}")]
        public void Put(int id, [FromBody] string value)
        {
        }

        // DELETE api/orders/5
        [HttpDelete("{id}")]
        public void Delete(int id)
        {
        }
    }
}
