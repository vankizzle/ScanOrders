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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _addorder(b4a.diplomna.orderscart __ref,b4a.diplomna.types._localorder _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "addorder", false))
	 {return ((String) Debug.delegate(ba, "addorder", new Object[] {_o}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub AddOrder(o As LocalOrder)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="CustomerOrders.Put(o.OrderCode,o)";
__ref._customerorders.Put((Object)(_o.OrderCode),(Object)(_o));
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="OrderList.Panel.RemoveAllViews";
__ref._orderlist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="For Each o As LocalOrder In CustomerOrders.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customerorders.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_o = (b4a.diplomna.types._localorder)(group3.Get(index3));
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Private OrderCode,OrderPrice,OrderStatus As Labe";
_ordercode = new anywheresoftware.b4a.objects.LabelWrapper();
_orderprice = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="holder.Initialize(\"OrderPan\")";
_holder.Initialize(ba,"OrderPan");
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="holder.Tag = o.OrderCode";
_holder.setTag((Object)(_o.OrderCode));
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="OrderCode.Initialize(\"\")";
_ordercode.Initialize(ba,"");
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="OrderPrice.Initialize(\"\")";
_orderprice.Initialize(ba,"");
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="OrderStatus.Initialize(\"\")";
_orderstatus.Initialize(ba,"");
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="holder.Color = AppColors.LightGray";
_holder.setColor(_appcolors._lightgray);
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="OrderCode.Text = o.OrderCode";
_ordercode.setText(BA.ObjectToCharSequence(_o.OrderCode));
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="OrderCode.TextColor = AppColors.DarkGray";
_ordercode.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="OrderCode.TextSize = 16";
_ordercode.setTextSize((float) (16));
RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="OrderCode.Gravity = Gravity.CENTER";
_ordercode.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="OrderPrice.Text = o.OrderTotalPrice";
_orderprice.setText(BA.ObjectToCharSequence(_o.OrderTotalPrice));
RDebugUtils.currentLine=3670037;
 //BA.debugLineNum = 3670037;BA.debugLine="OrderPrice.TextColor = AppColors.DarkGray";
_orderprice.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="OrderPrice.TextSize = 18";
_orderprice.setTextSize((float) (18));
RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="OrderPrice.Gravity = Gravity.CENTER";
_orderprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3670041;
 //BA.debugLineNum = 3670041;BA.debugLine="OrderStatus.Text = o.OrderStatus";
_orderstatus.setText(BA.ObjectToCharSequence(_o.OrderStatus));
RDebugUtils.currentLine=3670042;
 //BA.debugLineNum = 3670042;BA.debugLine="OrderStatus.TextColor = AppColors.DarkGray";
_orderstatus.setTextColor(_appcolors._darkgray);
RDebugUtils.currentLine=3670043;
 //BA.debugLineNum = 3670043;BA.debugLine="OrderStatus.TextSize = 16";
_orderstatus.setTextSize((float) (16));
RDebugUtils.currentLine=3670044;
 //BA.debugLineNum = 3670044;BA.debugLine="OrderStatus.Gravity = Gravity.CENTER";
_orderstatus.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3670046;
 //BA.debugLineNum = 3670046;BA.debugLine="holder.AddView(OrderCode,0,0,20%x,5%y)";
_holder.AddView((android.view.View)(_ordercode.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3670047;
 //BA.debugLineNum = 3670047;BA.debugLine="holder.AddView(OrderPrice,70%x,OrderCode.Top,Ord";
_holder.AddView((android.view.View)(_orderprice.getObject()),__c.PerXToCurrent((float) (70),ba),_ordercode.getTop(),_ordercode.getWidth(),(int) (_ordercode.getHeight()*2));
RDebugUtils.currentLine=3670048;
 //BA.debugLineNum = 3670048;BA.debugLine="holder.AddView(OrderStatus,OrderCode.Left,OrderC";
_holder.AddView((android.view.View)(_orderstatus.getObject()),_ordercode.getLeft(),(int) (_ordercode.getTop()+_ordercode.getHeight()),_ordercode.getWidth(),_ordercode.getHeight());
RDebugUtils.currentLine=3670050;
 //BA.debugLineNum = 3670050;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=3670051;
 //BA.debugLineNum = 3670051;BA.debugLine="OrderList.Panel.AddView(holder,0,0+(10%y + 1dip)";
__ref._orderlist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._orderlist.getPanel().getWidth(),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3670053;
 //BA.debugLineNum = 3670053;BA.debugLine="If row < CustomerOrders.Size - 1 Then";
if (_row<__ref._customerorders.getSize()-1) { 
RDebugUtils.currentLine=3670054;
 //BA.debugLineNum = 3670054;BA.debugLine="OrderList.Panel.Height = 10%y + ((10%y + 1dip)*";
__ref._orderlist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=3670055;
 //BA.debugLineNum = 3670055;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=3670058;
 //BA.debugLineNum = 3670058;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
__ref._cartpan.setColor(_appcolors._fadedblack);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
__ref._pblbase.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="pnlHeader.Color =  AppColors.FadedDarkRed";
__ref._pnlheader.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="CartPan.AddView(pblBase,0,42%y,90%x,2%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (42),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (2),ba));
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="CartPan.AddView(OrderList,0%x, 2%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._orderlist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (2),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="End Sub";
return "";
}
public double  _calcorderprice(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.objects.collections.List _goods) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "calcorderprice", false))
	 {return ((Double) Debug.delegate(ba, "calcorderprice", new Object[] {_goods}));}
double _result = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub CalcOrderPrice(Goods As List) As Double";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim result As Double = 0";
_result = 0;
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="For Each g As Good In Goods";
{
final anywheresoftware.b4a.BA.IterableList group2 = _goods;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="result = result + g.Price";
_result = _result+_g.Price;
 }
};
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Public OrderList As ScrollView";
_orderlist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Public CustomerOrders As Map";
_customerorders = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.diplomna.orderscart __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="CustomerOrders.Initialize";
__ref._customerorders.Initialize();
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="OrderList.Initialize(10%y)";
__ref._orderlist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="End Sub";
return "";
}
public String  _orderpan_click(b4a.diplomna.orderscart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderscart";
if (Debug.shouldDelegate(ba, "orderpan_click", false))
	 {return ((String) Debug.delegate(ba, "orderpan_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
b4a.diplomna.types._localorder _selectedorder = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub OrderPan_Click";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Dim SelectedOrder As LocalOrder = CustomerOrders.";
_selectedorder = (b4a.diplomna.types._localorder)(__ref._customerorders.Get(_pnl.getTag()));
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="CallSub2(Main,\"ShowOrderInfo\",SelectedOrder)";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"ShowOrderInfo",(Object)(_selectedorder));
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub TestWithFakes";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim g,g1,g2 As Good";
_g = new b4a.diplomna.types._good();
_g1 = new b4a.diplomna.types._good();
_g2 = new b4a.diplomna.types._good();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="g1.Initialize";
_g1.Initialize();
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="g2.Initialize";
_g2.Initialize();
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="g.Name = \"Coca Cola\"";
_g.Name = "Coca Cola";
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="g.PLU = 101";
_g.PLU = (int) (101);
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="g.Price = 1.20";
_g.Price = 1.20;
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="g1.Name = \"Coca\"";
_g1.Name = "Coca";
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="g1.PLU = 102";
_g1.PLU = (int) (102);
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="g1.Price = 120";
_g1.Price = 120;
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="g2.Name = \"Head N Shoulders\"";
_g2.Name = "Head N Shoulders";
RDebugUtils.currentLine=3801103;
 //BA.debugLineNum = 3801103;BA.debugLine="g2.PLU = 103";
_g2.PLU = (int) (103);
RDebugUtils.currentLine=3801104;
 //BA.debugLineNum = 3801104;BA.debugLine="g2.Price = 9.70";
_g2.Price = 9.70;
RDebugUtils.currentLine=3801106;
 //BA.debugLineNum = 3801106;BA.debugLine="Dim order1 As LocalOrder";
_order1 = new b4a.diplomna.types._localorder();
RDebugUtils.currentLine=3801108;
 //BA.debugLineNum = 3801108;BA.debugLine="order1.Initialize";
_order1.Initialize();
RDebugUtils.currentLine=3801109;
 //BA.debugLineNum = 3801109;BA.debugLine="order1.Goods.Initialize";
_order1.Goods.Initialize();
RDebugUtils.currentLine=3801110;
 //BA.debugLineNum = 3801110;BA.debugLine="order1.Goods.Add(g)";
_order1.Goods.Add((Object)(_g));
RDebugUtils.currentLine=3801111;
 //BA.debugLineNum = 3801111;BA.debugLine="order1.Goods.Add(g1)";
_order1.Goods.Add((Object)(_g1));
RDebugUtils.currentLine=3801112;
 //BA.debugLineNum = 3801112;BA.debugLine="order1.Goods.Add(g)";
_order1.Goods.Add((Object)(_g));
RDebugUtils.currentLine=3801113;
 //BA.debugLineNum = 3801113;BA.debugLine="order1.Goods.Add(g2)";
_order1.Goods.Add((Object)(_g2));
RDebugUtils.currentLine=3801115;
 //BA.debugLineNum = 3801115;BA.debugLine="order1.OrderCode = \"#asd14z24d\"";
_order1.OrderCode = "#asd14z24d";
RDebugUtils.currentLine=3801116;
 //BA.debugLineNum = 3801116;BA.debugLine="order1.OrderStatus = \"Waiting\"";
_order1.OrderStatus = "Waiting";
RDebugUtils.currentLine=3801117;
 //BA.debugLineNum = 3801117;BA.debugLine="order1.OrderTotalPrice = CalcOrderPrice(order1.Go";
_order1.OrderTotalPrice = __ref._calcorderprice(null,_order1.Goods);
RDebugUtils.currentLine=3801119;
 //BA.debugLineNum = 3801119;BA.debugLine="AddOrder(order1)";
__ref._addorder(null,_order1);
RDebugUtils.currentLine=3801131;
 //BA.debugLineNum = 3801131;BA.debugLine="End Sub";
return "";
}
}