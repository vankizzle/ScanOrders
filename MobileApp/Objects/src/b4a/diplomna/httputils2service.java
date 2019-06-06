package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class httputils2service extends  android.app.Service{
	public static class httputils2service_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (httputils2service) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, httputils2service.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static httputils2service mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return httputils2service.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.diplomna", "b4a.diplomna.httputils2service");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.diplomna.httputils2service", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (httputils2service) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (httputils2service) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (httputils2service) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (httputils2service) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (httputils2service) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "completejob", false))
	 {return ((String) Debug.delegate(processBA, "completejob", new Object[] {_taskid,_success,_errormessage}));}
b4a.diplomna.httpjob _job = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.diplomna.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="job.success = success";
_job._success = _success;
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage = _errormessage;
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="job.Complete(TaskId)";
_job._complete(null,_taskid);
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responseerror", false))
	 {return ((String) Debug.delegate(processBA, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
b4a.diplomna.httpjob _job = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.LogImpl("411468801",("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""),0);
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.diplomna.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="job.Response = Response";
_job._response = _response;
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responsesuccess", false))
	 {return ((String) Debug.delegate(processBA, "hc_responsesuccess", new Object[] {_response,_taskid}));}
b4a.diplomna.httpjob _job = null;
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.diplomna.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="job.Response = Response";
_job._response = _response;
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="Response.GetAsynchronously(\"response\", File.OpenO";
_response.GetAsynchronously(processBA,"response",(java.io.OutputStream)(anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False).getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "response_streamfinish", false))
	 {return ((String) Debug.delegate(processBA, "response_streamfinish", new Object[] {_success,_taskid}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
 };
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="TempFolder = File.DirInternalCache";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternalCache();
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Try";
try {RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="File.WriteString(TempFolder, \"~test.test\", \"test";
anywheresoftware.b4a.keywords.Common.File.WriteString(_tempfolder,"~test.test","test");
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="File.Delete(TempFolder, \"~test.test\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_tempfolder,"~test.test");
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("411075592",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=11075593;
 //BA.debugLineNum = 11075593;BA.debugLine="Log(\"Switching to File.DirInternal\")";
anywheresoftware.b4a.keywords.Common.LogImpl("411075593","Switching to File.DirInternal",0);
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="TempFolder = File.DirInternal";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternal();
 };
RDebugUtils.currentLine=11075599;
 //BA.debugLineNum = 11075599;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
RDebugUtils.currentLine=11075600;
 //BA.debugLineNum = 11075600;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
RDebugUtils.currentLine=11075601;
 //BA.debugLineNum = 11075601;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(b4a.diplomna.httpjob _job) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "submitjob", false))
	 {return ((String) Debug.delegate(processBA, "submitjob", new Object[] {_job}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="If hc.IsInitialized = False Then Service_Create";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
_taskidtojob.Put((Object)(_taskcounter),(Object)(_job));
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username).equals("") == false && (_job._password).equals("") == false) { 
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
_hc.ExecuteCredentials(processBA,_job._getrequest(null),_taskcounter,_job._username,_job._password);
 }else {
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
_hc.Execute(processBA,_job._getrequest(null),_taskcounter);
 };
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="End Sub";
return "";
}
}