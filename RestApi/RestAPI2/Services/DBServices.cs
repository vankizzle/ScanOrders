using Microsoft.EntityFrameworkCore;
using RestAPI2.Data;
using RestAPI2.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Services
{
    public class DBService
    {
        #region UserAuthenticationServices

        public void Register(User new_user)
        {
            using (var db = new DataContext())
            {
                if (db.Users.FirstOrDefault(user => user.username == new_user.username) == null)
                {
                    if (db.Users.FirstOrDefault(user => user.email == new_user.email) == null)
                    {
                        db.Users.Add(new_user);
                        db.SaveChanges();
                    }
                }
            }
        }
        public void Register(Customer new_customer)
        {
            using (var db = new DataContext())
            {
                if (db.Customers.FirstOrDefault(customer => customer.username == new_customer.username) == null)
                {
                    if (db.Users.FirstOrDefault(customer => customer.email == new_customer.email) == null)
                    {
                        db.Customers.Add(new_customer);
                        db.SaveChanges();
                    }
                }
            }
        }

        public Customer LoginCustomer(string UserName,string Password)
        {
            if (GetCustomerByUsername(UserName).ID == GetCustomerByPassword(Password).ID)
            {
                return GetCustomerByUsername(UserName);
            }
            else return null;
        }

        public void ChangeCustomerPassword (string old_pass,string new_pass)
            {
            using (var db = new DataContext())
            {
                var entity = db.Customers.FirstOrDefault(c => c.password == old_pass);

                if (entity != null)
                {
                    entity.password = new_pass;  
                    // Update entity in DbSet
                    db.Customers.Update(entity); 
                    // Save changes in database
                    db.SaveChanges();
                }
            }
        }
        public void ChangeUserPassword(string old_pass, string new_pass)
        {
            using (var db = new DataContext())
            {
                var entity = db.Users.FirstOrDefault(u => u.password == old_pass);

                if (entity != null)
                {
                    entity.password = new_pass;
                    // Update entity in DbSet
                    db.Users.Update(entity);
                    // Save changes in database
                    db.SaveChanges();
                }
            }
        }
        public User GetUserByUsername(string Username)
        {
            using (var db = new DataContext())
            {
                return db.Users.FirstOrDefault(u => u.username == Username);
            }
        }

        public User GetUserByEmail(string Email)
        {
            using (var db = new DataContext())
            {
                return db.Users.FirstOrDefault(u => u.email == Email);
            }
        }

        public Customer GetCustomerByUsername(string Username)
        {
            using (var db = new DataContext())
            {
                return db.Customers.FirstOrDefault(c => c.username == Username);
            }
        }

        public Customer GetCustomerByPassword(string Password)
        {
            using (var db = new DataContext())
            {
                return db.Customers.FirstOrDefault(c => c.password == Password);
            }
        }

        public Customer GetCustomerByEmail(string Email)
        {
            using (var db = new DataContext())
            {
                return db.Customers.FirstOrDefault(u => u.email == Email);
            }
        }

        #endregion

        #region ServicesForGoods

        public void InsertGood(Good g) //добавяне на продукт в базата
        {
            using (var db = new DataContext())  //работи като try-catch block и final-и и dispose-ва datacontext-a
            {
                if(g != null)
                {
                    db.Goods.Add(g);
                    db.SaveChanges();
                }
            }
        }

        public void InsertGoodDetail(GoodDetail gd)
        {
            using (var db = new DataContext())
            {
                if (gd != null)
                {
                    db.GoodDetails.Add(gd);
                    db.SaveChanges();
                }
            }
        }

        public void InsertSupplier(Supplier s)
        {
            using (var db = new DataContext())
            {
                if (s != null)
                {
                    db.Suppliers.Add(s);
                    db.SaveChanges();
                }
            }
        }

        public Good GetGoodByPLU(int PLU)    //взимане на продукт по PLU от базата
        {
            using (var db = new DataContext())
            {
                return db.Goods.FirstOrDefault(g => g.Detail.PLU == PLU); //няма да излезна от using-a,но затваря DataContext-a
            }

        }
        
        public Good GetGoodByID(int ID)    //взимане на продукт по PLU от базата
        {
            using (var db = new DataContext())
            {
                return db.Goods.FirstOrDefault(g => g.ID == ID); //няма да излезна от using-a,но затваря DataContext-a
            }

        }

        public void RemoveGood(int PLU)
        {
            using (var db = new DataContext())
            {
                db.Goods.Remove(db.Goods.FirstOrDefault(g => g.Detail.PLU == PLU));
                db.SaveChanges();
            }
        }

        public Supplier GetGoodSupplierByID(int Good_ID)
        {
            var entity = GetGoodByID(Good_ID);
            return entity.Supplier;
        }

        public void UpdateGoodPrice(int Good_ID, double new_price)
        {
            using (var db = new DataContext())
            {
                var entity = GetGoodByID(Good_ID);
                if (entity != null)
                {
                    entity.Detail.Price = new_price;
                    db.Goods.Update(entity);
                    db.SaveChanges();
                }
            }
        }
        #endregion

        #region ServicesForOrders

        public void InsertOrder(Order o)
        {
            using (var db = new DataContext())
            {
                db.Orders.Add(o);
                db.SaveChanges();
            }
        }

        public Order GetOrderByID(int ID)
        {
            using (var db = new DataContext())
            {
                return db.Orders.Include(o => o.ID).FirstOrDefault(o => o.ID == ID);
            }
        }

        public void AddGoodToOrder(int OrderID,Good g)
        {
            using (var db = new DataContext())
            {
               var entity  = db.Orders.FirstOrDefault(o => o.ID == OrderID);
                if(entity != null)
                {
                    entity.Goods.Add(g);
                    db.Update(entity);
                    db.SaveChanges();
                }
            }
        }

        public void AddGoodsToOrder(int OrderID, List<Good> goods)
        {
            using (var db = new DataContext())
            {
                var entity = db.Orders.FirstOrDefault(o => o.ID == OrderID);
                if (entity != null)
                {
                    entity.Goods.AddRange(goods);
                    db.Update(entity);
                    db.SaveChanges();
                }
            }
        }

        public void RemoveGoodFromOrder(int OrderID,Good g)
        {
            using (var db = new DataContext())
            {
                var entity = db.Orders.FirstOrDefault(o => o.ID == OrderID);
                if (entity != null)
                {
                    if (entity.Goods.Contains(g))
                    {
                        entity.Goods.Remove(g);
                    }
                }
            }
        }

        public void RemoveOrder(int ID)
        {
            using (var db = new DataContext())
            {
                db.Orders.Remove(db.Orders.FirstOrDefault(o => o.ID == ID));
            }
        }
        #endregion
    }


}
