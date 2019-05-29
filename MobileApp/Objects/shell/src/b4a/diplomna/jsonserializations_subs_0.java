package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jsonserializations_subs_0 {


public static RemoteObject  _customerid(RemoteObject _ba,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("CustomerID (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,82);
if (RapidSub.canDelegate("customerid")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","customerid", _ba, _id);}
RemoteObject _jsondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
;
Debug.locals.put("ID", _id);
 BA.debugLineNum = 82;BA.debugLine="Public Sub CustomerID(ID As Int) As JSONGenerator";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Dim JsonData As Map";
Debug.ShouldStop(262144);
_jsondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("JsonData", _jsondata);
 BA.debugLineNum = 84;BA.debugLine="JsonData.Initialize";
Debug.ShouldStop(524288);
_jsondata.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="JsonData.Put(\"id\", ID)";
Debug.ShouldStop(1048576);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_id)));
 BA.debugLineNum = 87;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(4194304);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 88;BA.debugLine="JSONGenerator.Initialize(JsonData)";
Debug.ShouldStop(8388608);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_jsondata));
 BA.debugLineNum = 89;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
Debug.ShouldStop(16777216);
jsonserializations.mostCurrent.__c.runVoidMethod ("LogImpl","33014663",_jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 0))),0);
 BA.debugLineNum = 90;BA.debugLine="Return JSONGenerator";
Debug.ShouldStop(33554432);
if (true) return _jsongenerator;
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _customertojson(RemoteObject _ba,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("CustomerToJSON (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,121);
if (RapidSub.canDelegate("customertojson")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","customertojson", _ba, _c);}
RemoteObject _jsondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
;
Debug.locals.put("c", _c);
 BA.debugLineNum = 121;BA.debugLine="Public Sub CustomerToJSON(c As Customer)As JSONGen";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Dim JsonData As Map";
Debug.ShouldStop(33554432);
_jsondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("JsonData", _jsondata);
 BA.debugLineNum = 123;BA.debugLine="JsonData.Initialize";
Debug.ShouldStop(67108864);
_jsondata.runVoidMethod ("Initialize");
 BA.debugLineNum = 124;BA.debugLine="JsonData.Put(\"id\",c.ID)";
Debug.ShouldStop(134217728);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_c.getField(true,"ID"))));
 BA.debugLineNum = 125;BA.debugLine="JsonData.Put(\"username\", c.username)";
Debug.ShouldStop(268435456);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_c.getField(true,"username"))));
 BA.debugLineNum = 126;BA.debugLine="JsonData.Put(\"password\",c.password )";
Debug.ShouldStop(536870912);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("password"))),(Object)((_c.getField(true,"password"))));
 BA.debugLineNum = 127;BA.debugLine="JsonData.Put(\"email\",c.email )";
Debug.ShouldStop(1073741824);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("email"))),(Object)((_c.getField(true,"email"))));
 BA.debugLineNum = 128;BA.debugLine="JsonData.Put(\"firstName\",c.FirstName )";
Debug.ShouldStop(-2147483648);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("firstName"))),(Object)((_c.getField(true,"FirstName"))));
 BA.debugLineNum = 129;BA.debugLine="JsonData.Put(\"lastName\",c.LastName )";
Debug.ShouldStop(1);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lastName"))),(Object)((_c.getField(true,"LastName"))));
 BA.debugLineNum = 130;BA.debugLine="JsonData.Put(\"phone\",c.Phone )";
Debug.ShouldStop(2);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("phone"))),(Object)((_c.getField(true,"Phone"))));
 BA.debugLineNum = 131;BA.debugLine="JsonData.Put(\"city\",c.City )";
Debug.ShouldStop(4);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("city"))),(Object)((_c.getField(true,"City"))));
 BA.debugLineNum = 132;BA.debugLine="JsonData.Put(\"country\",c.Country )";
Debug.ShouldStop(8);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("country"))),(Object)((_c.getField(true,"Country"))));
 BA.debugLineNum = 133;BA.debugLine="JsonData.Put(\"address\",c.Address )";
Debug.ShouldStop(16);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("address"))),(Object)((_c.getField(true,"Address"))));
 BA.debugLineNum = 135;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(64);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 136;BA.debugLine="JSONGenerator.Initialize(JsonData)";
Debug.ShouldStop(128);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_jsondata));
 BA.debugLineNum = 137;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
Debug.ShouldStop(256);
jsonserializations.mostCurrent.__c.runVoidMethod ("LogImpl","33145744",_jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 0))),0);
 BA.debugLineNum = 138;BA.debugLine="Return JSONGenerator";
Debug.ShouldStop(512);
if (true) return _jsongenerator;
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loginjson(RemoteObject _ba,RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("LoginJson (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,70);
if (RapidSub.canDelegate("loginjson")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","loginjson", _ba, _username, _password);}
RemoteObject _jsondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
;
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 70;BA.debugLine="Public Sub LoginJson(username As String , password";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim JsonData As Map";
Debug.ShouldStop(64);
_jsondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("JsonData", _jsondata);
 BA.debugLineNum = 72;BA.debugLine="JsonData.Initialize";
Debug.ShouldStop(128);
_jsondata.runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="JsonData.Put(\"username\", username)";
Debug.ShouldStop(256);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_username)));
 BA.debugLineNum = 74;BA.debugLine="JsonData.Put(\"password\", password)";
Debug.ShouldStop(512);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("password"))),(Object)((_password)));
 BA.debugLineNum = 76;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(2048);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 77;BA.debugLine="JSONGenerator.Initialize(JsonData)";
Debug.ShouldStop(4096);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_jsondata));
 BA.debugLineNum = 78;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
Debug.ShouldStop(8192);
jsonserializations.mostCurrent.__c.runVoidMethod ("LogImpl","32949128",_jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 0))),0);
 BA.debugLineNum = 79;BA.debugLine="Return JSONGenerator";
Debug.ShouldStop(16384);
if (true) return _jsongenerator;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ordertojson(RemoteObject _ba,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("OrderToJSON (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,93);
if (RapidSub.canDelegate("ordertojson")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","ordertojson", _ba, _o);}
RemoteObject _jsondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsonarray = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _og = RemoteObject.declareNull("b4a.diplomna.types._orderedgood");
RemoteObject _jsondata2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
;
Debug.locals.put("o", _o);
 BA.debugLineNum = 93;BA.debugLine="Public Sub OrderToJSON(o As Order) As JSONGenerato";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Dim JsonData As Map";
Debug.ShouldStop(536870912);
_jsondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("JsonData", _jsondata);
 BA.debugLineNum = 95;BA.debugLine="Dim JsonArray As List";
Debug.ShouldStop(1073741824);
_jsonarray = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("JsonArray", _jsonarray);
 BA.debugLineNum = 96;BA.debugLine="JsonData.Initialize";
Debug.ShouldStop(-2147483648);
_jsondata.runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="JsonArray.Initialize";
Debug.ShouldStop(1);
_jsonarray.runVoidMethod ("Initialize");
 BA.debugLineNum = 99;BA.debugLine="JsonData.Put(\"id\",o.ID)";
Debug.ShouldStop(4);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_o.getField(true,"ID"))));
 BA.debugLineNum = 100;BA.debugLine="JsonData.Put(\"orderCode\",o.OrderCode)";
Debug.ShouldStop(8);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderCode"))),(Object)((_o.getField(true,"OrderCode"))));
 BA.debugLineNum = 101;BA.debugLine="JsonData.Put(\"customerID\",o.CutomerID)";
Debug.ShouldStop(16);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customerID"))),(Object)((_o.getField(true,"CutomerID"))));
 BA.debugLineNum = 102;BA.debugLine="JsonData.Put(\"orderTotalPrice\",o.OrderTotalPrice)";
Debug.ShouldStop(32);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderTotalPrice"))),(Object)((_o.getField(true,"OrderTotalPrice"))));
 BA.debugLineNum = 103;BA.debugLine="JsonData.Put(\"orderStatus\",o.OrderStatus)";
Debug.ShouldStop(64);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderStatus"))),(Object)((_o.getField(true,"OrderStatus"))));
 BA.debugLineNum = 104;BA.debugLine="For Each og As OrderedGood In o.OrderedGoods";
Debug.ShouldStop(128);
{
final RemoteObject group10 = _o.getField(false,"OrderedGoods");
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_og = (group10.runMethod(false,"Get",index10));Debug.locals.put("og", _og);
Debug.locals.put("og", _og);
 BA.debugLineNum = 105;BA.debugLine="Dim JsonData2 As Map";
Debug.ShouldStop(256);
_jsondata2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("JsonData2", _jsondata2);
 BA.debugLineNum = 106;BA.debugLine="JsonData2.Initialize";
Debug.ShouldStop(512);
_jsondata2.runVoidMethod ("Initialize");
 BA.debugLineNum = 107;BA.debugLine="JsonData2.Put(\"order\",o)";
Debug.ShouldStop(1024);
_jsondata2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("order"))),(Object)((_o)));
 BA.debugLineNum = 108;BA.debugLine="JsonData2.Put(\"orderID\",og.OrderID)";
Debug.ShouldStop(2048);
_jsondata2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderID"))),(Object)((_og.getField(true,"OrderID"))));
 BA.debugLineNum = 109;BA.debugLine="JsonData2.Put(\"goodID\",og.GoodID)";
Debug.ShouldStop(4096);
_jsondata2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("goodID"))),(Object)((_og.getField(true,"GoodID"))));
 BA.debugLineNum = 110;BA.debugLine="JsonData2.Put(\"qtty\",og.Qtty)";
Debug.ShouldStop(8192);
_jsondata2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("qtty"))),(Object)((_og.getField(true,"Qtty"))));
 BA.debugLineNum = 111;BA.debugLine="JsonArray.Add(JsonData2)";
Debug.ShouldStop(16384);
_jsonarray.runVoidMethod ("Add",(Object)((_jsondata2.getObject())));
 }
}Debug.locals.put("og", _og);
;
 BA.debugLineNum = 113;BA.debugLine="JsonData.Put(\"orderedGoods\",JsonArray)";
Debug.ShouldStop(65536);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderedGoods"))),(Object)((_jsonarray.getObject())));
 BA.debugLineNum = 115;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(262144);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 116;BA.debugLine="JSONGenerator.Initialize(JsonData)";
Debug.ShouldStop(524288);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_jsondata));
 BA.debugLineNum = 117;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
Debug.ShouldStop(1048576);
jsonserializations.mostCurrent.__c.runVoidMethod ("LogImpl","33080216",_jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 0))),0);
 BA.debugLineNum = 118;BA.debugLine="Return JSONGenerator";
Debug.ShouldStop(2097152);
if (true) return _jsongenerator;
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _serializecustomerorders(RemoteObject _ba,RemoteObject _jstring) throws Exception{
try {
		Debug.PushSubsStack("SerializeCustomerOrders (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,142);
if (RapidSub.canDelegate("serializecustomerorders")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","serializecustomerorders", _ba, _jstring);}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _orders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ordersmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _ord = RemoteObject.declareNull("b4a.diplomna.types._order");
;
Debug.locals.put("jstring", _jstring);
 BA.debugLineNum = 142;BA.debugLine="Public Sub SerializeCustomerOrders(jstring As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Dim JSON As JSONParser";
Debug.ShouldStop(16384);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 144;BA.debugLine="Dim Map1 As Map";
Debug.ShouldStop(32768);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 145;BA.debugLine="Dim orders As List";
Debug.ShouldStop(65536);
_orders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("orders", _orders);
 BA.debugLineNum = 146;BA.debugLine="Dim OrdersMap As Map";
Debug.ShouldStop(131072);
_ordersmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("OrdersMap", _ordersmap);
 BA.debugLineNum = 148;BA.debugLine="Map1.Initialize";
Debug.ShouldStop(524288);
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 149;BA.debugLine="orders.Initialize";
Debug.ShouldStop(1048576);
_orders.runVoidMethod ("Initialize");
 BA.debugLineNum = 150;BA.debugLine="OrdersMap.Initialize";
Debug.ShouldStop(2097152);
_ordersmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 152;BA.debugLine="JSON.Initialize(jstring)";
Debug.ShouldStop(8388608);
_json.runVoidMethod ("Initialize",(Object)(_jstring));
 BA.debugLineNum = 153;BA.debugLine="Map1 = JSON.NextObject";
Debug.ShouldStop(16777216);
_map1 = _json.runMethod(false,"NextObject");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 155;BA.debugLine="orders = Map1.Get(\"orders\")";
Debug.ShouldStop(67108864);
_orders.setObject(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("orders")))));
 BA.debugLineNum = 157;BA.debugLine="For i = 0 To orders.Size - 1";
Debug.ShouldStop(268435456);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_orders.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 158;BA.debugLine="Dim ord As Order = orders.Get(i)";
Debug.ShouldStop(536870912);
_ord = (_orders.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ord", _ord);Debug.locals.put("ord", _ord);
 BA.debugLineNum = 159;BA.debugLine="OrdersMap.Put(ord.ID,ord)";
Debug.ShouldStop(1073741824);
_ordersmap.runVoidMethod ("Put",(Object)((_ord.getField(true,"ID"))),(Object)((_ord)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 162;BA.debugLine="Return OrdersMap";
Debug.ShouldStop(2);
if (true) return _ordersmap;
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _serializegood(RemoteObject _ba,RemoteObject _jstring) throws Exception{
try {
		Debug.PushSubsStack("SerializeGood (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,10);
if (RapidSub.canDelegate("serializegood")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","serializegood", _ba, _jstring);}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _good = RemoteObject.declareNull("b4a.diplomna.types._good");
;
Debug.locals.put("jstring", _jstring);
 BA.debugLineNum = 10;BA.debugLine="Public Sub SerializeGood(jstring As String) As Goo";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim JSON As JSONParser";
Debug.ShouldStop(1024);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 12;BA.debugLine="Dim Map1 As Map";
Debug.ShouldStop(2048);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 13;BA.debugLine="Dim good As Good";
Debug.ShouldStop(4096);
_good = RemoteObject.createNew ("b4a.diplomna.types._good");Debug.locals.put("good", _good);
 BA.debugLineNum = 14;BA.debugLine="Map1.Initialize";
Debug.ShouldStop(8192);
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="good.Initialize";
Debug.ShouldStop(16384);
_good.runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="JSON.Initialize(jstring)";
Debug.ShouldStop(65536);
_json.runVoidMethod ("Initialize",(Object)(_jstring));
 BA.debugLineNum = 18;BA.debugLine="Map1 = JSON.NextObject";
Debug.ShouldStop(131072);
_map1 = _json.runMethod(false,"NextObject");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 20;BA.debugLine="good.ID = Map1.Get(\"id\")";
Debug.ShouldStop(524288);
_good.setField ("ID",BA.numberCast(int.class, _map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 21;BA.debugLine="good.PLU = Map1.Get(\"plu\")";
Debug.ShouldStop(1048576);
_good.setField ("PLU",BA.numberCast(int.class, _map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("plu"))))));
 BA.debugLineNum = 22;BA.debugLine="good.Name = Map1.Get(\"name\")";
Debug.ShouldStop(2097152);
_good.setField ("Name",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 23;BA.debugLine="good.Price = Map1.Get(\"price\")";
Debug.ShouldStop(4194304);
_good.setField ("Price",BA.numberCast(double.class, _map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price"))))));
 BA.debugLineNum = 24;BA.debugLine="good.Description = Map1.Get(\"description\")";
Debug.ShouldStop(8388608);
_good.setField ("Description",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description"))))));
 BA.debugLineNum = 25;BA.debugLine="good.Is_Discontinued = Map1.Get(\"is_Discontinued\"";
Debug.ShouldStop(16777216);
_good.setField ("Is_Discontinued",BA.numberCast(int.class, _map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_Discontinued"))))));
 BA.debugLineNum = 26;BA.debugLine="good.SupplierID = Map1.Get(\"supplierID\")";
Debug.ShouldStop(33554432);
_good.setField ("SupplierID",BA.numberCast(int.class, _map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("supplierID"))))));
 BA.debugLineNum = 28;BA.debugLine="Return good";
Debug.ShouldStop(134217728);
if (true) return _good;
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _serializelogincustomer(RemoteObject _ba,RemoteObject _jstring) throws Exception{
try {
		Debug.PushSubsStack("SerializeLoginCustomer (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,48);
if (RapidSub.canDelegate("serializelogincustomer")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","serializelogincustomer", _ba, _jstring);}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _customer = RemoteObject.declareNull("b4a.diplomna.types._customer");
;
Debug.locals.put("jstring", _jstring);
 BA.debugLineNum = 48;BA.debugLine="Public Sub SerializeLoginCustomer(jstring As Strin";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim JSON As JSONParser";
Debug.ShouldStop(65536);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 50;BA.debugLine="Dim Map1 As Map";
Debug.ShouldStop(131072);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 51;BA.debugLine="Dim customer As Customer";
Debug.ShouldStop(262144);
_customer = RemoteObject.createNew ("b4a.diplomna.types._customer");Debug.locals.put("customer", _customer);
 BA.debugLineNum = 52;BA.debugLine="Map1.Initialize";
Debug.ShouldStop(524288);
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="customer.Initialize";
Debug.ShouldStop(1048576);
_customer.runVoidMethod ("Initialize");
 BA.debugLineNum = 55;BA.debugLine="JSON.Initialize(jstring)";
Debug.ShouldStop(4194304);
_json.runVoidMethod ("Initialize",(Object)(_jstring));
 BA.debugLineNum = 56;BA.debugLine="Map1 = JSON.NextObject";
Debug.ShouldStop(8388608);
_map1 = _json.runMethod(false,"NextObject");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 58;BA.debugLine="customer.ID =  Map1.Get(\"id\")";
Debug.ShouldStop(33554432);
_customer.setField ("ID",BA.numberCast(int.class, _map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 59;BA.debugLine="customer.username =  Map1.Get(\"username\")";
Debug.ShouldStop(67108864);
_customer.setField ("username",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username"))))));
 BA.debugLineNum = 60;BA.debugLine="customer.password =  Map1.Get(\"password\")";
Debug.ShouldStop(134217728);
_customer.setField ("password",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("password"))))));
 BA.debugLineNum = 61;BA.debugLine="customer.FirstName =  Map1.Get(\"firstName\")";
Debug.ShouldStop(268435456);
_customer.setField ("FirstName",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstName"))))));
 BA.debugLineNum = 62;BA.debugLine="customer.LastName =  Map1.Get(\"lastName\")";
Debug.ShouldStop(536870912);
_customer.setField ("LastName",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastName"))))));
 BA.debugLineNum = 63;BA.debugLine="customer.email =  Map1.Get(\"email\")";
Debug.ShouldStop(1073741824);
_customer.setField ("email",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email"))))));
 BA.debugLineNum = 64;BA.debugLine="customer.City =  Map1.Get(\"city\")";
Debug.ShouldStop(-2147483648);
_customer.setField ("City",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city"))))));
 BA.debugLineNum = 65;BA.debugLine="customer.Phone =  Map1.Get(\"phone\")";
Debug.ShouldStop(1);
_customer.setField ("Phone",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone"))))));
 BA.debugLineNum = 67;BA.debugLine="Return customer";
Debug.ShouldStop(4);
if (true) return _customer;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _serializesupplier(RemoteObject _ba,RemoteObject _jstring) throws Exception{
try {
		Debug.PushSubsStack("SerializeSupplier (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,31);
if (RapidSub.canDelegate("serializesupplier")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","serializesupplier", _ba, _jstring);}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _supplier = RemoteObject.declareNull("b4a.diplomna.types._supplier");
;
Debug.locals.put("jstring", _jstring);
 BA.debugLineNum = 31;BA.debugLine="Public Sub SerializeSupplier(jstring As String) As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Dim JSON As JSONParser";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 33;BA.debugLine="Dim Map1 As Map";
Debug.ShouldStop(1);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 34;BA.debugLine="Dim supplier As Supplier";
Debug.ShouldStop(2);
_supplier = RemoteObject.createNew ("b4a.diplomna.types._supplier");Debug.locals.put("supplier", _supplier);
 BA.debugLineNum = 35;BA.debugLine="Map1.Initialize";
Debug.ShouldStop(4);
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="supplier.Initialize";
Debug.ShouldStop(8);
_supplier.runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="JSON.Initialize(jstring)";
Debug.ShouldStop(32);
_json.runVoidMethod ("Initialize",(Object)(_jstring));
 BA.debugLineNum = 39;BA.debugLine="Map1 = JSON.NextObject";
Debug.ShouldStop(64);
_map1 = _json.runMethod(false,"NextObject");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 41;BA.debugLine="supplier.ID =  Map1.Get(\"id\")";
Debug.ShouldStop(256);
_supplier.setField ("ID",BA.numberCast(int.class, _map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 42;BA.debugLine="supplier.SupplierName =  Map1.Get(\"supplierName\")";
Debug.ShouldStop(512);
_supplier.setField ("SupplierName",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("supplierName"))))));
 BA.debugLineNum = 43;BA.debugLine="supplier.SupploerPhone =  Map1.Get(\"supplierPhone";
Debug.ShouldStop(1024);
_supplier.setField ("SupploerPhone",BA.ObjectToString(_map1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("supplierPhone"))))));
 BA.debugLineNum = 45;BA.debugLine="Return supplier";
Debug.ShouldStop(4096);
if (true) return _supplier;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}