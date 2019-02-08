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
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static anywheresoftware.b4a.objects.collections.List  _loadlanguages(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="data";
if (Debug.shouldDelegate(null, "loadlanguages", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadlanguages", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _languages = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub LoadLanguages As List";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Dim Languages As List";
_languages = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Languages.Initialize";
_languages.Initialize();
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Languages.Add(\"English\")";
_languages.Add((Object)("English"));
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Languages.Add(\"Bulgarian\")";
_languages.Add((Object)("Bulgarian"));
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Languages.Add(\"test\")";
_languages.Add((Object)("test"));
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Return Languages";
if (true) return _languages;
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _loadfontsizes(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="data";
if (Debug.shouldDelegate(null, "loadfontsizes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadfontsizes", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _fontsizes = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub LoadFontSizes As List";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Public FontSizes As List";
_fontsizes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="FontSizes.Initialize";
_fontsizes.Initialize();
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="FontSizes.Add(6)";
_fontsizes.Add((Object)(6));
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="FontSizes.Add(8)";
_fontsizes.Add((Object)(8));
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="FontSizes.Add(10)";
_fontsizes.Add((Object)(10));
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="FontSizes.Add(12)";
_fontsizes.Add((Object)(12));
RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="FontSizes.Add(14)";
_fontsizes.Add((Object)(14));
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="FontSizes.Add(16)";
_fontsizes.Add((Object)(16));
RDebugUtils.currentLine=8847371;
 //BA.debugLineNum = 8847371;BA.debugLine="Return FontSizes";
if (true) return _fontsizes;
RDebugUtils.currentLine=8847372;
 //BA.debugLineNum = 8847372;BA.debugLine="End Sub";
return null;
}
}