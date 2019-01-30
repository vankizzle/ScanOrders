
package b4a.diplomna;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clientordersscreen {
    public static RemoteObject myClass;
	public clientordersscreen() {
	}
    public static PCBA staticBA = new PCBA(null, clientordersscreen.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _screenpnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _header = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _settingsbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _settingsmenulogin = RemoteObject.declareNull("b4a.diplomna.settingsmenu");
public static RemoteObject _test = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _cartorders = RemoteObject.declareNull("b4a.diplomna.orderscart");
public static RemoteObject _orderinfovisual = RemoteObject.declareNull("b4a.diplomna.orderinfovisualizer");
public static RemoteObject _fakepnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.appcolors _appcolors = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.data _data = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.jsonserializations _jsonserializations = null;
public static b4a.diplomna.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CartOrders",_ref.getField(false, "_cartorders"),"FakePnl",_ref.getField(false, "_fakepnl"),"Header",_ref.getField(false, "_header"),"OrderInfoVisual",_ref.getField(false, "_orderinfovisual"),"ScreenPnl",_ref.getField(false, "_screenpnl"),"SettingsButton",_ref.getField(false, "_settingsbutton"),"SettingsMenuLogin",_ref.getField(false, "_settingsmenulogin"),"test",_ref.getField(false, "_test")};
}
}