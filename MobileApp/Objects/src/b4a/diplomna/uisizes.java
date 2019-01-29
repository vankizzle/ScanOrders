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
public b4a.diplomna.types _types = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba,boolean _is_landscape) throws Exception{
RDebugUtils.currentModule="uisizes";
if (Debug.shouldDelegate(null, "initialize", false))
	 {return ((String) Debug.delegate(null, "initialize", new Object[] {_ba,_is_landscape}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub Initialize(Is_Landscape As Boolean)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If Is_Landscape Then";
if (_is_landscape) { 
 }else {
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="LoginScrDefaultLeft = 30%x";
_loginscrdefaultleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),_ba);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="LoginScrDefaultTop = 0%y";
_loginscrdefaulttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),_ba);
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="LoginScrDefaultWidth = 40%x";
_loginscrdefaultwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),_ba);
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="LoginScrDefaultHeight = 10%y";
_loginscrdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),_ba);
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="EditTextDefaultHeight = 5%y";
_edittextdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="ScanBtnDefaultLeft = 30%x";
_scanbtndefaultleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),_ba);
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="ScanBtnDefaultTop  = 90%y";
_scanbtndefaulttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),_ba);
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="ScanBtnDefaultWidth = 40%x";
_scanbtndefaultwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),_ba);
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="ScanBtnDefaultHeight = 5%y";
_scanbtndefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="SettingsSpinnersLeft = 2%x";
_settingsspinnersleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba);
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="SettingsSpinnersTop = 10%y";
_settingsspinnerstop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),_ba);
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="SettingsSpinnersWidth = 26%x";
_settingsspinnerswidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (26),_ba);
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="SettingsSpinnersHeight = 3%y";
_settingsspinnersheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),_ba);
 };
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="End Sub";
return "";
}
}