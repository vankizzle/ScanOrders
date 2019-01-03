package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class uisizes {
private static uisizes mostCurrent = new uisizes();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _loginscrdefaultleft = 0;
public static int _loginscrdefaulttop = 0;
public static int _loginscrdefaultwidth = 0;
public static int _loginscrdefaultheight = 0;
public static int _edittextdefaultheight = 0;
public static int _scanbtndefaultleft = 0;
public static int _scanbtndefaulttop = 0;
public static int _scanbtndefaultwidth = 0;
public static int _scanbtndefaultheight = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.support _support = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba,boolean _is_landscape) throws Exception{
RDebugUtils.currentModule="uisizes";
if (Debug.shouldDelegate(null, "initialize"))
	 {return ((String) Debug.delegate(null, "initialize", new Object[] {_ba,_is_landscape}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Initialize(Is_Landscape As Boolean)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="If Is_Landscape Then";
if (_is_landscape) { 
 }else {
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="LoginScrDefaultLeft = 30%x";
_loginscrdefaultleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),_ba);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="LoginScrDefaultTop = 0%y";
_loginscrdefaulttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),_ba);
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="LoginScrDefaultWidth = 40%x";
_loginscrdefaultwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),_ba);
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="LoginScrDefaultHeight = 10%y";
_loginscrdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),_ba);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="EditTextDefaultHeight = 5%y";
_edittextdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="ScanBtnDefaultLeft = 20%x";
_scanbtndefaultleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),_ba);
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="ScanBtnDefaultTop  = 88%y";
_scanbtndefaulttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (88),_ba);
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="ScanBtnDefaultWidth = 60%x";
_scanbtndefaultwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (60),_ba);
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="ScanBtnDefaultHeight = 10%y";
_scanbtndefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),_ba);
 };
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="End Sub";
return "";
}
}