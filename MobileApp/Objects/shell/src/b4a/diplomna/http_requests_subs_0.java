package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class http_requests_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private IsConnected As Boolean";
http_requests._isconnected = RemoteObject.createImmutable(false);__ref.setField("_isconnected",http_requests._isconnected);
 //BA.debugLineNum = 3;BA.debugLine="Public Output As String";
http_requests._output = RemoteObject.createImmutable("");__ref.setField("_output",http_requests._output);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearouput(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearOuput (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("clearouput")) { return __ref.runUserSub(false, "http_requests","clearouput", __ref);}
 BA.debugLineNum = 11;BA.debugLine="Public Sub ClearOuput";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Output = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_output",BA.ObjectToString(""));
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgoodbyid(RemoteObject __ref,RemoteObject _goodid) throws Exception{
try {
		Debug.PushSubsStack("GetGoodByID (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("getgoodbyid")) { return __ref.runUserSub(false, "http_requests","getgoodbyid", __ref, _goodid);}
ResumableSub_GetGoodByID rsub = new ResumableSub_GetGoodByID(null,__ref,_goodid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetGoodByID extends BA.ResumableSub {
public ResumableSub_GetGoodByID(b4a.diplomna.http_requests parent,RemoteObject __ref,RemoteObject _goodid) {
this.parent = parent;
this.__ref = __ref;
this._goodid = _goodid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.http_requests parent;
RemoteObject _goodid;
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _request_data = RemoteObject.createImmutable("");
RemoteObject _httpjobgoodbyid = RemoteObject.declareNull("b4a.diplomna.httpjob");
RemoteObject _link = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetGoodByID (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,15);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("GoodID", _goodid);
 BA.debugLineNum = 16;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isconnected"),parent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 18;BA.debugLine="Dim Map1 As Map";
Debug.ShouldStop(131072);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 19;BA.debugLine="Map1.Initialize";
Debug.ShouldStop(262144);
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 20;BA.debugLine="Map1.Put(\"ID\",GoodID)";
Debug.ShouldStop(524288);
_map1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ID"))),(Object)((_goodid)));
 BA.debugLineNum = 22;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(2097152);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 23;BA.debugLine="JSON.Initialize(Map1)";
Debug.ShouldStop(4194304);
_json.runVoidMethod ("Initialize",(Object)(_map1));
 BA.debugLineNum = 24;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
Debug.ShouldStop(8388608);
_request_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("request_data", _request_data);Debug.locals.put("request_data", _request_data);
 BA.debugLineNum = 25;BA.debugLine="Log(request_data)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","49830410",_request_data,0);
 BA.debugLineNum = 27;BA.debugLine="Dim HttpJobGoodByID As HttpJob";
Debug.ShouldStop(67108864);
_httpjobgoodbyid = RemoteObject.createNew ("b4a.diplomna.httpjob");Debug.locals.put("HttpJobGoodByID", _httpjobgoodbyid);
 BA.debugLineNum = 28;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
Debug.ShouldStop(134217728);
_link = RemoteObject.concat(RemoteObject.createImmutable("http://"),parent._support._ip,RemoteObject.createImmutable(":"),parent._support._port,RemoteObject.createImmutable("/api/actions/GetGoodByID"));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 29;BA.debugLine="HttpJobGoodByID.Initialize(\"GetGoodJob\",Me)";
Debug.ShouldStop(268435456);
_httpjobgoodbyid.runClassMethod (b4a.diplomna.httpjob.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("GetGoodJob")),(Object)(__ref));
 BA.debugLineNum = 30;BA.debugLine="HttpJobGoodByID.PostString(Link,request_data)";
Debug.ShouldStop(536870912);
_httpjobgoodbyid.runClassMethod (b4a.diplomna.httpjob.class, "_poststring",(Object)(_link),(Object)(_request_data));
 BA.debugLineNum = 31;BA.debugLine="HttpJobGoodByID.GetRequest.SetContentType(\"appli";
Debug.ShouldStop(1073741824);
_httpjobgoodbyid.runClassMethod (b4a.diplomna.httpjob.class, "_getrequest").runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 33;BA.debugLine="Wait For (HttpJobGoodByID) JobDone(HttpJobGoodBy";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "http_requests", "getgoodbyid"), (_httpjobgoodbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgoodbyid = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("HttpJobGoodByID", _httpjobgoodbyid);
;
 BA.debugLineNum = 35;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 BA.debugLineNum = 36;BA.debugLine="If HttpJobGoodByID.Success = False Then";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_httpjobgoodbyid.getField(true,"_success"),parent.__c.getField(true,"False"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 37;BA.debugLine="Log(\"failed\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","49830422",RemoteObject.createImmutable("failed"),0);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 39;BA.debugLine="Log(\"success\")";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","49830424",RemoteObject.createImmutable("success"),0);
 BA.debugLineNum = 40;BA.debugLine="Log(HttpJobGoodByID.GetString)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","49830425",_httpjobgoodbyid.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
 BA.debugLineNum = 41;BA.debugLine="Output = HttpJobGoodByID.GetString";
Debug.ShouldStop(256);
__ref.setField ("_output",_httpjobgoodbyid.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"));
 if (true) break;

case 12:
//C
this.state = 15;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 44;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","49830429",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 BA.debugLineNum = 46;BA.debugLine="HttpJobGoodByID.Release";
Debug.ShouldStop(8192);
_httpjobgoodbyid.runClassMethod (b4a.diplomna.httpjob.class, "_release");
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 48;BA.debugLine="Return Null";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _httpjobgoodbyid) throws Exception{
}
public static RemoteObject  _getsupplierbyid(RemoteObject __ref,RemoteObject _supplierid) throws Exception{
try {
		Debug.PushSubsStack("GetSupplierByID (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getsupplierbyid")) { return __ref.runUserSub(false, "http_requests","getsupplierbyid", __ref, _supplierid);}
ResumableSub_GetSupplierByID rsub = new ResumableSub_GetSupplierByID(null,__ref,_supplierid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetSupplierByID extends BA.ResumableSub {
public ResumableSub_GetSupplierByID(b4a.diplomna.http_requests parent,RemoteObject __ref,RemoteObject _supplierid) {
this.parent = parent;
this.__ref = __ref;
this._supplierid = _supplierid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.http_requests parent;
RemoteObject _supplierid;
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _request_data = RemoteObject.createImmutable("");
RemoteObject _httpjobsupplierbyid = RemoteObject.declareNull("b4a.diplomna.httpjob");
RemoteObject _link = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetSupplierByID (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,51);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("SupplierID", _supplierid);
 BA.debugLineNum = 52;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isconnected"),parent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 54;BA.debugLine="Dim Map1 As Map";
Debug.ShouldStop(2097152);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 55;BA.debugLine="Map1.Initialize";
Debug.ShouldStop(4194304);
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="Map1.Put(\"ID\",SupplierID)";
Debug.ShouldStop(8388608);
_map1.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ID"))),(Object)((_supplierid)));
 BA.debugLineNum = 58;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(33554432);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 59;BA.debugLine="JSON.Initialize(Map1)";
Debug.ShouldStop(67108864);
_json.runVoidMethod ("Initialize",(Object)(_map1));
 BA.debugLineNum = 60;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
Debug.ShouldStop(134217728);
_request_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("request_data", _request_data);Debug.locals.put("request_data", _request_data);
 BA.debugLineNum = 61;BA.debugLine="Log(request_data)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","415335434",_request_data,0);
 BA.debugLineNum = 63;BA.debugLine="Dim HttpJobSupplierByID As HttpJob";
Debug.ShouldStop(1073741824);
_httpjobsupplierbyid = RemoteObject.createNew ("b4a.diplomna.httpjob");Debug.locals.put("HttpJobSupplierByID", _httpjobsupplierbyid);
 BA.debugLineNum = 64;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
Debug.ShouldStop(-2147483648);
_link = RemoteObject.concat(RemoteObject.createImmutable("http://"),parent._support._ip,RemoteObject.createImmutable(":"),parent._support._port,RemoteObject.createImmutable("/api/actions/GetSupplierByID"));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 65;BA.debugLine="HttpJobSupplierByID.Initialize(\"GetSupplierJob\",";
Debug.ShouldStop(1);
_httpjobsupplierbyid.runClassMethod (b4a.diplomna.httpjob.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("GetSupplierJob")),(Object)(__ref));
 BA.debugLineNum = 66;BA.debugLine="HttpJobSupplierByID.PostString(Link,request_data";
Debug.ShouldStop(2);
_httpjobsupplierbyid.runClassMethod (b4a.diplomna.httpjob.class, "_poststring",(Object)(_link),(Object)(_request_data));
 BA.debugLineNum = 67;BA.debugLine="HttpJobSupplierByID.GetRequest.SetContentType(\"a";
Debug.ShouldStop(4);
_httpjobsupplierbyid.runClassMethod (b4a.diplomna.httpjob.class, "_getrequest").runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 69;BA.debugLine="Wait For (HttpJobSupplierByID) JobDone(HttpJobSu";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "http_requests", "getsupplierbyid"), (_httpjobsupplierbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobsupplierbyid = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("HttpJobSupplierByID", _httpjobsupplierbyid);
;
 BA.debugLineNum = 71;BA.debugLine="Try";
Debug.ShouldStop(64);
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 BA.debugLineNum = 72;BA.debugLine="If HttpJobSupplierByID.Success = False Then";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_httpjobsupplierbyid.getField(true,"_success"),parent.__c.getField(true,"False"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 73;BA.debugLine="Log(\"failed\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","415335446",RemoteObject.createImmutable("failed"),0);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 75;BA.debugLine="Log(\"success\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","415335448",RemoteObject.createImmutable("success"),0);
 BA.debugLineNum = 76;BA.debugLine="Log(HttpJobSupplierByID.GetString)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","415335449",_httpjobsupplierbyid.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
 BA.debugLineNum = 77;BA.debugLine="Output = HttpJobSupplierByID.GetString";
Debug.ShouldStop(4096);
__ref.setField ("_output",_httpjobsupplierbyid.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"));
 if (true) break;

case 12:
//C
this.state = 15;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 80;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","415335453",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 BA.debugLineNum = 82;BA.debugLine="HttpJobSupplierByID.Release";
Debug.ShouldStop(131072);
_httpjobsupplierbyid.runClassMethod (b4a.diplomna.httpjob.class, "_release");
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 84;BA.debugLine="Return Null";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _connection) throws Exception{
try {
		Debug.PushSubsStack("Initialize (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "http_requests","initialize", __ref, _ba, _connection);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Connection", _connection);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(Connection As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="IsConnected = Connection";
Debug.ShouldStop(128);
__ref.setField ("_isconnected",_connection);
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _login(RemoteObject __ref,RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("Login (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("login")) { return __ref.runUserSub(false, "http_requests","login", __ref, _username, _password);}
Debug.locals.put("Username", _username);
Debug.locals.put("Password", _password);
 BA.debugLineNum = 93;BA.debugLine="Public Sub Login(Username As String,Password As St";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isconnected"),http_requests.__c.getField(true,"True"))) { 
 };
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _registernewcustomer(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("RegisterNewCustomer (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("registernewcustomer")) { return __ref.runUserSub(false, "http_requests","registernewcustomer", __ref, _c);}
Debug.locals.put("C", _c);
 BA.debugLineNum = 87;BA.debugLine="Public Sub RegisterNewCustomer(C As Customer)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isconnected"),http_requests.__c.getField(true,"True"))) { 
 };
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _testjob(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TestJob (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("testjob")) { return __ref.runUserSub(false, "http_requests","testjob", __ref);}
ResumableSub_TestJob rsub = new ResumableSub_TestJob(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TestJob extends BA.ResumableSub {
public ResumableSub_TestJob(b4a.diplomna.http_requests parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.http_requests parent;
RemoteObject _httpjoblogin = RemoteObject.declareNull("b4a.diplomna.httpjob");
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4a.diplomna.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TestJob (http_requests) ","http_requests",14,__ref.getField(false, "ba"),__ref,99);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 100;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isconnected"),parent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 101;BA.debugLine="Dim HttpJobLogin As HttpJob";
Debug.ShouldStop(16);
_httpjoblogin = RemoteObject.createNew ("b4a.diplomna.httpjob");Debug.locals.put("HttpJobLogin", _httpjoblogin);
 BA.debugLineNum = 102;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"";
Debug.ShouldStop(32);
_link = RemoteObject.concat(RemoteObject.createImmutable("http://"),parent._support._ip,RemoteObject.createImmutable(":"),parent._support._port,RemoteObject.createImmutable("/api/actions/GetUserForTest"));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 103;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
Debug.ShouldStop(64);
_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("LoginJob")),(Object)(__ref));
 BA.debugLineNum = 104;BA.debugLine="HttpJobLogin.Download(Link)";
Debug.ShouldStop(128);
_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_download",(Object)(_link));
 BA.debugLineNum = 105;BA.debugLine="Wait For JobDone(Job As HttpJob)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "http_requests", "testjob"), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 106;BA.debugLine="Try";
Debug.ShouldStop(512);
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 BA.debugLineNum = 107;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),parent.__c.getField(true,"False"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 108;BA.debugLine="Log(\"login failed\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","410027017",RemoteObject.createImmutable("login failed"),0);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 110;BA.debugLine="Log(\"login success\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","410027019",RemoteObject.createImmutable("login success"),0);
 BA.debugLineNum = 111;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","410027020",_job.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
 if (true) break;

case 12:
//C
this.state = 15;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 114;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","410027023",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 BA.debugLineNum = 116;BA.debugLine="Job.Release";
Debug.ShouldStop(524288);
_job.runClassMethod (b4a.diplomna.httpjob.class, "_release");
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 118;BA.debugLine="Return Null";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}