using Microsoft.EntityFrameworkCore.Migrations;

namespace RestAPI2.Migrations
{
    public partial class migrationtest : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AlterColumn<string>(
                name: "OrderCode",
                table: "Orders",
                nullable: true,
                oldClrType: typeof(string),
                oldNullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Orders_OrderCode",
                table: "Orders",
                column: "OrderCode",
                unique: true,
                filter: "[OrderCode] IS NOT NULL");

            migrationBuilder.CreateIndex(
                name: "IX_Goods_PLU",
                table: "Goods",
                column: "PLU",
                unique: true);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropIndex(
                name: "IX_Orders_OrderCode",
                table: "Orders");

            migrationBuilder.DropIndex(
                name: "IX_Goods_PLU",
                table: "Goods");

            migrationBuilder.AlterColumn<string>(
                name: "OrderCode",
                table: "Orders",
                nullable: true,
                oldClrType: typeof(string),
                oldNullable: true);
        }
    }
}
