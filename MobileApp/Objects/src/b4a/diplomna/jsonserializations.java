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
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator  _loginjson(anywheresoftware.b4a.BA _ba,String _username,String _password) throws Exception{
RDebugUtils.currentModule="jsonserializations";
if (Debug.shouldDelegate(null, "loginjson", false))
	 {return ((anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator) Debug.delegate(null, "loginjson", new Object[] {_ba,_username,_password}));}
anywheresoftware.b4a.objects.collections.Map _jsondata = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub LoginJson(username As String , password";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim JsonData As Map";
_jsondata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="JsonData.Initialize";
_jsondata.Initialize();
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="JsonData.Put(\"username\", username)";
_jsondata.Put((Object)("username"),(Object)(_username));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="JsonData.Put(\"password\", password)";
_jsondata.Put((Object)("password"),(Object)(_password));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="JSONGenerator.Initialize(JsonData)";
_jsongenerator.Initialize(_jsondata);
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("32883592",_jsongenerator.ToPrettyString((int) (0)),0);
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Return JSONGenerator";
if (true) return _jsongenerator;
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator  _customertojson(anywheresoftware.b4a.BA _ba,b4a.diplomna.types._customer _c) throws Exception{
RDebugUtils.currentModule="jsonserializations";
if (Debug.shouldDelegate(null, "customertojson", false))
	 {return ((anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator) Debug.delegate(null, "customertojson", new Object[] {_ba,_c}));}
anywheresoftware.b4a.objects.collections.Map _jsondata = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub CustomerToJSON(c As Customer)As JSONGen";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim JsonData As Map";
_jsondata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="JsonData.Initialize";
_jsondata.Initialize();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="JsonData.Put(\"id\",c.ID)";
_jsondata.Put((Object)("id"),(Object)(_c.ID));
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="JsonData.Put(\"username\", c.username)";
_jsondata.Put((Object)("username"),(Object)(_c.username));
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="JsonData.Put(\"password\",c.password )";
_jsondata.Put((Object)("password"),(Object)(_c.password));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="JsonData.Put(\"email\",c.email )";
_jsondata.Put((Object)("email"),(Object)(_c.email));
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="JsonData.Put(\"firstName\",c.FirstName )";
_jsondata.Put((Object)("firstName"),(Object)(_c.FirstName));
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="JsonData.Put(\"lastName\",c.LastName )";
_jsondata.Put((Object)("lastName"),(Object)(_c.LastName));
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="JsonData.Put(\"phone\",c.Phone )";
_jsondata.Put((Object)("phone"),(Object)(_c.Phone));
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="JsonData.Put(\"city\",c.City )";
_jsondata.Put((Object)("city"),(Object)(_c.City));
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="JsonData.Put(\"country\",c.Country )";
_jsondata.Put((Object)("country"),(Object)(_c.Country));
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="JsonData.Put(\"address\",c.Address )";
_jsondata.Put((Object)("address"),(Object)(_c.Address));
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="JSONGenerator.Initialize(JsonData)";
_jsongenerator.Initialize(_jsondata);
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("33014672",_jsongenerator.ToPrettyString((int) (0)),0);
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="Return JSONGenerator";
if (true) return _jsongenerator;
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator  _ordertojson(anywheresoftware.b4a.BA _ba,b4a.diplomna.types._order _o) throws Exception{
RDebugUtils.currentModule="jsonserializations";
if (Debug.shouldDelegate(null, "ordertojson", false))
	 {return ((anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator) Debug.delegate(null, "ordertojson", new Object[] {_ba,_o}));}
anywheresoftware.b4a.objects.collections.Map _jsondata = null;
anywheresoftware.b4a.objects.collections.List _jsonarray = null;
b4a.diplomna.types._orderedgoods _og = null;
anywheresoftware.b4a.objects.collections.Map _jsondata2 = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub OrderToJSON(o As Order) As JSONGenerato";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim JsonData As Map";
_jsondata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim JsonArray As List";
_jsonarray = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="JsonData.Initialize";
_jsondata.Initialize();
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="JsonArray.Initialize";
_jsonarray.Initialize();
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="JsonData.Put(\"id\",o.ID)";
_jsondata.Put((Object)("id"),(Object)(_o.ID));
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="JsonData.Put(\"orderCode\",o.OrderCode)";
_jsondata.Put((Object)("orderCode"),(Object)(_o.OrderCode));
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="JsonData.Put(\"customerID\",o.CutomerID)";
_jsondata.Put((Object)("customerID"),(Object)(_o.CutomerID));
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="JsonData.Put(\"orderTotalPrice\",o.OrderTotalPrice)";
_jsondata.Put((Object)("orderTotalPrice"),(Object)(_o.OrderTotalPrice));
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="JsonData.Put(\"orderStatus\",o.OrderStatus)";
_jsondata.Put((Object)("orderStatus"),(Object)(_o.OrderStatus));
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="For Each og As OrderedGoods In o.OrderedGoods";
{
final anywheresoftware.b4a.BA.IterableList group10 = _o.OrderedGoods;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_og = (b4a.diplomna.types._orderedgoods)(group10.Get(index10));
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="Dim JsonData2 As Map";
_jsondata2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="JsonData2.Initialize";
_jsondata2.Initialize();
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="JsonData2.Put(\"order\",Null)";
_jsondata2.Put((Object)("order"),anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="JsonData2.Put(\"orderID\",og.OrderID)";
_jsondata2.Put((Object)("orderID"),(Object)(_og.OrderID));
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="JsonData2.Put(\"goodID\",og.GoodID)";
_jsondata2.Put((Object)("goodID"),(Object)(_og.GoodID));
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="JsonData2.Put(\"qtty\",og.Qtty)";
_jsondata2.Put((Object)("qtty"),(Object)(_og.Qtty));
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="JsonArray.Add(JsonData2)";
_jsonarray.Add((Object)(_jsondata2.getObject()));
 }
};
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="JsonData.Put(\"orderedGoods\",JsonArray)";
_jsondata.Put((Object)("orderedGoods"),(Object)(_jsonarray.getObject()));
RDebugUtils.currentLine=2949142;
 //BA.debugLineNum = 2949142;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2949143;
 //BA.debugLineNum = 2949143;BA.debugLine="JSONGenerator.Initialize(JsonData)";
_jsongenerator.Initialize(_jsondata);
RDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
anywheresoftware.b4a.keywords.Common.LogImpl("32949144",_jsongenerator.ToPrettyString((int) (0)),0);
RDebugUtils.currentLine=2949145;
 //BA.debugLineNum = 2949145;BA.debugLine="Return JSONGenerator";
if (true) return _jsongenerator;
RDebugUtils.currentLine=2949146;
 //BA.debugLineNum = 2949146;BA.debugLine="End Sub";
return null;
}
public static b4a.diplomna.types._good  _serializegood(anywheresoftware.b4a.BA _ba,String _jstring) throws Exception{
RDebugUtils.currentModule="jsonserializations";
if (Debug.shouldDelegate(null, "serializegood", false))
	 {return ((b4a.diplomna.types._good) Debug.delegate(null, "serializegood", new Object[] {_ba,_jstring}));}
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
b4a.diplomna.types._good _good = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub SerializeGood(jstring As String) As Goo";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim good As Good";
_good = new b4a.diplomna.types._good();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="good.Initialize";
_good.Initialize();
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="JSON.Initialize(jstring)";
_json.Initialize(_jstring);
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Map1 = JSON.NextObject";
_map1 = _json.NextObject();
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="good.ID = Map1.Get(\"id\")";
_good.ID = (int)(BA.ObjectToNumber(_map1.Get((Object)("id"))));
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="good.PLU = Map1.Get(\"plu\")";
_good.PLU = (int)(BA.ObjectToNumber(_map1.Get((Object)("plu"))));
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="good.Name = Map1.Get(\"name\")";
_good.Name = BA.ObjectToString(_map1.Get((Object)("name")));
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="good.Price = Map1.Get(\"price\")";
_good.Price = (double)(BA.ObjectToNumber(_map1.Get((Object)("price"))));
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="good.Description = Map1.Get(\"description\")";
_good.Description = BA.ObjectToString(_map1.Get((Object)("description")));
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="good.Is_Discontinued = Map1.Get(\"is_Discontinued\"";
_good.Is_Discontinued = (int)(BA.ObjectToNumber(_map1.Get((Object)("is_Discontinued"))));
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="good.SupplierID = Map1.Get(\"supplierID\")";
_good.SupplierID = (int)(BA.ObjectToNumber(_map1.Get((Object)("supplierID"))));
RDebugUtils.currentLine=2752530;
 //BA.debugLineNum = 2752530;BA.debugLine="Return good";
if (true) return _good;
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="End Sub";
return null;
}
public static b4a.diplomna.types._supplier  _serializesupplier(anywheresoftware.b4a.BA _ba,String _jstring) throws Exception{
RDebugUtils.currentModule="jsonserializations";
if (Debug.shouldDelegate(null, "serializesupplier", false))
	 {return ((b4a.diplomna.types._supplier) Debug.delegate(null, "serializesupplier", new Object[] {_ba,_jstring}));}
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
b4a.diplomna.types._supplier _supplier = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub SerializeSupplier(jstring As String) As";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Dim supplier As Supplier";
_supplier = new b4a.diplomna.types._supplier();
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="supplier.Initialize";
_supplier.Initialize();
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="JSON.Initialize(jstring)";
_json.Initialize(_jstring);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="Map1 = JSON.NextObject";
_map1 = _json.NextObject();
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="supplier.ID =  Map1.Get(\"id\")";
_supplier.ID = (int)(BA.ObjectToNumber(_map1.Get((Object)("id"))));
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="supplier.SupplierName =  Map1.Get(\"supplierName\")";
_supplier.SupplierName = BA.ObjectToString(_map1.Get((Object)("supplierName")));
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="supplier.SupploerPhone =  Map1.Get(\"supplierPhone";
_supplier.SupploerPhone = BA.ObjectToString(_map1.Get((Object)("supplierPhone")));
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="Return supplier";
if (true) return _supplier;
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="End Sub";
return null;
}
}