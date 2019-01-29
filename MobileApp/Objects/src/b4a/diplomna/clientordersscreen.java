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
public anywheresoftware.b4a.objects.ButtonWrapper _test = null;
public b4a.diplomna.orderscart _cartorders = null;
public b4a.diplomna.orderinfovisualizer _orderinfovisual = null;
public anywheresoftware.b4a.objects.PanelWrapper _fakepnl = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.clientordersscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
__ref._settingsbutton.Initialize(ba,"Settings");
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="SettingsMenuLogin.Initialize(2)";
__ref._settingsmenulogin._initialize(null,ba,(int) (2));
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="CartOrders.Initialize";
__ref._cartorders._initialize(null,ba);
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="OrderInfoVisual.Initialize";
__ref._orderinfovisual._initialize(null,ba);
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="test.Initialize(\"test\")";
__ref._test.Initialize(ba,"test");
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="test.Color = Colors.Red";
__ref._test.setColor(__c.Colors.Red);
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="test.Text = \"TEST\"";
__ref._test.setText(BA.ObjectToCharSequence("TEST"));
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="ScreenPnl.AddView(test,0%x,5%y,10%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._test.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="FakePnl.Initialize(\"\")";
__ref._fakepnl.Initialize(ba,"");
RDebugUtils.currentLine=3604495;
 //BA.debugLineNum = 3604495;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=3604496;
 //BA.debugLineNum = 3604496;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return null;
}
public String  _hidesettings(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "hidesettings", false))
	 {return ((String) Debug.delegate(ba, "hidesettings", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub HideSettings";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 };
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
__ref._screenpnl.setColor(_appcolors._darkgray);
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
__ref._header.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="FakePnl.Color = AppColors.White";
__ref._fakepnl.setColor(_appcolors._white);
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
__ref._settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
__ref._header.AddView((android.view.View)(__ref._settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsmenulogin._asview(null).getObject()),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="ScreenPnl.AddView(CartOrders.AsView,5%x,45%y,90%x";
__ref._screenpnl.AddView((android.view.View)(__ref._cartorders._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (44),ba));
RDebugUtils.currentLine=3801101;
 //BA.debugLineNum = 3801101;BA.debugLine="ScreenPnl.AddView(FakePnl,5%x - 2dip,10%y - 2dip,";
__ref._screenpnl.AddView((android.view.View)(__ref._fakepnl.getObject()),(int) (__c.PerXToCurrent((float) (5),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerYToCurrent((float) (10),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerXToCurrent((float) (90),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (24),ba)+__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="ScreenPnl.AddView(OrderInfoVisual.AsView,5%x,10%y";
__ref._screenpnl.AddView((android.view.View)(__ref._orderinfovisual._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (24),ba));
RDebugUtils.currentLine=3801104;
 //BA.debugLineNum = 3801104;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Private test As Button";
_test = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="Public CartOrders As OrdersCart";
_cartorders = new b4a.diplomna.orderscart();
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="Public OrderInfoVisual As OrderInfoVisualizer";
_orderinfovisual = new b4a.diplomna.orderinfovisualizer();
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="Public FakePnl As Panel";
_fakepnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="End Sub";
return "";
}
public String  _settings_click(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "settings_click", false))
	 {return ((String) Debug.delegate(ba, "settings_click", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub Settings_Click";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==-__c.PerXToCurrent((float) (15),ba)) { 
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }else 
{RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }}
;
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="End Sub";
return "";
}
public String  _test_click(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "test_click", false))
	 {return ((String) Debug.delegate(ba, "test_click", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub test_Click";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="CartOrders.TestWithFakes";
__ref._cartorders._testwithfakes(null);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="CartOrders.BuildCart";
__ref._cartorders._buildcart(null);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="End Sub";
return "";
}
}