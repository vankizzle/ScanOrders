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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Return pnlHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pnlholder.getObject()));
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.settingsmenu __ref,anywheresoftware.b4a.BA _ba,int _location) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_location}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub Initialize(Location As Int)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="pnlHolder.initialize(\"MainPan\")";
__ref._pnlholder.Initialize(ba,"MainPan");
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="lblMyOrders.initialize(\"MyOrders\")";
__ref._lblmyorders.Initialize(ba,"MyOrders");
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="lblAppSettings.initialize(\"AppSettings\")";
__ref._lblappsettings.Initialize(ba,"AppSettings");
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="lblShoppingCart.Initialize(\"ShoppingCart\")";
__ref._lblshoppingcart.Initialize(ba,"ShoppingCart");
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="lblLoginScreen.Initialize(\"LoginScreen\")";
__ref._lblloginscreen.Initialize(ba,"LoginScreen");
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="If Location = 0 Then";
if (_location==0) { 
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="flag = 0";
__ref._flag = (int) (0);
 }else 
{RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Else If Location = 1 Then";
if (_location==1) { 
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="flag = 1";
__ref._flag = (int) (1);
 }else 
{RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="else if Location = 2 Then";
if (_location==2) { 
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="flag = 2";
__ref._flag = (int) (2);
 }else 
{RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="else if Location = 3 Then";
if (_location==3) { 
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="flag = 3";
__ref._flag = (int) (3);
 }}}}
;
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="Log(flag)";
__c.LogImpl("42031632",BA.NumberToString(__ref._flag),0);
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="BuildMenu";
__ref._buildmenu(null);
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="End Sub";
return "";
}
public String  _appsettings_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "appsettings_click", false))
	 {return ((String) Debug.delegate(ba, "appsettings_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub AppSettings_Click";
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="CallSub(Main,\"ShowHideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideAppSettingsScreen");
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="End Sub";
return "";
}
public String  _buildmenu(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "buildmenu", false))
	 {return ((String) Debug.delegate(ba, "buildmenu", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub BuildMenu";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="lblAppSettings.Text = \"Settings\"";
__ref._lblappsettings.setText(BA.ObjectToCharSequence("Settings"));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="lblAppSettings.Gravity = Gravity.CENTER";
__ref._lblappsettings.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="lblAppSettings.Color = Colors.LightGray";
__ref._lblappsettings.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="lblAppSettings.TextColor = Colors.Black";
__ref._lblappsettings.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="lblMyOrders.Text = \"My orders\"";
__ref._lblmyorders.setText(BA.ObjectToCharSequence("My orders"));
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="lblMyOrders.Gravity = Gravity.CENTER";
__ref._lblmyorders.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="lblMyOrders.Color = Colors.LightGray";
__ref._lblmyorders.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="lblMyOrders.TextColor = Colors.Black";
__ref._lblmyorders.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="lblShoppingCart.Text = \"Cart\"";
__ref._lblshoppingcart.setText(BA.ObjectToCharSequence("Cart"));
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="lblShoppingCart.Gravity = Gravity.CENTER";
__ref._lblshoppingcart.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="lblShoppingCart.Color = Colors.LightGray";
__ref._lblshoppingcart.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="lblShoppingCart.TextColor = Colors.Black";
__ref._lblshoppingcart.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="lblLoginScreen.Text = \"Login Screen\"";
__ref._lblloginscreen.setText(BA.ObjectToCharSequence("Login Screen"));
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="lblLoginScreen.Gravity = Gravity.CENTER";
__ref._lblloginscreen.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="lblLoginScreen.Color = Colors.LightGray";
__ref._lblloginscreen.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="lblLoginScreen.TextColor = Colors.Black";
__ref._lblloginscreen.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="If flag = 0 Then";
if (__ref._flag==0) { 
RDebugUtils.currentLine=2162710;
 //BA.debugLineNum = 2162710;BA.debugLine="pnlHolder.AddView(lblAppSettings,0,0,20%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblappsettings.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="else if flag = 1 Then";
if (__ref._flag==1) { 
RDebugUtils.currentLine=2162712;
 //BA.debugLineNum = 2162712;BA.debugLine="pnlHolder.AddView(lblMyOrders,0,0,20%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblmyorders.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=2162713;
 //BA.debugLineNum = 2162713;BA.debugLine="else if flag = 2 Then";
if (__ref._flag==2) { 
RDebugUtils.currentLine=2162714;
 //BA.debugLineNum = 2162714;BA.debugLine="pnlHolder.AddView(lblShoppingCart,0,0,20%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblshoppingcart.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=2162715;
 //BA.debugLineNum = 2162715;BA.debugLine="else if flag = 3 Then";
if (__ref._flag==3) { 
RDebugUtils.currentLine=2162716;
 //BA.debugLineNum = 2162716;BA.debugLine="pnlHolder.AddView(lblLoginScreen,0,0,20%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblloginscreen.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 }}}}
;
RDebugUtils.currentLine=2162718;
 //BA.debugLineNum = 2162718;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Private lblAppSettings As Label";
_lblappsettings = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Private lblMyOrders As Label";
_lblmyorders = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Private lblShoppingCart As Label";
_lblshoppingcart = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Private lblLoginScreen As Label";
_lblloginscreen = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Private pnlHolder As Panel";
_pnlholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Private flag As Int";
_flag = 0;
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="End Sub";
return "";
}
public String  _hidesettingswindow(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "hidesettingswindow", false))
	 {return ((String) Debug.delegate(ba, "hidesettingswindow", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub HideSettingsWindow";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="CallSub(Main,\"HideSettingsWindows\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideSettingsWindows");
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public String  _loginscreen_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "loginscreen_click", false))
	 {return ((String) Debug.delegate(ba, "loginscreen_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub LoginScreen_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="End Sub";
return "";
}
public String  _myorders_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "myorders_click", false))
	 {return ((String) Debug.delegate(ba, "myorders_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub MyOrders_Click";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="CallSub(Main,\"ShowClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowClientOrdersScreen");
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="CallSub(Main,\"HideMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideMainScreen");
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="End Sub";
return "";
}
public String  _shoppingcart_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "shoppingcart_click", false))
	 {return ((String) Debug.delegate(ba, "shoppingcart_click", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub ShoppingCart_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMainScreen");
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="CallSub(Main,\"HideClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideClientOrdersScreen");
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="End Sub";
return "";
}
}