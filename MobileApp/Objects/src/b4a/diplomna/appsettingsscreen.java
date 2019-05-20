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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.appsettingsscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="SpnLanguage.Initialize(\"SpnLng\")";
__ref._spnlanguage.Initialize(ba,"SpnLng");
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="SpnFontSize.Initialize(\"SpnFntSize\")";
__ref._spnfontsize.Initialize(ba,"SpnFntSize");
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="End Sub";
return null;
}
public String  _buildui(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="ScreenPnl.Color = AppColors.FadedBlack2";
__ref._screenpnl.setColor(_appcolors._fadedblack2);
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="FillSettings";
__ref._fillsettings(null);
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="SpinnersView";
__ref._spinnersview(null);
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="ScreenPnl.AddView(SpnLanguage,UISizes.SettingsSpi";
__ref._screenpnl.AddView((android.view.View)(__ref._spnlanguage.getObject()),_uisizes._settingsspinnersleft,_uisizes._settingsspinnerstop,_uisizes._settingsspinnerswidth,_uisizes._settingsspinnersheight);
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="ScreenPnl.AddView(SpnFontSize,SpnLanguage.Left,Sp";
__ref._screenpnl.AddView((android.view.View)(__ref._spnfontsize.getObject()),__ref._spnlanguage.getLeft(),(int) (__ref._spnlanguage.getTop()+__ref._spnlanguage.getHeight()+__c.PerYToCurrent((float) (2),ba)),__ref._spnlanguage.getWidth(),__ref._spnlanguage.getHeight());
RDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="End Sub";
return "";
}
public String  _fillsettings(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "fillsettings", false))
	 {return ((String) Debug.delegate(ba, "fillsettings", null));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub FillSettings";
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="SpnLanguage.AddAll(Data.LoadLanguages)";
__ref._spnlanguage.AddAll(_data._loadlanguages(ba));
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="SpnFontSize.AddAll(Data.LoadFontSizes)";
__ref._spnfontsize.AddAll(_data._loadfontsizes(ba));
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="End Sub";
return "";
}
public String  _spinnersview(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "spinnersview", false))
	 {return ((String) Debug.delegate(ba, "spinnersview", null));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub SpinnersView";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="SpnLanguage.Color = Colors.ARGB(200,0,0,0)";
__ref._spnlanguage.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="SpnFontSize.Color = Colors.ARGB(200,0,0,0)";
__ref._spnfontsize.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="SpnLanguage.TextColor = Colors.LightGray";
__ref._spnlanguage.setTextColor(__c.Colors.LightGray);
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="SpnFontSize.TextColor = Colors.LightGray";
__ref._spnfontsize.setTextColor(__c.Colors.LightGray);
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="SpnLanguage.Padding =  Array As Int (0dip, 0dip,";
__ref._spnlanguage.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="SpnFontSize.Padding =  Array As Int (0dip, 0dip,";
__ref._spnfontsize.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Private SpnLanguage As Spinner";
_spnlanguage = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="Private SpnFontSize As Spinner";
_spnfontsize = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="End Sub";
return "";
}
public String  _spnfntsize_itemclick(b4a.diplomna.appsettingsscreen __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "spnfntsize_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spnfntsize_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub SpnFntSize_ItemClick (Position As Int,";
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="End Sub";
return "";
}
public String  _spnlng_itemclick(b4a.diplomna.appsettingsscreen __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "spnlng_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spnlng_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub SpnLng_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="End Sub";
return "";
}
}