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
        public DbSet<Order> Orders { get; set; } //таблица с поръчки
        public DbSet<User> Users { get; set; } //таблица със служители и шефове
        public DbSet<Customer> Customers { get; set; }  //таблица с потребители
        public DbSet<Supplier> Suppliers { get; set; }  //таблица с доставчиците
        public DbSet<OrderedGoods> OrderedGoods { get; set; }  //свързваща таблица

        protected override void OnConfiguring(DbContextOptionsBuilder builder)
        {
            builder.UseSqlServer("Server=aahje88xyb72dw.crmxekalgiaz.eu-central-1.rds.amazonaws.com,1433; Database=ScanOrdersDB;User ID=IvanD; Password = e459e34a1; Trusted_Connection=True;Integrated Security = false");
            base.OnConfiguring(builder);
        }

        protected override void OnModelCreating(ModelBuilder builder)
        {

            builder                     
                .Entity<Order>()
                .HasIndex(a => a.OrderCode)
                .IsUnique();

            builder
                .Entity<Good>()
                .HasIndex(g => g.PLU)
                .IsUnique();

            builder                     //връзка one user - many orders
                .Entity<Customer>()
                .HasMany(c => c.Orders);

            builder
                .Entity<OrderedGoods>()
                .HasKey(og => new { og.OrderID, og.GoodID });

            builder
                .Entity<OrderedGoods>()
                .HasOne(og => og.Order)
                .WithMany(o => o.OrderedGoods)
                .HasForeignKey(og => og.OrderID);

            builder
                .Entity<Supplier>()     //връзка one supplier - many goods
                .HasMany(s => s.Goods);
            

            base.OnModelCreating(builder);
        }
    }
}
