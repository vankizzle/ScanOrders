
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

public class httputils2service implements IRemote{
	public static httputils2service mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public httputils2service() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("httputils2service"), "b4a.diplomna.httputils2service");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.diplomna.httputils2service");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, httputils2service.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _hc = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
public static RemoteObject _taskidtojob = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tempfolder = RemoteObject.createImmutable("");
public static RemoteObject _taskcounter = RemoteObject.createImmutable(0);
public static b4a.diplomna.main _main = null;
public static b4a.diplomna.uisizes _uisizes = null;
public static b4a.diplomna.jsonserializations _jsonserializations = null;
public static b4a.diplomna.support _support = null;
public static b4a.diplomna.types _types = null;
public static b4a.diplomna.appcolors _appcolors = null;
public static b4a.diplomna.data _data = null;
public static b4a.diplomna.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"AppColors",Debug.moduleToString(b4a.diplomna.appcolors.class),"Data",Debug.moduleToString(b4a.diplomna.data.class),"hc",httputils2service._hc,"JSONSerializations",Debug.moduleToString(b4a.diplomna.jsonserializations.class),"Main",Debug.moduleToString(b4a.diplomna.main.class),"Service",httputils2service.mostCurrent._service,"Starter",Debug.moduleToString(b4a.diplomna.starter.class),"Support",Debug.moduleToString(b4a.diplomna.support.class),"taskCounter",httputils2service._taskcounter,"TaskIdToJob",httputils2service._taskidtojob,"TempFolder",httputils2service._tempfolder,"Types",Debug.moduleToString(b4a.diplomna.types.class),"UISizes",Debug.moduleToString(b4a.diplomna.uisizes.class)};
}
}