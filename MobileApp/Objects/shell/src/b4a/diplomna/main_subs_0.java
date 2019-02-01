package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) { b4a.diplomna.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
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
public ResumableSub_Activity_Create(b4a.diplomna.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.diplomna.main parent;
RemoteObject _firsttime;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="If (APIVersion >= 23) Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 40;BA.debugLine="RP.CheckAndRequest(RP.PERMISSION_WRITE_EXTERNAL_";
Debug.ShouldStop(128);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._rp.getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE")));
 BA.debugLineNum = 41;BA.debugLine="Wait For Activity_PermissionResult(Permission As";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), null);
this.state = 19;
return;
case 19:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 42;BA.debugLine="If Not (Result) Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 43;BA.debugLine="Log(\"storage permission error\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4131079",RemoteObject.createImmutable("storage permission error"),0);
 BA.debugLineNum = 45;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 47;BA.debugLine="RP.CheckAndRequest(RP.PERMISSION_CAMERA)";
Debug.ShouldStop(16384);
parent._rp.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent._rp.getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 48;BA.debugLine="Wait For Activity_PermissionResult(Permission As";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), null);
this.state = 20;
return;
case 20:
//C
this.state = 8;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 49;BA.debugLine="If Not (Result) Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 50;BA.debugLine="Log(\"camera permission error\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4131086",RemoteObject.createImmutable("camera permission error"),0);
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
 BA.debugLineNum = 54;BA.debugLine="HTTP.Initialize(Connected)";
Debug.ShouldStop(2097152);
parent._http.runClassMethod (b4a.diplomna.http_requests.class, "_initialize",main.processBA,(Object)(_connected()));
 BA.debugLineNum = 56;BA.debugLine="LoggedCustomer.Initialize";
Debug.ShouldStop(8388608);
parent._loggedcustomer.runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="If ScreenX > ScreenY Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 59;BA.debugLine="IsLandscape = True";
Debug.ShouldStop(67108864);
parent._islandscape = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 61;BA.debugLine="IsLandscape = False";
Debug.ShouldStop(268435456);
parent._islandscape = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 63;BA.debugLine="UISizes.Initialize(IsLandscape)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._uisizes.runVoidMethod ("_initialize",main.mostCurrent.activityBA,(Object)(parent._islandscape));
 BA.debugLineNum = 65;BA.debugLine="ScreenLogin.Initialize";
Debug.ShouldStop(1);
parent.mostCurrent._screenlogin.runClassMethod (b4a.diplomna.loginscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 66;BA.debugLine="ScreenRegister.Initialize";
Debug.ShouldStop(2);
parent.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 67;BA.debugLine="AppMainScreen.Initialize";
Debug.ShouldStop(4);
parent.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 68;BA.debugLine="ClientOrders.Initialize";
Debug.ShouldStop(8);
parent.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 69;BA.debugLine="AppSettings.Initialize";
Debug.ShouldStop(16);
parent.mostCurrent._appsettings.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 71;BA.debugLine="Activity.AddView(ScreenLogin.AsView,0,0,100%x,100";
Debug.ShouldStop(64);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._screenlogin.runClassMethod (b4a.diplomna.loginscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 72;BA.debugLine="Activity.AddView(ScreenRegister.AsView,0,0,100%x,";
Debug.ShouldStop(128);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 73;BA.debugLine="Activity.AddView(AppMainScreen.AsView,0,0,100%x,1";
Debug.ShouldStop(256);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 74;BA.debugLine="Activity.AddView(ClientOrders.AsView,0,0,100%x,10";
Debug.ShouldStop(512);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 75;BA.debugLine="Activity.AddView(AppSettings.AsView,-29%x,5%y,29%";
Debug.ShouldStop(1024);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._appsettings.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 77;BA.debugLine="ScreenRegister.AsView.Visible = False";
Debug.ShouldStop(4096);
parent.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_asview").runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="ScreenRegister.AsView.Enabled = False";
Debug.ShouldStop(8192);
parent.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_asview").runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="AppMainScreen.AsView.Visible = False";
Debug.ShouldStop(32768);
parent.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 81;BA.debugLine="AppMainScreen.AsView.Enabled = False";
Debug.ShouldStop(65536);
parent.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 83;BA.debugLine="ClientOrders.AsView.Visible = False";
Debug.ShouldStop(262144);
parent.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="ClientOrders.AsView.Enabled = False";
Debug.ShouldStop(524288);
parent.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,197);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
RemoteObject _ext = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 197;BA.debugLine="Private Sub Activity_KeyPress (KeyCode As Int) As";
Debug.ShouldStop(16);
 BA.debugLineNum = 199;BA.debugLine="Dim ext As Int = 0";
Debug.ShouldStop(64);
_ext = BA.numberCast(int.class, 0);Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 200;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 202;BA.debugLine="If ScreenRegister.AsView.Visible = True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 203;BA.debugLine="ShowRegisterScreen";
Debug.ShouldStop(1024);
_showregisterscreen();
 BA.debugLineNum = 204;BA.debugLine="ext = ext + 1";
Debug.ShouldStop(2048);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ext", _ext);
 };
 BA.debugLineNum = 207;BA.debugLine="If AppMainScreen.AsView.Visible = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 208;BA.debugLine="If AppMainScreen.SettingsIsVisible = 0%x Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_settingsisvisible"),BA.numberCast(double.class, main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 209;BA.debugLine="AppMainScreen.Settings_Click";
Debug.ShouldStop(65536);
main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_settings_click");
 };
 BA.debugLineNum = 211;BA.debugLine="ShowMainScreen";
Debug.ShouldStop(262144);
_showmainscreen();
 BA.debugLineNum = 212;BA.debugLine="ext = ext + 1";
Debug.ShouldStop(524288);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ext", _ext);
 };
 BA.debugLineNum = 215;BA.debugLine="If ScreenLogin.SettingsIsVisible = 0%x Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent._screenlogin.runClassMethod (b4a.diplomna.loginscreen.class, "_settingsisvisible"),BA.numberCast(double.class, main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 216;BA.debugLine="ScreenLogin.Settings_Click";
Debug.ShouldStop(8388608);
main.mostCurrent._screenlogin.runClassMethod (b4a.diplomna.loginscreen.class, "_settings_click");
 BA.debugLineNum = 217;BA.debugLine="ext = ext + 1";
Debug.ShouldStop(16777216);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ext", _ext);
 };
 BA.debugLineNum = 220;BA.debugLine="ext = ext - 1";
Debug.ShouldStop(134217728);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 222;BA.debugLine="If ext = -1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_ext,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 223;BA.debugLine="ExitApp";
Debug.ShouldStop(1073741824);
_exitapp();
 };
 BA.debugLineNum = 226;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 228;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) return main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,158);
if (RapidSub.canDelegate("activity_pause")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 158;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,154);
if (RapidSub.canDelegate("activity_resume")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 154;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("APIVersion (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,162);
if (RapidSub.canDelegate("apiversion")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","apiversion");}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _api = RemoteObject.createImmutable(0);
 BA.debugLineNum = 162;BA.debugLine="Public Sub APIVersion As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(4);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 164;BA.debugLine="Dim Api As Int";
Debug.ShouldStop(8);
_api = RemoteObject.createImmutable(0);Debug.locals.put("Api", _api);
 BA.debugLineNum = 165;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
Debug.ShouldStop(16);
_api = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.os.Build$VERSION")),(Object)(RemoteObject.createImmutable("SDK_INT"))));Debug.locals.put("Api", _api);
 BA.debugLineNum = 166;BA.debugLine="Return Api";
Debug.ShouldStop(32);
if (true) return _api;
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Connected (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,170);
if (RapidSub.canDelegate("connected")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","connected");}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _error = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 170;BA.debugLine="Sub Connected As Boolean";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 172;BA.debugLine="Dim Response, Error As StringBuilder";
Debug.ShouldStop(2048);
_response = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Response", _response);
_error = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Error", _error);
 BA.debugLineNum = 173;BA.debugLine="Response.Initialize";
Debug.ShouldStop(4096);
_response.runVoidMethod ("Initialize");
 BA.debugLineNum = 174;BA.debugLine="Error.Initialize";
Debug.ShouldStop(8192);
_error.runVoidMethod ("Initialize");
 BA.debugLineNum = 175;BA.debugLine="p.Shell(\"ping -c 1 8.8.8.8\",Null,Response,Error)";
Debug.ShouldStop(16384);
_p.runVoidMethod ("Shell",(Object)(BA.ObjectToString("ping -c 1 8.8.8.8")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),(Object)((_response.getObject())),(Object)((_error.getObject())));
 BA.debugLineNum = 176;BA.debugLine="Log(\"======= Response ========\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("LogImpl","43670022",RemoteObject.createImmutable("======= Response ========"),0);
 BA.debugLineNum = 177;BA.debugLine="Log(Response)";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("LogImpl","43670023",BA.ObjectToString(_response),0);
 BA.debugLineNum = 178;BA.debugLine="Log(\"======= Error ===========\")";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("LogImpl","43670024",RemoteObject.createImmutable("======= Error ==========="),0);
 BA.debugLineNum = 179;BA.debugLine="Log(Error)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("LogImpl","43670025",BA.ObjectToString(_error),0);
 BA.debugLineNum = 180;BA.debugLine="Log(\"======================\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("LogImpl","43670026",RemoteObject.createImmutable("======================"),0);
 BA.debugLineNum = 182;BA.debugLine="If Error.ToString=\"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_error.runMethod(true,"ToString"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 183;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) return main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 185;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) return main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exitapp() throws Exception{
try {
		Debug.PushSubsStack("ExitApp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,189);
if (RapidSub.canDelegate("exitapp")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","exitapp");}
RemoteObject _result = RemoteObject.createImmutable(0);
 BA.debugLineNum = 189;BA.debugLine="Public Sub ExitApp";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="Dim result As Int";
Debug.ShouldStop(536870912);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 191;BA.debugLine="result = Msgbox2(\"Exit App?\",\"Exit\",\"Yes\",\"Cancel";
Debug.ShouldStop(1073741824);
_result = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Exit App?")),(Object)(BA.ObjectToCharSequence("Exit")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 192;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 193;BA.debugLine="ExitApplication";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
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
main.mostCurrent._screenlogin = RemoteObject.createNew ("b4a.diplomna.loginscreen");
 //BA.debugLineNum = 27;BA.debugLine="Private ScreenRegister As RegisterScreen";
main.mostCurrent._screenregister = RemoteObject.createNew ("b4a.diplomna.registerscreen");
 //BA.debugLineNum = 28;BA.debugLine="Private AppMainScreen As MainScreen";
main.mostCurrent._appmainscreen = RemoteObject.createNew ("b4a.diplomna.mainscreen");
 //BA.debugLineNum = 29;BA.debugLine="Private ClientOrders As ClientOrdersScreen";
main.mostCurrent._clientorders = RemoteObject.createNew ("b4a.diplomna.clientordersscreen");
 //BA.debugLineNum = 30;BA.debugLine="Private AppSettings As AppSettingsScreen";
main.mostCurrent._appsettings = RemoteObject.createNew ("b4a.diplomna.appsettingsscreen");
 //BA.debugLineNum = 32;BA.debugLine="Public ScreenX, ScreenY As Int";
main._screenx = RemoteObject.createImmutable(0);
main._screeny = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 33;BA.debugLine="Public IsLandscape As Boolean";
main._islandscape = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hideappsettingsscreen() throws Exception{
try {
		Debug.PushSubsStack("HideAppSettingsScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,142);
if (RapidSub.canDelegate("hideappsettingsscreen")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","hideappsettingsscreen");}
 BA.debugLineNum = 142;BA.debugLine="Public Sub HideAppSettingsScreen";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="If AppSettings.AsView.Left = 0%x Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main.mostCurrent._appsettings.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 144;BA.debugLine="AppSettings.AsView.SetLayoutAnimated(500,-29%x,5";
Debug.ShouldStop(32768);
main.mostCurrent._appsettings.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 };
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hideclientordersscreen() throws Exception{
try {
		Debug.PushSubsStack("HideClientOrdersScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,137);
if (RapidSub.canDelegate("hideclientordersscreen")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","hideclientordersscreen");}
 BA.debugLineNum = 137;BA.debugLine="Public Sub HideClientOrdersScreen";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="ClientOrders.AsView.Visible = False";
Debug.ShouldStop(512);
main.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 139;BA.debugLine="ClientOrders.AsView.Enabled = False";
Debug.ShouldStop(1024);
main.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidemainscreen() throws Exception{
try {
		Debug.PushSubsStack("HideMainScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,132);
if (RapidSub.canDelegate("hidemainscreen")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","hidemainscreen");}
 BA.debugLineNum = 132;BA.debugLine="Public Sub HideMainScreen";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="AppMainScreen.AsView.Visible = False";
Debug.ShouldStop(16);
main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 134;BA.debugLine="AppMainScreen.AsView.Enabled = False";
Debug.ShouldStop(32);
main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidesettingswindows() throws Exception{
try {
		Debug.PushSubsStack("HideSettingsWindows (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,148);
if (RapidSub.canDelegate("hidesettingswindows")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","hidesettingswindows");}
 BA.debugLineNum = 148;BA.debugLine="Public Sub HideSettingsWindows";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="ScreenLogin.HideSettings";
Debug.ShouldStop(1048576);
main.mostCurrent._screenlogin.runClassMethod (b4a.diplomna.loginscreen.class, "_hidesettings");
 BA.debugLineNum = 150;BA.debugLine="AppMainScreen.HideSettings";
Debug.ShouldStop(2097152);
main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_hidesettings");
 BA.debugLineNum = 151;BA.debugLine="ClientOrders.HideSettings";
Debug.ShouldStop(4194304);
main.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_hidesettings");
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
jsonserializations_subs_0._process_globals();
types_subs_0._process_globals();
appcolors_subs_0._process_globals();
uisizes_subs_0._process_globals();
data_subs_0._process_globals();
support_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.diplomna.main");
http_requests.myClass = BA.getDeviceClass ("b4a.diplomna.http_requests");
mainscreen.myClass = BA.getDeviceClass ("b4a.diplomna.mainscreen");
jsonserializations.myClass = BA.getDeviceClass ("b4a.diplomna.jsonserializations");
shoppingcart.myClass = BA.getDeviceClass ("b4a.diplomna.shoppingcart");
types.myClass = BA.getDeviceClass ("b4a.diplomna.types");
loginscreen.myClass = BA.getDeviceClass ("b4a.diplomna.loginscreen");
registerscreen.myClass = BA.getDeviceClass ("b4a.diplomna.registerscreen");
iteminfovisualizer.myClass = BA.getDeviceClass ("b4a.diplomna.iteminfovisualizer");
orderscart.myClass = BA.getDeviceClass ("b4a.diplomna.orderscart");
appcolors.myClass = BA.getDeviceClass ("b4a.diplomna.appcolors");
uisizes.myClass = BA.getDeviceClass ("b4a.diplomna.uisizes");
orderinfovisualizer.myClass = BA.getDeviceClass ("b4a.diplomna.orderinfovisualizer");
settingsmenu.myClass = BA.getDeviceClass ("b4a.diplomna.settingsmenu");
appsettingsscreen.myClass = BA.getDeviceClass ("b4a.diplomna.appsettingsscreen");
data.myClass = BA.getDeviceClass ("b4a.diplomna.data");
clientordersscreen.myClass = BA.getDeviceClass ("b4a.diplomna.clientordersscreen");
support.myClass = BA.getDeviceClass ("b4a.diplomna.support");
generalsettingsscreen.myClass = BA.getDeviceClass ("b4a.diplomna.generalsettingsscreen");
myordersscreen.myClass = BA.getDeviceClass ("b4a.diplomna.myordersscreen");
starter.myClass = BA.getDeviceClass ("b4a.diplomna.starter");
httputils2service.myClass = BA.getDeviceClass ("b4a.diplomna.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.diplomna.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public LoggedCustomer As Customer";
main._loggedcustomer = RemoteObject.createNew ("b4a.diplomna.types._customer");
 //BA.debugLineNum = 19;BA.debugLine="Public RP As RuntimePermissions";
main._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 20;BA.debugLine="Public HTTP As HTTP_Requests";
main._http = RemoteObject.createNew ("b4a.diplomna.http_requests");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showclientordersscreen() throws Exception{
try {
		Debug.PushSubsStack("ShowClientOrdersScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,112);
if (RapidSub.canDelegate("showclientordersscreen")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","showclientordersscreen");}
 BA.debugLineNum = 112;BA.debugLine="Public Sub ShowClientOrdersScreen";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="If 	ClientOrders.AsView.Visible = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",main.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 114;BA.debugLine="ClientOrders.AsView.Visible = True";
Debug.ShouldStop(131072);
main.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="ClientOrders.AsView.Enabled = True";
Debug.ShouldStop(262144);
main.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 117;BA.debugLine="ClientOrders.AsView.Visible = False";
Debug.ShouldStop(1048576);
main.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 118;BA.debugLine="ClientOrders.AsView.Enabled = False";
Debug.ShouldStop(2097152);
main.mostCurrent._clientorders.runClassMethod (b4a.diplomna.clientordersscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showhideappsettingsscreen() throws Exception{
try {
		Debug.PushSubsStack("ShowHideAppSettingsScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,122);
if (RapidSub.canDelegate("showhideappsettingsscreen")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","showhideappsettingsscreen");}
 BA.debugLineNum = 122;BA.debugLine="Public Sub ShowHideAppSettingsScreen";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="If AppSettings.AsView.Left = -29%x Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main.mostCurrent._appsettings.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA).<Integer>get().intValue())))) { 
 BA.debugLineNum = 125;BA.debugLine="AppSettings.AsView.SetLayoutAnimated(500,0%x,5%y";
Debug.ShouldStop(268435456);
main.mostCurrent._appsettings.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 }else 
{ BA.debugLineNum = 126;BA.debugLine="Else if AppSettings.AsView.Left = 0%x Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main.mostCurrent._appsettings.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 127;BA.debugLine="AppSettings.AsView.SetLayoutAnimated(500,-29%x,5";
Debug.ShouldStop(1073741824);
main.mostCurrent._appsettings.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 }}
;
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showiteminfo(RemoteObject _g,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("ShowItemInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,233);
if (RapidSub.canDelegate("showiteminfo")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","showiteminfo", _g, _s);}
Debug.locals.put("g", _g);
Debug.locals.put("s", _s);
 BA.debugLineNum = 233;BA.debugLine="Public Sub ShowItemInfo(g As Good,s As Supplier)";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="AppMainScreen.InfoScreen.SetCurrentInfo(g,s)";
Debug.ShouldStop(512);
main.mostCurrent._appmainscreen.getField(false,"_infoscreen").runClassMethod (b4a.diplomna.iteminfovisualizer.class, "_setcurrentinfo",(Object)(_g),(Object)(_s));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showmainscreen() throws Exception{
try {
		Debug.PushSubsStack("ShowMainScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,102);
if (RapidSub.canDelegate("showmainscreen")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","showmainscreen");}
 BA.debugLineNum = 102;BA.debugLine="Public Sub ShowMainScreen";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="If 	AppMainScreen.AsView.Visible = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 104;BA.debugLine="AppMainScreen.AsView.Visible = True";
Debug.ShouldStop(128);
main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 105;BA.debugLine="AppMainScreen.AsView.Enabled = True";
Debug.ShouldStop(256);
main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 107;BA.debugLine="AppMainScreen.AsView.Visible = False";
Debug.ShouldStop(1024);
main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 108;BA.debugLine="AppMainScreen.AsView.Enabled = False";
Debug.ShouldStop(2048);
main.mostCurrent._appmainscreen.runClassMethod (b4a.diplomna.mainscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showorderinfo(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("ShowOrderInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,88);
if (RapidSub.canDelegate("showorderinfo")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","showorderinfo", _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 88;BA.debugLine="Public Sub ShowOrderInfo(o As LocalOrder)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="ClientOrders.OrderInfoVisual.SetCurrentInfo(o)";
Debug.ShouldStop(16777216);
main.mostCurrent._clientorders.getField(false,"_orderinfovisual").runClassMethod (b4a.diplomna.orderinfovisualizer.class, "_setcurrentinfo",(Object)(_o));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ShowRegisterScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("showregisterscreen")) { return b4a.diplomna.main.remoteMe.runUserSub(false, "main","showregisterscreen");}
 BA.debugLineNum = 92;BA.debugLine="Public Sub ShowRegisterScreen";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="If 	ScreenRegister.AsView.Visible = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 94;BA.debugLine="ScreenRegister.AsView.Visible = True";
Debug.ShouldStop(536870912);
main.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="ScreenRegister.AsView.Enabled = True";
Debug.ShouldStop(1073741824);
main.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 97;BA.debugLine="ScreenRegister.AsView.Visible = False";
Debug.ShouldStop(1);
main.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 98;BA.debugLine="ScreenRegister.AsView.Enabled = False";
Debug.ShouldStop(2);
main.mostCurrent._screenregister.runClassMethod (b4a.diplomna.registerscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 };
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
}