package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class uisizes_subs_0 {


public static RemoteObject  _initialize(RemoteObject _ba,RemoteObject _is_landscape) throws Exception{
try {
		Debug.PushSubsStack("Initialize (uisizes) ","uisizes",7,_ba,uisizes.mostCurrent,18);
if (RapidSub.canDelegate("initialize")) { return b4a.diplomna.uisizes.remoteMe.runUserSub(false, "uisizes","initialize", _ba, _is_landscape);}
;
Debug.locals.put("Is_Landscape", _is_landscape);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(Is_Landscape As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="If Is_Landscape Then";
Debug.ShouldStop(262144);
if (_is_landscape.<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 22;BA.debugLine="LoginScrDefaultLeft = 30%x";
Debug.ShouldStop(2097152);
uisizes._loginscrdefaultleft = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),_ba);
 BA.debugLineNum = 23;BA.debugLine="LoginScrDefaultTop = 0%y";
Debug.ShouldStop(4194304);
uisizes._loginscrdefaulttop = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),_ba);
 BA.debugLineNum = 24;BA.debugLine="LoginScrDefaultWidth = 40%x";
Debug.ShouldStop(8388608);
uisizes._loginscrdefaultwidth = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),_ba);
 BA.debugLineNum = 25;BA.debugLine="LoginScrDefaultHeight = 10%y";
Debug.ShouldStop(16777216);
uisizes._loginscrdefaultheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),_ba);
 BA.debugLineNum = 26;BA.debugLine="EditTextDefaultHeight = 5%y";
Debug.ShouldStop(33554432);
uisizes._edittextdefaultheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),_ba);
 BA.debugLineNum = 28;BA.debugLine="ScanBtnDefaultLeft = 30%x";
Debug.ShouldStop(134217728);
uisizes._scanbtndefaultleft = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),_ba);
 BA.debugLineNum = 29;BA.debugLine="ScanBtnDefaultTop  = 90%y";
Debug.ShouldStop(268435456);
uisizes._scanbtndefaulttop = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),_ba);
 BA.debugLineNum = 30;BA.debugLine="ScanBtnDefaultWidth = 40%x";
Debug.ShouldStop(536870912);
uisizes._scanbtndefaultwidth = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),_ba);
 BA.debugLineNum = 31;BA.debugLine="ScanBtnDefaultHeight = 8%y";
Debug.ShouldStop(1073741824);
uisizes._scanbtndefaultheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),_ba);
 };
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
 //BA.debugLineNum = 12;BA.debugLine="Public ScanBtnDefaultLeft As Int";
uisizes._scanbtndefaultleft = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="Public ScanBtnDefaultTop As Int";
uisizes._scanbtndefaulttop = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="Public ScanBtnDefaultWidth As Int";
uisizes._scanbtndefaultwidth = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 15;BA.debugLine="Public ScanBtnDefaultHeight As Int";
uisizes._scanbtndefaultheight = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}