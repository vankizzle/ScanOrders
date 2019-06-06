package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clientordersscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.clientordersscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.clientordersscreen.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _header = null;
public anywheresoftware.b4a.objects.ButtonWrapper _settingsbutton = null;
public b4a.diplomna.settingsmenu _settingsmenulogin = null;
public b4a.diplomna.orderscart _cartorders = null;
public b4a.diplomna.orderinfovisualizer _orderinfovisual = null;
public anywheresoftware.b4a.objects.PanelWrapper _fakepnl = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.clientordersscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
__ref._settingsbutton.Initialize(ba,"Settings");
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="SettingsMenuLogin.Initialize(2)";
__ref._settingsmenulogin._initialize(null,ba,(int) (2));
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="CartOrders.Initialize";
__ref._cartorders._initialize(null,ba);
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="OrderInfoVisual.Initialize";
__ref._orderinfovisual._initialize(null,ba);
RDebugUtils.currentLine=8847374;
 //BA.debugLineNum = 8847374;BA.debugLine="FakePnl.Initialize(\"\")";
__ref._fakepnl.Initialize(ba,"");
RDebugUtils.currentLine=8847376;
 //BA.debugLineNum = 8847376;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=8847378;
 //BA.debugLineNum = 8847378;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="End Sub";
return null;
}
public String  _hidesettings(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "hidesettings", false))
	 {return ((String) Debug.delegate(ba, "hidesettings", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub HideSettings";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 };
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="End Sub";
return "";
}
public String  _loadclientorders(b4a.diplomna.clientordersscreen __ref,int _customerid) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "loadclientorders", false))
	 {return ((String) Debug.delegate(ba, "loadclientorders", new Object[] {_customerid}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub LoadClientOrders(CustomerID As Int)";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="CartOrders.LoadCustomerOrders(CustomerID)";
__ref._cartorders._loadcustomerorders(null,_customerid);
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
__ref._screenpnl.setColor(_appcolors._darkgray);
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
__ref._header.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="FakePnl.Color = AppColors.White";
__ref._fakepnl.setColor(_appcolors._white);
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
__ref._settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
__ref._header.AddView((android.view.View)(__ref._settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-20%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsmenulogin._asview(null).getObject()),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=8978444;
 //BA.debugLineNum = 8978444;BA.debugLine="ScreenPnl.AddView(CartOrders.AsView,5%x,45%y,90%x";
__ref._screenpnl.AddView((android.view.View)(__ref._cartorders._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (44),ba));
RDebugUtils.currentLine=8978445;
 //BA.debugLineNum = 8978445;BA.debugLine="ScreenPnl.AddView(FakePnl,5%x - 2dip,12%y - 2dip,";
__ref._screenpnl.AddView((android.view.View)(__ref._fakepnl.getObject()),(int) (__c.PerXToCurrent((float) (5),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerYToCurrent((float) (12),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerXToCurrent((float) (90),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (22),ba)+__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="ScreenPnl.AddView(OrderInfoVisual.AsView,5%x,12%y";
__ref._screenpnl.AddView((android.view.View)(__ref._orderinfovisual._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (12),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (22),ba));
RDebugUtils.currentLine=8978448;
 //BA.debugLineNum = 8978448;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Public CartOrders As OrdersCart";
_cartorders = new b4a.diplomna.orderscart();
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="Public OrderInfoVisual As OrderInfoVisualizer";
_orderinfovisual = new b4a.diplomna.orderinfovisualizer();
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="Public FakePnl As Panel";
_fakepnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8781836;
 //BA.debugLineNum = 8781836;BA.debugLine="End Sub";
return "";
}
public String  _settings_click(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "settings_click", false))
	 {return ((String) Debug.delegate(ba, "settings_click", null));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub Settings_Click";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="If SettingsMenuLogin.AsView.Left = -20%x Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==-__c.PerXToCurrent((float) (20),ba)) { 
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 }else 
{RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 }}
;
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="End Sub";
return "";
}
}