package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (loginscreen) ","loginscreen",2,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "loginscreen","asview", __ref);}
 BA.debugLineNum = 88;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Return ScreenPnl";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_screenpnl").getObject());
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("BuildUI (loginscreen) ","loginscreen",2,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "loginscreen","buildui", __ref);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 41;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="ScreenPnl.Color = Colors.White";
Debug.ShouldStop(1024);
__ref.getField(false,"_screenpnl").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 44;BA.debugLine="Header.Color = Colors.RGB(182,0,0)";
Debug.ShouldStop(2048);
__ref.getField(false,"_header").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 182)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 46;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
Debug.ShouldStop(8192);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 49;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
Debug.ShouldStop(65536);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_header").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 51;BA.debugLine="usernametxt.Color = Colors.White";
Debug.ShouldStop(262144);
__ref.getField(false,"_usernametxt").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 52;BA.debugLine="usernametxt.Hint = \"Username\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_usernametxt").runMethod(true,"setHint",BA.ObjectToString("Username"));
 BA.debugLineNum = 53;BA.debugLine="usernametxt.HintColor = Colors.DarkGray";
Debug.ShouldStop(1048576);
__ref.getField(false,"_usernametxt").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 54;BA.debugLine="usernametxt.SingleLine = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_usernametxt").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="passwordtxt.Hint = \"Password\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHint",BA.ObjectToString("Password"));
 BA.debugLineNum = 56;BA.debugLine="passwordtxt.SingleLine = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_passwordtxt").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="passwordtxt.HintColor = Colors.DarkGray";
Debug.ShouldStop(16777216);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 58;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
Debug.ShouldStop(33554432);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_usernametxt").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 59;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
Debug.ShouldStop(67108864);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_passwordtxt").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 61;BA.debugLine="loginbtn.Text = \"Login\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_loginbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Login"));
 BA.debugLineNum = 62;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(536870912);
__ref.getField(false,"_loginbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 63;BA.debugLine="Support.ApplyViewStyle(loginbtn,Colors.DarkGray,C";
Debug.ShouldStop(1073741824);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_loginbtn").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 65;BA.debugLine="registerbtn.Text = \"Register\"";
Debug.ShouldStop(1);
__ref.getField(false,"_registerbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Register"));
 BA.debugLineNum = 66;BA.debugLine="registerbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(2);
__ref.getField(false,"_registerbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 67;BA.debugLine="Support.ApplyViewStyle(registerbtn,Colors.DarkGra";
Debug.ShouldStop(4);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_registerbtn").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 69;BA.debugLine="ScreenLogo.Color = Colors.DarkGray";
Debug.ShouldStop(16);
__ref.getField(false,"_screenlogo").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 71;BA.debugLine="Logo.Bitmap = LoadBitmap(File.DirAssets,\"express-";
Debug.ShouldStop(64);
__ref.getField(false,"_logo").runMethod(false,"setBitmap",(loginscreen.__c.runMethod(false,"LoadBitmap",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("express-shop-logo-01.jpg"))).getObject()));
 BA.debugLineNum = 72;BA.debugLine="Logo.Gravity = Gravity.FILL";
Debug.ShouldStop(128);
__ref.getField(false,"_logo").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 73;BA.debugLine="ScreenPnl.AddView(ScreenLogo,UISizes.LoginScrDefa";
Debug.ShouldStop(256);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_screenlogo").getObject())),(Object)(loginscreen._uisizes._loginscrdefaultleft),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 74;BA.debugLine="ScreenPnl.AddView(usernametxt,ScreenLogo.Left,Scr";
Debug.ShouldStop(512);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernametxt").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_screenlogo").runMethod(true,"getTop"),__ref.getField(false,"_screenlogo").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 75;BA.debugLine="ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,Scre";
Debug.ShouldStop(1024);
__ref.getField(false,"_screenlogo").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_logo").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getHeight")));
 BA.debugLineNum = 76;BA.debugLine="ScreenPnl.AddView(passwordtxt,ScreenLogo.Left,use";
Debug.ShouldStop(2048);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_passwordtxt").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_usernametxt").runMethod(true,"getTop"),__ref.getField(false,"_usernametxt").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 77;BA.debugLine="ScreenPnl.AddView(loginbtn,ScreenLogo.Left,passwo";
Debug.ShouldStop(4096);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_loginbtn").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_passwordtxt").runMethod(true,"getTop"),__ref.getField(false,"_passwordtxt").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 78;BA.debugLine="ScreenPnl.AddView(registerbtn,ScreenLogo.Left,log";
Debug.ShouldStop(8192);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_registerbtn").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginbtn").runMethod(true,"getTop"),__ref.getField(false,"_loginbtn").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 80;BA.debugLine="Dim bc As Bitmap";
Debug.ShouldStop(32768);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 81;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
Debug.ShouldStop(65536);
_bc.runVoidMethod ("Initialize",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("optbutton.png")));
 BA.debugLineNum = 82;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
Debug.ShouldStop(131072);
__ref.getField(false,"_settingsbutton").runVoidMethod ("SetBackgroundImageNew",(Object)((_bc.getObject())));
 BA.debugLineNum = 83;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
Debug.ShouldStop(262144);
__ref.getField(false,"_header").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsbutton").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),loginscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),loginscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
loginscreen._screenpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_screenpnl",loginscreen._screenpnl);
 //BA.debugLineNum = 3;BA.debugLine="Private ScreenLogo As Panel";
loginscreen._screenlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_screenlogo",loginscreen._screenlogo);
 //BA.debugLineNum = 4;BA.debugLine="Private Logo As ImageView";
loginscreen._logo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_logo",loginscreen._logo);
 //BA.debugLineNum = 5;BA.debugLine="Private Header As Panel";
loginscreen._header = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_header",loginscreen._header);
 //BA.debugLineNum = 8;BA.debugLine="Private usernametxt As EditText";
loginscreen._usernametxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_usernametxt",loginscreen._usernametxt);
 //BA.debugLineNum = 9;BA.debugLine="Private passwordtxt As EditText";
loginscreen._passwordtxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_passwordtxt",loginscreen._passwordtxt);
 //BA.debugLineNum = 14;BA.debugLine="Private loginbtn As Button";
loginscreen._loginbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_loginbtn",loginscreen._loginbtn);
 //BA.debugLineNum = 15;BA.debugLine="Private registerbtn As Button";
loginscreen._registerbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_registerbtn",loginscreen._registerbtn);
 //BA.debugLineNum = 16;BA.debugLine="Private settingsbtn As Button";
loginscreen._settingsbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_settingsbtn",loginscreen._settingsbtn);
 //BA.debugLineNum = 18;BA.debugLine="Private SettingsButton As Button";
loginscreen._settingsbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_settingsbutton",loginscreen._settingsbutton);
 //BA.debugLineNum = 19;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
loginscreen._settingsmenulogin = RemoteObject.createNew ("b4a.diplomna.settingsmenu");__ref.setField("_settingsmenulogin",loginscreen._settingsmenulogin);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hidesettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideSettings (loginscreen) ","loginscreen",2,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("hidesettings")) { return __ref.runUserSub(false, "loginscreen","hidesettings", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Public Sub HideSettings";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 98;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
Debug.ShouldStop(2);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (loginscreen) ","loginscreen",2,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "loginscreen","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="ScreenPnl.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_screenpnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="ScreenLogo.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_screenlogo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 26;BA.debugLine="Logo.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_logo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 27;BA.debugLine="usernametxt.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_usernametxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="passwordtxt.Initialize(\"\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_passwordtxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 31;BA.debugLine="Header.Initialize(\"\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_header").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 32;BA.debugLine="loginbtn.Initialize(\"Login\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_loginbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Login")));
 BA.debugLineNum = 33;BA.debugLine="registerbtn.Initialize(\"Register\")";
Debug.ShouldStop(1);
__ref.getField(false,"_registerbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Register")));
 BA.debugLineNum = 34;BA.debugLine="settingsbtn.Initialize(\"\")";
Debug.ShouldStop(2);
__ref.getField(false,"_settingsbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 36;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
Debug.ShouldStop(8);
__ref.getField(false,"_settingsbutton").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Settings")));
 BA.debugLineNum = 37;BA.debugLine="SettingsMenuLogin.Initialize(0)";
Debug.ShouldStop(16);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 38;BA.debugLine="BuildUI";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.diplomna.loginscreen.class, "_buildui");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("JobDone (loginscreen) ","loginscreen",2,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "loginscreen","jobdone", __ref, _job);}
Debug.locals.put("Job", _job);
 BA.debugLineNum = 128;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),loginscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 130;BA.debugLine="Log(\"login failed\")";
Debug.ShouldStop(2);
loginscreen.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("login failed")));
 }else {
 BA.debugLineNum = 132;BA.debugLine="Log(\"login success\")";
Debug.ShouldStop(8);
loginscreen.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("login success")));
 BA.debugLineNum = 133;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(16);
loginscreen.__c.runVoidMethod ("Log",(Object)(_job.runMethod(true,"_getstring")));
 };
 BA.debugLineNum = 135;BA.debugLine="Job.Release";
Debug.ShouldStop(64);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Login_Click (loginscreen) ","loginscreen",2,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("login_click")) { return __ref.runUserSub(false, "loginscreen","login_click", __ref);}
 BA.debugLineNum = 110;BA.debugLine="Public Sub Login_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="If Not( usernametxt.Text = \"\") Then";
Debug.ShouldStop(16384);
if (loginscreen.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_usernametxt").runMethod(true,"getText"),RemoteObject.createImmutable(""))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 112;BA.debugLine="If Not( passwordtxt.Text = \"\") Then";
Debug.ShouldStop(32768);
if (loginscreen.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_passwordtxt").runMethod(true,"getText"),RemoteObject.createImmutable(""))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 118;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
Debug.ShouldStop(2097152);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowMainScreen")));
 }else {
 BA.debugLineNum = 121;BA.debugLine="ToastMessageShow(\"Enter Password!\",False)";
Debug.ShouldStop(16777216);
loginscreen.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Enter Password!")),(Object)(loginscreen.__c.getField(true,"False")));
 };
 }else {
 BA.debugLineNum = 124;BA.debugLine="ToastMessageShow(\"Enter Username!\",False)";
Debug.ShouldStop(134217728);
loginscreen.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Enter Username!")),(Object)(loginscreen.__c.getField(true,"False")));
 };
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Register_Click (loginscreen) ","loginscreen",2,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("register_click")) { return __ref.runUserSub(false, "loginscreen","register_click", __ref);}
 BA.debugLineNum = 138;BA.debugLine="Sub Register_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
Debug.ShouldStop(1024);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowRegisterScreen")));
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
public static RemoteObject  _settings_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Settings_Click (loginscreen) ","loginscreen",2,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("settings_click")) { return __ref.runUserSub(false, "loginscreen","settings_click", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Public Sub Settings_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, -(double) (0 + loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue())))) { 
 BA.debugLineNum = 104;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
Debug.ShouldStop(128);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, 0)),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 }else 
{ BA.debugLineNum = 105;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 106;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
Debug.ShouldStop(512);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 }}
;
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("SettingsIsVisible (loginscreen) ","loginscreen",2,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("settingsisvisible")) { return __ref.runUserSub(false, "loginscreen","settingsisvisible", __ref);}
 BA.debugLineNum = 92;BA.debugLine="Public Sub SettingsIsVisible As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft");
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}