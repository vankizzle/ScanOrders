package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class settingsmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.settingsmenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.settingsmenu.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lblappsettings = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmyorders = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshoppingcart = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblloginscreen = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlholder = null;
public int _flag = 0;
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Return pnlHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pnlholder.getObject()));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.settingsmenu __ref,anywheresoftware.b4a.BA _ba,int _location) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_location}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub Initialize(Location As Int)";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="pnlHolder.initialize(\"MainPan\")";
__ref._pnlholder.Initialize(ba,"MainPan");
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="lblMyOrders.initialize(\"MyOrders\")";
__ref._lblmyorders.Initialize(ba,"MyOrders");
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="lblAppSettings.initialize(\"AppSettings\")";
__ref._lblappsettings.Initialize(ba,"AppSettings");
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="lblShoppingCart.Initialize(\"ShoppingCart\")";
__ref._lblshoppingcart.Initialize(ba,"ShoppingCart");
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="lblLoginScreen.Initialize(\"LoginScreen\")";
__ref._lblloginscreen.Initialize(ba,"LoginScreen");
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="If Location = 0 Then";
if (_location==0) { 
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="flag = 0";
__ref._flag = (int) (0);
 }else 
{RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="Else If Location = 1 Then";
if (_location==1) { 
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="flag = 1";
__ref._flag = (int) (1);
 }else 
{RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="else if Location = 2 Then";
if (_location==2) { 
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="flag = 2";
__ref._flag = (int) (2);
 }else 
{RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="else if Location = 3 Then";
if (_location==3) { 
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="flag = 3";
__ref._flag = (int) (3);
 }}}}
;
RDebugUtils.currentLine=8519696;
 //BA.debugLineNum = 8519696;BA.debugLine="Log(flag)";
__c.LogImpl("38519696",BA.NumberToString(__ref._flag),0);
RDebugUtils.currentLine=8519697;
 //BA.debugLineNum = 8519697;BA.debugLine="BuildMenu";
__ref._buildmenu(null);
RDebugUtils.currentLine=8519698;
 //BA.debugLineNum = 8519698;BA.debugLine="End Sub";
return "";
}
public String  _appsettings_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "appsettings_click", false))
	 {return ((String) Debug.delegate(ba, "appsettings_click", null));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub AppSettings_Click";
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="CallSub(Main,\"ShowHideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideAppSettingsScreen");
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="End Sub";
return "";
}
public String  _buildmenu(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "buildmenu", false))
	 {return ((String) Debug.delegate(ba, "buildmenu", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub BuildMenu";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="lblAppSettings.Text = \"Settings\"";
__ref._lblappsettings.setText(BA.ObjectToCharSequence("Settings"));
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="lblAppSettings.Gravity = Gravity.CENTER";
__ref._lblappsettings.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="lblAppSettings.Color = Colors.LightGray";
__ref._lblappsettings.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="lblAppSettings.TextColor = Colors.Black";
__ref._lblappsettings.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="lblMyOrders.Text = \"My Orders\"";
__ref._lblmyorders.setText(BA.ObjectToCharSequence("My Orders"));
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="lblMyOrders.Gravity = Gravity.CENTER";
__ref._lblmyorders.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="lblMyOrders.Color = Colors.LightGray";
__ref._lblmyorders.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="lblMyOrders.TextColor = Colors.Black";
__ref._lblmyorders.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=8650763;
 //BA.debugLineNum = 8650763;BA.debugLine="lblShoppingCart.Text = \"Shopping Cart\"";
__ref._lblshoppingcart.setText(BA.ObjectToCharSequence("Shopping Cart"));
RDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="lblShoppingCart.Gravity = Gravity.CENTER";
__ref._lblshoppingcart.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8650765;
 //BA.debugLineNum = 8650765;BA.debugLine="lblShoppingCart.Color = Colors.LightGray";
__ref._lblshoppingcart.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=8650766;
 //BA.debugLineNum = 8650766;BA.debugLine="lblShoppingCart.TextColor = Colors.Black";
__ref._lblshoppingcart.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=8650768;
 //BA.debugLineNum = 8650768;BA.debugLine="lblLoginScreen.Text = \"Login Screen\"";
__ref._lblloginscreen.setText(BA.ObjectToCharSequence("Login Screen"));
RDebugUtils.currentLine=8650769;
 //BA.debugLineNum = 8650769;BA.debugLine="lblLoginScreen.Gravity = Gravity.CENTER";
__ref._lblloginscreen.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8650770;
 //BA.debugLineNum = 8650770;BA.debugLine="lblLoginScreen.Color = Colors.LightGray";
__ref._lblloginscreen.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=8650771;
 //BA.debugLineNum = 8650771;BA.debugLine="lblLoginScreen.TextColor = Colors.Black";
__ref._lblloginscreen.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=8650773;
 //BA.debugLineNum = 8650773;BA.debugLine="If flag = 0 Then";
if (__ref._flag==0) { 
RDebugUtils.currentLine=8650774;
 //BA.debugLineNum = 8650774;BA.debugLine="pnlHolder.AddView(lblAppSettings,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblappsettings.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=8650775;
 //BA.debugLineNum = 8650775;BA.debugLine="else if flag = 1 Then";
if (__ref._flag==1) { 
RDebugUtils.currentLine=8650776;
 //BA.debugLineNum = 8650776;BA.debugLine="pnlHolder.AddView(lblMyOrders,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblmyorders.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=8650777;
 //BA.debugLineNum = 8650777;BA.debugLine="else if flag = 2 Then";
if (__ref._flag==2) { 
RDebugUtils.currentLine=8650778;
 //BA.debugLineNum = 8650778;BA.debugLine="pnlHolder.AddView(lblShoppingCart,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblshoppingcart.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=8650779;
 //BA.debugLineNum = 8650779;BA.debugLine="else if flag = 3 Then";
if (__ref._flag==3) { 
RDebugUtils.currentLine=8650780;
 //BA.debugLineNum = 8650780;BA.debugLine="pnlHolder.AddView(lblLoginScreen,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblloginscreen.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }}}}
;
RDebugUtils.currentLine=8650782;
 //BA.debugLineNum = 8650782;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Private lblAppSettings As Label";
_lblappsettings = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Private lblMyOrders As Label";
_lblmyorders = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Private lblShoppingCart As Label";
_lblshoppingcart = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Private lblLoginScreen As Label";
_lblloginscreen = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Private pnlHolder As Panel";
_pnlholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="Private flag As Int";
_flag = 0;
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="End Sub";
return "";
}
public String  _hidesettingswindow(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "hidesettingswindow", false))
	 {return ((String) Debug.delegate(ba, "hidesettingswindow", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub HideSettingsWindow";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="CallSub(Main,\"HideSettingsWindows\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideSettingsWindows");
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return "";
}
public String  _loginscreen_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "loginscreen_click", false))
	 {return ((String) Debug.delegate(ba, "loginscreen_click", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub LoginScreen_Click";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="End Sub";
return "";
}
public String  _myorders_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "myorders_click", false))
	 {return ((String) Debug.delegate(ba, "myorders_click", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub MyOrders_Click";
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="CallSub(Main,\"ShowClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowClientOrdersScreen");
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="CallSub(Main,\"HideMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideMainScreen");
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="End Sub";
return "";
}
public String  _shoppingcart_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "shoppingcart_click", false))
	 {return ((String) Debug.delegate(ba, "shoppingcart_click", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub ShoppingCart_Click";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMainScreen");
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="CallSub(Main,\"HideClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideClientOrdersScreen");
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="End Sub";
return "";
}
}