package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.loginscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.loginscreen.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _screenpnl = null;
public anywheresoftware.b4a.objects.PanelWrapper _screenlogo = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _logo = null;
public anywheresoftware.b4a.objects.PanelWrapper _header = null;
public anywheresoftware.b4a.objects.EditTextWrapper _usernametxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _passwordtxt = null;
public anywheresoftware.b4a.objects.ButtonWrapper _loginbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _registerbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _settingsbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _settingsbutton = null;
public b4a.diplomna.settingsmenu _settingsmenulogin = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.loginscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="ScreenLogo.Initialize(\"\")";
__ref._screenlogo.Initialize(ba,"");
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Logo.Initialize(\"\")";
__ref._logo.Initialize(ba,"");
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="usernametxt.Initialize(\"\")";
__ref._usernametxt.Initialize(ba,"");
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="passwordtxt.Initialize(\"\")";
__ref._passwordtxt.Initialize(ba,"");
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="loginbtn.Initialize(\"Login\")";
__ref._loginbtn.Initialize(ba,"Login");
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="registerbtn.Initialize(\"Register\")";
__ref._registerbtn.Initialize(ba,"Register");
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="settingsbtn.Initialize(\"\")";
__ref._settingsbtn.Initialize(ba,"");
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
__ref._settingsbutton.Initialize(ba,"Settings");
RDebugUtils.currentLine=4456462;
 //BA.debugLineNum = 4456462;BA.debugLine="SettingsMenuLogin.Initialize(0)";
__ref._settingsmenulogin._initialize(null,ba,(int) (0));
RDebugUtils.currentLine=4456463;
 //BA.debugLineNum = 4456463;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=4456464;
 //BA.debugLineNum = 4456464;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return null;
}
public int  _settingsisvisible(b4a.diplomna.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "settingsisvisible", false))
	 {return ((Integer) Debug.delegate(ba, "settingsisvisible", null));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub SettingsIsVisible As Int";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
if (true) return __ref._settingsmenulogin._asview(null).getLeft();
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="End Sub";
return 0;
}
public String  _settings_click(b4a.diplomna.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "settings_click", false))
	 {return ((String) Debug.delegate(ba, "settings_click", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub Settings_Click";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="SettingsMenuLogin.AppSettings_Click";
__ref._settingsmenulogin._appsettings_click(null);
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="End Sub";
return "";
}
public String  _hidesettings(b4a.diplomna.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "hidesettings", false))
	 {return ((String) Debug.delegate(ba, "hidesettings", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub HideSettings";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 };
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
__ref._screenpnl.setColor(_appcolors._darkgray);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
__ref._header.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsmenulogin._asview(null).getObject()),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="usernametxt.Hint = \"Username\"";
__ref._usernametxt.setHint("Username");
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="usernametxt.HintColor = AppColors.DarkDarkGray";
__ref._usernametxt.setHintColor(_appcolors._darkdarkgray);
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="usernametxt.SingleLine = True";
__ref._usernametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="passwordtxt.Hint = \"Password\"";
__ref._passwordtxt.setHint("Password");
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="passwordtxt.SingleLine = True";
__ref._passwordtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="passwordtxt.PasswordMode = True";
__ref._passwordtxt.setPasswordMode(__c.True);
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="passwordtxt.HintColor = AppColors.DarkDarkGray";
__ref._passwordtxt.setHintColor(_appcolors._darkdarkgray);
RDebugUtils.currentLine=4522002;
 //BA.debugLineNum = 4522002;BA.debugLine="usernametxt.Text = \"Ivan45\"";
__ref._usernametxt.setText(BA.ObjectToCharSequence("Ivan45"));
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="passwordtxt.Text = \"1234\"";
__ref._passwordtxt.setText(BA.ObjectToCharSequence("1234"));
RDebugUtils.currentLine=4522008;
 //BA.debugLineNum = 4522008;BA.debugLine="loginbtn.Text = \"Login\"";
__ref._loginbtn.setText(BA.ObjectToCharSequence("Login"));
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
__ref._loginbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="Support.ApplyViewStyle(loginbtn,AppColors.LightGr";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._loginbtn.getObject())),_appcolors._lightgray,_appcolors._fadedblack2,_appcolors._fadedblack2,_appcolors._fadedblack,_appcolors._fadedblack,__c.Colors.White,__c.Colors.White,(int) (0));
RDebugUtils.currentLine=4522012;
 //BA.debugLineNum = 4522012;BA.debugLine="registerbtn.Text = \"Register\"";
__ref._registerbtn.setText(BA.ObjectToCharSequence("Register"));
RDebugUtils.currentLine=4522013;
 //BA.debugLineNum = 4522013;BA.debugLine="registerbtn.Gravity = Gravity.CENTER";
__ref._registerbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4522014;
 //BA.debugLineNum = 4522014;BA.debugLine="Support.ApplyViewStyle(registerbtn,AppColors.Ligh";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._registerbtn.getObject())),_appcolors._lightgray,_appcolors._fadedblack2,_appcolors._fadedblack2,_appcolors._fadedblack,_appcolors._fadedblack,__c.Colors.White,__c.Colors.White,(int) (0));
RDebugUtils.currentLine=4522016;
 //BA.debugLineNum = 4522016;BA.debugLine="ScreenLogo.Color = Colors.DarkGray";
__ref._screenlogo.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=4522018;
 //BA.debugLineNum = 4522018;BA.debugLine="Logo.Bitmap = LoadBitmap(File.DirAssets,\"Logo3.jp";
__ref._logo.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"Logo3.jpg").getObject()));
RDebugUtils.currentLine=4522019;
 //BA.debugLineNum = 4522019;BA.debugLine="Logo.Gravity = Gravity.FILL";
__ref._logo.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=4522020;
 //BA.debugLineNum = 4522020;BA.debugLine="ScreenPnl.AddView(ScreenLogo,30%x,15%y,UISizes.Lo";
__ref._screenpnl.AddView((android.view.View)(__ref._screenlogo.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba),_uisizes._loginscrdefaultwidth,__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=4522021;
 //BA.debugLineNum = 4522021;BA.debugLine="ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,Scre";
__ref._screenlogo.AddView((android.view.View)(__ref._logo.getObject()),(int) (0),(int) (0),__ref._screenlogo.getWidth(),__ref._screenlogo.getHeight());
RDebugUtils.currentLine=4522022;
 //BA.debugLineNum = 4522022;BA.debugLine="ScreenPnl.AddView(usernametxt,ScreenLogo.Left ,Sc";
__ref._screenpnl.AddView((android.view.View)(__ref._usernametxt.getObject()),__ref._screenlogo.getLeft(),(int) (__ref._screenlogo.getTop()+__ref._screenlogo.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=4522023;
 //BA.debugLineNum = 4522023;BA.debugLine="ScreenPnl.AddView(passwordtxt,usernametxt.Left,us";
__ref._screenpnl.AddView((android.view.View)(__ref._passwordtxt.getObject()),__ref._usernametxt.getLeft(),(int) (__ref._usernametxt.getTop()+__ref._usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=4522024;
 //BA.debugLineNum = 4522024;BA.debugLine="ScreenPnl.AddView(loginbtn,usernametxt.Left,passw";
__ref._screenpnl.AddView((android.view.View)(__ref._loginbtn.getObject()),__ref._usernametxt.getLeft(),(int) (__ref._passwordtxt.getTop()+__ref._passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=4522025;
 //BA.debugLineNum = 4522025;BA.debugLine="ScreenPnl.AddView(registerbtn,usernametxt.Left,lo";
__ref._screenpnl.AddView((android.view.View)(__ref._registerbtn.getObject()),__ref._usernametxt.getLeft(),(int) (__ref._loginbtn.getTop()+__ref._loginbtn.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=4522027;
 //BA.debugLineNum = 4522027;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4522028;
 //BA.debugLineNum = 4522028;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
RDebugUtils.currentLine=4522029;
 //BA.debugLineNum = 4522029;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
__ref._settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
RDebugUtils.currentLine=4522030;
 //BA.debugLineNum = 4522030;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
__ref._header.AddView((android.view.View)(__ref._settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=4522033;
 //BA.debugLineNum = 4522033;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Private ScreenLogo As Panel";
_screenlogo = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Private Logo As ImageView";
_logo = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="Private loginbtn As Button";
_loginbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="Private registerbtn As Button";
_registerbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="Private settingsbtn As Button";
_settingsbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4390930;
 //BA.debugLineNum = 4390930;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
RDebugUtils.currentLine=4390931;
 //BA.debugLineNum = 4390931;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.diplomna.loginscreen __ref,b4a.diplomna.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "jobdone", false))
	 {return ((String) Debug.delegate(ba, "jobdone", new Object[] {_job}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="If Job.Success = False Then";
if (_job._success==__c.False) { 
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Log(\"login failed\")";
__c.LogImpl("44915202","login failed",0);
 }else {
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="Log(\"login success\")";
__c.LogImpl("44915204","login success",0);
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Log(Job.GetString)";
__c.LogImpl("44915205",_job._getstring(null),0);
 };
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="End Sub";
return "";
}
public void  _login_click(b4a.diplomna.loginscreen __ref) throws Exception{
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "login_click", false))
	 {Debug.delegate(ba, "login_click", null); return;}
ResumableSub_Login_Click rsub = new ResumableSub_Login_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Login_Click extends BA.ResumableSub {
public ResumableSub_Login_Click(b4a.diplomna.loginscreen parent,b4a.diplomna.loginscreen __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.diplomna.loginscreen __ref;
b4a.diplomna.loginscreen parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _login = null;
Object _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="loginscreen";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
parent.__c.CallSubDebug(ba,(Object)(parent._main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="If Not( usernametxt.Text = \"\") Then";
if (true) break;

case 1:
//if
this.state = 24;
if (parent.__c.Not((__ref._usernametxt.getText()).equals(""))) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="If Not( passwordtxt.Text = \"\") Then";
if (true) break;

case 4:
//if
this.state = 21;
if (parent.__c.Not((__ref._passwordtxt.getText()).equals(""))) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Dim login As ResumableSub = Main.HTTP.Login(use";
_login = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_login = parent._main._http._login(null,__ref._usernametxt.getText(),__ref._passwordtxt.getText());
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="Wait For (login)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "loginscreen", "login_click"), _login);
this.state = 25;
return;
case 25:
//C
this.state = 7;
_result = (Object) result[1];
;
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="If Main.HTTP.Output = \"\" Then";
if (true) break;

case 7:
//if
this.state = 18;
if ((parent._main._http._output).equals("")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="Log(\"LOGIN FAILED\")";
parent.__c.LogImpl("44849673","LOGIN FAILED",0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Log(\"Login Output:\" & Main.HTTP.Output)";
parent.__c.LogImpl("44849675","Login Output:"+parent._main._http._output,0);
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="Try";
if (true) break;

case 12:
//try
this.state = 17;
this.catchState = 16;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 17;
this.catchState = 16;
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="Main.LoggedCustomer = JSONSerializations.Seri";
parent._main._loggedcustomer = parent._jsonserializations._serializelogincustomer(ba,parent._main._http._output);
 if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="Log(\"error\")";
parent.__c.LogImpl("44849679","error",0);
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
;
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
parent.__c.CallSubDebug(ba,(Object)(parent._main.getObject()),"ShowMainScreen");
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=4849685;
 //BA.debugLineNum = 4849685;BA.debugLine="ToastMessageShow(\"Enter Password!\",False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Password!"),parent.__c.False);
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=4849688;
 //BA.debugLineNum = 4849688;BA.debugLine="ToastMessageShow(\"Enter Username!\",False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Username!"),parent.__c.False);
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=4849690;
 //BA.debugLineNum = 4849690;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _register_click(b4a.diplomna.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "register_click", false))
	 {return ((String) Debug.delegate(ba, "register_click", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub Register_Click";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRegisterScreen");
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="End Sub";
return "";
}
}