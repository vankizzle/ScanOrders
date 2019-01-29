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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.data _data = null;
public String  _initialize(b4a.diplomna.clientordersscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
__ref._settingsbutton.Initialize(ba,"Settings");
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="SettingsMenuLogin.Initialize(2)";
__ref._settingsmenulogin._initialize(null,ba,(int) (2));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="CartOrders.Initialize";
__ref._cartorders._initialize(null,ba);
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="test.Initialize(\"test\")";
__ref._test.Initialize(ba,"test");
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="test.Color = Colors.Red";
__ref._test.setColor(__c.Colors.Red);
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="ScreenPnl.AddView(test,5%x,10%y,10%x,10%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._test.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return null;
}
public String  _hidesettings(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "hidesettings"))
	 {return ((String) Debug.delegate(ba, "hidesettings", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub HideSettings";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 };
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="ScreenPnl.Color = Colors.White";
__ref._screenpnl.setColor(__c.Colors.White);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Header.Color = Colors.RGB(182,0,0)";
__ref._header.setColor(__c.Colors.RGB((int) (182),(int) (0),(int) (0)));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
__ref._settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
__ref._header.AddView((android.view.View)(__ref._settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsmenulogin._asview(null).getObject()),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="ScreenPnl.AddView(CartOrders.AsView,5%x,45%y,90%x";
__ref._screenpnl.AddView((android.view.View)(__ref._cartorders._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (44),ba));
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Private test As Button";
_test = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Public CartOrders As OrdersCart";
_cartorders = new b4a.diplomna.orderscart();
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="End Sub";
return "";
}
public String  _settings_click(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "settings_click"))
	 {return ((String) Debug.delegate(ba, "settings_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Settings_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==-__c.PerXToCurrent((float) (15),ba)) { 
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }else 
{RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }}
;
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="End Sub";
return "";
}
public String  _test_click(b4a.diplomna.clientordersscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientordersscreen";
if (Debug.shouldDelegate(ba, "test_click"))
	 {return ((String) Debug.delegate(ba, "test_click", null));}
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub test_Click";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="CartOrders.TestWithFakes";
__ref._cartorders._testwithfakes(null);
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="CartOrders.BuildCart";
__ref._cartorders._buildcart(null);
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="End Sub";
return "";
}
}