package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "loginscreen","asview", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Return ScreenPnl";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_screenpnl").getObject());
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("BuildUI (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "loginscreen","buildui", __ref);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 41;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
Debug.ShouldStop(1024);
__ref.getField(false,"_screenpnl").runVoidMethod ("setColor",loginscreen._appcolors._darkgray);
 BA.debugLineNum = 44;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
Debug.ShouldStop(2048);
__ref.getField(false,"_header").runVoidMethod ("setColor",loginscreen._appcolors._fadeddarkred);
 BA.debugLineNum = 46;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
Debug.ShouldStop(8192);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 49;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
Debug.ShouldStop(65536);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_header").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 51;BA.debugLine="usernametxt.SingleLine = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_usernametxt").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 52;BA.debugLine="usernametxt.Hint = \"Username\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_usernametxt").runMethod(true,"setHint",BA.ObjectToString("Username"));
 BA.debugLineNum = 53;BA.debugLine="usernametxt.HintColor = AppColors.LightGray";
Debug.ShouldStop(1048576);
__ref.getField(false,"_usernametxt").runMethod(true,"setHintColor",loginscreen._appcolors._lightgray);
 BA.debugLineNum = 55;BA.debugLine="passwordtxt.Hint = \"Password\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHint",BA.ObjectToString("Password"));
 BA.debugLineNum = 56;BA.debugLine="passwordtxt.PasswordMode = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_passwordtxt").runVoidMethod ("setPasswordMode",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="passwordtxt.HintColor = AppColors.LightGray";
Debug.ShouldStop(33554432);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHintColor",loginscreen._appcolors._lightgray);
 BA.debugLineNum = 66;BA.debugLine="loginbtn.Text = \"Login\"";
Debug.ShouldStop(2);
__ref.getField(false,"_loginbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Login"));
 BA.debugLineNum = 67;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(4);
__ref.getField(false,"_loginbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 68;BA.debugLine="Support.ApplyViewStyle(loginbtn,AppColors.LightGr";
Debug.ShouldStop(8);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_loginbtn").getObject()),(Object)(loginscreen._appcolors._lightgray),(Object)(loginscreen._appcolors._fadedblack2),(Object)(loginscreen._appcolors._fadedblack2),(Object)(loginscreen._appcolors._fadedblack),(Object)(loginscreen._appcolors._fadedblack),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 70;BA.debugLine="registerbtn.Text = \"Register\"";
Debug.ShouldStop(32);
__ref.getField(false,"_registerbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Register"));
 BA.debugLineNum = 71;BA.debugLine="registerbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(64);
__ref.getField(false,"_registerbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 72;BA.debugLine="Support.ApplyViewStyle(registerbtn,AppColors.Ligh";
Debug.ShouldStop(128);
loginscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_registerbtn").getObject()),(Object)(loginscreen._appcolors._lightgray),(Object)(loginscreen._appcolors._fadedblack2),(Object)(loginscreen._appcolors._fadedblack2),(Object)(loginscreen._appcolors._fadedblack),(Object)(loginscreen._appcolors._fadedblack),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 74;BA.debugLine="ScreenLogo.Color = Colors.DarkGray";
Debug.ShouldStop(512);
__ref.getField(false,"_screenlogo").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 76;BA.debugLine="Logo.Bitmap = LoadBitmap(File.DirAssets,\"Logo3.jp";
Debug.ShouldStop(2048);
__ref.getField(false,"_logo").runMethod(false,"setBitmap",(loginscreen.__c.runMethod(false,"LoadBitmap",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Logo3.jpg"))).getObject()));
 BA.debugLineNum = 77;BA.debugLine="Logo.Gravity = Gravity.FILL";
Debug.ShouldStop(4096);
__ref.getField(false,"_logo").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 78;BA.debugLine="ScreenPnl.AddView(ScreenLogo,30%x,15%y,UISizes.Lo";
Debug.ShouldStop(8192);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_screenlogo").getObject())),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 79;BA.debugLine="ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,Scre";
Debug.ShouldStop(16384);
__ref.getField(false,"_screenlogo").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_logo").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getHeight")));
 BA.debugLineNum = 80;BA.debugLine="ScreenPnl.AddView(usernametxt,ScreenLogo.Left ,Sc";
Debug.ShouldStop(32768);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernametxt").getObject())),(Object)(__ref.getField(false,"_screenlogo").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_screenlogo").runMethod(true,"getTop"),__ref.getField(false,"_screenlogo").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 81;BA.debugLine="ScreenPnl.AddView(passwordtxt,usernametxt.Left,us";
Debug.ShouldStop(65536);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_passwordtxt").getObject())),(Object)(__ref.getField(false,"_usernametxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_usernametxt").runMethod(true,"getTop"),__ref.getField(false,"_usernametxt").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 82;BA.debugLine="ScreenPnl.AddView(loginbtn,usernametxt.Left,passw";
Debug.ShouldStop(131072);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_loginbtn").getObject())),(Object)(__ref.getField(false,"_usernametxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_passwordtxt").runMethod(true,"getTop"),__ref.getField(false,"_passwordtxt").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 83;BA.debugLine="ScreenPnl.AddView(registerbtn,usernametxt.Left,lo";
Debug.ShouldStop(262144);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_registerbtn").getObject())),(Object)(__ref.getField(false,"_usernametxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginbtn").runMethod(true,"getTop"),__ref.getField(false,"_loginbtn").runMethod(true,"getHeight"),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(loginscreen._uisizes._loginscrdefaultwidth),(Object)(loginscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 85;BA.debugLine="Dim bc As Bitmap";
Debug.ShouldStop(1048576);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 86;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
Debug.ShouldStop(2097152);
_bc.runVoidMethod ("Initialize",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("optbutton.png")));
 BA.debugLineNum = 87;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_settingsbutton").runVoidMethod ("SetBackgroundImageNew",(Object)((_bc.getObject())));
 BA.debugLineNum = 88;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
Debug.ShouldStop(8388608);
__ref.getField(false,"_header").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsbutton").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),loginscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),loginscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1)));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("HideSettings (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("hidesettings")) { return __ref.runUserSub(false, "loginscreen","hidesettings", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Public Sub HideSettings";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 103;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
Debug.ShouldStop(64);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 };
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Initialize (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,23);
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
		Debug.PushSubsStack("JobDone (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("jobdone")) { return __ref.runUserSub(false, "loginscreen","jobdone", __ref, _job);}
Debug.locals.put("Job", _job);
 BA.debugLineNum = 145;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),loginscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 147;BA.debugLine="Log(\"login failed\")";
Debug.ShouldStop(262144);
loginscreen.__c.runVoidMethod ("LogImpl","41835010",RemoteObject.createImmutable("login failed"),0);
 }else {
 BA.debugLineNum = 149;BA.debugLine="Log(\"login success\")";
Debug.ShouldStop(1048576);
loginscreen.__c.runVoidMethod ("LogImpl","41835012",RemoteObject.createImmutable("login success"),0);
 BA.debugLineNum = 150;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(2097152);
loginscreen.__c.runVoidMethod ("LogImpl","41835013",_job.runClassMethod (b4a.diplomna.httpjob.class, "_getstring"),0);
 };
 BA.debugLineNum = 152;BA.debugLine="Job.Release";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4a.diplomna.httpjob.class, "_release");
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Login_Click (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,112);
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
public ResumableSub_Login_Click(b4a.diplomna.loginscreen parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.loginscreen parent;
RemoteObject _login = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Login_Click (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,112);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 113;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
Debug.ShouldStop(65536);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((parent._main.getObject())),(Object)(RemoteObject.createImmutable("HideAppSettingsScreen")));
 BA.debugLineNum = 114;BA.debugLine="loginbtn.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_loginbtn").runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 116;BA.debugLine="If Not( usernametxt.Text = \"\") Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 24;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_usernametxt").runMethod(true,"getText"),RemoteObject.createImmutable(""))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 117;BA.debugLine="If Not( passwordtxt.Text = \"\") Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 21;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_passwordtxt").runMethod(true,"getText"),RemoteObject.createImmutable(""))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 118;BA.debugLine="Dim login As ResumableSub = Main.HTTP.Login(use";
Debug.ShouldStop(2097152);
_login = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_login = parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_login",(Object)(__ref.getField(false,"_usernametxt").runMethod(true,"getText")),(Object)(__ref.getField(false,"_passwordtxt").runMethod(true,"getText")));Debug.locals.put("login", _login);Debug.locals.put("login", _login);
 BA.debugLineNum = 119;BA.debugLine="Wait For (login)  Complete (Result As Object)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "loginscreen", "login_click"), _login);
this.state = 25;
return;
case 25:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 121;BA.debugLine="If Main.HTTP.Output = \"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent._main._http.getField(true,"_output"),BA.ObjectToString(""))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
 BA.debugLineNum = 122;BA.debugLine="Log(\"LOGIN FAILED\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","41769482",RemoteObject.createImmutable("LOGIN FAILED"),0);
 BA.debugLineNum = 123;BA.debugLine="ToastMessageShow(\"Wrong username or password!";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Wrong username or password! Try again!")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 124;BA.debugLine="Sleep(20)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "loginscreen", "login_click"),BA.numberCast(int.class, 20));
this.state = 26;
return;
case 26:
//C
this.state = 18;
;
 BA.debugLineNum = 125;BA.debugLine="loginbtn.Enabled = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_loginbtn").runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 127;BA.debugLine="Log(\"Login Output:\" & Main.HTTP.Output)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","41769487",RemoteObject.concat(RemoteObject.createImmutable("Login Output:"),parent._main._http.getField(true,"_output")),0);
 BA.debugLineNum = 128;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 12:
//try
this.state = 17;
this.catchState = 16;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 17;
this.catchState = 16;
 BA.debugLineNum = 129;BA.debugLine="Main.LoggedCustomer = JSONSerializations.Seri";
Debug.ShouldStop(1);
parent._main._loggedcustomer = parent._jsonserializations.runMethod(false,"_serializelogincustomer",__ref.getField(false, "ba"),(Object)(parent._main._http.getField(true,"_output")));
 Debug.CheckDeviceExceptions();
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
 BA.debugLineNum = 131;BA.debugLine="Log(\"error\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","41769491",RemoteObject.createImmutable("error"),0);
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
;
 BA.debugLineNum = 133;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
Debug.ShouldStop(16);
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((parent._main.getObject())),(Object)(RemoteObject.createImmutable("ShowMainScreen")));
 BA.debugLineNum = 134;BA.debugLine="Main.HTTP.ClearOuput";
Debug.ShouldStop(32);
parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_clearouput");
 BA.debugLineNum = 135;BA.debugLine="loginbtn.Enabled = True";
Debug.ShouldStop(64);
__ref.getField(false,"_loginbtn").runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 138;BA.debugLine="ToastMessageShow(\"Enter Password!\",False)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Enter Password!")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 141;BA.debugLine="ToastMessageShow(\"Enter Username!\",False)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Enter Username!")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
		Debug.PushSubsStack("Register_Click (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("register_click")) { return __ref.runUserSub(false, "loginscreen","register_click", __ref);}
 BA.debugLineNum = 155;BA.debugLine="Sub Register_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
Debug.ShouldStop(134217728);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("HideAppSettingsScreen")));
 BA.debugLineNum = 157;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
Debug.ShouldStop(268435456);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowRegisterScreen")));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Settings_Click (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("settings_click")) { return __ref.runUserSub(false, "loginscreen","settings_click", __ref);}
 BA.debugLineNum = 107;BA.debugLine="Public Sub Settings_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 109;BA.debugLine="SettingsMenuLogin.AppSettings_Click";
Debug.ShouldStop(4096);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_appsettings_click");
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
public static RemoteObject  _settingsisvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SettingsIsVisible (loginscreen) ","loginscreen",1,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("settingsisvisible")) { return __ref.runUserSub(false, "loginscreen","settingsisvisible", __ref);}
 BA.debugLineNum = 97;BA.debugLine="Public Sub SettingsIsVisible As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft");
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}