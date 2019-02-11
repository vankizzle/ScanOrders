package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class jsonserializations {
private static jsonserializations mostCurrent = new jsonserializations();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator  _customertojson(anywheresoftware.b4a.BA _ba,b4a.diplomna.types._customer _c) throws Exception{
anywheresoftware.b4a.objects.collections.Map _jsondata = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
 //BA.debugLineNum = 88;BA.debugLine="Public Sub CustomerToJSON(c As Customer)As JSONGen";
 //BA.debugLineNum = 89;BA.debugLine="Dim JsonData As Map";
_jsondata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 90;BA.debugLine="JsonData.Initialize";
_jsondata.Initialize();
 //BA.debugLineNum = 91;BA.debugLine="JsonData.Put(\"id\",c.ID)";
_jsondata.Put((Object)("id"),(Object)(_c.ID));
 //BA.debugLineNum = 92;BA.debugLine="JsonData.Put(\"username\", c.username)";
_jsondata.Put((Object)("username"),(Object)(_c.username));
 //BA.debugLineNum = 93;BA.debugLine="JsonData.Put(\"password\",c.password )";
_jsondata.Put((Object)("password"),(Object)(_c.password));
 //BA.debugLineNum = 94;BA.debugLine="JsonData.Put(\"email\",c.email )";
_jsondata.Put((Object)("email"),(Object)(_c.email));
 //BA.debugLineNum = 95;BA.debugLine="JsonData.Put(\"firstName\",c.FirstName )";
_jsondata.Put((Object)("firstName"),(Object)(_c.FirstName));
 //BA.debugLineNum = 96;BA.debugLine="JsonData.Put(\"lastName\",c.LastName )";
_jsondata.Put((Object)("lastName"),(Object)(_c.LastName));
 //BA.debugLineNum = 97;BA.debugLine="JsonData.Put(\"phone\",c.Phone )";
_jsondata.Put((Object)("phone"),(Object)(_c.Phone));
 //BA.debugLineNum = 98;BA.debugLine="JsonData.Put(\"city\",c.City )";
_jsondata.Put((Object)("city"),(Object)(_c.City));
 //BA.debugLineNum = 99;BA.debugLine="JsonData.Put(\"country\",c.Country )";
_jsondata.Put((Object)("country"),(Object)(_c.Country));
 //BA.debugLineNum = 100;BA.debugLine="JsonData.Put(\"address\",c.Address )";
_jsondata.Put((Object)("address"),(Object)(_c.Address));
 //BA.debugLineNum = 102;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 103;BA.debugLine="JSONGenerator.Initialize(JsonData)";
_jsongenerator.Initialize(_jsondata);
 //BA.debugLineNum = 104;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("52949136",_jsongenerator.ToPrettyString((int) (0)),0);
 //BA.debugLineNum = 105;BA.debugLine="Return JSONGenerator";
if (true) return _jsongenerator;
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator  _loginjson(anywheresoftware.b4a.BA _ba,String _username,String _password) throws Exception{
anywheresoftware.b4a.objects.collections.Map _jsondata = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
 //BA.debugLineNum = 48;BA.debugLine="Public Sub LoginJson(username As String , password";
 //BA.debugLineNum = 49;BA.debugLine="Dim JsonData As Map";
_jsondata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 50;BA.debugLine="JsonData.Initialize";
_jsondata.Initialize();
 //BA.debugLineNum = 51;BA.debugLine="JsonData.Put(\"username\", username)";
_jsondata.Put((Object)("username"),(Object)(_username));
 //BA.debugLineNum = 52;BA.debugLine="JsonData.Put(\"password\", password)";
_jsondata.Put((Object)("password"),(Object)(_password));
 //BA.debugLineNum = 54;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 55;BA.debugLine="JSONGenerator.Initialize(JsonData)";
_jsongenerator.Initialize(_jsondata);
 //BA.debugLineNum = 56;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("52818056",_jsongenerator.ToPrettyString((int) (0)),0);
 //BA.debugLineNum = 57;BA.debugLine="Return JSONGenerator";
if (true) return _jsongenerator;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator  _ordertojson(anywheresoftware.b4a.BA _ba,b4a.diplomna.types._order _o) throws Exception{
anywheresoftware.b4a.objects.collections.Map _jsondata = null;
anywheresoftware.b4a.objects.collections.List _jsonarray = null;
b4a.diplomna.types._orderedgoods _og = null;
anywheresoftware.b4a.objects.collections.Map _jsondata2 = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
 //BA.debugLineNum = 60;BA.debugLine="Public Sub OrderToJSON(o As Order) As JSONGenerato";
 //BA.debugLineNum = 61;BA.debugLine="Dim JsonData As Map";
_jsondata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 62;BA.debugLine="Dim JsonArray As List";
_jsonarray = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 63;BA.debugLine="JsonData.Initialize";
_jsondata.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="JsonArray.Initialize";
_jsonarray.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="JsonData.Put(\"id\",o.ID)";
_jsondata.Put((Object)("id"),(Object)(_o.ID));
 //BA.debugLineNum = 67;BA.debugLine="JsonData.Put(\"orderCode\",o.OrderCode)";
_jsondata.Put((Object)("orderCode"),(Object)(_o.OrderCode));
 //BA.debugLineNum = 68;BA.debugLine="JsonData.Put(\"customerID\",o.CutomerID)";
_jsondata.Put((Object)("customerID"),(Object)(_o.CutomerID));
 //BA.debugLineNum = 69;BA.debugLine="JsonData.Put(\"orderTotalPrice\",o.OrderTotalPrice)";
_jsondata.Put((Object)("orderTotalPrice"),(Object)(_o.OrderTotalPrice));
 //BA.debugLineNum = 70;BA.debugLine="JsonData.Put(\"orderStatus\",o.OrderStatus)";
_jsondata.Put((Object)("orderStatus"),(Object)(_o.OrderStatus));
 //BA.debugLineNum = 71;BA.debugLine="For Each og As OrderedGoods In o.OrderedGoods";
{
final anywheresoftware.b4a.BA.IterableList group10 = _o.OrderedGoods;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_og = (b4a.diplomna.types._orderedgoods)(group10.Get(index10));
 //BA.debugLineNum = 72;BA.debugLine="Dim JsonData2 As Map";
_jsondata2 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 73;BA.debugLine="JsonData2.Initialize";
_jsondata2.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="JsonData2.Put(\"order\",Null)";
_jsondata2.Put((Object)("order"),anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 75;BA.debugLine="JsonData2.Put(\"orderID\",og.OrderID)";
_jsondata2.Put((Object)("orderID"),(Object)(_og.OrderID));
 //BA.debugLineNum = 76;BA.debugLine="JsonData2.Put(\"goodID\",og.GoodID)";
_jsondata2.Put((Object)("goodID"),(Object)(_og.GoodID));
 //BA.debugLineNum = 77;BA.debugLine="JsonData2.Put(\"qtty\",og.Qtty)";
_jsondata2.Put((Object)("qtty"),(Object)(_og.Qtty));
 //BA.debugLineNum = 78;BA.debugLine="JsonArray.Add(JsonData2)";
_jsonarray.Add((Object)(_jsondata2.getObject()));
 }
};
 //BA.debugLineNum = 80;BA.debugLine="JsonData.Put(\"orderedGoods\",JsonArray)";
_jsondata.Put((Object)("orderedGoods"),(Object)(_jsonarray.getObject()));
 //BA.debugLineNum = 82;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 83;BA.debugLine="JSONGenerator.Initialize(JsonData)";
_jsongenerator.Initialize(_jsondata);
 //BA.debugLineNum = 84;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("52883608",_jsongenerator.ToPrettyString((int) (0)),0);
 //BA.debugLineNum = 85;BA.debugLine="Return JSONGenerator";
if (true) return _jsongenerator;
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static b4a.diplomna.types._good  _serializegood(anywheresoftware.b4a.BA _ba,String _jstring) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
b4a.diplomna.types._good _good = null;
 //BA.debugLineNum = 10;BA.debugLine="Public Sub SerializeGood(jstring As String) As Goo";
 //BA.debugLineNum = 11;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 12;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Dim good As Good";
_good = new b4a.diplomna.types._good();
 //BA.debugLineNum = 14;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="good.Initialize";
_good.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="JSON.Initialize(jstring)";
_json.Initialize(_jstring);
 //BA.debugLineNum = 18;BA.debugLine="Map1 = JSON.NextObject";
_map1 = _json.NextObject();
 //BA.debugLineNum = 20;BA.debugLine="good.ID = Map1.Get(\"id\")";
_good.ID = (int)(BA.ObjectToNumber(_map1.Get((Object)("id"))));
 //BA.debugLineNum = 21;BA.debugLine="good.PLU = Map1.Get(\"plu\")";
_good.PLU = (int)(BA.ObjectToNumber(_map1.Get((Object)("plu"))));
 //BA.debugLineNum = 22;BA.debugLine="good.Name = Map1.Get(\"name\")";
_good.Name = BA.ObjectToString(_map1.Get((Object)("name")));
 //BA.debugLineNum = 23;BA.debugLine="good.Price = Map1.Get(\"price\")";
_good.Price = (double)(BA.ObjectToNumber(_map1.Get((Object)("price"))));
 //BA.debugLineNum = 24;BA.debugLine="good.Description = Map1.Get(\"description\")";
_good.Description = BA.ObjectToString(_map1.Get((Object)("description")));
 //BA.debugLineNum = 25;BA.debugLine="good.Is_Discontinued = Map1.Get(\"is_Discontinued\"";
_good.Is_Discontinued = (int)(BA.ObjectToNumber(_map1.Get((Object)("is_Discontinued"))));
 //BA.debugLineNum = 26;BA.debugLine="good.SupplierID = Map1.Get(\"supplierID\")";
_good.SupplierID = (int)(BA.ObjectToNumber(_map1.Get((Object)("supplierID"))));
 //BA.debugLineNum = 28;BA.debugLine="Return good";
if (true) return _good;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public static b4a.diplomna.types._supplier  _serializesupplier(anywheresoftware.b4a.BA _ba,String _jstring) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
b4a.diplomna.types._supplier _supplier = null;
 //BA.debugLineNum = 31;BA.debugLine="Public Sub SerializeSupplier(jstring As String) As";
 //BA.debugLineNum = 32;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 33;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 34;BA.debugLine="Dim supplier As Supplier";
_supplier = new b4a.diplomna.types._supplier();
 //BA.debugLineNum = 35;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="supplier.Initialize";
_supplier.Initialize();
 //BA.debugLineNum = 38;BA.debugLine="JSON.Initialize(jstring)";
_json.Initialize(_jstring);
 //BA.debugLineNum = 39;BA.debugLine="Map1 = JSON.NextObject";
_map1 = _json.NextObject();
 //BA.debugLineNum = 41;BA.debugLine="supplier.ID =  Map1.Get(\"id\")";
_supplier.ID = (int)(BA.ObjectToNumber(_map1.Get((Object)("id"))));
 //BA.debugLineNum = 42;BA.debugLine="supplier.SupplierName =  Map1.Get(\"supplierName\")";
_supplier.SupplierName = BA.ObjectToString(_map1.Get((Object)("supplierName")));
 //BA.debugLineNum = 43;BA.debugLine="supplier.SupploerPhone =  Map1.Get(\"supplierPhone";
_supplier.SupploerPhone = BA.ObjectToString(_map1.Get((Object)("supplierPhone")));
 //BA.debugLineNum = 45;BA.debugLine="Return supplier";
if (true) return _supplier;
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
}
