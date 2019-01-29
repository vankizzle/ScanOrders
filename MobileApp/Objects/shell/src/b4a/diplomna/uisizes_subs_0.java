package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class uisizes_subs_0 {


public static RemoteObject  _initialize(RemoteObject _ba,RemoteObject _is_landscape) throws Exception{
try {
		Debug.PushSubsStack("Initialize (uisizes) ","uisizes",4,_ba,uisizes.mostCurrent,24);
if (RapidSub.canDelegate("initialize")) { return b4a.diplomna.uisizes.remoteMe.runUserSub(false, "uisizes","initialize", _ba, _is_landscape);}
;
Debug.locals.put("Is_Landscape", _is_landscape);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(Is_Landscape As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="If Is_Landscape Then";
Debug.ShouldStop(16777216);
if (_is_landscape.<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 28;BA.debugLine="LoginScrDefaultLeft = 30%x";
Debug.ShouldStop(134217728);
uisizes._loginscrdefaultleft = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),_ba);
 BA.debugLineNum = 29;BA.debugLine="LoginScrDefaultTop = 0%y";
Debug.ShouldStop(268435456);
uisizes._loginscrdefaulttop = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),_ba);
 BA.debugLineNum = 30;BA.debugLine="LoginScrDefaultWidth = 40%x";
Debug.ShouldStop(536870912);
uisizes._loginscrdefaultwidth = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),_ba);
 BA.debugLineNum = 31;BA.debugLine="LoginScrDefaultHeight = 10%y";
Debug.ShouldStop(1073741824);
uisizes._loginscrdefaultheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),_ba);
 BA.debugLineNum = 32;BA.debugLine="EditTextDefaultHeight = 5%y";
Debug.ShouldStop(-2147483648);
uisizes._edittextdefaultheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),_ba);
 BA.debugLineNum = 34;BA.debugLine="ScanBtnDefaultLeft = 30%x";
Debug.ShouldStop(2);
uisizes._scanbtndefaultleft = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),_ba);
 BA.debugLineNum = 35;BA.debugLine="ScanBtnDefaultTop  = 90%y";
Debug.ShouldStop(4);
uisizes._scanbtndefaulttop = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),_ba);
 BA.debugLineNum = 36;BA.debugLine="ScanBtnDefaultWidth = 40%x";
Debug.ShouldStop(8);
uisizes._scanbtndefaultwidth = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),_ba);
 BA.debugLineNum = 37;BA.debugLine="ScanBtnDefaultHeight = 5%y";
Debug.ShouldStop(16);
uisizes._scanbtndefaultheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),_ba);
 BA.debugLineNum = 39;BA.debugLine="SettingsSpinnersLeft = 2%x";
Debug.ShouldStop(64);
uisizes._settingsspinnersleft = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba);
 BA.debugLineNum = 40;BA.debugLine="SettingsSpinnersTop = 10%y";
Debug.ShouldStop(128);
uisizes._settingsspinnerstop = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),_ba);
 BA.debugLineNum = 41;BA.debugLine="SettingsSpinnersWidth = 26%x";
Debug.ShouldStop(256);
uisizes._settingsspinnerswidth = uisizes.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 26)),_ba);
 BA.debugLineNum = 42;BA.debugLine="SettingsSpinnersHeight = 3%y";
Debug.ShouldStop(512);
uisizes._settingsspinnersheight = uisizes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),_ba);
 };
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 18;BA.debugLine="Public SettingsSpinnersLeft As Int";
uisizes._settingsspinnersleft = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 19;BA.debugLine="Public SettingsSpinnersTop As Int";
uisizes._settingsspinnerstop = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 20;BA.debugLine="Public SettingsSpinnersWidth As Int";
uisizes._settingsspinnerswidth = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 21;BA.debugLine="Public SettingsSpinnersHeight As Int";
uisizes._settingsspinnersheight = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}