package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.loginscreen");
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
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 93;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_screenpnl.getObject()));
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
 //BA.debugLineNum = 41;BA.debugLine="Public Sub BuildUI";
 //BA.debugLineNum = 43;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
_screenpnl.setColor(_appcolors._darkgray);
 //BA.debugLineNum = 44;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
_header.setColor(_appcolors._fadeddarkred);
 //BA.debugLineNum = 46;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
_screenpnl.AddView((android.view.View)(_settingsmenulogin._asview().getObject()),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 49;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
_screenpnl.AddView((android.view.View)(_header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 51;BA.debugLine="usernametxt.Hint = \"Username\"";
_usernametxt.setHint("Username");
 //BA.debugLineNum = 52;BA.debugLine="usernametxt.HintColor = AppColors.DarkDarkGray";
_usernametxt.setHintColor(_appcolors._darkdarkgray);
 //BA.debugLineNum = 53;BA.debugLine="usernametxt.SingleLine = True";
_usernametxt.setSingleLine(__c.True);
 //BA.debugLineNum = 54;BA.debugLine="passwordtxt.Hint = \"Password\"";
_passwordtxt.setHint("Password");
 //BA.debugLineNum = 55;BA.debugLine="passwordtxt.SingleLine = True";
_passwordtxt.setSingleLine(__c.True);
 //BA.debugLineNum = 56;BA.debugLine="passwordtxt.PasswordMode = True";
_passwordtxt.setPasswordMode(__c.True);
 //BA.debugLineNum = 57;BA.debugLine="passwordtxt.HintColor = AppColors.DarkDarkGray";
_passwordtxt.setHintColor(_appcolors._darkdarkgray);
 //BA.debugLineNum = 59;BA.debugLine="usernametxt.Text = \"Ivan45\"";
_usernametxt.setText(BA.ObjectToCharSequence("Ivan45"));
 //BA.debugLineNum = 60;BA.debugLine="passwordtxt.Text = \"1234\"";
_passwordtxt.setText(BA.ObjectToCharSequence("1234"));
 //BA.debugLineNum = 65;BA.debugLine="loginbtn.Text = \"Login\"";
_loginbtn.setText(BA.ObjectToCharSequence("Login"));
 //BA.debugLineNum = 66;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
_loginbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 67;BA.debugLine="Support.ApplyViewStyle(loginbtn,AppColors.LightGr";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_loginbtn.getObject())),_appcolors._lightgray,_appcolors._fadedblack2,_appcolors._fadedblack2,_appcolors._fadedblack,_appcolors._fadedblack,__c.Colors.White,__c.Colors.White,(int) (0));
 //BA.debugLineNum = 69;BA.debugLine="registerbtn.Text = \"Register\"";
_registerbtn.setText(BA.ObjectToCharSequence("Register"));
 //BA.debugLineNum = 70;BA.debugLine="registerbtn.Gravity = Gravity.CENTER";
_registerbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 71;BA.debugLine="Support.ApplyViewStyle(registerbtn,AppColors.Ligh";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_registerbtn.getObject())),_appcolors._lightgray,_appcolors._fadedblack2,_appcolors._fadedblack2,_appcolors._fadedblack,_appcolors._fadedblack,__c.Colors.White,__c.Colors.White,(int) (0));
 //BA.debugLineNum = 73;BA.debugLine="ScreenLogo.Color = Colors.DarkGray";
_screenlogo.setColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 75;BA.debugLine="Logo.Bitmap = LoadBitmap(File.DirAssets,\"Logo3.jp";
_logo.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"Logo3.jpg").getObject()));
 //BA.debugLineNum = 76;BA.debugLine="Logo.Gravity = Gravity.FILL";
_logo.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 77;BA.debugLine="ScreenPnl.AddView(ScreenLogo,30%x,15%y,UISizes.Lo";
_screenpnl.AddView((android.view.View)(_screenlogo.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba),_uisizes._loginscrdefaultwidth,__c.PerYToCurrent((float) (15),ba));
 //BA.debugLineNum = 78;BA.debugLine="ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,Scre";
_screenlogo.AddView((android.view.View)(_logo.getObject()),(int) (0),(int) (0),_screenlogo.getWidth(),_screenlogo.getHeight());
 //BA.debugLineNum = 79;BA.debugLine="ScreenPnl.AddView(usernametxt,ScreenLogo.Left ,Sc";
_screenpnl.AddView((android.view.View)(_usernametxt.getObject()),_screenlogo.getLeft(),(int) (_screenlogo.getTop()+_screenlogo.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 80;BA.debugLine="ScreenPnl.AddView(passwordtxt,usernametxt.Left,us";
_screenpnl.AddView((android.view.View)(_passwordtxt.getObject()),_usernametxt.getLeft(),(int) (_usernametxt.getTop()+_usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 81;BA.debugLine="ScreenPnl.AddView(loginbtn,usernametxt.Left,passw";
_screenpnl.AddView((android.view.View)(_loginbtn.getObject()),_usernametxt.getLeft(),(int) (_passwordtxt.getTop()+_passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 82;BA.debugLine="ScreenPnl.AddView(registerbtn,usernametxt.Left,lo";
_screenpnl.AddView((android.view.View)(_registerbtn.getObject()),_usernametxt.getLeft(),(int) (_loginbtn.getTop()+_loginbtn.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 84;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 85;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
 //BA.debugLineNum = 86;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
_settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
 //BA.debugLineNum = 87;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
_header.AddView((android.view.View)(_settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private ScreenLogo As Panel";
_screenlogo = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private Logo As ImageView";
_logo = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private loginbtn As Button";
_loginbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private registerbtn As Button";
_registerbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private settingsbtn As Button";
_settingsbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.diplomna.settingsmenu();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _hidesettings() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub HideSettings";
 //BA.debugLineNum = 101;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
if (_settingsmenulogin._asview().getLeft()==0) { 
 //BA.debugLineNum = 102;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
_settingsmenulogin._asview().SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 };
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 24;BA.debugLine="ScreenPnl.Initialize(\"\")";
_screenpnl.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="ScreenLogo.Initialize(\"\")";
_screenlogo.Initialize(ba,"");
 //BA.debugLineNum = 26;BA.debugLine="Logo.Initialize(\"\")";
_logo.Initialize(ba,"");
 //BA.debugLineNum = 27;BA.debugLine="usernametxt.Initialize(\"\")";
_usernametxt.Initialize(ba,"");
 //BA.debugLineNum = 28;BA.debugLine="passwordtxt.Initialize(\"\")";
_passwordtxt.Initialize(ba,"");
 //BA.debugLineNum = 31;BA.debugLine="Header.Initialize(\"\")";
_header.Initialize(ba,"");
 //BA.debugLineNum = 32;BA.debugLine="loginbtn.Initialize(\"Login\")";
_loginbtn.Initialize(ba,"Login");
 //BA.debugLineNum = 33;BA.debugLine="registerbtn.Initialize(\"Register\")";
_registerbtn.Initialize(ba,"Register");
 //BA.debugLineNum = 34;BA.debugLine="settingsbtn.Initialize(\"\")";
_settingsbtn.Initialize(ba,"");
 //BA.debugLineNum = 36;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
_settingsbutton.Initialize(ba,"Settings");
 //BA.debugLineNum = 37;BA.debugLine="SettingsMenuLogin.Initialize(0)";
_settingsmenulogin._initialize(ba,(int) (0));
 //BA.debugLineNum = 38;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.diplomna.httpjob _job) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 134;BA.debugLine="If Job.Success = False Then";
if (_job._success==__c.False) { 
 //BA.debugLineNum = 135;BA.debugLine="Log(\"login failed\")";
__c.LogImpl("55832706","login failed",0);
 }else {
 //BA.debugLineNum = 137;BA.debugLine="Log(\"login success\")";
__c.LogImpl("55832708","login success",0);
 //BA.debugLineNum = 138;BA.debugLine="Log(Job.GetString)";
__c.LogImpl("55832709",_job._getstring(),0);
 };
 //BA.debugLineNum = 140;BA.debugLine="Job.Release";
_job._release();
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _login_click() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub Login_Click";
 //BA.debugLineNum = 112;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
 //BA.debugLineNum = 114;BA.debugLine="If Not( usernametxt.Text = \"\") Then";
if (__c.Not((_usernametxt.getText()).equals(""))) { 
 //BA.debugLineNum = 115;BA.debugLine="If Not( passwordtxt.Text = \"\") Then";
if (__c.Not((_passwordtxt.getText()).equals(""))) { 
 //BA.debugLineNum = 122;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowMainScreen");
 }else {
 //BA.debugLineNum = 126;BA.debugLine="ToastMessageShow(\"Enter Password!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Password!"),__c.False);
 };
 }else {
 //BA.debugLineNum = 129;BA.debugLine="ToastMessageShow(\"Enter Username!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Username!"),__c.False);
 };
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _register_click() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub Register_Click";
 //BA.debugLineNum = 144;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
 //BA.debugLineNum = 145;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowRegisterScreen");
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _settings_click() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub Settings_Click";
 //BA.debugLineNum = 108;BA.debugLine="SettingsMenuLogin.AppSettings_Click";
_settingsmenulogin._appsettings_click();
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public int  _settingsisvisible() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub SettingsIsVisible As Int";
 //BA.debugLineNum = 97;BA.debugLine="Return SettingsMenuLogin.AsView.Left";
if (true) return _settingsmenulogin._asview().getLeft();
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "JOBDONE"))
	return _jobdone((b4a.diplomna.httpjob) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
