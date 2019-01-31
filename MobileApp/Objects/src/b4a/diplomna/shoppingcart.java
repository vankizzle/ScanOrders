package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class shoppingcart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.shoppingcart");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.shoppingcart.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _itemnamelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _itempricelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemqttylbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _finalsumlbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _sumlbl = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _shoplist = null;
public anywheresoftware.b4a.objects.collections.Map _scanneditems = null;
public anywheresoftware.b4a.objects.collections.Map _itemssuppliers = null;
public b4a.diplomna.types._good _currentitem = null;
public b4a.diplomna.types._supplier _currentsupplier = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.shoppingcart __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="ScannedItems.Initialize";
__ref._scanneditems.Initialize();
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="CurrentItem.Initialize";
__ref._currentitem.Initialize();
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="CurrentSupplier.Initialize";
__ref._currentsupplier.Initialize();
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="ItemsSuppliers.Initialize";
__ref._itemssuppliers.Initialize();
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="ItemNamelbl.Initialize(\"\")";
__ref._itemnamelbl.Initialize(ba,"");
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="ItemPricelbl.Initialize(\"\")";
__ref._itempricelbl.Initialize(ba,"");
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="ItemQttylbl.Initialize(\"\")";
__ref._itemqttylbl.Initialize(ba,"");
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="FinalSumlbl.Initialize(\"\")";
__ref._finalsumlbl.Initialize(ba,"");
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="Sumlbl.Initialize(\"\")";
__ref._sumlbl.Initialize(ba,"");
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="ShopList.Initialize(10%y)";
__ref._shoplist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3866641;
 //BA.debugLineNum = 3866641;BA.debugLine="BuildCartUI";
__ref._buildcartui(null);
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="End Sub";
return "";
}
public String  _additemtobasket(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._good _g) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "additemtobasket", false))
	 {return ((String) Debug.delegate(ba, "additemtobasket", new Object[] {_g}));}
b4a.diplomna.types._good _item = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub AddItemToBasket(g As Good)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="If ScannedItems.ContainsKey(g.ID) Then";
if (__ref._scanneditems.ContainsKey((Object)(_g.ID))) { 
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim Item As Good = ScannedItems.Get(g.ID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_g.ID)));
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Item.Qtty = Item.Qtty + 1";
_item.Qtty = (int) (_item.Qtty+1);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="ScannedItems.Put(Item.ID,Item)";
__ref._scanneditems.Put((Object)(_item.ID),(Object)(_item));
 }else {
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="End Sub";
return "";
}
public String  _buildcart(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "buildcart", false))
	 {return ((String) Debug.delegate(ba, "buildcart", null));}
int _row = 0;
b4a.diplomna.types._good _g = null;
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _itemname = null;
anywheresoftware.b4a.objects.LabelWrapper _itemprice = null;
anywheresoftware.b4a.objects.LabelWrapper _itemqtty = null;
anywheresoftware.b4a.objects.ButtonWrapper _delitemx = null;
anywheresoftware.b4a.objects.ButtonWrapper _additem = null;
anywheresoftware.b4a.objects.ButtonWrapper _delitem = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="ShopList.Panel.RemoveAllViews";
__ref._shoplist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._scanneditems.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_g = (b4a.diplomna.types._good)(group3.Get(index3));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="Private itemName,itemPrice,itemQtty As Label";
_itemname = new anywheresoftware.b4a.objects.LabelWrapper();
_itemprice = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqtty = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="Private delitemX,additem,delitem As Button";
_delitemx = new anywheresoftware.b4a.objects.ButtonWrapper();
_additem = new anywheresoftware.b4a.objects.ButtonWrapper();
_delitem = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="holder.Initialize(\"SelectItemFromBasket\")";
_holder.Initialize(ba,"SelectItemFromBasket");
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="itemQtty.Initialize(\"\")";
_itemqtty.Initialize(ba,"");
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="itemName.Initialize(\"\")";
_itemname.Initialize(ba,"");
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="itemPrice.Initialize(\"\")";
_itemprice.Initialize(ba,"");
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="delitemX.Initialize(\"RemoveItemFromBasket\")";
_delitemx.Initialize(ba,"RemoveItemFromBasket");
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="additem.Initialize(\"AddQtty\")";
_additem.Initialize(ba,"AddQtty");
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="delitem.Initialize(\"DelQtty\")";
_delitem.Initialize(ba,"DelQtty");
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="holder.Tag = g.ID";
_holder.setTag((Object)(_g.ID));
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="itemName.Text = g.Name";
_itemname.setText(BA.ObjectToCharSequence(_g.Name));
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="itemName.Gravity = Gravity.CENTER";
_itemname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="itemName.TextColor =  Colors.DarkGray";
_itemname.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=4522008;
 //BA.debugLineNum = 4522008;BA.debugLine="itemPrice.Text = g.Price";
_itemprice.setText(BA.ObjectToCharSequence(_g.Price));
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="itemPrice.Gravity = Gravity.CENTER";
_itemprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="itemPrice.TextColor =  Colors.DarkGray";
_itemprice.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=4522013;
 //BA.debugLineNum = 4522013;BA.debugLine="itemQtty.Text = g.Qtty";
_itemqtty.setText(BA.ObjectToCharSequence(_g.Qtty));
RDebugUtils.currentLine=4522014;
 //BA.debugLineNum = 4522014;BA.debugLine="itemQtty.Gravity = Gravity.CENTER";
_itemqtty.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4522015;
 //BA.debugLineNum = 4522015;BA.debugLine="itemQtty.TextColor =  Colors.DarkGray";
_itemqtty.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=4522018;
 //BA.debugLineNum = 4522018;BA.debugLine="holder.AddView(itemName, 0, 0, 20%x, 5%y)";
_holder.AddView((android.view.View)(_itemname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4522019;
 //BA.debugLineNum = 4522019;BA.debugLine="holder.AddView(itemPrice, itemName.Left + itemNa";
_holder.AddView((android.view.View)(_itemprice.getObject()),(int) (_itemname.getLeft()+_itemname.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4522020;
 //BA.debugLineNum = 4522020;BA.debugLine="holder.AddView(itemQtty, itemPrice.Left + itemPr";
_holder.AddView((android.view.View)(_itemqtty.getObject()),(int) (_itemprice.getLeft()+_itemprice.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4522021;
 //BA.debugLineNum = 4522021;BA.debugLine="holder.AddView(additem, itemQtty.Left + itemQtty";
_holder.AddView((android.view.View)(_additem.getObject()),(int) (_itemqtty.getLeft()+_itemqtty.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4522022;
 //BA.debugLineNum = 4522022;BA.debugLine="holder.AddView(delitem, additem.Left + additem.W";
_holder.AddView((android.view.View)(_delitem.getObject()),(int) (_additem.getLeft()+_additem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4522023;
 //BA.debugLineNum = 4522023;BA.debugLine="holder.AddView(delitemX, delitem.Left + delitem.";
_holder.AddView((android.view.View)(_delitemx.getObject()),(int) (_delitem.getLeft()+_delitem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4522025;
 //BA.debugLineNum = 4522025;BA.debugLine="delitemX.Text = \"x\"";
_delitemx.setText(BA.ObjectToCharSequence("x"));
RDebugUtils.currentLine=4522026;
 //BA.debugLineNum = 4522026;BA.debugLine="delitemX.TextSize = 14";
_delitemx.setTextSize((float) (14));
RDebugUtils.currentLine=4522027;
 //BA.debugLineNum = 4522027;BA.debugLine="delitemX.Gravity = Gravity.CENTER";
_delitemx.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4522028;
 //BA.debugLineNum = 4522028;BA.debugLine="delitemX.TextColor =  AppColors.FadedDarkRed";
_delitemx.setTextColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=4522029;
 //BA.debugLineNum = 4522029;BA.debugLine="delitemX.Color = AppColors.Transparent";
_delitemx.setColor(_appcolors._transparent);
RDebugUtils.currentLine=4522030;
 //BA.debugLineNum = 4522030;BA.debugLine="delitemX.Tag = g.ID";
_delitemx.setTag((Object)(_g.ID));
RDebugUtils.currentLine=4522032;
 //BA.debugLineNum = 4522032;BA.debugLine="additem.Text = \"+\"";
_additem.setText(BA.ObjectToCharSequence("+"));
RDebugUtils.currentLine=4522033;
 //BA.debugLineNum = 4522033;BA.debugLine="additem.TextSize = 14";
_additem.setTextSize((float) (14));
RDebugUtils.currentLine=4522034;
 //BA.debugLineNum = 4522034;BA.debugLine="additem.Textcolor = AppColors.Black";
_additem.setTextColor(_appcolors._black);
RDebugUtils.currentLine=4522035;
 //BA.debugLineNum = 4522035;BA.debugLine="additem.Color = AppColors.Transparent";
_additem.setColor(_appcolors._transparent);
RDebugUtils.currentLine=4522036;
 //BA.debugLineNum = 4522036;BA.debugLine="additem.Gravity = Gravity.CENTER";
_additem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4522037;
 //BA.debugLineNum = 4522037;BA.debugLine="additem.Tag = g.ID";
_additem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=4522039;
 //BA.debugLineNum = 4522039;BA.debugLine="delitem.Text = \"-\"";
_delitem.setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=4522040;
 //BA.debugLineNum = 4522040;BA.debugLine="delitem.Textsize = 14";
_delitem.setTextSize((float) (14));
RDebugUtils.currentLine=4522041;
 //BA.debugLineNum = 4522041;BA.debugLine="delitem.TextColor = AppColors.Black";
_delitem.setTextColor(_appcolors._black);
RDebugUtils.currentLine=4522042;
 //BA.debugLineNum = 4522042;BA.debugLine="delitem.Color = AppColors.Transparent";
_delitem.setColor(_appcolors._transparent);
RDebugUtils.currentLine=4522043;
 //BA.debugLineNum = 4522043;BA.debugLine="delitem.Gravity = Gravity.CENTER";
_delitem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4522044;
 //BA.debugLineNum = 4522044;BA.debugLine="delitem.Tag = g.ID";
_delitem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=4522046;
 //BA.debugLineNum = 4522046;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=4522047;
 //BA.debugLineNum = 4522047;BA.debugLine="ShopList.Panel.AddView(holder,0,0+(5%y + 1dip)*r";
__ref._shoplist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._shoplist.getPanel().getWidth(),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4522049;
 //BA.debugLineNum = 4522049;BA.debugLine="If row < ScannedItems.Size - 1 Then";
if (_row<__ref._scanneditems.getSize()-1) { 
RDebugUtils.currentLine=4522050;
 //BA.debugLineNum = 4522050;BA.debugLine="ShopList.Panel.Height = 10%y + ((5%y + 1dip)*ro";
__ref._shoplist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=4522051;
 //BA.debugLineNum = 4522051;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=4522055;
 //BA.debugLineNum = 4522055;BA.debugLine="RefreshOverall";
__ref._refreshoverall(null);
RDebugUtils.currentLine=4522056;
 //BA.debugLineNum = 4522056;BA.debugLine="End Sub";
return "";
}
public String  _addqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addqtty_click", false))
	 {return ((String) Debug.delegate(ba, "addqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub AddQtty_Click";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get(_btn.getTag()));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="g.Qtty = g.Qtty + 1";
_g.Qtty = (int) (_g.Qtty+1);
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="End Sub";
return "";
}
public String  _addsupplier(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._supplier _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addsupplier", false))
	 {return ((String) Debug.delegate(ba, "addsupplier", new Object[] {_s}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub AddSupplier(s As Supplier)";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="ItemsSuppliers.Put(s.ID,s)";
__ref._itemssuppliers.Put((Object)(_s.ID),(Object)(_s));
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public String  _refreshoverall(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "refreshoverall", false))
	 {return ((String) Debug.delegate(ba, "refreshoverall", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub RefreshOverall";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Sumlbl.Text =  NumberFormat2(CalculateSum,1,2,2,F";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__c.NumberFormat2(__ref._calculatesum(null),(int) (1),(int) (2),(int) (2),__c.False)));
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
public String  _buildcartui(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "buildcartui", false))
	 {return ((String) Debug.delegate(ba, "buildcartui", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub BuildCartUI";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
__ref._cartpan.setColor(_appcolors._fadedblack);
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
__ref._pblbase.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="pnlHeader.Color = AppColors.FadedDarkRed";
__ref._pnlheader.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="CartPan.AddView(pblBase,0,45%y,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="ItemNamelbl.Text = \"Name\"";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
__ref._itemnamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
__ref._itemnamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="ItemPricelbl.Text = \"Price\"";
__ref._itempricelbl.setText(BA.ObjectToCharSequence("Price"));
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="ItemPricelbl.Gravity = Gravity.CENTER";
__ref._itempricelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="ItemPricelbl.TextColor = Colors.White";
__ref._itempricelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3932176;
 //BA.debugLineNum = 3932176;BA.debugLine="ItemQttylbl.Text = \"Quantity\"";
__ref._itemqttylbl.setText(BA.ObjectToCharSequence("Quantity"));
RDebugUtils.currentLine=3932177;
 //BA.debugLineNum = 3932177;BA.debugLine="ItemQttylbl.Gravity = Gravity.CENTER";
__ref._itemqttylbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3932178;
 //BA.debugLineNum = 3932178;BA.debugLine="ItemQttylbl.TextColor = Colors.White";
__ref._itemqttylbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="FinalSumlbl.Text = \"Total\"";
__ref._finalsumlbl.setText(BA.ObjectToCharSequence("Total"));
RDebugUtils.currentLine=3932181;
 //BA.debugLineNum = 3932181;BA.debugLine="FinalSumlbl.Gravity = Gravity.CENTER";
__ref._finalsumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3932182;
 //BA.debugLineNum = 3932182;BA.debugLine="FinalSumlbl.TextColor = Colors.White";
__ref._finalsumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3932184;
 //BA.debugLineNum = 3932184;BA.debugLine="Sumlbl.Text = CalculateSum";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__ref._calculatesum(null)));
RDebugUtils.currentLine=3932185;
 //BA.debugLineNum = 3932185;BA.debugLine="Sumlbl.Gravity = Gravity.CENTER";
__ref._sumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3932186;
 //BA.debugLineNum = 3932186;BA.debugLine="Sumlbl.TextColor = Colors.White";
__ref._sumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3932188;
 //BA.debugLineNum = 3932188;BA.debugLine="pnlHeader.AddView(ItemNamelbl, 0, 0, 20%x, 5%y)";
__ref._pnlheader.AddView((android.view.View)(__ref._itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3932189;
 //BA.debugLineNum = 3932189;BA.debugLine="pnlHeader.AddView(ItemPricelbl,  ItemNamelbl.Left";
__ref._pnlheader.AddView((android.view.View)(__ref._itempricelbl.getObject()),(int) (__ref._itemnamelbl.getLeft()+__ref._itemnamelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3932190;
 //BA.debugLineNum = 3932190;BA.debugLine="pnlHeader.AddView(ItemQttylbl,   ItemPricelbl.Lef";
__ref._pnlheader.AddView((android.view.View)(__ref._itemqttylbl.getObject()),(int) (__ref._itempricelbl.getLeft()+__ref._itempricelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3932192;
 //BA.debugLineNum = 3932192;BA.debugLine="pblBase.AddView(FinalSumlbl, 0, 0, 20%x, 5%y)";
__ref._pblbase.AddView((android.view.View)(__ref._finalsumlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3932193;
 //BA.debugLineNum = 3932193;BA.debugLine="pblBase.AddView(Sumlbl, FinalSumlbl.Left + FinalS";
__ref._pblbase.AddView((android.view.View)(__ref._sumlbl.getObject()),(int) (__ref._finalsumlbl.getLeft()+__ref._finalsumlbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3932195;
 //BA.debugLineNum = 3932195;BA.debugLine="CartPan.AddView(ShopList,0%x, 5%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._shoplist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=3932196;
 //BA.debugLineNum = 3932196;BA.debugLine="End Sub";
return "";
}
public double  _calculatesum(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "calculatesum", false))
	 {return ((Double) Debug.delegate(ba, "calculatesum", null));}
double _sum = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub CalculateSum As Double";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim sum As Double = 0";
_sum = 0;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._scanneditems.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="sum = sum + (g.Qtty*GetGoodPrice(g.ID))";
_sum = _sum+(_g.Qtty*__ref._getgoodprice(null,_g.ID));
 }
};
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Return sum";
if (true) return _sum;
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="End Sub";
return 0;
}
public double  _getgoodprice(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "getgoodprice", false))
	 {return ((Double) Debug.delegate(ba, "getgoodprice", new Object[] {_goodid}));}
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub GetGoodPrice(GoodID As Int) As Double";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim g As Good = ScannedItems.Get(GoodID)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Return g.Price";
if (true) return _g.Price;
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Private ItemNamelbl,ItemPricelbl,ItemQttylbl,Fina";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_finalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_sumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Public ShopList As ScrollView";
_shoplist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Public ScannedItems As Map";
_scanneditems = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="Public ItemsSuppliers As Map";
_itemssuppliers = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="Public CurrentItem As Good";
_currentitem = new b4a.diplomna.types._good();
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="Public CurrentSupplier As Supplier";
_currentsupplier = new b4a.diplomna.types._supplier();
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="End Sub";
return "";
}
public String  _delqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "delqtty_click", false))
	 {return ((String) Debug.delegate(ba, "delqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub DelQtty_Click";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get(_btn.getTag()));
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="g.Qtty = g.Qtty - 1";
_g.Qtty = (int) (_g.Qtty-1);
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="If g.Qtty <= 0 Then";
if (_g.Qtty<=0) { 
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="ScannedItems.Remove(g.ID)";
__ref._scanneditems.Remove((Object)(_g.ID));
 }else {
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="End Sub";
return "";
}
public void  _getitemfromdb(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "getitemfromdb", false))
	 {Debug.delegate(ba, "getitemfromdb", new Object[] {_goodid}); return;}
ResumableSub_GetItemFromDB rsub = new ResumableSub_GetItemFromDB(this,__ref,_goodid);
rsub.resume(ba, null);
}
public static class ResumableSub_GetItemFromDB extends BA.ResumableSub {
public ResumableSub_GetItemFromDB(b4a.diplomna.shoppingcart parent,b4a.diplomna.shoppingcart __ref,int _goodid) {
this.parent = parent;
this.__ref = __ref;
this._goodid = _goodid;
this.__ref = parent;
}
b4a.diplomna.shoppingcart __ref;
b4a.diplomna.shoppingcart parent;
int _goodid;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _getgood = null;
Object _result = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _getsupplier = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="shoppingcart";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim GetGood As ResumableSub = Main.HTTP.GetGoodBy";
_getgood = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getgood = parent._main._http._getgoodbyid(null,_goodid);
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Wait For (GetGood)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "shoppingcart", "getitemfromdb"), _getgood);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="CurrentItem = JSONSerializations.SerializeGood(Ma";
__ref._currentitem = parent._jsonserializations._serializegood(ba,parent._main._http._output);
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="CurrentItem.Qtty = 1";
__ref._currentitem.Qtty = (int) (1);
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="Dim GetSupplier As ResumableSub = Main.HTTP.GetSu";
_getsupplier = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getsupplier = parent._main._http._getsupplierbyid(null,__ref._currentitem.SupplierID);
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="Wait For (GetSupplier)  Complete (Result As Objec";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "shoppingcart", "getitemfromdb"), _getsupplier);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="CurrentSupplier = JSONSerializations.SerializeSup";
__ref._currentsupplier = parent._jsonserializations._serializesupplier(ba,parent._main._http._output);
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="AddSupplier(CurrentSupplier)";
__ref._addsupplier(null,__ref._currentsupplier);
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="AddItemToBasket(CurrentItem)";
__ref._additemtobasket(null,__ref._currentitem);
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _removeitemfrombasket(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket", false))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket", new Object[] {_goodid}));}
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub RemoveItemFromBasket(GoodID As Int)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(GoodID)";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_goodid)));
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="ItemsSuppliers.Remove(s.ID)";
__ref._itemssuppliers.Remove((Object)(_s.ID));
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="ScannedItems.Remove(GoodID)";
__ref._scanneditems.Remove((Object)(_goodid));
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket_click", false))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub RemoveItemFromBasket_Click";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="RemoveItemFromBasket(btn.Tag)";
__ref._removeitemfrombasket(null,(int)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="End Sub";
return "";
}
public String  _selectitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "selectitemfrombasket_click", false))
	 {return ((String) Debug.delegate(ba, "selectitemfrombasket_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub SelectItemFromBasket_Click";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="ViewSelectedItemInfo(pnl.Tag)";
__ref._viewselectediteminfo(null,(int)(BA.ObjectToNumber(_pnl.getTag())));
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Log(\"Clicked \" & pnl.Tag)";
__c.LogImpl("24849668","Clicked "+BA.ObjectToString(_pnl.getTag()),0);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="End Sub";
return "";
}
public String  _viewselectediteminfo(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "viewselectediteminfo", false))
	 {return ((String) Debug.delegate(ba, "viewselectediteminfo", new Object[] {_goodid}));}
b4a.diplomna.types._good _item = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub ViewSelectedItemInfo(GoodID As Int)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim item As Good = ScannedItems.Get(GoodID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(item.Suppl";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_item.SupplierID)));
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="CallSub3(Main,\"ShowItemInfo\",item,s)";
__c.CallSubDebug3(ba,(Object)(_main.getObject()),"ShowItemInfo",(Object)(_item),(Object)(_s));
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes(b4a.diplomna.shoppingcart __ref,int _num) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "testwithfakes", false))
	 {return ((String) Debug.delegate(ba, "testwithfakes", new Object[] {_num}));}
int _i = 0;
b4a.diplomna.types._good _g = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub TestWithFakes(num As Int)";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="For i = 0 To num";
{
final int step1 = 1;
final int limit1 = _num;
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim g As Good";
_g = new b4a.diplomna.types._good();
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Dim s As Supplier";
_s = new b4a.diplomna.types._supplier();
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="g.ID = i";
_g.ID = _i;
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="g.SupplierID = i";
_g.SupplierID = _i;
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="g.Qtty = 1";
_g.Qtty = (int) (1);
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="g.Name = \"Name\"&i";
_g.Name = "Name"+BA.NumberToString(_i);
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="g.PLU = 100+i";
_g.PLU = (int) (100+_i);
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="g.Price = 5.99 + i";
_g.Price = 5.99+_i;
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="g.Description = \"nothing\"";
_g.Description = "nothing";
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="g.Is_Discontinued = 0";
_g.Is_Discontinued = (int) (0);
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="s.ID = i";
_s.ID = _i;
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="s.SupplierName = \"Micro\"&i";
_s.SupplierName = "Micro"+BA.NumberToString(_i);
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="s.SupploerPhone = \"088896451\"&i";
_s.SupploerPhone = "088896451"+BA.NumberToString(_i);
RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="AddItemToBasket(g)";
__ref._additemtobasket(null,_g);
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="AddSupplier(s)";
__ref._addsupplier(null,_s);
 }
};
RDebugUtils.currentLine=4784150;
 //BA.debugLineNum = 4784150;BA.debugLine="End Sub";
return "";
}
}