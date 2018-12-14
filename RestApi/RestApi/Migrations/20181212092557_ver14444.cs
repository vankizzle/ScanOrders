using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class ver14444 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_UserInfos_CompanyInfos_CompanyInfoRef",
                table: "UserInfos");

            migrationBuilder.DropIndex(
                name: "IX_UserInfos_CompanyInfoRef",
                table: "UserInfos");

            migrationBuilder.AddColumn<int>(
                name: "UserInfoRef",
                table: "CompanyInfos",
                nullable: false,
                defaultValue: 0);

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
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_CompanyInfos_UserInfos_UserInfoRef",
                table: "CompanyInfos");

            migrationBuilder.DropIndex(
                name: "IX_CompanyInfos_UserInfoRef",
                table: "CompanyInfos");

            migrationBuilder.DropColumn(
                name: "UserInfoRef",
                table: "CompanyInfos");

            migrationBuilder.CreateIndex(
                name: "IX_UserInfos_CompanyInfoRef",
                table: "UserInfos",
                column: "CompanyInfoRef",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_UserInfos_CompanyInfos_CompanyInfoRef",
                table: "UserInfos",
                column: "CompanyInfoRef",
                principalTable: "CompanyInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
