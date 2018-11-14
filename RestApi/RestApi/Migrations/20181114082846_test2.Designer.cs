﻿// <auto-generated />
using System;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;
using RestApi.Data;

namespace RestApi.Migrations
{
    [DbContext(typeof(DataContext))]
    [Migration("20181114082846_test2")]
    partial class test2
    {
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "2.1.2-rtm-30932")
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("RestApi.Models.ClientInfo", b =>
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

                    b.ToTable("ClientInfo");
                });

            modelBuilder.Entity("RestApi.Models.Good", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Description");

                    b.Property<string>("Name");

                    b.Property<int>("PLU");

                    b.Property<double>("Price");

                    b.HasKey("ID");

                    b.ToTable("Goods");
                });

            modelBuilder.Entity("RestApi.Models.GoodOrder", b =>
                {
                    b.Property<int>("GoodId");

                    b.Property<int>("OrderId");

                    b.Property<int>("GoodOrderID");

                    b.HasKey("GoodId", "OrderId");

                    b.HasIndex("OrderId");

                    b.ToTable("GoodOrder");
                });

            modelBuilder.Entity("RestApi.Models.Order", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int?>("ClientID");

                    b.Property<double>("OrderTotalPrice");

                    b.HasKey("ID");

                    b.HasIndex("ClientID");

                    b.ToTable("Orders");
                });

            modelBuilder.Entity("RestApi.Models.GoodOrder", b =>
                {
                    b.HasOne("RestApi.Models.Good", "Good")
                        .WithMany("GoodOrders")
                        .HasForeignKey("GoodId")
                        .OnDelete(DeleteBehavior.Cascade);

                    b.HasOne("RestApi.Models.Order", "Order")
                        .WithMany("GoodOrders")
                        .HasForeignKey("OrderId")
                        .OnDelete(DeleteBehavior.Cascade);
                });

            modelBuilder.Entity("RestApi.Models.Order", b =>
                {
                    b.HasOne("RestApi.Models.ClientInfo", "Client")
                        .WithMany()
                        .HasForeignKey("ClientID");
                });
#pragma warning restore 612, 618
        }
    }
}
