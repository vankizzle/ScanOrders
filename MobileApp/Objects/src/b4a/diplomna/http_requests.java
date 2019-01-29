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
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.http_requests __ref,anywheresoftware.b4a.BA _ba,boolean _connection) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_connection}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub Initialize(Connection As Boolean)";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="IsConnected = Connection";
__ref._isconnected = _connection;
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
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
String _gid = "";
b4a.diplomna.httpjob _httpjobgoodbyid = null;
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
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Dim gID As String = GoodID";
_gid = BA.NumberToString(_goodid);
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Dim HttpJobGoodByID As HttpJob";
_httpjobgoodbyid = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetGoodByID";
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="HttpJobGoodByID.Initialize(\"GetGoodJob\",Me)";
_httpjobgoodbyid._initialize(null,ba,"GetGoodJob",parent);
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="HttpJobGoodByID.PostString(Link,gID)";
_httpjobgoodbyid._poststring(null,_link,_gid);
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="Wait For JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "getgoodbyid"), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="Try";
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
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="If Job.Success = False Then";
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
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("46619146","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("46619148","success",0);
RDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="Log(Job.GetString)";
parent.__c.LogImpl("46619149",_job._getstring(null),0);
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="Output = Job.GetString";
__ref._output = _job._getstring(null);
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
RDebugUtils.currentLine=6619153;
 //BA.debugLineNum = 6619153;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("46619153",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=6619155;
 //BA.debugLineNum = 6619155;BA.debugLine="Job.Release";
_job._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=6619157;
 //BA.debugLineNum = 6619157;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=6619158;
 //BA.debugLineNum = 6619158;BA.debugLine="End Sub";
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
public String  _class_globals(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Private IsConnected As Boolean";
_isconnected = false;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Public Output As String";
_output = "";
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="End Sub";
return "";
}
public String  _clearouput(b4a.diplomna.http_requests __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "clearouput", false))
	 {return ((String) Debug.delegate(ba, "clearouput", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub ClearOuput";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Output = \"\"";
__ref._output = "";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public String  _login(b4a.diplomna.http_requests __ref,String _username,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "login", false))
	 {return ((String) Debug.delegate(ba, "login", new Object[] {_username,_password}));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub Login(Username As String,Password As St";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="If IsConnected = True Then";
if (__ref._isconnected==__c.True) { 
 };
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="End Sub";
return "";
}
public String  _registernewcustomer(b4a.diplomna.http_requests __ref,b4a.diplomna.types._customer _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="http_requests";
if (Debug.shouldDelegate(ba, "registernewcustomer", false))
	 {return ((String) Debug.delegate(ba, "registernewcustomer", new Object[] {_c}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub RegisterNewCustomer(C As Customer)";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="If IsConnected = True Then";
if (__ref._isconnected==__c.True) { 
 };
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="If IsConnected = True Then";
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
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim HttpJobLogin As HttpJob";
_httpjoblogin = new b4a.diplomna.httpjob();
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetUserForTest";
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
_httpjoblogin._initialize(null,ba,"LoginJob",parent);
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="HttpJobLogin.Download(Link)";
_httpjoblogin._download(null,_link);
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="Wait For JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "http_requests", "testjob"), null);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_job = (b4a.diplomna.httpjob) result[1];
;
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="Try";
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
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="If Job.Success = False Then";
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
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="Log(\"login failed\")";
parent.__c.LogImpl("46815753","login failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="Log(\"login success\")";
parent.__c.LogImpl("46815755","login success",0);
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="Log(Job.GetString)";
parent.__c.LogImpl("46815756",_job._getstring(null),0);
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
RDebugUtils.currentLine=6815759;
 //BA.debugLineNum = 6815759;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("46815759",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=6815761;
 //BA.debugLineNum = 6815761;BA.debugLine="Job.Release";
_job._release(null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=6815764;
 //BA.debugLineNum = 6815764;BA.debugLine="End Sub";
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