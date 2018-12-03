using Microsoft.EntityFrameworkCore;
using RestApi.Data;
using RestApi.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Services
{
    public class DBService
    {
        #region UserAuthenticationServices
        public void RegisterUser(User new_user)
        {
            using (var db = new DataContext())
            {
                if (db.Users.FirstOrDefault(user => user.username == new_user.username) == null)
                {
                    if(db.Users.FirstOrDefault(user => user.email == new_user.email) == null)
                    {
                        db.Users.Add(new_user);
                        db.SaveChanges();
                    }
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
        #endregion

        #region ServicesForGoods
        public void InsertGood(Good g) //добавяне на продукт в базата
        {
            using (var db = new DataContext())  //работи като try-catch block и final-и и dispose-ва datacontext-a
            {
                db.Goods.Add(g);
                db.SaveChanges();
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

        public void UpdateGood(Good g)
        {
            using (var db = new DataContext())
            {
                db.Goods.Update(g);
            }
        }

        public void RemoveGood(int PLU)
        {
            using (var db = new DataContext())
            {
                db.Goods.Remove(db.Goods.FirstOrDefault(g => g.Detail.PLU == PLU));
            }
        }
        #endregion

        #region ServicesForOrders
        public void InsertOrder(Order o){
            using (var db = new DataContext())  
            {
                db.Orders.Add(o);
                db.SaveChanges();
            }
        }

        //public Order GetOrderByID(int ID)
        //{
        //    using (var db = new DataContext())
        //    {
        //        return db.Orders.Include(o => o.ID).FirstOrDefault(o => o.ID == ID);
        //    }
        //}

        public void UpdateOrder(Order o)
        {
            using (var db = new DataContext())
            {
                db.Orders.Update(o);
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
