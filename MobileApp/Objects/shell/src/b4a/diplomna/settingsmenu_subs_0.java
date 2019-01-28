package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class settingsmenu_subs_0 {


public static RemoteObject  _appsettings_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AppSettings_Click (settingsmenu) ","settingsmenu",5,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("appsettings_click")) { return __ref.runUserSub(false, "settingsmenu","appsettings_click", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Public Sub AppSettings_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="CallSub(Main,\"ShowHideAppSettingsScreen\")";
Debug.ShouldStop(65536);
settingsmenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((settingsmenu._main.getObject())),(Object)(RemoteObject.createImmutable("ShowHideAppSettingsScreen")));
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
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (settingsmenu) ","settingsmenu",5,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "settingsmenu","asview", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Return pnlHolder";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_pnlholder").getObject());
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildmenu(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildMenu (settingsmenu) ","settingsmenu",5,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("buildmenu")) { return __ref.runUserSub(false, "settingsmenu","buildmenu", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub BuildMenu";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="lblAppSettings.Text = \"Settings\"";
Debug.ShouldStop(8);
__ref.getField(false,"_lblappsettings").runMethod(true,"setText",BA.ObjectToCharSequence("Settings"));
 BA.debugLineNum = 37;BA.debugLine="lblAppSettings.Gravity = Gravity.CENTER";
Debug.ShouldStop(16);
__ref.getField(false,"_lblappsettings").runMethod(true,"setGravity",settingsmenu.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 38;BA.debugLine="lblAppSettings.Color = Colors.LightGray";
Debug.ShouldStop(32);
__ref.getField(false,"_lblappsettings").runVoidMethod ("setColor",settingsmenu.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 39;BA.debugLine="lblAppSettings.TextColor = Colors.Black";
Debug.ShouldStop(64);
__ref.getField(false,"_lblappsettings").runMethod(true,"setTextColor",settingsmenu.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 41;BA.debugLine="lblMyOrders.Text = \"My Orders\"";
Debug.ShouldStop(256);
__ref.getField(false,"_lblmyorders").runMethod(true,"setText",BA.ObjectToCharSequence("My Orders"));
 BA.debugLineNum = 42;BA.debugLine="lblMyOrders.Gravity = Gravity.CENTER";
Debug.ShouldStop(512);
__ref.getField(false,"_lblmyorders").runMethod(true,"setGravity",settingsmenu.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 43;BA.debugLine="lblMyOrders.Color = Colors.LightGray";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblmyorders").runVoidMethod ("setColor",settingsmenu.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 44;BA.debugLine="lblMyOrders.TextColor = Colors.Black";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblmyorders").runMethod(true,"setTextColor",settingsmenu.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 46;BA.debugLine="lblShoppingCart.Text = \"Shopping Cart\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblshoppingcart").runMethod(true,"setText",BA.ObjectToCharSequence("Shopping Cart"));
 BA.debugLineNum = 47;BA.debugLine="lblShoppingCart.Gravity = Gravity.CENTER";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblshoppingcart").runMethod(true,"setGravity",settingsmenu.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 48;BA.debugLine="lblShoppingCart.Color = Colors.LightGray";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblshoppingcart").runVoidMethod ("setColor",settingsmenu.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 49;BA.debugLine="lblShoppingCart.TextColor = Colors.Black";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblshoppingcart").runMethod(true,"setTextColor",settingsmenu.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 51;BA.debugLine="lblLoginScreen.Text = \"Login Screen\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblloginscreen").runMethod(true,"setText",BA.ObjectToCharSequence("Login Screen"));
 BA.debugLineNum = 52;BA.debugLine="lblLoginScreen.Gravity = Gravity.CENTER";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblloginscreen").runMethod(true,"setGravity",settingsmenu.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 53;BA.debugLine="lblLoginScreen.Color = Colors.LightGray";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblloginscreen").runVoidMethod ("setColor",settingsmenu.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 54;BA.debugLine="lblLoginScreen.TextColor = Colors.Black";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblloginscreen").runMethod(true,"setTextColor",settingsmenu.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 56;BA.debugLine="If flag = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_flag"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 57;BA.debugLine="pnlHolder.AddView(lblAppSettings,0,0,15%x,5%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblappsettings").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(settingsmenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(settingsmenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 }else 
{ BA.debugLineNum = 58;BA.debugLine="else if flag = 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_flag"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 59;BA.debugLine="pnlHolder.AddView(lblMyOrders,0,0,15%x,5%y)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblmyorders").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(settingsmenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(settingsmenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 }else 
{ BA.debugLineNum = 60;BA.debugLine="else if flag = 2 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_flag"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 61;BA.debugLine="pnlHolder.AddView(lblShoppingCart,0,0,15%x,5%y)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblshoppingcart").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(settingsmenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(settingsmenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 }else 
{ BA.debugLineNum = 62;BA.debugLine="else if flag = 3 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_flag"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 63;BA.debugLine="pnlHolder.AddView(lblLoginScreen,0,0,15%x,5%y)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblloginscreen").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(settingsmenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(settingsmenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 }}}}
;
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
 //BA.debugLineNum = 2;BA.debugLine="Private lblAppSettings As Label";
settingsmenu._lblappsettings = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblappsettings",settingsmenu._lblappsettings);
 //BA.debugLineNum = 3;BA.debugLine="Private lblMyOrders As Label";
settingsmenu._lblmyorders = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmyorders",settingsmenu._lblmyorders);
 //BA.debugLineNum = 4;BA.debugLine="Private lblShoppingCart As Label";
settingsmenu._lblshoppingcart = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblshoppingcart",settingsmenu._lblshoppingcart);
 //BA.debugLineNum = 5;BA.debugLine="Private lblLoginScreen As Label";
settingsmenu._lblloginscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblloginscreen",settingsmenu._lblloginscreen);
 //BA.debugLineNum = 6;BA.debugLine="Private pnlHolder As Panel";
settingsmenu._pnlholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlholder",settingsmenu._pnlholder);
 //BA.debugLineNum = 7;BA.debugLine="Private flag As Int";
settingsmenu._flag = RemoteObject.createImmutable(0);__ref.setField("_flag",settingsmenu._flag);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hidesettingswindow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideSettingsWindow (settingsmenu) ","settingsmenu",5,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("hidesettingswindow")) { return __ref.runUserSub(false, "settingsmenu","hidesettingswindow", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Public Sub HideSettingsWindow";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="CallSub(Main,\"HideSettingsWindows\")";
Debug.ShouldStop(8);
settingsmenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((settingsmenu._main.getObject())),(Object)(RemoteObject.createImmutable("HideSettingsWindows")));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _location) throws Exception{
try {
		Debug.PushSubsStack("Initialize (settingsmenu) ","settingsmenu",5,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "settingsmenu","initialize", __ref, _ba, _location);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Location", _location);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(Location As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="pnlHolder.initialize(\"MainPan\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPan")));
 BA.debugLineNum = 13;BA.debugLine="lblMyOrders.initialize(\"MyOrders\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblmyorders").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyOrders")));
 BA.debugLineNum = 14;BA.debugLine="lblAppSettings.initialize(\"AppSettings\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblappsettings").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AppSettings")));
 BA.debugLineNum = 15;BA.debugLine="lblShoppingCart.Initialize(\"ShoppingCart\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblshoppingcart").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ShoppingCart")));
 BA.debugLineNum = 16;BA.debugLine="lblLoginScreen.Initialize(\"LoginScreen\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblloginscreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("LoginScreen")));
 BA.debugLineNum = 18;BA.debugLine="If Location = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_location,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 19;BA.debugLine="flag = 0";
Debug.ShouldStop(262144);
__ref.setField ("_flag",BA.numberCast(int.class, 0));
 }else 
{ BA.debugLineNum = 20;BA.debugLine="Else If Location = 1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_location,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 21;BA.debugLine="flag = 1";
Debug.ShouldStop(1048576);
__ref.setField ("_flag",BA.numberCast(int.class, 1));
 }else 
{ BA.debugLineNum = 22;BA.debugLine="else if Location = 2 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_location,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 23;BA.debugLine="flag = 2";
Debug.ShouldStop(4194304);
__ref.setField ("_flag",BA.numberCast(int.class, 2));
 }else 
{ BA.debugLineNum = 24;BA.debugLine="else if Location = 3 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_location,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 25;BA.debugLine="flag = 3";
Debug.ShouldStop(16777216);
__ref.setField ("_flag",BA.numberCast(int.class, 3));
 }}}}
;
 BA.debugLineNum = 27;BA.debugLine="Log(flag)";
Debug.ShouldStop(67108864);
settingsmenu.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_flag"))));
 BA.debugLineNum = 28;BA.debugLine="BuildMenu";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.diplomna.settingsmenu.class, "_buildmenu");
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loginscreen_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoginScreen_Click (settingsmenu) ","settingsmenu",5,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("loginscreen_click")) { return __ref.runUserSub(false, "settingsmenu","loginscreen_click", __ref);}
 BA.debugLineNum = 94;BA.debugLine="Public Sub LoginScreen_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
Debug.ShouldStop(1073741824);
settingsmenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((settingsmenu._main.getObject())),(Object)(RemoteObject.createImmutable("HideAppSettingsScreen")));
 BA.debugLineNum = 96;BA.debugLine="HideSettingsWindow";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.diplomna.settingsmenu.class, "_hidesettingswindow");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _myorders_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyOrders_Click (settingsmenu) ","settingsmenu",5,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("myorders_click")) { return __ref.runUserSub(false, "settingsmenu","myorders_click", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Public Sub MyOrders_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="CallSub(Main,\"ShowClientOrdersScreen\")";
Debug.ShouldStop(256);
settingsmenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((settingsmenu._main.getObject())),(Object)(RemoteObject.createImmutable("ShowClientOrdersScreen")));
 BA.debugLineNum = 74;BA.debugLine="CallSub(Main,\"HideMainScreen\")";
Debug.ShouldStop(512);
settingsmenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((settingsmenu._main.getObject())),(Object)(RemoteObject.createImmutable("HideMainScreen")));
 BA.debugLineNum = 75;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
Debug.ShouldStop(1024);
settingsmenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((settingsmenu._main.getObject())),(Object)(RemoteObject.createImmutable("HideAppSettingsScreen")));
 BA.debugLineNum = 76;BA.debugLine="HideSettingsWindow";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.diplomna.settingsmenu.class, "_hidesettingswindow");
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
public static RemoteObject  _shoppingcart_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShoppingCart_Click (settingsmenu) ","settingsmenu",5,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("shoppingcart_click")) { return __ref.runUserSub(false, "settingsmenu","shoppingcart_click", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Public Sub ShoppingCart_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
Debug.ShouldStop(8388608);
settingsmenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((settingsmenu._main.getObject())),(Object)(RemoteObject.createImmutable("ShowMainScreen")));
 BA.debugLineNum = 89;BA.debugLine="CallSub(Main,\"HideClientOrdersScreen\")";
Debug.ShouldStop(16777216);
settingsmenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((settingsmenu._main.getObject())),(Object)(RemoteObject.createImmutable("HideClientOrdersScreen")));
 BA.debugLineNum = 90;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
Debug.ShouldStop(33554432);
settingsmenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((settingsmenu._main.getObject())),(Object)(RemoteObject.createImmutable("HideAppSettingsScreen")));
 BA.debugLineNum = 91;BA.debugLine="HideSettingsWindow";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.diplomna.settingsmenu.class, "_hidesettingswindow");
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}