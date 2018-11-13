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

        #region ServicesForGoods
        public void InsertGood(Good g) //добавяне на продукт в базата
        {
            using (var db = new DataContext())  //работи като try-catch block и final-и и dispose-ва datacontext-a
            {
                db.Goods.Add(g);
                db.SaveChanges();
            }
        }

        public Good GetGood(int PLU)    //взимане на продукт по PLU от базата
        {
            using (var db = new DataContext())
            {
                return db.Goods.FirstOrDefault(g => g.PLU == PLU); //няма да излезна от using-a,но затваря DataContext-a
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
                db.Goods.Remove(db.Goods.FirstOrDefault(g => g.PLU == PLU));
            }
        }
        #endregion

        #region ServicesForOrders
        public void InsertOrder(Order o){
            using (var db = new DataContext())  
            {
                db.Orders.Add(o);
            }
        }

        public Order GetOrder(int ID)
        {
            using (var db = new DataContext())
            {
               return db.Orders.FirstOrDefault(o => o.ID == ID);
            }
        }

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
