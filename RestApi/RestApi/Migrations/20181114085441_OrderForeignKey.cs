using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class OrderForeignKey : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Orders_ClientInfo_ClientID",
                table: "Orders");

            migrationBuilder.RenameColumn(
                name: "ClientID",
                table: "Orders",
                newName: "ClientId");

            migrationBuilder.RenameIndex(
                name: "IX_Orders_ClientID",
                table: "Orders",
                newName: "IX_Orders_ClientId");

            migrationBuilder.AlterColumn<int>(
                name: "ClientId",
                table: "Orders",
                nullable: false,
                oldClrType: typeof(int),
                oldNullable: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Orders_ClientInfo_ClientId",
                table: "Orders",
                column: "ClientId",
                principalTable: "ClientInfo",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Orders_ClientInfo_ClientId",
                table: "Orders");

            migrationBuilder.RenameColumn(
                name: "ClientId",
                table: "Orders",
                newName: "ClientID");

            migrationBuilder.RenameIndex(
                name: "IX_Orders_ClientId",
                table: "Orders",
                newName: "IX_Orders_ClientID");

            migrationBuilder.AlterColumn<int>(
                name: "ClientID",
                table: "Orders",
                nullable: true,
                oldClrType: typeof(int));

            migrationBuilder.AddForeignKey(
                name: "FK_Orders_ClientInfo_ClientID",
                table: "Orders",
                column: "ClientID",
                principalTable: "ClientInfo",
                principalColumn: "ID",
                onDelete: ReferentialAction.Restrict);
        }
    }
}
