package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class appsettingsscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.appsettingsscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.appsettingsscreen.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _screenpnl = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnlanguage = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnfontsize = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.appsettingsscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="SpnLanguage.Initialize(\"SpnLng\")";
__ref._spnlanguage.Initialize(ba,"SpnLng");
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="SpnFontSize.Initialize(\"SpnFntSize\")";
__ref._spnfontsize.Initialize(ba,"SpnFntSize");
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=10944519;
 //BA.debugLineNum = 10944519;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="End Sub";
return null;
}
public String  _buildui(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="ScreenPnl.Color = AppColors.FadedBlack2";
__ref._screenpnl.setColor(_appcolors._fadedblack2);
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="FillSettings";
__ref._fillsettings(null);
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="SpinnersView";
__ref._spinnersview(null);
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="ScreenPnl.AddView(SpnLanguage,UISizes.SettingsSpi";
__ref._screenpnl.AddView((android.view.View)(__ref._spnlanguage.getObject()),_uisizes._settingsspinnersleft,_uisizes._settingsspinnerstop,_uisizes._settingsspinnerswidth,_uisizes._settingsspinnersheight);
RDebugUtils.currentLine=11010056;
 //BA.debugLineNum = 11010056;BA.debugLine="ScreenPnl.AddView(SpnFontSize,SpnLanguage.Left,Sp";
__ref._screenpnl.AddView((android.view.View)(__ref._spnfontsize.getObject()),__ref._spnlanguage.getLeft(),(int) (__ref._spnlanguage.getTop()+__ref._spnlanguage.getHeight()+__c.PerYToCurrent((float) (2),ba)),__ref._spnlanguage.getWidth(),__ref._spnlanguage.getHeight());
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="End Sub";
return "";
}
public String  _fillsettings(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "fillsettings", false))
	 {return ((String) Debug.delegate(ba, "fillsettings", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub FillSettings";
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="SpnLanguage.AddAll(Data.LoadLanguages)";
__ref._spnlanguage.AddAll(_data._loadlanguages(ba));
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="SpnFontSize.AddAll(Data.LoadFontSizes)";
__ref._spnfontsize.AddAll(_data._loadfontsizes(ba));
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="End Sub";
return "";
}
public String  _spinnersview(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "spinnersview", false))
	 {return ((String) Debug.delegate(ba, "spinnersview", null));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub SpinnersView";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="SpnLanguage.Color = Colors.ARGB(200,0,0,0)";
__ref._spnlanguage.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="SpnFontSize.Color = Colors.ARGB(200,0,0,0)";
__ref._spnfontsize.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="SpnLanguage.TextColor = Colors.LightGray";
__ref._spnlanguage.setTextColor(__c.Colors.LightGray);
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="SpnFontSize.TextColor = Colors.LightGray";
__ref._spnfontsize.setTextColor(__c.Colors.LightGray);
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="SpnLanguage.Padding =  Array As Int (0dip, 0dip,";
__ref._spnlanguage.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="SpnFontSize.Padding =  Array As Int (0dip, 0dip,";
__ref._spnfontsize.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="Private SpnLanguage As Spinner";
_spnlanguage = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Private SpnFontSize As Spinner";
_spnfontsize = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="End Sub";
return "";
}
public String  _spnfntsize_itemclick(b4a.diplomna.appsettingsscreen __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "spnfntsize_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spnfntsize_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub SpnFntSize_ItemClick (Position As Int,";
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="End Sub";
return "";
}
public String  _spnlng_itemclick(b4a.diplomna.appsettingsscreen __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "spnlng_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spnlng_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub SpnLng_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="End Sub";
return "";
}
}