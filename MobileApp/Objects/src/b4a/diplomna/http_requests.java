package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class http_requests extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.http_requests");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.http_requests.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public boolean _isconnected = false;
public String _output = "";
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.http_requests __ref,anywheresoftware.b4a.BA _ba,boolean _connection) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_connection}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub Initialize(Connection As Boolean)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="IsConnected = Connection";
__ref._isconnected = _connection;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Private IsConnected As Boolean";
_isconnected = false;
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Public Output As String";
_output = "";
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="End Sub";
return "";
}
public String  _clearouput(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "clearouput", false))
	 {return ((String) Debug.delegate(ba, "clearouput", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub ClearOuput";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Output = \"\"";
__ref._output = "";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getgoodbyid(b4a.diplomna.http_requests __ref,int _goodid) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "getgoodbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getgoodbyid", new Object[] {_goodid}));}
ResumableSub_GetGoodByID rsub = new ResumableSub_GetGoodByID(this,__ref,_goodid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetGoodByID extends BA.ResumableSub {
public ResumableSub_GetGoodByID(b4a.diplomna.http_requests parent,b4a.diplomna.http_requests __ref,int _goodid) {
this.parent = parent;
this.__ref = __ref;
this._goodid = _goodid;
this.__ref = parent;
}
b4a.diplomna.http_requests __ref;
b4a.diplomna.http_requests parent;
int _goodid;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _request_data = "";
b4a.diplomna.httpjob _httpjobgoodbyid = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="http_requests";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (__ref._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Map1.Put(\"ID\",GoodID)";
_map1.Put((Object)("ID"),(Object)(_goodid));
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("44128778",_request_data,0);
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="Dim HttpJobGoodByID As HttpJob";
_httpjobgoodbyid = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetGoodByID";
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="HttpJobGoodByID.Initialize(\"GetGoodJob\",Me)";
_httpjobgoodbyid._initialize(null,ba,"GetGoodJob",parent);
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="HttpJobGoodByID.PostString(Link,request_data)";
_httpjobgoodbyid._poststring(null,_link,_request_data);
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="HttpJobGoodByID.GetRequest.SetContentType(\"appli";
_httpjobgoodbyid._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="Wait For (HttpJobGoodByID) JobDone(HttpJobGoodBy";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getgoodbyid"), (Object)(_httpjobgoodbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgoodbyid = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=4128788;
 //BA.debugLineNum = 4128788;BA.debugLine="Try";
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
RDebugUtils.currentLine=4128789;
 //BA.debugLineNum = 4128789;BA.debugLine="If HttpJobGoodByID.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobgoodbyid._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=4128790;
 //BA.debugLineNum = 4128790;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("44128790","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4128792;
 //BA.debugLineNum = 4128792;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("44128792","success",0);
RDebugUtils.currentLine=4128793;
 //BA.debugLineNum = 4128793;BA.debugLine="Log(HttpJobGoodByID.GetString)";
parent.__c.LogImpl("44128793",_httpjobgoodbyid._getstring(null),0);
RDebugUtils.currentLine=4128794;
 //BA.debugLineNum = 4128794;BA.debugLine="Output = HttpJobGoodByID.GetString";
__ref._output = _httpjobgoodbyid._getstring(null);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=4128797;
 //BA.debugLineNum = 4128797;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("44128797",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=4128799;
 //BA.debugLineNum = 4128799;BA.debugLine="HttpJobGoodByID.Release";
_httpjobgoodbyid._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=4128801;
 //BA.debugLineNum = 4128801;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=4128802;
 //BA.debugLineNum = 4128802;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getsupplierbyid(b4a.diplomna.http_requests __ref,int _supplierid) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "getsupplierbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getsupplierbyid", new Object[] {_supplierid}));}
ResumableSub_GetSupplierByID rsub = new ResumableSub_GetSupplierByID(this,__ref,_supplierid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetSupplierByID extends BA.ResumableSub {
public ResumableSub_GetSupplierByID(b4a.diplomna.http_requests parent,b4a.diplomna.http_requests __ref,int _supplierid) {
this.parent = parent;
this.__ref = __ref;
this._supplierid = _supplierid;
this.__ref = parent;
}
b4a.diplomna.http_requests __ref;
b4a.diplomna.http_requests parent;
int _supplierid;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _request_data = "";
b4a.diplomna.httpjob _httpjobsupplierbyid = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="http_requests";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (__ref._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Map1.Put(\"ID\",SupplierID)";
_map1.Put((Object)("ID"),(Object)(_supplierid));
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("44194314",_request_data,0);
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="Dim HttpJobSupplierByID As HttpJob";
_httpjobsupplierbyid = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetSupplierByID";
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="HttpJobSupplierByID.Initialize(\"GetSupplierJob\",";
_httpjobsupplierbyid._initialize(null,ba,"GetSupplierJob",parent);
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="HttpJobSupplierByID.PostString(Link,request_data";
_httpjobsupplierbyid._poststring(null,_link,_request_data);
RDebugUtils.currentLine=4194320;
 //BA.debugLineNum = 4194320;BA.debugLine="HttpJobSupplierByID.GetRequest.SetContentType(\"a";
_httpjobsupplierbyid._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="Wait For (HttpJobSupplierByID) JobDone(HttpJobSu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getsupplierbyid"), (Object)(_httpjobsupplierbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobsupplierbyid = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="Try";
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
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="If HttpJobSupplierByID.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobsupplierbyid._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=4194326;
 //BA.debugLineNum = 4194326;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("44194326","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4194328;
 //BA.debugLineNum = 4194328;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("44194328","success",0);
RDebugUtils.currentLine=4194329;
 //BA.debugLineNum = 4194329;BA.debugLine="Log(HttpJobSupplierByID.GetString)";
parent.__c.LogImpl("44194329",_httpjobsupplierbyid._getstring(null),0);
RDebugUtils.currentLine=4194330;
 //BA.debugLineNum = 4194330;BA.debugLine="Output = HttpJobSupplierByID.GetString";
__ref._output = _httpjobsupplierbyid._getstring(null);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=4194333;
 //BA.debugLineNum = 4194333;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("44194333",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=4194335;
 //BA.debugLineNum = 4194335;BA.debugLine="HttpJobSupplierByID.Release";
_httpjobsupplierbyid._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=4194337;
 //BA.debugLineNum = 4194337;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=4194338;
 //BA.debugLineNum = 4194338;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _jobdone(b4a.diplomna.http_requests __ref,b4a.diplomna.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "jobdone", false))
	 {return ((String) Debug.delegate(ba, "jobdone", new Object[] {_job}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
__c.LogImpl("44325377","JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success),0);
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="If Job.Success = True Then";
if (_job._success==__c.True) { 
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"SendOrderJob")) {
case 0: {
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Output = Job.GetString";
__ref._output = _job._getstring(null);
 break; }
}
;
 }else {
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
__c.LogImpl("44325384","Error: "+_job._errormessage,0);
 };
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _login(b4a.diplomna.http_requests __ref,String _username,String _password) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "login", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "login", new Object[] {_username,_password}));}
ResumableSub_Login rsub = new ResumableSub_Login(this,__ref,_username,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Login extends BA.ResumableSub {
public ResumableSub_Login(b4a.diplomna.http_requests parent,b4a.diplomna.http_requests __ref,String _username,String _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
this.__ref = parent;
}
b4a.diplomna.http_requests __ref;
b4a.diplomna.http_requests parent;
String _username;
String _password;
String _request_data = "";
b4a.diplomna.httpjob _httpjoblogin = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="http_requests";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (__ref._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._loginjson(parent.getActivityBA(),_username,_password).ToPrettyString((int) (1));
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("44456451",_request_data,0);
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="Dim HttpJobLogin As HttpJob";
_httpjoblogin = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/Login";
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
_httpjoblogin._initialize(null,ba,"LoginJob",parent);
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="HttpJobLogin.PostString(Link,request_data)";
_httpjoblogin._poststring(null,_link,_request_data);
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="HttpJobLogin.GetRequest.SetContentType(\"applicat";
_httpjoblogin._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="Wait For (HttpJobLogin) JobDone(HttpJobLogin As";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "login"), (Object)(_httpjoblogin));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjoblogin = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="Try";
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
RDebugUtils.currentLine=4456462;
 //BA.debugLineNum = 4456462;BA.debugLine="If HttpJobLogin.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjoblogin._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=4456463;
 //BA.debugLineNum = 4456463;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("44456463","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4456465;
 //BA.debugLineNum = 4456465;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("44456465","success",0);
RDebugUtils.currentLine=4456466;
 //BA.debugLineNum = 4456466;BA.debugLine="Log(HttpJobLogin.GetString)";
parent.__c.LogImpl("44456466",_httpjoblogin._getstring(null),0);
RDebugUtils.currentLine=4456467;
 //BA.debugLineNum = 4456467;BA.debugLine="Output = HttpJobLogin.GetString";
__ref._output = _httpjoblogin._getstring(null);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=4456470;
 //BA.debugLineNum = 4456470;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("44456470",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=4456472;
 //BA.debugLineNum = 4456472;BA.debugLine="HttpJobLogin.Release";
_httpjoblogin._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=4456474;
 //BA.debugLineNum = 4456474;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=4456475;
 //BA.debugLineNum = 4456475;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _registernewcustomer(b4a.diplomna.http_requests __ref,b4a.diplomna.types._customer _c) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "registernewcustomer", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "registernewcustomer", new Object[] {_c}));}
ResumableSub_RegisterNewCustomer rsub = new ResumableSub_RegisterNewCustomer(this,__ref,_c);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RegisterNewCustomer extends BA.ResumableSub {
public ResumableSub_RegisterNewCustomer(b4a.diplomna.http_requests parent,b4a.diplomna.http_requests __ref,b4a.diplomna.types._customer _c) {
this.parent = parent;
this.__ref = __ref;
this._c = _c;
this.__ref = parent;
}
b4a.diplomna.http_requests __ref;
b4a.diplomna.http_requests parent;
b4a.diplomna.types._customer _c;
String _request_data = "";
b4a.diplomna.httpjob _httpjobregister = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="http_requests";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (__ref._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._customertojson(parent.getActivityBA(),_c).ToPrettyString((int) (1));
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("44390915",_request_data,0);
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Dim HttpJobRegister As HttpJob";
_httpjobregister = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/RegisterC";
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="HttpJobRegister.Initialize(\"RegisterJob\",Me)";
_httpjobregister._initialize(null,ba,"RegisterJob",parent);
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="HttpJobRegister.PostString(Link,request_data)";
_httpjobregister._poststring(null,_link,_request_data);
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="HttpJobRegister.GetRequest.SetContentType(\"appli";
_httpjobregister._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="Wait For (HttpJobRegister) JobDone(HttpJobRegist";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "registernewcustomer"), (Object)(_httpjobregister));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobregister = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="Try";
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
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="If HttpJobRegister.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobregister._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("44390927","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("44390929","success",0);
RDebugUtils.currentLine=4390930;
 //BA.debugLineNum = 4390930;BA.debugLine="Log(HttpJobRegister.GetString)";
parent.__c.LogImpl("44390930",_httpjobregister._getstring(null),0);
RDebugUtils.currentLine=4390931;
 //BA.debugLineNum = 4390931;BA.debugLine="Output = HttpJobRegister.GetString";
__ref._output = _httpjobregister._getstring(null);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=4390934;
 //BA.debugLineNum = 4390934;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("44390934",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=4390936;
 //BA.debugLineNum = 4390936;BA.debugLine="HttpJobRegister.Release";
_httpjobregister._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=4390938;
 //BA.debugLineNum = 4390938;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=4390939;
 //BA.debugLineNum = 4390939;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _sendorder(b4a.diplomna.http_requests __ref,b4a.diplomna.types._order _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "sendorder", false))
	 {return ((String) Debug.delegate(ba, "sendorder", new Object[] {_o}));}
String _request_data = "";
b4a.diplomna.httpjob _httpjobsendorder = null;
String _link = "";
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub SendOrder(o As Order)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="If IsConnected = True Then";
if (__ref._isconnected==__c.True) { 
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = _jsonserializations._ordertojson(getActivityBA(),_o).ToPrettyString((int) (1));
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Log(request_data)";
__c.LogImpl("44259843",_request_data,0);
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="Dim HttpJobSendOrder As HttpJob";
_httpjobsendorder = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+_support._ip+":"+_support._port+"/api/actions/SendOrder";
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="HttpJobSendOrder.Initialize(\"SendOrderJob\",Me)";
_httpjobsendorder._initialize(null,ba,"SendOrderJob",this);
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="HttpJobSendOrder.PostString(Link,request_data)";
_httpjobsendorder._poststring(null,_link,_request_data);
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="HttpJobSendOrder.GetRequest.SetContentType(\"appl";
_httpjobsendorder._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="Try";
try {RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="If HttpJobSendOrder.Success = False Then";
if (_httpjobsendorder._success==__c.False) { 
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="Log(\"failed\")";
__c.LogImpl("44259853","failed",0);
 }else {
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="Log(\"success\")";
__c.LogImpl("44259855","success",0);
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="Log(HttpJobSendOrder.GetString)";
__c.LogImpl("44259856",_httpjobsendorder._getstring(null),0);
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="Output = HttpJobSendOrder.GetString";
__ref._output = _httpjobsendorder._getstring(null);
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=4259860;
 //BA.debugLineNum = 4259860;BA.debugLine="Log(LastException)";
__c.LogImpl("44259860",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
RDebugUtils.currentLine=4259862;
 //BA.debugLineNum = 4259862;BA.debugLine="HttpJobSendOrder.Release";
_httpjobsendorder._release(null);
 };
RDebugUtils.currentLine=4259864;
 //BA.debugLineNum = 4259864;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _testjob(b4a.diplomna.http_requests __ref) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "testjob", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "testjob", null));}
ResumableSub_TestJob rsub = new ResumableSub_TestJob(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TestJob extends BA.ResumableSub {
public ResumableSub_TestJob(b4a.diplomna.http_requests parent,b4a.diplomna.http_requests __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.diplomna.http_requests __ref;
b4a.diplomna.http_requests parent;
b4a.diplomna.httpjob _httpjoblogin = null;
String _link = "";
b4a.diplomna.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="http_requests";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (__ref._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim HttpJobLogin As HttpJob";
_httpjoblogin = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetUserForTest";
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
_httpjoblogin._initialize(null,ba,"LoginJob",parent);
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="HttpJobLogin.Download(Link)";
_httpjoblogin._download(null,_link);
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="Wait For JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "testjob"), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="Try";
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
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="If Job.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_job._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="Log(\"login failed\")";
parent.__c.LogImpl("44521993","login failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="Log(\"login success\")";
parent.__c.LogImpl("44521995","login success",0);
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="Log(Job.GetString)";
parent.__c.LogImpl("44521996",_job._getstring(null),0);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("44521999",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="Job.Release";
_job._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
}