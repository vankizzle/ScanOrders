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
public anywheresoftware.b4a.objects.ImageViewWrapper _downpanel = null;
public ice.zxing.b4aZXingLib _qrscanner = null;
public boolean _cameraexists = false;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcheckcamera = null;
public anywheresoftware.b4a.objects.CameraW _camera = null;
public anywheresoftware.b4a.objects.PanelWrapper _header = null;
public anywheresoftware.b4a.objects.ButtonWrapper _settingsbutton = null;
public b4a.diplomna.settingsmenu _settingsmenulogin = null;
public b4a.diplomna.shoppingcart _cart = null;
public b4a.diplomna.iteminfovisualizer _infoscreen = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public String  _initialize(b4a.diplomna.mainscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="downPanel.Initialize(\"startScan\")";
__ref._downpanel.Initialize(ba,"startScan");
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
__ref._settingsbutton.Initialize(ba,"Settings");
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="SettingsMenuLogin.Initialize(1)";
__ref._settingsmenulogin._initialize(null,ba,(int) (1));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Cart.Initialize";
__ref._cart._initialize(null,ba);
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="InfoScreen.Initialize";
__ref._infoscreen._initialize(null,ba);
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Check_IfCameraExists";
__ref._check_ifcameraexists(null);
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return null;
}
public int  _settingsisvisible(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "settingsisvisible"))
	 {return ((Integer) Debug.delegate(ba, "settingsisvisible", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub SettingsIsVisible As Int";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
if (true) return __ref._settingsmenulogin._asview(null).getLeft();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return 0;
}
public String  _settings_click(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "settings_click"))
	 {return ((String) Debug.delegate(ba, "settings_click", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub Settings_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==-__c.PerXToCurrent((float) (15),ba)) { 
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }else 
{RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }}
;
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="End Sub";
return "";
}
public String  _hidesettings(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "hidesettings"))
	 {return ((String) Debug.delegate(ba, "hidesettings", null));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub HideSettings";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 };
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="ScreenPnl.Color = Colors.White";
__ref._screenpnl.setColor(__c.Colors.White);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Header.Color = Colors.RGB(182,0,0)";
__ref._header.setColor(__c.Colors.RGB((int) (182),(int) (0),(int) (0)));
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
__ref._settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
__ref._header.AddView((android.view.View)(__ref._settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="ScreenPnl.AddView(downPanel, UISizes.ScanBtnDefau";
__ref._screenpnl.AddView((android.view.View)(__ref._downpanel.getObject()),_uisizes._scanbtndefaultleft,_uisizes._scanbtndefaulttop,_uisizes._scanbtndefaultwidth,_uisizes._scanbtndefaultheight);
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="downPanel.Bitmap = LoadBitmap(File.DirAssets,\"Sca";
__ref._downpanel.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"ScanBtn.png").getObject()));
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="downPanel.Gravity = Gravity.FILL";
__ref._downpanel.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="ScreenPnl.AddView(Cart.AsView,5%x,35%y,90%x,50%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._cart._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (35),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (50),ba));
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="ScreenPnl.AddView(InfoScreen.AsView,5%x,10%y,90%x";
__ref._screenpnl.AddView((android.view.View)(__ref._infoscreen._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (24),ba));
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsmenulogin._asview(null).getObject()),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="End Sub";
return "";
}
public String  _cameracheck_ready(b4a.diplomna.mainscreen __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "cameracheck_ready"))
	 {return ((String) Debug.delegate(ba, "cameracheck_ready", new Object[] {_success}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub CameraCheck_Ready (Success As Boolean)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Log(\"Camera Exists- \"&Success)";
__c.Log("Camera Exists- "+BA.ObjectToString(_success));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="CameraExists=Success";
__ref._cameraexists = _success;
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="CallSubDelayed(Me,\"Remove_CameraChecker\")";
__c.CallSubDelayed(ba,this,"Remove_CameraChecker");
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public String  _check_ifcameraexists(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "check_ifcameraexists"))
	 {return ((String) Debug.delegate(ba, "check_ifcameraexists", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Check_IfCameraExists";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Log(\"Start- Checking Camera\")";
__c.Log("Start- Checking Camera");
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="pnlCheckCamera.Initialize(\"\")";
__ref._pnlcheckcamera.Initialize(ba,"");
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="ScreenPnl.AddView(pnlCheckCamera,-999,-999,1dip,1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlcheckcamera.getObject()),(int) (-999),(int) (-999),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="camera.Initialize(pnlCheckCamera,\"CameraCheck\")";
__ref._camera.Initialize(ba,(android.view.ViewGroup)(__ref._pnlcheckcamera.getObject()),"CameraCheck");
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Public downPanel As ImageView";
_downpanel = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Public QRScanner As Zxing_B4A";
_qrscanner = new ice.zxing.b4aZXingLib();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Private CameraExists As Boolean";
_cameraexists = false;
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Private pnlCheckCamera As Panel";
_pnlcheckcamera = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Public camera As Camera";
_camera = new anywheresoftware.b4a.objects.CameraW();
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="Public Cart As ShoppingCart";
_cart = new b4a.diplomna.shoppingcart();
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="Public InfoScreen As ItemInfoVisualizer";
_infoscreen = new b4a.diplomna.iteminfovisualizer();
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="End Sub";
return "";
}
public String  _qrscanner_result(b4a.diplomna.mainscreen __ref,String _atype,String _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "qrscanner_result"))
	 {return ((String) Debug.delegate(ba, "qrscanner_result", new Object[] {_atype,_values}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub QRScanner_result(atype As String, Value";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public String  _remove_camerachecker(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "remove_camerachecker"))
	 {return ((String) Debug.delegate(ba, "remove_camerachecker", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="private Sub Remove_CameraChecker";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="camera.Release";
__ref._camera.Release();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="pnlCheckCamera.RemoveView";
__ref._pnlcheckcamera.RemoveView();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Log(\"End- Checking Camera\")";
__c.Log("End- Checking Camera");
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="End Sub";
return "";
}
public String  _startscan_click(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "startscan_click"))
	 {return ((String) Debug.delegate(ba, "startscan_click", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub startScan_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If CameraExists Then";
if (__ref._cameraexists) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Log(\"click\")";
__c.Log("click");
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Cart.TestWithFakes(10)";
__ref._cart._testwithfakes(null,(int) (10));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Cart.BuildCart";
__ref._cart._buildcart(null);
 }else {
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Log(\"Camera:\"&CameraExists)";
__c.Log("Camera:"+BA.ObjectToString(__ref._cameraexists));
 };
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="End Sub";
return "";
}
}