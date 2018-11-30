using Microsoft.EntityFrameworkCore.Migrations;

namespace RestApi.Migrations
{
    public partial class addednewtables : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_CompanyInfo_Supplier_SupplierRef",
                table: "CompanyInfo");

            migrationBuilder.DropForeignKey(
                name: "FK_CompanyInfo_UserInfo_UserInfoRef",
                table: "CompanyInfo");

            migrationBuilder.DropForeignKey(
                name: "FK_GoodDetail_Goods_GoodRef",
                table: "GoodDetail");

            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Supplier_SupplierID",
                table: "Goods");

            migrationBuilder.DropForeignKey(
                name: "FK_Orders_User_UserRef",
                table: "Orders");

            migrationBuilder.DropForeignKey(
                name: "FK_UserInfo_User_UserRef",
                table: "UserInfo");

            migrationBuilder.DropPrimaryKey(
                name: "PK_UserInfo",
                table: "UserInfo");

            migrationBuilder.DropPrimaryKey(
                name: "PK_User",
                table: "User");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Supplier",
                table: "Supplier");

            migrationBuilder.DropPrimaryKey(
                name: "PK_GoodDetail",
                table: "GoodDetail");

            migrationBuilder.DropPrimaryKey(
                name: "PK_CompanyInfo",
                table: "CompanyInfo");

            migrationBuilder.RenameTable(
                name: "UserInfo",
                newName: "UserInfos");

            migrationBuilder.RenameTable(
                name: "User",
                newName: "Users");

            migrationBuilder.RenameTable(
                name: "Supplier",
                newName: "Suppliers");

            migrationBuilder.RenameTable(
                name: "GoodDetail",
                newName: "GoodDetails");

            migrationBuilder.RenameTable(
                name: "CompanyInfo",
                newName: "CompanyInfos");

            migrationBuilder.RenameIndex(
                name: "IX_UserInfo_UserRef",
                table: "UserInfos",
                newName: "IX_UserInfos_UserRef");

            migrationBuilder.RenameIndex(
                name: "IX_GoodDetail_GoodRef",
                table: "GoodDetails",
                newName: "IX_GoodDetails_GoodRef");

            migrationBuilder.RenameIndex(
                name: "IX_CompanyInfo_UserInfoRef",
                table: "CompanyInfos",
                newName: "IX_CompanyInfos_UserInfoRef");

            migrationBuilder.RenameIndex(
                name: "IX_CompanyInfo_SupplierRef",
                table: "CompanyInfos",
                newName: "IX_CompanyInfos_SupplierRef");

            migrationBuilder.AddPrimaryKey(
                name: "PK_UserInfos",
                table: "UserInfos",
                column: "ID");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Users",
                table: "Users",
                column: "ID");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Suppliers",
                table: "Suppliers",
                column: "ID");

            migrationBuilder.AddPrimaryKey(
                name: "PK_GoodDetails",
                table: "GoodDetails",
                column: "ID");

            migrationBuilder.AddPrimaryKey(
                name: "PK_CompanyInfos",
                table: "CompanyInfos",
                column: "ID");

            migrationBuilder.AddForeignKey(
                name: "FK_CompanyInfos_Suppliers_SupplierRef",
                table: "CompanyInfos",
                column: "SupplierRef",
                principalTable: "Suppliers",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_CompanyInfos_UserInfos_UserInfoRef",
                table: "CompanyInfos",
                column: "UserInfoRef",
                principalTable: "UserInfos",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_GoodDetails_Goods_GoodRef",
                table: "GoodDetails",
                column: "GoodRef",
                principalTable: "Goods",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods",
                column: "SupplierID",
                principalTable: "Suppliers",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Orders_Users_UserRef",
                table: "Orders",
                column: "UserRef",
                principalTable: "Users",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_UserInfos_Users_UserRef",
                table: "UserInfos",
                column: "UserRef",
                principalTable: "Users",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_CompanyInfos_Suppliers_SupplierRef",
                table: "CompanyInfos");

            migrationBuilder.DropForeignKey(
                name: "FK_CompanyInfos_UserInfos_UserInfoRef",
                table: "CompanyInfos");

            migrationBuilder.DropForeignKey(
                name: "FK_GoodDetails_Goods_GoodRef",
                table: "GoodDetails");

            migrationBuilder.DropForeignKey(
                name: "FK_Goods_Suppliers_SupplierID",
                table: "Goods");

            migrationBuilder.DropForeignKey(
                name: "FK_Orders_Users_UserRef",
                table: "Orders");

            migrationBuilder.DropForeignKey(
                name: "FK_UserInfos_Users_UserRef",
                table: "UserInfos");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Users",
                table: "Users");

            migrationBuilder.DropPrimaryKey(
                name: "PK_UserInfos",
                table: "UserInfos");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Suppliers",
                table: "Suppliers");

            migrationBuilder.DropPrimaryKey(
                name: "PK_GoodDetails",
                table: "GoodDetails");

            migrationBuilder.DropPrimaryKey(
                name: "PK_CompanyInfos",
                table: "CompanyInfos");

            migrationBuilder.RenameTable(
                name: "Users",
                newName: "User");

            migrationBuilder.RenameTable(
                name: "UserInfos",
                newName: "UserInfo");

            migrationBuilder.RenameTable(
                name: "Suppliers",
                newName: "Supplier");

            migrationBuilder.RenameTable(
                name: "GoodDetails",
                newName: "GoodDetail");

            migrationBuilder.RenameTable(
                name: "CompanyInfos",
                newName: "CompanyInfo");

            migrationBuilder.RenameIndex(
                name: "IX_UserInfos_UserRef",
                table: "UserInfo",
                newName: "IX_UserInfo_UserRef");

            migrationBuilder.RenameIndex(
                name: "IX_GoodDetails_GoodRef",
                table: "GoodDetail",
                newName: "IX_GoodDetail_GoodRef");

            migrationBuilder.RenameIndex(
                name: "IX_CompanyInfos_UserInfoRef",
                table: "CompanyInfo",
                newName: "IX_CompanyInfo_UserInfoRef");

            migrationBuilder.RenameIndex(
                name: "IX_CompanyInfos_SupplierRef",
                table: "CompanyInfo",
                newName: "IX_CompanyInfo_SupplierRef");

            migrationBuilder.AddPrimaryKey(
                name: "PK_User",
                table: "User",
                column: "ID");

            migrationBuilder.AddPrimaryKey(
                name: "PK_UserInfo",
                table: "UserInfo",
                column: "ID");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Supplier",
                table: "Supplier",
                column: "ID");

            migrationBuilder.AddPrimaryKey(
                name: "PK_GoodDetail",
                table: "GoodDetail",
                column: "ID");

            migrationBuilder.AddPrimaryKey(
                name: "PK_CompanyInfo",
                table: "CompanyInfo",
                column: "ID");

            migrationBuilder.AddForeignKey(
                name: "FK_CompanyInfo_Supplier_SupplierRef",
                table: "CompanyInfo",
                column: "SupplierRef",
                principalTable: "Supplier",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_CompanyInfo_UserInfo_UserInfoRef",
                table: "CompanyInfo",
                column: "UserInfoRef",
                principalTable: "UserInfo",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_GoodDetail_Goods_GoodRef",
                table: "GoodDetail",
                column: "GoodRef",
                principalTable: "Goods",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Goods_Supplier_SupplierID",
                table: "Goods",
                column: "SupplierID",
                principalTable: "Supplier",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Orders_User_UserRef",
                table: "Orders",
                column: "UserRef",
                principalTable: "User",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_UserInfo_User_UserRef",
                table: "UserInfo",
                column: "UserRef",
                principalTable: "User",
                principalColumn: "ID",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
