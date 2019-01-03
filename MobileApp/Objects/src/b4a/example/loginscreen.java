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
public anywheresoftware.b4a.objects.EditTextWrapper _usernametxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _passwordtxt = null;
public anywheresoftware.b4a.objects.ButtonWrapper _loginbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _registerbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _settingsbtn = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.support _support = null;
public String  _initialize(b4a.example.loginscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="ScreenLogo.Initialize(\"\")";
__ref._screenlogo.Initialize(ba,"");
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Logo.Initialize(\"\")";
__ref._logo.Initialize(ba,"");
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="usernametxt.Initialize(\"\")";
__ref._usernametxt.Initialize(ba,"");
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="passwordtxt.Initialize(\"\")";
__ref._passwordtxt.Initialize(ba,"");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="loginbtn.Initialize(\"Login\")";
__ref._loginbtn.Initialize(ba,"Login");
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="registerbtn.Initialize(\"Register\")";
__ref._registerbtn.Initialize(ba,"Register");
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="settingsbtn.Initialize(\"\")";
__ref._settingsbtn.Initialize(ba,"");
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return null;
}
public String  _buildui(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="ScreenPnl.Color = Colors.White";
__ref._screenpnl.setColor(__c.Colors.White);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="usernametxt.Color = Colors.White";
__ref._usernametxt.setColor(__c.Colors.White);
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="usernametxt.Hint = \"Username\"";
__ref._usernametxt.setHint("Username");
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="usernametxt.HintColor = Colors.LightGray";
__ref._usernametxt.setHintColor(__c.Colors.LightGray);
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="usernametxt.SingleLine = True";
__ref._usernametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="passwordtxt.Hint = \"Password\"";
__ref._passwordtxt.setHint("Password");
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="passwordtxt.SingleLine = True";
__ref._passwordtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="passwordtxt.HintColor = Colors.LightGray";
__ref._passwordtxt.setHintColor(__c.Colors.LightGray);
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._usernametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._passwordtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="loginbtn.Text = \"Login\"";
__ref._loginbtn.setText(BA.ObjectToCharSequence("Login"));
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
__ref._loginbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="Support.ApplyViewStyle(loginbtn,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._loginbtn.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="registerbtn.Text = \"Register\"";
__ref._registerbtn.setText(BA.ObjectToCharSequence("Register"));
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="registerbtn.Gravity = Gravity.CENTER";
__ref._registerbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="Support.ApplyViewStyle(registerbtn,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._registerbtn.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="ScreenLogo.Color = Colors.DarkGray";
__ref._screenlogo.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="Logo.Bitmap = LoadBitmap(File.DirAssets,\"express-";
__ref._logo.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"express-shop-logo-01.jpg").getObject()));
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="Logo.Gravity = Gravity.FILL";
__ref._logo.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="ScreenPnl.AddView(ScreenLogo,UISizes.LoginScrDefa";
__ref._screenpnl.AddView((android.view.View)(__ref._screenlogo.getObject()),_uisizes._loginscrdefaultleft,__c.PerYToCurrent((float) (15),ba),_uisizes._loginscrdefaultwidth,__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="ScreenPnl.AddView(usernametxt,ScreenLogo.Left,Scr";
__ref._screenpnl.AddView((android.view.View)(__ref._usernametxt.getObject()),__ref._screenlogo.getLeft(),(int) (__ref._screenlogo.getTop()+__ref._screenlogo.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,Scre";
__ref._screenlogo.AddView((android.view.View)(__ref._logo.getObject()),(int) (0),(int) (0),__ref._screenlogo.getWidth(),__ref._screenlogo.getHeight());
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="ScreenPnl.AddView(passwordtxt,ScreenLogo.Left,use";
__ref._screenpnl.AddView((android.view.View)(__ref._passwordtxt.getObject()),__ref._screenlogo.getLeft(),(int) (__ref._usernametxt.getTop()+__ref._usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="ScreenPnl.AddView(loginbtn,ScreenLogo.Left,passwo";
__ref._screenpnl.AddView((android.view.View)(__ref._loginbtn.getObject()),__ref._screenlogo.getLeft(),(int) (__ref._passwordtxt.getTop()+__ref._passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="ScreenPnl.AddView(registerbtn,ScreenLogo.Left,log";
__ref._screenpnl.AddView((android.view.View)(__ref._registerbtn.getObject()),__ref._screenlogo.getLeft(),(int) (__ref._loginbtn.getTop()+__ref._loginbtn.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private ScreenLogo As Panel";
_screenlogo = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Private Logo As ImageView";
_logo = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Private loginbtn As Button";
_loginbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Private registerbtn As Button";
_registerbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Private settingsbtn As Button";
_settingsbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.example.loginscreen __ref,anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "jobdone"))
	 {return ((String) Debug.delegate(ba, "jobdone", new Object[] {_job}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If Job.Success = False Then";
if (_job._success==__c.False) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Log(\"login failed\")";
__c.Log("login failed");
 }else {
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Log(\"login success\")";
__c.Log("login success");
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Log(Job.GetString)";
__c.Log(_job._getstring());
 };
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="End Sub";
return "";
}
public void  _login_click(b4a.example.loginscreen __ref) throws Exception{
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "login_click"))
	 {Debug.delegate(ba, "login_click", null); return;}
ResumableSub_Login_Click rsub = new ResumableSub_Login_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Login_Click extends BA.ResumableSub {
public ResumableSub_Login_Click(b4a.example.loginscreen parent,b4a.example.loginscreen __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.loginscreen __ref;
b4a.example.loginscreen parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _test = null;
Object _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="loginscreen";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If usernametxt.TextSize > 0 Then";
if (true) break;

case 1:
//if
this.state = 18;
if (__ref._usernametxt.getTextSize()>0) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If passwordtxt.TextSize > 0 Then";
if (true) break;

case 4:
//if
this.state = 15;
if (__ref._passwordtxt.getTextSize()>0) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Dim test As ResumableSub = Main.HTTP.GetGoodBy";
_test = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_test = parent._main._http._getgoodbyid(null,(int) (5));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Wait For (test)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "loginscreen", "login_click"), _test);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (Object) result[1];
;
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="If Result = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((_result).equals((Object)(parent.__c.False))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Log(\"LOGIN FAILED\")";
parent.__c.Log("LOGIN FAILED");
 if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="ToastMessageShow(\"Enter Password!\",False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Password!"),parent.__c.False);
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="ToastMessageShow(\"Enter Username!\",False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Enter Username!"),parent.__c.False);
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _register_click(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "register_click"))
	 {return ((String) Debug.delegate(ba, "register_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Register_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRegisterScreen");
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
}