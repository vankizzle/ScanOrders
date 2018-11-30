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
    [Route("api/actions")]
    [ApiController]
    public class ApiController : ControllerBase
    {
        DBService DBserv = new DBService();

        //// GET api/actions
        //[HttpGet]
        //public ActionResult<IEnumerable<string>> Get()
        //{
        //    return new string[] { "value1", "value2" };
        //}

        // GET api/actions/
        [HttpGet("GetGoodByID/{id}")]
        public Good Get_Good(int id)
        {
            return new Good();
        }

        //// GET api/actions
        //[HttpGet("GetOrderByID/{id}")]
        //public Order Get_Order(int id)
        //{
        //    return DBserv.GetOrderByID(id);
        //}

        // POST api/actions
        [HttpPost("AddOrder")]
        public void Post_AddOrder([FromBody] Order o)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }

            DBserv.InsertOrder(o);
            
        }

        // POST api/actions
        [HttpPost("AddGood")]
        public void Post_AddGood([FromBody] Good g)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }

            DBserv.InsertGood(g);

        }
        //// PUT api/actions/5
        //[HttpPut("{id}")]
        //public void Put(int id, [FromBody] string value)
        //{
        //}

        //// DELETE api/actions/5
        //[HttpDelete("{id}")]
        //public void Delete(int id)
        //{
        //}
    }
}
