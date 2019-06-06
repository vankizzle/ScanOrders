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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.mainscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="ScanButton.Initialize(\"startScan\")";
__ref._scanbutton.Initialize(ba,"startScan");
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
__ref._settingsbutton.Initialize(ba,"Settings");
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="SettingsMenuLogin.Initialize(1)";
__ref._settingsmenulogin._initialize(null,ba,(int) (1));
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="Cart.Initialize";
__ref._cart._initialize(null,ba);
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="InfoScreen.Initialize";
__ref._infoscreen._initialize(null,ba);
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="FakePnl.Initialize(\"\")";
__ref._fakepnl.Initialize(ba,"");
RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="Check_IfCameraExists";
__ref._check_ifcameraexists(null);
RDebugUtils.currentLine=6291470;
 //BA.debugLineNum = 6291470;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return null;
}
public int  _settingsisvisible(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "settingsisvisible", false))
	 {return ((Integer) Debug.delegate(ba, "settingsisvisible", null));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub SettingsIsVisible As Int";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
if (true) return __ref._settingsmenulogin._asview(null).getLeft();
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return 0;
}
public String  _settings_click(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "settings_click", false))
	 {return ((String) Debug.delegate(ba, "settings_click", null));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub Settings_Click";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If SettingsMenuLogin.AsView.Left = -20%x Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==-__c.PerXToCurrent((float) (20),ba)) { 
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 }else 
{RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 }}
;
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="End Sub";
return "";
}
public String  _hidesettings(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "hidesettings", false))
	 {return ((String) Debug.delegate(ba, "hidesettings", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub HideSettings";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 };
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
__ref._screenpnl.setColor(_appcolors._darkgray);
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
__ref._header.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="FakePnl.Color = AppColors.White";
__ref._fakepnl.setColor(_appcolors._white);
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
RDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
__ref._settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
__ref._header.AddView((android.view.View)(__ref._settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=6553612;
 //BA.debugLineNum = 6553612;BA.debugLine="ScreenPnl.AddView(Cart.AsView,5%x,37%y,90%x,50%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._cart._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (37),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (50),ba));
RDebugUtils.currentLine=6553613;
 //BA.debugLineNum = 6553613;BA.debugLine="ScreenPnl.AddView(FakePnl,5%x - 2dip,12%y - 2dip,";
__ref._screenpnl.AddView((android.view.View)(__ref._fakepnl.getObject()),(int) (__c.PerXToCurrent((float) (5),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerYToCurrent((float) (12),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerXToCurrent((float) (90),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (22),ba)+__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="ScreenPnl.AddView(InfoScreen.AsView,5%x,12%y,90%x";
__ref._screenpnl.AddView((android.view.View)(__ref._infoscreen._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (12),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (22),ba));
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-20%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsmenulogin._asview(null).getObject()),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=6553617;
 //BA.debugLineNum = 6553617;BA.debugLine="ScreenPnl.AddView(ScanButton, UISizes.ScanBtnDefa";
__ref._screenpnl.AddView((android.view.View)(__ref._scanbutton.getObject()),_uisizes._scanbtndefaultleft,_uisizes._scanbtndefaulttop,_uisizes._scanbtndefaultwidth,_uisizes._scanbtndefaultheight);
RDebugUtils.currentLine=6553618;
 //BA.debugLineNum = 6553618;BA.debugLine="ScanButton.Bitmap = LoadBitmap(File.DirAssets,\"sc";
__ref._scanbutton.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"scanbtn1.png").getObject()));
RDebugUtils.currentLine=6553619;
 //BA.debugLineNum = 6553619;BA.debugLine="ScanButton.Gravity = Gravity.FILL";
__ref._scanbutton.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=6553620;
 //BA.debugLineNum = 6553620;BA.debugLine="End Sub";
return "";
}
public String  _cameracheck_ready(b4a.diplomna.mainscreen __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "cameracheck_ready", false))
	 {return ((String) Debug.delegate(ba, "cameracheck_ready", new Object[] {_success}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub CameraCheck_Ready (Success As Boolean)";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Log(\"Camera Exists- \"&Success)";
__c.LogImpl("46684673","Camera Exists- "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="CameraExists=Success";
__ref._cameraexists = _success;
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="CallSubDelayed(Me,\"Remove_CameraChecker\")";
__c.CallSubDelayed(ba,this,"Remove_CameraChecker");
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
return "";
}
public String  _check_ifcameraexists(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "check_ifcameraexists", false))
	 {return ((String) Debug.delegate(ba, "check_ifcameraexists", null));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub Check_IfCameraExists";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Log(\"Start- Checking Camera\")";
__c.LogImpl("46750209","Start- Checking Camera",0);
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="pnlCheckCamera.Initialize(\"\")";
__ref._pnlcheckcamera.Initialize(ba,"");
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="ScreenPnl.AddView(pnlCheckCamera,-999,-999,1dip,1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlcheckcamera.getObject()),(int) (-999),(int) (-999),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="camera.Initialize(pnlCheckCamera,\"CameraCheck\")";
__ref._camera.Initialize(ba,(android.view.ViewGroup)(__ref._pnlcheckcamera.getObject()),"CameraCheck");
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Public ScanButton As ImageView";
_scanbutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Public QRScanner As Zxing_B4A";
_qrscanner = new ice.zxing.b4aZXingLib();
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Private CameraExists As Boolean";
_cameraexists = false;
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="Private pnlCheckCamera As Panel";
_pnlcheckcamera = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="Public camera As Camera";
_camera = new anywheresoftware.b4a.objects.CameraW();
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
RDebugUtils.currentLine=6225932;
 //BA.debugLineNum = 6225932;BA.debugLine="Public Cart As ShoppingCart";
_cart = new b4a.diplomna.shoppingcart();
RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="Public InfoScreen As ItemInfoVisualizer";
_infoscreen = new b4a.diplomna.iteminfovisualizer();
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="Public FakePnl As Panel";
_fakepnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6225936;
 //BA.debugLineNum = 6225936;BA.debugLine="End Sub";
return "";
}
public String  _qrscanner_result(b4a.diplomna.mainscreen __ref,String _atype,String _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "qrscanner_result", false))
	 {return ((String) Debug.delegate(ba, "qrscanner_result", new Object[] {_atype,_values}));}
int _goodid = 0;
int _goodplu = 0;
String[] _tags = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub QRScanner_result(atype As String, Value";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim GoodID As Int";
_goodid = 0;
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Dim GoodPLU As Int";
_goodplu = 0;
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Try";
try {RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="Dim tags() As String = Regex.Split(\"\\*\", Values)";
_tags = __c.Regex.Split("\\*",_values);
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="GoodID = tags(0)";
_goodid = (int)(Double.parseDouble(_tags[(int) (0)]));
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="GoodPLU = tags(1)";
_goodplu = (int)(Double.parseDouble(_tags[(int) (1)]));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="Cart.GetItemFromDB(GoodID)";
__ref._cart._getitemfromdb(null,_goodid);
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="ToastMessageShow(\"Invalid QR Code Format!\",False";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid QR Code Format!"),__c.False);
 };
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="End Sub";
return "";
}
public String  _remove_camerachecker(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "remove_camerachecker", false))
	 {return ((String) Debug.delegate(ba, "remove_camerachecker", null));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="private Sub Remove_CameraChecker";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="camera.Release";
__ref._camera.Release();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="pnlCheckCamera.RemoveView";
__ref._pnlcheckcamera.RemoveView();
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Log(\"End- Checking Camera\")";
__c.LogImpl("46815747","End- Checking Camera",0);
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="End Sub";
return "";
}
public String  _startscan_click(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "startscan_click", false))
	 {return ((String) Debug.delegate(ba, "startscan_click", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub startScan_Click";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="If CameraExists Then";
if (__ref._cameraexists) { 
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Log(\"click\")";
__c.LogImpl("46881282","click",0);
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="QRScanner.BeginScan(\"QRScanner\")";
__ref._qrscanner.BeginScan(ba,"QRScanner");
 }else {
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="Log(\"Camera:\"&CameraExists)";
__c.LogImpl("46881285","Camera:"+BA.ObjectToString(__ref._cameraexists),0);
 };
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="End Sub";
return "";
}
}