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

        protected override void OnConfiguring(DbContextOptionsBuilder builder)
        {
            builder.UseSqlServer("Server= IVAN_D; Database= ScanOrdersDB; Trusted_Connection=True;");
            base.OnConfiguring(builder);
        }

        protected override void OnModelCreating(ModelBuilder builder)
        {
           
            builder
                .Entity<GoodOrder>()
                .HasKey(t => new { t.GoodId, t.OrderId });

            builder
                .Entity<User>()
                .HasMany(u => u.Orders)
                .WithOne(o => o.User)
                .HasForeignKey(o => o.User_ID);

            builder
                .Entity<User>()
                .HasOne(u => u.ClientInfo)
                .WithOne(c => c.User)
                .HasForeignKey<ClientInfo>(c => c.UserID);

        
            base.OnModelCreating(builder);
        }
    }
}
