using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using RestAPI2.Services;
using RestAPI2.Models;
using System.Net;

namespace RestAPI2.Controllers
{
    [Route("api/actions")]
    [ApiController]
    public class ActionsController : ControllerBase
    {
        DBService DBserv = new DBService();

        #region User/Customer Actions



        [HttpGet("test")]
        public string test()
        {
            return "Vanko";
        }

        // POST api/actions
        [HttpPost("Login")]
        public HttpStatusCode Post_Login([FromBody] PostHelperLogin information)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }

            if (DBserv.LoginCustomer(information.username, information.password))
            {
                return HttpStatusCode.OK;
            }
            else
            {
                return HttpStatusCode.BadGateway;
            }
        }

        // POST api/actions
        [HttpPost("RegisterC")]
        public HttpStatusCode Post_Register([FromBody] Customer c)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }
            if (DBserv.Register(c))
            {
                return HttpStatusCode.OK;
            }
            else
            {
                return HttpStatusCode.BadGateway;
            }
        }

        // POST api/actions
        [HttpPost("RegisterU")]
        public HttpStatusCode Post_Register([FromBody] User u)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }
            
            if (DBserv.Register(u))
            {
                return HttpStatusCode.OK;
            }
            else
            {
                return HttpStatusCode.BadGateway;
            }
        }
        #endregion

        [HttpPost("GetGoodByID")]
        public Good Get_GoodByID([FromBody] PostHelperModel_ID data)
        {
        
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }
         
            return DBserv.GetGoodByID(data.ID);
            
        }

        [HttpPost("SendOrder")]
        public void AddOrder([FromBody] Order data)
        {

            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }

            DBserv.InsertOrder(data);

        }

        [HttpPost("GetSupplierByID")]
        public Supplier Get_SupplierByID([FromBody] PostHelperModel_ID data)
        {

            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }

            return DBserv.GetSupplierByID(data.ID);

        }

        [HttpPost("SendGood")]
        public HttpStatusCode AddGood([FromBody] Good data)
        {

            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }

            if (DBserv.InsertGood(data))
            {
                return HttpStatusCode.OK;
            }
            else
            {
                return HttpStatusCode.BadRequest;
            }
             
        }

        [HttpPost("UpdateOrder")]
        public HttpStatusCode UpdateOrder([FromBody] Order data)
        {

            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }

            if (DBserv.UpdateOrder(data))
            {
                return HttpStatusCode.OK;
            }
            else
            {
                return HttpStatusCode.BadRequest;
            }

        }
    }
}
