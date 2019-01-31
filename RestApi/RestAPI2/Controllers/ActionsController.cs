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
        public Customer Post_Login([FromBody] PostHelperLogin information)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }
          return  DBserv.LoginCustomer(information.username, information.password);

        }

        // POST api/actions
        [HttpPost("RegisterC")]
        public string Post_Register([FromBody] Customer c)
        {
            if (!ModelState.IsValid)
            {
                throw new InvalidOperationException("Invalid!");
            }
            return DBserv.Register(c);
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
        [HttpGet("GetOrder")]
        public Order Get_Order()
        {
            Good G1 = DBserv.GetGoodByID(2);
            Good G2= DBserv.GetGoodByID(3);
            Good G3 = DBserv.GetGoodByID(2);

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

            //o.CustomerID = DBserv.GetCustomerByUsername("Ivan40").ID;
            o.CustomerID = 1;

            o.OrderTotalPrice = G1.Price*og.Qtty + G2.Price* og1.Qtty + G3.Price*og2.Qtty;

            return o;
           // DBserv.InsertOrder(o);
         
        }

        [HttpGet("CreateTempUser")]
        public void Register_User()

        {

            Customer u = new Customer();


            u.username = "Simeon";

            u.password = "1234";

            u.email = "simeonch@test.com";



            u.Address = "testaddress";

            u.FirstName = "test1";

            u.LastName = "test2";

            u.City = "Sofiq";

            u.Country = "Bulgaria";

            u.Phone = "094843215482";

            DBserv.Register(u);

        }

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
    }
}
