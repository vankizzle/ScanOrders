
package b4a.diplomna;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class orderinfovisualizer {
    public static RemoteObject myClass;
	public orderinfovisualizer() {
	}
    public static PCBA staticBA = new PCBA(null, orderinfovisualizer.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _infoholder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _ordercodelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _orderstatusbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _ordertotalsumlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _ordercontentcontext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.jsonserializations _jsonserializations = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.appcolors _appcolors = null;
public static b4a.diplomna.data _data = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"InfoHolder",_ref.getField(false, "_infoholder"),"OrderCodelbl",_ref.getField(false, "_ordercodelbl"),"OrderContentContext",_ref.getField(false, "_ordercontentcontext"),"OrderStatusbl",_ref.getField(false, "_orderstatusbl"),"OrderTotalSumlbl",_ref.getField(false, "_ordertotalsumlbl")};
}
}