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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Return pnlHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pnlholder.getObject()));
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.settingsmenu __ref,anywheresoftware.b4a.BA _ba,int _location) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_location}));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub Initialize(Location As Int)";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="pnlHolder.initialize(\"MainPan\")";
__ref._pnlholder.Initialize(ba,"MainPan");
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="lblMyOrders.initialize(\"MyOrders\")";
__ref._lblmyorders.Initialize(ba,"MyOrders");
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="lblAppSettings.initialize(\"AppSettings\")";
__ref._lblappsettings.Initialize(ba,"AppSettings");
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="lblShoppingCart.Initialize(\"ShoppingCart\")";
__ref._lblshoppingcart.Initialize(ba,"ShoppingCart");
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="lblLoginScreen.Initialize(\"LoginScreen\")";
__ref._lblloginscreen.Initialize(ba,"LoginScreen");
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="If Location = 0 Then";
if (_location==0) { 
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="flag = 0";
__ref._flag = (int) (0);
 }else 
{RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="Else If Location = 1 Then";
if (_location==1) { 
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="flag = 1";
__ref._flag = (int) (1);
 }else 
{RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="else if Location = 2 Then";
if (_location==2) { 
RDebugUtils.currentLine=6225932;
 //BA.debugLineNum = 6225932;BA.debugLine="flag = 2";
__ref._flag = (int) (2);
 }else 
{RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="else if Location = 3 Then";
if (_location==3) { 
RDebugUtils.currentLine=6225934;
 //BA.debugLineNum = 6225934;BA.debugLine="flag = 3";
__ref._flag = (int) (3);
 }}}}
;
RDebugUtils.currentLine=6225936;
 //BA.debugLineNum = 6225936;BA.debugLine="Log(flag)";
__c.Log(BA.NumberToString(__ref._flag));
RDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="BuildMenu";
__ref._buildmenu(null);
RDebugUtils.currentLine=6225938;
 //BA.debugLineNum = 6225938;BA.debugLine="End Sub";
return "";
}
public String  _appsettings_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "appsettings_click"))
	 {return ((String) Debug.delegate(ba, "appsettings_click", null));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub AppSettings_Click";
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="CallSub(Main,\"ShowAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowAppSettingsScreen");
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="CallSub(Main,\"HideMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideMainScreen");
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="CallSub(Main,\"HideClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideClientOrdersScreen");
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="End Sub";
return "";
}
public String  _hidesettingswindow(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "hidesettingswindow"))
	 {return ((String) Debug.delegate(ba, "hidesettingswindow", null));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub HideSettingsWindow";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="CallSub(Main,\"HideSettingsWindows\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideSettingsWindows");
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="End Sub";
return "";
}
public String  _buildmenu(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "buildmenu"))
	 {return ((String) Debug.delegate(ba, "buildmenu", null));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub BuildMenu";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="lblAppSettings.Text = \"Settings\"";
__ref._lblappsettings.setText(BA.ObjectToCharSequence("Settings"));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="lblAppSettings.Gravity = Gravity.CENTER";
__ref._lblappsettings.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="lblAppSettings.Color = Colors.LightGray";
__ref._lblappsettings.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="lblAppSettings.TextColor = Colors.Black";
__ref._lblappsettings.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="lblMyOrders.Text = \"My Orders\"";
__ref._lblmyorders.setText(BA.ObjectToCharSequence("My Orders"));
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="lblMyOrders.Gravity = Gravity.CENTER";
__ref._lblmyorders.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="lblMyOrders.Color = Colors.LightGray";
__ref._lblmyorders.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="lblMyOrders.TextColor = Colors.Black";
__ref._lblmyorders.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="lblShoppingCart.Text = \"Shopping Cart\"";
__ref._lblshoppingcart.setText(BA.ObjectToCharSequence("Shopping Cart"));
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="lblShoppingCart.Gravity = Gravity.CENTER";
__ref._lblshoppingcart.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="lblShoppingCart.Color = Colors.LightGray";
__ref._lblshoppingcart.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="lblShoppingCart.TextColor = Colors.Black";
__ref._lblshoppingcart.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="lblLoginScreen.Text = \"Login Screen\"";
__ref._lblloginscreen.setText(BA.ObjectToCharSequence("Login Screen"));
RDebugUtils.currentLine=6357009;
 //BA.debugLineNum = 6357009;BA.debugLine="lblLoginScreen.Gravity = Gravity.CENTER";
__ref._lblloginscreen.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=6357010;
 //BA.debugLineNum = 6357010;BA.debugLine="lblLoginScreen.Color = Colors.LightGray";
__ref._lblloginscreen.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=6357011;
 //BA.debugLineNum = 6357011;BA.debugLine="lblLoginScreen.TextColor = Colors.Black";
__ref._lblloginscreen.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=6357013;
 //BA.debugLineNum = 6357013;BA.debugLine="If flag = 0 Then";
if (__ref._flag==0) { 
RDebugUtils.currentLine=6357014;
 //BA.debugLineNum = 6357014;BA.debugLine="pnlHolder.AddView(lblAppSettings,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblappsettings.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=6357015;
 //BA.debugLineNum = 6357015;BA.debugLine="else if flag = 1 Then";
if (__ref._flag==1) { 
RDebugUtils.currentLine=6357016;
 //BA.debugLineNum = 6357016;BA.debugLine="pnlHolder.AddView(lblMyOrders,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblmyorders.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=6357017;
 //BA.debugLineNum = 6357017;BA.debugLine="else if flag = 2 Then";
if (__ref._flag==2) { 
RDebugUtils.currentLine=6357018;
 //BA.debugLineNum = 6357018;BA.debugLine="pnlHolder.AddView(lblShoppingCart,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblshoppingcart.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="else if flag = 3 Then";
if (__ref._flag==3) { 
RDebugUtils.currentLine=6357020;
 //BA.debugLineNum = 6357020;BA.debugLine="pnlHolder.AddView(lblLoginScreen,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblloginscreen.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }}}}
;
RDebugUtils.currentLine=6357022;
 //BA.debugLineNum = 6357022;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Private lblAppSettings As Label";
_lblappsettings = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Private lblMyOrders As Label";
_lblmyorders = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Private lblShoppingCart As Label";
_lblshoppingcart = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Private lblLoginScreen As Label";
_lblloginscreen = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="Private pnlHolder As Panel";
_pnlholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="Private flag As Int";
_flag = 0;
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="End Sub";
return "";
}
public String  _loginscreen_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "loginscreen_click"))
	 {return ((String) Debug.delegate(ba, "loginscreen_click", null));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub LoginScreen_Click";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="End Sub";
return "";
}
public String  _myorders_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "myorders_click"))
	 {return ((String) Debug.delegate(ba, "myorders_click", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub MyOrders_Click";
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="CallSub(Main,\"ShowClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowClientOrdersScreen");
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="CallSub(Main,\"HideMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideMainScreen");
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="End Sub";
return "";
}
public String  _shoppingcart_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "shoppingcart_click"))
	 {return ((String) Debug.delegate(ba, "shoppingcart_click", null));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub ShoppingCart_Click";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMainScreen");
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="CallSub(Main,\"HideClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideClientOrdersScreen");
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="End Sub";
return "";
}
}