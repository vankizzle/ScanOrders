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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static anywheresoftware.b4a.objects.collections.List  _loadlanguages(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="data";
if (Debug.shouldDelegate(null, "loadlanguages", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadlanguages", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _languages = null;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub LoadLanguages As List";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Dim Languages As List";
_languages = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Languages.Initialize";
_languages.Initialize();
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="Languages.Add(\"English\")";
_languages.Add((Object)("English"));
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="Languages.Add(\"Bulgarian\")";
_languages.Add((Object)("Bulgarian"));
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="Languages.Add(\"test\")";
_languages.Add((Object)("test"));
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="Return Languages";
if (true) return _languages;
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _loadfontsizes(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="data";
if (Debug.shouldDelegate(null, "loadfontsizes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadfontsizes", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _fontsizes = null;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Public Sub LoadFontSizes As List";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Public FontSizes As List";
_fontsizes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="FontSizes.Initialize";
_fontsizes.Initialize();
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="FontSizes.Add(6)";
_fontsizes.Add((Object)(6));
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="FontSizes.Add(8)";
_fontsizes.Add((Object)(8));
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="FontSizes.Add(10)";
_fontsizes.Add((Object)(10));
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="FontSizes.Add(12)";
_fontsizes.Add((Object)(12));
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="FontSizes.Add(14)";
_fontsizes.Add((Object)(14));
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="FontSizes.Add(16)";
_fontsizes.Add((Object)(16));
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="Return FontSizes";
if (true) return _fontsizes;
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="End Sub";
return null;
}
}