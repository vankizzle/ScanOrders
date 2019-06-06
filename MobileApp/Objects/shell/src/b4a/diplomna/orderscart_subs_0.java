package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class orderscart_subs_0 {


public static RemoteObject  _addorder(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("AddOrder (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("addorder")) { return __ref.runUserSub(false, "orderscart","addorder", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 28;BA.debugLine="Public Sub AddOrder(o As Order)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="CustomerOrders.Put(o.OrderCode,o)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_customerorders").runVoidMethod ("Put",(Object)((_o.getField(true,"OrderCode"))),(Object)((_o)));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "orderscart","asview", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Return CartPan";
Debug.ShouldStop(1);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_cartpan").getObject());
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildcart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildCart (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("buildcart")) { return __ref.runUserSub(false, "orderscart","buildcart", __ref);}
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _o = RemoteObject.declareNull("b4a.diplomna.types._order");
RemoteObject _holder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ordercode = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _orderprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _orderstatus = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 36;BA.debugLine="Public Sub BuildCart";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="OrderList.Panel.RemoveAllViews";
Debug.ShouldStop(16);
__ref.getField(false,"_orderlist").runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 38;BA.debugLine="Dim row As Int = 0";
Debug.ShouldStop(32);
_row = BA.numberCast(int.class, 0);Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 39;BA.debugLine="For Each o As Order In CustomerOrders.Values";
Debug.ShouldStop(64);
{
final RemoteObject group3 = __ref.getField(false,"_customerorders").runMethod(false,"Values");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_o = (group3.runMethod(false,"Get",index3));Debug.locals.put("o", _o);
Debug.locals.put("o", _o);
 BA.debugLineNum = 40;BA.debugLine="Log(\"ORDER --------->\")";
Debug.ShouldStop(128);
orderscart.__c.runVoidMethod ("LogImpl","48454148",RemoteObject.createImmutable("ORDER --------->"),0);
 BA.debugLineNum = 41;BA.debugLine="Private holder As Panel";
Debug.ShouldStop(256);
_holder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("holder", _holder);
 BA.debugLineNum = 42;BA.debugLine="Private OrderCode,OrderPrice,OrderStatus As Labe";
Debug.ShouldStop(512);
_ordercode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("OrderCode", _ordercode);
_orderprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("OrderPrice", _orderprice);
_orderstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("OrderStatus", _orderstatus);
 BA.debugLineNum = 44;BA.debugLine="holder.Initialize(\"OrderPan\")";
Debug.ShouldStop(2048);
_holder.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("OrderPan")));
 BA.debugLineNum = 45;BA.debugLine="holder.Tag = o.OrderCode";
Debug.ShouldStop(4096);
_holder.runMethod(false,"setTag",(_o.getField(true,"OrderCode")));
 BA.debugLineNum = 46;BA.debugLine="OrderCode.Initialize(\"\")";
Debug.ShouldStop(8192);
_ordercode.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 47;BA.debugLine="OrderPrice.Initialize(\"\")";
Debug.ShouldStop(16384);
_orderprice.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 48;BA.debugLine="OrderStatus.Initialize(\"\")";
Debug.ShouldStop(32768);
_orderstatus.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 50;BA.debugLine="holder.Color = AppColors.LightGray";
Debug.ShouldStop(131072);
_holder.runVoidMethod ("setColor",orderscart._appcolors._lightgray);
 BA.debugLineNum = 52;BA.debugLine="OrderCode.Text = o.OrderCode";
Debug.ShouldStop(524288);
_ordercode.runMethod(true,"setText",BA.ObjectToCharSequence(_o.getField(true,"OrderCode")));
 BA.debugLineNum = 54;BA.debugLine="OrderCode.TextColor = AppColors.DarkGray";
Debug.ShouldStop(2097152);
_ordercode.runMethod(true,"setTextColor",orderscart._appcolors._darkgray);
 BA.debugLineNum = 55;BA.debugLine="OrderCode.TextSize = 14";
Debug.ShouldStop(4194304);
_ordercode.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 56;BA.debugLine="OrderCode.Gravity = Gravity.CENTER";
Debug.ShouldStop(8388608);
_ordercode.runMethod(true,"setGravity",orderscart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 58;BA.debugLine="OrderPrice.Text = o.OrderTotalPrice";
Debug.ShouldStop(33554432);
_orderprice.runMethod(true,"setText",BA.ObjectToCharSequence(_o.getField(true,"OrderTotalPrice")));
 BA.debugLineNum = 59;BA.debugLine="OrderPrice.TextColor = AppColors.DarkGray";
Debug.ShouldStop(67108864);
_orderprice.runMethod(true,"setTextColor",orderscart._appcolors._darkgray);
 BA.debugLineNum = 60;BA.debugLine="OrderPrice.TextSize = 18";
Debug.ShouldStop(134217728);
_orderprice.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 61;BA.debugLine="OrderPrice.Gravity = Gravity.CENTER";
Debug.ShouldStop(268435456);
_orderprice.runMethod(true,"setGravity",orderscart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 63;BA.debugLine="OrderStatus.Text = o.OrderStatus";
Debug.ShouldStop(1073741824);
_orderstatus.runMethod(true,"setText",BA.ObjectToCharSequence(_o.getField(true,"OrderStatus")));
 BA.debugLineNum = 64;BA.debugLine="OrderStatus.TextColor = AppColors.DarkGray";
Debug.ShouldStop(-2147483648);
_orderstatus.runMethod(true,"setTextColor",orderscart._appcolors._darkgray);
 BA.debugLineNum = 65;BA.debugLine="OrderStatus.TextSize = 16";
Debug.ShouldStop(1);
_orderstatus.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 66;BA.debugLine="OrderStatus.Gravity = Gravity.CENTER";
Debug.ShouldStop(2);
_orderstatus.runMethod(true,"setGravity",orderscart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 68;BA.debugLine="holder.AddView(OrderCode,0,0,40%x,5%y)";
Debug.ShouldStop(8);
_holder.runVoidMethod ("AddView",(Object)((_ordercode.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(orderscart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 69;BA.debugLine="holder.AddView(OrderPrice,50%x,OrderCode.Top,Ord";
Debug.ShouldStop(16);
_holder.runVoidMethod ("AddView",(Object)((_orderprice.getObject())),(Object)(orderscart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(_ordercode.runMethod(true,"getTop")),(Object)(_ordercode.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {_ordercode.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "*",0, 1)));
 BA.debugLineNum = 70;BA.debugLine="holder.AddView(OrderStatus,OrderCode.Left,OrderC";
Debug.ShouldStop(32);
_holder.runVoidMethod ("AddView",(Object)((_orderstatus.getObject())),(Object)(_ordercode.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {_ordercode.runMethod(true,"getTop"),_ordercode.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(_ordercode.runMethod(true,"getWidth")),(Object)(_ordercode.runMethod(true,"getHeight")));
 BA.debugLineNum = 72;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
Debug.ShouldStop(128);
orderscart._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _holder.getObject()),(Object)(orderscart.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(orderscart._appcolors._lightgray),(Object)(orderscart._appcolors._lightgray),(Object)(orderscart._appcolors._lightgraypressed),(Object)(orderscart._appcolors._lightgraypressed),(Object)(orderscart.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(orderscart.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 73;BA.debugLine="OrderList.Panel.AddView(holder,0,0+(10%y + 1dip)";
Debug.ShouldStop(256);
__ref.getField(false,"_orderlist").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_holder.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),(RemoteObject.solve(new RemoteObject[] {orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba")),orderscart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),_row}, "+*",1, 1)),(Object)(__ref.getField(false,"_orderlist").runMethod(false,"getPanel").runMethod(true,"getWidth")),(Object)(orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 76;BA.debugLine="If row < CustomerOrders.Size - 1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customerorders").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 77;BA.debugLine="OrderList.Panel.Height = 20%y + ((10%y + 1dip)*";
Debug.ShouldStop(4096);
__ref.getField(false,"_orderlist").runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba")),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba")),orderscart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),_row}, "*",0, 1))}, "+",1, 1));
 BA.debugLineNum = 78;BA.debugLine="row = row + 1";
Debug.ShouldStop(8192);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 };
 }
}Debug.locals.put("o", _o);
;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "orderscart","buildui", __ref);}
 BA.debugLineNum = 18;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
Debug.ShouldStop(262144);
__ref.getField(false,"_cartpan").runVoidMethod ("setColor",orderscart._appcolors._fadedblack);
 BA.debugLineNum = 20;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
Debug.ShouldStop(524288);
__ref.getField(false,"_pblbase").runVoidMethod ("setColor",orderscart._appcolors._fadeddarkred);
 BA.debugLineNum = 21;BA.debugLine="pnlHeader.Color =  AppColors.FadedDarkRed";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnlheader").runVoidMethod ("setColor",orderscart._appcolors._fadeddarkred);
 BA.debugLineNum = 23;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,2%y)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cartpan").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlheader").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(orderscart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 24;BA.debugLine="CartPan.AddView(pblBase,0,42%y,90%x,2%y)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_cartpan").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pblbase").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 42)),__ref.getField(false, "ba"))),(Object)(orderscart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 25;BA.debugLine="CartPan.AddView(OrderList,0%x, 2%y,100%x,40%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cartpan").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_orderlist").getObject())),(Object)(orderscart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(orderscart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcorderprice(RemoteObject __ref,RemoteObject _goods) throws Exception{
try {
		Debug.PushSubsStack("CalcOrderPrice (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("calcorderprice")) { return __ref.runUserSub(false, "orderscart","calcorderprice", __ref, _goods);}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
Debug.locals.put("Goods", _goods);
 BA.debugLineNum = 135;BA.debugLine="Public Sub CalcOrderPrice(Goods As List) As Double";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim result As Double = 0";
Debug.ShouldStop(128);
_result = BA.numberCast(double.class, 0);Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 137;BA.debugLine="For Each g As Good In Goods";
Debug.ShouldStop(256);
{
final RemoteObject group2 = _goods;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (group2.runMethod(false,"Get",index2));Debug.locals.put("g", _g);
Debug.locals.put("g", _g);
 BA.debugLineNum = 138;BA.debugLine="result = result + g.Price";
Debug.ShouldStop(512);
_result = RemoteObject.solve(new RemoteObject[] {_result,_g.getField(true,"Price")}, "+",1, 0);Debug.locals.put("result", _result);
 }
}Debug.locals.put("g", _g);
;
 BA.debugLineNum = 140;BA.debugLine="Return result";
Debug.ShouldStop(2048);
if (true) return _result;
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
orderscart._cartpan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_cartpan",orderscart._cartpan);
orderscart._pblbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pblbase",orderscart._pblbase);
orderscart._pnlheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlheader",orderscart._pnlheader);
 //BA.debugLineNum = 3;BA.debugLine="Public OrderList As ScrollView";
orderscart._orderlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_orderlist",orderscart._orderlist);
 //BA.debugLineNum = 5;BA.debugLine="Public CustomerOrders As Map";
orderscart._customerorders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_customerorders",orderscart._customerorders);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "orderscart","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="CartPan.Initialize(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_cartpan").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 11;BA.debugLine="pblBase.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_pblbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 12;BA.debugLine="pnlHeader.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlheader").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 13;BA.debugLine="CustomerOrders.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_customerorders").runVoidMethod ("Initialize");
 BA.debugLineNum = 14;BA.debugLine="OrderList.Initialize(10%y)";
Debug.ShouldStop(8192);
__ref.getField(false,"_orderlist").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(orderscart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 15;BA.debugLine="BuildUI";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.diplomna.orderscart.class, "_buildui");
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadcustomerorders(RemoteObject __ref,RemoteObject _customerid) throws Exception{
try {
		Debug.PushSubsStack("LoadCustomerOrders (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("loadcustomerorders")) { __ref.runUserSub(false, "orderscart","loadcustomerorders", __ref, _customerid); return;}
ResumableSub_LoadCustomerOrders rsub = new ResumableSub_LoadCustomerOrders(null,__ref,_customerid);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadCustomerOrders extends BA.ResumableSub {
public ResumableSub_LoadCustomerOrders(b4a.diplomna.orderscart parent,RemoteObject __ref,RemoteObject _customerid) {
this.parent = parent;
this.__ref = __ref;
this._customerid = _customerid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.orderscart parent;
RemoteObject _customerid;
RemoteObject _orders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ordersofcustomer = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
RemoteObject _o = RemoteObject.declareNull("b4a.diplomna.types._order");
RemoteObject _orderedgoods = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadCustomerOrders (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,143);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("CustomerID", _customerid);
 BA.debugLineNum = 144;BA.debugLine="Dim orders As List";
Debug.ShouldStop(32768);
_orders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("orders", _orders);
 BA.debugLineNum = 145;BA.debugLine="Dim ordersofcustomer As ResumableSub = Main.HTTP.";
Debug.ShouldStop(65536);
_ordersofcustomer = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_ordersofcustomer = parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_getcustomerorders",(Object)(_customerid));Debug.locals.put("ordersofcustomer", _ordersofcustomer);Debug.locals.put("ordersofcustomer", _ordersofcustomer);
 BA.debugLineNum = 147;BA.debugLine="Wait For (ordersofcustomer)  Complete (Result As";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "orderscart", "loadcustomerorders"), _ordersofcustomer);
this.state = 28;
return;
case 28:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 149;BA.debugLine="CustomerOrders.Clear";
Debug.ShouldStop(1048576);
__ref.getField(false,"_customerorders").runVoidMethod ("Clear");
 BA.debugLineNum = 151;BA.debugLine="If Main.HTTP.Output = \"\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent._main._http.getField(true,"_output"),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 152;BA.debugLine="Log(\"No Customer Orders\")";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","48716297",RemoteObject.createImmutable("No Customer Orders"),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 154;BA.debugLine="Log(\"Customer Orders Output:\" & Main.HTTP.Output";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","48716299",RemoteObject.concat(RemoteObject.createImmutable("Customer Orders Output:"),parent._main._http.getField(true,"_output")),0);
 BA.debugLineNum = 155;BA.debugLine="Try";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 156;BA.debugLine="orders = JSONSerializations.SerializeCustomerOr";
Debug.ShouldStop(134217728);
_orders = parent._jsonserializations.runMethod(false,"_serializecustomerorders",__ref.getField(false, "ba"),(Object)(parent._main._http.getField(true,"_output")));Debug.locals.put("orders", _orders);
 Debug.CheckDeviceExceptions();
if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 0;
 BA.debugLineNum = 158;BA.debugLine="Log(\"error parsing orders\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","48716303",RemoteObject.createImmutable("error parsing orders"),0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
;
 BA.debugLineNum = 160;BA.debugLine="Main.HTTP.ClearOuput";
Debug.ShouldStop(-2147483648);
parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_clearouput");
 if (true) break;
;
 BA.debugLineNum = 163;BA.debugLine="For Each o As Order In orders";
Debug.ShouldStop(4);

case 12:
//for
this.state = 27;
group16 = _orders;
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("o", _o);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 27;
if (index16 < groupLen16) {
this.state = 14;
_o = (group16.runMethod(false,"Get",index16));Debug.locals.put("o", _o);}
if (true) break;

case 30:
//C
this.state = 29;
index16++;
Debug.locals.put("o", _o);
if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 165;BA.debugLine="Dim orderedgoods As ResumableSub = Main.HTTP.Get";
Debug.ShouldStop(16);
_orderedgoods = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_orderedgoods = parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_getorderedgoods",(Object)(_o.getField(true,"ID")));Debug.locals.put("orderedgoods", _orderedgoods);Debug.locals.put("orderedgoods", _orderedgoods);
 BA.debugLineNum = 166;BA.debugLine="Wait For (orderedgoods)  Complete (Result As Obj";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "orderscart", "loadcustomerorders"), _orderedgoods);
this.state = 31;
return;
case 31:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 168;BA.debugLine="If Main.HTTP.Output = \"\" Then";
Debug.ShouldStop(128);
if (true) break;

case 15:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",parent._main._http.getField(true,"_output"),BA.ObjectToString(""))) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 26;
 BA.debugLineNum = 169;BA.debugLine="Log(\"No Ordered Goods\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","48716314",RemoteObject.createImmutable("No Ordered Goods"),0);
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 171;BA.debugLine="Log(\"Ordered Goods Output:\" & Main.HTTP.Output)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","48716316",RemoteObject.concat(RemoteObject.createImmutable("Ordered Goods Output:"),parent._main._http.getField(true,"_output")),0);
 BA.debugLineNum = 172;BA.debugLine="Try";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 173;BA.debugLine="o.OrderedGoods = JSONSerializations.SerializeO";
Debug.ShouldStop(4096);
_o.setField ("OrderedGoods",parent._jsonserializations.runMethod(false,"_serializeorderedgoods",__ref.getField(false, "ba"),(Object)(parent._main._http.getField(true,"_output"))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
 BA.debugLineNum = 175;BA.debugLine="Log(\"error parsing goods\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","48716320",RemoteObject.createImmutable("error parsing goods"),0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
;
 BA.debugLineNum = 177;BA.debugLine="Main.HTTP.ClearOuput";
Debug.ShouldStop(65536);
parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_clearouput");
 if (true) break;

case 26:
//C
this.state = 30;
;
 BA.debugLineNum = 180;BA.debugLine="AddOrder(o)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.diplomna.orderscart.class, "_addorder",(Object)(_o));
 if (true) break;
if (true) break;

case 27:
//C
this.state = -1;
Debug.locals.put("o", _o);
;
 BA.debugLineNum = 183;BA.debugLine="BuildCart";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.diplomna.orderscart.class, "_buildcart");
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _orderpan_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OrderPan_Click (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("orderpan_click")) { return __ref.runUserSub(false, "orderscart","orderpan_click", __ref);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _selectedorder = RemoteObject.declareNull("b4a.diplomna.types._order");
 BA.debugLineNum = 83;BA.debugLine="Public Sub OrderPan_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(524288);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 85;BA.debugLine="pnl = Sender";
Debug.ShouldStop(1048576);
_pnl.setObject(orderscart.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 86;BA.debugLine="Dim SelectedOrder As Order = CustomerOrders.Get(p";
Debug.ShouldStop(2097152);
_selectedorder = (__ref.getField(false,"_customerorders").runMethod(false,"Get",(Object)(_pnl.runMethod(false,"getTag"))));Debug.locals.put("SelectedOrder", _selectedorder);Debug.locals.put("SelectedOrder", _selectedorder);
 BA.debugLineNum = 87;BA.debugLine="CallSub2(Main,\"ShowOrderInfo\",SelectedOrder)";
Debug.ShouldStop(4194304);
orderscart.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((orderscart._main.getObject())),(Object)(BA.ObjectToString("ShowOrderInfo")),(Object)((_selectedorder)));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _testwithfakes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TestWithFakes (orderscart) ","orderscart",11,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("testwithfakes")) { return __ref.runUserSub(false, "orderscart","testwithfakes", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Public Sub TestWithFakes";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}