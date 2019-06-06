package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class orderscart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.orderscart");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.orderscart.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _cartpan = null;
public anywheresoftware.b4a.objects.PanelWrapper _pblbase = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlheader = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _orderlist = null;
public anywheresoftware.b4a.objects.collections.Map _customerorders = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _addorder(b4a.diplomna.orderscart __ref,b4a.diplomna.types._order _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "addorder", false))
	 {return ((String) Debug.delegate(ba, "addorder", new Object[] {_o}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub AddOrder(o As Order)";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="CustomerOrders.Put(o.OrderCode,o)";
__ref._customerorders.Put((Object)(_o.OrderCode),(Object)(_o));
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="End Sub";
return null;
}
public String  _buildcart(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "buildcart", false))
	 {return ((String) Debug.delegate(ba, "buildcart", null));}
int _row = 0;
b4a.diplomna.types._order _o = null;
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _ordercode = null;
anywheresoftware.b4a.objects.LabelWrapper _orderprice = null;
anywheresoftware.b4a.objects.LabelWrapper _orderstatus = null;
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="OrderList.Panel.RemoveAllViews";
__ref._orderlist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="For Each o As Order In CustomerOrders.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customerorders.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_o = (b4a.diplomna.types._order)(group3.Get(index3));
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Log(\"ORDER --------->\")";
__c.LogImpl("48454148","ORDER --------->",0);
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="Private OrderCode,OrderPrice,OrderStatus As Labe";
_ordercode = new anywheresoftware.b4a.objects.LabelWrapper();
_orderprice = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="holder.Initialize(\"OrderPan\")";
_holder.Initialize(ba,"OrderPan");
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="holder.Tag = o.OrderCode";
_holder.setTag((Object)(_o.OrderCode));
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="OrderCode.Initialize(\"\")";
_ordercode.Initialize(ba,"");
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="OrderPrice.Initialize(\"\")";
_orderprice.Initialize(ba,"");
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="OrderStatus.Initialize(\"\")";
_orderstatus.Initialize(ba,"");
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="holder.Color = AppColors.LightGray";
_holder.setColor(_appcolors._lightgray);
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="OrderCode.Text = o.OrderCode";
_ordercode.setText(BA.ObjectToCharSequence(_o.OrderCode));
RDebugUtils.currentLine=8454162;
 //BA.debugLineNum = 8454162;BA.debugLine="OrderCode.TextColor = AppColors.DarkGray";
_ordercode.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=8454163;
 //BA.debugLineNum = 8454163;BA.debugLine="OrderCode.TextSize = 14";
_ordercode.setTextSize((float) (14));
RDebugUtils.currentLine=8454164;
 //BA.debugLineNum = 8454164;BA.debugLine="OrderCode.Gravity = Gravity.CENTER";
_ordercode.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8454166;
 //BA.debugLineNum = 8454166;BA.debugLine="OrderPrice.Text = o.OrderTotalPrice";
_orderprice.setText(BA.ObjectToCharSequence(_o.OrderTotalPrice));
RDebugUtils.currentLine=8454167;
 //BA.debugLineNum = 8454167;BA.debugLine="OrderPrice.TextColor = AppColors.DarkGray";
_orderprice.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=8454168;
 //BA.debugLineNum = 8454168;BA.debugLine="OrderPrice.TextSize = 18";
_orderprice.setTextSize((float) (18));
RDebugUtils.currentLine=8454169;
 //BA.debugLineNum = 8454169;BA.debugLine="OrderPrice.Gravity = Gravity.CENTER";
_orderprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8454171;
 //BA.debugLineNum = 8454171;BA.debugLine="OrderStatus.Text = o.OrderStatus";
_orderstatus.setText(BA.ObjectToCharSequence(_o.OrderStatus));
RDebugUtils.currentLine=8454172;
 //BA.debugLineNum = 8454172;BA.debugLine="OrderStatus.TextColor = AppColors.DarkGray";
_orderstatus.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=8454173;
 //BA.debugLineNum = 8454173;BA.debugLine="OrderStatus.TextSize = 16";
_orderstatus.setTextSize((float) (16));
RDebugUtils.currentLine=8454174;
 //BA.debugLineNum = 8454174;BA.debugLine="OrderStatus.Gravity = Gravity.CENTER";
_orderstatus.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8454176;
 //BA.debugLineNum = 8454176;BA.debugLine="holder.AddView(OrderCode,0,0,40%x,5%y)";
_holder.AddView((android.view.View)(_ordercode.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=8454177;
 //BA.debugLineNum = 8454177;BA.debugLine="holder.AddView(OrderPrice,50%x,OrderCode.Top,Ord";
_holder.AddView((android.view.View)(_orderprice.getObject()),__c.PerXToCurrent((float) (50),ba),_ordercode.getTop(),_ordercode.getWidth(),(int) (_ordercode.getHeight()*2));
RDebugUtils.currentLine=8454178;
 //BA.debugLineNum = 8454178;BA.debugLine="holder.AddView(OrderStatus,OrderCode.Left,OrderC";
_holder.AddView((android.view.View)(_orderstatus.getObject()),_ordercode.getLeft(),(int) (_ordercode.getTop()+_ordercode.getHeight()),_ordercode.getWidth(),_ordercode.getHeight());
RDebugUtils.currentLine=8454180;
 //BA.debugLineNum = 8454180;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=8454181;
 //BA.debugLineNum = 8454181;BA.debugLine="OrderList.Panel.AddView(holder,0,0+(10%y + 1dip)";
__ref._orderlist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._orderlist.getPanel().getWidth(),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=8454184;
 //BA.debugLineNum = 8454184;BA.debugLine="If row < CustomerOrders.Size - 1 Then";
if (_row<__ref._customerorders.getSize()-1) { 
RDebugUtils.currentLine=8454185;
 //BA.debugLineNum = 8454185;BA.debugLine="OrderList.Panel.Height = 20%y + ((10%y + 1dip)*";
__ref._orderlist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (20),ba)+((__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=8454186;
 //BA.debugLineNum = 8454186;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=8454189;
 //BA.debugLineNum = 8454189;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
__ref._cartpan.setColor(_appcolors._fadedblack);
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
__ref._pblbase.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="pnlHeader.Color =  AppColors.FadedDarkRed";
__ref._pnlheader.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="CartPan.AddView(pblBase,0,42%y,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (42),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="CartPan.AddView(OrderList,0%x, 2%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._orderlist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (2),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="End Sub";
return "";
}
public double  _calcorderprice(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.objects.collections.List _goods) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "calcorderprice", false))
	 {return ((Double) Debug.delegate(ba, "calcorderprice", new Object[] {_goods}));}
double _result = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub CalcOrderPrice(Goods As List) As Double";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim result As Double = 0";
_result = 0;
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="For Each g As Good In Goods";
{
final anywheresoftware.b4a.BA.IterableList group2 = _goods;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="result = result + g.Price";
_result = _result+_g.Price;
 }
};
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Public OrderList As ScrollView";
_orderlist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="Public CustomerOrders As Map";
_customerorders = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="CustomerOrders.Initialize";
__ref._customerorders.Initialize();
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="OrderList.Initialize(10%y)";
__ref._orderlist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="End Sub";
return "";
}
public void  _loadcustomerorders(b4a.diplomna.orderscart __ref,int _customerid) throws Exception{
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "loadcustomerorders", false))
	 {Debug.delegate(ba, "loadcustomerorders", new Object[] {_customerid}); return;}
ResumableSub_LoadCustomerOrders rsub = new ResumableSub_LoadCustomerOrders(this,__ref,_customerid);
rsub.resume(ba, null);
}
public static class ResumableSub_LoadCustomerOrders extends BA.ResumableSub {
public ResumableSub_LoadCustomerOrders(b4a.diplomna.orderscart parent,b4a.diplomna.orderscart __ref,int _customerid) {
this.parent = parent;
this.__ref = __ref;
this._customerid = _customerid;
this.__ref = parent;
}
b4a.diplomna.orderscart __ref;
b4a.diplomna.orderscart parent;
int _customerid;
anywheresoftware.b4a.objects.collections.List _orders = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _ordersofcustomer = null;
Object _result = null;
b4a.diplomna.types._order _o = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _orderedgoods = null;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="orderscart";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Dim orders As List";
_orders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="Dim ordersofcustomer As ResumableSub = Main.HTTP.";
_ordersofcustomer = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_ordersofcustomer = parent._main._http._getcustomerorders(null,_customerid);
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Wait For (ordersofcustomer)  Complete (Result As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "orderscart", "loadcustomerorders"), _ordersofcustomer);
this.state = 28;
return;
case 28:
//C
this.state = 1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="CustomerOrders.Clear";
__ref._customerorders.Clear();
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="If Main.HTTP.Output = \"\" Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((parent._main._http._output).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="Log(\"No Customer Orders\")";
parent.__c.LogImpl("48716297","No Customer Orders",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="Log(\"Customer Orders Output:\" & Main.HTTP.Output";
parent.__c.LogImpl("48716299","Customer Orders Output:"+parent._main._http._output,0);
RDebugUtils.currentLine=8716300;
 //BA.debugLineNum = 8716300;BA.debugLine="Try";
if (true) break;

case 6:
//try
this.state = 11;
this.catchState = 10;
this.state = 8;
if (true) break;

case 8:
//C
this.state = 11;
this.catchState = 10;
RDebugUtils.currentLine=8716301;
 //BA.debugLineNum = 8716301;BA.debugLine="orders = JSONSerializations.SerializeCustomerOr";
_orders = parent._jsonserializations._serializecustomerorders(ba,parent._main._http._output);
 if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 0;
RDebugUtils.currentLine=8716303;
 //BA.debugLineNum = 8716303;BA.debugLine="Log(\"error parsing orders\")";
parent.__c.LogImpl("48716303","error parsing orders",0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
;
RDebugUtils.currentLine=8716305;
 //BA.debugLineNum = 8716305;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
 if (true) break;
;
RDebugUtils.currentLine=8716308;
 //BA.debugLineNum = 8716308;BA.debugLine="For Each o As Order In orders";

case 12:
//for
this.state = 27;
group16 = _orders;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 29;
if (true) break;

case 29:
//C
this.state = 27;
if (index16 < groupLen16) {
this.state = 14;
_o = (b4a.diplomna.types._order)(group16.Get(index16));}
if (true) break;

case 30:
//C
this.state = 29;
index16++;
if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=8716310;
 //BA.debugLineNum = 8716310;BA.debugLine="Dim orderedgoods As ResumableSub = Main.HTTP.Get";
_orderedgoods = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_orderedgoods = parent._main._http._getorderedgoods(null,_o.ID);
RDebugUtils.currentLine=8716311;
 //BA.debugLineNum = 8716311;BA.debugLine="Wait For (orderedgoods)  Complete (Result As Obj";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "orderscart", "loadcustomerorders"), _orderedgoods);
this.state = 31;
return;
case 31:
//C
this.state = 15;
_result = (Object) result[1];
;
RDebugUtils.currentLine=8716313;
 //BA.debugLineNum = 8716313;BA.debugLine="If Main.HTTP.Output = \"\" Then";
if (true) break;

case 15:
//if
this.state = 26;
if ((parent._main._http._output).equals("")) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 26;
RDebugUtils.currentLine=8716314;
 //BA.debugLineNum = 8716314;BA.debugLine="Log(\"No Ordered Goods\")";
parent.__c.LogImpl("48716314","No Ordered Goods",0);
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=8716316;
 //BA.debugLineNum = 8716316;BA.debugLine="Log(\"Ordered Goods Output:\" & Main.HTTP.Output)";
parent.__c.LogImpl("48716316","Ordered Goods Output:"+parent._main._http._output,0);
RDebugUtils.currentLine=8716317;
 //BA.debugLineNum = 8716317;BA.debugLine="Try";
if (true) break;

case 20:
//try
this.state = 25;
this.catchState = 24;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 25;
this.catchState = 24;
RDebugUtils.currentLine=8716318;
 //BA.debugLineNum = 8716318;BA.debugLine="o.OrderedGoods = JSONSerializations.SerializeO";
_o.OrderedGoods = parent._jsonserializations._serializeorderedgoods(ba,parent._main._http._output);
 if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
RDebugUtils.currentLine=8716320;
 //BA.debugLineNum = 8716320;BA.debugLine="Log(\"error parsing goods\")";
parent.__c.LogImpl("48716320","error parsing goods",0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
;
RDebugUtils.currentLine=8716322;
 //BA.debugLineNum = 8716322;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
 if (true) break;

case 26:
//C
this.state = 30;
;
RDebugUtils.currentLine=8716325;
 //BA.debugLineNum = 8716325;BA.debugLine="AddOrder(o)";
__ref._addorder(null,_o);
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=8716328;
 //BA.debugLineNum = 8716328;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=8716329;
 //BA.debugLineNum = 8716329;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _orderpan_click(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "orderpan_click", false))
	 {return ((String) Debug.delegate(ba, "orderpan_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
b4a.diplomna.types._order _selectedorder = null;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub OrderPan_Click";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Dim SelectedOrder As Order = CustomerOrders.Get(p";
_selectedorder = (b4a.diplomna.types._order)(__ref._customerorders.Get(_pnl.getTag()));
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="CallSub2(Main,\"ShowOrderInfo\",SelectedOrder)";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"ShowOrderInfo",(Object)(_selectedorder));
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "testwithfakes", false))
	 {return ((String) Debug.delegate(ba, "testwithfakes", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub TestWithFakes";
RDebugUtils.currentLine=8585259;
 //BA.debugLineNum = 8585259;BA.debugLine="End Sub";
return "";
}
}