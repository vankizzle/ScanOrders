
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
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Header",_ref.getField(false, "_header"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"ScreenPnl",_ref.getField(false, "_screenpnl"),"SettingsButton",_ref.getField(false, "_settingsbutton"),"SettingsMenuLogin",_ref.getField(false, "_settingsmenulogin")};
}
}