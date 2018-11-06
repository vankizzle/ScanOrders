using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Data
{
    public class DataConnector : DbContext
    {
        //public DbSet<Product> Products { get; set; }

        //protected override void OnConfiguring(DbContextOptionsBuilder builder)
        //{
        //    builder.UseSqlServer("Server= .; Database= TempDB; Trusted_Connection=True;");

        //    base.OnConfiguring(builder);
        //}

        //protected override void OnModelCreating(ModelBuilder builder)
        //{
        //    builder
        //        .Entity<Product>()
        //        .HasOne(p => p.Order)
        //        .WithMany(o => o.Products)
        //        .HasForeignKey(p => p.OrderId);

        //    base.OnModelCreating(builder);
        //}
    }
}
