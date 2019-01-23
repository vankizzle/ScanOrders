package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class appsettingsscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (appsettingsscreen) ","appsettingsscreen",15,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "appsettingsscreen","asview", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Return ScreenPnl";
Debug.ShouldStop(8192);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_screenpnl").getObject());
 BA.debugLineNum = 47;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("BuildUI (appsettingsscreen) ","appsettingsscreen",15,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "appsettingsscreen","buildui", __ref);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 24;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="ScreenPnl.Color = Colors.Green";
Debug.ShouldStop(33554432);
__ref.getField(false,"_screenpnl").runVoidMethod ("setColor",appsettingsscreen.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 27;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_header").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 28;BA.debugLine="Header.Color = Colors.RGB(182,0,0)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_header").runVoidMethod ("setColor",appsettingsscreen.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 182)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 30;BA.debugLine="Dim bc As Bitmap";
Debug.ShouldStop(536870912);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 31;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
Debug.ShouldStop(1073741824);
_bc.runVoidMethod ("Initialize",(Object)(appsettingsscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("optbutton.png")));
 BA.debugLineNum = 32;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_settingsbutton").runVoidMethod ("SetBackgroundImageNew",(Object)((_bc.getObject())));
 BA.debugLineNum = 33;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
Debug.ShouldStop(1);
__ref.getField(false,"_header").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsbutton").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1)));
 BA.debugLineNum = 34;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
Debug.ShouldStop(2);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
appsettingsscreen._screenpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_screenpnl",appsettingsscreen._screenpnl);
 //BA.debugLineNum = 3;BA.debugLine="Private Header As Panel";
appsettingsscreen._header = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_header",appsettingsscreen._header);
 //BA.debugLineNum = 4;BA.debugLine="Private SettingsButton As Button";
appsettingsscreen._settingsbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_settingsbutton",appsettingsscreen._settingsbutton);
 //BA.debugLineNum = 5;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
appsettingsscreen._settingsmenulogin = RemoteObject.createNew ("b4a.diplomna.settingsmenu");__ref.setField("_settingsmenulogin",appsettingsscreen._settingsmenulogin);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hidesettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideSettings (appsettingsscreen) ","appsettingsscreen",15,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("hidesettings")) { return __ref.runUserSub(false, "appsettingsscreen","hidesettings", __ref);}
 BA.debugLineNum = 18;BA.debugLine="Public Sub HideSettings";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 20;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
Debug.ShouldStop(524288);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 };
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Initialize (appsettingsscreen) ","appsettingsscreen",15,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "appsettingsscreen","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="ScreenPnl.Initialize(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_screenpnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 11;BA.debugLine="Header.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_header").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 12;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_settingsbutton").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Settings")));
 BA.debugLineNum = 13;BA.debugLine="SettingsMenuLogin.Initialize(3)";
Debug.ShouldStop(4096);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 15;BA.debugLine="BuildUI";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_buildui");
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Settings_Click (appsettingsscreen) ","appsettingsscreen",15,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("settings_click")) { return __ref.runUserSub(false, "appsettingsscreen","settings_click", __ref);}
 BA.debugLineNum = 37;BA.debugLine="Public Sub Settings_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, -(double) (0 + appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue())))) { 
 BA.debugLineNum = 39;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
Debug.ShouldStop(64);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, 0)),(Object)(appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 }else 
{ BA.debugLineNum = 40;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 41;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
Debug.ShouldStop(256);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(appsettingsscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 }}
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}