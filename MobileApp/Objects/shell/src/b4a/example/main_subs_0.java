package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 32;BA.debugLine="If ScreenX > ScreenY Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",main._screenx,BA.numberCast(double.class, main._screeny))) { 
 BA.debugLineNum = 33;BA.debugLine="IsLandscape = True";
Debug.ShouldStop(1);
main._islandscape = main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 35;BA.debugLine="IsLandscape = False";
Debug.ShouldStop(4);
main._islandscape = main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 37;BA.debugLine="UISizes.Initialize(IsLandscape)";
Debug.ShouldStop(16);
main.mostCurrent._uisizes.runVoidMethod ("_initialize",main.mostCurrent.activityBA,(Object)(main._islandscape));
 BA.debugLineNum = 39;BA.debugLine="ScreenLogin.Initialize";
Debug.ShouldStop(64);
main.mostCurrent._screenlogin.runClassMethod (b4a.example.loginscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="Activity.AddView(ScreenLogin.AsView,0,0,100%x,100";
Debug.ShouldStop(128);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._screenlogin.runClassMethod (b4a.example.loginscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
 //BA.debugLineNum = 25;BA.debugLine="Public ScreenX, ScreenY As Int";
main._screenx = RemoteObject.createImmutable(0);
main._screeny = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 26;BA.debugLine="Public IsLandscape As Boolean";
main._islandscape = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
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
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}