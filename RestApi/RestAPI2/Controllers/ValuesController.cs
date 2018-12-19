using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using RestAPI2.Services;
using RestAPI2.Models;

namespace RestAPI2.Controllers
{
    [Route("api/actions")]
    [ApiController]
    public class ValuesController : ControllerBase
    {
        DBService DBserv = new DBService();
      
        // POST api/actions
        [HttpPost("Login")]
        public void Post_Login([FromBody] String information)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }

            //DBserv.RegisterUser(u);

        }

        [HttpGet("GetUserForTest")]
        public Customer Get_User()
        {
            Customer u = new Customer();
            u.username = "test";
            u.password = "1234";
            u.email = "test@test.com";

            u.Address = "testaddress";
            u.FirstName = "test1";
            u.LastName = "test2";
            u.City = "Sofiq";
            u.Country = "Bulgaria";
            u.Phone = "094843215482";
            return u;
        }

        // GET api/values
        [HttpGet]
        public ActionResult<IEnumerable<string>> Get()
        {
            return new string[] { "value1", "value2" };
        }

        // GET api/values/5
        [HttpGet("{id}")]
        public ActionResult<string> Get(int id)
        {
            return "value";
        }

        // POST api/values
        [HttpPost]
        public void Post([FromBody] string value)
        {
        }

        // PUT api/values/5
        [HttpPut("{id}")]
        public void Put(int id, [FromBody] string value)
        {
        }

        // DELETE api/values/5
        [HttpDelete("{id}")]
        public void Delete(int id)
        {
        }
    }
}
