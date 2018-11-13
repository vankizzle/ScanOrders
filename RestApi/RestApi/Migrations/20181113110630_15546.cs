using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class _15546 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Orders_OrderID",
                table: "Goods");

            migrationBuilder.DropTable(
                name: "NickNames");

            migrationBuilder.DropIndex(
                name: "IX_Goods_OrderID",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "OrderID",
                table: "Goods");

            migrationBuilder.CreateTable(
                name: "GoodOrders",
                columns: table => new
                {
                    GoodId = table.Column<int>(nullable: false),
                    OrderId = table.Column<int>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_GoodOrders", x => new { x.GoodId, x.OrderId });
                    table.ForeignKey(
                        name: "FK_GoodOrders_Goods_GoodId",
                        column: x => x.GoodId,
                        principalTable: "Goods",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_GoodOrders_Orders_OrderId",
                        column: x => x.OrderId,
                        principalTable: "Orders",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_GoodOrders_OrderId",
                table: "GoodOrders",
                column: "OrderId");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "GoodOrders");

            migrationBuilder.AddColumn<int>(
                name: "OrderID",
                table: "Goods",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateTable(
                name: "NickNames",
                columns: table => new
                {
                    Id = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    PLU = table.Column<int>(nullable: false),
                    Qtty = table.Column<int>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_NickNames", x => x.Id);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Goods_OrderID",
                table: "Goods",
                column: "OrderID");

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_Orders_OrderID",
                table: "Goods",
                column: "OrderID",
                principalTable: "Orders",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
