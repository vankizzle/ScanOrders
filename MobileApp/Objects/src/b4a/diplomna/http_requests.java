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
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Initialize(Connection As Boolean)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="IsConnected = Connection";
__ref._isconnected = _connection;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Private IsConnected As Boolean";
_isconnected = false;
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Public Output As String";
_output = "";
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="End Sub";
return "";
}
public String  _clearouput(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "clearouput", false))
	 {return ((String) Debug.delegate(ba, "clearouput", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub ClearOuput";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Output = \"\"";
__ref._output = "";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Map1.Put(\"ID\",GoodID)";
_map1.Put((Object)("ID"),(Object)(_goodid));
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("21835018",_request_data,0);
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="Dim HttpJobGoodByID As HttpJob";
_httpjobgoodbyid = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetGoodByID";
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="HttpJobGoodByID.Initialize(\"GetGoodJob\",Me)";
_httpjobgoodbyid._initialize(null,ba,"GetGoodJob",parent);
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="HttpJobGoodByID.PostString(Link,request_data)";
_httpjobgoodbyid._poststring(null,_link,_request_data);
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="HttpJobGoodByID.GetRequest.SetContentType(\"appli";
_httpjobgoodbyid._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="Wait For (HttpJobGoodByID) JobDone(HttpJobGoodBy";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getgoodbyid"), (Object)(_httpjobgoodbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgoodbyid = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="Try";
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
RDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="If HttpJobGoodByID.Success = False Then";
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
RDebugUtils.currentLine=1835030;
 //BA.debugLineNum = 1835030;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("21835030","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=1835032;
 //BA.debugLineNum = 1835032;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("21835032","success",0);
RDebugUtils.currentLine=1835033;
 //BA.debugLineNum = 1835033;BA.debugLine="Log(HttpJobGoodByID.GetString)";
parent.__c.LogImpl("21835033",_httpjobgoodbyid._getstring(null),0);
RDebugUtils.currentLine=1835034;
 //BA.debugLineNum = 1835034;BA.debugLine="Output = HttpJobGoodByID.GetString";
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
RDebugUtils.currentLine=1835037;
 //BA.debugLineNum = 1835037;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("21835037",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=1835039;
 //BA.debugLineNum = 1835039;BA.debugLine="HttpJobGoodByID.Release";
_httpjobgoodbyid._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835041;
 //BA.debugLineNum = 1835041;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=1835042;
 //BA.debugLineNum = 1835042;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Map1.Put(\"ID\",SupplierID)";
_map1.Put((Object)("ID"),(Object)(_supplierid));
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("21900554",_request_data,0);
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Dim HttpJobSupplierByID As HttpJob";
_httpjobsupplierbyid = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetSupplierByID";
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="HttpJobSupplierByID.Initialize(\"GetSupplierJob\",";
_httpjobsupplierbyid._initialize(null,ba,"GetSupplierJob",parent);
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="HttpJobSupplierByID.PostString(Link,request_data";
_httpjobsupplierbyid._poststring(null,_link,_request_data);
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="HttpJobSupplierByID.GetRequest.SetContentType(\"a";
_httpjobsupplierbyid._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="Wait For (HttpJobSupplierByID) JobDone(HttpJobSu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getsupplierbyid"), (Object)(_httpjobsupplierbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobsupplierbyid = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="Try";
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
RDebugUtils.currentLine=1900565;
 //BA.debugLineNum = 1900565;BA.debugLine="If HttpJobSupplierByID.Success = False Then";
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
RDebugUtils.currentLine=1900566;
 //BA.debugLineNum = 1900566;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("21900566","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=1900568;
 //BA.debugLineNum = 1900568;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("21900568","success",0);
RDebugUtils.currentLine=1900569;
 //BA.debugLineNum = 1900569;BA.debugLine="Log(HttpJobSupplierByID.GetString)";
parent.__c.LogImpl("21900569",_httpjobsupplierbyid._getstring(null),0);
RDebugUtils.currentLine=1900570;
 //BA.debugLineNum = 1900570;BA.debugLine="Output = HttpJobSupplierByID.GetString";
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
RDebugUtils.currentLine=1900573;
 //BA.debugLineNum = 1900573;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("21900573",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=1900575;
 //BA.debugLineNum = 1900575;BA.debugLine="HttpJobSupplierByID.Release";
_httpjobsupplierbyid._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900577;
 //BA.debugLineNum = 1900577;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=1900578;
 //BA.debugLineNum = 1900578;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
__c.LogImpl("214155777","JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success),0);
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="If Job.Success = True Then";
if (_job._success==__c.True) { 
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"SendOrderJob")) {
case 0: {
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="Output = Job.GetString";
__ref._output = _job._getstring(null);
 break; }
}
;
 }else {
RDebugUtils.currentLine=14155784;
 //BA.debugLineNum = 14155784;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
__c.LogImpl("214155784","Error: "+_job._errormessage,0);
 };
RDebugUtils.currentLine=14155786;
 //BA.debugLineNum = 14155786;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=14155787;
 //BA.debugLineNum = 14155787;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._loginjson(parent.getActivityBA(),_username,_password).ToPrettyString((int) (1));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("22031619",_request_data,0);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Dim HttpJobLogin As HttpJob";
_httpjoblogin = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/Login";
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
_httpjoblogin._initialize(null,ba,"LoginJob",parent);
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="HttpJobLogin.PostString(Link,request_data)";
_httpjoblogin._poststring(null,_link,_request_data);
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="HttpJobLogin.GetRequest.SetContentType(\"applicat";
_httpjoblogin._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Wait For (HttpJobLogin) JobDone(HttpJobLogin As";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "login"), (Object)(_httpjoblogin));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjoblogin = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="Try";
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
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="If HttpJobLogin.Success = False Then";
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
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("22031631","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("22031633","success",0);
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="Log(HttpJobLogin.GetString)";
parent.__c.LogImpl("22031634",_httpjoblogin._getstring(null),0);
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="Output = HttpJobLogin.GetString";
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
RDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("22031638",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=2031640;
 //BA.debugLineNum = 2031640;BA.debugLine="HttpJobLogin.Release";
_httpjoblogin._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=2031642;
 //BA.debugLineNum = 2031642;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=2031643;
 //BA.debugLineNum = 2031643;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._customertojson(parent.getActivityBA(),_c).ToPrettyString((int) (1));
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("21966083",_request_data,0);
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Dim HttpJobRegister As HttpJob";
_httpjobregister = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/RegisterC";
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="HttpJobRegister.Initialize(\"RegisterJob\",Me)";
_httpjobregister._initialize(null,ba,"RegisterJob",parent);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="HttpJobRegister.PostString(Link,request_data)";
_httpjobregister._poststring(null,_link,_request_data);
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="HttpJobRegister.GetRequest.SetContentType(\"appli";
_httpjobregister._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="Wait For (HttpJobRegister) JobDone(HttpJobRegist";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "registernewcustomer"), (Object)(_httpjobregister));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobregister = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="Try";
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
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="If HttpJobRegister.Success = False Then";
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
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("21966095","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("21966097","success",0);
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="Log(HttpJobRegister.GetString)";
parent.__c.LogImpl("21966098",_httpjobregister._getstring(null),0);
RDebugUtils.currentLine=1966099;
 //BA.debugLineNum = 1966099;BA.debugLine="Output = HttpJobRegister.GetString";
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
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("21966102",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=1966104;
 //BA.debugLineNum = 1966104;BA.debugLine="HttpJobRegister.Release";
_httpjobregister._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=1966106;
 //BA.debugLineNum = 1966106;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=1966107;
 //BA.debugLineNum = 1966107;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub SendOrder(o As Order)";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="If IsConnected = True Then";
if (__ref._isconnected==__c.True) { 
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = _jsonserializations._ordertojson(getActivityBA(),_o).ToPrettyString((int) (1));
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="Log(request_data)";
__c.LogImpl("212845059",_request_data,0);
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="Dim HttpJobSendOrder As HttpJob";
_httpjobsendorder = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+_support._ip+":"+_support._port+"/api/actions/SendOrder";
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="HttpJobSendOrder.Initialize(\"SendOrderJob\",Me)";
_httpjobsendorder._initialize(null,ba,"SendOrderJob",this);
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="HttpJobSendOrder.PostString(Link,request_data)";
_httpjobsendorder._poststring(null,_link,_request_data);
RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="HttpJobSendOrder.GetRequest.SetContentType(\"appl";
_httpjobsendorder._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="Try";
try {RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="If HttpJobSendOrder.Success = False Then";
if (_httpjobsendorder._success==__c.False) { 
RDebugUtils.currentLine=12845069;
 //BA.debugLineNum = 12845069;BA.debugLine="Log(\"failed\")";
__c.LogImpl("212845069","failed",0);
 }else {
RDebugUtils.currentLine=12845071;
 //BA.debugLineNum = 12845071;BA.debugLine="Log(\"success\")";
__c.LogImpl("212845071","success",0);
RDebugUtils.currentLine=12845072;
 //BA.debugLineNum = 12845072;BA.debugLine="Log(HttpJobSendOrder.GetString)";
__c.LogImpl("212845072",_httpjobsendorder._getstring(null),0);
RDebugUtils.currentLine=12845073;
 //BA.debugLineNum = 12845073;BA.debugLine="Output = HttpJobSendOrder.GetString";
__ref._output = _httpjobsendorder._getstring(null);
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=12845076;
 //BA.debugLineNum = 12845076;BA.debugLine="Log(LastException)";
__c.LogImpl("212845076",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
RDebugUtils.currentLine=12845078;
 //BA.debugLineNum = 12845078;BA.debugLine="HttpJobSendOrder.Release";
_httpjobsendorder._release(null);
 };
RDebugUtils.currentLine=12845080;
 //BA.debugLineNum = 12845080;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim HttpJobLogin As HttpJob";
_httpjoblogin = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetUserForTest";
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
_httpjoblogin._initialize(null,ba,"LoginJob",parent);
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="HttpJobLogin.Download(Link)";
_httpjoblogin._download(null,_link);
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Wait For JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "testjob"), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Try";
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
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="If Job.Success = False Then";
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
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Log(\"login failed\")";
parent.__c.LogImpl("22097161","login failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Log(\"login success\")";
parent.__c.LogImpl("22097163","login success",0);
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="Log(Job.GetString)";
parent.__c.LogImpl("22097164",_job._getstring(null),0);
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
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("22097167",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="Job.Release";
_job._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="End Sub";
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