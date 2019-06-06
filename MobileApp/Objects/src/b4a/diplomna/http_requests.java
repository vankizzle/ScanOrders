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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
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
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Initialize(Connection As Boolean)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="IsConnected = Connection";
__ref._isconnected = _connection;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._loginjson(parent.getActivityBA(),_username,_password).ToPrettyString((int) (1));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("43211267",_request_data,0);
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="Dim HttpJobLogin As HttpJob";
_httpjoblogin = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="Dim Link As String = \"http://\"& Support.Address";
_link = "http://"+parent._support._address+"/api/actions/LoginCustomer";
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
_httpjoblogin._initialize(null,ba,"LoginJob",parent);
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="HttpJobLogin.PostString(Link,request_data)";
_httpjoblogin._poststring(null,_link,_request_data);
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="HttpJobLogin.GetRequest.SetContentType(\"applicat";
_httpjoblogin._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="Wait For (HttpJobLogin) JobDone(HttpJobLogin As";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "login"), (Object)(_httpjoblogin));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjoblogin = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="Try";
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
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="If HttpJobLogin.Success = False Then";
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
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("43211279","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("43211281","success",0);
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="Log(HttpJobLogin.GetString)";
parent.__c.LogImpl("43211282",_httpjoblogin._getstring(null),0);
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="Output = HttpJobLogin.GetString";
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
RDebugUtils.currentLine=3211286;
 //BA.debugLineNum = 3211286;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("43211286",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=3211288;
 //BA.debugLineNum = 3211288;BA.debugLine="HttpJobLogin.Release";
_httpjoblogin._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=3211290;
 //BA.debugLineNum = 3211290;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=3211291;
 //BA.debugLineNum = 3211291;BA.debugLine="End Sub";
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
public String  _clearouput(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "clearouput", false))
	 {return ((String) Debug.delegate(ba, "clearouput", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub ClearOuput";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Output = \"\"";
__ref._output = "";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Private IsConnected As Boolean";
_isconnected = false;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Public Output As String";
_output = "";
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getcustomerorders(b4a.diplomna.http_requests __ref,int _customerid) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "getcustomerorders", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getcustomerorders", new Object[] {_customerid}));}
ResumableSub_GetCustomerOrders rsub = new ResumableSub_GetCustomerOrders(this,__ref,_customerid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetCustomerOrders extends BA.ResumableSub {
public ResumableSub_GetCustomerOrders(b4a.diplomna.http_requests parent,b4a.diplomna.http_requests __ref,int _customerid) {
this.parent = parent;
this.__ref = __ref;
this._customerid = _customerid;
this.__ref = parent;
}
b4a.diplomna.http_requests __ref;
b4a.diplomna.http_requests parent;
int _customerid;
String _request_data = "";
b4a.diplomna.httpjob _httpjobgetcustomerorders = null;
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
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._customerid(parent.getActivityBA(),_customerid).ToPrettyString((int) (1));
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("43276803",_request_data,0);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Dim HttpJobGetCustomerOrders As HttpJob";
_httpjobgetcustomerorders = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="Dim Link As String = \"http://\"& Support.Address";
_link = "http://"+parent._support._address+"/api/actions/GetCustomerOrders";
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="HttpJobGetCustomerOrders.Initialize(\"GetCustomer";
_httpjobgetcustomerorders._initialize(null,ba,"GetCustomerOrdersJob",parent);
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="HttpJobGetCustomerOrders.PostString(Link,request";
_httpjobgetcustomerorders._poststring(null,_link,_request_data);
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="HttpJobGetCustomerOrders.GetRequest.SetContentTy";
_httpjobgetcustomerorders._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="Wait For (HttpJobGetCustomerOrders) JobDone(Http";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getcustomerorders"), (Object)(_httpjobgetcustomerorders));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgetcustomerorders = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="Try";
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
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="If HttpJobGetCustomerOrders.Success = False The";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobgetcustomerorders._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("43276815","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("43276817","success",0);
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="Log(HttpJobGetCustomerOrders.GetString)";
parent.__c.LogImpl("43276818",_httpjobgetcustomerorders._getstring(null),0);
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="Output = HttpJobGetCustomerOrders.GetString";
__ref._output = _httpjobgetcustomerorders._getstring(null);
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
RDebugUtils.currentLine=3276822;
 //BA.debugLineNum = 3276822;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("43276822",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=3276824;
 //BA.debugLineNum = 3276824;BA.debugLine="HttpJobGetCustomerOrders.Release";
_httpjobgetcustomerorders._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=3276826;
 //BA.debugLineNum = 3276826;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=3276827;
 //BA.debugLineNum = 3276827;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Map1.Put(\"ID\",GoodID)";
_map1.Put((Object)("ID"),(Object)(_goodid));
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("42883594",_request_data,0);
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="Dim HttpJobGoodByID As HttpJob";
_httpjobgoodbyid = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="Dim Link As String = \"http://\"& Support.Address";
_link = "http://"+parent._support._address+"/api/actions/GetGoodByID";
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="HttpJobGoodByID.Initialize(\"GetGoodJob\",Me)";
_httpjobgoodbyid._initialize(null,ba,"GetGoodJob",parent);
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="HttpJobGoodByID.PostString(Link,request_data)";
_httpjobgoodbyid._poststring(null,_link,_request_data);
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="HttpJobGoodByID.GetRequest.SetContentType(\"appli";
_httpjobgoodbyid._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="Wait For (HttpJobGoodByID) JobDone(HttpJobGoodBy";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getgoodbyid"), (Object)(_httpjobgoodbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgoodbyid = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="Try";
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
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="If HttpJobGoodByID.Success = False Then";
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
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("42883606","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("42883608","success",0);
RDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="Log(HttpJobGoodByID.GetString)";
parent.__c.LogImpl("42883609",_httpjobgoodbyid._getstring(null),0);
RDebugUtils.currentLine=2883610;
 //BA.debugLineNum = 2883610;BA.debugLine="Output = HttpJobGoodByID.GetString";
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
RDebugUtils.currentLine=2883613;
 //BA.debugLineNum = 2883613;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("42883613",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=2883615;
 //BA.debugLineNum = 2883615;BA.debugLine="HttpJobGoodByID.Release";
_httpjobgoodbyid._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=2883617;
 //BA.debugLineNum = 2883617;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=2883618;
 //BA.debugLineNum = 2883618;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getorderedgoods(b4a.diplomna.http_requests __ref,int _orderid) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "getorderedgoods", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getorderedgoods", new Object[] {_orderid}));}
ResumableSub_GetOrderedGoods rsub = new ResumableSub_GetOrderedGoods(this,__ref,_orderid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetOrderedGoods extends BA.ResumableSub {
public ResumableSub_GetOrderedGoods(b4a.diplomna.http_requests parent,b4a.diplomna.http_requests __ref,int _orderid) {
this.parent = parent;
this.__ref = __ref;
this._orderid = _orderid;
this.__ref = parent;
}
b4a.diplomna.http_requests __ref;
b4a.diplomna.http_requests parent;
int _orderid;
String _request_data = "";
b4a.diplomna.httpjob _httpjobgetordergoods = null;
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
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._customerid(parent.getActivityBA(),_orderid).ToPrettyString((int) (1));
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("43342339",_request_data,0);
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Dim HttpJobGetOrderGoods As HttpJob";
_httpjobgetordergoods = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Dim Link As String = \"http://\"& Support.Address";
_link = "http://"+parent._support._address+"/api/actions/GetOrderGoods";
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="HttpJobGetOrderGoods.Initialize(\"GetCustomerOrde";
_httpjobgetordergoods._initialize(null,ba,"GetCustomerOrdersJob",parent);
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="HttpJobGetOrderGoods.PostString(Link,request_dat";
_httpjobgetordergoods._poststring(null,_link,_request_data);
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="HttpJobGetOrderGoods.GetRequest.SetContentType(\"";
_httpjobgetordergoods._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="Wait For (HttpJobGetOrderGoods) JobDone(HttpJobG";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getorderedgoods"), (Object)(_httpjobgetordergoods));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgetordergoods = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="Try";
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
RDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="If HttpJobGetOrderGoods.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobgetordergoods._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("43342351","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=3342353;
 //BA.debugLineNum = 3342353;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("43342353","success",0);
RDebugUtils.currentLine=3342354;
 //BA.debugLineNum = 3342354;BA.debugLine="Log(HttpJobGetOrderGoods.GetString)";
parent.__c.LogImpl("43342354",_httpjobgetordergoods._getstring(null),0);
RDebugUtils.currentLine=3342355;
 //BA.debugLineNum = 3342355;BA.debugLine="Output = HttpJobGetOrderGoods.GetString";
__ref._output = _httpjobgetordergoods._getstring(null);
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
RDebugUtils.currentLine=3342358;
 //BA.debugLineNum = 3342358;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("43342358",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=3342360;
 //BA.debugLineNum = 3342360;BA.debugLine="HttpJobGetOrderGoods.Release";
_httpjobgetordergoods._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=3342362;
 //BA.debugLineNum = 3342362;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=3342363;
 //BA.debugLineNum = 3342363;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Map1.Put(\"ID\",SupplierID)";
_map1.Put((Object)("ID"),(Object)(_supplierid));
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("42949130",_request_data,0);
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="Dim HttpJobSupplierByID As HttpJob";
_httpjobsupplierbyid = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Dim Link As String = \"http://\"& Support.Address";
_link = "http://"+parent._support._address+"/api/actions/GetSupplierByID";
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="HttpJobSupplierByID.Initialize(\"GetSupplierJob\",";
_httpjobsupplierbyid._initialize(null,ba,"GetSupplierJob",parent);
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="HttpJobSupplierByID.PostString(Link,request_data";
_httpjobsupplierbyid._poststring(null,_link,_request_data);
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="HttpJobSupplierByID.GetRequest.SetContentType(\"a";
_httpjobsupplierbyid._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="Wait For (HttpJobSupplierByID) JobDone(HttpJobSu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getsupplierbyid"), (Object)(_httpjobsupplierbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobsupplierbyid = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="Try";
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
RDebugUtils.currentLine=2949141;
 //BA.debugLineNum = 2949141;BA.debugLine="If HttpJobSupplierByID.Success = False Then";
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
RDebugUtils.currentLine=2949142;
 //BA.debugLineNum = 2949142;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("42949142","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("42949144","success",0);
RDebugUtils.currentLine=2949145;
 //BA.debugLineNum = 2949145;BA.debugLine="Log(HttpJobSupplierByID.GetString)";
parent.__c.LogImpl("42949145",_httpjobsupplierbyid._getstring(null),0);
RDebugUtils.currentLine=2949146;
 //BA.debugLineNum = 2949146;BA.debugLine="Output = HttpJobSupplierByID.GetString";
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
RDebugUtils.currentLine=2949149;
 //BA.debugLineNum = 2949149;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("42949149",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=2949151;
 //BA.debugLineNum = 2949151;BA.debugLine="HttpJobSupplierByID.Release";
_httpjobsupplierbyid._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=2949153;
 //BA.debugLineNum = 2949153;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=2949154;
 //BA.debugLineNum = 2949154;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
__c.LogImpl("43080193","JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success),0);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="If Job.Success = True Then";
if (_job._success==__c.True) { 
 }else {
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
__c.LogImpl("43080200","Error: "+_job._errormessage,0);
 };
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._customertojson(parent.getActivityBA(),_c).ToPrettyString((int) (1));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("43145731",_request_data,0);
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Dim HttpJobRegister As HttpJob";
_httpjobregister = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Dim Link As String = \"http://\"& Support.Address";
_link = "http://"+parent._support._address+"/api/actions/RegisterC";
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="HttpJobRegister.Initialize(\"RegisterJob\",Me)";
_httpjobregister._initialize(null,ba,"RegisterJob",parent);
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="HttpJobRegister.PostString(Link,request_data)";
_httpjobregister._poststring(null,_link,_request_data);
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="HttpJobRegister.GetRequest.SetContentType(\"appli";
_httpjobregister._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Wait For (HttpJobRegister) JobDone(HttpJobRegist";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "registernewcustomer"), (Object)(_httpjobregister));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobregister = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Try";
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
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="If HttpJobRegister.Success = False Then";
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
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("43145743","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("43145745","success",0);
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="Log(HttpJobRegister.GetString)";
parent.__c.LogImpl("43145746",_httpjobregister._getstring(null),0);
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="Output = HttpJobRegister.GetString";
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
RDebugUtils.currentLine=3145750;
 //BA.debugLineNum = 3145750;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("43145750",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="HttpJobRegister.Release";
_httpjobregister._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=3145754;
 //BA.debugLineNum = 3145754;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=3145755;
 //BA.debugLineNum = 3145755;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sendorder(b4a.diplomna.http_requests __ref,b4a.diplomna.types._order _o) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "sendorder", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sendorder", new Object[] {_o}));}
ResumableSub_SendOrder rsub = new ResumableSub_SendOrder(this,__ref,_o);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SendOrder extends BA.ResumableSub {
public ResumableSub_SendOrder(b4a.diplomna.http_requests parent,b4a.diplomna.http_requests __ref,b4a.diplomna.types._order _o) {
this.parent = parent;
this.__ref = __ref;
this._o = _o;
this.__ref = parent;
}
b4a.diplomna.http_requests __ref;
b4a.diplomna.http_requests parent;
b4a.diplomna.types._order _o;
String _request_data = "";
b4a.diplomna.httpjob _httpjobsendorder = null;
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
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._ordertojson(parent.getActivityBA(),_o).ToPrettyString((int) (1));
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("43014659",_request_data,0);
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Dim HttpJobSendOrder As HttpJob";
_httpjobsendorder = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Dim Link As String = \"http://\"& Support.Address";
_link = "http://"+parent._support._address+"/api/actions/SendOrder";
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="HttpJobSendOrder.Initialize(\"SendOrderJob\",Me)";
_httpjobsendorder._initialize(null,ba,"SendOrderJob",parent);
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="HttpJobSendOrder.PostString(Link,request_data)";
_httpjobsendorder._poststring(null,_link,_request_data);
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="HttpJobSendOrder.GetRequest.SetContentType(\"appl";
_httpjobsendorder._getrequest(null).SetContentType("application/json");
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="Wait For (HttpJobSendOrder) JobDone(HttpJobSendO";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "sendorder"), (Object)(_httpjobsendorder));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobsendorder = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="Try";
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
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="If HttpJobSendOrder.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobsendorder._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("43014671","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("43014673","success",0);
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="Log(HttpJobSendOrder.GetString)";
parent.__c.LogImpl("43014674",_httpjobsendorder._getstring(null),0);
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="Output = HttpJobSendOrder.GetString";
__ref._output = _httpjobsendorder._getstring(null);
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
RDebugUtils.currentLine=3014678;
 //BA.debugLineNum = 3014678;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("43014678",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=3014680;
 //BA.debugLineNum = 3014680;BA.debugLine="HttpJobSendOrder.Release";
_httpjobsendorder._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=3014683;
 //BA.debugLineNum = 3014683;BA.debugLine="End Sub";
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