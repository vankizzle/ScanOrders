
package b4a.diplomna;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class shoppingcart {
    public static RemoteObject myClass;
	public shoppingcart() {
	}
    public static PCBA staticBA = new PCBA(null, shoppingcart.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _cartpan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pblbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _itemnamelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itempricelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemqttylbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _finalsumlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _sumlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _shoplist = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _scanneditems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _itemsdetails = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _itemssuppliers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _currentitem = RemoteObject.declareNull("b4a.diplomna.types._good");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.data _data = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CartPan",_ref.getField(false, "_cartpan"),"CurrentItem",_ref.getField(false, "_currentitem"),"FinalSumlbl",_ref.getField(false, "_finalsumlbl"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"ItemNamelbl",_ref.getField(false, "_itemnamelbl"),"ItemPricelbl",_ref.getField(false, "_itempricelbl"),"ItemQttylbl",_ref.getField(false, "_itemqttylbl"),"ItemsDetails",_ref.getField(false, "_itemsdetails"),"ItemsSuppliers",_ref.getField(false, "_itemssuppliers"),"pblBase",_ref.getField(false, "_pblbase"),"pnlHeader",_ref.getField(false, "_pnlheader"),"ScannedItems",_ref.getField(false, "_scanneditems"),"ShopList",_ref.getField(false, "_shoplist"),"Sumlbl",_ref.getField(false, "_sumlbl")};
}
}