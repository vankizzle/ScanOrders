package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class appsettingsscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.appsettingsscreen");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _screenpnl = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnlanguage = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spnfontsize = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 59;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_screenpnl.getObject()));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub BuildUI";
 //BA.debugLineNum = 22;BA.debugLine="ScreenPnl.Color = AppColors.FadedBlack2";
_screenpnl.setColor(_appcolors._fadedblack2);
 //BA.debugLineNum = 24;BA.debugLine="FillSettings";
_fillsettings();
 //BA.debugLineNum = 25;BA.debugLine="SpinnersView";
_spinnersview();
 //BA.debugLineNum = 27;BA.debugLine="ScreenPnl.AddView(SpnLanguage,UISizes.SettingsSpi";
_screenpnl.AddView((android.view.View)(_spnlanguage.getObject()),_uisizes._settingsspinnersleft,_uisizes._settingsspinnerstop,_uisizes._settingsspinnerswidth,_uisizes._settingsspinnersheight);
 //BA.debugLineNum = 28;BA.debugLine="ScreenPnl.AddView(SpnFontSize,SpnLanguage.Left,Sp";
_screenpnl.AddView((android.view.View)(_spnfontsize.getObject()),_spnlanguage.getLeft(),(int) (_spnlanguage.getTop()+_spnlanguage.getHeight()+__c.PerYToCurrent((float) (2),ba)),_spnlanguage.getWidth(),_spnlanguage.getHeight());
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private SpnLanguage As Spinner";
_spnlanguage = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private SpnFontSize As Spinner";
_spnfontsize = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _fillsettings() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub FillSettings";
 //BA.debugLineNum = 34;BA.debugLine="SpnLanguage.AddAll(Data.LoadLanguages)";
_spnlanguage.AddAll(_data._loadlanguages(ba));
 //BA.debugLineNum = 35;BA.debugLine="SpnFontSize.AddAll(Data.LoadFontSizes)";
_spnfontsize.AddAll(_data._loadfontsizes(ba));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="ScreenPnl.Initialize(\"\")";
_screenpnl.Initialize(ba,"");
 //BA.debugLineNum = 13;BA.debugLine="SpnLanguage.Initialize(\"SpnLng\")";
_spnlanguage.Initialize(ba,"SpnLng");
 //BA.debugLineNum = 14;BA.debugLine="SpnFontSize.Initialize(\"SpnFntSize\")";
_spnfontsize.Initialize(ba,"SpnFntSize");
 //BA.debugLineNum = 16;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _spinnersview() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub SpinnersView";
 //BA.debugLineNum = 40;BA.debugLine="SpnLanguage.Color = Colors.ARGB(200,0,0,0)";
_spnlanguage.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 41;BA.debugLine="SpnFontSize.Color = Colors.ARGB(200,0,0,0)";
_spnfontsize.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 43;BA.debugLine="SpnLanguage.TextColor = Colors.LightGray";
_spnlanguage.setTextColor(__c.Colors.LightGray);
 //BA.debugLineNum = 44;BA.debugLine="SpnFontSize.TextColor = Colors.LightGray";
_spnfontsize.setTextColor(__c.Colors.LightGray);
 //BA.debugLineNum = 46;BA.debugLine="SpnLanguage.Padding =  Array As Int (0dip, 0dip,";
_spnlanguage.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
 //BA.debugLineNum = 47;BA.debugLine="SpnFontSize.Padding =  Array As Int (0dip, 0dip,";
_spnfontsize.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _spnfntsize_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub SpnFntSize_ItemClick (Position As Int,";
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _spnlng_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub SpnLng_ItemClick (Position As Int, Valu";
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
