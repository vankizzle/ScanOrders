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
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _addorder(b4a.diplomna.types._localorder _o) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub AddOrder(o As LocalOrder)";
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
b4a.diplomna.types._localorder _o = null;
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _ordercode = null;
anywheresoftware.b4a.objects.LabelWrapper _orderprice = null;
anywheresoftware.b4a.objects.LabelWrapper _orderstatus = null;
 //BA.debugLineNum = 36;BA.debugLine="Public Sub BuildCart";
 //BA.debugLineNum = 37;BA.debugLine="OrderList.Panel.RemoveAllViews";
_orderlist.getPanel().RemoveAllViews();
 //BA.debugLineNum = 38;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
 //BA.debugLineNum = 39;BA.debugLine="For Each o As LocalOrder In CustomerOrders.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _customerorders.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_o = (b4a.diplomna.types._localorder)(group3.Get(index3));
 //BA.debugLineNum = 40;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private OrderCode,OrderPrice,OrderStatus As Labe";
_ordercode = new anywheresoftware.b4a.objects.LabelWrapper();
_orderprice = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatus = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="holder.Initialize(\"OrderPan\")";
_holder.Initialize(ba,"OrderPan");
 //BA.debugLineNum = 44;BA.debugLine="holder.Tag = o.OrderCode";
_holder.setTag((Object)(_o.OrderCode));
 //BA.debugLineNum = 45;BA.debugLine="OrderCode.Initialize(\"\")";
_ordercode.Initialize(ba,"");
 //BA.debugLineNum = 46;BA.debugLine="OrderPrice.Initialize(\"\")";
_orderprice.Initialize(ba,"");
 //BA.debugLineNum = 47;BA.debugLine="OrderStatus.Initialize(\"\")";
_orderstatus.Initialize(ba,"");
 //BA.debugLineNum = 49;BA.debugLine="holder.Color = AppColors.LightGray";
_holder.setColor(_appcolors._lightgray);
 //BA.debugLineNum = 51;BA.debugLine="OrderCode.Text = o.OrderCode";
_ordercode.setText(BA.ObjectToCharSequence(_o.OrderCode));
 //BA.debugLineNum = 52;BA.debugLine="OrderCode.TextColor = AppColors.DarkGray";
_ordercode.setTextColor(_appcolors._darkgray);
 //BA.debugLineNum = 53;BA.debugLine="OrderCode.TextSize = 16";
_ordercode.setTextSize((float) (16));
 //BA.debugLineNum = 54;BA.debugLine="OrderCode.Gravity = Gravity.CENTER";
_ordercode.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 56;BA.debugLine="OrderPrice.Text = o.OrderTotalPrice";
_orderprice.setText(BA.ObjectToCharSequence(_o.OrderTotalPrice));
 //BA.debugLineNum = 57;BA.debugLine="OrderPrice.TextColor = AppColors.DarkGray";
_orderprice.setTextColor(_appcolors._darkgray);
 //BA.debugLineNum = 58;BA.debugLine="OrderPrice.TextSize = 18";
_orderprice.setTextSize((float) (18));
 //BA.debugLineNum = 59;BA.debugLine="OrderPrice.Gravity = Gravity.CENTER";
_orderprice.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 61;BA.debugLine="OrderStatus.Text = o.OrderStatus";
_orderstatus.setText(BA.ObjectToCharSequence(_o.OrderStatus));
 //BA.debugLineNum = 62;BA.debugLine="OrderStatus.TextColor = AppColors.DarkGray";
_orderstatus.setTextColor(_appcolors._darkgray);
 //BA.debugLineNum = 63;BA.debugLine="OrderStatus.TextSize = 16";
_orderstatus.setTextSize((float) (16));
 //BA.debugLineNum = 64;BA.debugLine="OrderStatus.Gravity = Gravity.CENTER";
_orderstatus.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 66;BA.debugLine="holder.AddView(OrderCode,0,0,20%x,5%y)";
_holder.AddView((android.view.View)(_ordercode.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 67;BA.debugLine="holder.AddView(OrderPrice,70%x,OrderCode.Top,Ord";
_holder.AddView((android.view.View)(_orderprice.getObject()),__c.PerXToCurrent((float) (70),ba),_ordercode.getTop(),_ordercode.getWidth(),(int) (_ordercode.getHeight()*2));
 //BA.debugLineNum = 68;BA.debugLine="holder.AddView(OrderStatus,OrderCode.Left,OrderC";
_holder.AddView((android.view.View)(_orderstatus.getObject()),_ordercode.getLeft(),(int) (_ordercode.getTop()+_ordercode.getHeight()),_ordercode.getWidth(),_ordercode.getHeight());
 //BA.debugLineNum = 70;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
 //BA.debugLineNum = 71;BA.debugLine="OrderList.Panel.AddView(holder,0,0+(10%y + 1dip)";
_orderlist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row),_orderlist.getPanel().getWidth(),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 73;BA.debugLine="If row < CustomerOrders.Size - 1 Then";
if (_row<_customerorders.getSize()-1) { 
 //BA.debugLineNum = 74;BA.debugLine="OrderList.Panel.Height = 10%y + ((10%y + 1dip)*";
_orderlist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row)));
 //BA.debugLineNum = 75;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 132;BA.debugLine="Public Sub CalcOrderPrice(Goods As List) As Double";
 //BA.debugLineNum = 133;BA.debugLine="Dim result As Double = 0";
_result = 0;
 //BA.debugLineNum = 134;BA.debugLine="For Each g As Good In Goods";
{
final anywheresoftware.b4a.BA.IterableList group2 = _goods;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
 //BA.debugLineNum = 135;BA.debugLine="result = result + g.Price";
_result = _result+_g.Price;
 }
};
 //BA.debugLineNum = 137;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
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
public String  _orderpan_click() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
b4a.diplomna.types._localorder _selectedorder = null;
 //BA.debugLineNum = 80;BA.debugLine="Public Sub OrderPan_Click";
 //BA.debugLineNum = 81;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 82;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
 //BA.debugLineNum = 83;BA.debugLine="Dim SelectedOrder As LocalOrder = CustomerOrders.";
_selectedorder = (b4a.diplomna.types._localorder)(_customerorders.Get(_pnl.getTag()));
 //BA.debugLineNum = 84;BA.debugLine="CallSub2(Main,\"ShowOrderInfo\",SelectedOrder)";
__c.CallSubNew2(ba,(Object)(_main.getObject()),"ShowOrderInfo",(Object)(_selectedorder));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes() throws Exception{
b4a.diplomna.types._good _g = null;
b4a.diplomna.types._good _g1 = null;
b4a.diplomna.types._good _g2 = null;
b4a.diplomna.types._localorder _order1 = null;
 //BA.debugLineNum = 87;BA.debugLine="Public Sub TestWithFakes";
 //BA.debugLineNum = 88;BA.debugLine="Dim g,g1,g2 As Good";
_g = new b4a.diplomna.types._good();
_g1 = new b4a.diplomna.types._good();
_g2 = new b4a.diplomna.types._good();
 //BA.debugLineNum = 89;BA.debugLine="g.Initialize";
_g.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="g1.Initialize";
_g1.Initialize();
 //BA.debugLineNum = 91;BA.debugLine="g2.Initialize";
_g2.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="g.Name = \"Coca Cola\"";
_g.Name = "Coca Cola";
 //BA.debugLineNum = 94;BA.debugLine="g.PLU = 101";
_g.PLU = (int) (101);
 //BA.debugLineNum = 95;BA.debugLine="g.Price = 1.20";
_g.Price = 1.20;
 //BA.debugLineNum = 97;BA.debugLine="g1.Name = \"Coca\"";
_g1.Name = "Coca";
 //BA.debugLineNum = 98;BA.debugLine="g1.PLU = 102";
_g1.PLU = (int) (102);
 //BA.debugLineNum = 99;BA.debugLine="g1.Price = 120";
_g1.Price = 120;
 //BA.debugLineNum = 101;BA.debugLine="g2.Name = \"Head N Shoulders\"";
_g2.Name = "Head N Shoulders";
 //BA.debugLineNum = 102;BA.debugLine="g2.PLU = 103";
_g2.PLU = (int) (103);
 //BA.debugLineNum = 103;BA.debugLine="g2.Price = 9.70";
_g2.Price = 9.70;
 //BA.debugLineNum = 105;BA.debugLine="Dim order1 As LocalOrder";
_order1 = new b4a.diplomna.types._localorder();
 //BA.debugLineNum = 107;BA.debugLine="order1.Initialize";
_order1.Initialize();
 //BA.debugLineNum = 108;BA.debugLine="order1.Goods.Initialize";
_order1.Goods.Initialize();
 //BA.debugLineNum = 109;BA.debugLine="order1.Goods.Add(g)";
_order1.Goods.Add((Object)(_g));
 //BA.debugLineNum = 110;BA.debugLine="order1.Goods.Add(g1)";
_order1.Goods.Add((Object)(_g1));
 //BA.debugLineNum = 111;BA.debugLine="order1.Goods.Add(g)";
_order1.Goods.Add((Object)(_g));
 //BA.debugLineNum = 112;BA.debugLine="order1.Goods.Add(g2)";
_order1.Goods.Add((Object)(_g2));
 //BA.debugLineNum = 114;BA.debugLine="order1.OrderCode = \"#asd14z24d\"";
_order1.OrderCode = "#asd14z24d";
 //BA.debugLineNum = 115;BA.debugLine="order1.OrderStatus = \"Waiting\"";
_order1.OrderStatus = "Waiting";
 //BA.debugLineNum = 116;BA.debugLine="order1.OrderTotalPrice = CalcOrderPrice(order1.Go";
_order1.OrderTotalPrice = _calcorderprice(_order1.Goods);
 //BA.debugLineNum = 118;BA.debugLine="AddOrder(order1)";
_addorder(_order1);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
