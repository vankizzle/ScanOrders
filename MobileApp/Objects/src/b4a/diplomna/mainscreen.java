package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mainscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.mainscreen");
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
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 77;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_screenpnl.getObject()));
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
 //BA.debugLineNum = 54;BA.debugLine="Public Sub BuildUI";
 //BA.debugLineNum = 56;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
_screenpnl.setColor(_appcolors._darkgray);
 //BA.debugLineNum = 57;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
_screenpnl.AddView((android.view.View)(_header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 58;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
_header.setColor(_appcolors._fadeddarkred);
 //BA.debugLineNum = 59;BA.debugLine="FakePnl.Color = AppColors.White";
_fakepnl.setColor(_appcolors._white);
 //BA.debugLineNum = 61;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 62;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
 //BA.debugLineNum = 63;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
_settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
 //BA.debugLineNum = 64;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
_header.AddView((android.view.View)(_settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 66;BA.debugLine="ScreenPnl.AddView(Cart.AsView,5%x,37%y,90%x,50%y)";
_screenpnl.AddView((android.view.View)(_cart._asview().getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (37),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (50),ba));
 //BA.debugLineNum = 67;BA.debugLine="ScreenPnl.AddView(FakePnl,5%x - 2dip,12%y - 2dip,";
_screenpnl.AddView((android.view.View)(_fakepnl.getObject()),(int) (__c.PerXToCurrent((float) (5),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerYToCurrent((float) (12),ba)-__c.DipToCurrent((int) (2))),(int) (__c.PerXToCurrent((float) (90),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (22),ba)+__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 68;BA.debugLine="ScreenPnl.AddView(InfoScreen.AsView,5%x,12%y,90%x";
_screenpnl.AddView((android.view.View)(_infoscreen._asview().getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (12),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (22),ba));
 //BA.debugLineNum = 69;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-20%x,";
_screenpnl.AddView((android.view.View)(_settingsmenulogin._asview().getObject()),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 71;BA.debugLine="ScreenPnl.AddView(ScanButton, UISizes.ScanBtnDefa";
_screenpnl.AddView((android.view.View)(_scanbutton.getObject()),_uisizes._scanbtndefaultleft,_uisizes._scanbtndefaulttop,_uisizes._scanbtndefaultwidth,_uisizes._scanbtndefaultheight);
 //BA.debugLineNum = 72;BA.debugLine="ScanButton.Bitmap = LoadBitmap(File.DirAssets,\"sc";
_scanbutton.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"scanbtn1.png").getObject()));
 //BA.debugLineNum = 73;BA.debugLine="ScanButton.Gravity = Gravity.FILL";
_scanbutton.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _cameracheck_ready(boolean _success) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Private Sub CameraCheck_Ready (Success As Boolean)";
 //BA.debugLineNum = 81;BA.debugLine="Log(\"Camera Exists- \"&Success)";
__c.LogImpl("46160385","Camera Exists- "+BA.ObjectToString(_success),0);
 //BA.debugLineNum = 82;BA.debugLine="CameraExists=Success";
_cameraexists = _success;
 //BA.debugLineNum = 83;BA.debugLine="CallSubDelayed(Me,\"Remove_CameraChecker\")";
__c.CallSubDelayed(ba,this,"Remove_CameraChecker");
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _check_ifcameraexists() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub Check_IfCameraExists";
 //BA.debugLineNum = 88;BA.debugLine="Log(\"Start- Checking Camera\")";
__c.LogImpl("46225921","Start- Checking Camera",0);
 //BA.debugLineNum = 89;BA.debugLine="pnlCheckCamera.Initialize(\"\")";
_pnlcheckcamera.Initialize(ba,"");
 //BA.debugLineNum = 90;BA.debugLine="ScreenPnl.AddView(pnlCheckCamera,-999,-999,1dip,1";
_screenpnl.AddView((android.view.View)(_pnlcheckcamera.getObject()),(int) (-999),(int) (-999),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 91;BA.debugLine="camera.Initialize(pnlCheckCamera,\"CameraCheck\")";
_camera.Initialize(ba,(android.view.ViewGroup)(_pnlcheckcamera.getObject()),"CameraCheck");
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Public ScanButton As ImageView";
_scanbutton = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Public QRScanner As Zxing_B4A";
_qrscanner = new ice.zxing.b4aZXingLib();
 //BA.debugLineNum = 5;BA.debugLine="Private CameraExists As Boolean";
_cameraexists = false;
 //BA.debugLineNum = 6;BA.debugLine="Private pnlCheckCamera As Panel";
_pnlcheckcamera = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Public camera As Camera";
_camera = new anywheresoftware.b4a.objects.CameraW();
 //BA.debugLineNum = 9;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
 //BA.debugLineNum = 13;BA.debugLine="Public Cart As ShoppingCart";
_cart = new b4a.diplomna.shoppingcart();
 //BA.debugLineNum = 14;BA.debugLine="Public InfoScreen As ItemInfoVisualizer";
_infoscreen = new b4a.diplomna.iteminfovisualizer();
 //BA.debugLineNum = 16;BA.debugLine="Public FakePnl As Panel";
_fakepnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _hidesettings() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub HideSettings";
 //BA.debugLineNum = 41;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (_settingsmenulogin._asview().getLeft()==0) { 
 //BA.debugLineNum = 42;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
_settingsmenulogin._asview().SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 };
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 21;BA.debugLine="ScreenPnl.Initialize(\"\")";
_screenpnl.Initialize(ba,"");
 //BA.debugLineNum = 23;BA.debugLine="ScanButton.Initialize(\"startScan\")";
_scanbutton.Initialize(ba,"startScan");
 //BA.debugLineNum = 24;BA.debugLine="Header.Initialize(\"\")";
_header.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
_settingsbutton.Initialize(ba,"Settings");
 //BA.debugLineNum = 26;BA.debugLine="SettingsMenuLogin.Initialize(1)";
_settingsmenulogin._initialize(ba,(int) (1));
 //BA.debugLineNum = 28;BA.debugLine="Cart.Initialize";
_cart._initialize(ba);
 //BA.debugLineNum = 29;BA.debugLine="InfoScreen.Initialize";
_infoscreen._initialize(ba);
 //BA.debugLineNum = 31;BA.debugLine="FakePnl.Initialize(\"\")";
_fakepnl.Initialize(ba,"");
 //BA.debugLineNum = 32;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 33;BA.debugLine="Check_IfCameraExists";
_check_ifcameraexists();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _qrscanner_result(String _atype,String _values) throws Exception{
int _goodid = 0;
int _goodplu = 0;
String[] _tags = null;
 //BA.debugLineNum = 109;BA.debugLine="Public Sub QRScanner_result(atype As String, Value";
 //BA.debugLineNum = 110;BA.debugLine="Dim GoodID As Int";
_goodid = 0;
 //BA.debugLineNum = 111;BA.debugLine="Dim GoodPLU As Int";
_goodplu = 0;
 //BA.debugLineNum = 112;BA.debugLine="Try";
try { //BA.debugLineNum = 113;BA.debugLine="Dim tags() As String = Regex.Split(\"\\*\", Values)";
_tags = __c.Regex.Split("\\*",_values);
 //BA.debugLineNum = 114;BA.debugLine="GoodID = tags(0)";
_goodid = (int)(Double.parseDouble(_tags[(int) (0)]));
 //BA.debugLineNum = 115;BA.debugLine="GoodPLU = tags(1)";
_goodplu = (int)(Double.parseDouble(_tags[(int) (1)]));
 //BA.debugLineNum = 116;BA.debugLine="Cart.GetItemFromDB(GoodID)";
_cart._getitemfromdb(_goodid);
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 118;BA.debugLine="ToastMessageShow(\"Invalid QR Code Format!\",False";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid QR Code Format!"),__c.False);
 };
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _remove_camerachecker() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="private Sub Remove_CameraChecker";
 //BA.debugLineNum = 95;BA.debugLine="camera.Release";
_camera.Release();
 //BA.debugLineNum = 96;BA.debugLine="pnlCheckCamera.RemoveView";
_pnlcheckcamera.RemoveView();
 //BA.debugLineNum = 97;BA.debugLine="Log(\"End- Checking Camera\")";
__c.LogImpl("46291459","End- Checking Camera",0);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _settings_click() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub Settings_Click";
 //BA.debugLineNum = 47;BA.debugLine="If SettingsMenuLogin.AsView.Left = -20%x Then";
if (_settingsmenulogin._asview().getLeft()==-__c.PerXToCurrent((float) (20),ba)) { 
 //BA.debugLineNum = 48;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
_settingsmenulogin._asview().SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 }else if(_settingsmenulogin._asview().getLeft()==0) { 
 //BA.debugLineNum = 50;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
_settingsmenulogin._asview().SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (20),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 };
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public int  _settingsisvisible() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub SettingsIsVisible As Int";
 //BA.debugLineNum = 37;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
if (true) return _settingsmenulogin._asview().getLeft();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return 0;
}
public String  _startscan_click() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub startScan_Click";
 //BA.debugLineNum = 101;BA.debugLine="If CameraExists Then";
if (_cameraexists) { 
 //BA.debugLineNum = 102;BA.debugLine="Log(\"click\")";
__c.LogImpl("46356994","click",0);
 //BA.debugLineNum = 103;BA.debugLine="QRScanner.BeginScan(\"QRScanner\")";
_qrscanner.BeginScan(ba,"QRScanner");
 }else {
 //BA.debugLineNum = 105;BA.debugLine="Log(\"Camera:\"&CameraExists)";
__c.LogImpl("46356997","Camera:"+BA.ObjectToString(_cameraexists),0);
 };
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "REMOVE_CAMERACHECKER"))
	return _remove_camerachecker();
return BA.SubDelegator.SubNotFound;
}
}
