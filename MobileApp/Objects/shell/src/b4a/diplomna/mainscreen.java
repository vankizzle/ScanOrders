
package b4a.diplomna;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class mainscreen {
    public static RemoteObject myClass;
	public mainscreen() {
	}
    public static PCBA staticBA = new PCBA(null, mainscreen.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _screenpnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _downpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _qrscanner = RemoteObject.declareNull("ice.zxing.b4aZXingLib");
public static RemoteObject _cameraexists = RemoteObject.createImmutable(false);
public static RemoteObject _pnlcheckcamera = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _camera = RemoteObject.declareNull("anywheresoftware.b4a.objects.CameraW");
public static RemoteObject _header = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _settingsbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _settingsmenulogin = RemoteObject.declareNull("b4a.diplomna.settingsmenu");
public static RemoteObject _cart = RemoteObject.declareNull("b4a.diplomna.shoppingcart");
public static RemoteObject _infoscreen = RemoteObject.declareNull("b4a.diplomna.iteminfovisualizer");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"camera",_ref.getField(false, "_camera"),"CameraExists",_ref.getField(false, "_cameraexists"),"Cart",_ref.getField(false, "_cart"),"downPanel",_ref.getField(false, "_downpanel"),"Header",_ref.getField(false, "_header"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"InfoScreen",_ref.getField(false, "_infoscreen"),"pnlCheckCamera",_ref.getField(false, "_pnlcheckcamera"),"QRScanner",_ref.getField(false, "_qrscanner"),"ScreenPnl",_ref.getField(false, "_screenpnl"),"SettingsButton",_ref.getField(false, "_settingsbutton"),"SettingsMenuLogin",_ref.getField(false, "_settingsmenulogin")};
}
}