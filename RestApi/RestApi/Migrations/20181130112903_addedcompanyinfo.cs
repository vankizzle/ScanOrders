using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class addedcompanyinfo : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "ClientInfo");

            migrationBuilder.DropColumn(
                name: "CompanyName",
                table: "Supplier");

            migrationBuilder.DropColumn(
                name: "CompanyPhone",
                table: "Supplier");

            migrationBuilder.AddColumn<string>(
                name: "email",
                table: "User",
                nullable: true);

            migrationBuilder.CreateTable(
                name: "UserInfo",
                columns: table => new
                {
                    ID = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    FirstName = table.Column<string>(nullable: true),
                    LastName = table.Column<string>(nullable: true),
                    Phone = table.Column<string>(nullable: true),
                    City = table.Column<string>(nullable: true),
                    Country = table.Column<string>(nullable: true),
                    Address = table.Column<string>(nullable: true),
                    UserRef = table.Column<int>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_UserInfo", x => x.ID);
                    table.ForeignKey(
                        name: "FK_UserInfo_User_UserRef",
                        column: x => x.UserRef,
                        principalTable: "User",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "CompanyInfo",
                columns: table => new
                {
                    ID = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    CompanyName = table.Column<string>(nullable: true),
                    CompanyPhone = table.Column<string>(nullable: true),
                    UserInfoRef = table.Column<int>(nullable: false),
                    SupplierRef = table.Column<int>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_CompanyInfo", x => x.ID);
                    table.ForeignKey(
                        name: "FK_CompanyInfo_Supplier_SupplierRef",
                        column: x => x.SupplierRef,
                        principalTable: "Supplier",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                    table.ForeignKey(
                        name: "FK_CompanyInfo_UserInfo_UserInfoRef",
                        column: x => x.UserInfoRef,
                        principalTable: "UserInfo",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_CompanyInfo_SupplierRef",
                table: "CompanyInfo",
                column: "SupplierRef",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_CompanyInfo_UserInfoRef",
                table: "CompanyInfo",
                column: "UserInfoRef",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_UserInfo_UserRef",
                table: "UserInfo",
                column: "UserRef",
                unique: true);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "CompanyInfo");

            migrationBuilder.DropTable(
                name: "UserInfo");

            migrationBuilder.DropColumn(
                name: "email",
                table: "User");

            migrationBuilder.AddColumn<string>(
                name: "CompanyName",
                table: "Supplier",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "CompanyPhone",
                table: "Supplier",
                nullable: true);

            migrationBuilder.CreateTable(
                name: "ClientInfo",
                columns: table => new
                {
                    ID = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    Address = table.Column<string>(nullable: true),
                    City = table.Column<string>(nullable: true),
                    Country = table.Column<string>(nullable: true),
                    FirstName = table.Column<string>(nullable: true),
                    LastName = table.Column<string>(nullable: true),
                    Phone = table.Column<string>(nullable: true),
                    UserRef = table.Column<int>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_ClientInfo", x => x.ID);
                    table.ForeignKey(
                        name: "FK_ClientInfo_User_UserRef",
                        column: x => x.UserRef,
                        principalTable: "User",
                        principalColumn: "ID",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_ClientInfo_UserRef",
                table: "ClientInfo",
                column: "UserRef",
                unique: true);
        }
    }
}
