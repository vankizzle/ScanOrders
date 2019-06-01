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
public b4a.diplomna.support _support = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
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
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub AddOrder(o As Order)";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="CustomerOrders.Put(o.OrderCode,o)";
__ref._customerorders.Put((Object)(_o.OrderCode),(Object)(_o));
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="OrderList.Panel.RemoveAllViews";
__ref._orderlist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="For Each o As Order In CustomerOrders.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customerorders.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_o = (b4a.diplomna.types._order)(group3.Get(index3));
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Log(\"ORDER --------->\")";
__c.LogImpl("19502724","ORDER --------->",0);
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="Private OrderCode,OrderPrice,OrderStatus As Labe";
_ordercode = new anywheresoftware.b4a.objects.LabelWrapper();
_orderprice = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="holder.Initialize(\"OrderPan\")";
_holder.Initialize(ba,"OrderPan");
RDebugUtils.currentLine=9502729;
 //BA.debugLineNum = 9502729;BA.debugLine="holder.Tag = o.OrderCode";
_holder.setTag((Object)(_o.OrderCode));
RDebugUtils.currentLine=9502730;
 //BA.debugLineNum = 9502730;BA.debugLine="OrderCode.Initialize(\"\")";
_ordercode.Initialize(ba,"");
RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="OrderPrice.Initialize(\"\")";
_orderprice.Initialize(ba,"");
RDebugUtils.currentLine=9502732;
 //BA.debugLineNum = 9502732;BA.debugLine="OrderStatus.Initialize(\"\")";
_orderstatus.Initialize(ba,"");
RDebugUtils.currentLine=9502734;
 //BA.debugLineNum = 9502734;BA.debugLine="holder.Color = AppColors.LightGray";
_holder.setColor(_appcolors._lightgray);
RDebugUtils.currentLine=9502736;
 //BA.debugLineNum = 9502736;BA.debugLine="OrderCode.Text = o.OrderCode";
_ordercode.setText(BA.ObjectToCharSequence(_o.OrderCode));
RDebugUtils.currentLine=9502738;
 //BA.debugLineNum = 9502738;BA.debugLine="OrderCode.TextColor = AppColors.DarkGray";
_ordercode.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=9502739;
 //BA.debugLineNum = 9502739;BA.debugLine="OrderCode.TextSize = 14";
_ordercode.setTextSize((float) (14));
RDebugUtils.currentLine=9502740;
 //BA.debugLineNum = 9502740;BA.debugLine="OrderCode.Gravity = Gravity.CENTER";
_ordercode.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=9502742;
 //BA.debugLineNum = 9502742;BA.debugLine="OrderPrice.Text = o.OrderTotalPrice";
_orderprice.setText(BA.ObjectToCharSequence(_o.OrderTotalPrice));
RDebugUtils.currentLine=9502743;
 //BA.debugLineNum = 9502743;BA.debugLine="OrderPrice.TextColor = AppColors.DarkGray";
_orderprice.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=9502744;
 //BA.debugLineNum = 9502744;BA.debugLine="OrderPrice.TextSize = 18";
_orderprice.setTextSize((float) (18));
RDebugUtils.currentLine=9502745;
 //BA.debugLineNum = 9502745;BA.debugLine="OrderPrice.Gravity = Gravity.CENTER";
_orderprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=9502747;
 //BA.debugLineNum = 9502747;BA.debugLine="OrderStatus.Text = o.OrderStatus";
_orderstatus.setText(BA.ObjectToCharSequence(_o.OrderStatus));
RDebugUtils.currentLine=9502748;
 //BA.debugLineNum = 9502748;BA.debugLine="OrderStatus.TextColor = AppColors.DarkGray";
_orderstatus.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=9502749;
 //BA.debugLineNum = 9502749;BA.debugLine="OrderStatus.TextSize = 16";
_orderstatus.setTextSize((float) (16));
RDebugUtils.currentLine=9502750;
 //BA.debugLineNum = 9502750;BA.debugLine="OrderStatus.Gravity = Gravity.CENTER";
_orderstatus.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=9502752;
 //BA.debugLineNum = 9502752;BA.debugLine="holder.AddView(OrderCode,0,0,40%x,5%y)";
_holder.AddView((android.view.View)(_ordercode.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=9502753;
 //BA.debugLineNum = 9502753;BA.debugLine="holder.AddView(OrderPrice,50%x,OrderCode.Top,Ord";
_holder.AddView((android.view.View)(_orderprice.getObject()),__c.PerXToCurrent((float) (50),ba),_ordercode.getTop(),_ordercode.getWidth(),(int) (_ordercode.getHeight()*2));
RDebugUtils.currentLine=9502754;
 //BA.debugLineNum = 9502754;BA.debugLine="holder.AddView(OrderStatus,OrderCode.Left,OrderC";
_holder.AddView((android.view.View)(_orderstatus.getObject()),_ordercode.getLeft(),(int) (_ordercode.getTop()+_ordercode.getHeight()),_ordercode.getWidth(),_ordercode.getHeight());
RDebugUtils.currentLine=9502756;
 //BA.debugLineNum = 9502756;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=9502757;
 //BA.debugLineNum = 9502757;BA.debugLine="OrderList.Panel.AddView(holder,0,0+(10%y + 1dip)";
__ref._orderlist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._orderlist.getPanel().getWidth(),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=9502760;
 //BA.debugLineNum = 9502760;BA.debugLine="If row < CustomerOrders.Size - 1 Then";
if (_row<__ref._customerorders.getSize()-1) { 
RDebugUtils.currentLine=9502761;
 //BA.debugLineNum = 9502761;BA.debugLine="OrderList.Panel.Height = 20%y + ((10%y + 1dip)*";
__ref._orderlist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (20),ba)+((__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=9502762;
 //BA.debugLineNum = 9502762;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=9502765;
 //BA.debugLineNum = 9502765;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
__ref._cartpan.setColor(_appcolors._fadedblack);
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
__ref._pblbase.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="pnlHeader.Color =  AppColors.FadedDarkRed";
__ref._pnlheader.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="CartPan.AddView(pblBase,0,42%y,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (42),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="CartPan.AddView(OrderList,0%x, 2%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._orderlist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (2),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="End Sub";
return "";
}
public double  _calcorderprice(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.objects.collections.List _goods) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "calcorderprice", false))
	 {return ((Double) Debug.delegate(ba, "calcorderprice", new Object[] {_goods}));}
double _result = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub CalcOrderPrice(Goods As List) As Double";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim result As Double = 0";
_result = 0;
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="For Each g As Good In Goods";
{
final anywheresoftware.b4a.BA.IterableList group2 = _goods;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="result = result + g.Price";
_result = _result+_g.Price;
 }
};
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Public OrderList As ScrollView";
_orderlist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Public CustomerOrders As Map";
_customerorders = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="CustomerOrders.Initialize";
__ref._customerorders.Initialize();
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="OrderList.Initialize(10%y)";
__ref._orderlist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim orders As List";
_orders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Dim ordersofcustomer As ResumableSub = Main.HTTP.";
_ordersofcustomer = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_ordersofcustomer = parent._main._http._getcustomerorders(null,_customerid);
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Wait For (ordersofcustomer)  Complete (Result As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "orderscart", "loadcustomerorders"), _ordersofcustomer);
this.state = 28;
return;
case 28:
//C
this.state = 1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="CustomerOrders.Clear";
__ref._customerorders.Clear();
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="If Main.HTTP.Output = \"\" Then";
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
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="Log(\"No Customer Orders\")";
parent.__c.LogImpl("19764873","No Customer Orders",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="Log(\"Customer Orders Output:\" & Main.HTTP.Output";
parent.__c.LogImpl("19764875","Customer Orders Output:"+parent._main._http._output,0);
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="Try";
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
RDebugUtils.currentLine=9764877;
 //BA.debugLineNum = 9764877;BA.debugLine="orders = JSONSerializations.SerializeCustomerOr";
_orders = parent._jsonserializations._serializecustomerorders(ba,parent._main._http._output);
 if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 0;
RDebugUtils.currentLine=9764879;
 //BA.debugLineNum = 9764879;BA.debugLine="Log(\"error parsing orders\")";
parent.__c.LogImpl("19764879","error parsing orders",0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
;
RDebugUtils.currentLine=9764881;
 //BA.debugLineNum = 9764881;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
 if (true) break;
;
RDebugUtils.currentLine=9764884;
 //BA.debugLineNum = 9764884;BA.debugLine="For Each o As Order In orders";

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
RDebugUtils.currentLine=9764886;
 //BA.debugLineNum = 9764886;BA.debugLine="Dim orderedgoods As ResumableSub = Main.HTTP.Get";
_orderedgoods = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_orderedgoods = parent._main._http._getorderedgoods(null,_o.ID);
RDebugUtils.currentLine=9764887;
 //BA.debugLineNum = 9764887;BA.debugLine="Wait For (orderedgoods)  Complete (Result As Obj";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "orderscart", "loadcustomerorders"), _orderedgoods);
this.state = 31;
return;
case 31:
//C
this.state = 15;
_result = (Object) result[1];
;
RDebugUtils.currentLine=9764889;
 //BA.debugLineNum = 9764889;BA.debugLine="If Main.HTTP.Output = \"\" Then";
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
RDebugUtils.currentLine=9764890;
 //BA.debugLineNum = 9764890;BA.debugLine="Log(\"No Ordered Goods\")";
parent.__c.LogImpl("19764890","No Ordered Goods",0);
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=9764892;
 //BA.debugLineNum = 9764892;BA.debugLine="Log(\"Ordered Goods Output:\" & Main.HTTP.Output)";
parent.__c.LogImpl("19764892","Ordered Goods Output:"+parent._main._http._output,0);
RDebugUtils.currentLine=9764893;
 //BA.debugLineNum = 9764893;BA.debugLine="Try";
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
RDebugUtils.currentLine=9764894;
 //BA.debugLineNum = 9764894;BA.debugLine="o.OrderedGoods = JSONSerializations.SerializeO";
_o.OrderedGoods = parent._jsonserializations._serializeorderedgoods(ba,parent._main._http._output);
 if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
RDebugUtils.currentLine=9764896;
 //BA.debugLineNum = 9764896;BA.debugLine="Log(\"error parsing goods\")";
parent.__c.LogImpl("19764896","error parsing goods",0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
;
RDebugUtils.currentLine=9764898;
 //BA.debugLineNum = 9764898;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
 if (true) break;

case 26:
//C
this.state = 30;
;
RDebugUtils.currentLine=9764901;
 //BA.debugLineNum = 9764901;BA.debugLine="AddOrder(o)";
__ref._addorder(null,_o);
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=9764904;
 //BA.debugLineNum = 9764904;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=9764905;
 //BA.debugLineNum = 9764905;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub OrderPan_Click";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Dim SelectedOrder As Order = CustomerOrders.Get(p";
_selectedorder = (b4a.diplomna.types._order)(__ref._customerorders.Get(_pnl.getTag()));
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="CallSub2(Main,\"ShowOrderInfo\",SelectedOrder)";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"ShowOrderInfo",(Object)(_selectedorder));
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "testwithfakes", false))
	 {return ((String) Debug.delegate(ba, "testwithfakes", null));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub TestWithFakes";
RDebugUtils.currentLine=9633835;
 //BA.debugLineNum = 9633835;BA.debugLine="End Sub";
return "";
}
}