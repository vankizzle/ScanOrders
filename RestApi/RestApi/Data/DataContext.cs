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

            base.OnModelCreating(builder);
        }
    }
}
