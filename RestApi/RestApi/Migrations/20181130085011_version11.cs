using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class version11 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Orders_ClientInfo_ClientId",
                table: "Orders");

            migrationBuilder.DropColumn(
                name: "Description",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "Name",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "PLU",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "Price",
                table: "Goods");

            migrationBuilder.RenameColumn(
                name: "ClientId",
                table: "Orders",
                newName: "UserRef");

            migrationBuilder.RenameIndex(
                name: "IX_Orders_ClientId",
                table: "Orders",
                newName: "IX_Orders_UserRef");

            migrationBuilder.AddColumn<string>(
                name: "OrderCode",
                table: "Orders",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "SupplierID",
                table: "Goods",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<int>(
                name: "Qtty",
                table: "GoodOrders",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<double>(
                name: "Unit_Price",
                table: "GoodOrders",
                nullable: false,
                defaultValue: 0.0);

            migrationBuilder.AddColumn<int>(
                name: "UserID",
                table: "ClientInfo",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateTable(
                name: "Employees",
                columns: table => new
                {
                    ID = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    username = table.Column<string>(nullable: true),
                    password = table.Column<string>(nullable: true),
                    Is_Boss = table.Column<int>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Employees", x => x.ID);
                });

            migrationBuilder.CreateTable(
                name: "GoodDetail",
                columns: table => new
                {
                    ID = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    PLU = table.Column<int>(nullable: false),
                    Name = table.Column<string>(nullable: true),
                    Price = table.Column<double>(nullable: false),
                    Description = table.Column<string>(nullable: true),
                    Is_Discontinued = table.Column<int>(nullable: false),
                    GoodRef = table.Column<int>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_GoodDetail", x => x.ID);
                    table.ForeignKey(
                        name: "FK_GoodDetail_Goods_GoodRef",
                        column: x => x.GoodRef,
                        principalTable: "Goods",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Supplier",
                columns: table => new
                {
                    ID = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    CompanyName = table.Column<string>(nullable: true),
                    CompanyPhone = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Supplier", x => x.ID);
                });

            migrationBuilder.CreateTable(
                name: "User",
                columns: table => new
                {
                    ID = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    username = table.Column<string>(nullable: true),
                    password = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_User", x => x.ID);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Goods_SupplierID",
                table: "Goods",
                column: "SupplierID");

            migrationBuilder.CreateIndex(
                name: "IX_ClientInfo_UserID",
                table: "ClientInfo",
                column: "UserID",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_GoodDetail_GoodRef",
                table: "GoodDetail",
                column: "GoodRef",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_ClientInfo_User_UserID",
                table: "ClientInfo",
                column: "UserID",
                principalTable: "User",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_Supplier_SupplierID",
                table: "Goods",
                column: "SupplierID",
                principalTable: "Supplier",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Orders_User_UserRef",
                table: "Orders",
                column: "UserRef",
                principalTable: "User",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_ClientInfo_User_UserID",
                table: "ClientInfo");

            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Supplier_SupplierID",
                table: "Goods");

            migrationBuilder.DropForeignKey(
                name: "FK_Orders_User_UserRef",
                table: "Orders");

            migrationBuilder.DropTable(
                name: "Employees");

            migrationBuilder.DropTable(
                name: "GoodDetail");

            migrationBuilder.DropTable(
                name: "Supplier");

            migrationBuilder.DropTable(
                name: "User");

            migrationBuilder.DropIndex(
                name: "IX_Goods_SupplierID",
                table: "Goods");

            migrationBuilder.DropIndex(
                name: "IX_ClientInfo_UserID",
                table: "ClientInfo");

            migrationBuilder.DropColumn(
                name: "OrderCode",
                table: "Orders");

            migrationBuilder.DropColumn(
                name: "SupplierID",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "Qtty",
                table: "GoodOrders");

            migrationBuilder.DropColumn(
                name: "Unit_Price",
                table: "GoodOrders");

            migrationBuilder.DropColumn(
                name: "UserID",
                table: "ClientInfo");

            migrationBuilder.RenameColumn(
                name: "UserRef",
                table: "Orders",
                newName: "ClientId");

            migrationBuilder.RenameIndex(
                name: "IX_Orders_UserRef",
                table: "Orders",
                newName: "IX_Orders_ClientId");

            migrationBuilder.AddColumn<string>(
                name: "Description",
                table: "Goods",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "Name",
                table: "Goods",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "PLU",
                table: "Goods",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<double>(
                name: "Price",
                table: "Goods",
                nullable: false,
                defaultValue: 0.0);

            migrationBuilder.AddForeignKey(
                name: "FK_Orders_ClientInfo_ClientId",
                table: "Orders",
                column: "ClientId",
                principalTable: "ClientInfo",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
