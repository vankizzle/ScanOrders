using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class newservicestest1 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_UserInfos_Users_UserRef",
                table: "UserInfos");

            migrationBuilder.DropIndex(
                name: "IX_UserInfos_UserRef",
                table: "UserInfos");

            migrationBuilder.AddColumn<int>(
                name: "UserInfoRef",
                table: "Users",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateIndex(
                name: "IX_Users_UserInfoRef",
                table: "Users",
                column: "UserInfoRef",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Users_UserInfos_UserInfoRef",
                table: "Users",
                column: "UserInfoRef",
                principalTable: "UserInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Users_UserInfos_UserInfoRef",
                table: "Users");

            migrationBuilder.DropIndex(
                name: "IX_Users_UserInfoRef",
                table: "Users");

            migrationBuilder.DropColumn(
                name: "UserInfoRef",
                table: "Users");

            migrationBuilder.CreateIndex(
                name: "IX_UserInfos_UserRef",
                table: "UserInfos",
                column: "UserRef",
                unique: true);

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
