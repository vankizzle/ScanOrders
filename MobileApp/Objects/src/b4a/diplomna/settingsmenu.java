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
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Return pnlHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pnlholder.getObject()));
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.settingsmenu __ref,anywheresoftware.b4a.BA _ba,int _location) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_location}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub Initialize(Location As Int)";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="pnlHolder.initialize(\"MainPan\")";
__ref._pnlholder.Initialize(ba,"MainPan");
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="lblMyOrders.initialize(\"MyOrders\")";
__ref._lblmyorders.Initialize(ba,"MyOrders");
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="lblAppSettings.initialize(\"AppSettings\")";
__ref._lblappsettings.Initialize(ba,"AppSettings");
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="lblShoppingCart.Initialize(\"ShoppingCart\")";
__ref._lblshoppingcart.Initialize(ba,"ShoppingCart");
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="lblLoginScreen.Initialize(\"LoginScreen\")";
__ref._lblloginscreen.Initialize(ba,"LoginScreen");
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="If Location = 0 Then";
if (_location==0) { 
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="flag = 0";
__ref._flag = (int) (0);
 }else 
{RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="Else If Location = 1 Then";
if (_location==1) { 
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="flag = 1";
__ref._flag = (int) (1);
 }else 
{RDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="else if Location = 2 Then";
if (_location==2) { 
RDebugUtils.currentLine=10616844;
 //BA.debugLineNum = 10616844;BA.debugLine="flag = 2";
__ref._flag = (int) (2);
 }else 
{RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="else if Location = 3 Then";
if (_location==3) { 
RDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="flag = 3";
__ref._flag = (int) (3);
 }}}}
;
RDebugUtils.currentLine=10616848;
 //BA.debugLineNum = 10616848;BA.debugLine="Log(flag)";
__c.LogImpl("410616848",BA.NumberToString(__ref._flag),0);
RDebugUtils.currentLine=10616849;
 //BA.debugLineNum = 10616849;BA.debugLine="BuildMenu";
__ref._buildmenu(null);
RDebugUtils.currentLine=10616850;
 //BA.debugLineNum = 10616850;BA.debugLine="End Sub";
return "";
}
public String  _appsettings_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "appsettings_click", false))
	 {return ((String) Debug.delegate(ba, "appsettings_click", null));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub AppSettings_Click";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="CallSub(Main,\"ShowHideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideAppSettingsScreen");
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="End Sub";
return "";
}
public String  _buildmenu(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "buildmenu", false))
	 {return ((String) Debug.delegate(ba, "buildmenu", null));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub BuildMenu";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="lblAppSettings.Text = \"Settings\"";
__ref._lblappsettings.setText(BA.ObjectToCharSequence("Settings"));
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="lblAppSettings.Gravity = Gravity.CENTER";
__ref._lblappsettings.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="lblAppSettings.Color = Colors.LightGray";
__ref._lblappsettings.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="lblAppSettings.TextColor = Colors.Black";
__ref._lblappsettings.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="lblMyOrders.Text = \"My Orders\"";
__ref._lblmyorders.setText(BA.ObjectToCharSequence("My Orders"));
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="lblMyOrders.Gravity = Gravity.CENTER";
__ref._lblmyorders.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="lblMyOrders.Color = Colors.LightGray";
__ref._lblmyorders.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="lblMyOrders.TextColor = Colors.Black";
__ref._lblmyorders.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="lblShoppingCart.Text = \"Shopping Cart\"";
__ref._lblshoppingcart.setText(BA.ObjectToCharSequence("Shopping Cart"));
RDebugUtils.currentLine=10747916;
 //BA.debugLineNum = 10747916;BA.debugLine="lblShoppingCart.Gravity = Gravity.CENTER";
__ref._lblshoppingcart.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10747917;
 //BA.debugLineNum = 10747917;BA.debugLine="lblShoppingCart.Color = Colors.LightGray";
__ref._lblshoppingcart.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="lblShoppingCart.TextColor = Colors.Black";
__ref._lblshoppingcart.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="lblLoginScreen.Text = \"Login Screen\"";
__ref._lblloginscreen.setText(BA.ObjectToCharSequence("Login Screen"));
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="lblLoginScreen.Gravity = Gravity.CENTER";
__ref._lblloginscreen.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10747922;
 //BA.debugLineNum = 10747922;BA.debugLine="lblLoginScreen.Color = Colors.LightGray";
__ref._lblloginscreen.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=10747923;
 //BA.debugLineNum = 10747923;BA.debugLine="lblLoginScreen.TextColor = Colors.Black";
__ref._lblloginscreen.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=10747925;
 //BA.debugLineNum = 10747925;BA.debugLine="If flag = 0 Then";
if (__ref._flag==0) { 
RDebugUtils.currentLine=10747926;
 //BA.debugLineNum = 10747926;BA.debugLine="pnlHolder.AddView(lblAppSettings,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblappsettings.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=10747927;
 //BA.debugLineNum = 10747927;BA.debugLine="else if flag = 1 Then";
if (__ref._flag==1) { 
RDebugUtils.currentLine=10747928;
 //BA.debugLineNum = 10747928;BA.debugLine="pnlHolder.AddView(lblMyOrders,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblmyorders.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=10747929;
 //BA.debugLineNum = 10747929;BA.debugLine="else if flag = 2 Then";
if (__ref._flag==2) { 
RDebugUtils.currentLine=10747930;
 //BA.debugLineNum = 10747930;BA.debugLine="pnlHolder.AddView(lblShoppingCart,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblshoppingcart.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }else 
{RDebugUtils.currentLine=10747931;
 //BA.debugLineNum = 10747931;BA.debugLine="else if flag = 3 Then";
if (__ref._flag==3) { 
RDebugUtils.currentLine=10747932;
 //BA.debugLineNum = 10747932;BA.debugLine="pnlHolder.AddView(lblLoginScreen,0,0,15%x,5%y)";
__ref._pnlholder.AddView((android.view.View)(__ref._lblloginscreen.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (5),ba));
 }}}}
;
RDebugUtils.currentLine=10747934;
 //BA.debugLineNum = 10747934;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Private lblAppSettings As Label";
_lblappsettings = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="Private lblMyOrders As Label";
_lblmyorders = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Private lblShoppingCart As Label";
_lblshoppingcart = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="Private lblLoginScreen As Label";
_lblloginscreen = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="Private pnlHolder As Panel";
_pnlholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Private flag As Int";
_flag = 0;
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="End Sub";
return "";
}
public String  _hidesettingswindow(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "hidesettingswindow", false))
	 {return ((String) Debug.delegate(ba, "hidesettingswindow", null));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub HideSettingsWindow";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="CallSub(Main,\"HideSettingsWindows\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideSettingsWindows");
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="End Sub";
return "";
}
public String  _loginscreen_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "loginscreen_click", false))
	 {return ((String) Debug.delegate(ba, "loginscreen_click", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub LoginScreen_Click";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="End Sub";
return "";
}
public String  _myorders_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "myorders_click", false))
	 {return ((String) Debug.delegate(ba, "myorders_click", null));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Public Sub MyOrders_Click";
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="CallSub(Main,\"ShowClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowClientOrdersScreen");
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="CallSub(Main,\"HideMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideMainScreen");
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="End Sub";
return "";
}
public String  _shoppingcart_click(b4a.diplomna.settingsmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="settingsmenu";
if (Debug.shouldDelegate(ba, "shoppingcart_click", false))
	 {return ((String) Debug.delegate(ba, "shoppingcart_click", null));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub ShoppingCart_Click";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMainScreen");
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="CallSub(Main,\"HideClientOrdersScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideClientOrdersScreen");
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="CallSub(Main,\"HideAppSettingsScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"HideAppSettingsScreen");
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="HideSettingsWindow";
__ref._hidesettingswindow(null);
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="End Sub";
return "";
}
}