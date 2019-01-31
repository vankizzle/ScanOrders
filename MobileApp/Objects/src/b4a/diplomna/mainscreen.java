package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mainscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.mainscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.mainscreen.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ImageViewWrapper _scanbutton = null;
public ice.zxing.b4aZXingLib _qrscanner = null;
public boolean _cameraexists = false;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcheckcamera = null;
public anywheresoftware.b4a.objects.CameraW _camera = null;
public anywheresoftware.b4a.objects.PanelWrapper _header = null;
public anywheresoftware.b4a.objects.ButtonWrapper _settingsbutton = null;
public b4a.diplomna.settingsmenu _settingsmenulogin = null;
public b4a.diplomna.shoppingcart _cart = null;
public b4a.diplomna.iteminfovisualizer _infoscreen = null;
public anywheresoftware.b4a.objects.PanelWrapper _fakepnl = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.mainscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="ScanButton.Initialize(\"startScan\")";
__ref._scanbutton.Initialize(ba,"startScan");
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
__ref._settingsbutton.Initialize(ba,"Settings");
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="SettingsMenuLogin.Initialize(1)";
__ref._settingsmenulogin._initialize(null,ba,(int) (1));
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="Cart.Initialize";
__ref._cart._initialize(null,ba);
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="InfoScreen.Initialize";
__ref._infoscreen._initialize(null,ba);
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="FakePnl.Initialize(\"\")";
__ref._fakepnl.Initialize(ba,"");
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="Check_IfCameraExists";
__ref._check_ifcameraexists(null);
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return null;
}
public int  _settingsisvisible(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "settingsisvisible", false))
	 {return ((Integer) Debug.delegate(ba, "settingsisvisible", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub SettingsIsVisible As Int";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
if (true) return __ref._settingsmenulogin._asview(null).getLeft();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return 0;
}
public String  _settings_click(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "settings_click", false))
	 {return ((String) Debug.delegate(ba, "settings_click", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub Settings_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==-__c.PerXToCurrent((float) (15),ba)) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }else 
{RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }}
;
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="End Sub";
return "";
}
public String  _hidesettings(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "hidesettings", false))
	 {return ((String) Debug.delegate(ba, "hidesettings", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub HideSettings";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 };
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
__ref._screenpnl.setColor(_appcolors._darkgray);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
__ref._header.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="FakePnl.Color = AppColors.White";
__ref._fakepnl.setColor(_appcolors._white);
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
__ref._settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
__ref._header.AddView((android.view.View)(__ref._settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="ScreenPnl.AddView(ScanButton, UISizes.ScanBtnDefa";
__ref._screenpnl.AddView((android.view.View)(__ref._scanbutton.getObject()),_uisizes._scanbtndefaultleft,_uisizes._scanbtndefaulttop,_uisizes._scanbtndefaultwidth,_uisizes._scanbtndefaultheight);
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="ScanButton.Bitmap = LoadBitmap(File.DirAssets,\"sc";
__ref._scanbutton.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"scanbtn1.png").getObject()));
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="ScanButton.Gravity = Gravity.FILL";
__ref._scanbutton.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="ScreenPnl.AddView(Cart.AsView,5%x,35%y,90%x,50%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._cart._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (35),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (50),ba));
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="ScreenPnl.AddView(FakePnl,5%x - 2dip,10%y - 2dip,";
__ref._screenpnl.AddView((android.view.View)(__ref._fakepnl.getObject()),(int) (__c.PerXToCurrent((float) (5),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerYToCurrent((float) (10),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerXToCurrent((float) (90),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (24),ba)+__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="ScreenPnl.AddView(InfoScreen.AsView,5%x,10%y,90%x";
__ref._screenpnl.AddView((android.view.View)(__ref._infoscreen._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (24),ba));
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsmenulogin._asview(null).getObject()),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="End Sub";
return "";
}
public String  _cameracheck_ready(b4a.diplomna.mainscreen __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "cameracheck_ready", false))
	 {return ((String) Debug.delegate(ba, "cameracheck_ready", new Object[] {_success}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub CameraCheck_Ready (Success As Boolean)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Log(\"Camera Exists- \"&Success)";
__c.LogImpl("22621441","Camera Exists- "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="CameraExists=Success";
__ref._cameraexists = _success;
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="CallSubDelayed(Me,\"Remove_CameraChecker\")";
__c.CallSubDelayed(ba,this,"Remove_CameraChecker");
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="End Sub";
return "";
}
public String  _check_ifcameraexists(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "check_ifcameraexists", false))
	 {return ((String) Debug.delegate(ba, "check_ifcameraexists", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Check_IfCameraExists";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Log(\"Start- Checking Camera\")";
__c.LogImpl("22686977","Start- Checking Camera",0);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="pnlCheckCamera.Initialize(\"\")";
__ref._pnlcheckcamera.Initialize(ba,"");
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="ScreenPnl.AddView(pnlCheckCamera,-999,-999,1dip,1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlcheckcamera.getObject()),(int) (-999),(int) (-999),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="camera.Initialize(pnlCheckCamera,\"CameraCheck\")";
__ref._camera.Initialize(ba,(android.view.ViewGroup)(__ref._pnlcheckcamera.getObject()),"CameraCheck");
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Public ScanButton As ImageView";
_scanbutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Public QRScanner As Zxing_B4A";
_qrscanner = new ice.zxing.b4aZXingLib();
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Private CameraExists As Boolean";
_cameraexists = false;
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Private pnlCheckCamera As Panel";
_pnlcheckcamera = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Public camera As Camera";
_camera = new anywheresoftware.b4a.objects.CameraW();
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Public Cart As ShoppingCart";
_cart = new b4a.diplomna.shoppingcart();
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Public InfoScreen As ItemInfoVisualizer";
_infoscreen = new b4a.diplomna.iteminfovisualizer();
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="Public FakePnl As Panel";
_fakepnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="End Sub";
return "";
}
public String  _qrscanner_result(b4a.diplomna.mainscreen __ref,String _atype,String _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "qrscanner_result", false))
	 {return ((String) Debug.delegate(ba, "qrscanner_result", new Object[] {_atype,_values}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub QRScanner_result(atype As String, Value";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public String  _remove_camerachecker(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "remove_camerachecker", false))
	 {return ((String) Debug.delegate(ba, "remove_camerachecker", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="private Sub Remove_CameraChecker";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="camera.Release";
__ref._camera.Release();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="pnlCheckCamera.RemoveView";
__ref._pnlcheckcamera.RemoveView();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Log(\"End- Checking Camera\")";
__c.LogImpl("22752515","End- Checking Camera",0);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="End Sub";
return "";
}
public String  _startscan_click(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "startscan_click", false))
	 {return ((String) Debug.delegate(ba, "startscan_click", null));}
b4a.diplomna.types._order _o = null;
b4a.diplomna.types._orderedgoods _a = null;
b4a.diplomna.types._orderedgoods _a1 = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub startScan_Click";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If CameraExists Then";
if (__ref._cameraexists) { 
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Log(\"click\")";
__c.LogImpl("22818050","click",0);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Dim o As Order";
_o = new b4a.diplomna.types._order();
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="o.Initialize";
_o.Initialize();
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="o.CutomerID = 1";
_o.CutomerID = (int) (1);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="o.OrderCode = \"#testcode\"";
_o.OrderCode = "#testcode";
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="o.OrderStatus = \"waiting\"";
_o.OrderStatus = "waiting";
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="o.OrderTotalPrice = 50";
_o.OrderTotalPrice = 50;
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="o.OrderedGoods.Initialize";
_o.OrderedGoods.Initialize();
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="Dim a As OrderedGoods";
_a = new b4a.diplomna.types._orderedgoods();
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="Dim a1 As OrderedGoods";
_a1 = new b4a.diplomna.types._orderedgoods();
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="a.Initialize";
_a.Initialize();
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="a1.Initialize";
_a1.Initialize();
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="a.GoodID = 2";
_a.GoodID = (int) (2);
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="a.Qtty = 3";
_a.Qtty = (int) (3);
RDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="a1.GoodID = 3";
_a1.GoodID = (int) (3);
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="a1.Qtty = 2";
_a1.Qtty = (int) (2);
RDebugUtils.currentLine=2818071;
 //BA.debugLineNum = 2818071;BA.debugLine="o.OrderedGoods.Add(a)";
_o.OrderedGoods.Add((Object)(_a));
RDebugUtils.currentLine=2818072;
 //BA.debugLineNum = 2818072;BA.debugLine="o.OrderedGoods.Add(a1)";
_o.OrderedGoods.Add((Object)(_a1));
RDebugUtils.currentLine=2818074;
 //BA.debugLineNum = 2818074;BA.debugLine="Main.HTTP.SendOrder(o)";
_main._http._sendorder(null,_o);
 }else {
RDebugUtils.currentLine=2818077;
 //BA.debugLineNum = 2818077;BA.debugLine="Log(\"Camera:\"&CameraExists)";
__c.LogImpl("22818077","Camera:"+BA.ObjectToString(__ref._cameraexists),0);
 };
RDebugUtils.currentLine=2818079;
 //BA.debugLineNum = 2818079;BA.debugLine="End Sub";
return "";
}
}