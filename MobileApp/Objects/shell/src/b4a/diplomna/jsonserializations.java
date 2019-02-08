
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

public class jsonserializations implements IRemote{
	public static jsonserializations mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public jsonserializations() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, jsonserializations.class);
    static {
		mostCurrent = new jsonserializations();
        remoteMe = RemoteObject.declareNull("b4a.diplomna.jsonserializations");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("jsonserializations"), "b4a.diplomna.jsonserializations");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.diplomna.jsonserializations"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.appcolors _appcolors = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.data _data = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"AppColors",Debug.moduleToString(b4a.diplomna.appcolors.class),"Data",Debug.moduleToString(b4a.diplomna.data.class),"HttpUtils2Service",Debug.moduleToString(b4a.diplomna.httputils2service.class),"Main",Debug.moduleToString(b4a.diplomna.main.class),"Starter",Debug.moduleToString(b4a.diplomna.starter.class),"Support",Debug.moduleToString(b4a.diplomna.support.class),"Types",Debug.moduleToString(b4a.diplomna.types.class),"UISizes",Debug.moduleToString(b4a.diplomna.uisizes.class)};
}
}