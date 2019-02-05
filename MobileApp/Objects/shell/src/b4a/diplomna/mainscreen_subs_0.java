package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mainscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "mainscreen","asview", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Return ScreenPnl";
Debug.ShouldStop(8192);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_screenpnl").getObject());
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("BuildUI (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "mainscreen","buildui", __ref);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 55;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
Debug.ShouldStop(16777216);
__ref.getField(false,"_screenpnl").runVoidMethod ("setColor",mainscreen._appcolors._darkgray);
 BA.debugLineNum = 58;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_header").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 59;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
Debug.ShouldStop(67108864);
__ref.getField(false,"_header").runVoidMethod ("setColor",mainscreen._appcolors._fadeddarkred);
 BA.debugLineNum = 60;BA.debugLine="FakePnl.Color = AppColors.White";
Debug.ShouldStop(134217728);
__ref.getField(false,"_fakepnl").runVoidMethod ("setColor",mainscreen._appcolors._white);
 BA.debugLineNum = 62;BA.debugLine="Dim bc As Bitmap";
Debug.ShouldStop(536870912);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 63;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
Debug.ShouldStop(1073741824);
_bc.runVoidMethod ("Initialize",(Object)(mainscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("optbutton.png")));
 BA.debugLineNum = 64;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_settingsbutton").runVoidMethod ("SetBackgroundImageNew",(Object)((_bc.getObject())));
 BA.debugLineNum = 65;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
Debug.ShouldStop(1);
__ref.getField(false,"_header").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsbutton").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),mainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),mainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1)));
 BA.debugLineNum = 67;BA.debugLine="ScreenPnl.AddView(ScanButton, UISizes.ScanBtnDefa";
Debug.ShouldStop(4);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_scanbutton").getObject())),(Object)(mainscreen._uisizes._scanbtndefaultleft),(Object)(mainscreen._uisizes._scanbtndefaulttop),(Object)(mainscreen._uisizes._scanbtndefaultwidth),(Object)(mainscreen._uisizes._scanbtndefaultheight));
 BA.debugLineNum = 68;BA.debugLine="ScanButton.Bitmap = LoadBitmap(File.DirAssets,\"sc";
Debug.ShouldStop(8);
__ref.getField(false,"_scanbutton").runMethod(false,"setBitmap",(mainscreen.__c.runMethod(false,"LoadBitmap",(Object)(mainscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("scanbtn1.png"))).getObject()));
 BA.debugLineNum = 69;BA.debugLine="ScanButton.Gravity = Gravity.FILL";
Debug.ShouldStop(16);
__ref.getField(false,"_scanbutton").runMethod(true,"setGravity",mainscreen.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 71;BA.debugLine="ScreenPnl.AddView(Cart.AsView,5%x,35%y,90%x,50%y)";
Debug.ShouldStop(64);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cart").runClassMethod (b4a.diplomna.shoppingcart.class, "_asview").getObject())),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 72;BA.debugLine="ScreenPnl.AddView(FakePnl,5%x - 2dip,10%y - 2dip,";
Debug.ShouldStop(128);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_fakepnl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),mainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba")),mainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba")),mainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 24)),__ref.getField(false, "ba")),mainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)));
 BA.debugLineNum = 73;BA.debugLine="ScreenPnl.AddView(InfoScreen.AsView,5%x,10%y,90%x";
Debug.ShouldStop(256);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_infoscreen").runClassMethod (b4a.diplomna.iteminfovisualizer.class, "_asview").getObject())),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 24)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 74;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
Debug.ShouldStop(512);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cameracheck_ready(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("CameraCheck_Ready (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("cameracheck_ready")) { return __ref.runUserSub(false, "mainscreen","cameracheck_ready", __ref, _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 81;BA.debugLine="Private Sub CameraCheck_Ready (Success As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Log(\"Camera Exists- \"&Success)";
Debug.ShouldStop(131072);
mainscreen.__c.runVoidMethod ("LogImpl","32359297",RemoteObject.concat(RemoteObject.createImmutable("Camera Exists- "),_success),0);
 BA.debugLineNum = 83;BA.debugLine="CameraExists=Success";
Debug.ShouldStop(262144);
__ref.setField ("_cameraexists",_success);
 BA.debugLineNum = 84;BA.debugLine="CallSubDelayed(Me,\"Remove_CameraChecker\")";
Debug.ShouldStop(524288);
mainscreen.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("Remove_CameraChecker")));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _check_ifcameraexists(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Check_IfCameraExists (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("check_ifcameraexists")) { return __ref.runUserSub(false, "mainscreen","check_ifcameraexists", __ref);}
 BA.debugLineNum = 88;BA.debugLine="Public Sub Check_IfCameraExists";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Log(\"Start- Checking Camera\")";
Debug.ShouldStop(16777216);
mainscreen.__c.runVoidMethod ("LogImpl","32424833",RemoteObject.createImmutable("Start- Checking Camera"),0);
 BA.debugLineNum = 90;BA.debugLine="pnlCheckCamera.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlcheckcamera").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 91;BA.debugLine="ScreenPnl.AddView(pnlCheckCamera,-999,-999,1dip,1";
Debug.ShouldStop(67108864);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlcheckcamera").getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + 999))),(Object)(BA.numberCast(int.class, -(double) (0 + 999))),(Object)(mainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(mainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 92;BA.debugLine="camera.Initialize(pnlCheckCamera,\"CameraCheck\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_camera").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)((__ref.getField(false,"_pnlcheckcamera").getObject())),(Object)(RemoteObject.createImmutable("CameraCheck")));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
mainscreen._screenpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_screenpnl",mainscreen._screenpnl);
 //BA.debugLineNum = 3;BA.debugLine="Public ScanButton As ImageView";
mainscreen._scanbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_scanbutton",mainscreen._scanbutton);
 //BA.debugLineNum = 4;BA.debugLine="Public QRScanner As Zxing_B4A";
mainscreen._qrscanner = RemoteObject.createNew ("ice.zxing.b4aZXingLib");__ref.setField("_qrscanner",mainscreen._qrscanner);
 //BA.debugLineNum = 5;BA.debugLine="Private CameraExists As Boolean";
mainscreen._cameraexists = RemoteObject.createImmutable(false);__ref.setField("_cameraexists",mainscreen._cameraexists);
 //BA.debugLineNum = 6;BA.debugLine="Private pnlCheckCamera As Panel";
mainscreen._pnlcheckcamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlcheckcamera",mainscreen._pnlcheckcamera);
 //BA.debugLineNum = 7;BA.debugLine="Public camera As Camera";
mainscreen._camera = RemoteObject.createNew ("anywheresoftware.b4a.objects.CameraW");__ref.setField("_camera",mainscreen._camera);
 //BA.debugLineNum = 9;BA.debugLine="Private Header As Panel";
mainscreen._header = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_header",mainscreen._header);
 //BA.debugLineNum = 10;BA.debugLine="Private SettingsButton As Button";
mainscreen._settingsbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_settingsbutton",mainscreen._settingsbutton);
 //BA.debugLineNum = 11;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
mainscreen._settingsmenulogin = RemoteObject.createNew ("b4a.diplomna.settingsmenu");__ref.setField("_settingsmenulogin",mainscreen._settingsmenulogin);
 //BA.debugLineNum = 13;BA.debugLine="Public Cart As ShoppingCart";
mainscreen._cart = RemoteObject.createNew ("b4a.diplomna.shoppingcart");__ref.setField("_cart",mainscreen._cart);
 //BA.debugLineNum = 14;BA.debugLine="Public InfoScreen As ItemInfoVisualizer";
mainscreen._infoscreen = RemoteObject.createNew ("b4a.diplomna.iteminfovisualizer");__ref.setField("_infoscreen",mainscreen._infoscreen);
 //BA.debugLineNum = 16;BA.debugLine="Public FakePnl As Panel";
mainscreen._fakepnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_fakepnl",mainscreen._fakepnl);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hidesettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideSettings (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("hidesettings")) { return __ref.runUserSub(false, "mainscreen","hidesettings", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Public Sub HideSettings";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 43;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
Debug.ShouldStop(1024);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 };
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Initialize (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "mainscreen","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="ScreenPnl.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_screenpnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="ScanButton.Initialize(\"startScan\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_scanbutton").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("startScan")));
 BA.debugLineNum = 25;BA.debugLine="Header.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_header").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 26;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_settingsbutton").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Settings")));
 BA.debugLineNum = 27;BA.debugLine="SettingsMenuLogin.Initialize(1)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 29;BA.debugLine="Cart.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cart").runClassMethod (b4a.diplomna.shoppingcart.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="InfoScreen.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_infoscreen").runClassMethod (b4a.diplomna.iteminfovisualizer.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="FakePnl.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_fakepnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 33;BA.debugLine="BuildUI";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.diplomna.mainscreen.class, "_buildui");
 BA.debugLineNum = 34;BA.debugLine="Check_IfCameraExists";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.diplomna.mainscreen.class, "_check_ifcameraexists");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _qrscanner_result(RemoteObject __ref,RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("QRScanner_result (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("qrscanner_result")) { return __ref.runUserSub(false, "mainscreen","qrscanner_result", __ref, _atype, _values);}
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 135;BA.debugLine="Public Sub QRScanner_result(atype As String, Value";
Debug.ShouldStop(64);
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _remove_camerachecker(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Remove_CameraChecker (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("remove_camerachecker")) { return __ref.runUserSub(false, "mainscreen","remove_camerachecker", __ref);}
 BA.debugLineNum = 95;BA.debugLine="private Sub Remove_CameraChecker";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="camera.Release";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_camera").runVoidMethod ("Release");
 BA.debugLineNum = 97;BA.debugLine="pnlCheckCamera.RemoveView";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlcheckcamera").runVoidMethod ("RemoveView");
 BA.debugLineNum = 98;BA.debugLine="Log(\"End- Checking Camera\")";
Debug.ShouldStop(2);
mainscreen.__c.runVoidMethod ("LogImpl","32490371",RemoteObject.createImmutable("End- Checking Camera"),0);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Settings_Click (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("settings_click")) { return __ref.runUserSub(false, "mainscreen","settings_click", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub Settings_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, -(double) (0 + mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue())))) { 
 BA.debugLineNum = 49;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
Debug.ShouldStop(65536);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, 0)),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 }else 
{ BA.debugLineNum = 50;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 51;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
Debug.ShouldStop(262144);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(mainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 }}
;
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("SettingsIsVisible (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("settingsisvisible")) { return __ref.runUserSub(false, "mainscreen","settingsisvisible", __ref);}
 BA.debugLineNum = 37;BA.debugLine="Public Sub SettingsIsVisible As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startscan_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("startScan_Click (mainscreen) ","mainscreen",2,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("startscan_click")) { return __ref.runUserSub(false, "mainscreen","startscan_click", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Public Sub startScan_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="If CameraExists Then";
Debug.ShouldStop(32);
if (__ref.getField(true,"_cameraexists").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 103;BA.debugLine="Log(\"click\")";
Debug.ShouldStop(64);
mainscreen.__c.runVoidMethod ("LogImpl","32555906",RemoteObject.createImmutable("click"),0);
 BA.debugLineNum = 128;BA.debugLine="Cart.TestWithFakes(3)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_cart").runClassMethod (b4a.diplomna.shoppingcart.class, "_testwithfakes",(Object)(BA.numberCast(int.class, 3)));
 }else {
 BA.debugLineNum = 131;BA.debugLine="Log(\"Camera:\"&CameraExists)";
Debug.ShouldStop(4);
mainscreen.__c.runVoidMethod ("LogImpl","32555934",RemoteObject.concat(RemoteObject.createImmutable("Camera:"),__ref.getField(true,"_cameraexists")),0);
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}