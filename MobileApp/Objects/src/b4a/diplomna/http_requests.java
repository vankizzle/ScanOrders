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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public String  _initialize(b4a.diplomna.http_requests __ref,anywheresoftware.b4a.BA _ba,boolean _connection) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_connection}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub Initialize(Connection As Boolean)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="IsConnected = Connection";
__ref._isconnected = _connection;
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Private IsConnected As Boolean";
_isconnected = false;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Public Output As String";
_output = "";
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="End Sub";
return "";
}
public String  _clearouput(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "clearouput"))
	 {return ((String) Debug.delegate(ba, "clearouput", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub ClearOuput";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Output = \"\"";
__ref._output = "";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getgoodbyid(b4a.diplomna.http_requests __ref,int _goodid) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "getgoodbyid"))
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
String _gid = "";
anywheresoftware.b4a.samples.httputils2.httpjob _httpjobgoodbyid = null;
String _link = "";
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;

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
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim gID As String = GoodID";
_gid = BA.NumberToString(_goodid);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim HttpJobGoodByID As HttpJob";
_httpjobgoodbyid = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetGoodByID";
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="HttpJobGoodByID.Initialize(\"GetGoodJob\",Me)";
_httpjobgoodbyid._initialize(ba,"GetGoodJob",parent);
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="HttpJobGoodByID.PostString(Link,gID)";
_httpjobgoodbyid._poststring(_link,_gid);
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Wait For JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getgoodbyid"), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (anywheresoftware.b4a.samples.httputils2.httpjob) result[1];
;
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Try";
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
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="If Job.Success = False Then";
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
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Log(\"failed\")";
parent.__c.Log("failed");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Log(\"success\")";
parent.__c.Log("success");
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="Log(Job.GetString)";
parent.__c.Log(_job._getstring());
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="Output = Job.GetString";
__ref._output = _job._getstring();
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
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="Job.Release";
_job._release();
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=2752534;
 //BA.debugLineNum = 2752534;BA.debugLine="End Sub";
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
public String  _login(b4a.diplomna.http_requests __ref,String _username,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "login"))
	 {return ((String) Debug.delegate(ba, "login", new Object[] {_username,_password}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub Login(Username As String,Password As St";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="If IsConnected = True Then";
if (__ref._isconnected==__c.True) { 
 };
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="End Sub";
return "";
}
public String  _registernewcustomer(b4a.diplomna.http_requests __ref,b4a.diplomna.types._customer _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "registernewcustomer"))
	 {return ((String) Debug.delegate(ba, "registernewcustomer", new Object[] {_c}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub RegisterNewCustomer(C As Customer)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If IsConnected = True Then";
if (__ref._isconnected==__c.True) { 
 };
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _testjob(b4a.diplomna.http_requests __ref) throws Exception{
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "testjob"))
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
anywheresoftware.b4a.samples.httputils2.httpjob _httpjoblogin = null;
String _link = "";
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;

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
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim HttpJobLogin As HttpJob";
_httpjoblogin = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetUserForTest";
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
_httpjoblogin._initialize(ba,"LoginJob",parent);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="HttpJobLogin.Download(Link)";
_httpjoblogin._download(_link);
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="Wait For JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "testjob"), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (anywheresoftware.b4a.samples.httputils2.httpjob) result[1];
;
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Try";
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
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="If Job.Success = False Then";
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
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Log(\"login failed\")";
parent.__c.Log("login failed");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="Log(\"login success\")";
parent.__c.Log("login success");
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="Log(Job.GetString)";
parent.__c.Log(_job._getstring());
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
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="Job.Release";
_job._release();
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="End Sub";
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