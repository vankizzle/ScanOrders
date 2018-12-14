package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class types {
private static types mostCurrent = new types();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.support _support = null;
public static class _order{
public boolean IsInitialized;
public int ID;
public String OrderCode;
public double OrderTotalPrice;
public anywheresoftware.b4a.objects.collections.List Goods;
public void Initialize() {
IsInitialized = true;
ID = 0;
OrderCode = "";
OrderTotalPrice = 0;
Goods = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _customer{
public boolean IsInitialized;
public int ID;
public String username;
public String password;
public String email;
public String FirstName;
public String LastName;
public String Phone;
public String City;
public String Country;
public String Address;
public anywheresoftware.b4a.objects.collections.List Orders;
public void Initialize() {
IsInitialized = true;
ID = 0;
username = "";
password = "";
email = "";
FirstName = "";
LastName = "";
Phone = "";
City = "";
Country = "";
Address = "";
Orders = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _gooddetail{
public boolean IsInitialized;
public int ID;
public int PLU;
public String Name;
public double Price;
public String Description;
public int Is_Discontinued;
public void Initialize() {
IsInitialized = true;
ID = 0;
PLU = 0;
Name = "";
Price = 0;
Description = "";
Is_Discontinued = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _supplier{
public boolean IsInitialized;
public int ID;
public String SupplierName;
public String SupploerPhone;
public void Initialize() {
IsInitialized = true;
ID = 0;
SupplierName = "";
SupploerPhone = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _good{
public boolean IsInitialized;
public int ID;
public int Qtty;
public b4a.example.types._gooddetail Detail;
public b4a.example.types._supplier Supplier;
public void Initialize() {
IsInitialized = true;
ID = 0;
Qtty = 0;
Detail = new b4a.example.types._gooddetail();
Supplier = new b4a.example.types._supplier();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Type Order(ID As Int,OrderCode As String,OrderTot";
;
 //BA.debugLineNum = 6;BA.debugLine="Type Customer (ID As Int,username As String,passw";
;
 //BA.debugLineNum = 9;BA.debugLine="Type GoodDetail(ID As Int,PLU As Int,Name As Stri";
;
 //BA.debugLineNum = 10;BA.debugLine="Type Supplier (ID As Int,SupplierName as String,S";
;
 //BA.debugLineNum = 11;BA.debugLine="Type Good (ID As Int , Qtty As Int , Detail As Go";
;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
}
