using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class ThirdTry : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Orders_OrderID1",
                table: "Goods");

            migrationBuilder.DropIndex(
                name: "IX_Goods_OrderID1",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "OrderID1",
                table: "Goods");

            migrationBuilder.AlterColumn<int>(
                name: "OrderID",
                table: "Goods",
                nullable: false,
                oldClrType: typeof(string),
                oldNullable: true);

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

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Orders_OrderID",
                table: "Goods");

            migrationBuilder.DropIndex(
                name: "IX_Goods_OrderID",
                table: "Goods");

            migrationBuilder.AlterColumn<string>(
                name: "OrderID",
                table: "Goods",
                nullable: true,
                oldClrType: typeof(int));

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
    }
}
