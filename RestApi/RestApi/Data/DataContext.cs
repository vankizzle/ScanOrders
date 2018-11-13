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
        public DbSet<GoodOrder> GoodOrders { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder builder)
        {
            builder.UseSqlServer("Server= IVAN_D; Database= ScanOrdersDB; Trusted_Connection=True;");
            base.OnConfiguring(builder);
        }

        protected override void OnModelCreating(ModelBuilder builder)
        {
            //builder
            //    .Entity<Goods>()
            //    .HasOne(g => g.Order)
            //    .WithMany(o => o.Products)
            //    .HasForeignKey(p => p.OrderId);

            builder
                .Entity<GoodOrder>()
                .HasKey(go => new { go.GoodId, go.OrderId });

            builder
                .Entity<GoodOrder>()
                .HasOne(go => go.Good)
                .WithMany(g => g.GoodOrders)
                .HasForeignKey(go => go.GoodId);

            builder
                .Entity<GoodOrder>()
                .HasOne(go => go.Order)
                .WithMany(o => o.GoodOrders)
                .HasForeignKey(go => go.OrderId);

            base.OnModelCreating(builder);
        }
    }
}
