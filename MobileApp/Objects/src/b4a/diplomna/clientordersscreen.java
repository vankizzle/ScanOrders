package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clientordersscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.clientordersscreen");
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
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 74;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_screenpnl.getObject()));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
 //BA.debugLineNum = 47;BA.debugLine="Public Sub BuildUI";
 //BA.debugLineNum = 49;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
_screenpnl.setColor(_appcolors._darkgray);
 //BA.debugLineNum = 50;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
_screenpnl.AddView((android.view.View)(_header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 51;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
_header.setColor(_appcolors._fadeddarkred);
 //BA.debugLineNum = 52;BA.debugLine="FakePnl.Color = AppColors.White";
_fakepnl.setColor(_appcolors._white);
 //BA.debugLineNum = 54;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 55;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
 //BA.debugLineNum = 56;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
_settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
 //BA.debugLineNum = 57;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
_header.AddView((android.view.View)(_settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 58;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-20%x,";
_screenpnl.AddView((android.view.View)(_settingsmenulogin._asview().getObject()),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 59;BA.debugLine="ScreenPnl.AddView(CartOrders.AsView,5%x,45%y,90%x";
_screenpnl.AddView((android.view.View)(_cartorders._asview().getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (44),ba));
 //BA.debugLineNum = 60;BA.debugLine="ScreenPnl.AddView(FakePnl,5%x - 2dip,12%y - 2dip,";
_screenpnl.AddView((android.view.View)(_fakepnl.getObject()),(int) (__c.PerXToCurrent((float) (5),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerYToCurrent((float) (12),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerXToCurrent((float) (90),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (22),ba)+__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 61;BA.debugLine="ScreenPnl.AddView(OrderInfoVisual.AsView,5%x,12%y";
_screenpnl.AddView((android.view.View)(_orderinfovisual._asview().getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (12),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (22),ba));
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
 //BA.debugLineNum = 9;BA.debugLine="Public CartOrders As OrdersCart";
_cartorders = new b4a.diplomna.orderscart();
 //BA.debugLineNum = 10;BA.debugLine="Public OrderInfoVisual As OrderInfoVisualizer";
_orderinfovisual = new b4a.diplomna.orderinfovisualizer();
 //BA.debugLineNum = 12;BA.debugLine="Public FakePnl As Panel";
_fakepnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _hidesettings() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub HideSettings";
 //BA.debugLineNum = 42;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (_settingsmenulogin._asview().getLeft()==0) { 
 //BA.debugLineNum = 43;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
_settingsmenulogin._asview().SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 };
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="ScreenPnl.Initialize(\"\")";
_screenpnl.Initialize(ba,"");
 //BA.debugLineNum = 18;BA.debugLine="Header.Initialize(\"\")";
_header.Initialize(ba,"");
 //BA.debugLineNum = 19;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
_settingsbutton.Initialize(ba,"Settings");
 //BA.debugLineNum = 20;BA.debugLine="SettingsMenuLogin.Initialize(2)";
_settingsmenulogin._initialize(ba,(int) (2));
 //BA.debugLineNum = 21;BA.debugLine="CartOrders.Initialize";
_cartorders._initialize(ba);
 //BA.debugLineNum = 22;BA.debugLine="OrderInfoVisual.Initialize";
_orderinfovisual._initialize(ba);
 //BA.debugLineNum = 30;BA.debugLine="FakePnl.Initialize(\"\")";
_fakepnl.Initialize(ba,"");
 //BA.debugLineNum = 32;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _loadclientorders(int _customerid) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub LoadClientOrders(CustomerID As Int)";
 //BA.debugLineNum = 78;BA.debugLine="CartOrders.LoadCustomerOrders(CustomerID)";
_cartorders._loadcustomerorders(_customerid);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _settings_click() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub Settings_Click";
 //BA.debugLineNum = 66;BA.debugLine="If SettingsMenuLogin.AsView.Left = -20%x Then";
if (_settingsmenulogin._asview().getLeft()==-__c.PerXToCurrent((float) (20),ba)) { 
 //BA.debugLineNum = 67;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
_settingsmenulogin._asview().SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 }else if(_settingsmenulogin._asview().getLeft()==0) { 
 //BA.debugLineNum = 69;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
_settingsmenulogin._asview().SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 };
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
