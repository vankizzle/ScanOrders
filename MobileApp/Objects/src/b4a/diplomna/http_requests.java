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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.http_requests __ref,anywheresoftware.b4a.BA _ba,boolean _connection) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_connection}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize(Connection As Boolean)";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="IsConnected = Connection";
__ref._isconnected = _connection;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Private IsConnected As Boolean";
_isconnected = false;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Public Output As String";
_output = "";
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="End Sub";
return "";
}
public String  _clearouput(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "clearouput", false))
	 {return ((String) Debug.delegate(ba, "clearouput", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub ClearOuput";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Output = \"\"";
__ref._output = "";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Map1.Put(\"ID\",GoodID)";
_map1.Put((Object)("ID"),(Object)(_goodid));
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("4524298",_request_data,0);
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="Dim HttpJobGoodByID As HttpJob";
_httpjobgoodbyid = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetGoodByID";
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="HttpJobGoodByID.Initialize(\"GetGoodJob\",Me)";
_httpjobgoodbyid._initialize(null,ba,"GetGoodJob",parent);
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="HttpJobGoodByID.PostString(Link,request_data)";
_httpjobgoodbyid._poststring(null,_link,_request_data);
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="HttpJobGoodByID.GetRequest.SetContentType(\"appli";
_httpjobgoodbyid._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="Wait For (HttpJobGoodByID) JobDone(HttpJobGoodBy";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getgoodbyid"), (Object)(_httpjobgoodbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgoodbyid = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="Try";
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
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="If HttpJobGoodByID.Success = False Then";
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
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("4524310","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("4524312","success",0);
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="Log(HttpJobGoodByID.GetString)";
parent.__c.LogImpl("4524313",_httpjobgoodbyid._getstring(null),0);
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="Output = HttpJobGoodByID.GetString";
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
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("4524317",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="HttpJobGoodByID.Release";
_httpjobgoodbyid._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=524322;
 //BA.debugLineNum = 524322;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Map1.Put(\"ID\",SupplierID)";
_map1.Put((Object)("ID"),(Object)(_supplierid));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("4589834",_request_data,0);
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Dim HttpJobSupplierByID As HttpJob";
_httpjobsupplierbyid = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetSupplierByID";
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="HttpJobSupplierByID.Initialize(\"GetSupplierJob\",";
_httpjobsupplierbyid._initialize(null,ba,"GetSupplierJob",parent);
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="HttpJobSupplierByID.PostString(Link,request_data";
_httpjobsupplierbyid._poststring(null,_link,_request_data);
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="HttpJobSupplierByID.GetRequest.SetContentType(\"a";
_httpjobsupplierbyid._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Wait For (HttpJobSupplierByID) JobDone(HttpJobSu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getsupplierbyid"), (Object)(_httpjobsupplierbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobsupplierbyid = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="Try";
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
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="If HttpJobSupplierByID.Success = False Then";
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
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("4589846","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("4589848","success",0);
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="Log(HttpJobSupplierByID.GetString)";
parent.__c.LogImpl("4589849",_httpjobsupplierbyid._getstring(null),0);
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="Output = HttpJobSupplierByID.GetString";
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
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("4589853",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="HttpJobSupplierByID.Release";
_httpjobsupplierbyid._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
__c.LogImpl("4720897","JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success),0);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="If Job.Success = True Then";
if (_job._success==__c.True) { 
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"SendOrderJob")) {
case 0: {
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Output = Job.GetString";
__ref._output = _job._getstring(null);
 break; }
}
;
 }else {
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
__c.LogImpl("4720904","Error: "+_job._errormessage,0);
 };
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._loginjson(parent.getActivityBA(),_username,_password).ToPrettyString((int) (1));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("4851971",_request_data,0);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dim HttpJobLogin As HttpJob";
_httpjoblogin = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/Login";
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
_httpjoblogin._initialize(null,ba,"LoginJob",parent);
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="HttpJobLogin.PostString(Link,request_data)";
_httpjoblogin._poststring(null,_link,_request_data);
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="HttpJobLogin.GetRequest.SetContentType(\"applicat";
_httpjoblogin._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Wait For (HttpJobLogin) JobDone(HttpJobLogin As";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "login"), (Object)(_httpjoblogin));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjoblogin = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Try";
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
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="If HttpJobLogin.Success = False Then";
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
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("4851983","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("4851985","success",0);
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="Log(HttpJobLogin.GetString)";
parent.__c.LogImpl("4851986",_httpjoblogin._getstring(null),0);
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="Output = HttpJobLogin.GetString";
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
RDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("4851990",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="HttpJobLogin.Release";
_httpjoblogin._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=851995;
 //BA.debugLineNum = 851995;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._customertojson(parent.getActivityBA(),_c).ToPrettyString((int) (1));
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("4786435",_request_data,0);
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Dim HttpJobRegister As HttpJob";
_httpjobregister = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/RegisterC";
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="HttpJobRegister.Initialize(\"RegisterJob\",Me)";
_httpjobregister._initialize(null,ba,"RegisterJob",parent);
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="HttpJobRegister.PostString(Link,request_data)";
_httpjobregister._poststring(null,_link,_request_data);
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="HttpJobRegister.GetRequest.SetContentType(\"appli";
_httpjobregister._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Wait For (HttpJobRegister) JobDone(HttpJobRegist";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "registernewcustomer"), (Object)(_httpjobregister));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobregister = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="Try";
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
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="If HttpJobRegister.Success = False Then";
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
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("4786447","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("4786449","success",0);
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="Log(HttpJobRegister.GetString)";
parent.__c.LogImpl("4786450",_httpjobregister._getstring(null),0);
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="Output = HttpJobRegister.GetString";
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
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("4786454",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="HttpJobRegister.Release";
_httpjobregister._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub SendOrder(o As Order)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="If IsConnected = True Then";
if (__ref._isconnected==__c.True) { 
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = _jsonserializations._ordertojson(getActivityBA(),_o).ToPrettyString((int) (1));
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Log(request_data)";
__c.LogImpl("4655363",_request_data,0);
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim HttpJobSendOrder As HttpJob";
_httpjobsendorder = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+_support._ip+":"+_support._port+"/api/actions/SendOrder";
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="HttpJobSendOrder.Initialize(\"SendOrderJob\",Me)";
_httpjobsendorder._initialize(null,ba,"SendOrderJob",this);
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="HttpJobSendOrder.PostString(Link,request_data)";
_httpjobsendorder._poststring(null,_link,_request_data);
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="HttpJobSendOrder.GetRequest.SetContentType(\"appl";
_httpjobsendorder._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="Try";
try {RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="If HttpJobSendOrder.Success = False Then";
if (_httpjobsendorder._success==__c.False) { 
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="Log(\"failed\")";
__c.LogImpl("4655373","failed",0);
 }else {
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="Log(\"success\")";
__c.LogImpl("4655375","success",0);
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="Log(HttpJobSendOrder.GetString)";
__c.LogImpl("4655376",_httpjobsendorder._getstring(null),0);
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="Output = HttpJobSendOrder.GetString";
__ref._output = _httpjobsendorder._getstring(null);
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="Log(LastException)";
__c.LogImpl("4655380",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="HttpJobSendOrder.Release";
_httpjobsendorder._release(null);
 };
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="End Sub";
return "";
}
}