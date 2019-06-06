package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class appsettingsscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (appsettingsscreen) ","appsettingsscreen",8,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "appsettingsscreen","asview", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Return ScreenPnl";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_screenpnl").getObject());
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("BuildUI (appsettingsscreen) ","appsettingsscreen",8,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "appsettingsscreen","buildui", __ref);}
 BA.debugLineNum = 20;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="ScreenPnl.Color = AppColors.FadedBlack2";
Debug.ShouldStop(2097152);
__ref.getField(false,"_screenpnl").runVoidMethod ("setColor",appsettingsscreen._appcolors._fadedblack2);
 BA.debugLineNum = 24;BA.debugLine="FillSettings";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_fillsettings");
 BA.debugLineNum = 25;BA.debugLine="SpinnersView";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_spinnersview");
 BA.debugLineNum = 27;BA.debugLine="ScreenPnl.AddView(SpnLanguage,UISizes.SettingsSpi";
Debug.ShouldStop(67108864);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_spnlanguage").getObject())),(Object)(appsettingsscreen._uisizes._settingsspinnersleft),(Object)(appsettingsscreen._uisizes._settingsspinnerstop),(Object)(appsettingsscreen._uisizes._settingsspinnerswidth),(Object)(appsettingsscreen._uisizes._settingsspinnersheight));
 BA.debugLineNum = 28;BA.debugLine="ScreenPnl.AddView(SpnFontSize,SpnLanguage.Left,Sp";
Debug.ShouldStop(134217728);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_spnfontsize").getObject())),(Object)(__ref.getField(false,"_spnlanguage").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_spnlanguage").runMethod(true,"getTop"),__ref.getField(false,"_spnlanguage").runMethod(true,"getHeight"),appsettingsscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(__ref.getField(false,"_spnlanguage").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_spnlanguage").runMethod(true,"getHeight")));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 4;BA.debugLine="Private SpnLanguage As Spinner";
appsettingsscreen._spnlanguage = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spnlanguage",appsettingsscreen._spnlanguage);
 //BA.debugLineNum = 5;BA.debugLine="Private SpnFontSize As Spinner";
appsettingsscreen._spnfontsize = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spnfontsize",appsettingsscreen._spnfontsize);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _fillsettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FillSettings (appsettingsscreen) ","appsettingsscreen",8,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("fillsettings")) { return __ref.runUserSub(false, "appsettingsscreen","fillsettings", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Public Sub FillSettings";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="SpnLanguage.AddAll(Data.LoadLanguages)";
Debug.ShouldStop(2);
__ref.getField(false,"_spnlanguage").runVoidMethod ("AddAll",(Object)(appsettingsscreen._data.runMethod(false,"_loadlanguages",__ref.getField(false, "ba"))));
 BA.debugLineNum = 35;BA.debugLine="SpnFontSize.AddAll(Data.LoadFontSizes)";
Debug.ShouldStop(4);
__ref.getField(false,"_spnfontsize").runVoidMethod ("AddAll",(Object)(appsettingsscreen._data.runMethod(false,"_loadfontsizes",__ref.getField(false, "ba"))));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Initialize (appsettingsscreen) ","appsettingsscreen",8,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "appsettingsscreen","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="ScreenPnl.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_screenpnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 13;BA.debugLine="SpnLanguage.Initialize(\"SpnLng\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_spnlanguage").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SpnLng")));
 BA.debugLineNum = 14;BA.debugLine="SpnFontSize.Initialize(\"SpnFntSize\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_spnfontsize").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SpnFntSize")));
 BA.debugLineNum = 16;BA.debugLine="BuildUI";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.diplomna.appsettingsscreen.class, "_buildui");
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnersview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SpinnersView (appsettingsscreen) ","appsettingsscreen",8,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("spinnersview")) { return __ref.runUserSub(false, "appsettingsscreen","spinnersview", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Public Sub SpinnersView";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="SpnLanguage.Color = Colors.ARGB(200,0,0,0)";
Debug.ShouldStop(128);
__ref.getField(false,"_spnlanguage").runVoidMethod ("setColor",appsettingsscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 41;BA.debugLine="SpnFontSize.Color = Colors.ARGB(200,0,0,0)";
Debug.ShouldStop(256);
__ref.getField(false,"_spnfontsize").runVoidMethod ("setColor",appsettingsscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 43;BA.debugLine="SpnLanguage.TextColor = Colors.LightGray";
Debug.ShouldStop(1024);
__ref.getField(false,"_spnlanguage").runMethod(true,"setTextColor",appsettingsscreen.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 44;BA.debugLine="SpnFontSize.TextColor = Colors.LightGray";
Debug.ShouldStop(2048);
__ref.getField(false,"_spnfontsize").runMethod(true,"setTextColor",appsettingsscreen.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 46;BA.debugLine="SpnLanguage.Padding =  Array As Int (0dip, 0dip,";
Debug.ShouldStop(8192);
__ref.getField(false,"_spnlanguage").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 47;BA.debugLine="SpnFontSize.Padding =  Array As Int (0dip, 0dip,";
Debug.ShouldStop(16384);
__ref.getField(false,"_spnfontsize").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),appsettingsscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spnfntsize_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpnFntSize_ItemClick (appsettingsscreen) ","appsettingsscreen",8,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("spnfntsize_itemclick")) { return __ref.runUserSub(false, "appsettingsscreen","spnfntsize_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 54;BA.debugLine="Public Sub SpnFntSize_ItemClick (Position As Int,";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spnlng_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpnLng_ItemClick (appsettingsscreen) ","appsettingsscreen",8,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("spnlng_itemclick")) { return __ref.runUserSub(false, "appsettingsscreen","spnlng_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 50;BA.debugLine="Public Sub SpnLng_ItemClick (Position As Int, Valu";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}