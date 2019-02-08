package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jsonserializations_subs_0 {


public static RemoteObject  _customertojson(RemoteObject _ba,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("CustomerToJSON (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,88);
if (RapidSub.canDelegate("customertojson")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","customertojson", _ba, _c);}
RemoteObject _jsondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
;
Debug.locals.put("c", _c);
 BA.debugLineNum = 88;BA.debugLine="Public Sub CustomerToJSON(c As Customer)As JSONGen";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Dim JsonData As Map";
Debug.ShouldStop(16777216);
_jsondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("JsonData", _jsondata);
 BA.debugLineNum = 90;BA.debugLine="JsonData.Initialize";
Debug.ShouldStop(33554432);
_jsondata.runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="JsonData.Put(\"id\",c.ID)";
Debug.ShouldStop(67108864);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_c.getField(true,"ID"))));
 BA.debugLineNum = 92;BA.debugLine="JsonData.Put(\"username\", c.username)";
Debug.ShouldStop(134217728);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_c.getField(true,"username"))));
 BA.debugLineNum = 93;BA.debugLine="JsonData.Put(\"password\",c.password )";
Debug.ShouldStop(268435456);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("password"))),(Object)((_c.getField(true,"password"))));
 BA.debugLineNum = 94;BA.debugLine="JsonData.Put(\"email\",c.email )";
Debug.ShouldStop(536870912);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("email"))),(Object)((_c.getField(true,"email"))));
 BA.debugLineNum = 95;BA.debugLine="JsonData.Put(\"firstName\",c.FirstName )";
Debug.ShouldStop(1073741824);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("firstName"))),(Object)((_c.getField(true,"FirstName"))));
 BA.debugLineNum = 96;BA.debugLine="JsonData.Put(\"lastName\",c.LastName )";
Debug.ShouldStop(-2147483648);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lastName"))),(Object)((_c.getField(true,"LastName"))));
 BA.debugLineNum = 97;BA.debugLine="JsonData.Put(\"phone\",c.Phone )";
Debug.ShouldStop(1);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("phone"))),(Object)((_c.getField(true,"Phone"))));
 BA.debugLineNum = 98;BA.debugLine="JsonData.Put(\"city\",c.City )";
Debug.ShouldStop(2);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("city"))),(Object)((_c.getField(true,"City"))));
 BA.debugLineNum = 99;BA.debugLine="JsonData.Put(\"country\",c.Country )";
Debug.ShouldStop(4);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("country"))),(Object)((_c.getField(true,"Country"))));
 BA.debugLineNum = 100;BA.debugLine="JsonData.Put(\"address\",c.Address )";
Debug.ShouldStop(8);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("address"))),(Object)((_c.getField(true,"Address"))));
 BA.debugLineNum = 102;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(32);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 103;BA.debugLine="JSONGenerator.Initialize(JsonData)";
Debug.ShouldStop(64);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_jsondata));
 BA.debugLineNum = 104;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
Debug.ShouldStop(128);
jsonserializations.mostCurrent.__c.runVoidMethod ("LogImpl","33014672",_jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 0))),0);
 BA.debugLineNum = 105;BA.debugLine="Return JSONGenerator";
Debug.ShouldStop(256);
if (true) return _jsongenerator;
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("LoginJson (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,48);
if (RapidSub.canDelegate("loginjson")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","loginjson", _ba, _username, _password);}
RemoteObject _jsondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
;
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 48;BA.debugLine="Public Sub LoginJson(username As String , password";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim JsonData As Map";
Debug.ShouldStop(65536);
_jsondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("JsonData", _jsondata);
 BA.debugLineNum = 50;BA.debugLine="JsonData.Initialize";
Debug.ShouldStop(131072);
_jsondata.runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="JsonData.Put(\"username\", username)";
Debug.ShouldStop(262144);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_username)));
 BA.debugLineNum = 52;BA.debugLine="JsonData.Put(\"password\", password)";
Debug.ShouldStop(524288);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("password"))),(Object)((_password)));
 BA.debugLineNum = 54;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(2097152);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 55;BA.debugLine="JSONGenerator.Initialize(JsonData)";
Debug.ShouldStop(4194304);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_jsondata));
 BA.debugLineNum = 56;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
Debug.ShouldStop(8388608);
jsonserializations.mostCurrent.__c.runVoidMethod ("LogImpl","32883592",_jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 0))),0);
 BA.debugLineNum = 57;BA.debugLine="Return JSONGenerator";
Debug.ShouldStop(16777216);
if (true) return _jsongenerator;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("OrderToJSON (jsonserializations) ","jsonserializations",3,_ba,jsonserializations.mostCurrent,60);
if (RapidSub.canDelegate("ordertojson")) { return b4a.diplomna.jsonserializations.remoteMe.runUserSub(false, "jsonserializations","ordertojson", _ba, _o);}
RemoteObject _jsondata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsonarray = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _og = RemoteObject.declareNull("b4a.diplomna.types._orderedgoods");
RemoteObject _jsondata2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
;
Debug.locals.put("o", _o);
 BA.debugLineNum = 60;BA.debugLine="Public Sub OrderToJSON(o As Order) As JSONGenerato";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim JsonData As Map";
Debug.ShouldStop(268435456);
_jsondata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("JsonData", _jsondata);
 BA.debugLineNum = 62;BA.debugLine="Dim JsonArray As List";
Debug.ShouldStop(536870912);
_jsonarray = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("JsonArray", _jsonarray);
 BA.debugLineNum = 63;BA.debugLine="JsonData.Initialize";
Debug.ShouldStop(1073741824);
_jsondata.runVoidMethod ("Initialize");
 BA.debugLineNum = 64;BA.debugLine="JsonArray.Initialize";
Debug.ShouldStop(-2147483648);
_jsonarray.runVoidMethod ("Initialize");
 BA.debugLineNum = 66;BA.debugLine="JsonData.Put(\"id\",o.ID)";
Debug.ShouldStop(2);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_o.getField(true,"ID"))));
 BA.debugLineNum = 67;BA.debugLine="JsonData.Put(\"orderCode\",o.OrderCode)";
Debug.ShouldStop(4);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderCode"))),(Object)((_o.getField(true,"OrderCode"))));
 BA.debugLineNum = 68;BA.debugLine="JsonData.Put(\"customerID\",o.CutomerID)";
Debug.ShouldStop(8);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customerID"))),(Object)((_o.getField(true,"CutomerID"))));
 BA.debugLineNum = 69;BA.debugLine="JsonData.Put(\"orderTotalPrice\",o.OrderTotalPrice)";
Debug.ShouldStop(16);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderTotalPrice"))),(Object)((_o.getField(true,"OrderTotalPrice"))));
 BA.debugLineNum = 70;BA.debugLine="JsonData.Put(\"orderStatus\",o.OrderStatus)";
Debug.ShouldStop(32);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderStatus"))),(Object)((_o.getField(true,"OrderStatus"))));
 BA.debugLineNum = 71;BA.debugLine="For Each og As OrderedGoods In o.OrderedGoods";
Debug.ShouldStop(64);
{
final RemoteObject group10 = _o.getField(false,"OrderedGoods");
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_og = (group10.runMethod(false,"Get",index10));Debug.locals.put("og", _og);
Debug.locals.put("og", _og);
 BA.debugLineNum = 72;BA.debugLine="Dim JsonData2 As Map";
Debug.ShouldStop(128);
_jsondata2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("JsonData2", _jsondata2);
 BA.debugLineNum = 73;BA.debugLine="JsonData2.Initialize";
Debug.ShouldStop(256);
_jsondata2.runVoidMethod ("Initialize");
 BA.debugLineNum = 74;BA.debugLine="JsonData2.Put(\"order\",Null)";
Debug.ShouldStop(512);
_jsondata2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("order"))),(Object)(jsonserializations.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 75;BA.debugLine="JsonData2.Put(\"orderID\",og.OrderID)";
Debug.ShouldStop(1024);
_jsondata2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderID"))),(Object)((_og.getField(true,"OrderID"))));
 BA.debugLineNum = 76;BA.debugLine="JsonData2.Put(\"goodID\",og.GoodID)";
Debug.ShouldStop(2048);
_jsondata2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("goodID"))),(Object)((_og.getField(true,"GoodID"))));
 BA.debugLineNum = 77;BA.debugLine="JsonData2.Put(\"qtty\",og.Qtty)";
Debug.ShouldStop(4096);
_jsondata2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("qtty"))),(Object)((_og.getField(true,"Qtty"))));
 BA.debugLineNum = 78;BA.debugLine="JsonArray.Add(JsonData2)";
Debug.ShouldStop(8192);
_jsonarray.runVoidMethod ("Add",(Object)((_jsondata2.getObject())));
 }
}Debug.locals.put("og", _og);
;
 BA.debugLineNum = 80;BA.debugLine="JsonData.Put(\"orderedGoods\",JsonArray)";
Debug.ShouldStop(32768);
_jsondata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orderedGoods"))),(Object)((_jsonarray.getObject())));
 BA.debugLineNum = 82;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(131072);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 83;BA.debugLine="JSONGenerator.Initialize(JsonData)";
Debug.ShouldStop(262144);
_jsongenerator.runVoidMethod ("Initialize",(Object)(_jsondata));
 BA.debugLineNum = 84;BA.debugLine="Log(JSONGenerator.ToPrettyString(0))";
Debug.ShouldStop(524288);
jsonserializations.mostCurrent.__c.runVoidMethod ("LogImpl","32949144",_jsongenerator.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 0))),0);
 BA.debugLineNum = 85;BA.debugLine="Return JSONGenerator";
Debug.ShouldStop(1048576);
if (true) return _jsongenerator;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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