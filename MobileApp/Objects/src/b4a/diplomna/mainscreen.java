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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
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
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="ScanButton.Initialize(\"startScan\")";
__ref._scanbutton.Initialize(ba,"startScan");
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
__ref._settingsbutton.Initialize(ba,"Settings");
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="SettingsMenuLogin.Initialize(1)";
__ref._settingsmenulogin._initialize(null,ba,(int) (1));
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Cart.Initialize";
__ref._cart._initialize(null,ba);
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="InfoScreen.Initialize";
__ref._infoscreen._initialize(null,ba);
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="FakePnl.Initialize(\"\")";
__ref._fakepnl.Initialize(ba,"");
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Check_IfCameraExists";
__ref._check_ifcameraexists(null);
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return null;
}
public int  _settingsisvisible(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "settingsisvisible", false))
	 {return ((Integer) Debug.delegate(ba, "settingsisvisible", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub SettingsIsVisible As Int";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
if (true) return __ref._settingsmenulogin._asview(null).getLeft();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return 0;
}
public String  _settings_click(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "settings_click", false))
	 {return ((String) Debug.delegate(ba, "settings_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub Settings_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==-__c.PerXToCurrent((float) (15),ba)) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }else 
{RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 }}
;
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public String  _hidesettings(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "hidesettings", false))
	 {return ((String) Debug.delegate(ba, "hidesettings", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub HideSettings";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 };
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
__ref._screenpnl.setColor(_appcolors._darkgray);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
__ref._header.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="FakePnl.Color = AppColors.White";
__ref._fakepnl.setColor(_appcolors._white);
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
__ref._settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
__ref._header.AddView((android.view.View)(__ref._settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="ScreenPnl.AddView(ScanButton, UISizes.ScanBtnDefa";
__ref._screenpnl.AddView((android.view.View)(__ref._scanbutton.getObject()),_uisizes._scanbtndefaultleft,_uisizes._scanbtndefaulttop,_uisizes._scanbtndefaultwidth,_uisizes._scanbtndefaultheight);
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="ScanButton.Bitmap = LoadBitmap(File.DirAssets,\"sc";
__ref._scanbutton.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"scanbtn1.png").getObject()));
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="ScanButton.Gravity = Gravity.FILL";
__ref._scanbutton.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="ScreenPnl.AddView(Cart.AsView,5%x,35%y,90%x,50%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._cart._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (35),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (50),ba));
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="ScreenPnl.AddView(FakePnl,5%x - 2dip,10%y - 2dip,";
__ref._screenpnl.AddView((android.view.View)(__ref._fakepnl.getObject()),(int) (__c.PerXToCurrent((float) (5),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerYToCurrent((float) (10),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerXToCurrent((float) (90),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (24),ba)+__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="ScreenPnl.AddView(InfoScreen.AsView,5%x,10%y,90%x";
__ref._screenpnl.AddView((android.view.View)(__ref._infoscreen._asview(null).getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (24),ba));
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsmenulogin._asview(null).getObject()),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="End Sub";
return "";
}
public String  _cameracheck_ready(b4a.diplomna.mainscreen __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "cameracheck_ready", false))
	 {return ((String) Debug.delegate(ba, "cameracheck_ready", new Object[] {_success}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub CameraCheck_Ready (Success As Boolean)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Log(\"Camera Exists- \"&Success)";
__c.LogImpl("41376257","Camera Exists- "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="CameraExists=Success";
__ref._cameraexists = _success;
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="CallSubDelayed(Me,\"Remove_CameraChecker\")";
__c.CallSubDelayed(ba,this,"Remove_CameraChecker");
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
return "";
}
public String  _check_ifcameraexists(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "check_ifcameraexists", false))
	 {return ((String) Debug.delegate(ba, "check_ifcameraexists", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Check_IfCameraExists";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Log(\"Start- Checking Camera\")";
__c.LogImpl("41441793","Start- Checking Camera",0);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="pnlCheckCamera.Initialize(\"\")";
__ref._pnlcheckcamera.Initialize(ba,"");
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="ScreenPnl.AddView(pnlCheckCamera,-999,-999,1dip,1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlcheckcamera.getObject()),(int) (-999),(int) (-999),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="camera.Initialize(pnlCheckCamera,\"CameraCheck\")";
__ref._camera.Initialize(ba,(android.view.ViewGroup)(__ref._pnlcheckcamera.getObject()),"CameraCheck");
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Public ScanButton As ImageView";
_scanbutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Public QRScanner As Zxing_B4A";
_qrscanner = new ice.zxing.b4aZXingLib();
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Private CameraExists As Boolean";
_cameraexists = false;
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Private pnlCheckCamera As Panel";
_pnlcheckcamera = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Public camera As Camera";
_camera = new anywheresoftware.b4a.objects.CameraW();
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Public Cart As ShoppingCart";
_cart = new b4a.diplomna.shoppingcart();
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Public InfoScreen As ItemInfoVisualizer";
_infoscreen = new b4a.diplomna.iteminfovisualizer();
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Public FakePnl As Panel";
_fakepnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="End Sub";
return "";
}
public String  _qrscanner_result(b4a.diplomna.mainscreen __ref,String _atype,String _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "qrscanner_result", false))
	 {return ((String) Debug.delegate(ba, "qrscanner_result", new Object[] {_atype,_values}));}
int _goodid = 0;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub QRScanner_result(atype As String, Value";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim GoodID As Int";
_goodid = 0;
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Try";
try {RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="GoodID = Values";
_goodid = (int)(Double.parseDouble(_values));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Cart.GetItemFromDB(GoodID)";
__ref._cart._getitemfromdb(null,_goodid);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Log( \"the string is not a valid integer:error\" )";
__c.LogImpl("41638406","the string is not a valid integer:error",0);
 };
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="End Sub";
return "";
}
public String  _remove_camerachecker(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "remove_camerachecker", false))
	 {return ((String) Debug.delegate(ba, "remove_camerachecker", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="private Sub Remove_CameraChecker";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="camera.Release";
__ref._camera.Release();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="pnlCheckCamera.RemoveView";
__ref._pnlcheckcamera.RemoveView();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Log(\"End- Checking Camera\")";
__c.LogImpl("41507331","End- Checking Camera",0);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return "";
}
public String  _startscan_click(b4a.diplomna.mainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mainscreen";
if (Debug.shouldDelegate(ba, "startscan_click", false))
	 {return ((String) Debug.delegate(ba, "startscan_click", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub startScan_Click";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If CameraExists Then";
if (__ref._cameraexists) { 
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Log(\"click\")";
__c.LogImpl("41572866","click",0);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="QRScanner.BeginScan(\"QRScanner\")";
__ref._qrscanner.BeginScan(ba,"QRScanner");
 }else {
RDebugUtils.currentLine=1572894;
 //BA.debugLineNum = 1572894;BA.debugLine="Log(\"Camera:\"&CameraExists)";
__c.LogImpl("41572894","Camera:"+BA.ObjectToString(__ref._cameraexists),0);
 };
RDebugUtils.currentLine=1572896;
 //BA.debugLineNum = 1572896;BA.debugLine="End Sub";
return "";
}
}