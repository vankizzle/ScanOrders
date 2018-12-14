using Microsoft.EntityFrameworkCore.Migrations;

namespace RestAPI2.Migrations
{
    public partial class newpropgood : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<int>(
                name: "Qtty",
                table: "Goods",
                nullable: false,
                defaultValue: 0);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "Qtty",
                table: "Goods");
        }
    }
}
