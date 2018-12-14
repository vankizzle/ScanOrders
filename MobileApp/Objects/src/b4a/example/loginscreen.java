package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.loginscreen");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _screenpnl = null;
public anywheresoftware.b4a.objects.PanelWrapper _screenlogo = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _logo = null;
public anywheresoftware.b4a.objects.EditTextWrapper _usernametxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _passwordtxt = null;
public anywheresoftware.b4a.objects.ButtonWrapper _loginbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _registerbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _settingsbtn = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.uisizes _uisizes = null;
public b4a.example.support _support = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 72;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_screenpnl.getObject()));
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub BuildUI";
 //BA.debugLineNum = 35;BA.debugLine="ScreenPnl.Color = Colors.White";
_screenpnl.setColor(__c.Colors.White);
 //BA.debugLineNum = 37;BA.debugLine="usernametxt.Color = Colors.White";
_usernametxt.setColor(__c.Colors.White);
 //BA.debugLineNum = 39;BA.debugLine="usernametxt.Hint = \"Username\"";
_usernametxt.setHint("Username");
 //BA.debugLineNum = 40;BA.debugLine="usernametxt.HintColor = Colors.LightGray";
_usernametxt.setHintColor(__c.Colors.LightGray);
 //BA.debugLineNum = 41;BA.debugLine="usernametxt.SingleLine = True";
_usernametxt.setSingleLine(__c.True);
 //BA.debugLineNum = 42;BA.debugLine="passwordtxt.Hint = \"Password\"";
_passwordtxt.setHint("Password");
 //BA.debugLineNum = 43;BA.debugLine="passwordtxt.SingleLine = True";
_passwordtxt.setSingleLine(__c.True);
 //BA.debugLineNum = 44;BA.debugLine="passwordtxt.HintColor = Colors.LightGray";
_passwordtxt.setHintColor(__c.Colors.LightGray);
 //BA.debugLineNum = 45;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_usernametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 46;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_passwordtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 48;BA.debugLine="loginbtn.Text = \"Login\"";
_loginbtn.setText(BA.ObjectToCharSequence("Login"));
 //BA.debugLineNum = 49;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
_loginbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 50;BA.debugLine="Support.ApplyViewStyle(loginbtn,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_loginbtn.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 52;BA.debugLine="registerbtn.Text = \"Register\"";
_registerbtn.setText(BA.ObjectToCharSequence("Register"));
 //BA.debugLineNum = 53;BA.debugLine="registerbtn.Gravity = Gravity.CENTER";
_registerbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 54;BA.debugLine="Support.ApplyViewStyle(registerbtn,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_registerbtn.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 56;BA.debugLine="ScreenLogo.Color = Colors.DarkGray";
_screenlogo.setColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 58;BA.debugLine="Logo.Bitmap = LoadBitmap(File.DirAssets,\"express-";
_logo.setBitmap((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"express-shop-logo-01.jpg").getObject()));
 //BA.debugLineNum = 59;BA.debugLine="Logo.Gravity = Gravity.FILL";
_logo.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 60;BA.debugLine="ScreenPnl.AddView(ScreenLogo,UISizes.LoginScrDefa";
_screenpnl.AddView((android.view.View)(_screenlogo.getObject()),_uisizes._loginscrdefaultleft,__c.PerYToCurrent((float) (15),ba),_uisizes._loginscrdefaultwidth,__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 61;BA.debugLine="ScreenPnl.AddView(usernametxt,ScreenLogo.Left,Scr";
_screenpnl.AddView((android.view.View)(_usernametxt.getObject()),_screenlogo.getLeft(),(int) (_screenlogo.getTop()+_screenlogo.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 62;BA.debugLine="ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,Scre";
_screenlogo.AddView((android.view.View)(_logo.getObject()),(int) (0),(int) (0),_screenlogo.getWidth(),_screenlogo.getHeight());
 //BA.debugLineNum = 63;BA.debugLine="ScreenPnl.AddView(passwordtxt,ScreenLogo.Left,use";
_screenpnl.AddView((android.view.View)(_passwordtxt.getObject()),_screenlogo.getLeft(),(int) (_usernametxt.getTop()+_usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 64;BA.debugLine="ScreenPnl.AddView(loginbtn,ScreenLogo.Left,passwo";
_screenpnl.AddView((android.view.View)(_loginbtn.getObject()),_screenlogo.getLeft(),(int) (_passwordtxt.getTop()+_passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 65;BA.debugLine="ScreenPnl.AddView(registerbtn,ScreenLogo.Left,log";
_screenpnl.AddView((android.view.View)(_registerbtn.getObject()),_screenlogo.getLeft(),(int) (_loginbtn.getTop()+_loginbtn.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private loginbtn As Button";
_loginbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private registerbtn As Button";
_registerbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private settingsbtn As Button";
_settingsbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 20;BA.debugLine="ScreenPnl.Initialize(\"\")";
_screenpnl.Initialize(ba,"");
 //BA.debugLineNum = 21;BA.debugLine="ScreenLogo.Initialize(\"\")";
_screenlogo.Initialize(ba,"");
 //BA.debugLineNum = 22;BA.debugLine="Logo.Initialize(\"\")";
_logo.Initialize(ba,"");
 //BA.debugLineNum = 23;BA.debugLine="usernametxt.Initialize(\"\")";
_usernametxt.Initialize(ba,"");
 //BA.debugLineNum = 24;BA.debugLine="passwordtxt.Initialize(\"\")";
_passwordtxt.Initialize(ba,"");
 //BA.debugLineNum = 27;BA.debugLine="loginbtn.Initialize(\"\")";
_loginbtn.Initialize(ba,"");
 //BA.debugLineNum = 28;BA.debugLine="registerbtn.Initialize(\"\")";
_registerbtn.Initialize(ba,"");
 //BA.debugLineNum = 29;BA.debugLine="settingsbtn.Initialize(\"\")";
_settingsbtn.Initialize(ba,"");
 //BA.debugLineNum = 30;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
