package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.loginscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.loginscreen.class).invoke(this, new Object[] {null});
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
public b4a.example.settingsmenu _settingsmenulogin = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.support _support = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.loginscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="ScreenLogo.Initialize(\"\")";
__ref._screenlogo.Initialize(ba,"");
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Logo.Initialize(\"\")";
__ref._logo.Initialize(ba,"");
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="usernametxt.Initialize(\"\")";
__ref._usernametxt.Initialize(ba,"");
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="passwordtxt.Initialize(\"\")";
__ref._passwordtxt.Initialize(ba,"");
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Header.Initialize(\"\")";
__ref._header.Initialize(ba,"");
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="loginbtn.Initialize(\"Login\")";
__ref._loginbtn.Initialize(ba,"Login");
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="registerbtn.Initialize(\"Register\")";
__ref._registerbtn.Initialize(ba,"Register");
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="settingsbtn.Initialize(\"\")";
__ref._settingsbtn.Initialize(ba,"");
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
__ref._settingsbutton.Initialize(ba,"Settings");
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="SettingsMenuLogin.Initialize(0)";
__ref._settingsmenulogin._initialize(null,ba,(int) (0));
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return null;
}
public boolean  _settingsisvisible(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "settingsisvisible"))
	 {return ((Boolean) Debug.delegate(ba, "settingsisvisible", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub SettingsIsVisible As Boolean";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Return SettingsMenuLogin.AsView.Visible";
if (true) return __ref._settingsmenulogin._asview(null).getVisible();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return false;
}
public String  _settings_click(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "settings_click"))
	 {return ((String) Debug.delegate(ba, "settings_click", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Settings_Click";
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==-__c.PerXToCurrent((float) (15),ba)) { 
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (0),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
if (__ref._settingsmenulogin._asview(null).getLeft()==0) { 
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
__ref._settingsmenulogin._asview(null).SetLayoutAnimated((int) (500),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }}
;
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bc = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="ScreenPnl.Color = Colors.White";
__ref._screenpnl.setColor(__c.Colors.White);
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Header.Color = Colors.RGB(182,0,0)";
__ref._header.setColor(__c.Colors.RGB((int) (182),(int) (0),(int) (0)));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsmenulogin._asview(null).getObject()),(int) (-__c.PerXToCurrent((float) (15),ba)),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
__ref._screenpnl.AddView((android.view.View)(__ref._header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="usernametxt.Color = Colors.White";
__ref._usernametxt.setColor(__c.Colors.White);
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="usernametxt.Hint = \"Username\"";
__ref._usernametxt.setHint("Username");
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="usernametxt.HintColor = Colors.LightGray";
__ref._usernametxt.setHintColor(__c.Colors.LightGray);
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="usernametxt.SingleLine = True";
__ref._usernametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="passwordtxt.Hint = \"Password\"";
__ref._passwordtxt.setHint("Password");
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="passwordtxt.SingleLine = True";
__ref._passwordtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="passwordtxt.HintColor = Colors.LightGray";
__ref._passwordtxt.setHintColor(__c.Colors.LightGray);
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._usernametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._passwordtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="loginbtn.Text = \"Login\"";
__ref._loginbtn.setText(BA.ObjectToCharSequence("Login"));
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
__ref._loginbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="Support.ApplyViewStyle(loginbtn,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._loginbtn.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="registerbtn.Text = \"Register\"";
__ref._registerbtn.setText(BA.ObjectToCharSequence("Register"));
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="registerbtn.Gravity = Gravity.CENTER";
__ref._registerbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="Support.ApplyViewStyle(registerbtn,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._registerbtn.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="ScreenLogo.Color = Colors.DarkGray";
__ref._screenlogo.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=524318;
 //BA.debugLineNum = 524318;BA.debugLine="Logo.Bitmap = LoadBitmap(File.DirAssets,\"express-";
__ref._logo.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"express-shop-logo-01.jpg").getObject()));
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="Logo.Gravity = Gravity.FILL";
__ref._logo.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="ScreenPnl.AddView(ScreenLogo,UISizes.LoginScrDefa";
__ref._screenpnl.AddView((android.view.View)(__ref._screenlogo.getObject()),_uisizes._loginscrdefaultleft,__c.PerYToCurrent((float) (15),ba),_uisizes._loginscrdefaultwidth,__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="ScreenPnl.AddView(usernametxt,ScreenLogo.Left,Scr";
__ref._screenpnl.AddView((android.view.View)(__ref._usernametxt.getObject()),__ref._screenlogo.getLeft(),(int) (__ref._screenlogo.getTop()+__ref._screenlogo.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=524322;
 //BA.debugLineNum = 524322;BA.debugLine="ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,Scre";
__ref._screenlogo.AddView((android.view.View)(__ref._logo.getObject()),(int) (0),(int) (0),__ref._screenlogo.getWidth(),__ref._screenlogo.getHeight());
RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="ScreenPnl.AddView(passwordtxt,ScreenLogo.Left,use";
__ref._screenpnl.AddView((android.view.View)(__ref._passwordtxt.getObject()),__ref._screenlogo.getLeft(),(int) (__ref._usernametxt.getTop()+__ref._usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=524324;
 //BA.debugLineNum = 524324;BA.debugLine="ScreenPnl.AddView(loginbtn,ScreenLogo.Left,passwo";
__ref._screenpnl.AddView((android.view.View)(__ref._loginbtn.getObject()),__ref._screenlogo.getLeft(),(int) (__ref._passwordtxt.getTop()+__ref._passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=524325;
 //BA.debugLineNum = 524325;BA.debugLine="ScreenPnl.AddView(registerbtn,ScreenLogo.Left,log";
__ref._screenpnl.AddView((android.view.View)(__ref._registerbtn.getObject()),__ref._screenlogo.getLeft(),(int) (__ref._loginbtn.getTop()+__ref._loginbtn.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=524327;
 //BA.debugLineNum = 524327;BA.debugLine="Dim bc As Bitmap";
_bc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=524328;
 //BA.debugLineNum = 524328;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
_bc.Initialize(__c.File.getDirAssets(),"optbutton.png");
RDebugUtils.currentLine=524329;
 //BA.debugLineNum = 524329;BA.debugLine="SettingsButton.Color = Colors.DarkGray";
__ref._settingsbutton.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=524330;
 //BA.debugLineNum = 524330;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
__ref._settingsbutton.SetBackgroundImageNew((android.graphics.Bitmap)(_bc.getObject()));
RDebugUtils.currentLine=524331;
 //BA.debugLineNum = 524331;BA.debugLine="ScreenPnl.AddView(SettingsButton,0,0 + 2dip,10%x,";
__ref._screenpnl.AddView((android.view.View)(__ref._settingsbutton.getObject()),(int) (0),(int) (0+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=524334;
 //BA.debugLineNum = 524334;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Private ScreenLogo As Panel";
_screenlogo = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Private Logo As ImageView";
_logo = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="Private loginbtn As Button";
_loginbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="Private registerbtn As Button";
_registerbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="Private settingsbtn As Button";
_settingsbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="Private SettingsButton As Button";
_settingsbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
_settingsmenulogin = new b4a.example.settingsmenu();
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.example.loginscreen __ref,anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "jobdone"))
	 {return ((String) Debug.delegate(ba, "jobdone", new Object[] {_job}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If Job.Success = False Then";
if (_job._success==__c.False) { 
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Log(\"login failed\")";
__c.Log("login failed");
 }else {
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Log(\"login success\")";
__c.Log("login success");
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Log(Job.GetString)";
__c.Log(_job._getstring());
 };
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="End Sub";
return "";
}
public String  _login_click(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "login_click"))
	 {return ((String) Debug.delegate(ba, "login_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Login_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If usernametxt.TextSize > 0 Then";
if (__ref._usernametxt.getTextSize()>0) { 
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="If passwordtxt.TextSize > 0 Then";
if (__ref._passwordtxt.getTextSize()>0) { 
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMainScreen");
 }else {
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="ToastMessageShow(\"Enter Password!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Password!"),__c.False);
 };
 }else {
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="ToastMessageShow(\"Enter Username!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Username!"),__c.False);
 };
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="End Sub";
return "";
}
public String  _register_click(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "register_click"))
	 {return ((String) Debug.delegate(ba, "register_click", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Register_Click";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRegisterScreen");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
}