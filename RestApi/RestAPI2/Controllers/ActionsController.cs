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
    public class ActionsController : ControllerBase
    {
        DBService DBserv = new DBService();

        #region User/Customer Actions
        // POST api/actions
        [HttpPost("Login")]
        public void Post_Login([FromBody] String information)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }
            string[] info = information.Split(";");
            DBserv.LoginCustomer(info[0], info[1]);

        }

        // POST api/actions
        [HttpPost("RegisterC")]
        public void Post_Register([FromBody] Customer c)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }
            DBserv.Register(c);
        }

        // POST api/actions
        [HttpPost("RegisterU")]
        public void Post_Register([FromBody] User u)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }
            DBserv.Register(u);
        }
        #endregion
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

        [HttpPost("GetGoodByID")]
        public Good Get_GoodByID([FromRoute]string ID)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }
            int gID = 0;
            Int32.TryParse(ID, out gID);
            return DBserv.GetGoodByID(gID);
        }
    }
}
