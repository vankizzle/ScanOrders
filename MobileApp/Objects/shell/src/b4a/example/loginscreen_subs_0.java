package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "loginscreen","asview", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Return ScreenPnl";
Debug.ShouldStop(64);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_screenpnl").getObject());
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "loginscreen","buildui", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="ScreenPnl.Color = Colors.White";
Debug.ShouldStop(16);
__ref.getField(false,"_screenpnl").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 39;BA.debugLine="usernametxt.Color = Colors.White";
Debug.ShouldStop(64);
__ref.getField(false,"_usernametxt").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 41;BA.debugLine="usernametxt.Hint = \"Username\"";
Debug.ShouldStop(256);
__ref.getField(false,"_usernametxt").runMethod(true,"setHint",BA.ObjectToString("Username"));
 BA.debugLineNum = 42;BA.debugLine="usernametxt.HintColor = Colors.LightGray";
Debug.ShouldStop(512);
__ref.getField(false,"_usernametxt").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 43;BA.debugLine="usernametxt.SingleLine = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_usernametxt").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 44;BA.debugLine="passwordtxt.Hint = \"Password\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHint",BA.ObjectToString("Password"));
 BA.debugLineNum = 45;BA.debugLine="passwordtxt.SingleLine = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_passwordtxt").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="passwordtxt.HintColor = Colors.LightGray";
Debug.ShouldStop(8192);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 47;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
Debug.ShouldStop(16384);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_usernametxt").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 48;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
Debug.ShouldStop(32768);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_passwordtxt").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 50;BA.debugLine="loginbtn.Text = \"Login\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_loginbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Login"));
 BA.debugLineNum = 51;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(262144);
__ref.getField(false,"_loginbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 52;BA.debugLine="Support.ApplyViewStyle(loginbtn,Colors.DarkGray,C";
Debug.ShouldStop(524288);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_loginbtn").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 54;BA.debugLine="registerbtn.Text = \"Register\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_registerbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Register"));
 BA.debugLineNum = 55;BA.debugLine="registerbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(4194304);
__ref.getField(false,"_registerbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 56;BA.debugLine="Support.ApplyViewStyle(registerbtn,Colors.DarkGra";
Debug.ShouldStop(8388608);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_registerbtn").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 58;BA.debugLine="ScreenLogo.Color = Colors.DarkGray";
Debug.ShouldStop(33554432);
__ref.getField(false,"_screenlogo").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 60;BA.debugLine="Logo.Bitmap = LoadBitmap(File.DirAssets,\"express-";
Debug.ShouldStop(134217728);
__ref.getField(false,"_logo").runMethod(false,"setBitmap",(loginscreen.__c.runMethod(false,"LoadBitmap",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("express-shop-logo-01.jpg"))).getObject()));
 BA.debugLineNum = 61;BA.debugLine="Logo.Gravity = Gravity.FILL";
Debug.ShouldStop(268435456);
__ref.getField(false,"_logo").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 62;BA.debugLine="ScreenPnl.AddView(ScreenLogo,UISizes.LoginScrDefa";
Debug.ShouldStop(536870912);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_screenlogo").getObject())),(Object)(loginscreen._uisizes._loginscrdefaultleft),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 63;BA.debugLine="ScreenPnl.AddView(usernametxt,ScreenLogo.Left,Scr";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernametxt").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_screenlogo").runMethod(true,"getTop"),__ref.getField(false,"_screenlogo").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 64;BA.debugLine="ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,Scre";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_screenlogo").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_logo").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getHeight")));
 BA.debugLineNum = 65;BA.debugLine="ScreenPnl.AddView(passwordtxt,ScreenLogo.Left,use";
Debug.ShouldStop(1);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_passwordtxt").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_usernametxt").runMethod(true,"getTop"),__ref.getField(false,"_usernametxt").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 66;BA.debugLine="ScreenPnl.AddView(loginbtn,ScreenLogo.Left,passwo";
Debug.ShouldStop(2);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_loginbtn").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_passwordtxt").runMethod(true,"getTop"),__ref.getField(false,"_passwordtxt").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 67;BA.debugLine="ScreenPnl.AddView(registerbtn,ScreenLogo.Left,log";
Debug.ShouldStop(4);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_registerbtn").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginbtn").runMethod(true,"getTop"),__ref.getField(false,"_loginbtn").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
loginscreen._screenpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_screenpnl",loginscreen._screenpnl);
 //BA.debugLineNum = 3;BA.debugLine="Private ScreenLogo As Panel";
loginscreen._screenlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_screenlogo",loginscreen._screenlogo);
 //BA.debugLineNum = 4;BA.debugLine="Private Logo As ImageView";
loginscreen._logo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_logo",loginscreen._logo);
 //BA.debugLineNum = 6;BA.debugLine="Private usernametxt As EditText";
loginscreen._usernametxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_usernametxt",loginscreen._usernametxt);
 //BA.debugLineNum = 7;BA.debugLine="Private passwordtxt As EditText";
loginscreen._passwordtxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_passwordtxt",loginscreen._passwordtxt);
 //BA.debugLineNum = 12;BA.debugLine="Private loginbtn As Button";
loginscreen._loginbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_loginbtn",loginscreen._loginbtn);
 //BA.debugLineNum = 13;BA.debugLine="Private registerbtn As Button";
loginscreen._registerbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_registerbtn",loginscreen._registerbtn);
 //BA.debugLineNum = 14;BA.debugLine="Private settingsbtn As Button";
loginscreen._settingsbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_settingsbtn",loginscreen._settingsbtn);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "loginscreen","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="ScreenPnl.Initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_screenpnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="ScreenLogo.Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_screenlogo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 22;BA.debugLine="Logo.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_logo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 23;BA.debugLine="usernametxt.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_usernametxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="passwordtxt.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_passwordtxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 27;BA.debugLine="loginbtn.Initialize(\"Login\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_loginbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Login")));
 BA.debugLineNum = 28;BA.debugLine="registerbtn.Initialize(\"Register\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_registerbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Register")));
 BA.debugLineNum = 29;BA.debugLine="settingsbtn.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_settingsbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 32;BA.debugLine="BuildUI";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.loginscreen.class, "_buildui");
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("JobDone (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "loginscreen","jobdone", __ref, _job);}
Debug.locals.put("Job", _job);
 BA.debugLineNum = 92;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),loginscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 94;BA.debugLine="Log(\"login failed\")";
Debug.ShouldStop(536870912);
loginscreen.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("login failed")));
 }else {
 BA.debugLineNum = 96;BA.debugLine="Log(\"login success\")";
Debug.ShouldStop(-2147483648);
loginscreen.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("login success")));
 BA.debugLineNum = 97;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(1);
loginscreen.__c.runVoidMethod ("Log",(Object)(_job.runMethod(true,"_getstring")));
 };
 BA.debugLineNum = 99;BA.debugLine="Job.Release";
Debug.ShouldStop(4);
_job.runVoidMethod ("_release");
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
public static void  _login_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Login_Click (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("login_click")) { __ref.runUserSub(false, "loginscreen","login_click", __ref); return;}
ResumableSub_Login_Click rsub = new ResumableSub_Login_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Login_Click extends BA.ResumableSub {
public ResumableSub_Login_Click(b4a.example.loginscreen parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.loginscreen parent;
RemoteObject _test = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Login_Click (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,74);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 75;BA.debugLine="If usernametxt.TextSize > 0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_usernametxt").runMethod(true,"getTextSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 76;BA.debugLine="If passwordtxt.TextSize > 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_passwordtxt").runMethod(true,"getTextSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 77;BA.debugLine="Dim test As ResumableSub = Main.HTTP.GetGoodBy";
Debug.ShouldStop(4096);
_test = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_test = parent._main._http.runClassMethod (b4a.example.http_requests.class, "_getgoodbyid",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("test", _test);Debug.locals.put("test", _test);
 BA.debugLineNum = 78;BA.debugLine="Wait For (test)  Complete (Result As Object)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _test);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 79;BA.debugLine="If Result = False Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_result,(parent.__c.getField(true,"False")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 80;BA.debugLine="Log(\"LOGIN FAILED\")";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("LOGIN FAILED")));
 if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 85;BA.debugLine="ToastMessageShow(\"Enter Password!\",False)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Enter Password!")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 88;BA.debugLine="ToastMessageShow(\"Enter Username!\",False)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Enter Username!")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _register_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Register_Click (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("register_click")) { return __ref.runUserSub(false, "loginscreen","register_click", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Sub Register_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
Debug.ShouldStop(64);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowRegisterScreen")));
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
}