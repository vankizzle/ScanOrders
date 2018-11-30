using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class nerver111 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_ClientInfo_User_UserID",
                table: "ClientInfo");

            migrationBuilder.RenameColumn(
                name: "UserID",
                table: "ClientInfo",
                newName: "UserRef");

            migrationBuilder.RenameIndex(
                name: "IX_ClientInfo_UserID",
                table: "ClientInfo",
                newName: "IX_ClientInfo_UserRef");

            migrationBuilder.AddForeignKey(
                name: "FK_ClientInfo_User_UserRef",
                table: "ClientInfo",
                column: "UserRef",
                principalTable: "User",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_ClientInfo_User_UserRef",
                table: "ClientInfo");

            migrationBuilder.RenameColumn(
                name: "UserRef",
                table: "ClientInfo",
                newName: "UserID");

            migrationBuilder.RenameIndex(
                name: "IX_ClientInfo_UserRef",
                table: "ClientInfo",
                newName: "IX_ClientInfo_UserID");

            migrationBuilder.AddForeignKey(
                name: "FK_ClientInfo_User_UserID",
                table: "ClientInfo",
                column: "UserID",
                principalTable: "User",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
