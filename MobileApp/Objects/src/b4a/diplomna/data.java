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
public static anywheresoftware.b4a.objects.collections.List  _loadfontsizes(anywheresoftware.b4a.BA _ba) throws Exception{
anywheresoftware.b4a.objects.collections.List _fontsizes = null;
 //BA.debugLineNum = 20;BA.debugLine="Public Sub LoadFontSizes As List";
 //BA.debugLineNum = 21;BA.debugLine="Public FontSizes As List";
_fontsizes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 22;BA.debugLine="FontSizes.Initialize";
_fontsizes.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="FontSizes.Add(6)";
_fontsizes.Add((Object)(6));
 //BA.debugLineNum = 25;BA.debugLine="FontSizes.Add(8)";
_fontsizes.Add((Object)(8));
 //BA.debugLineNum = 26;BA.debugLine="FontSizes.Add(10)";
_fontsizes.Add((Object)(10));
 //BA.debugLineNum = 27;BA.debugLine="FontSizes.Add(12)";
_fontsizes.Add((Object)(12));
 //BA.debugLineNum = 28;BA.debugLine="FontSizes.Add(14)";
_fontsizes.Add((Object)(14));
 //BA.debugLineNum = 29;BA.debugLine="FontSizes.Add(16)";
_fontsizes.Add((Object)(16));
 //BA.debugLineNum = 31;BA.debugLine="Return FontSizes";
if (true) return _fontsizes;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _loadlanguages(anywheresoftware.b4a.BA _ba) throws Exception{
anywheresoftware.b4a.objects.collections.List _languages = null;
 //BA.debugLineNum = 9;BA.debugLine="Public Sub LoadLanguages As List";
 //BA.debugLineNum = 10;BA.debugLine="Dim Languages As List";
_languages = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Languages.Initialize";
_languages.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Languages.Add(\"English\")";
_languages.Add((Object)("English"));
 //BA.debugLineNum = 14;BA.debugLine="Languages.Add(\"Bulgarian\")";
_languages.Add((Object)("Bulgarian"));
 //BA.debugLineNum = 15;BA.debugLine="Languages.Add(\"test\")";
_languages.Add((Object)("test"));
 //BA.debugLineNum = 17;BA.debugLine="Return Languages";
if (true) return _languages;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
}
