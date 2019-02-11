package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class settingsmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.settingsmenu");
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
public String  _appsettings_click() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub AppSettings_Click";
 //BA.debugLineNum = 81;BA.debugLine="CallSub(Main,\"ShowHideAppSettingsScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowHideAppSettingsScreen");
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 32;BA.debugLine="Return pnlHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_pnlholder.getObject()));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public String  _buildmenu() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub BuildMenu";
 //BA.debugLineNum = 36;BA.debugLine="lblAppSettings.Text = \"Settings\"";
_lblappsettings.setText(BA.ObjectToCharSequence("Settings"));
 //BA.debugLineNum = 37;BA.debugLine="lblAppSettings.Gravity = Gravity.CENTER";
_lblappsettings.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 38;BA.debugLine="lblAppSettings.Color = Colors.LightGray";
_lblappsettings.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 39;BA.debugLine="lblAppSettings.TextColor = Colors.Black";
_lblappsettings.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 41;BA.debugLine="lblMyOrders.Text = \"My Orders\"";
_lblmyorders.setText(BA.ObjectToCharSequence("My Orders"));
 //BA.debugLineNum = 42;BA.debugLine="lblMyOrders.Gravity = Gravity.CENTER";
_lblmyorders.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 43;BA.debugLine="lblMyOrders.Color = Colors.LightGray";
_lblmyorders.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 44;BA.debugLine="lblMyOrders.TextColor = Colors.Black";
_lblmyorders.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 46;BA.debugLine="lblShoppingCart.Text = \"Shopping Cart\"";
_lblshoppingcart.setText(BA.ObjectToCharSequence("Shopping Cart"));
 //BA.debugLineNum = 47;BA.debugLine="lblShoppingCart.Gravity = Gravity.CENTER";
_lblshoppingcart.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 48;BA.debugLine="lblShoppingCart.Color = Colors.LightGray";
_lblshoppingcart.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 49;BA.debugLine="lblShoppingCart.TextColor = Colors.Black";
_lblshoppingcart.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 51;BA.debugLine="lblLoginScreen.Text = \"Login Screen\"";
_lblloginscreen.setText(BA.ObjectToCharSequence("Login Screen"));
 //BA.debugLineNum = 52;BA.debugLine="lblLoginScreen.Gravity = Gravity.CENTER";
_lblloginscreen.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 53;BA.debugLine="lblLoginScreen.Color = Colors.LightGray";
_lblloginscreen.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 54;BA.debugLine="lblLoginScreen.TextColor = Colors.Black";
_lblloginscreen.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 56;BA.debugLine="If flag = 0 Then";
if (_flag==0) { 
 //BA.debugLineNum = 57;BA.debugLine="pnlHolder.AddView(lblAppSettings,0,0,15%x,5%y)";
_pnlholder.AddView((android.view.View)(_lblappsettings.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else if(_flag==1) { 
 //BA.debugLineNum = 59;BA.debugLine="pnlHolder.AddView(lblMyOrders,0,0,15%x,5%y)";
_pnlholder.AddView((android.view.View)(_lblmyorders.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else if(_flag==2) { 
 //BA.debugLineNum = 61;BA.debugLine="pnlHolder.AddView(lblShoppingCart,0,0,15%x,5%y)";
_pnlholder.AddView((android.view.View)(_lblshoppingcart.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else if(_flag==3) { 
 //BA.debugLineNum = 63;BA.debugLine="pnlHolder.AddView(lblLoginScreen,0,0,15%x,5%y)";
_pnlholder.AddView((android.view.View)(_lblloginscreen.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 };
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private lblAppSettings As Label";
_lblappsettings = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private lblMyOrders As Label";
_lblmyorders = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private lblShoppingCart As Label";
_lblshoppingcart = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private lblLoginScreen As Label";
_lblloginscreen = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private pnlHolder As Panel";
_pnlholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private flag As Int";
_flag = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _hidesettingswindow() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub HideSettingsWindow";
 //BA.debugLineNum = 68;BA.debugLine="CallSub(Main,\"HideSettingsWindows\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"HideSettingsWindows");
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,int _location) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(Location As Int)";
 //BA.debugLineNum = 12;BA.debugLine="pnlHolder.initialize(\"MainPan\")";
_pnlholder.Initialize(ba,"MainPan");
 //BA.debugLineNum = 13;BA.debugLine="lblMyOrders.initialize(\"MyOrders\")";
_lblmyorders.Initialize(ba,"MyOrders");
 //BA.debugLineNum = 14;BA.debugLine="lblAppSettings.initialize(\"AppSettings\")";
_lblappsettings.Initialize(ba,"AppSettings");
 //BA.debugLineNum = 15;BA.debugLine="lblShoppingCart.Initialize(\"ShoppingCart\")";
_lblshoppingcart.Initialize(ba,"ShoppingCart");
 //BA.debugLineNum = 16;BA.debugLine="lblLoginScreen.Initialize(\"LoginScreen\")";
_lblloginscreen.Initialize(ba,"LoginScreen");
 //BA.debugLineNum = 18;BA.debugLine="If Location = 0 Then";
if (_location==0) { 
 //BA.debugLineNum = 19;BA.debugLine="flag = 0";
_flag = (int) (0);
 }else if(_location==1) { 
 //BA.debugLineNum = 21;BA.debugLine="flag = 1";
_flag = (int) (1);
 }else if(_location==2) { 
 //BA.debugLineNum = 23;BA.debugLine="flag = 2";
_flag = (int) (2);
 }else if(_location==3) { 
 //BA.debugLineNum = 25;BA.debugLine="flag = 3";
_flag = (int) (3);
 };
 //BA.debugLineNum = 27;BA.debugLine="Log(flag)";
__c.LogImpl("58323088",BA.NumberToString(_flag),0);
 //BA.debugLineNum = 28;BA.debugLine="BuildMenu";
_buildmenu();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _loginscreen_click() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub LoginScreen_Click";
 //BA.debugLineNum = 95;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
 //BA.debugLineNum = 96;BA.debugLine="HideSettingsWindow";
_hidesettingswindow();
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _myorders_click() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub MyOrders_Click";
 //BA.debugLineNum = 73;BA.debugLine="CallSub(Main,\"ShowClientOrdersScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowClientOrdersScreen");
 //BA.debugLineNum = 74;BA.debugLine="CallSub(Main,\"HideMainScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"HideMainScreen");
 //BA.debugLineNum = 75;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
 //BA.debugLineNum = 76;BA.debugLine="HideSettingsWindow";
_hidesettingswindow();
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _shoppingcart_click() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub ShoppingCart_Click";
 //BA.debugLineNum = 88;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowMainScreen");
 //BA.debugLineNum = 89;BA.debugLine="CallSub(Main,\"HideClientOrdersScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"HideClientOrdersScreen");
 //BA.debugLineNum = 90;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
 //BA.debugLineNum = 91;BA.debugLine="HideSettingsWindow";
_hidesettingswindow();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
