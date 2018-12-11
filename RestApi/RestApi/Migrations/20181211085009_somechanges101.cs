using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class somechanges101 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_CompanyInfos_Suppliers_SupplierRef",
                table: "CompanyInfos");

            migrationBuilder.DropForeignKey(
                name: "FK_Goods_GoodDetails_DetailRef",
                table: "Goods");

            migrationBuilder.DropIndex(
                name: "IX_CompanyInfos_SupplierRef",
                table: "CompanyInfos");

            migrationBuilder.DropColumn(
                name: "GoodRef",
                table: "GoodDetails");

            migrationBuilder.RenameColumn(
                name: "DetailRef",
                table: "Goods",
                newName: "DetailID");

            migrationBuilder.RenameIndex(
                name: "IX_Goods_DetailRef",
                table: "Goods",
                newName: "IX_Goods_DetailID");

            migrationBuilder.AddColumn<int>(
                name: "CompanyInfoID",
                table: "Suppliers",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateIndex(
                name: "IX_Suppliers_CompanyInfoID",
                table: "Suppliers",
                column: "CompanyInfoID",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_GoodDetails_DetailID",
                table: "Goods",
                column: "DetailID",
                principalTable: "GoodDetails",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Suppliers_CompanyInfos_CompanyInfoID",
                table: "Suppliers",
                column: "CompanyInfoID",
                principalTable: "CompanyInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Goods_GoodDetails_DetailID",
                table: "Goods");

            migrationBuilder.DropForeignKey(
                name: "FK_Suppliers_CompanyInfos_CompanyInfoID",
                table: "Suppliers");

            migrationBuilder.DropIndex(
                name: "IX_Suppliers_CompanyInfoID",
                table: "Suppliers");

            migrationBuilder.DropColumn(
                name: "CompanyInfoID",
                table: "Suppliers");

            migrationBuilder.RenameColumn(
                name: "DetailID",
                table: "Goods",
                newName: "DetailRef");

            migrationBuilder.RenameIndex(
                name: "IX_Goods_DetailID",
                table: "Goods",
                newName: "IX_Goods_DetailRef");

            migrationBuilder.AddColumn<int>(
                name: "GoodRef",
                table: "GoodDetails",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateIndex(
                name: "IX_CompanyInfos_SupplierRef",
                table: "CompanyInfos",
                column: "SupplierRef",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_CompanyInfos_Suppliers_SupplierRef",
                table: "CompanyInfos",
                column: "SupplierRef",
                principalTable: "Suppliers",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_GoodDetails_DetailRef",
                table: "Goods",
                column: "DetailRef",
                principalTable: "GoodDetails",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
