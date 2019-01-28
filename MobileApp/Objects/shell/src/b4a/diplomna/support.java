
package b4a.diplomna;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class support implements IRemote{
	public static support mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public support() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, support.class);
    static {
		mostCurrent = new support();
        remoteMe = RemoteObject.declareNull("b4a.diplomna.support");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("support"), "b4a.diplomna.support");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.diplomna.support"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ip = RemoteObject.createImmutable("");
public static RemoteObject _port = RemoteObject.createImmutable("");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.data _data = null;
  public Object[] GetGlobals() {
		return new Object[] {"Data",Debug.moduleToString(b4a.diplomna.data.class),"HttpUtils2Service",support.mostCurrent._httputils2service,"IP",support._ip,"Main",Debug.moduleToString(b4a.diplomna.main.class),"Port",support._port,"Starter",Debug.moduleToString(b4a.diplomna.starter.class),"Types",Debug.moduleToString(b4a.diplomna.types.class),"UISizes",Debug.moduleToString(b4a.diplomna.uisizes.class)};
}
}