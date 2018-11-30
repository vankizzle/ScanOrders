using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class test1154 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_GoodDetails_Goods_GoodRef",
                table: "GoodDetails");

            migrationBuilder.DropIndex(
                name: "IX_GoodDetails_GoodRef",
                table: "GoodDetails");

            migrationBuilder.AddColumn<int>(
                name: "DetailRef",
                table: "Goods",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateIndex(
                name: "IX_Goods_DetailRef",
                table: "Goods",
                column: "DetailRef",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_GoodDetails_DetailRef",
                table: "Goods",
                column: "DetailRef",
                principalTable: "GoodDetails",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_GoodDetails_DetailRef",
                table: "Goods");

            migrationBuilder.DropIndex(
                name: "IX_Goods_DetailRef",
                table: "Goods");

            migrationBuilder.DropColumn(
                name: "DetailRef",
                table: "Goods");

            migrationBuilder.CreateIndex(
                name: "IX_GoodDetails_GoodRef",
                table: "GoodDetails",
                column: "GoodRef",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_GoodDetails_Goods_GoodRef",
                table: "GoodDetails",
                column: "GoodRef",
                principalTable: "Goods",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
