package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 34;BA.debugLine="LoggedCustomer.Initialize";
Debug.ShouldStop(2);
main._loggedcustomer.runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="If ScreenX > ScreenY Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",main._screenx,BA.numberCast(double.class, main._screeny))) { 
 BA.debugLineNum = 38;BA.debugLine="IsLandscape = True";
Debug.ShouldStop(32);
main._islandscape = main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 40;BA.debugLine="IsLandscape = False";
Debug.ShouldStop(128);
main._islandscape = main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 42;BA.debugLine="UISizes.Initialize(IsLandscape)";
Debug.ShouldStop(512);
main.mostCurrent._uisizes.runVoidMethod ("_initialize",main.mostCurrent.activityBA,(Object)(main._islandscape));
 BA.debugLineNum = 44;BA.debugLine="ScreenLogin.Initialize";
Debug.ShouldStop(2048);
main.mostCurrent._screenlogin.runClassMethod (b4a.example.loginscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="ScreenRegister.Initialize";
Debug.ShouldStop(4096);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="Activity.AddView(ScreenLogin.AsView,0,0,100%x,100";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._screenlogin.runClassMethod (b4a.example.loginscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 47;BA.debugLine="Activity.AddView(ScreenRegister.AsView,0,0,100%x,";
Debug.ShouldStop(16384);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 48;BA.debugLine="ScreenRegister.AsView.Visible = False";
Debug.ShouldStop(32768);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="ScreenRegister.AsView.Enabled = False";
Debug.ShouldStop(65536);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,66);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 66;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,62);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 62;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private ScreenLogin As LoginScreen";
main.mostCurrent._screenlogin = RemoteObject.createNew ("b4a.example.loginscreen");
 //BA.debugLineNum = 25;BA.debugLine="Private ScreenRegister As RegisterScreen";
main.mostCurrent._screenregister = RemoteObject.createNew ("b4a.example.registerscreen");
 //BA.debugLineNum = 27;BA.debugLine="Public ScreenX, ScreenY As Int";
main._screenx = RemoteObject.createImmutable(0);
main._screeny = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 28;BA.debugLine="Public IsLandscape As Boolean";
main._islandscape = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
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
uisizes.myClass = BA.getDeviceClass ("b4a.example.uisizes");
support.myClass = BA.getDeviceClass ("b4a.example.support");
registerscreen.myClass = BA.getDeviceClass ("b4a.example.registerscreen");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public LoggedCustomer As Customer";
main._loggedcustomer = RemoteObject.createNew ("b4a.example.types._customer");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showregisterscreen() throws Exception{
try {
		Debug.PushSubsStack("ShowRegisterScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("showregisterscreen")) { return b4a.example.main.remoteMe.runUserSub(false, "main","showregisterscreen");}
 BA.debugLineNum = 52;BA.debugLine="Public Sub ShowRegisterScreen";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If 	ScreenRegister.AsView.Visible = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 54;BA.debugLine="ScreenRegister.AsView.Visible = True";
Debug.ShouldStop(2097152);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="ScreenRegister.AsView.Enabled = True";
Debug.ShouldStop(4194304);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 57;BA.debugLine="ScreenRegister.AsView.Visible = False";
Debug.ShouldStop(16777216);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 58;BA.debugLine="ScreenRegister.AsView.Enabled = False";
Debug.ShouldStop(33554432);
main.mostCurrent._screenregister.runClassMethod (b4a.example.registerscreen.class, "_asview").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 60;BA.debugLine="End Sub";
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