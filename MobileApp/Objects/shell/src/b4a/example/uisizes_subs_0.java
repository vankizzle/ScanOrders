package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class uisizes_subs_0 {


public static RemoteObject  _initialize(RemoteObject _ba,RemoteObject _is_landscape) throws Exception{
try {
		Debug.PushSubsStack("Initialize (uisizes) ","uisizes",4,_ba,uisizes.mostCurrent,13);
if (RapidSub.canDelegate("initialize")) { return b4a.example.uisizes.remoteMe.runUserSub(false, "uisizes","initialize", _ba, _is_landscape);}
;
Debug.locals.put("Is_Landscape", _is_landscape);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(Is_Landscape As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="If Is_Landscape Then";
Debug.ShouldStop(8192);
if (_is_landscape.<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 17;BA.debugLine="LoginScrDefaultLeft = 30%x";
Debug.ShouldStop(65536);
uisizes._loginscrdefaultleft = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),_ba);
 BA.debugLineNum = 18;BA.debugLine="LoginScrDefaultTop = 0%y";
Debug.ShouldStop(131072);
uisizes._loginscrdefaulttop = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),_ba);
 BA.debugLineNum = 19;BA.debugLine="LoginScrDefaultWidth = 40%x";
Debug.ShouldStop(262144);
uisizes._loginscrdefaultwidth = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),_ba);
 BA.debugLineNum = 20;BA.debugLine="LoginScrDefaultHeight = 10%y";
Debug.ShouldStop(524288);
uisizes._loginscrdefaultheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),_ba);
 BA.debugLineNum = 21;BA.debugLine="EditTextDefaultHeight = 5%y";
Debug.ShouldStop(1048576);
uisizes._edittextdefaultheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),_ba);
 };
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public LoginScrDefaultLeft As Int";
uisizes._loginscrdefaultleft = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 7;BA.debugLine="Public LoginScrDefaultTop As Int";
uisizes._loginscrdefaulttop = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 8;BA.debugLine="Public LoginScrDefaultWidth As Int";
uisizes._loginscrdefaultwidth = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 9;BA.debugLine="Public LoginScrDefaultHeight As Int";
uisizes._loginscrdefaultheight = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="Public EditTextDefaultHeight As Int";
uisizes._edittextdefaultheight = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}