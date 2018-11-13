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
    [Migration("20181113094047_112")]
    partial class _112
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

                    b.Property<int?>("OrderID");

                    b.Property<int>("PLU");

                    b.Property<double>("Price");

                    b.HasKey("ID");

                    b.HasIndex("OrderID");

                    b.ToTable("Goods");
                });

            modelBuilder.Entity("RestApi.Models.GoodQtty", b =>
                {
                    b.Property<int>("Id")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("PLU");

                    b.Property<int>("Qtty");

                    b.HasKey("Id");

                    b.ToTable("NickNames");
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

            modelBuilder.Entity("RestApi.Models.Good", b =>
                {
                    b.HasOne("RestApi.Models.Order")
                        .WithMany("GoodsList")
                        .HasForeignKey("OrderID");
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
