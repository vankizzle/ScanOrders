
package b4a.diplomna;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class iteminfovisualizer {
    public static RemoteObject myClass;
	public iteminfovisualizer() {
	}
    public static PCBA staticBA = new PCBA(null, iteminfovisualizer.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _infoholder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _itemnamelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemdescriptionlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itempricelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemqttylbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemplulbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemisdicontinuedlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemsuppliernamelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemsupplierphone = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _descriptioncontext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _descriptiontext = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.jsonserializations _jsonserializations = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.appcolors _appcolors = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.data _data = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DescriptionContext",_ref.getField(false, "_descriptioncontext"),"DescriptionText",_ref.getField(false, "_descriptiontext"),"InfoHolder",_ref.getField(false, "_infoholder"),"ItemDescriptionlbl",_ref.getField(false, "_itemdescriptionlbl"),"ItemIsDicontinuedlbl",_ref.getField(false, "_itemisdicontinuedlbl"),"ItemNamelbl",_ref.getField(false, "_itemnamelbl"),"ItemPLUlbl",_ref.getField(false, "_itemplulbl"),"ItemPricelbl",_ref.getField(false, "_itempricelbl"),"ItemQttylbl",_ref.getField(false, "_itemqttylbl"),"ItemSupplierNamelbl",_ref.getField(false, "_itemsuppliernamelbl"),"ItemSupplierPhone",_ref.getField(false, "_itemsupplierphone")};
}
}