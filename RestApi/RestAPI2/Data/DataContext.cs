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
        public DbSet<User> Users { get; set; } //таблица със служители и шефове
        public DbSet<Customer> Customers { get; set; }  //таблица с потребители
        public DbSet<Supplier> Suppliers { get; set; }  //таблица с доставчиците

        protected override void OnConfiguring(DbContextOptionsBuilder builder)
        {
            builder.UseSqlServer("Server= IVAN_D; Database= ScanOrdersDB;User ID=mst\\ivan.draganov; Trusted_Connection=True;");
            base.OnConfiguring(builder);
        }

        protected override void OnModelCreating(ModelBuilder builder)
        {

            builder                     //връзка one user - many orders
                .Entity<Customer>()
                .HasMany(c => c.Orders)
                .WithOne(o => o.Customer)
                .HasForeignKey(o => o.CustomerID);

            builder                     //връзка one user - many orders
               .Entity<Order>()
               .HasMany(o => o.Goods);
               

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
