
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

public class types implements IRemote{
	public static types mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public types() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, types.class);
    static {
		mostCurrent = new types();
        remoteMe = RemoteObject.declareNull("b4a.diplomna.types");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("types"), "b4a.diplomna.types");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.diplomna.types"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.data _data = null;
  public Object[] GetGlobals() {
		return new Object[] {"Data",Debug.moduleToString(b4a.diplomna.data.class),"HttpUtils2Service",types.mostCurrent._httputils2service,"Main",Debug.moduleToString(b4a.diplomna.main.class),"Starter",Debug.moduleToString(b4a.diplomna.starter.class),"Support",Debug.moduleToString(b4a.diplomna.support.class),"UISizes",Debug.moduleToString(b4a.diplomna.uisizes.class)};
}
}