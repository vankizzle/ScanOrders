
package b4a.diplomna;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class settingsmenu {
    public static RemoteObject myClass;
	public settingsmenu() {
	}
    public static PCBA staticBA = new PCBA(null, settingsmenu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _lblappsettings = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmyorders = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblshoppingcart = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblloginscreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlholder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _flag = RemoteObject.createImmutable(0);
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.jsonserializations _jsonserializations = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.appcolors _appcolors = null;
public static b4a.diplomna.data _data = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"flag",_ref.getField(false, "_flag"),"lblAppSettings",_ref.getField(false, "_lblappsettings"),"lblLoginScreen",_ref.getField(false, "_lblloginscreen"),"lblMyOrders",_ref.getField(false, "_lblmyorders"),"lblShoppingCart",_ref.getField(false, "_lblshoppingcart"),"pnlHolder",_ref.getField(false, "_pnlholder")};
}
}