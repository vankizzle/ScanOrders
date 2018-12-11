using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class somechanges113 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Suppliers_CompanyInfos_CompanyInfoID",
                table: "Suppliers");

            migrationBuilder.RenameColumn(
                name: "CompanyInfoID",
                table: "Suppliers",
                newName: "CompanyInfoRef");

            migrationBuilder.RenameIndex(
                name: "IX_Suppliers_CompanyInfoID",
                table: "Suppliers",
                newName: "IX_Suppliers_CompanyInfoRef");

            migrationBuilder.AddForeignKey(
                name: "FK_Suppliers_CompanyInfos_CompanyInfoRef",
                table: "Suppliers",
                column: "CompanyInfoRef",
                principalTable: "CompanyInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Suppliers_CompanyInfos_CompanyInfoRef",
                table: "Suppliers");

            migrationBuilder.RenameColumn(
                name: "CompanyInfoRef",
                table: "Suppliers",
                newName: "CompanyInfoID");

            migrationBuilder.RenameIndex(
                name: "IX_Suppliers_CompanyInfoRef",
                table: "Suppliers",
                newName: "IX_Suppliers_CompanyInfoID");

            migrationBuilder.AddForeignKey(
                name: "FK_Suppliers_CompanyInfos_CompanyInfoID",
                table: "Suppliers",
                column: "CompanyInfoID",
                principalTable: "CompanyInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
