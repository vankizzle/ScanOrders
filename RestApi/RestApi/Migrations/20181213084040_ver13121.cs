using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class ver13121 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods");

            migrationBuilder.AlterColumn<int>(
                name: "SupplierID",
                table: "Goods",
                nullable: true,
                oldClrType: typeof(int));

            migrationBuilder.AddColumn<string>(
                name: "SupplierName",
                table: "Goods",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "SupplierPhone",
                table: "Goods",
                nullable: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods",
                column: "SupplierID",
                principalTable: "Suppliers",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "SupplierName",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "SupplierPhone",
                table: "Goods");

            migrationBuilder.AlterColumn<int>(
                name: "SupplierID",
                table: "Goods",
                nullable: false,
                oldClrType: typeof(int),
                oldNullable: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods",
                column: "SupplierID",
                principalTable: "Suppliers",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
