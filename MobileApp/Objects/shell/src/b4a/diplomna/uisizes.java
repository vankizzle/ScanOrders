
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

public class uisizes implements IRemote{
	public static uisizes mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public uisizes() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, uisizes.class);
    static {
		mostCurrent = new uisizes();
        remoteMe = RemoteObject.declareNull("b4a.diplomna.uisizes");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("uisizes"), "b4a.diplomna.uisizes");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.diplomna.uisizes"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _loginscrdefaultleft = RemoteObject.createImmutable(0);
public static RemoteObject _loginscrdefaulttop = RemoteObject.createImmutable(0);
public static RemoteObject _loginscrdefaultwidth = RemoteObject.createImmutable(0);
public static RemoteObject _loginscrdefaultheight = RemoteObject.createImmutable(0);
public static RemoteObject _edittextdefaultheight = RemoteObject.createImmutable(0);
public static RemoteObject _scanbtndefaultleft = RemoteObject.createImmutable(0);
public static RemoteObject _scanbtndefaulttop = RemoteObject.createImmutable(0);
public static RemoteObject _scanbtndefaultwidth = RemoteObject.createImmutable(0);
public static RemoteObject _scanbtndefaultheight = RemoteObject.createImmutable(0);
public static RemoteObject _settingsspinnersleft = RemoteObject.createImmutable(0);
public static RemoteObject _settingsspinnerstop = RemoteObject.createImmutable(0);
public static RemoteObject _settingsspinnerswidth = RemoteObject.createImmutable(0);
public static RemoteObject _settingsspinnersheight = RemoteObject.createImmutable(0);
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.jsonserializations _jsonserializations = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.appcolors _appcolors = null;
public static b4a.diplomna.data _data = null;
public static b4a.diplomna.starter _starter = null;
public static b4a.diplomna.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"AppColors",Debug.moduleToString(b4a.diplomna.appcolors.class),"Data",Debug.moduleToString(b4a.diplomna.data.class),"EditTextDefaultHeight",uisizes._edittextdefaultheight,"HttpUtils2Service",Debug.moduleToString(b4a.diplomna.httputils2service.class),"JSONSerializations",Debug.moduleToString(b4a.diplomna.jsonserializations.class),"LoginScrDefaultHeight",uisizes._loginscrdefaultheight,"LoginScrDefaultLeft",uisizes._loginscrdefaultleft,"LoginScrDefaultTop",uisizes._loginscrdefaulttop,"LoginScrDefaultWidth",uisizes._loginscrdefaultwidth,"Main",Debug.moduleToString(b4a.diplomna.main.class),"ScanBtnDefaultHeight",uisizes._scanbtndefaultheight,"ScanBtnDefaultLeft",uisizes._scanbtndefaultleft,"ScanBtnDefaultTop",uisizes._scanbtndefaulttop,"ScanBtnDefaultWidth",uisizes._scanbtndefaultwidth,"SettingsSpinnersHeight",uisizes._settingsspinnersheight,"SettingsSpinnersLeft",uisizes._settingsspinnersleft,"SettingsSpinnersTop",uisizes._settingsspinnerstop,"SettingsSpinnersWidth",uisizes._settingsspinnerswidth,"Starter",Debug.moduleToString(b4a.diplomna.starter.class),"Support",Debug.moduleToString(b4a.diplomna.support.class),"Types",Debug.moduleToString(b4a.diplomna.types.class)};
}
}