package b4a.diplomna;


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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.diplomna", "b4a.diplomna.main");
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
		activityBA = new BA(this, layout, processBA, "b4a.diplomna", "b4a.diplomna.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.diplomna.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, httputils2service.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.diplomna.types._customer _loggedcustomer = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static b4a.diplomna.http_requests _http = null;
public b4a.diplomna.loginscreen _screenlogin = null;
public b4a.diplomna.registerscreen _screenregister = null;
public b4a.diplomna.mainscreen _appmainscreen = null;
public b4a.diplomna.clientordersscreen _clientorders = null;
public b4a.diplomna.appsettingsscreen _appsettings = null;
public static int _screenx = 0;
public static int _screeny = 0;
public static boolean _islandscape = false;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.diplomna.main parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
b4a.diplomna.main parent;
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
anywheresoftware.b4a.keywords.Common.LogImpl("2131079","storage permission error",0);
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
anywheresoftware.b4a.keywords.Common.LogImpl("2131086","camera permission error",0);
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
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="ClientOrders.Initialize";
parent.mostCurrent._clientorders._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="AppSettings.Initialize";
parent.mostCurrent._appsettings._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131107;
 //BA.debugLineNum = 131107;BA.debugLine="Activity.AddView(ScreenLogin.AsView,0,0,100%x,100";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._screenlogin._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131108;
 //BA.debugLineNum = 131108;BA.debugLine="Activity.AddView(ScreenRegister.AsView,0,0,100%x,";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._screenregister._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131109;
 //BA.debugLineNum = 131109;BA.debugLine="Activity.AddView(AppMainScreen.AsView,0,0,100%x,1";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._appmainscreen._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="Activity.AddView(ClientOrders.AsView,0,0,100%x,10";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._clientorders._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131111;
 //BA.debugLineNum = 131111;BA.debugLine="Activity.AddView(AppSettings.AsView,-29%x,5%y,29%";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._appsettings._asview(null).getObject()),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131113;
 //BA.debugLineNum = 131113;BA.debugLine="ScreenRegister.AsView.Visible = False";
parent.mostCurrent._screenregister._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131114;
 //BA.debugLineNum = 131114;BA.debugLine="ScreenRegister.AsView.Enabled = False";
parent.mostCurrent._screenregister._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131116;
 //BA.debugLineNum = 131116;BA.debugLine="AppMainScreen.AsView.Visible = False";
parent.mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131117;
 //BA.debugLineNum = 131117;BA.debugLine="AppMainScreen.AsView.Enabled = False";
parent.mostCurrent._appmainscreen._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="ClientOrders.AsView.Visible = False";
parent.mostCurrent._clientorders._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="ClientOrders.AsView.Enabled = False";
parent.mostCurrent._clientorders._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131122;
 //BA.debugLineNum = 131122;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static int  _apiversion() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "apiversion", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "apiversion", null));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _api = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub APIVersion As Int";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim Api As Int";
_api = 0;
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Return Api";
if (true) return _api;
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="End Sub";
return 0;
}
public static boolean  _connected() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "connected", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "connected", null));}
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _response = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _error = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Connected As Boolean";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim Response, Error As StringBuilder";
_response = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_error = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Response.Initialize";
_response.Initialize();
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Error.Initialize";
_error.Initialize();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="p.Shell(\"ping -c 1 8.8.8.8\",Null,Response,Error)";
_p.Shell("ping -c 1 8.8.8.8",(String[])(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(_response.getObject()),(java.lang.StringBuilder)(_error.getObject()));
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Log(\"======= Response ========\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21376262","======= Response ========",0);
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Log(Response)";
anywheresoftware.b4a.keywords.Common.LogImpl("21376263",BA.ObjectToString(_response),0);
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Log(\"======= Error ===========\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21376264","======= Error ===========",0);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Log(Error)";
anywheresoftware.b4a.keywords.Common.LogImpl("21376265",BA.ObjectToString(_error),0);
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Log(\"======================\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21376266","======================",0);
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="If Error.ToString=\"\" Then";
if ((_error.ToString()).equals("")) { 
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="End Sub";
return false;
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
int _ext = 0;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub Activity_KeyPress (KeyCode As Int) As";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim ext As Int = 0";
_ext = (int) (0);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="If ScreenRegister.AsView.Visible = True Then";
if (mostCurrent._screenregister._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="ShowRegisterScreen";
_showregisterscreen();
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="ext = ext + 1";
_ext = (int) (_ext+1);
 };
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="If AppMainScreen.AsView.Visible = True Then";
if (mostCurrent._appmainscreen._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="If AppMainScreen.SettingsIsVisible = 0%x Then";
if (mostCurrent._appmainscreen._settingsisvisible(null)==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="AppMainScreen.Settings_Click";
mostCurrent._appmainscreen._settings_click(null);
 };
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="ShowMainScreen";
_showmainscreen();
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="ext = ext + 1";
_ext = (int) (_ext+1);
 };
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="If ScreenLogin.SettingsIsVisible = 0%x Then";
if (mostCurrent._screenlogin._settingsisvisible(null)==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="ScreenLogin.Settings_Click";
mostCurrent._screenlogin._settings_click(null);
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="ext = ext + 1";
_ext = (int) (_ext+1);
 };
RDebugUtils.currentLine=1507351;
 //BA.debugLineNum = 1507351;BA.debugLine="ext = ext - 1";
_ext = (int) (_ext-1);
RDebugUtils.currentLine=1507353;
 //BA.debugLineNum = 1507353;BA.debugLine="If ext = -1 Then";
if (_ext==-1) { 
RDebugUtils.currentLine=1507354;
 //BA.debugLineNum = 1507354;BA.debugLine="ExitApp";
_exitapp();
 };
RDebugUtils.currentLine=1507357;
 //BA.debugLineNum = 1507357;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=1507359;
 //BA.debugLineNum = 1507359;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=1507362;
 //BA.debugLineNum = 1507362;BA.debugLine="End Sub";
return false;
}
public static String  _showregisterscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showregisterscreen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showregisterscreen", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub ShowRegisterScreen";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If 	ScreenRegister.AsView.Visible = False Then";
if (mostCurrent._screenregister._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="ScreenRegister.AsView.Visible = True";
mostCurrent._screenregister._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="ScreenRegister.AsView.Enabled = True";
mostCurrent._screenregister._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="ScreenRegister.AsView.Visible = False";
mostCurrent._screenregister._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="ScreenRegister.AsView.Enabled = False";
mostCurrent._screenregister._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="End Sub";
return "";
}
public static String  _showmainscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showmainscreen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showmainscreen", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub ShowMainScreen";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If 	AppMainScreen.AsView.Visible = False Then";
if (mostCurrent._appmainscreen._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="AppMainScreen.AsView.Visible = True";
mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="AppMainScreen.AsView.Enabled = True";
mostCurrent._appmainscreen._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="AppMainScreen.AsView.Visible = False";
mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="AppMainScreen.AsView.Enabled = False";
mostCurrent._appmainscreen._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="End Sub";
return "";
}
public static String  _exitapp() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "exitapp", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "exitapp", null));}
int _result = 0;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub ExitApp";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="result = Msgbox2(\"Exit App?\",\"Exit\",\"Yes\",\"Cancel";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Exit App?"),BA.ObjectToCharSequence("Exit"),"Yes","Cancel","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="End Sub";
return "";
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
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _hideappsettingsscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hideappsettingsscreen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hideappsettingsscreen", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub HideAppSettingsScreen";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If AppSettings.AsView.Left = 0%x Then";
if (mostCurrent._appsettings._asview(null).getLeft()==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="AppSettings.AsView.SetLayoutAnimated(500,-29%x,5";
mostCurrent._appsettings._asview(null).SetLayoutAnimated((int) (500),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 };
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="End Sub";
return "";
}
public static String  _hideclientordersscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hideclientordersscreen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hideclientordersscreen", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub HideClientOrdersScreen";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="ClientOrders.AsView.Visible = False";
mostCurrent._clientorders._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="ClientOrders.AsView.Enabled = False";
mostCurrent._clientorders._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
public static String  _hidemainscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hidemainscreen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hidemainscreen", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub HideMainScreen";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="AppMainScreen.AsView.Visible = False";
mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="AppMainScreen.AsView.Enabled = False";
mostCurrent._appmainscreen._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return "";
}
public static String  _hidesettingswindows() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hidesettingswindows", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hidesettingswindows", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub HideSettingsWindows";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="ScreenLogin.HideSettings";
mostCurrent._screenlogin._hidesettings(null);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="AppMainScreen.HideSettings";
mostCurrent._appmainscreen._hidesettings(null);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="ClientOrders.HideSettings";
mostCurrent._clientorders._hidesettings(null);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="End Sub";
return "";
}
public static String  _showclientordersscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showclientordersscreen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showclientordersscreen", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub ShowClientOrdersScreen";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="If 	ClientOrders.AsView.Visible = False Then";
if (mostCurrent._clientorders._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="ClientOrders.AsView.Visible = True";
mostCurrent._clientorders._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="ClientOrders.AsView.Enabled = True";
mostCurrent._clientorders._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="ClientOrders.AsView.Visible = False";
mostCurrent._clientorders._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="ClientOrders.AsView.Enabled = False";
mostCurrent._clientorders._asview(null).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="End Sub";
return "";
}
public static String  _showhideappsettingsscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showhideappsettingsscreen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showhideappsettingsscreen", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub ShowHideAppSettingsScreen";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If AppSettings.AsView.Left = -29%x Then";
if (mostCurrent._appsettings._asview(null).getLeft()==-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="AppSettings.AsView.SetLayoutAnimated(500,0%x,5%y";
mostCurrent._appsettings._asview(null).SetLayoutAnimated((int) (500),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 }else 
{RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Else if AppSettings.AsView.Left = 0%x Then";
if (mostCurrent._appsettings._asview(null).getLeft()==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="AppSettings.AsView.SetLayoutAnimated(500,-29%x,5";
mostCurrent._appsettings._asview(null).SetLayoutAnimated((int) (500),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 }}
;
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="End Sub";
return "";
}
public static String  _showiteminfo(b4a.diplomna.types._good _g,b4a.diplomna.types._supplier _s) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showiteminfo", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showiteminfo", new Object[] {_g,_s}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub ShowItemInfo(g As Good,s As Supplier)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="AppMainScreen.InfoScreen.SetCurrentInfo(g,s)";
mostCurrent._appmainscreen._infoscreen._setcurrentinfo(null,_g,_s);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public static String  _showorderinfo(b4a.diplomna.types._localorder _o) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showorderinfo", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showorderinfo", new Object[] {_o}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub ShowOrderInfo(o As LocalOrder)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="ClientOrders.OrderInfoVisual.SetCurrentInfo(o)";
mostCurrent._clientorders._orderinfovisual._setcurrentinfo(null,_o);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
}