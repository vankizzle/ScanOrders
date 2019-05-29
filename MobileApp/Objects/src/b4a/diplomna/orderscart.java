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
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.uisizes _uisizes = null;
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
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub AddOrder(o As Order)";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="CustomerOrders.Put(o.OrderCode,o)";
__ref._customerorders.Put((Object)(_o.OrderCode),(Object)(_o));
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="OrderList.Panel.RemoveAllViews";
__ref._orderlist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="For Each o As Order In CustomerOrders.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customerorders.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_o = (b4a.diplomna.types._order)(group3.Get(index3));
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Private OrderCode,OrderPrice,OrderStatus As Labe";
_ordercode = new anywheresoftware.b4a.objects.LabelWrapper();
_orderprice = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="holder.Initialize(\"OrderPan\")";
_holder.Initialize(ba,"OrderPan");
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="holder.Tag = o.OrderCode";
_holder.setTag((Object)(_o.OrderCode));
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="OrderCode.Initialize(\"\")";
_ordercode.Initialize(ba,"");
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="OrderPrice.Initialize(\"\")";
_orderprice.Initialize(ba,"");
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="OrderStatus.Initialize(\"\")";
_orderstatus.Initialize(ba,"");
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="holder.Color = AppColors.LightGray";
_holder.setColor(_appcolors._lightgray);
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="OrderCode.Text = o.OrderCode";
_ordercode.setText(BA.ObjectToCharSequence(_o.OrderCode));
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="OrderCode.TextColor = AppColors.DarkGray";
_ordercode.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=4915217;
 //BA.debugLineNum = 4915217;BA.debugLine="OrderCode.TextSize = 16";
_ordercode.setTextSize((float) (16));
RDebugUtils.currentLine=4915218;
 //BA.debugLineNum = 4915218;BA.debugLine="OrderCode.Gravity = Gravity.CENTER";
_ordercode.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4915220;
 //BA.debugLineNum = 4915220;BA.debugLine="OrderPrice.Text = o.OrderTotalPrice";
_orderprice.setText(BA.ObjectToCharSequence(_o.OrderTotalPrice));
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="OrderPrice.TextColor = AppColors.DarkGray";
_orderprice.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=4915222;
 //BA.debugLineNum = 4915222;BA.debugLine="OrderPrice.TextSize = 18";
_orderprice.setTextSize((float) (18));
RDebugUtils.currentLine=4915223;
 //BA.debugLineNum = 4915223;BA.debugLine="OrderPrice.Gravity = Gravity.CENTER";
_orderprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4915225;
 //BA.debugLineNum = 4915225;BA.debugLine="OrderStatus.Text = o.OrderStatus";
_orderstatus.setText(BA.ObjectToCharSequence(_o.OrderStatus));
RDebugUtils.currentLine=4915226;
 //BA.debugLineNum = 4915226;BA.debugLine="OrderStatus.TextColor = AppColors.DarkGray";
_orderstatus.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=4915227;
 //BA.debugLineNum = 4915227;BA.debugLine="OrderStatus.TextSize = 16";
_orderstatus.setTextSize((float) (16));
RDebugUtils.currentLine=4915228;
 //BA.debugLineNum = 4915228;BA.debugLine="OrderStatus.Gravity = Gravity.CENTER";
_orderstatus.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4915230;
 //BA.debugLineNum = 4915230;BA.debugLine="holder.AddView(OrderCode,0,0,20%x,5%y)";
_holder.AddView((android.view.View)(_ordercode.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4915231;
 //BA.debugLineNum = 4915231;BA.debugLine="holder.AddView(OrderPrice,70%x,OrderCode.Top,Ord";
_holder.AddView((android.view.View)(_orderprice.getObject()),__c.PerXToCurrent((float) (70),ba),_ordercode.getTop(),_ordercode.getWidth(),(int) (_ordercode.getHeight()*2));
RDebugUtils.currentLine=4915232;
 //BA.debugLineNum = 4915232;BA.debugLine="holder.AddView(OrderStatus,OrderCode.Left,OrderC";
_holder.AddView((android.view.View)(_orderstatus.getObject()),_ordercode.getLeft(),(int) (_ordercode.getTop()+_ordercode.getHeight()),_ordercode.getWidth(),_ordercode.getHeight());
RDebugUtils.currentLine=4915234;
 //BA.debugLineNum = 4915234;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=4915235;
 //BA.debugLineNum = 4915235;BA.debugLine="OrderList.Panel.AddView(holder,0,0+(10%y + 1dip)";
__ref._orderlist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._orderlist.getPanel().getWidth(),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=4915237;
 //BA.debugLineNum = 4915237;BA.debugLine="If row < CustomerOrders.Size - 1 Then";
if (_row<__ref._customerorders.getSize()-1) { 
RDebugUtils.currentLine=4915238;
 //BA.debugLineNum = 4915238;BA.debugLine="OrderList.Panel.Height = 10%y + ((10%y + 1dip)*";
__ref._orderlist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=4915239;
 //BA.debugLineNum = 4915239;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=4915242;
 //BA.debugLineNum = 4915242;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
__ref._cartpan.setColor(_appcolors._fadedblack);
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
__ref._pblbase.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="pnlHeader.Color =  AppColors.FadedDarkRed";
__ref._pnlheader.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="CartPan.AddView(pblBase,0,42%y,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (42),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="CartPan.AddView(OrderList,0%x, 2%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._orderlist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (2),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="End Sub";
return "";
}
public double  _calcorderprice(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.objects.collections.List _goods) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "calcorderprice", false))
	 {return ((Double) Debug.delegate(ba, "calcorderprice", new Object[] {_goods}));}
double _result = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub CalcOrderPrice(Goods As List) As Double";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim result As Double = 0";
_result = 0;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="For Each g As Good In Goods";
{
final anywheresoftware.b4a.BA.IterableList group2 = _goods;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="result = result + g.Price";
_result = _result+_g.Price;
 }
};
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Public OrderList As ScrollView";
_orderlist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="Public CustomerOrders As Map";
_customerorders = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="CustomerOrders.Initialize";
__ref._customerorders.Initialize();
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="OrderList.Initialize(10%y)";
__ref._orderlist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="End Sub";
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
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _ordersofcustomer = null;
Object _result = null;

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
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim ordersofcustomer As ResumableSub = Main.HTTP.";
_ordersofcustomer = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_ordersofcustomer = parent._main._http._getcustomerorders(null,_customerid);
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Wait For (ordersofcustomer)  Complete (Result As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "orderscart", "loadcustomerorders"), _ordersofcustomer);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="If Main.HTTP.Output = \"\" Then";
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
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Log(\"No Customer Orders\")";
parent.__c.LogImpl("35177348","No Customer Orders",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="Log(\"Customer Orders Output:\" & Main.HTTP.Output";
parent.__c.LogImpl("35177350","Customer Orders Output:"+parent._main._http._output,0);
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="Try";
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
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="CustomerOrders.Clear";
__ref._customerorders.Clear();
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="CustomerOrders = JSONSerializations.SerializeCu";
__ref._customerorders = parent._jsonserializations._serializecustomerorders(ba,parent._main._http._output);
 if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 0;
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="Log(\"error parsing orders\")";
parent.__c.LogImpl("35177355","error parsing orders",0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
;
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub OrderPan_Click";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Dim SelectedOrder As Order = CustomerOrders.Get(p";
_selectedorder = (b4a.diplomna.types._order)(__ref._customerorders.Get(_pnl.getTag()));
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="CallSub2(Main,\"ShowOrderInfo\",SelectedOrder)";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"ShowOrderInfo",(Object)(_selectedorder));
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "testwithfakes", false))
	 {return ((String) Debug.delegate(ba, "testwithfakes", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub TestWithFakes";
RDebugUtils.currentLine=5046315;
 //BA.debugLineNum = 5046315;BA.debugLine="End Sub";
return "";
}
}