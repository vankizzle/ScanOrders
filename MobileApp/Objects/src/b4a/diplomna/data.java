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
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Public Sub LoadLanguages As List";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Dim Languages As List";
_languages = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Languages.Initialize";
_languages.Initialize();
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Languages.Add(\"English\")";
_languages.Add((Object)("English"));
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="Languages.Add(\"Bulgarian\")";
_languages.Add((Object)("Bulgarian"));
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="Languages.Add(\"test\")";
_languages.Add((Object)("test"));
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="Return Languages";
if (true) return _languages;
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _loadfontsizes(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="data";
if (Debug.shouldDelegate(null, "loadfontsizes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadfontsizes", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _fontsizes = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub LoadFontSizes As List";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Public FontSizes As List";
_fontsizes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="FontSizes.Initialize";
_fontsizes.Initialize();
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="FontSizes.Add(6)";
_fontsizes.Add((Object)(6));
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="FontSizes.Add(8)";
_fontsizes.Add((Object)(8));
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="FontSizes.Add(10)";
_fontsizes.Add((Object)(10));
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="FontSizes.Add(12)";
_fontsizes.Add((Object)(12));
RDebugUtils.currentLine=11796488;
 //BA.debugLineNum = 11796488;BA.debugLine="FontSizes.Add(14)";
_fontsizes.Add((Object)(14));
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="FontSizes.Add(16)";
_fontsizes.Add((Object)(16));
RDebugUtils.currentLine=11796491;
 //BA.debugLineNum = 11796491;BA.debugLine="Return FontSizes";
if (true) return _fontsizes;
RDebugUtils.currentLine=11796492;
 //BA.debugLineNum = 11796492;BA.debugLine="End Sub";
return null;
}
}