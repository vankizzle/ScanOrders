package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class types {
private static types mostCurrent = new types();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static class _order{
public boolean IsInitialized;
public int ID;
public String OrderCode;
public double OrderTotalPrice;
public anywheresoftware.b4a.objects.collections.List OrderedGoods;
public int CutomerID;
public String OrderStatus;
public void Initialize() {
IsInitialized = true;
ID = 0;
OrderCode = "";
OrderTotalPrice = 0;
OrderedGoods = new anywheresoftware.b4a.objects.collections.List();
CutomerID = 0;
OrderStatus = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _orderedgood{
public boolean IsInitialized;
public b4a.diplomna.types._order Order;
public int OrderID;
public int GoodID;
public int Qtty;
public void Initialize() {
IsInitialized = true;
Order = new b4a.diplomna.types._order();
OrderID = 0;
GoodID = 0;
Qtty = 0;
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
public int SupplierID;
public int PLU;
public String Name;
public double Price;
public String Description;
public int Is_Discontinued;
public void Initialize() {
IsInitialized = true;
ID = 0;
Qtty = 0;
SupplierID = 0;
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
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Type Order(ID As Int,OrderCode As String,OrderTot";
;
 //BA.debugLineNum = 9;BA.debugLine="Type OrderedGood(Order As Order,OrderID As Int,Go";
;
 //BA.debugLineNum = 11;BA.debugLine="Type Customer (ID As Int,username As String,passw";
;
 //BA.debugLineNum = 14;BA.debugLine="Type Supplier (ID As Int,SupplierName As String,S";
;
 //BA.debugLineNum = 16;BA.debugLine="Type Good (ID As Int , Qtty As Int , SupplierID A";
;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
}
