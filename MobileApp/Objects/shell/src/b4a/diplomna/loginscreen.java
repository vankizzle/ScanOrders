
package b4a.diplomna;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class loginscreen {
    public static RemoteObject myClass;
	public loginscreen() {
	}
    public static PCBA staticBA = new PCBA(null, loginscreen.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _screenpnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _screenlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _logo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _header = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _usernametxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _passwordtxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _loginbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _registerbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _settingsbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _settingsbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _settingsmenulogin = RemoteObject.declareNull("b4a.diplomna.settingsmenu");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.data _data = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.appcolors _appcolors = null;
public static b4a.diplomna.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Header",_ref.getField(false, "_header"),"loginbtn",_ref.getField(false, "_loginbtn"),"Logo",_ref.getField(false, "_logo"),"passwordtxt",_ref.getField(false, "_passwordtxt"),"registerbtn",_ref.getField(false, "_registerbtn"),"ScreenLogo",_ref.getField(false, "_screenlogo"),"ScreenPnl",_ref.getField(false, "_screenpnl"),"settingsbtn",_ref.getField(false, "_settingsbtn"),"SettingsButton",_ref.getField(false, "_settingsbutton"),"SettingsMenuLogin",_ref.getField(false, "_settingsmenulogin"),"usernametxt",_ref.getField(false, "_usernametxt")};
}
}