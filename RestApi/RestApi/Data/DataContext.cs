using Microsoft.EntityFrameworkCore;
using RestApi.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Data
{
    public class DataContext : DbContext
    {
        public DbSet<Good> Goods { get; set; } //таблица с продукти
        public DbSet<GoodDetail> GoodDetails { get; set; } //таблица с детайли за продукти
        public DbSet<Order> Orders { get; set; } //таблица с поръчки
        public DbSet<GoodOrder> GoodOrders { get; set; } //таблица с поръчки
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
           
            builder                     //ключ GoodID & OrderID
                .Entity<GoodOrder>()
                .HasKey(t => new { t.GoodId, t.OrderId });

            builder                    //връзка one user - one user_info
              .Entity<User>()
              .HasOne(u => u.ClientInfo)
              .WithOne(ui => ui.User)
              .HasForeignKey<UserInfo>(ui=> ui.UserRef);

            builder                     //връзка one user - many orders
                .Entity<User>()
                .HasMany(u => u.Orders)
                .WithOne(o => o.User)
                .HasForeignKey(o => o.UserRef);
            
            builder
                .Entity<Good>()         //връзка one good - one gooddetail
                .HasOne(g => g.Detail)
                .WithOne(gd => gd.Good)
                .HasForeignKey<GoodDetail>(gd => gd.GoodRef);
            //под въпрос
            builder 
                 .Entity<GoodDetail>()
                 .HasOne(gd => gd.Good)
                 .WithOne(g => g.Detail)
                 .HasForeignKey<Good>(g => g.DetailRef);

            builder
                .Entity<Supplier>()     //връзка one supplier - many goods
                .HasMany(s => s.Goods)
                .WithOne(g => g.Supplier)
                .IsRequired();

            builder                     //връзка one supplier - one company info 
                .Entity<Supplier>()
                .HasOne(s => s.CompanyInfo)
                .WithOne(ci => ci.Supplier)
                .HasForeignKey<CompanyInfo>(ci => ci.SupplierRef)
                .IsRequired();

            builder                       //връзка one userinfo - one company info 
                .Entity<UserInfo>()
                .HasOne(ui => ui.CompanyInfo)
                .WithOne(ci => ci.UserInfo)
                .HasForeignKey<CompanyInfo>(ci => ci.UserInfoRef);


        
            base.OnModelCreating(builder);
        }
    }
}
