package b4a.diplomna;


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
public static int _settingsspinnersleft = 0;
public static int _settingsspinnerstop = 0;
public static int _settingsspinnerswidth = 0;
public static int _settingsspinnersheight = 0;
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba,boolean _is_landscape) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(Is_Landscape As Boolean)";
 //BA.debugLineNum = 25;BA.debugLine="If Is_Landscape Then";
if (_is_landscape) { 
 }else {
 //BA.debugLineNum = 28;BA.debugLine="LoginScrDefaultLeft = 30%x";
_loginscrdefaultleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),_ba);
 //BA.debugLineNum = 29;BA.debugLine="LoginScrDefaultTop = 0%y";
_loginscrdefaulttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),_ba);
 //BA.debugLineNum = 30;BA.debugLine="LoginScrDefaultWidth = 40%x";
_loginscrdefaultwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),_ba);
 //BA.debugLineNum = 31;BA.debugLine="LoginScrDefaultHeight = 10%y";
_loginscrdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),_ba);
 //BA.debugLineNum = 32;BA.debugLine="EditTextDefaultHeight = 5%y";
_edittextdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
 //BA.debugLineNum = 34;BA.debugLine="ScanBtnDefaultLeft = 30%x";
_scanbtndefaultleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),_ba);
 //BA.debugLineNum = 35;BA.debugLine="ScanBtnDefaultTop  = 90%y";
_scanbtndefaulttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),_ba);
 //BA.debugLineNum = 36;BA.debugLine="ScanBtnDefaultWidth = 40%x";
_scanbtndefaultwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),_ba);
 //BA.debugLineNum = 37;BA.debugLine="ScanBtnDefaultHeight = 5%y";
_scanbtndefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
 //BA.debugLineNum = 39;BA.debugLine="SettingsSpinnersLeft = 2%x";
_settingsspinnersleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba);
 //BA.debugLineNum = 40;BA.debugLine="SettingsSpinnersTop = 10%y";
_settingsspinnerstop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),_ba);
 //BA.debugLineNum = 41;BA.debugLine="SettingsSpinnersWidth = 26%x";
_settingsspinnerswidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (26),_ba);
 //BA.debugLineNum = 42;BA.debugLine="SettingsSpinnersHeight = 3%y";
_settingsspinnersheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),_ba);
 };
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="Public ScanBtnDefaultLeft As Int";
_scanbtndefaultleft = 0;
 //BA.debugLineNum = 13;BA.debugLine="Public ScanBtnDefaultTop As Int";
_scanbtndefaulttop = 0;
 //BA.debugLineNum = 14;BA.debugLine="Public ScanBtnDefaultWidth As Int";
_scanbtndefaultwidth = 0;
 //BA.debugLineNum = 15;BA.debugLine="Public ScanBtnDefaultHeight As Int";
_scanbtndefaultheight = 0;
 //BA.debugLineNum = 18;BA.debugLine="Public SettingsSpinnersLeft As Int";
_settingsspinnersleft = 0;
 //BA.debugLineNum = 19;BA.debugLine="Public SettingsSpinnersTop As Int";
_settingsspinnerstop = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public SettingsSpinnersWidth As Int";
_settingsspinnerswidth = 0;
 //BA.debugLineNum = 21;BA.debugLine="Public SettingsSpinnersHeight As Int";
_settingsspinnersheight = 0;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
}
