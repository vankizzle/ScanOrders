using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class test1 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_GoodOrders_Goods_GoodId",
                table: "GoodOrders");

            migrationBuilder.DropForeignKey(
                name: "FK_GoodOrders_Orders_OrderId",
                table: "GoodOrders");

            migrationBuilder.DropPrimaryKey(
                name: "PK_GoodOrders",
                table: "GoodOrders");

            migrationBuilder.RenameTable(
                name: "GoodOrders",
                newName: "GoodOrder");

            migrationBuilder.RenameIndex(
                name: "IX_GoodOrders_OrderId",
                table: "GoodOrder",
                newName: "IX_GoodOrder_OrderId");

            migrationBuilder.AddPrimaryKey(
                name: "PK_GoodOrder",
                table: "GoodOrder",
                columns: new[] { "GoodId", "OrderId" });

            migrationBuilder.AddForeignKey(
                name: "FK_GoodOrder_Goods_GoodId",
                table: "GoodOrder",
                column: "GoodId",
                principalTable: "Goods",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_GoodOrder_Orders_OrderId",
                table: "GoodOrder",
                column: "OrderId",
                principalTable: "Orders",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_GoodOrder_Goods_GoodId",
                table: "GoodOrder");

            migrationBuilder.DropForeignKey(
                name: "FK_GoodOrder_Orders_OrderId",
                table: "GoodOrder");

            migrationBuilder.DropPrimaryKey(
                name: "PK_GoodOrder",
                table: "GoodOrder");

            migrationBuilder.RenameTable(
                name: "GoodOrder",
                newName: "GoodOrders");

            migrationBuilder.RenameIndex(
                name: "IX_GoodOrder_OrderId",
                table: "GoodOrders",
                newName: "IX_GoodOrders_OrderId");

            migrationBuilder.AddPrimaryKey(
                name: "PK_GoodOrders",
                table: "GoodOrders",
                columns: new[] { "GoodId", "OrderId" });

            migrationBuilder.AddForeignKey(
                name: "FK_GoodOrders_Goods_GoodId",
                table: "GoodOrders",
                column: "GoodId",
                principalTable: "Goods",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_GoodOrders_Orders_OrderId",
                table: "GoodOrders",
                column: "OrderId",
                principalTable: "Orders",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
