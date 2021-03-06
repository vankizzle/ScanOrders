﻿using Microsoft.EntityFrameworkCore;
using RestAPI2.Data;
using RestAPI2.Models;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Services
{
    public class DBService
    {
        #region UserAuthenticationServices

        public Customer GetCustomerByID(int ID)
        {
            using (var db = new DataContext())
            {
                return db.Customers.FirstOrDefault(c => c.ID == ID);
               
            }
        }

        public bool Register(User new_user)
        {
            using (var db = new DataContext())
            {
                if (db.Users.FirstOrDefault(user => user.username == new_user.username || user.email == new_user.email) == null)
                {   
                  db.Users.Add(new_user);
                  db.SaveChanges();
                  return true;
                }
                return false;
            }
        }


        public bool Register(Customer new_customer)
        {
            using (var db = new DataContext())
            {
                if (db.Customers.FirstOrDefault(customer => customer.username == new_customer.username || customer.email == new_customer.email) == null)
                {
                  db.Customers.Add(new_customer);
                  db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public bool LoginUser(string UserName, string Password)
        {
            using (var db = new DataContext())
            {
                var user = db.Users.FirstOrDefault(u => u.username == UserName && u.password == Password);
                if (user == null)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
        }

        public Customer LoginCustomer(string UserName ,string Password)
        {
            using (var db = new DataContext())
            {
                return db.Customers.FirstOrDefault(customer => customer.username == UserName && customer.password == Password);

               //if (client == null)
               // {
               //     return null;
               // }
               // else
               // {
               //     return client;
               // }
            }
            //var Customer = GetCustomerByUsername(UserName);
            //if(Customer != null)
            //{
            //    if (Customer.password.Equals(Password))
            //    {
            //        return Customer;
            //    }
            //    else return null;
            //}
            //else return null;
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

        public Customer GetCustomerByEmail(string Email)
        {
            using (var db = new DataContext())
            {
                return db.Customers.FirstOrDefault(u => u.email == Email);
            }
        }

        #endregion

        #region ServicesForGoods

        public bool InsertGood(Good g) //добавяне на продукт в базата
        {
            using (var db = new DataContext())  //работи като try-catch block и final-и и dispose-ва datacontext-a
            {
                if(g != null)
                {
                    db.Goods.Add(g);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }            
            }
        }


        public bool InsertSupplier(Supplier s)
        {
            using (var db = new DataContext())
            {
                if (s != null)
                {
                    db.Suppliers.Add(s);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

           public Supplier GetSupplierByID(int ID)
        {
            using (var db = new DataContext())
            {
                return db.Suppliers.FirstOrDefault(s => s.ID == ID);
            }
        }

        public Supplier GetSupplier(Supplier sup)
        {
            using (var db = new DataContext())
            {
                return db.Suppliers.FirstOrDefault(s => s.SupplierName == sup.SupplierName);
            }
        }

        public Good GetGoodByPLU(int PLU)    //взимане на продукт по PLU от базата
        {
            using (var db = new DataContext())
            {
                return db.Goods.FirstOrDefault(g => g.PLU == PLU); //няма да излезна от using-a,но затваря DataContext-a
            }

        }
        
        public Good GetGoodByID(int ID)    //взимане на продукт по PLU от базата
        {
            using (var db = new DataContext())
            {
                return db.Goods.FirstOrDefault(g => g.ID == ID); //няма да излезна от using-a,но затваря DataContext-a
            }

        }

        public void RemoveGoodByPLU(int PLU)
        {
            using (var db = new DataContext())
            {
                db.Goods.Remove(db.Goods.FirstOrDefault(g => g.PLU == PLU));
                db.SaveChanges();
            }
        }

        public Supplier GetGoodSupplierByPLU(int Good_PLU)
        {
            return GetSupplierByID(GetGoodByPLU(Good_PLU).SupplierID);
        }

        public void UpdateGoodPriceByID(int Good_ID, double new_price)
        {
            using (var db = new DataContext())
            {
                var entity = GetGoodByID(Good_ID);
                if (entity != null)
                {
                    entity.Price = new_price;
                    db.Goods.Update(entity);
                    db.SaveChanges();
                }
            }
        }

        public void UpdateGoodPriceByPLU(int Good_PLU, double new_price)
        {
            using (var db = new DataContext())
            {
                var entity = GetGoodByPLU(Good_PLU);

                if (entity != null)
                {
                    entity.Price = new_price;
                    db.Goods.Update(entity);
                    db.SaveChanges();
                }
            }
        }
        #endregion

        #region ServicesForOrders

        public bool InsertOrder(Order o)
        {
            using (var db = new DataContext())
            {
                try
                {
                    db.Orders.Add(o);
                    db.SaveChanges();
                    return true;
                }
                catch (Exception e)
                {
                    return false;
                }
                
            }
        }

        public Order GetOrderByID(int ID)
        {
            using (var db = new DataContext())
            {
                return db.Orders.FirstOrDefault(o => o.ID == ID);
            }
        }

        public Order GetOrderByOrderCode(string Code)
        {
            using (var db = new DataContext())
            {
                return db.Orders.FirstOrDefault(o => o.OrderCode == Code);
            }
        }

        public void RemoveOrderByID(int ID)
        {
            using (var db = new DataContext())
            {
                db.Orders.Remove(db.Orders.FirstOrDefault(o => o.ID == ID));
                db.SaveChanges();
            }
        }

        public void RemoveOrderByOrderCode(string Code)
        {
            using (var db = new DataContext())
            {
                db.Orders.Remove(db.Orders.FirstOrDefault(o => o.OrderCode == Code));
                db.SaveChanges();
            }
        }

        public bool UpdateOrder(Order order)
        {
            using (var db = new DataContext())
            {
                var entity = GetOrderByID(order.ID);

                if (entity != null)
                {
                    entity = order;
                    db.Orders.Update(order);
                    db.SaveChanges();
                    return true;
                }

                return false;
            }
        }

        public List<Order> GetAllOrders()
        {
            using (var db = new DataContext())
            {
                var orders =db.Orders.Where(o => o.OrderStatus.Equals("Waiting")).ToList();

                //foreach (Order o in orders)
                //{
                //    o.OrderedGoods.Concat(db.OrderedGoods.Where(og => og.OrderID == o.ID).ToList());
                //}

                return orders;
            }
        }

        public List<Order> GetAllCustomerOrders(int customerID)
        {
            using (var db = new DataContext())
            {
                //var orders = db.Orders.Where(o => o.CustomerID == customerID).ToList();

                //foreach (Order o in orders)
                //{
                //    var orderedGoodsList = db.OrderedGoods.Where(og => og.OrderID == o.ID).ToList();
                //    foreach(OrderedGoods og in orderedGoodsList)
                //    {
                //        o.OrderedGoods.Add(og);
                //    }
                   
                //}

                //return orders;
                return db.Orders.Where(o => o.CustomerID == customerID).ToList(); 
            }
        }

        public List<OrderedGoods> GetAllOrderedGoodsOfOrder(int orderID)
        {
            using (var db = new DataContext())
            {
                return db.OrderedGoods.Where(og => og.OrderID == orderID).ToList();
            }
        }
        #endregion

    }


}
