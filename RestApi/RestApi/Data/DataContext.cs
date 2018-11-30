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
        public DbSet<Order> Orders { get; set; } //таблица с поръчки
        public DbSet<GoodOrder> GoodOrders { get; set; } //таблица с поръчки
        public DbSet<Employee> Employees { get; set; } //таблица със служители и шефове

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

            builder                    //връзка one user - one client_info
              .Entity<User>()
              .HasOne(u => u.ClientInfo)
              .WithOne(ci => ci.User)
              .HasForeignKey<ClientInfo>(ci=> ci.UserRef);

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

            builder
                .Entity<Supplier>()     //връзка one supplier - many goods
                .HasMany(s => s.Goods)
                .WithOne(g => g.Supplier)
                .IsRequired();
        
            base.OnModelCreating(builder);
        }
    }
}
