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
		Debug.PushSubsStack("ClearOuput (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,11);
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
		Debug.PushSubsStack("GetGoodByID (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,15);
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
		Debug.PushSubsStack("GetGoodByID (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,15);
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
parent.__c.runVoidMethod ("LogImpl","21835018",_request_data,0);
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
parent.__c.runVoidMethod ("LogImpl","21835030",RemoteObject.createImmutable("failed"),0);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 39;BA.debugLine="Log(\"success\")";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","21835032",RemoteObject.createImmutable("success"),0);
 BA.debugLineNum = 40;BA.debugLine="Log(HttpJobGoodByID.GetString)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","21835033",_httpjobgoodbyid.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
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
parent.__c.runVoidMethod ("LogImpl","21835037",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
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
public static RemoteObject  _getsupplierbyid(RemoteObject __ref,RemoteObject _supplierid) throws Exception{
try {
		Debug.PushSubsStack("GetSupplierByID (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,51);
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
		Debug.PushSubsStack("GetSupplierByID (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,51);
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
parent.__c.runVoidMethod ("LogImpl","21900554",_request_data,0);
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
parent.__c.runVoidMethod ("LogImpl","21900566",RemoteObject.createImmutable("failed"),0);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 75;BA.debugLine="Log(\"success\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","21900568",RemoteObject.createImmutable("success"),0);
 BA.debugLineNum = 76;BA.debugLine="Log(HttpJobSupplierByID.GetString)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","21900569",_httpjobsupplierbyid.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
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
parent.__c.runVoidMethod ("LogImpl","21900573",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
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
		Debug.PushSubsStack("Initialize (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,7);
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
public static RemoteObject  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "http_requests","jobdone", __ref, _job);}
Debug.locals.put("Job", _job);
 BA.debugLineNum = 113;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(131072);
http_requests.__c.runVoidMethod ("LogImpl","214155777",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname"),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success")),0);
 BA.debugLineNum = 115;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),http_requests.__c.getField(true,"True"))) { 
 BA.debugLineNum = 116;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("SendOrderJob"))) {
case 0: {
 BA.debugLineNum = 118;BA.debugLine="Output = Job.GetString";
Debug.ShouldStop(2097152);
__ref.setField ("_output",_job.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"));
 break; }
}
;
 }else {
 BA.debugLineNum = 121;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(16777216);
http_requests.__c.runVoidMethod ("LogImpl","214155784",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")),0);
 };
 BA.debugLineNum = 123;BA.debugLine="Job.Release";
Debug.ShouldStop(67108864);
_job.runClassMethod (b4a.diplomna.httpjob.class, "_release");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Login (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("login")) { return __ref.runUserSub(false, "http_requests","login", __ref, _username, _password);}
ResumableSub_Login rsub = new ResumableSub_Login(null,__ref,_username,_password);
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
public static class ResumableSub_Login extends BA.ResumableSub {
public ResumableSub_Login(b4a.diplomna.http_requests parent,RemoteObject __ref,RemoteObject _username,RemoteObject _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.http_requests parent;
RemoteObject _username;
RemoteObject _password;
RemoteObject _request_data = RemoteObject.createImmutable("");
RemoteObject _httpjoblogin = RemoteObject.declareNull("b4a.diplomna.httpjob");
RemoteObject _link = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Login (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,155);
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
Debug.locals.put("Username", _username);
Debug.locals.put("Password", _password);
 BA.debugLineNum = 156;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 157;BA.debugLine="Dim request_data As String  = JSONSerializations";
Debug.ShouldStop(268435456);
_request_data = parent._jsonserializations.runMethod(false,"_loginjson",__ref.runMethod(false,"getActivityBA"),(Object)(_username),(Object)(_password)).runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("request_data", _request_data);Debug.locals.put("request_data", _request_data);
 BA.debugLineNum = 158;BA.debugLine="Log(request_data)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","22031619",_request_data,0);
 BA.debugLineNum = 160;BA.debugLine="Dim HttpJobLogin As HttpJob";
Debug.ShouldStop(-2147483648);
_httpjoblogin = RemoteObject.createNew ("b4a.diplomna.httpjob");Debug.locals.put("HttpJobLogin", _httpjoblogin);
 BA.debugLineNum = 161;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
Debug.ShouldStop(1);
_link = RemoteObject.concat(RemoteObject.createImmutable("http://"),parent._support._ip,RemoteObject.createImmutable(":"),parent._support._port,RemoteObject.createImmutable("/api/actions/Login"));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 162;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
Debug.ShouldStop(2);
_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("LoginJob")),(Object)(__ref));
 BA.debugLineNum = 163;BA.debugLine="HttpJobLogin.PostString(Link,request_data)";
Debug.ShouldStop(4);
_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_poststring",(Object)(_link),(Object)(_request_data));
 BA.debugLineNum = 164;BA.debugLine="HttpJobLogin.GetRequest.SetContentType(\"applicat";
Debug.ShouldStop(8);
_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_getrequest").runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 166;BA.debugLine="Wait For (HttpJobLogin) JobDone(HttpJobLogin As";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "http_requests", "login"), (_httpjoblogin));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjoblogin = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("HttpJobLogin", _httpjoblogin);
;
 BA.debugLineNum = 168;BA.debugLine="Try";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 169;BA.debugLine="If HttpJobLogin.Success = False Then";
Debug.ShouldStop(256);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_httpjoblogin.getField(true,"_success"),parent.__c.getField(true,"False"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 170;BA.debugLine="Log(\"failed\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","22031631",RemoteObject.createImmutable("failed"),0);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 172;BA.debugLine="Log(\"success\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","22031633",RemoteObject.createImmutable("success"),0);
 BA.debugLineNum = 173;BA.debugLine="Log(HttpJobLogin.GetString)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","22031634",_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
 BA.debugLineNum = 174;BA.debugLine="Output = HttpJobLogin.GetString";
Debug.ShouldStop(8192);
__ref.setField ("_output",_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"));
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
 BA.debugLineNum = 177;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","22031638",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 BA.debugLineNum = 179;BA.debugLine="HttpJobLogin.Release";
Debug.ShouldStop(262144);
_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_release");
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 181;BA.debugLine="Return Null";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _registernewcustomer(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("RegisterNewCustomer (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("registernewcustomer")) { return __ref.runUserSub(false, "http_requests","registernewcustomer", __ref, _c);}
ResumableSub_RegisterNewCustomer rsub = new ResumableSub_RegisterNewCustomer(null,__ref,_c);
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
public static class ResumableSub_RegisterNewCustomer extends BA.ResumableSub {
public ResumableSub_RegisterNewCustomer(b4a.diplomna.http_requests parent,RemoteObject __ref,RemoteObject _c) {
this.parent = parent;
this.__ref = __ref;
this._c = _c;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.http_requests parent;
RemoteObject _c;
RemoteObject _request_data = RemoteObject.createImmutable("");
RemoteObject _httpjobregister = RemoteObject.declareNull("b4a.diplomna.httpjob");
RemoteObject _link = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RegisterNewCustomer (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,126);
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
Debug.locals.put("C", _c);
 BA.debugLineNum = 127;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 128;BA.debugLine="Dim request_data As String  = JSONSerializations";
Debug.ShouldStop(-2147483648);
_request_data = parent._jsonserializations.runMethod(false,"_customertojson",__ref.runMethod(false,"getActivityBA"),(Object)(_c)).runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("request_data", _request_data);Debug.locals.put("request_data", _request_data);
 BA.debugLineNum = 129;BA.debugLine="Log(request_data)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","21966083",_request_data,0);
 BA.debugLineNum = 131;BA.debugLine="Dim HttpJobRegister As HttpJob";
Debug.ShouldStop(4);
_httpjobregister = RemoteObject.createNew ("b4a.diplomna.httpjob");Debug.locals.put("HttpJobRegister", _httpjobregister);
 BA.debugLineNum = 132;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
Debug.ShouldStop(8);
_link = RemoteObject.concat(RemoteObject.createImmutable("http://"),parent._support._ip,RemoteObject.createImmutable(":"),parent._support._port,RemoteObject.createImmutable("/api/actions/RegisterC"));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 133;BA.debugLine="HttpJobRegister.Initialize(\"RegisterJob\",Me)";
Debug.ShouldStop(16);
_httpjobregister.runClassMethod (b4a.diplomna.httpjob.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("RegisterJob")),(Object)(__ref));
 BA.debugLineNum = 134;BA.debugLine="HttpJobRegister.PostString(Link,request_data)";
Debug.ShouldStop(32);
_httpjobregister.runClassMethod (b4a.diplomna.httpjob.class, "_poststring",(Object)(_link),(Object)(_request_data));
 BA.debugLineNum = 135;BA.debugLine="HttpJobRegister.GetRequest.SetContentType(\"appli";
Debug.ShouldStop(64);
_httpjobregister.runClassMethod (b4a.diplomna.httpjob.class, "_getrequest").runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 137;BA.debugLine="Wait For (HttpJobRegister) JobDone(HttpJobRegist";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "http_requests", "registernewcustomer"), (_httpjobregister));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobregister = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("HttpJobRegister", _httpjobregister);
;
 BA.debugLineNum = 139;BA.debugLine="Try";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 140;BA.debugLine="If HttpJobRegister.Success = False Then";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_httpjobregister.getField(true,"_success"),parent.__c.getField(true,"False"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 141;BA.debugLine="Log(\"failed\")";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","21966095",RemoteObject.createImmutable("failed"),0);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 143;BA.debugLine="Log(\"success\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","21966097",RemoteObject.createImmutable("success"),0);
 BA.debugLineNum = 144;BA.debugLine="Log(HttpJobRegister.GetString)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","21966098",_httpjobregister.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
 BA.debugLineNum = 145;BA.debugLine="Output = HttpJobRegister.GetString";
Debug.ShouldStop(65536);
__ref.setField ("_output",_httpjobregister.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"));
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
 BA.debugLineNum = 148;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","21966102",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 BA.debugLineNum = 150;BA.debugLine="HttpJobRegister.Release";
Debug.ShouldStop(2097152);
_httpjobregister.runClassMethod (b4a.diplomna.httpjob.class, "_release");
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 152;BA.debugLine="Return Null";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _sendorder(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("SendOrder (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("sendorder")) { return __ref.runUserSub(false, "http_requests","sendorder", __ref, _o);}
RemoteObject _request_data = RemoteObject.createImmutable("");
RemoteObject _httpjobsendorder = RemoteObject.declareNull("b4a.diplomna.httpjob");
RemoteObject _link = RemoteObject.createImmutable("");
Debug.locals.put("o", _o);
 BA.debugLineNum = 87;BA.debugLine="Public Sub SendOrder(o As Order)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isconnected"),http_requests.__c.getField(true,"True"))) { 
 BA.debugLineNum = 89;BA.debugLine="Dim request_data As String  = JSONSerializations";
Debug.ShouldStop(16777216);
_request_data = http_requests._jsonserializations.runMethod(false,"_ordertojson",__ref.runMethod(false,"getActivityBA"),(Object)(_o)).runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("request_data", _request_data);Debug.locals.put("request_data", _request_data);
 BA.debugLineNum = 90;BA.debugLine="Log(request_data)";
Debug.ShouldStop(33554432);
http_requests.__c.runVoidMethod ("LogImpl","212845059",_request_data,0);
 BA.debugLineNum = 92;BA.debugLine="Dim HttpJobSendOrder As HttpJob";
Debug.ShouldStop(134217728);
_httpjobsendorder = RemoteObject.createNew ("b4a.diplomna.httpjob");Debug.locals.put("HttpJobSendOrder", _httpjobsendorder);
 BA.debugLineNum = 93;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
Debug.ShouldStop(268435456);
_link = RemoteObject.concat(RemoteObject.createImmutable("http://"),http_requests._support._ip,RemoteObject.createImmutable(":"),http_requests._support._port,RemoteObject.createImmutable("/api/actions/SendOrder"));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 94;BA.debugLine="HttpJobSendOrder.Initialize(\"SendOrderJob\",Me)";
Debug.ShouldStop(536870912);
_httpjobsendorder.runClassMethod (b4a.diplomna.httpjob.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("SendOrderJob")),(Object)(__ref));
 BA.debugLineNum = 95;BA.debugLine="HttpJobSendOrder.PostString(Link,request_data)";
Debug.ShouldStop(1073741824);
_httpjobsendorder.runClassMethod (b4a.diplomna.httpjob.class, "_poststring",(Object)(_link),(Object)(_request_data));
 BA.debugLineNum = 96;BA.debugLine="HttpJobSendOrder.GetRequest.SetContentType(\"appl";
Debug.ShouldStop(-2147483648);
_httpjobsendorder.runClassMethod (b4a.diplomna.httpjob.class, "_getrequest").runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 98;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 99;BA.debugLine="If HttpJobSendOrder.Success = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_httpjobsendorder.getField(true,"_success"),http_requests.__c.getField(true,"False"))) { 
 BA.debugLineNum = 100;BA.debugLine="Log(\"failed\")";
Debug.ShouldStop(8);
http_requests.__c.runVoidMethod ("LogImpl","212845069",RemoteObject.createImmutable("failed"),0);
 }else {
 BA.debugLineNum = 102;BA.debugLine="Log(\"success\")";
Debug.ShouldStop(32);
http_requests.__c.runVoidMethod ("LogImpl","212845071",RemoteObject.createImmutable("success"),0);
 BA.debugLineNum = 103;BA.debugLine="Log(HttpJobSendOrder.GetString)";
Debug.ShouldStop(64);
http_requests.__c.runVoidMethod ("LogImpl","212845072",_httpjobsendorder.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
 BA.debugLineNum = 104;BA.debugLine="Output = HttpJobSendOrder.GetString";
Debug.ShouldStop(128);
__ref.setField ("_output",_httpjobsendorder.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 107;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
http_requests.__c.runVoidMethod ("LogImpl","212845076",BA.ObjectToString(http_requests.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 };
 BA.debugLineNum = 109;BA.debugLine="HttpJobSendOrder.Release";
Debug.ShouldStop(4096);
_httpjobsendorder.runClassMethod (b4a.diplomna.httpjob.class, "_release");
 };
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("TestJob (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,184);
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
		Debug.PushSubsStack("TestJob (http_requests) ","http_requests",1,__ref.getField(false, "ba"),__ref,184);
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
 BA.debugLineNum = 185;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 186;BA.debugLine="Dim HttpJobLogin As HttpJob";
Debug.ShouldStop(33554432);
_httpjoblogin = RemoteObject.createNew ("b4a.diplomna.httpjob");Debug.locals.put("HttpJobLogin", _httpjoblogin);
 BA.debugLineNum = 187;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"";
Debug.ShouldStop(67108864);
_link = RemoteObject.concat(RemoteObject.createImmutable("http://"),parent._support._ip,RemoteObject.createImmutable(":"),parent._support._port,RemoteObject.createImmutable("/api/actions/GetUserForTest"));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 188;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
Debug.ShouldStop(134217728);
_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("LoginJob")),(Object)(__ref));
 BA.debugLineNum = 189;BA.debugLine="HttpJobLogin.Download(Link)";
Debug.ShouldStop(268435456);
_httpjoblogin.runClassMethod (b4a.diplomna.httpjob.class, "_download",(Object)(_link));
 BA.debugLineNum = 190;BA.debugLine="Wait For JobDone(Job As HttpJob)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "http_requests", "testjob"), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 191;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 192;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 193;BA.debugLine="Log(\"login failed\")";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","22097161",RemoteObject.createImmutable("login failed"),0);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 195;BA.debugLine="Log(\"login success\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","22097163",RemoteObject.createImmutable("login success"),0);
 BA.debugLineNum = 196;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","22097164",_job.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
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
 BA.debugLineNum = 199;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","22097167",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 BA.debugLineNum = 201;BA.debugLine="Job.Release";
Debug.ShouldStop(256);
_job.runClassMethod (b4a.diplomna.httpjob.class, "_release");
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 203;BA.debugLine="Return Null";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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