package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "loginscreen","asview", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Return ScreenPnl";
Debug.ShouldStop(32768);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_screenpnl").getObject());
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("BuildUI (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "loginscreen","buildui", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="ScreenPnl.Color = Colors.White";
Debug.ShouldStop(128);
__ref.getField(false,"_screenpnl").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 42;BA.debugLine="usernametxt.Color = Colors.White";
Debug.ShouldStop(512);
__ref.getField(false,"_usernametxt").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 44;BA.debugLine="usernametxt.Hint = \"Username\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_usernametxt").runMethod(true,"setHint",BA.ObjectToString("Username"));
 BA.debugLineNum = 45;BA.debugLine="usernametxt.HintColor = Colors.LightGray";
Debug.ShouldStop(4096);
__ref.getField(false,"_usernametxt").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 46;BA.debugLine="usernametxt.SingleLine = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_usernametxt").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="passwordtxt.Hint = \"Password\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHint",BA.ObjectToString("Password"));
 BA.debugLineNum = 48;BA.debugLine="passwordtxt.SingleLine = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_passwordtxt").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="passwordtxt.HintColor = Colors.LightGray";
Debug.ShouldStop(65536);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 50;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
Debug.ShouldStop(131072);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_usernametxt").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 51;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
Debug.ShouldStop(262144);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_passwordtxt").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 53;BA.debugLine="loginbtn.Text = \"Login\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_loginbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Login"));
 BA.debugLineNum = 54;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(2097152);
__ref.getField(false,"_loginbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 55;BA.debugLine="Support.ApplyViewStyle(loginbtn,Colors.DarkGray,C";
Debug.ShouldStop(4194304);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_loginbtn").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 57;BA.debugLine="registerbtn.Text = \"Register\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_registerbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Register"));
 BA.debugLineNum = 58;BA.debugLine="registerbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(33554432);
__ref.getField(false,"_registerbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 59;BA.debugLine="Support.ApplyViewStyle(registerbtn,Colors.DarkGra";
Debug.ShouldStop(67108864);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_registerbtn").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 61;BA.debugLine="ScreenLogo.Color = Colors.DarkGray";
Debug.ShouldStop(268435456);
__ref.getField(false,"_screenlogo").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 63;BA.debugLine="Logo.Bitmap = LoadBitmap(File.DirAssets,\"express-";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_logo").runMethod(false,"setBitmap",(loginscreen.__c.runMethod(false,"LoadBitmap",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("express-shop-logo-01.jpg"))).getObject()));
 BA.debugLineNum = 64;BA.debugLine="Logo.Gravity = Gravity.FILL";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_logo").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 65;BA.debugLine="ScreenPnl.AddView(ScreenLogo,UISizes.LoginScrDefa";
Debug.ShouldStop(1);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_screenlogo").getObject())),(Object)(loginscreen._uisizes._loginscrdefaultleft),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 66;BA.debugLine="ScreenPnl.AddView(usernametxt,ScreenLogo.Left,Scr";
Debug.ShouldStop(2);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernametxt").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_screenlogo").runMethod(true,"getTop"),__ref.getField(false,"_screenlogo").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 67;BA.debugLine="ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,Scre";
Debug.ShouldStop(4);
__ref.getField(false,"_screenlogo").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_logo").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getHeight")));
 BA.debugLineNum = 68;BA.debugLine="ScreenPnl.AddView(passwordtxt,ScreenLogo.Left,use";
Debug.ShouldStop(8);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_passwordtxt").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_usernametxt").runMethod(true,"getTop"),__ref.getField(false,"_usernametxt").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 69;BA.debugLine="ScreenPnl.AddView(loginbtn,ScreenLogo.Left,passwo";
Debug.ShouldStop(16);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_loginbtn").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_passwordtxt").runMethod(true,"getTop"),__ref.getField(false,"_passwordtxt").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 70;BA.debugLine="ScreenPnl.AddView(registerbtn,ScreenLogo.Left,log";
Debug.ShouldStop(32);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_registerbtn").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginbtn").runMethod(true,"getTop"),__ref.getField(false,"_loginbtn").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 72;BA.debugLine="SettingsButton.Color = Colors.DarkGray";
Debug.ShouldStop(128);
__ref.getField(false,"_settingsbutton").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 73;BA.debugLine="ScreenPnl.AddView(SettingsButton,0,0,10%x,5%y)";
Debug.ShouldStop(256);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsbutton").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 74;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,0,0,15";
Debug.ShouldStop(512);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.example.settingsmenu.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 75;BA.debugLine="SettingsMenuLogin.AsView.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.example.settingsmenu.class, "_asview").runMethod(true,"setVisible",loginscreen.__c.getField(true,"False"));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 16;BA.debugLine="Private SettingsButton As Button";
loginscreen._settingsbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_settingsbutton",loginscreen._settingsbutton);
 //BA.debugLineNum = 17;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
loginscreen._settingsmenulogin = RemoteObject.createNew ("b4a.example.settingsmenu");__ref.setField("_settingsmenulogin",loginscreen._settingsmenulogin);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "loginscreen","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="ScreenPnl.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_screenpnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 23;BA.debugLine="ScreenLogo.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_screenlogo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="Logo.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_logo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="usernametxt.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_usernametxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 26;BA.debugLine="passwordtxt.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_passwordtxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 29;BA.debugLine="loginbtn.Initialize(\"Login\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_loginbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Login")));
 BA.debugLineNum = 30;BA.debugLine="registerbtn.Initialize(\"Register\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_registerbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Register")));
 BA.debugLineNum = 31;BA.debugLine="settingsbtn.Initialize(\"\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_settingsbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 33;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
Debug.ShouldStop(1);
__ref.getField(false,"_settingsbutton").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Settings")));
 BA.debugLineNum = 34;BA.debugLine="SettingsMenuLogin.Initialize(0)";
Debug.ShouldStop(2);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.example.settingsmenu.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 35;BA.debugLine="BuildUI";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.loginscreen.class, "_buildui");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("JobDone (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "loginscreen","jobdone", __ref, _job);}
Debug.locals.put("Job", _job);
 BA.debugLineNum = 116;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),loginscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 118;BA.debugLine="Log(\"login failed\")";
Debug.ShouldStop(2097152);
loginscreen.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("login failed")));
 }else {
 BA.debugLineNum = 120;BA.debugLine="Log(\"login success\")";
Debug.ShouldStop(8388608);
loginscreen.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("login success")));
 BA.debugLineNum = 121;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(16777216);
loginscreen.__c.runVoidMethod ("Log",(Object)(_job.runMethod(true,"_getstring")));
 };
 BA.debugLineNum = 123;BA.debugLine="Job.Release";
Debug.ShouldStop(67108864);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _login_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Login_Click (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("login_click")) { return __ref.runUserSub(false, "loginscreen","login_click", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Public Sub Login_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="If usernametxt.TextSize > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_usernametxt").runMethod(true,"getTextSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 100;BA.debugLine="If passwordtxt.TextSize > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_passwordtxt").runMethod(true,"getTextSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 106;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
Debug.ShouldStop(512);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowMainScreen")));
 }else {
 BA.debugLineNum = 109;BA.debugLine="ToastMessageShow(\"Enter Password!\",False)";
Debug.ShouldStop(4096);
loginscreen.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Enter Password!")),(Object)(loginscreen.__c.getField(true,"False")));
 };
 }else {
 BA.debugLineNum = 112;BA.debugLine="ToastMessageShow(\"Enter Username!\",False)";
Debug.ShouldStop(32768);
loginscreen.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Enter Username!")),(Object)(loginscreen.__c.getField(true,"False")));
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _register_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Register_Click (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("register_click")) { return __ref.runUserSub(false, "loginscreen","register_click", __ref);}
 BA.debugLineNum = 126;BA.debugLine="Sub Register_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
Debug.ShouldStop(1073741824);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowRegisterScreen")));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settings_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Settings_Click (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("settings_click")) { return __ref.runUserSub(false, "loginscreen","settings_click", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Public Sub Settings_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="If SettingsMenuLogin.AsView.Visible = False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.example.settingsmenu.class, "_asview").runMethod(true,"getVisible"),loginscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 89;BA.debugLine="SettingsMenuLogin.AsView.Visible = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.example.settingsmenu.class, "_asview").runMethod(true,"setVisible",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 91;BA.debugLine="SettingsButton.Visible = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_settingsbutton").runMethod(true,"setVisible",loginscreen.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 93;BA.debugLine="SettingsMenuLogin.AsView.Visible = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.example.settingsmenu.class, "_asview").runMethod(true,"setVisible",loginscreen.__c.getField(true,"False"));
 BA.debugLineNum = 94;BA.debugLine="SettingsButton.Visible = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_settingsbutton").runMethod(true,"setVisible",loginscreen.__c.getField(true,"True"));
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
public static RemoteObject  _settingsisvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SettingsIsVisible (loginscreen) ","loginscreen",3,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("settingsisvisible")) { return __ref.runUserSub(false, "loginscreen","settingsisvisible", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Public Sub SettingsIsVisible As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Return SettingsMenuLogin.AsView.Visible";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.example.settingsmenu.class, "_asview").runMethod(true,"getVisible");
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}