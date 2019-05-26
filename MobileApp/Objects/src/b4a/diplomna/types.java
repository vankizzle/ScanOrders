package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class types {
private static types mostCurrent = new types();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
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
public static class _orderedgoods{
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
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
}