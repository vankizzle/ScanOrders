package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class data {
private static data mostCurrent = new data();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static anywheresoftware.b4a.objects.collections.List  _loadlanguages(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="data";
if (Debug.shouldDelegate(null, "loadlanguages", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadlanguages", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _languages = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub LoadLanguages As List";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim Languages As List";
_languages = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Languages.Initialize";
_languages.Initialize();
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Languages.Add(\"English\")";
_languages.Add((Object)("English"));
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="Languages.Add(\"Bulgarian\")";
_languages.Add((Object)("Bulgarian"));
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="Languages.Add(\"test\")";
_languages.Add((Object)("test"));
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="Return Languages";
if (true) return _languages;
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _loadfontsizes(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="data";
if (Debug.shouldDelegate(null, "loadfontsizes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadfontsizes", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _fontsizes = null;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub LoadFontSizes As List";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Public FontSizes As List";
_fontsizes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="FontSizes.Initialize";
_fontsizes.Initialize();
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="FontSizes.Add(6)";
_fontsizes.Add((Object)(6));
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="FontSizes.Add(8)";
_fontsizes.Add((Object)(8));
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="FontSizes.Add(10)";
_fontsizes.Add((Object)(10));
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="FontSizes.Add(12)";
_fontsizes.Add((Object)(12));
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="FontSizes.Add(14)";
_fontsizes.Add((Object)(14));
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="FontSizes.Add(16)";
_fontsizes.Add((Object)(16));
RDebugUtils.currentLine=9699339;
 //BA.debugLineNum = 9699339;BA.debugLine="Return FontSizes";
if (true) return _fontsizes;
RDebugUtils.currentLine=9699340;
 //BA.debugLineNum = 9699340;BA.debugLine="End Sub";
return null;
}
}