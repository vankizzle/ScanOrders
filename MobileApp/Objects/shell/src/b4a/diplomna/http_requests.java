
package b4a.diplomna;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class http_requests {
    public static RemoteObject myClass;
	public http_requests() {
	}
    public static PCBA staticBA = new PCBA(null, http_requests.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _isconnected = RemoteObject.createImmutable(false);
public static RemoteObject _output = RemoteObject.createImmutable("");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.data _data = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"IsConnected",_ref.getField(false, "_isconnected"),"Output",_ref.getField(false, "_output")};
}
}