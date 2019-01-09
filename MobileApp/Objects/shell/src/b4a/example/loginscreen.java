
package b4a.example;

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
public static RemoteObject _settingsmenulogin = RemoteObject.declareNull("b4a.example.settingsmenu");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.types _types = null;
public static b4a.example.uisizes _uisizes = null;
public static b4a.example.support _support = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Header",_ref.getField(false, "_header"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"loginbtn",_ref.getField(false, "_loginbtn"),"Logo",_ref.getField(false, "_logo"),"passwordtxt",_ref.getField(false, "_passwordtxt"),"registerbtn",_ref.getField(false, "_registerbtn"),"ScreenLogo",_ref.getField(false, "_screenlogo"),"ScreenPnl",_ref.getField(false, "_screenpnl"),"settingsbtn",_ref.getField(false, "_settingsbtn"),"SettingsButton",_ref.getField(false, "_settingsbutton"),"SettingsMenuLogin",_ref.getField(false, "_settingsmenulogin"),"usernametxt",_ref.getField(false, "_usernametxt")};
}
}