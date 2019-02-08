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
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _addorder(b4a.diplomna.orderscart __ref,b4a.diplomna.types._localorder _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "addorder", false))
	 {return ((String) Debug.delegate(ba, "addorder", new Object[] {_o}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub AddOrder(o As LocalOrder)";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="CustomerOrders.Put(o.OrderCode,o)";
__ref._customerorders.Put((Object)(_o.OrderCode),(Object)(_o));
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return null;
}
public String  _buildcart(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "buildcart", false))
	 {return ((String) Debug.delegate(ba, "buildcart", null));}
int _row = 0;
b4a.diplomna.types._localorder _o = null;
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _ordercode = null;
anywheresoftware.b4a.objects.LabelWrapper _orderprice = null;
anywheresoftware.b4a.objects.LabelWrapper _orderstatus = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="OrderList.Panel.RemoveAllViews";
__ref._orderlist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="For Each o As LocalOrder In CustomerOrders.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customerorders.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_o = (b4a.diplomna.types._localorder)(group3.Get(index3));
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Private OrderCode,OrderPrice,OrderStatus As Labe";
_ordercode = new anywheresoftware.b4a.objects.LabelWrapper();
_orderprice = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="holder.Initialize(\"OrderPan\")";
_holder.Initialize(ba,"OrderPan");
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="holder.Tag = o.OrderCode";
_holder.setTag((Object)(_o.OrderCode));
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="OrderCode.Initialize(\"\")";
_ordercode.Initialize(ba,"");
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="OrderPrice.Initialize(\"\")";
_orderprice.Initialize(ba,"");
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="OrderStatus.Initialize(\"\")";
_orderstatus.Initialize(ba,"");
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="holder.Color = AppColors.LightGray";
_holder.setColor(_appcolors._lightgray);
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="OrderCode.Text = o.OrderCode";
_ordercode.setText(BA.ObjectToCharSequence(_o.OrderCode));
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="OrderCode.TextColor = AppColors.DarkGray";
_ordercode.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="OrderCode.TextSize = 16";
_ordercode.setTextSize((float) (16));
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="OrderCode.Gravity = Gravity.CENTER";
_ordercode.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="OrderPrice.Text = o.OrderTotalPrice";
_orderprice.setText(BA.ObjectToCharSequence(_o.OrderTotalPrice));
RDebugUtils.currentLine=6750229;
 //BA.debugLineNum = 6750229;BA.debugLine="OrderPrice.TextColor = AppColors.DarkGray";
_orderprice.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="OrderPrice.TextSize = 18";
_orderprice.setTextSize((float) (18));
RDebugUtils.currentLine=6750231;
 //BA.debugLineNum = 6750231;BA.debugLine="OrderPrice.Gravity = Gravity.CENTER";
_orderprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=6750233;
 //BA.debugLineNum = 6750233;BA.debugLine="OrderStatus.Text = o.OrderStatus";
_orderstatus.setText(BA.ObjectToCharSequence(_o.OrderStatus));
RDebugUtils.currentLine=6750234;
 //BA.debugLineNum = 6750234;BA.debugLine="OrderStatus.TextColor = AppColors.DarkGray";
_orderstatus.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=6750235;
 //BA.debugLineNum = 6750235;BA.debugLine="OrderStatus.TextSize = 16";
_orderstatus.setTextSize((float) (16));
RDebugUtils.currentLine=6750236;
 //BA.debugLineNum = 6750236;BA.debugLine="OrderStatus.Gravity = Gravity.CENTER";
_orderstatus.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=6750238;
 //BA.debugLineNum = 6750238;BA.debugLine="holder.AddView(OrderCode,0,0,20%x,5%y)";
_holder.AddView((android.view.View)(_ordercode.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=6750239;
 //BA.debugLineNum = 6750239;BA.debugLine="holder.AddView(OrderPrice,70%x,OrderCode.Top,Ord";
_holder.AddView((android.view.View)(_orderprice.getObject()),__c.PerXToCurrent((float) (70),ba),_ordercode.getTop(),_ordercode.getWidth(),(int) (_ordercode.getHeight()*2));
RDebugUtils.currentLine=6750240;
 //BA.debugLineNum = 6750240;BA.debugLine="holder.AddView(OrderStatus,OrderCode.Left,OrderC";
_holder.AddView((android.view.View)(_orderstatus.getObject()),_ordercode.getLeft(),(int) (_ordercode.getTop()+_ordercode.getHeight()),_ordercode.getWidth(),_ordercode.getHeight());
RDebugUtils.currentLine=6750242;
 //BA.debugLineNum = 6750242;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=6750243;
 //BA.debugLineNum = 6750243;BA.debugLine="OrderList.Panel.AddView(holder,0,0+(10%y + 1dip)";
__ref._orderlist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._orderlist.getPanel().getWidth(),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=6750245;
 //BA.debugLineNum = 6750245;BA.debugLine="If row < CustomerOrders.Size - 1 Then";
if (_row<__ref._customerorders.getSize()-1) { 
RDebugUtils.currentLine=6750246;
 //BA.debugLineNum = 6750246;BA.debugLine="OrderList.Panel.Height = 10%y + ((10%y + 1dip)*";
__ref._orderlist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=6750247;
 //BA.debugLineNum = 6750247;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=6750250;
 //BA.debugLineNum = 6750250;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
__ref._cartpan.setColor(_appcolors._fadedblack);
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
__ref._pblbase.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="pnlHeader.Color =  AppColors.FadedDarkRed";
__ref._pnlheader.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="CartPan.AddView(pblBase,0,42%y,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (42),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="CartPan.AddView(OrderList,0%x, 2%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._orderlist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (2),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="End Sub";
return "";
}
public double  _calcorderprice(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.objects.collections.List _goods) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "calcorderprice", false))
	 {return ((Double) Debug.delegate(ba, "calcorderprice", new Object[] {_goods}));}
double _result = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub CalcOrderPrice(Goods As List) As Double";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim result As Double = 0";
_result = 0;
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="For Each g As Good In Goods";
{
final anywheresoftware.b4a.BA.IterableList group2 = _goods;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="result = result + g.Price";
_result = _result+_g.Price;
 }
};
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Public OrderList As ScrollView";
_orderlist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Public CustomerOrders As Map";
_customerorders = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="CustomerOrders.Initialize";
__ref._customerorders.Initialize();
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="OrderList.Initialize(10%y)";
__ref._orderlist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="End Sub";
return "";
}
public String  _orderpan_click(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "orderpan_click", false))
	 {return ((String) Debug.delegate(ba, "orderpan_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
b4a.diplomna.types._localorder _selectedorder = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub OrderPan_Click";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Dim SelectedOrder As LocalOrder = CustomerOrders.";
_selectedorder = (b4a.diplomna.types._localorder)(__ref._customerorders.Get(_pnl.getTag()));
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="CallSub2(Main,\"ShowOrderInfo\",SelectedOrder)";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"ShowOrderInfo",(Object)(_selectedorder));
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "testwithfakes", false))
	 {return ((String) Debug.delegate(ba, "testwithfakes", null));}
b4a.diplomna.types._good _g = null;
b4a.diplomna.types._good _g1 = null;
b4a.diplomna.types._good _g2 = null;
b4a.diplomna.types._localorder _order1 = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub TestWithFakes";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim g,g1,g2 As Good";
_g = new b4a.diplomna.types._good();
_g1 = new b4a.diplomna.types._good();
_g2 = new b4a.diplomna.types._good();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="g1.Initialize";
_g1.Initialize();
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="g2.Initialize";
_g2.Initialize();
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="g.Name = \"Coca Cola\"";
_g.Name = "Coca Cola";
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="g.PLU = 101";
_g.PLU = (int) (101);
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="g.Price = 1.20";
_g.Price = 1.20;
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="g1.Name = \"Coca\"";
_g1.Name = "Coca";
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="g1.PLU = 102";
_g1.PLU = (int) (102);
RDebugUtils.currentLine=6881292;
 //BA.debugLineNum = 6881292;BA.debugLine="g1.Price = 120";
_g1.Price = 120;
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="g2.Name = \"Head N Shoulders\"";
_g2.Name = "Head N Shoulders";
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="g2.PLU = 103";
_g2.PLU = (int) (103);
RDebugUtils.currentLine=6881296;
 //BA.debugLineNum = 6881296;BA.debugLine="g2.Price = 9.70";
_g2.Price = 9.70;
RDebugUtils.currentLine=6881298;
 //BA.debugLineNum = 6881298;BA.debugLine="Dim order1 As LocalOrder";
_order1 = new b4a.diplomna.types._localorder();
RDebugUtils.currentLine=6881300;
 //BA.debugLineNum = 6881300;BA.debugLine="order1.Initialize";
_order1.Initialize();
RDebugUtils.currentLine=6881301;
 //BA.debugLineNum = 6881301;BA.debugLine="order1.Goods.Initialize";
_order1.Goods.Initialize();
RDebugUtils.currentLine=6881302;
 //BA.debugLineNum = 6881302;BA.debugLine="order1.Goods.Add(g)";
_order1.Goods.Add((Object)(_g));
RDebugUtils.currentLine=6881303;
 //BA.debugLineNum = 6881303;BA.debugLine="order1.Goods.Add(g1)";
_order1.Goods.Add((Object)(_g1));
RDebugUtils.currentLine=6881304;
 //BA.debugLineNum = 6881304;BA.debugLine="order1.Goods.Add(g)";
_order1.Goods.Add((Object)(_g));
RDebugUtils.currentLine=6881305;
 //BA.debugLineNum = 6881305;BA.debugLine="order1.Goods.Add(g2)";
_order1.Goods.Add((Object)(_g2));
RDebugUtils.currentLine=6881307;
 //BA.debugLineNum = 6881307;BA.debugLine="order1.OrderCode = \"#asd14z24d\"";
_order1.OrderCode = "#asd14z24d";
RDebugUtils.currentLine=6881308;
 //BA.debugLineNum = 6881308;BA.debugLine="order1.OrderStatus = \"Waiting\"";
_order1.OrderStatus = "Waiting";
RDebugUtils.currentLine=6881309;
 //BA.debugLineNum = 6881309;BA.debugLine="order1.OrderTotalPrice = CalcOrderPrice(order1.Go";
_order1.OrderTotalPrice = __ref._calcorderprice(null,_order1.Goods);
RDebugUtils.currentLine=6881311;
 //BA.debugLineNum = 6881311;BA.debugLine="AddOrder(order1)";
__ref._addorder(null,_order1);
RDebugUtils.currentLine=6881323;
 //BA.debugLineNum = 6881323;BA.debugLine="End Sub";
return "";
}
}