using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class _12122018 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Orders_Users_UserRef",
                table: "Orders");

            migrationBuilder.RenameColumn(
                name: "UserRef",
                table: "Orders",
                newName: "UserID");

            migrationBuilder.RenameIndex(
                name: "IX_Orders_UserRef",
                table: "Orders",
                newName: "IX_Orders_UserID");

            migrationBuilder.AddForeignKey(
                name: "FK_Orders_Users_UserID",
                table: "Orders",
                column: "UserID",
                principalTable: "Users",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Orders_Users_UserID",
                table: "Orders");

            migrationBuilder.RenameColumn(
                name: "UserID",
                table: "Orders",
                newName: "UserRef");

            migrationBuilder.RenameIndex(
                name: "IX_Orders_UserID",
                table: "Orders",
                newName: "IX_Orders_UserRef");

            migrationBuilder.AddForeignKey(
                name: "FK_Orders_Users_UserRef",
                table: "Orders",
                column: "UserRef",
                principalTable: "Users",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
