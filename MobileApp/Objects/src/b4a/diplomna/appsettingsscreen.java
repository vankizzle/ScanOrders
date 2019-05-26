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
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="SpnLanguage.Initialize(\"SpnLng\")";
__ref._spnlanguage.Initialize(ba,"SpnLng");
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="SpnFontSize.Initialize(\"SpnFntSize\")";
__ref._spnfontsize.Initialize(ba,"SpnFntSize");
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="End Sub";
return null;
}
public String  _buildui(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="ScreenPnl.Color = AppColors.FadedBlack2";
__ref._screenpnl.setColor(_appcolors._fadedblack2);
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="FillSettings";
__ref._fillsettings(null);
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="SpinnersView";
__ref._spinnersview(null);
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="ScreenPnl.AddView(SpnLanguage,UISizes.SettingsSpi";
__ref._screenpnl.AddView((android.view.View)(__ref._spnlanguage.getObject()),_uisizes._settingsspinnersleft,_uisizes._settingsspinnerstop,_uisizes._settingsspinnerswidth,_uisizes._settingsspinnersheight);
RDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="ScreenPnl.AddView(SpnFontSize,SpnLanguage.Left,Sp";
__ref._screenpnl.AddView((android.view.View)(__ref._spnfontsize.getObject()),__ref._spnlanguage.getLeft(),(int) (__ref._spnlanguage.getTop()+__ref._spnlanguage.getHeight()+__c.PerYToCurrent((float) (2),ba)),__ref._spnlanguage.getWidth(),__ref._spnlanguage.getHeight());
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="End Sub";
return "";
}
public String  _fillsettings(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "fillsettings", false))
	 {return ((String) Debug.delegate(ba, "fillsettings", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub FillSettings";
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="SpnLanguage.AddAll(Data.LoadLanguages)";
__ref._spnlanguage.AddAll(_data._loadlanguages(ba));
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="SpnFontSize.AddAll(Data.LoadFontSizes)";
__ref._spnfontsize.AddAll(_data._loadfontsizes(ba));
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="End Sub";
return "";
}
public String  _spinnersview(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "spinnersview", false))
	 {return ((String) Debug.delegate(ba, "spinnersview", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub SpinnersView";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="SpnLanguage.Color = Colors.ARGB(200,0,0,0)";
__ref._spnlanguage.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="SpnFontSize.Color = Colors.ARGB(200,0,0,0)";
__ref._spnfontsize.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="SpnLanguage.TextColor = Colors.LightGray";
__ref._spnlanguage.setTextColor(__c.Colors.LightGray);
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="SpnFontSize.TextColor = Colors.LightGray";
__ref._spnfontsize.setTextColor(__c.Colors.LightGray);
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="SpnLanguage.Padding =  Array As Int (0dip, 0dip,";
__ref._spnlanguage.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="SpnFontSize.Padding =  Array As Int (0dip, 0dip,";
__ref._spnfontsize.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=9306121;
 //BA.debugLineNum = 9306121;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.appsettingsscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Private SpnLanguage As Spinner";
_spnlanguage = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Private SpnFontSize As Spinner";
_spnfontsize = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="End Sub";
return "";
}
public String  _spnfntsize_itemclick(b4a.diplomna.appsettingsscreen __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "spnfntsize_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spnfntsize_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub SpnFntSize_ItemClick (Position As Int,";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return "";
}
public String  _spnlng_itemclick(b4a.diplomna.appsettingsscreen __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appsettingsscreen";
if (Debug.shouldDelegate(ba, "spnlng_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spnlng_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub SpnLng_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return "";
}
}