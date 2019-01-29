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
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Return pnlHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pnlholder.getObject()));
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.settingsmenu __ref,anywheresoftware.b4a.BA _ba,int _location) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_location}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Initialize(Location As Int)";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="pnlHolder.initialize(\"MainPan\")";
__ref._pnlholder.Initialize(ba,"MainPan");
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="lblMyOrders.initialize(\"MyOrders\")";
__ref._lblmyorders.Initialize(ba,"MyOrders");
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="lblAppSettings.initialize(\"AppSettings\")";
__ref._lblappsettings.Initialize(ba,"AppSettings");
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="lblShoppingCart.Initialize(\"ShoppingCart\")";
__ref._lblshoppingcart.Initialize(ba,"ShoppingCart");
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="lblLoginScreen.Initialize(\"LoginScreen\")";
__ref._lblloginscreen.Initialize(ba,"LoginScreen");
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="If Location = 0 Then";
if (_location==0) { 
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="flag = 0";
__ref._flag = (int) (0);
 }else 
{RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="Else If Location = 1 Then";
if (_location==1) { 
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="flag = 1";
__ref._flag = (int) (1);
 }else 
{RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="else if Location = 2 Then";
if (_location==2) { 
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="flag = 2";
__ref._flag = (int) (2);
 }else 
{RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="else if Location = 3 Then";
if (_location==3) { 
RDebugUtils.currentLine=5373966;
 //BA.debugLineNum = 5373966;BA.debugLine="flag = 3";
__ref._flag = (int) (3);
 }}}}
;
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="Log(flag)";
__c.LogImpl("55373968",BA.NumberToString(__ref._flag),0);
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="BuildMenu";
__ref._buildmenu(null);
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="End Sub";
return "";
}
public String  _appsettings_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "appsettings_click", false))
	 {return ((String) Debug.delegate(ba, "appsettings_click", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub AppSettings_Click";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="CallSub(Main,\"ShowHideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideAppSettingsScreen");
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="End Sub";
return "";
}
public String  _buildmenu(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "buildmenu", false))
	 {return ((String) Debug.delegate(ba, "buildmenu", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub BuildMenu";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="lblAppSettings.Text = \"Settings\"";
__ref._lblappsettings.setText(BA.ObjectToCharSequence("Settings"));
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="lblAppSettings.Gravity = Gravity.CENTER";
__ref._lblappsettings.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="lblAppSettings.Color = Colors.LightGray";
__ref._lblappsettings.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="lblAppSettings.TextColor = Colors.Black";
__ref._lblappsettings.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="lblMyOrders.Text = \"My Orders\"";
__ref._lblmyorders.setText(BA.ObjectToCharSequence("My Orders"));
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="lblMyOrders.Gravity = Gravity.CENTER";
__ref._lblmyorders.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="lblMyOrders.Color = Colors.LightGray";
__ref._lblmyorders.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="lblMyOrders.TextColor = Colors.Black";
__ref._lblmyorders.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="lblShoppingCart.Text = \"Shopping Cart\"";
__ref._lblshoppingcart.setText(BA.ObjectToCharSequence("Shopping Cart"));
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="lblShoppingCart.Gravity = Gravity.CENTER";
__ref._lblshoppingcart.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="lblShoppingCart.Color = Colors.LightGray";
__ref._lblshoppingcart.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="lblShoppingCart.TextColor = Colors.Black";
__ref._lblshoppingcart.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="lblLoginScreen.Text = \"Login Screen\"";
__ref._lblloginscreen.setText(BA.ObjectToCharSequence("Login Screen"));
RDebugUtils.currentLine=5505041;
 //BA.debugLineNum = 5505041;BA.debugLine="lblLoginScreen.Gravity = Gravity.CENTER";
__ref._lblloginscreen.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="lblLoginScreen.Color = Colors.LightGray";
__ref._lblloginscreen.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="lblLoginScreen.TextColor = Colors.Black";
__ref._lblloginscreen.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=5505045;
 //BA.debugLineNum = 5505045;BA.debugLine="If flag = 0 Then";
if (__ref._flag==0) { 
RDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="pnlHolder.AddView(lblAppSettings,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblappsettings.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="else if flag = 1 Then";
if (__ref._flag==1) { 
RDebugUtils.currentLine=5505048;
 //BA.debugLineNum = 5505048;BA.debugLine="pnlHolder.AddView(lblMyOrders,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblmyorders.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=5505049;
 //BA.debugLineNum = 5505049;BA.debugLine="else if flag = 2 Then";
if (__ref._flag==2) { 
RDebugUtils.currentLine=5505050;
 //BA.debugLineNum = 5505050;BA.debugLine="pnlHolder.AddView(lblShoppingCart,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblshoppingcart.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=5505051;
 //BA.debugLineNum = 5505051;BA.debugLine="else if flag = 3 Then";
if (__ref._flag==3) { 
RDebugUtils.currentLine=5505052;
 //BA.debugLineNum = 5505052;BA.debugLine="pnlHolder.AddView(lblLoginScreen,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblloginscreen.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }}}}
;
RDebugUtils.currentLine=5505054;
 //BA.debugLineNum = 5505054;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Private lblAppSettings As Label";
_lblappsettings = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Private lblMyOrders As Label";
_lblmyorders = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="Private lblShoppingCart As Label";
_lblshoppingcart = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Private lblLoginScreen As Label";
_lblloginscreen = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="Private pnlHolder As Panel";
_pnlholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Private flag As Int";
_flag = 0;
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="End Sub";
return "";
}
public String  _hidesettingswindow(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "hidesettingswindow", false))
	 {return ((String) Debug.delegate(ba, "hidesettingswindow", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub HideSettingsWindow";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="CallSub(Main,\"HideSettingsWindows\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideSettingsWindows");
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
public String  _loginscreen_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "loginscreen_click", false))
	 {return ((String) Debug.delegate(ba, "loginscreen_click", null));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub LoginScreen_Click";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="End Sub";
return "";
}
public String  _myorders_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "myorders_click", false))
	 {return ((String) Debug.delegate(ba, "myorders_click", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub MyOrders_Click";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="CallSub(Main,\"ShowClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowClientOrdersScreen");
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="CallSub(Main,\"HideMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideMainScreen");
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="End Sub";
return "";
}
public String  _shoppingcart_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "shoppingcart_click", false))
	 {return ((String) Debug.delegate(ba, "shoppingcart_click", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub ShoppingCart_Click";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMainScreen");
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="CallSub(Main,\"HideClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideClientOrdersScreen");
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="End Sub";
return "";
}
}