using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class SecondCreate : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_NickNames_Orders_OrderID",
                table: "NickNames");

            migrationBuilder.DropIndex(
                name: "IX_NickNames_OrderID",
                table: "NickNames");

            migrationBuilder.DropColumn(
                name: "OrderID",
                table: "NickNames");

            migrationBuilder.AddColumn<string>(
                name: "OrderID",
                table: "Goods",
                nullable: true);

            migrationBuilder.AddColumn<int>(
                name: "OrderID1",
                table: "Goods",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Goods_OrderID1",
                table: "Goods",
                column: "OrderID1");

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_Orders_OrderID1",
                table: "Goods",
                column: "OrderID1",
                principalTable: "Orders",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Orders_OrderID1",
                table: "Goods");

            migrationBuilder.DropIndex(
                name: "IX_Goods_OrderID1",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "OrderID",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "OrderID1",
                table: "Goods");

            migrationBuilder.AddColumn<int>(
                name: "OrderID",
                table: "NickNames",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_NickNames_OrderID",
                table: "NickNames",
                column: "OrderID");

            migrationBuilder.AddForeignKey(
                name: "FK_NickNames_Orders_OrderID",
                table: "NickNames",
                column: "OrderID",
                principalTable: "Orders",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);
        }
    }
}
