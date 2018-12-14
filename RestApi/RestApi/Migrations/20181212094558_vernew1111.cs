using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class vernew1111 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_CompanyInfos_UserInfos_UserInfoRef",
                table: "CompanyInfos");

            migrationBuilder.DropForeignKey(
                name: "FK_Suppliers_CompanyInfos_CompanyInfoRef",
                table: "Suppliers");

            migrationBuilder.DropForeignKey(
                name: "FK_UserInfos_Users_UserRef",
                table: "UserInfos");

            migrationBuilder.DropIndex(
                name: "IX_Suppliers_CompanyInfoRef",
                table: "Suppliers");

            migrationBuilder.DropIndex(
                name: "IX_CompanyInfos_UserInfoRef",
                table: "CompanyInfos");

            migrationBuilder.DropColumn(
                name: "CompanyInfoRef",
                table: "UserInfos");

            migrationBuilder.DropColumn(
                name: "CompanyInfoRef",
                table: "Suppliers");

            migrationBuilder.DropColumn(
                name: "UserInfoRef",
                table: "CompanyInfos");

            migrationBuilder.RenameColumn(
                name: "UserRef",
                table: "UserInfos",
                newName: "CompanyInfoID");

            migrationBuilder.RenameIndex(
                name: "IX_UserInfos_UserRef",
                table: "UserInfos",
                newName: "IX_UserInfos_CompanyInfoID");

            migrationBuilder.AddColumn<int>(
                name: "UserInfoID",
                table: "Users",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<string>(
                name: "SupplierName",
                table: "Suppliers",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "SupplierPhone",
                table: "Suppliers",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Users_UserInfoID",
                table: "Users",
                column: "UserInfoID",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_UserInfos_CompanyInfos_CompanyInfoID",
                table: "UserInfos",
                column: "CompanyInfoID",
                principalTable: "CompanyInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Users_UserInfos_UserInfoID",
                table: "Users",
                column: "UserInfoID",
                principalTable: "UserInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_UserInfos_CompanyInfos_CompanyInfoID",
                table: "UserInfos");

            migrationBuilder.DropForeignKey(
                name: "FK_Users_UserInfos_UserInfoID",
                table: "Users");

            migrationBuilder.DropIndex(
                name: "IX_Users_UserInfoID",
                table: "Users");

            migrationBuilder.DropColumn(
                name: "UserInfoID",
                table: "Users");

            migrationBuilder.DropColumn(
                name: "SupplierName",
                table: "Suppliers");

            migrationBuilder.DropColumn(
                name: "SupplierPhone",
                table: "Suppliers");

            migrationBuilder.RenameColumn(
                name: "CompanyInfoID",
                table: "UserInfos",
                newName: "UserRef");

            migrationBuilder.RenameIndex(
                name: "IX_UserInfos_CompanyInfoID",
                table: "UserInfos",
                newName: "IX_UserInfos_UserRef");

            migrationBuilder.AddColumn<int>(
                name: "CompanyInfoRef",
                table: "UserInfos",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<int>(
                name: "CompanyInfoRef",
                table: "Suppliers",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<int>(
                name: "UserInfoRef",
                table: "CompanyInfos",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateIndex(
                name: "IX_Suppliers_CompanyInfoRef",
                table: "Suppliers",
                column: "CompanyInfoRef",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_CompanyInfos_UserInfoRef",
                table: "CompanyInfos",
                column: "UserInfoRef",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_CompanyInfos_UserInfos_UserInfoRef",
                table: "CompanyInfos",
                column: "UserInfoRef",
                principalTable: "UserInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Suppliers_CompanyInfos_CompanyInfoRef",
                table: "Suppliers",
                column: "CompanyInfoRef",
                principalTable: "CompanyInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_UserInfos_Users_UserRef",
                table: "UserInfos",
                column: "UserRef",
                principalTable: "Users",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
