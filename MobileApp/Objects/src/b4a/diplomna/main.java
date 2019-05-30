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
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.diplomna", "b4a.diplomna.main");
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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static void  _activity_create(boolean _firsttime) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 39;BA.debugLine="If (APIVersion >= 23) Then";
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
 //BA.debugLineNum = 40;BA.debugLine="RP.CheckAndRequest(RP.PERMISSION_WRITE_EXTERNAL_";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_WRITE_EXTERNAL_STORAGE);
 //BA.debugLineNum = 41;BA.debugLine="Wait For Activity_PermissionResult(Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 19;
return;
case 19:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 42;BA.debugLine="If Not (Result) Then";
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
 //BA.debugLineNum = 43;BA.debugLine="Log(\"storage permission error\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4131079","storage permission error",0);
 //BA.debugLineNum = 45;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 47;BA.debugLine="RP.CheckAndRequest(RP.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
 //BA.debugLineNum = 48;BA.debugLine="Wait For Activity_PermissionResult(Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 20;
return;
case 20:
//C
this.state = 8;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 49;BA.debugLine="If Not (Result) Then";
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
 //BA.debugLineNum = 50;BA.debugLine="Log(\"camera permission error\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4131086","camera permission error",0);
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
 //BA.debugLineNum = 54;BA.debugLine="HTTP.Initialize(Connected)";
parent._http._initialize(processBA,_connected());
 //BA.debugLineNum = 56;BA.debugLine="LoggedCustomer.Initialize";
parent._loggedcustomer.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="If ScreenX > ScreenY Then";
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
 //BA.debugLineNum = 59;BA.debugLine="IsLandscape = True";
parent._islandscape = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 61;BA.debugLine="IsLandscape = False";
parent._islandscape = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 63;BA.debugLine="UISizes.Initialize(IsLandscape)";
parent.mostCurrent._uisizes._initialize(mostCurrent.activityBA,parent._islandscape);
 //BA.debugLineNum = 65;BA.debugLine="ScreenLogin.Initialize";
parent.mostCurrent._screenlogin._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 66;BA.debugLine="ScreenRegister.Initialize";
parent.mostCurrent._screenregister._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 67;BA.debugLine="AppMainScreen.Initialize";
parent.mostCurrent._appmainscreen._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 68;BA.debugLine="ClientOrders.Initialize";
parent.mostCurrent._clientorders._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 69;BA.debugLine="AppSettings.Initialize";
parent.mostCurrent._appsettings._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 71;BA.debugLine="Activity.AddView(ScreenLogin.AsView,0,0,100%x,100";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._screenlogin._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 72;BA.debugLine="Activity.AddView(ScreenRegister.AsView,0,0,100%x,";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._screenregister._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 73;BA.debugLine="Activity.AddView(AppMainScreen.AsView,0,0,100%x,1";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._appmainscreen._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 74;BA.debugLine="Activity.AddView(ClientOrders.AsView,0,0,100%x,10";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._clientorders._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 75;BA.debugLine="Activity.AddView(AppSettings.AsView,-29%x,5%y,29%";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._appsettings._asview().getObject()),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 77;BA.debugLine="ScreenRegister.AsView.Visible = False";
parent.mostCurrent._screenregister._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 78;BA.debugLine="ScreenRegister.AsView.Enabled = False";
parent.mostCurrent._screenregister._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 80;BA.debugLine="AppMainScreen.AsView.Visible = False";
parent.mostCurrent._appmainscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 81;BA.debugLine="AppMainScreen.AsView.Enabled = False";
parent.mostCurrent._appmainscreen._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 83;BA.debugLine="ClientOrders.AsView.Visible = False";
parent.mostCurrent._clientorders._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 84;BA.debugLine="ClientOrders.AsView.Enabled = False";
parent.mostCurrent._clientorders._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _activity_permissionresult(String _permission,boolean _result) throws Exception{
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
int _ext = 0;
 //BA.debugLineNum = 198;BA.debugLine="Private Sub Activity_KeyPress (KeyCode As Int) As";
 //BA.debugLineNum = 200;BA.debugLine="Dim ext As Int = 0";
_ext = (int) (0);
 //BA.debugLineNum = 201;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 203;BA.debugLine="If ScreenRegister.AsView.Visible = True Then";
if (mostCurrent._screenregister._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 204;BA.debugLine="ShowRegisterScreen";
_showregisterscreen();
 //BA.debugLineNum = 205;BA.debugLine="ext = ext + 1";
_ext = (int) (_ext+1);
 };
 //BA.debugLineNum = 208;BA.debugLine="If AppMainScreen.AsView.Visible = True Then";
if (mostCurrent._appmainscreen._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 209;BA.debugLine="If AppMainScreen.SettingsIsVisible = 0%x Then";
if (mostCurrent._appmainscreen._settingsisvisible()==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA)) { 
 //BA.debugLineNum = 210;BA.debugLine="AppMainScreen.Settings_Click";
mostCurrent._appmainscreen._settings_click();
 };
 //BA.debugLineNum = 212;BA.debugLine="ShowMainScreen";
_showmainscreen();
 //BA.debugLineNum = 213;BA.debugLine="ext = ext + 1";
_ext = (int) (_ext+1);
 };
 //BA.debugLineNum = 216;BA.debugLine="If ScreenLogin.SettingsIsVisible = 0%x Then";
if (mostCurrent._screenlogin._settingsisvisible()==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA)) { 
 //BA.debugLineNum = 217;BA.debugLine="ScreenLogin.Settings_Click";
mostCurrent._screenlogin._settings_click();
 //BA.debugLineNum = 218;BA.debugLine="ext = ext + 1";
_ext = (int) (_ext+1);
 };
 //BA.debugLineNum = 221;BA.debugLine="ext = ext - 1";
_ext = (int) (_ext-1);
 //BA.debugLineNum = 223;BA.debugLine="If ext = -1 Then";
if (_ext==-1) { 
 //BA.debugLineNum = 224;BA.debugLine="ExitApp";
_exitapp();
 };
 //BA.debugLineNum = 227;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 229;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public static int  _apiversion() throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _api = 0;
 //BA.debugLineNum = 163;BA.debugLine="Public Sub APIVersion As Int";
 //BA.debugLineNum = 164;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 165;BA.debugLine="Dim Api As Int";
_api = 0;
 //BA.debugLineNum = 166;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
 //BA.debugLineNum = 167;BA.debugLine="Return Api";
if (true) return _api;
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return 0;
}
public static boolean  _connected() throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _response = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _error = null;
 //BA.debugLineNum = 171;BA.debugLine="Sub Connected As Boolean";
 //BA.debugLineNum = 172;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 173;BA.debugLine="Dim Response, Error As StringBuilder";
_response = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_error = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 174;BA.debugLine="Response.Initialize";
_response.Initialize();
 //BA.debugLineNum = 175;BA.debugLine="Error.Initialize";
_error.Initialize();
 //BA.debugLineNum = 176;BA.debugLine="p.Shell(\"ping -c 1 8.8.8.8\",Null,Response,Error)";
_p.Shell("ping -c 1 8.8.8.8",(String[])(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(_response.getObject()),(java.lang.StringBuilder)(_error.getObject()));
 //BA.debugLineNum = 177;BA.debugLine="Log(\"======= Response ========\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4983046","======= Response ========",0);
 //BA.debugLineNum = 178;BA.debugLine="Log(Response)";
anywheresoftware.b4a.keywords.Common.LogImpl("4983047",BA.ObjectToString(_response),0);
 //BA.debugLineNum = 179;BA.debugLine="Log(\"======= Error ===========\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4983048","======= Error ===========",0);
 //BA.debugLineNum = 180;BA.debugLine="Log(Error)";
anywheresoftware.b4a.keywords.Common.LogImpl("4983049",BA.ObjectToString(_error),0);
 //BA.debugLineNum = 181;BA.debugLine="Log(\"======================\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4983050","======================",0);
 //BA.debugLineNum = 183;BA.debugLine="If Error.ToString=\"\" Then";
if ((_error.ToString()).equals("")) { 
 //BA.debugLineNum = 184;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 186;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return false;
}
public static String  _exitapp() throws Exception{
int _result = 0;
 //BA.debugLineNum = 190;BA.debugLine="Public Sub ExitApp";
 //BA.debugLineNum = 191;BA.debugLine="Dim result As Int";
_result = 0;
 //BA.debugLineNum = 192;BA.debugLine="result = Msgbox2(\"Exit App?\",\"Exit\",\"Yes\",\"Cancel";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Exit App?"),BA.ObjectToCharSequence("Exit"),"Yes","Cancel","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 //BA.debugLineNum = 193;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 194;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private ScreenLogin As LoginScreen";
mostCurrent._screenlogin = new b4a.diplomna.loginscreen();
 //BA.debugLineNum = 27;BA.debugLine="Private ScreenRegister As RegisterScreen";
mostCurrent._screenregister = new b4a.diplomna.registerscreen();
 //BA.debugLineNum = 28;BA.debugLine="Private AppMainScreen As MainScreen";
mostCurrent._appmainscreen = new b4a.diplomna.mainscreen();
 //BA.debugLineNum = 29;BA.debugLine="Private ClientOrders As ClientOrdersScreen";
mostCurrent._clientorders = new b4a.diplomna.clientordersscreen();
 //BA.debugLineNum = 30;BA.debugLine="Private AppSettings As AppSettingsScreen";
mostCurrent._appsettings = new b4a.diplomna.appsettingsscreen();
 //BA.debugLineNum = 32;BA.debugLine="Public ScreenX, ScreenY As Int";
_screenx = 0;
_screeny = 0;
 //BA.debugLineNum = 33;BA.debugLine="Public IsLandscape As Boolean";
_islandscape = false;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _hideappsettingsscreen() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub HideAppSettingsScreen";
 //BA.debugLineNum = 144;BA.debugLine="If AppSettings.AsView.Left = 0%x Then";
if (mostCurrent._appsettings._asview().getLeft()==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA)) { 
 //BA.debugLineNum = 145;BA.debugLine="AppSettings.AsView.SetLayoutAnimated(500,-29%x,5";
mostCurrent._appsettings._asview().SetLayoutAnimated((int) (500),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 };
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public static String  _hideclientordersscreen() throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Public Sub HideClientOrdersScreen";
 //BA.debugLineNum = 139;BA.debugLine="ClientOrders.AsView.Visible = False";
mostCurrent._clientorders._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 140;BA.debugLine="ClientOrders.AsView.Enabled = False";
mostCurrent._clientorders._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _hidemainscreen() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub HideMainScreen";
 //BA.debugLineNum = 134;BA.debugLine="AppMainScreen.AsView.Visible = False";
mostCurrent._appmainscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 135;BA.debugLine="AppMainScreen.AsView.Enabled = False";
mostCurrent._appmainscreen._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public static String  _hidesettingswindows() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Public Sub HideSettingsWindows";
 //BA.debugLineNum = 150;BA.debugLine="ScreenLogin.HideSettings";
mostCurrent._screenlogin._hidesettings();
 //BA.debugLineNum = 151;BA.debugLine="AppMainScreen.HideSettings";
mostCurrent._appmainscreen._hidesettings();
 //BA.debugLineNum = 152;BA.debugLine="ClientOrders.HideSettings";
mostCurrent._clientorders._hidesettings();
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
jsonserializations._process_globals();
uisizes._process_globals();
support._process_globals();
types._process_globals();
appcolors._process_globals();
data._process_globals();
starter._process_globals();
httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public LoggedCustomer As Customer";
_loggedcustomer = new b4a.diplomna.types._customer();
 //BA.debugLineNum = 19;BA.debugLine="Public RP As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 20;BA.debugLine="Public HTTP As HTTP_Requests";
_http = new b4a.diplomna.http_requests();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public static String  _showclientordersscreen() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub ShowClientOrdersScreen";
 //BA.debugLineNum = 113;BA.debugLine="If 	ClientOrders.AsView.Visible = False Then";
if (mostCurrent._clientorders._asview().getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 114;BA.debugLine="ClientOrders.AsView.Visible = True";
mostCurrent._clientorders._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 115;BA.debugLine="ClientOrders.AsView.Enabled = True";
mostCurrent._clientorders._asview().setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 116;BA.debugLine="ClientOrders.LoadClientOrders(LoggedCustomer.ID)";
mostCurrent._clientorders._loadclientorders(_loggedcustomer.ID);
 }else {
 //BA.debugLineNum = 118;BA.debugLine="ClientOrders.AsView.Visible = False";
mostCurrent._clientorders._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 119;BA.debugLine="ClientOrders.AsView.Enabled = False";
mostCurrent._clientorders._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public static String  _showhideappsettingsscreen() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub ShowHideAppSettingsScreen";
 //BA.debugLineNum = 125;BA.debugLine="If AppSettings.AsView.Left = -29%x Then";
if (mostCurrent._appsettings._asview().getLeft()==-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA)) { 
 //BA.debugLineNum = 126;BA.debugLine="AppSettings.AsView.SetLayoutAnimated(500,0%x,5%y";
mostCurrent._appsettings._asview().SetLayoutAnimated((int) (500),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 }else if(mostCurrent._appsettings._asview().getLeft()==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA)) { 
 //BA.debugLineNum = 128;BA.debugLine="AppSettings.AsView.SetLayoutAnimated(500,-29%x,5";
mostCurrent._appsettings._asview().SetLayoutAnimated((int) (500),(int) (-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 };
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _showiteminfo(b4a.diplomna.types._good _g,b4a.diplomna.types._supplier _s) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Public Sub ShowItemInfo(g As Good,s As Supplier)";
 //BA.debugLineNum = 235;BA.debugLine="AppMainScreen.InfoScreen.SetCurrentInfo(g,s)";
mostCurrent._appmainscreen._infoscreen._setcurrentinfo(_g,_s);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public static String  _showmainscreen() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub ShowMainScreen";
 //BA.debugLineNum = 103;BA.debugLine="If 	AppMainScreen.AsView.Visible = False Then";
if (mostCurrent._appmainscreen._asview().getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 104;BA.debugLine="AppMainScreen.AsView.Visible = True";
mostCurrent._appmainscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 105;BA.debugLine="AppMainScreen.AsView.Enabled = True";
mostCurrent._appmainscreen._asview().setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 107;BA.debugLine="AppMainScreen.AsView.Visible = False";
mostCurrent._appmainscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 108;BA.debugLine="AppMainScreen.AsView.Enabled = False";
mostCurrent._appmainscreen._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public static String  _showorderinfo(b4a.diplomna.types._order _o) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub ShowOrderInfo(o As Order)";
 //BA.debugLineNum = 89;BA.debugLine="ClientOrders.OrderInfoVisual.SetCurrentInfo(o)";
mostCurrent._clientorders._orderinfovisual._setcurrentinfo(_o);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public static String  _showregisterscreen() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub ShowRegisterScreen";
 //BA.debugLineNum = 93;BA.debugLine="If 	ScreenRegister.AsView.Visible = False Then";
if (mostCurrent._screenregister._asview().getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 94;BA.debugLine="ScreenRegister.AsView.Visible = True";
mostCurrent._screenregister._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 95;BA.debugLine="ScreenRegister.AsView.Enabled = True";
mostCurrent._screenregister._asview().setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 97;BA.debugLine="ScreenRegister.AsView.Visible = False";
mostCurrent._screenregister._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 98;BA.debugLine="ScreenRegister.AsView.Enabled = False";
mostCurrent._screenregister._asview().setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
}
