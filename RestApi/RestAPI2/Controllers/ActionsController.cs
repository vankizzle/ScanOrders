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
        [HttpGet("CreateOrder")]
        public void Make_Order()
        {
            Good G1 = DBserv.GetGoodByID(9);
            Good G2= DBserv.GetGoodByID(13);
            Good G3 = DBserv.GetGoodByID(14);

            Order o = new Order();

            o.OrderCode = "xcz4486zs24";

           
            OrderedGoods og = new OrderedGoods();
            OrderedGoods og1 = new OrderedGoods();
            OrderedGoods og2 = new OrderedGoods();

            og.GoodID = G1.ID;
            og1.GoodID = G2.ID;
            og2.GoodID = G3.ID;

            og.Qtty = 2;
            og1.Qtty = 1;
            og2.Qtty = 1;

            //  og.Order = o;

            o.OrderedGoods.Add(og);
            o.OrderedGoods.Add(og1);
            o.OrderedGoods.Add(og2);

            o.CustomerID = DBserv.GetCustomerByUsername("Ivan40").ID;

            o.OrderTotalPrice = G1.Price*og.Qtty + G2.Price* og1.Qtty + G3.Price*og2.Qtty;

            DBserv.InsertOrder(o);
         
        }

        [HttpGet("CreateTempUser")]
        public void Register_User()

        {

            Customer u = new Customer();


            u.username = "Ivan40";

            u.password = "1234";

            u.email = "test@test.com";



            u.Address = "testaddress";

            u.FirstName = "test1";

            u.LastName = "test2";

            u.City = "Sofiq";

            u.Country = "Bulgaria";

            u.Phone = "094843215482";

            DBserv.Register(u);

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
