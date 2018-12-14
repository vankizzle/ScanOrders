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
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.support _support = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba,boolean _is_landscape) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(Is_Landscape As Boolean)";
 //BA.debugLineNum = 14;BA.debugLine="If Is_Landscape Then";
if (_is_landscape) { 
 }else {
 //BA.debugLineNum = 17;BA.debugLine="LoginScrDefaultLeft = 30%x";
_loginscrdefaultleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),_ba);
 //BA.debugLineNum = 18;BA.debugLine="LoginScrDefaultTop = 0%y";
_loginscrdefaulttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),_ba);
 //BA.debugLineNum = 19;BA.debugLine="LoginScrDefaultWidth = 40%x";
_loginscrdefaultwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),_ba);
 //BA.debugLineNum = 20;BA.debugLine="LoginScrDefaultHeight = 10%y";
_loginscrdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),_ba);
 //BA.debugLineNum = 21;BA.debugLine="EditTextDefaultHeight = 5%y";
_edittextdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
 };
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public LoginScrDefaultLeft As Int";
_loginscrdefaultleft = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public LoginScrDefaultTop As Int";
_loginscrdefaulttop = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public LoginScrDefaultWidth As Int";
_loginscrdefaultwidth = 0;
 //BA.debugLineNum = 9;BA.debugLine="Public LoginScrDefaultHeight As Int";
_loginscrdefaultheight = 0;
 //BA.debugLineNum = 10;BA.debugLine="Public EditTextDefaultHeight As Int";
_edittextdefaultheight = 0;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
}
