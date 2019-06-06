package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class orderscart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.orderscart");
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
public String  _addorder(b4a.diplomna.types._order _o) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub AddOrder(o As Order)";
 //BA.debugLineNum = 29;BA.debugLine="CustomerOrders.Put(o.OrderCode,o)";
_customerorders.Put((Object)(_o.OrderCode),(Object)(_o));
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 33;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_cartpan.getObject()));
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public String  _buildcart() throws Exception{
int _row = 0;
b4a.diplomna.types._order _o = null;
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _ordercode = null;
anywheresoftware.b4a.objects.LabelWrapper _orderprice = null;
anywheresoftware.b4a.objects.LabelWrapper _orderstatus = null;
 //BA.debugLineNum = 36;BA.debugLine="Public Sub BuildCart";
 //BA.debugLineNum = 37;BA.debugLine="OrderList.Panel.RemoveAllViews";
_orderlist.getPanel().RemoveAllViews();
 //BA.debugLineNum = 38;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
 //BA.debugLineNum = 39;BA.debugLine="For Each o As Order In CustomerOrders.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _customerorders.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_o = (b4a.diplomna.types._order)(group3.Get(index3));
 //BA.debugLineNum = 40;BA.debugLine="Log(\"ORDER --------->\")";
__c.LogImpl("010747908","ORDER --------->",0);
 //BA.debugLineNum = 41;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private OrderCode,OrderPrice,OrderStatus As Labe";
_ordercode = new anywheresoftware.b4a.objects.LabelWrapper();
_orderprice = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatus = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="holder.Initialize(\"OrderPan\")";
_holder.Initialize(ba,"OrderPan");
 //BA.debugLineNum = 45;BA.debugLine="holder.Tag = o.OrderCode";
_holder.setTag((Object)(_o.OrderCode));
 //BA.debugLineNum = 46;BA.debugLine="OrderCode.Initialize(\"\")";
_ordercode.Initialize(ba,"");
 //BA.debugLineNum = 47;BA.debugLine="OrderPrice.Initialize(\"\")";
_orderprice.Initialize(ba,"");
 //BA.debugLineNum = 48;BA.debugLine="OrderStatus.Initialize(\"\")";
_orderstatus.Initialize(ba,"");
 //BA.debugLineNum = 50;BA.debugLine="holder.Color = AppColors.LightGray";
_holder.setColor(_appcolors._lightgray);
 //BA.debugLineNum = 52;BA.debugLine="OrderCode.Text = o.OrderCode";
_ordercode.setText(BA.ObjectToCharSequence(_o.OrderCode));
 //BA.debugLineNum = 54;BA.debugLine="OrderCode.TextColor = AppColors.DarkGray";
_ordercode.setTextColor(_appcolors._darkgray);
 //BA.debugLineNum = 55;BA.debugLine="OrderCode.TextSize = 14";
_ordercode.setTextSize((float) (14));
 //BA.debugLineNum = 56;BA.debugLine="OrderCode.Gravity = Gravity.CENTER";
_ordercode.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 58;BA.debugLine="OrderPrice.Text = o.OrderTotalPrice";
_orderprice.setText(BA.ObjectToCharSequence(_o.OrderTotalPrice));
 //BA.debugLineNum = 59;BA.debugLine="OrderPrice.TextColor = AppColors.DarkGray";
_orderprice.setTextColor(_appcolors._darkgray);
 //BA.debugLineNum = 60;BA.debugLine="OrderPrice.TextSize = 18";
_orderprice.setTextSize((float) (18));
 //BA.debugLineNum = 61;BA.debugLine="OrderPrice.Gravity = Gravity.CENTER";
_orderprice.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 63;BA.debugLine="OrderStatus.Text = o.OrderStatus";
_orderstatus.setText(BA.ObjectToCharSequence(_o.OrderStatus));
 //BA.debugLineNum = 64;BA.debugLine="OrderStatus.TextColor = AppColors.DarkGray";
_orderstatus.setTextColor(_appcolors._darkgray);
 //BA.debugLineNum = 65;BA.debugLine="OrderStatus.TextSize = 16";
_orderstatus.setTextSize((float) (16));
 //BA.debugLineNum = 66;BA.debugLine="OrderStatus.Gravity = Gravity.CENTER";
_orderstatus.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 68;BA.debugLine="holder.AddView(OrderCode,0,0,40%x,5%y)";
_holder.AddView((android.view.View)(_ordercode.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 69;BA.debugLine="holder.AddView(OrderPrice,50%x,OrderCode.Top,Ord";
_holder.AddView((android.view.View)(_orderprice.getObject()),__c.PerXToCurrent((float) (50),ba),_ordercode.getTop(),_ordercode.getWidth(),(int) (_ordercode.getHeight()*2));
 //BA.debugLineNum = 70;BA.debugLine="holder.AddView(OrderStatus,OrderCode.Left,OrderC";
_holder.AddView((android.view.View)(_orderstatus.getObject()),_ordercode.getLeft(),(int) (_ordercode.getTop()+_ordercode.getHeight()),_ordercode.getWidth(),_ordercode.getHeight());
 //BA.debugLineNum = 72;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
 //BA.debugLineNum = 73;BA.debugLine="OrderList.Panel.AddView(holder,0,0+(10%y + 1dip)";
_orderlist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row),_orderlist.getPanel().getWidth(),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 76;BA.debugLine="If row < CustomerOrders.Size - 1 Then";
if (_row<_customerorders.getSize()-1) { 
 //BA.debugLineNum = 77;BA.debugLine="OrderList.Panel.Height = 20%y + ((10%y + 1dip)*";
_orderlist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (20),ba)+((__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row)));
 //BA.debugLineNum = 78;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Public Sub BuildUI";
 //BA.debugLineNum = 19;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
_cartpan.setColor(_appcolors._fadedblack);
 //BA.debugLineNum = 20;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
_pblbase.setColor(_appcolors._fadeddarkred);
 //BA.debugLineNum = 21;BA.debugLine="pnlHeader.Color =  AppColors.FadedDarkRed";
_pnlheader.setColor(_appcolors._fadeddarkred);
 //BA.debugLineNum = 23;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,2%y)";
_cartpan.AddView((android.view.View)(_pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
 //BA.debugLineNum = 24;BA.debugLine="CartPan.AddView(pblBase,0,42%y,90%x,2%y)";
_cartpan.AddView((android.view.View)(_pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (42),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
 //BA.debugLineNum = 25;BA.debugLine="CartPan.AddView(OrderList,0%x, 2%y,100%x,40%y)";
_cartpan.AddView((android.view.View)(_orderlist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (2),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public double  _calcorderprice(anywheresoftware.b4a.objects.collections.List _goods) throws Exception{
double _result = 0;
b4a.diplomna.types._good _g = null;
 //BA.debugLineNum = 135;BA.debugLine="Public Sub CalcOrderPrice(Goods As List) As Double";
 //BA.debugLineNum = 136;BA.debugLine="Dim result As Double = 0";
_result = 0;
 //BA.debugLineNum = 137;BA.debugLine="For Each g As Good In Goods";
{
final anywheresoftware.b4a.BA.IterableList group2 = _goods;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
 //BA.debugLineNum = 138;BA.debugLine="result = result + g.Price";
_result = _result+_g.Price;
 }
};
 //BA.debugLineNum = 140;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Public OrderList As ScrollView";
_orderlist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Public CustomerOrders As Map";
_customerorders = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="CartPan.Initialize(\"\")";
_cartpan.Initialize(ba,"");
 //BA.debugLineNum = 11;BA.debugLine="pblBase.Initialize(\"\")";
_pblbase.Initialize(ba,"");
 //BA.debugLineNum = 12;BA.debugLine="pnlHeader.Initialize(\"\")";
_pnlheader.Initialize(ba,"");
 //BA.debugLineNum = 13;BA.debugLine="CustomerOrders.Initialize";
_customerorders.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="OrderList.Initialize(10%y)";
_orderlist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 15;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public void  _loadcustomerorders(int _customerid) throws Exception{
ResumableSub_LoadCustomerOrders rsub = new ResumableSub_LoadCustomerOrders(this,_customerid);
rsub.resume(ba, null);
}
public static class ResumableSub_LoadCustomerOrders extends BA.ResumableSub {
public ResumableSub_LoadCustomerOrders(b4a.diplomna.orderscart parent,int _customerid) {
this.parent = parent;
this._customerid = _customerid;
}
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 144;BA.debugLine="Dim orders As List";
_orders = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 145;BA.debugLine="Dim ordersofcustomer As ResumableSub = Main.HTTP.";
_ordersofcustomer = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_ordersofcustomer = parent._main._http._getcustomerorders(_customerid);
 //BA.debugLineNum = 147;BA.debugLine="Wait For (ordersofcustomer)  Complete (Result As";
parent.__c.WaitFor("complete", ba, this, _ordersofcustomer);
this.state = 28;
return;
case 28:
//C
this.state = 1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 149;BA.debugLine="CustomerOrders.Clear";
parent._customerorders.Clear();
 //BA.debugLineNum = 151;BA.debugLine="If Main.HTTP.Output = \"\" Then";
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
 //BA.debugLineNum = 152;BA.debugLine="Log(\"No Customer Orders\")";
parent.__c.LogImpl("011010057","No Customer Orders",0);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 154;BA.debugLine="Log(\"Customer Orders Output:\" & Main.HTTP.Output";
parent.__c.LogImpl("011010059","Customer Orders Output:"+parent._main._http._output,0);
 //BA.debugLineNum = 155;BA.debugLine="Try";
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
 //BA.debugLineNum = 156;BA.debugLine="orders = JSONSerializations.SerializeCustomerOr";
_orders = parent._jsonserializations._serializecustomerorders(ba,parent._main._http._output);
 if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 0;
 //BA.debugLineNum = 158;BA.debugLine="Log(\"error parsing orders\")";
parent.__c.LogImpl("011010063","error parsing orders",0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
;
 //BA.debugLineNum = 160;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput();
 if (true) break;
;
 //BA.debugLineNum = 163;BA.debugLine="For Each o As Order In orders";

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
 //BA.debugLineNum = 165;BA.debugLine="Dim orderedgoods As ResumableSub = Main.HTTP.Get";
_orderedgoods = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_orderedgoods = parent._main._http._getorderedgoods(_o.ID);
 //BA.debugLineNum = 166;BA.debugLine="Wait For (orderedgoods)  Complete (Result As Obj";
parent.__c.WaitFor("complete", ba, this, _orderedgoods);
this.state = 31;
return;
case 31:
//C
this.state = 15;
_result = (Object) result[0];
;
 //BA.debugLineNum = 168;BA.debugLine="If Main.HTTP.Output = \"\" Then";
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
 //BA.debugLineNum = 169;BA.debugLine="Log(\"No Ordered Goods\")";
parent.__c.LogImpl("011010074","No Ordered Goods",0);
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 171;BA.debugLine="Log(\"Ordered Goods Output:\" & Main.HTTP.Output)";
parent.__c.LogImpl("011010076","Ordered Goods Output:"+parent._main._http._output,0);
 //BA.debugLineNum = 172;BA.debugLine="Try";
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
 //BA.debugLineNum = 173;BA.debugLine="o.OrderedGoods = JSONSerializations.SerializeO";
_o.OrderedGoods = parent._jsonserializations._serializeorderedgoods(ba,parent._main._http._output);
 if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
 //BA.debugLineNum = 175;BA.debugLine="Log(\"error parsing goods\")";
parent.__c.LogImpl("011010080","error parsing goods",0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
;
 //BA.debugLineNum = 177;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput();
 if (true) break;

case 26:
//C
this.state = 30;
;
 //BA.debugLineNum = 180;BA.debugLine="AddOrder(o)";
parent._addorder(_o);
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
;
 //BA.debugLineNum = 183;BA.debugLine="BuildCart";
parent._buildcart();
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
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
public void  _complete(Object _result) throws Exception{
}
public String  _orderpan_click() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
b4a.diplomna.types._order _selectedorder = null;
 //BA.debugLineNum = 83;BA.debugLine="Public Sub OrderPan_Click";
 //BA.debugLineNum = 84;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 85;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
 //BA.debugLineNum = 86;BA.debugLine="Dim SelectedOrder As Order = CustomerOrders.Get(p";
_selectedorder = (b4a.diplomna.types._order)(_customerorders.Get(_pnl.getTag()));
 //BA.debugLineNum = 87;BA.debugLine="CallSub2(Main,\"ShowOrderInfo\",SelectedOrder)";
__c.CallSubNew2(ba,(Object)(_main.getObject()),"ShowOrderInfo",(Object)(_selectedorder));
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub TestWithFakes";
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
