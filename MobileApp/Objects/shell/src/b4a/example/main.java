
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _loggedcustomer = RemoteObject.declareNull("b4a.example.types._customer");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _http = RemoteObject.declareNull("b4a.example.http_requests");
public static RemoteObject _screenlogin = RemoteObject.declareNull("b4a.example.loginscreen");
public static RemoteObject _screenregister = RemoteObject.declareNull("b4a.example.registerscreen");
public static RemoteObject _appmainscreen = RemoteObject.declareNull("b4a.example.mainscreen");
public static RemoteObject _screenx = RemoteObject.createImmutable(0);
public static RemoteObject _screeny = RemoteObject.createImmutable(0);
public static RemoteObject _islandscape = RemoteObject.createImmutable(false);
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.starter _starter = null;
public static b4a.example.types _types = null;
public static b4a.example.uisizes _uisizes = null;
public static b4a.example.support _support = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"AppMainScreen",main.mostCurrent._appmainscreen,"HTTP",main._http,"HttpUtils2Service",main.mostCurrent._httputils2service,"IsLandscape",main._islandscape,"LoggedCustomer",main._loggedcustomer,"RP",main._rp,"ScreenLogin",main.mostCurrent._screenlogin,"ScreenRegister",main.mostCurrent._screenregister,"ScreenX",main._screenx,"ScreenY",main._screeny,"Starter",Debug.moduleToString(b4a.example.starter.class),"Support",Debug.moduleToString(b4a.example.support.class),"Types",Debug.moduleToString(b4a.example.types.class),"UISizes",Debug.moduleToString(b4a.example.uisizes.class)};
}
}