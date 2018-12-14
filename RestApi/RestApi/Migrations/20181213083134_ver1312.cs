using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class ver1312 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods");

            migrationBuilder.DropForeignKey(
                name: "FK_UserInfos_CompanyInfos_CompanyInfoID",
                table: "UserInfos");

            migrationBuilder.DropIndex(
                name: "IX_UserInfos_CompanyInfoID",
                table: "UserInfos");

            migrationBuilder.DropColumn(
                name: "CompanyInfoID",
                table: "UserInfos");

            migrationBuilder.AddColumn<int>(
                name: "CompanyInfoID",
                table: "Users",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AlterColumn<int>(
                name: "SupplierID",
                table: "Goods",
                nullable: false,
                oldClrType: typeof(int),
                oldNullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Users_CompanyInfoID",
                table: "Users",
                column: "CompanyInfoID",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods",
                column: "SupplierID",
                principalTable: "Suppliers",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Users_CompanyInfos_CompanyInfoID",
                table: "Users",
                column: "CompanyInfoID",
                principalTable: "CompanyInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods");

            migrationBuilder.DropForeignKey(
                name: "FK_Users_CompanyInfos_CompanyInfoID",
                table: "Users");

            migrationBuilder.DropIndex(
                name: "IX_Users_CompanyInfoID",
                table: "Users");

            migrationBuilder.DropColumn(
                name: "CompanyInfoID",
                table: "Users");

            migrationBuilder.AddColumn<int>(
                name: "CompanyInfoID",
                table: "UserInfos",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AlterColumn<int>(
                name: "SupplierID",
                table: "Goods",
                nullable: true,
                oldClrType: typeof(int));

            migrationBuilder.CreateIndex(
                name: "IX_UserInfos_CompanyInfoID",
                table: "UserInfos",
                column: "CompanyInfoID",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods",
                column: "SupplierID",
                principalTable: "Suppliers",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_UserInfos_CompanyInfos_CompanyInfoID",
                table: "UserInfos",
                column: "CompanyInfoID",
                principalTable: "CompanyInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
