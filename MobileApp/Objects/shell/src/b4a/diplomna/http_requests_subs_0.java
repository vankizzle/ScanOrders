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
		Debug.PushSubsStack("ClearOuput (http_requests) ","http_requests",4,__ref.getField(false, "ba"),__ref,11);
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
		Debug.PushSubsStack("GetGoodByID (http_requests) ","http_requests",4,__ref.getField(false, "ba"),__ref,15);
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
RemoteObject _gid = RemoteObject.createImmutable("");
RemoteObject _httpjobgoodbyid = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetGoodByID (http_requests) ","http_requests",4,__ref.getField(false, "ba"),__ref,15);
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
 BA.debugLineNum = 17;BA.debugLine="Dim gID As String = GoodID";
Debug.ShouldStop(65536);
_gid = BA.NumberToString(_goodid);Debug.locals.put("gID", _gid);Debug.locals.put("gID", _gid);
 BA.debugLineNum = 18;BA.debugLine="Dim HttpJobGoodByID As HttpJob";
Debug.ShouldStop(131072);
_httpjobgoodbyid = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("HttpJobGoodByID", _httpjobgoodbyid);
 BA.debugLineNum = 19;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
Debug.ShouldStop(262144);
_link = RemoteObject.concat(RemoteObject.createImmutable("http://"),parent._support._ip,RemoteObject.createImmutable(":"),parent._support._port,RemoteObject.createImmutable("/api/actions/GetGoodByID"));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 20;BA.debugLine="HttpJobGoodByID.Initialize(\"GetGoodJob\",Me)";
Debug.ShouldStop(524288);
_httpjobgoodbyid.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("GetGoodJob")),(Object)(__ref));
 BA.debugLineNum = 21;BA.debugLine="HttpJobGoodByID.PostString(Link,gID)";
Debug.ShouldStop(1048576);
_httpjobgoodbyid.runVoidMethod ("_poststring",(Object)(_link),(Object)(_gid));
 BA.debugLineNum = 22;BA.debugLine="Wait For JobDone(Job As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 23;BA.debugLine="Try";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 24;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 25;BA.debugLine="Log(\"failed\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("failed")));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 27;BA.debugLine="Log(\"success\")";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("success")));
 BA.debugLineNum = 28;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Log",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 29;BA.debugLine="Output = Job.GetString";
Debug.ShouldStop(268435456);
__ref.setField ("_output",_job.runMethod(true,"_getstring"));
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
 BA.debugLineNum = 32;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 BA.debugLineNum = 34;BA.debugLine="Job.Release";
Debug.ShouldStop(2);
_job.runVoidMethod ("_release");
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 36;BA.debugLine="Return Null";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _connection) throws Exception{
try {
		Debug.PushSubsStack("Initialize (http_requests) ","http_requests",4,__ref.getField(false, "ba"),__ref,7);
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
		Debug.PushSubsStack("Login (http_requests) ","http_requests",4,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("login")) { return __ref.runUserSub(false, "http_requests","login", __ref, _username, _password);}
Debug.locals.put("Username", _username);
Debug.locals.put("Password", _password);
 BA.debugLineNum = 45;BA.debugLine="Public Sub Login(Username As String,Password As St";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isconnected"),http_requests.__c.getField(true,"True"))) { 
 };
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("RegisterNewCustomer (http_requests) ","http_requests",4,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("registernewcustomer")) { return __ref.runUserSub(false, "http_requests","registernewcustomer", __ref, _c);}
Debug.locals.put("C", _c);
 BA.debugLineNum = 39;BA.debugLine="Public Sub RegisterNewCustomer(C As Customer)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If IsConnected = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isconnected"),http_requests.__c.getField(true,"True"))) { 
 };
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("TestJob (http_requests) ","http_requests",4,__ref.getField(false, "ba"),__ref,51);
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
RemoteObject _httpjoblogin = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TestJob (http_requests) ","http_requests",4,__ref.getField(false, "ba"),__ref,51);
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
 BA.debugLineNum = 53;BA.debugLine="Dim HttpJobLogin As HttpJob";
Debug.ShouldStop(1048576);
_httpjoblogin = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("HttpJobLogin", _httpjoblogin);
 BA.debugLineNum = 54;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"";
Debug.ShouldStop(2097152);
_link = RemoteObject.concat(RemoteObject.createImmutable("http://"),parent._support._ip,RemoteObject.createImmutable(":"),parent._support._port,RemoteObject.createImmutable("/api/actions/GetUserForTest"));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 55;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
Debug.ShouldStop(4194304);
_httpjoblogin.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("LoginJob")),(Object)(__ref));
 BA.debugLineNum = 56;BA.debugLine="HttpJobLogin.Download(Link)";
Debug.ShouldStop(8388608);
_httpjoblogin.runVoidMethod ("_download",(Object)(_link));
 BA.debugLineNum = 57;BA.debugLine="Wait For JobDone(Job As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 58;BA.debugLine="Try";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 59;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 60;BA.debugLine="Log(\"login failed\")";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("login failed")));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 62;BA.debugLine="Log(\"login success\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("login success")));
 BA.debugLineNum = 63;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Log",(Object)(_job.runMethod(true,"_getstring")));
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
 BA.debugLineNum = 66;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 BA.debugLineNum = 68;BA.debugLine="Job.Release";
Debug.ShouldStop(8);
_job.runVoidMethod ("_release");
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 70;BA.debugLine="Return Null";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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