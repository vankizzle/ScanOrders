using Microsoft.EntityFrameworkCore.Migrations;

namespace RestAPI2.Migrations
{
    public partial class InitialSecond : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "ID",
                table: "OrderedGoods");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<int>(
                name: "ID",
                table: "OrderedGoods",
                nullable: false,
                defaultValue: 0);
        }
    }
}
