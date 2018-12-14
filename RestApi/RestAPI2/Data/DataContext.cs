using Microsoft.EntityFrameworkCore;
using RestAPI2.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestAPI2.Data
{
    public class DataContext : DbContext
    {
        public DbSet<Good> Goods { get; set; } //таблица с продукти
        public DbSet<GoodDetail> GoodDetails { get; set; } //таблица с детайли за продукти
        public DbSet<Order> Orders { get; set; } //таблица с поръчки
        public DbSet<GoodsOrders> GoodsOrders { get; set; } //таблица с поръчки
        public DbSet<Employee> Employees { get; set; } //таблица със служители и шефове
        public DbSet<User> Users { get; set; }  //таблица с потребители
        public DbSet<UserInfo> UserInfos { get; set; }  //таблица с инфо за потребителите
        public DbSet<CompanyInfo> CompanyInfos { get; set; }  //таблица с инфо за компанийте
        public DbSet<Supplier> Suppliers { get; set; }          //таблица с доставчиците

        protected override void OnConfiguring(DbContextOptionsBuilder builder)
        {
            builder.UseSqlServer("Server= IVAN_D; Database= ScanOrdersDB; Trusted_Connection=True;");
            base.OnConfiguring(builder);
        }

        protected override void OnModelCreating(ModelBuilder builder)
        {


            #region UserContext
            builder                    //връзка one user - one user_info
              .Entity<User>()
              .HasOne(u => u.UserInfo)
              .WithOne(ui => ui.User)
              .HasForeignKey<User>(u => u.UserInfoID);

            builder                    //връзка one user - one company_info
             .Entity<User>()
             .HasOne(u => u.CompanyInfo)
             .WithOne(ci => ci.User)
             .HasForeignKey<User>(u => u.CompanyInfoID);

            builder                     //връзка one user - many orders
                .Entity<User>()
                .HasMany(u => u.Orders)
                .WithOne(o => o.User)
                .HasForeignKey(o => o.UserID);
            #endregion


            builder                     //ключ GoodID & OrderID
                .Entity<GoodsOrders>()
                .HasKey(t => new { t.GoodId, t.OrderId });

            builder
                .Entity<Good>()         //връзка one good - one gooddetail
                .HasOne(g => g.Detail)
                .WithOne(gd => gd.Good)
                .HasForeignKey<Good>(g => g.DetailID);

            builder
                .Entity<Good>()     //връзка one supplier - many goods
                .HasOne(g => g.Supplier)
                .WithMany(s => s.Goods)
                .HasForeignKey(g => g.SupplierID);

            base.OnModelCreating(builder);
        }
    }
}
