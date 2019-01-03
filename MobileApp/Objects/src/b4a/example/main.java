package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.example.types._customer _loggedcustomer = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static b4a.example.http_requests _http = null;
public b4a.example.loginscreen _screenlogin = null;
public b4a.example.registerscreen _screenregister = null;
public b4a.example.mainscreen _appmainscreen = null;
public static int _screenx = 0;
public static int _screeny = 0;
public static boolean _islandscape = false;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.support _support = null;
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.main parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
b4a.example.main parent;
boolean _firsttime;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="If (APIVersion >= 23) Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_apiversion()>=23)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="RP.CheckAndRequest(RP.PERMISSION_WRITE_EXTERNAL_";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_WRITE_EXTERNAL_STORAGE);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Wait For Activity_PermissionResult(Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "activity_create"), null);
this.state = 19;
return;
case 19:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="If Not (Result) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_result)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="Log(\"storage permission error\")";
anywheresoftware.b4a.keywords.Common.Log("storage permission error");
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="RP.CheckAndRequest(RP.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="Wait For Activity_PermissionResult(Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "activity_create"), null);
this.state = 20;
return;
case 20:
//C
this.state = 8;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="If Not (Result) Then";
if (true) break;

case 8:
//if
this.state = 11;
if (anywheresoftware.b4a.keywords.Common.Not(_result)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Log(\"camera permission error\")";
anywheresoftware.b4a.keywords.Common.Log("camera permission error");
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="HTTP.Initialize(Connected)";
parent._http._initialize(null,processBA,_connected());
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="LoggedCustomer.Initialize";
parent._loggedcustomer.Initialize();
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="If ScreenX > ScreenY Then";
if (true) break;

case 13:
//if
this.state = 18;
if (parent._screenx>parent._screeny) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="IsLandscape = True";
parent._islandscape = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="IsLandscape = False";
parent._islandscape = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="UISizes.Initialize(IsLandscape)";
parent.mostCurrent._uisizes._initialize(mostCurrent.activityBA,parent._islandscape);
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="ScreenLogin.Initialize";
parent.mostCurrent._screenlogin._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="ScreenRegister.Initialize";
parent.mostCurrent._screenregister._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="AppMainScreen.Initialize";
parent.mostCurrent._appmainscreen._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="Activity.AddView(ScreenLogin.AsView,0,0,100%x,100";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._screenlogin._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131106;
 //BA.debugLineNum = 131106;BA.debugLine="Activity.AddView(ScreenRegister.AsView,0,0,100%x,";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._screenregister._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131107;
 //BA.debugLineNum = 131107;BA.debugLine="Activity.AddView(AppMainScreen.AsView,0,0,100%x,1";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._appmainscreen._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131109;
 //BA.debugLineNum = 131109;BA.debugLine="ScreenRegister.AsView.Visible = False";
parent.mostCurrent._screenregister._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="ScreenRegister.AsView.Enabled = False";
parent.mostCurrent._screenregister._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="AppMainScreen.AsView.Visible = False";
parent.mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131113;
 //BA.debugLineNum = 131113;BA.debugLine="AppMainScreen.AsView.Enabled = False";
parent.mostCurrent._appmainscreen._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131114;
 //BA.debugLineNum = 131114;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static int  _apiversion() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "apiversion"))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "apiversion", null));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _api = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub APIVersion As Int";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim Api As Int";
_api = 0;
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Return Api";
if (true) return _api;
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="End Sub";
return 0;
}
public static boolean  _connected() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "connected"))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "connected", null));}
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _response = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _error = null;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub Connected As Boolean";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Dim Response, Error As StringBuilder";
_response = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_error = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Response.Initialize";
_response.Initialize();
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Error.Initialize";
_error.Initialize();
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="p.Shell(\"ping -c 1 8.8.8.8\",Null,Response,Error)";
_p.Shell("ping -c 1 8.8.8.8",(String[])(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(_response.getObject()),(java.lang.StringBuilder)(_error.getObject()));
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="Log(\"======= Response ========\")";
anywheresoftware.b4a.keywords.Common.Log("======= Response ========");
RDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="Log(Response)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_response));
RDebugUtils.currentLine=8257546;
 //BA.debugLineNum = 8257546;BA.debugLine="Log(\"======= Error ===========\")";
anywheresoftware.b4a.keywords.Common.Log("======= Error ===========");
RDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="Log(Error)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_error));
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="Log(\"======================\")";
anywheresoftware.b4a.keywords.Common.Log("======================");
RDebugUtils.currentLine=8257550;
 //BA.debugLineNum = 8257550;BA.debugLine="If Error.ToString=\"\" Then";
if ((_error.ToString()).equals("")) { 
RDebugUtils.currentLine=8257551;
 //BA.debugLineNum = 8257551;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=8257553;
 //BA.debugLineNum = 8257553;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=8257556;
 //BA.debugLineNum = 8257556;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _showmainscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showmainscreen"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showmainscreen", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub ShowMainScreen";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If 	AppMainScreen.AsView.Visible = False Then";
if (mostCurrent._appmainscreen._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="AppMainScreen.AsView.Visible = True";
mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="AppMainScreen.AsView.Enabled = True";
mostCurrent._appmainscreen._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="AppMainScreen.AsView.Visible = False";
mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="AppMainScreen.AsView.Enabled = False";
mostCurrent._appmainscreen._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="End Sub";
return "";
}
public static String  _showregisterscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showregisterscreen"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showregisterscreen", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub ShowRegisterScreen";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If 	ScreenRegister.AsView.Visible = False Then";
if (mostCurrent._screenregister._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="ScreenRegister.AsView.Visible = True";
mostCurrent._screenregister._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="ScreenRegister.AsView.Enabled = True";
mostCurrent._screenregister._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="ScreenRegister.AsView.Visible = False";
mostCurrent._screenregister._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="ScreenRegister.AsView.Enabled = False";
mostCurrent._screenregister._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="End Sub";
return "";
}
}