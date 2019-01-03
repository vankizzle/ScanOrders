package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _firsttime;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="If (APIVersion >= 23) Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 12;
if ((RemoteObject.solveBoolean("g",_apiversion(),BA.numberCast(double.class, 23)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 38;BA.debugLine="RP.CheckAndRequest(RP.PERMISSION_WRITE_EXTERNAL_";
Debug.ShouldStop(32);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._rp.getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE")));
 BA.debugLineNum = 39;BA.debugLine="Wait For Activity_PermissionResult(Permission As";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 19;
return;
case 19:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 40;BA.debugLine="If Not (Result) Then";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_result)).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 41;BA.debugLine="Log(\"storage permission error\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("storage permission error")));
 BA.debugLineNum = 43;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 45;BA.debugLine="RP.CheckAndRequest(RP.PERMISSION_CAMERA)";
Debug.ShouldStop(4096);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._rp.getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 46;BA.debugLine="Wait For Activity_PermissionResult(Permission As";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 20;
return;
case 20:
//C
this.state = 8;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 47;BA.debugLine="If Not (Result) Then";
Debug.ShouldStop(16384);
if (true) break;

case 8:
//if
this.state = 11;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_result)).<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 48;BA.debugLine="Log(\"camera permission error\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("camera permission error")));
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 52;BA.debugLine="HTTP.Initialize(Connected)";
Debug.ShouldStop(524288);
parent._http.runClassMethod (b4a.example.http_requests.class, "_initialize",main.processBA,(Object)(_connected()));
 BA.debugLineNum = 54;BA.debugLine="LoggedCustomer.Initialize";
Debug.ShouldStop(2097152);
parent._loggedcustomer.runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="If ScreenX > ScreenY Then";
Debug.ShouldStop(8388608);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",parent._screenx,BA.numberCast(double.class, parent._screeny))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 57;BA.debugLine="IsLandscape = True";
Debug.ShouldStop(16777216);
parent._islandscape = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 59;BA.debugLine="IsLandscape = False";
Debug.ShouldStop(67108864);
parent._islandscape = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 61;BA.debugLine="UISizes.Initialize(IsLandscape)";
Debug.ShouldStop(268435456);
parent.mostCurrent._uisizes.runVoidMethod ("_initialize",main.mostCurrent.activityBA,(Object)(parent._islandscape));
 BA.debugLineNum = 63;BA.debugLine="ScreenLogin.Initialize";
Debug.ShouldStop(1073741824);
parent.mostCurrent._screenlogin.runClassMethod (b4a.example.loginscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="ScreenRegister.Initialize";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 65;BA.debugLine="AppMainScreen.Initialize";
Debug.ShouldStop(1);
parent.mostCurrent._appmainscreen.runClassMethod (b4a.example.mainscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 67;BA.debugLine="Activity.AddView(ScreenLogin.AsView,0,0,100%x,100";
Debug.ShouldStop(4);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._screenlogin.runClassMethod (b4a.example.loginscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 68;BA.debugLine="Activity.AddView(ScreenRegister.AsView,0,0,100%x,";
Debug.ShouldStop(8);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 69;BA.debugLine="Activity.AddView(AppMainScreen.AsView,0,0,100%x,1";
Debug.ShouldStop(16);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._appmainscreen.runClassMethod (b4a.example.mainscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 71;BA.debugLine="ScreenRegister.AsView.Visible = False";
Debug.ShouldStop(64);
parent.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 72;BA.debugLine="ScreenRegister.AsView.Enabled = False";
Debug.ShouldStop(128);
parent.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="AppMainScreen.AsView.Visible = False";
Debug.ShouldStop(512);
parent.mostCurrent._appmainscreen.runClassMethod (b4a.example.mainscreen.class, "_asview").runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="AppMainScreen.AsView.Enabled = False";
Debug.ShouldStop(1024);
parent.mostCurrent._appmainscreen.runClassMethod (b4a.example.mainscreen.class, "_asview").runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;

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
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,102);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,98);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 98;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _apiversion() throws Exception{
try {
		Debug.PushSubsStack("APIVersion (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,106);
if (RapidSub.canDelegate("apiversion")) { return b4a.example.main.remoteMe.runUserSub(false, "main","apiversion");}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _api = RemoteObject.createImmutable(0);
 BA.debugLineNum = 106;BA.debugLine="Public Sub APIVersion As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1024);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 108;BA.debugLine="Dim Api As Int";
Debug.ShouldStop(2048);
_api = RemoteObject.createImmutable(0);Debug.locals.put("Api", _api);
 BA.debugLineNum = 109;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
Debug.ShouldStop(4096);
_api = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.os.Build$VERSION")),(Object)(RemoteObject.createImmutable("SDK_INT"))));Debug.locals.put("Api", _api);
 BA.debugLineNum = 110;BA.debugLine="Return Api";
Debug.ShouldStop(8192);
if (true) return _api;
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _connected() throws Exception{
try {
		Debug.PushSubsStack("Connected (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,113);
if (RapidSub.canDelegate("connected")) { return b4a.example.main.remoteMe.runUserSub(false, "main","connected");}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _error = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 113;BA.debugLine="Sub Connected As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 116;BA.debugLine="Dim Response, Error As StringBuilder";
Debug.ShouldStop(524288);
_response = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Response", _response);
_error = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Error", _error);
 BA.debugLineNum = 117;BA.debugLine="Response.Initialize";
Debug.ShouldStop(1048576);
_response.runVoidMethod ("Initialize");
 BA.debugLineNum = 118;BA.debugLine="Error.Initialize";
Debug.ShouldStop(2097152);
_error.runVoidMethod ("Initialize");
 BA.debugLineNum = 120;BA.debugLine="p.Shell(\"ping -c 1 8.8.8.8\",Null,Response,Error)";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("Shell",(Object)(BA.ObjectToString("ping -c 1 8.8.8.8")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),(Object)((_response.getObject())),(Object)((_error.getObject())));
 BA.debugLineNum = 121;BA.debugLine="Log(\"======= Response ========\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("======= Response ========")));
 BA.debugLineNum = 122;BA.debugLine="Log(Response)";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_response)));
 BA.debugLineNum = 123;BA.debugLine="Log(\"======= Error ===========\")";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("======= Error ===========")));
 BA.debugLineNum = 124;BA.debugLine="Log(Error)";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_error)));
 BA.debugLineNum = 125;BA.debugLine="Log(\"======================\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("======================")));
 BA.debugLineNum = 127;BA.debugLine="If Error.ToString=\"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_error.runMethod(true,"ToString"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 128;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 130;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) return main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private ScreenLogin As LoginScreen";
main.mostCurrent._screenlogin = RemoteObject.createNew ("b4a.example.loginscreen");
 //BA.debugLineNum = 27;BA.debugLine="Private ScreenRegister As RegisterScreen";
main.mostCurrent._screenregister = RemoteObject.createNew ("b4a.example.registerscreen");
 //BA.debugLineNum = 28;BA.debugLine="Public AppMainScreen As MainScreen";
main.mostCurrent._appmainscreen = RemoteObject.createNew ("b4a.example.mainscreen");
 //BA.debugLineNum = 30;BA.debugLine="Public ScreenX, ScreenY As Int";
main._screenx = RemoteObject.createImmutable(0);
main._screeny = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 31;BA.debugLine="Public IsLandscape As Boolean";
main._islandscape = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
types_subs_0._process_globals();
uisizes_subs_0._process_globals();
support_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
types.myClass = BA.getDeviceClass ("b4a.example.types");
loginscreen.myClass = BA.getDeviceClass ("b4a.example.loginscreen");
registerscreen.myClass = BA.getDeviceClass ("b4a.example.registerscreen");
uisizes.myClass = BA.getDeviceClass ("b4a.example.uisizes");
support.myClass = BA.getDeviceClass ("b4a.example.support");
mainscreen.myClass = BA.getDeviceClass ("b4a.example.mainscreen");
http_requests.myClass = BA.getDeviceClass ("b4a.example.http_requests");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public LoggedCustomer As Customer";
main._loggedcustomer = RemoteObject.createNew ("b4a.example.types._customer");
 //BA.debugLineNum = 19;BA.debugLine="Public RP As RuntimePermissions";
main._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 20;BA.debugLine="Public HTTP As HTTP_Requests";
main._http = RemoteObject.createNew ("b4a.example.http_requests");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showmainscreen() throws Exception{
try {
		Debug.PushSubsStack("ShowMainScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,88);
if (RapidSub.canDelegate("showmainscreen")) { return b4a.example.main.remoteMe.runUserSub(false, "main","showmainscreen");}
 BA.debugLineNum = 88;BA.debugLine="Public Sub ShowMainScreen";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="If 	AppMainScreen.AsView.Visible = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main.mostCurrent._appmainscreen.runClassMethod (b4a.example.mainscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 90;BA.debugLine="AppMainScreen.AsView.Visible = True";
Debug.ShouldStop(33554432);
main.mostCurrent._appmainscreen.runClassMethod (b4a.example.mainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 91;BA.debugLine="AppMainScreen.AsView.Enabled = True";
Debug.ShouldStop(67108864);
main.mostCurrent._appmainscreen.runClassMethod (b4a.example.mainscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 93;BA.debugLine="AppMainScreen.AsView.Visible = False";
Debug.ShouldStop(268435456);
main.mostCurrent._appmainscreen.runClassMethod (b4a.example.mainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 94;BA.debugLine="AppMainScreen.AsView.Enabled = False";
Debug.ShouldStop(536870912);
main.mostCurrent._appmainscreen.runClassMethod (b4a.example.mainscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showregisterscreen() throws Exception{
try {
		Debug.PushSubsStack("ShowRegisterScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,78);
if (RapidSub.canDelegate("showregisterscreen")) { return b4a.example.main.remoteMe.runUserSub(false, "main","showregisterscreen");}
 BA.debugLineNum = 78;BA.debugLine="Public Sub ShowRegisterScreen";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="If 	ScreenRegister.AsView.Visible = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 80;BA.debugLine="ScreenRegister.AsView.Visible = True";
Debug.ShouldStop(32768);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="ScreenRegister.AsView.Enabled = True";
Debug.ShouldStop(65536);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 83;BA.debugLine="ScreenRegister.AsView.Visible = False";
Debug.ShouldStop(262144);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="ScreenRegister.AsView.Enabled = False";
Debug.ShouldStop(524288);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}