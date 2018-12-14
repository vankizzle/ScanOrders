﻿// <auto-generated />
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;
using RestAPI2.Data;

namespace RestAPI2.Migrations
{
    [DbContext(typeof(DataContext))]
    partial class DataContextModelSnapshot : ModelSnapshot
    {
        protected override void BuildModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "2.1.2-rtm-30932")
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("RestAPI2.Models.CompanyInfo", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("CompanyName");

                    b.Property<string>("CompanyPhone");

                    b.HasKey("ID");

                    b.ToTable("CompanyInfos");
                });

            modelBuilder.Entity("RestAPI2.Models.Employee", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("Is_Boss");

                    b.Property<string>("password");

                    b.Property<string>("username");

                    b.HasKey("ID");

                    b.ToTable("Employees");
                });

            modelBuilder.Entity("RestAPI2.Models.Good", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("DetailID");

                    b.Property<int>("SupplierID");

                    b.HasKey("ID");

                    b.HasIndex("DetailID")
                        .IsUnique();

                    b.HasIndex("SupplierID");

                    b.ToTable("Goods");
                });

            modelBuilder.Entity("RestAPI2.Models.GoodDetail", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Description");

                    b.Property<int>("Is_Discontinued");

                    b.Property<string>("Name");

                    b.Property<int>("PLU");

                    b.Property<double>("Price");

                    b.HasKey("ID");

                    b.ToTable("GoodDetails");
                });

            modelBuilder.Entity("RestAPI2.Models.GoodsOrders", b =>
                {
                    b.Property<int>("GoodId");

                    b.Property<int>("OrderId");

                    b.Property<int>("GoodOrderID");

                    b.Property<int>("Qtty");

                    b.Property<double>("Unit_Price");

                    b.HasKey("GoodId", "OrderId");

                    b.HasIndex("OrderId");

                    b.ToTable("GoodsOrders");
                });

            modelBuilder.Entity("RestAPI2.Models.Order", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("OrderCode");

                    b.Property<double>("OrderTotalPrice");

                    b.Property<int>("UserID");

                    b.HasKey("ID");

                    b.HasIndex("UserID");

                    b.ToTable("Orders");
                });

            modelBuilder.Entity("RestAPI2.Models.Supplier", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("SupplierName");

                    b.Property<string>("SupplierPhone");

                    b.HasKey("ID");

                    b.ToTable("Suppliers");
                });

            modelBuilder.Entity("RestAPI2.Models.User", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("CompanyInfoID");

                    b.Property<int>("UserInfoID");

                    b.Property<string>("email");

                    b.Property<string>("password");

                    b.Property<string>("username");

                    b.HasKey("ID");

                    b.HasIndex("CompanyInfoID")
                        .IsUnique();

                    b.HasIndex("UserInfoID")
                        .IsUnique();

                    b.ToTable("Users");
                });

            modelBuilder.Entity("RestAPI2.Models.UserInfo", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Address");

                    b.Property<string>("City");

                    b.Property<string>("Country");

                    b.Property<string>("FirstName");

                    b.Property<string>("LastName");

                    b.Property<string>("Phone");

                    b.HasKey("ID");

                    b.ToTable("UserInfos");
                });

            modelBuilder.Entity("RestAPI2.Models.Good", b =>
                {
                    b.HasOne("RestAPI2.Models.GoodDetail", "Detail")
                        .WithOne("Good")
                        .HasForeignKey("RestAPI2.Models.Good", "DetailID")
                        .OnDelete(DeleteBehavior.Cascade);

                    b.HasOne("RestAPI2.Models.Supplier", "Supplier")
                        .WithMany("Goods")
                        .HasForeignKey("SupplierID")
                        .OnDelete(DeleteBehavior.Cascade);
                });

            modelBuilder.Entity("RestAPI2.Models.GoodsOrders", b =>
                {
                    b.HasOne("RestAPI2.Models.Good", "Good")
                        .WithMany("GoodOrders")
                        .HasForeignKey("GoodId")
                        .OnDelete(DeleteBehavior.Cascade);

                    b.HasOne("RestAPI2.Models.Order", "Order")
                        .WithMany("GoodOrders")
                        .HasForeignKey("OrderId")
                        .OnDelete(DeleteBehavior.Cascade);
                });

            modelBuilder.Entity("RestAPI2.Models.Order", b =>
                {
                    b.HasOne("RestAPI2.Models.User", "User")
                        .WithMany("Orders")
                        .HasForeignKey("UserID")
                        .OnDelete(DeleteBehavior.Cascade);
                });

            modelBuilder.Entity("RestAPI2.Models.User", b =>
                {
                    b.HasOne("RestAPI2.Models.CompanyInfo", "CompanyInfo")
                        .WithOne("User")
                        .HasForeignKey("RestAPI2.Models.User", "CompanyInfoID")
                        .OnDelete(DeleteBehavior.Cascade);

                    b.HasOne("RestAPI2.Models.UserInfo", "UserInfo")
                        .WithOne("User")
                        .HasForeignKey("RestAPI2.Models.User", "UserInfoID")
                        .OnDelete(DeleteBehavior.Cascade);
                });
#pragma warning restore 612, 618
        }
    }
}
