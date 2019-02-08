package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class data_subs_0 {


public static RemoteObject  _loadfontsizes(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("LoadFontSizes (data) ","data",15,_ba,data.mostCurrent,20);
if (RapidSub.canDelegate("loadfontsizes")) { return b4a.diplomna.data.remoteMe.runUserSub(false, "data","loadfontsizes", _ba);}
RemoteObject _fontsizes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
 BA.debugLineNum = 20;BA.debugLine="Public Sub LoadFontSizes As List";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Public FontSizes As List";
Debug.ShouldStop(1048576);
_fontsizes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FontSizes", _fontsizes);
 BA.debugLineNum = 22;BA.debugLine="FontSizes.Initialize";
Debug.ShouldStop(2097152);
_fontsizes.runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="FontSizes.Add(6)";
Debug.ShouldStop(8388608);
_fontsizes.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((6))));
 BA.debugLineNum = 25;BA.debugLine="FontSizes.Add(8)";
Debug.ShouldStop(16777216);
_fontsizes.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((8))));
 BA.debugLineNum = 26;BA.debugLine="FontSizes.Add(10)";
Debug.ShouldStop(33554432);
_fontsizes.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((10))));
 BA.debugLineNum = 27;BA.debugLine="FontSizes.Add(12)";
Debug.ShouldStop(67108864);
_fontsizes.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((12))));
 BA.debugLineNum = 28;BA.debugLine="FontSizes.Add(14)";
Debug.ShouldStop(134217728);
_fontsizes.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((14))));
 BA.debugLineNum = 29;BA.debugLine="FontSizes.Add(16)";
Debug.ShouldStop(268435456);
_fontsizes.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((16))));
 BA.debugLineNum = 31;BA.debugLine="Return FontSizes";
Debug.ShouldStop(1073741824);
if (true) return _fontsizes;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadlanguages(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("LoadLanguages (data) ","data",15,_ba,data.mostCurrent,9);
if (RapidSub.canDelegate("loadlanguages")) { return b4a.diplomna.data.remoteMe.runUserSub(false, "data","loadlanguages", _ba);}
RemoteObject _languages = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
 BA.debugLineNum = 9;BA.debugLine="Public Sub LoadLanguages As List";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim Languages As List";
Debug.ShouldStop(512);
_languages = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Languages", _languages);
 BA.debugLineNum = 11;BA.debugLine="Languages.Initialize";
Debug.ShouldStop(1024);
_languages.runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="Languages.Add(\"English\")";
Debug.ShouldStop(4096);
_languages.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("English"))));
 BA.debugLineNum = 14;BA.debugLine="Languages.Add(\"Bulgarian\")";
Debug.ShouldStop(8192);
_languages.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Bulgarian"))));
 BA.debugLineNum = 15;BA.debugLine="Languages.Add(\"test\")";
Debug.ShouldStop(16384);
_languages.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("test"))));
 BA.debugLineNum = 17;BA.debugLine="Return Languages";
Debug.ShouldStop(65536);
if (true) return _languages;
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}