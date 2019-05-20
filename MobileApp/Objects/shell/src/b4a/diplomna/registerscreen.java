
package b4a.diplomna;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class registerscreen {
    public static RemoteObject myClass;
	public registerscreen() {
	}
    public static PCBA staticBA = new PCBA(null, registerscreen.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _screenpnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlinfo1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlinfo2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlinfo3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _usernametxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _passwordtxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _emailtxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _firstnametxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lastnametxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _phonetxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _citytxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _countrytxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _addresstxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnnext0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnnext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btndone = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnback0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnback1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.jsonserializations _jsonserializations = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.appcolors _appcolors = null;
public static b4a.diplomna.data _data = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"addresstxt",_ref.getField(false, "_addresstxt"),"btnBack0",_ref.getField(false, "_btnback0"),"btnBack1",_ref.getField(false, "_btnback1"),"btnDone",_ref.getField(false, "_btndone"),"btnNext0",_ref.getField(false, "_btnnext0"),"btnNext1",_ref.getField(false, "_btnnext1"),"citytxt",_ref.getField(false, "_citytxt"),"countrytxt",_ref.getField(false, "_countrytxt"),"emailtxt",_ref.getField(false, "_emailtxt"),"firstnametxt",_ref.getField(false, "_firstnametxt"),"lastnametxt",_ref.getField(false, "_lastnametxt"),"passwordtxt",_ref.getField(false, "_passwordtxt"),"phonetxt",_ref.getField(false, "_phonetxt"),"pnlInfo1",_ref.getField(false, "_pnlinfo1"),"pnlInfo2",_ref.getField(false, "_pnlinfo2"),"pnlInfo3",_ref.getField(false, "_pnlinfo3"),"ScreenPnl",_ref.getField(false, "_screenpnl"),"usernametxt",_ref.getField(false, "_usernametxt")};
}
}