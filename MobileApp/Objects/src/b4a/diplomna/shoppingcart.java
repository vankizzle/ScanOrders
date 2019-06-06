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
public anywheresoftware.b4a.objects.ButtonWrapper _finishorderbtn = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _additemtobasket(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._good _g) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "additemtobasket", false))
	 {return ((String) Debug.delegate(ba, "additemtobasket", new Object[] {_g}));}
b4a.diplomna.types._good _item = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub AddItemToBasket(g As Good)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If ScannedItems.ContainsKey(g.ID) Then";
if (__ref._scanneditems.ContainsKey((Object)(_g.ID))) { 
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim Item As Good = ScannedItems.Get(g.ID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_g.ID)));
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Item.Qtty = Item.Qtty + 1";
_item.Qtty = (int) (_item.Qtty+1);
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="ScannedItems.Put(Item.ID,Item)";
__ref._scanneditems.Put((Object)(_item.ID),(Object)(_item));
 }else {
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="ShopList.Panel.RemoveAllViews";
__ref._shoplist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._scanneditems.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_g = (b4a.diplomna.types._good)(group3.Get(index3));
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Private itemName,itemPrice,itemQtty As Label";
_itemname = new anywheresoftware.b4a.objects.LabelWrapper();
_itemprice = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqtty = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="Private delitemX,additem,delitem As Button";
_delitemx = new anywheresoftware.b4a.objects.ButtonWrapper();
_additem = new anywheresoftware.b4a.objects.ButtonWrapper();
_delitem = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="holder.Initialize(\"SelectItemFromBasket\")";
_holder.Initialize(ba,"SelectItemFromBasket");
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="itemQtty.Initialize(\"\")";
_itemqtty.Initialize(ba,"");
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="itemName.Initialize(\"\")";
_itemname.Initialize(ba,"");
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="itemPrice.Initialize(\"\")";
_itemprice.Initialize(ba,"");
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="delitemX.Initialize(\"RemoveItemFromBasket\")";
_delitemx.Initialize(ba,"RemoveItemFromBasket");
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="additem.Initialize(\"AddQtty\")";
_additem.Initialize(ba,"AddQtty");
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="delitem.Initialize(\"DelQtty\")";
_delitem.Initialize(ba,"DelQtty");
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="holder.Tag = g.ID";
_holder.setTag((Object)(_g.ID));
RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="itemName.Text = g.Name";
_itemname.setText(BA.ObjectToCharSequence(_g.Name));
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="itemName.Gravity = Gravity.CENTER";
_itemname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4784149;
 //BA.debugLineNum = 4784149;BA.debugLine="itemName.TextColor =  Colors.DarkGray";
_itemname.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=4784152;
 //BA.debugLineNum = 4784152;BA.debugLine="itemPrice.Text = g.Price";
_itemprice.setText(BA.ObjectToCharSequence(_g.Price));
RDebugUtils.currentLine=4784153;
 //BA.debugLineNum = 4784153;BA.debugLine="itemPrice.Gravity = Gravity.CENTER";
_itemprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4784154;
 //BA.debugLineNum = 4784154;BA.debugLine="itemPrice.TextColor =  Colors.DarkGray";
_itemprice.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=4784157;
 //BA.debugLineNum = 4784157;BA.debugLine="itemQtty.Text = g.Qtty";
_itemqtty.setText(BA.ObjectToCharSequence(_g.Qtty));
RDebugUtils.currentLine=4784158;
 //BA.debugLineNum = 4784158;BA.debugLine="itemQtty.Gravity = Gravity.CENTER";
_itemqtty.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4784159;
 //BA.debugLineNum = 4784159;BA.debugLine="itemQtty.TextColor =  Colors.DarkGray";
_itemqtty.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=4784162;
 //BA.debugLineNum = 4784162;BA.debugLine="holder.AddView(itemName, 0, 0, 20%x, 5%y)";
_holder.AddView((android.view.View)(_itemname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4784163;
 //BA.debugLineNum = 4784163;BA.debugLine="holder.AddView(itemPrice, itemName.Left + itemNa";
_holder.AddView((android.view.View)(_itemprice.getObject()),(int) (_itemname.getLeft()+_itemname.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4784164;
 //BA.debugLineNum = 4784164;BA.debugLine="holder.AddView(itemQtty, itemPrice.Left + itemPr";
_holder.AddView((android.view.View)(_itemqtty.getObject()),(int) (_itemprice.getLeft()+_itemprice.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4784165;
 //BA.debugLineNum = 4784165;BA.debugLine="holder.AddView(additem, itemQtty.Left + itemQtty";
_holder.AddView((android.view.View)(_additem.getObject()),(int) (_itemqtty.getLeft()+_itemqtty.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4784166;
 //BA.debugLineNum = 4784166;BA.debugLine="holder.AddView(delitem, additem.Left + additem.W";
_holder.AddView((android.view.View)(_delitem.getObject()),(int) (_additem.getLeft()+_additem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4784167;
 //BA.debugLineNum = 4784167;BA.debugLine="holder.AddView(delitemX, delitem.Left + delitem.";
_holder.AddView((android.view.View)(_delitemx.getObject()),(int) (_delitem.getLeft()+_delitem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4784169;
 //BA.debugLineNum = 4784169;BA.debugLine="delitemX.Text = \"x\"";
_delitemx.setText(BA.ObjectToCharSequence("x"));
RDebugUtils.currentLine=4784170;
 //BA.debugLineNum = 4784170;BA.debugLine="delitemX.TextSize = 14";
_delitemx.setTextSize((float) (14));
RDebugUtils.currentLine=4784171;
 //BA.debugLineNum = 4784171;BA.debugLine="delitemX.Gravity = Gravity.CENTER";
_delitemx.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4784172;
 //BA.debugLineNum = 4784172;BA.debugLine="delitemX.Padding = Array As Int (0dip, 0dip, 0di";
_delitemx.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=4784173;
 //BA.debugLineNum = 4784173;BA.debugLine="delitemX.TextColor =  AppColors.FadedDarkRed";
_delitemx.setTextColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=4784174;
 //BA.debugLineNum = 4784174;BA.debugLine="delitemX.Color = AppColors.Transparent";
_delitemx.setColor(_appcolors._transparent);
RDebugUtils.currentLine=4784175;
 //BA.debugLineNum = 4784175;BA.debugLine="delitemX.Tag = g.ID";
_delitemx.setTag((Object)(_g.ID));
RDebugUtils.currentLine=4784177;
 //BA.debugLineNum = 4784177;BA.debugLine="additem.Text = \"+\"";
_additem.setText(BA.ObjectToCharSequence("+"));
RDebugUtils.currentLine=4784178;
 //BA.debugLineNum = 4784178;BA.debugLine="additem.TextSize = 14";
_additem.setTextSize((float) (14));
RDebugUtils.currentLine=4784179;
 //BA.debugLineNum = 4784179;BA.debugLine="additem.Textcolor = AppColors.Black";
_additem.setTextColor(_appcolors._black);
RDebugUtils.currentLine=4784180;
 //BA.debugLineNum = 4784180;BA.debugLine="additem.Padding = Array As Int (0dip, 0dip, 0dip";
_additem.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=4784181;
 //BA.debugLineNum = 4784181;BA.debugLine="additem.Color = AppColors.Transparent";
_additem.setColor(_appcolors._transparent);
RDebugUtils.currentLine=4784182;
 //BA.debugLineNum = 4784182;BA.debugLine="additem.Gravity = Gravity.CENTER";
_additem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4784183;
 //BA.debugLineNum = 4784183;BA.debugLine="additem.Tag = g.ID";
_additem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=4784185;
 //BA.debugLineNum = 4784185;BA.debugLine="delitem.Text = \"-\"";
_delitem.setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=4784186;
 //BA.debugLineNum = 4784186;BA.debugLine="delitem.Textsize = 14";
_delitem.setTextSize((float) (14));
RDebugUtils.currentLine=4784187;
 //BA.debugLineNum = 4784187;BA.debugLine="delitem.TextColor = AppColors.Black";
_delitem.setTextColor(_appcolors._black);
RDebugUtils.currentLine=4784188;
 //BA.debugLineNum = 4784188;BA.debugLine="delitem.Padding = Array As Int (0dip, 0dip, 0dip";
_delitem.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=4784189;
 //BA.debugLineNum = 4784189;BA.debugLine="delitem.Color = AppColors.Transparent";
_delitem.setColor(_appcolors._transparent);
RDebugUtils.currentLine=4784190;
 //BA.debugLineNum = 4784190;BA.debugLine="delitem.Gravity = Gravity.CENTER";
_delitem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4784191;
 //BA.debugLineNum = 4784191;BA.debugLine="delitem.Tag = g.ID";
_delitem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=4784193;
 //BA.debugLineNum = 4784193;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=4784194;
 //BA.debugLineNum = 4784194;BA.debugLine="ShopList.Panel.AddView(holder,0,0+(5%y + 1dip)*r";
__ref._shoplist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._shoplist.getPanel().getWidth(),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4784196;
 //BA.debugLineNum = 4784196;BA.debugLine="If row < ScannedItems.Size - 1 Then";
if (_row<__ref._scanneditems.getSize()-1) { 
RDebugUtils.currentLine=4784197;
 //BA.debugLineNum = 4784197;BA.debugLine="ShopList.Panel.Height = 10%y + ((5%y + 1dip)*ro";
__ref._shoplist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=4784198;
 //BA.debugLineNum = 4784198;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=4784202;
 //BA.debugLineNum = 4784202;BA.debugLine="RefreshOverall";
__ref._refreshoverall(null);
RDebugUtils.currentLine=4784203;
 //BA.debugLineNum = 4784203;BA.debugLine="End Sub";
return "";
}
public String  _addqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addqtty_click", false))
	 {return ((String) Debug.delegate(ba, "addqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub AddQtty_Click";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get(_btn.getTag()));
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="g.Qtty = g.Qtty + 1";
_g.Qtty = (int) (_g.Qtty+1);
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="End Sub";
return "";
}
public String  _addsupplier(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._supplier _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addsupplier", false))
	 {return ((String) Debug.delegate(ba, "addsupplier", new Object[] {_s}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub AddSupplier(s As Supplier)";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="ItemsSuppliers.Put(s.ID,s)";
__ref._itemssuppliers.Put((Object)(_s.ID),(Object)(_s));
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return null;
}
public String  _refreshoverall(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "refreshoverall", false))
	 {return ((String) Debug.delegate(ba, "refreshoverall", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub RefreshOverall";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Sumlbl.Text =  NumberFormat2(CalculateSum,1,2,2,F";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__c.NumberFormat2(__ref._calculatesum(null),(int) (1),(int) (2),(int) (2),__c.False)));
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return "";
}
public String  _buildcartui(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "buildcartui", false))
	 {return ((String) Debug.delegate(ba, "buildcartui", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub BuildCartUI";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
__ref._cartpan.setColor(_appcolors._fadedblack);
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
__ref._pblbase.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="pnlHeader.Color = AppColors.FadedDarkRed";
__ref._pnlheader.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="CartPan.AddView(pblBase,0,45%y,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="ItemNamelbl.Text = \"Name\"";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
__ref._itemnamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
__ref._itemnamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="ItemPricelbl.Text = \"Price\"";
__ref._itempricelbl.setText(BA.ObjectToCharSequence("Price"));
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="ItemPricelbl.Gravity = Gravity.CENTER";
__ref._itempricelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="ItemPricelbl.TextColor = Colors.White";
__ref._itempricelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4194320;
 //BA.debugLineNum = 4194320;BA.debugLine="ItemQttylbl.Text = \"Quantity\"";
__ref._itemqttylbl.setText(BA.ObjectToCharSequence("Quantity"));
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="ItemQttylbl.Gravity = Gravity.CENTER";
__ref._itemqttylbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="ItemQttylbl.TextColor = Colors.White";
__ref._itemqttylbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="FinalSumlbl.Text = \"Total\"";
__ref._finalsumlbl.setText(BA.ObjectToCharSequence("Total"));
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="FinalSumlbl.Gravity = Gravity.CENTER";
__ref._finalsumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4194326;
 //BA.debugLineNum = 4194326;BA.debugLine="FinalSumlbl.TextColor = Colors.White";
__ref._finalsumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4194328;
 //BA.debugLineNum = 4194328;BA.debugLine="Sumlbl.Text = CalculateSum";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__ref._calculatesum(null)));
RDebugUtils.currentLine=4194329;
 //BA.debugLineNum = 4194329;BA.debugLine="Sumlbl.Gravity = Gravity.CENTER";
__ref._sumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4194330;
 //BA.debugLineNum = 4194330;BA.debugLine="Sumlbl.TextColor = Colors.White";
__ref._sumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4194332;
 //BA.debugLineNum = 4194332;BA.debugLine="FinishOrderbtn.Text = \"Finish\"";
__ref._finishorderbtn.setText(BA.ObjectToCharSequence("Finish"));
RDebugUtils.currentLine=4194333;
 //BA.debugLineNum = 4194333;BA.debugLine="FinishOrderbtn.Gravity = Gravity.CENTER";
__ref._finishorderbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4194334;
 //BA.debugLineNum = 4194334;BA.debugLine="FinishOrderbtn.TextColor = Colors.White";
__ref._finishorderbtn.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4194335;
 //BA.debugLineNum = 4194335;BA.debugLine="FinishOrderbtn.Padding = Array As Int (0dip, 0dip";
__ref._finishorderbtn.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
RDebugUtils.currentLine=4194336;
 //BA.debugLineNum = 4194336;BA.debugLine="FinishOrderbtn.Color = AppColors.LightGray";
__ref._finishorderbtn.setColor(_appcolors._lightgray);
RDebugUtils.currentLine=4194338;
 //BA.debugLineNum = 4194338;BA.debugLine="pnlHeader.AddView(ItemNamelbl, 0, 0, 20%x, 5%y)";
__ref._pnlheader.AddView((android.view.View)(__ref._itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4194339;
 //BA.debugLineNum = 4194339;BA.debugLine="pnlHeader.AddView(ItemPricelbl,  ItemNamelbl.Left";
__ref._pnlheader.AddView((android.view.View)(__ref._itempricelbl.getObject()),(int) (__ref._itemnamelbl.getLeft()+__ref._itemnamelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4194340;
 //BA.debugLineNum = 4194340;BA.debugLine="pnlHeader.AddView(ItemQttylbl,   ItemPricelbl.Lef";
__ref._pnlheader.AddView((android.view.View)(__ref._itemqttylbl.getObject()),(int) (__ref._itempricelbl.getLeft()+__ref._itempricelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4194342;
 //BA.debugLineNum = 4194342;BA.debugLine="pblBase.AddView(FinishOrderbtn, 65%x , 0, 25%x ,";
__ref._pblbase.AddView((android.view.View)(__ref._finishorderbtn.getObject()),__c.PerXToCurrent((float) (65),ba),(int) (0),__c.PerXToCurrent((float) (25),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4194343;
 //BA.debugLineNum = 4194343;BA.debugLine="pblBase.AddView(FinalSumlbl, 0, 0, 20%x, 5%y)";
__ref._pblbase.AddView((android.view.View)(__ref._finalsumlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4194344;
 //BA.debugLineNum = 4194344;BA.debugLine="pblBase.AddView(Sumlbl, FinalSumlbl.Left + FinalS";
__ref._pblbase.AddView((android.view.View)(__ref._sumlbl.getObject()),(int) (__ref._finalsumlbl.getLeft()+__ref._finalsumlbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4194347;
 //BA.debugLineNum = 4194347;BA.debugLine="CartPan.AddView(ShopList,0%x, 5%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._shoplist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=4194348;
 //BA.debugLineNum = 4194348;BA.debugLine="End Sub";
return "";
}
public double  _calculatesum(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "calculatesum", false))
	 {return ((Double) Debug.delegate(ba, "calculatesum", null));}
double _sum = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub CalculateSum As Double";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim sum As Double = 0";
_sum = 0;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._scanneditems.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="sum = sum + (g.Qtty*GetGoodPrice(g.ID))";
_sum = _sum+(_g.Qtty*__ref._getgoodprice(null,_g.ID));
 }
};
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="Return sum";
if (true) return _sum;
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="End Sub";
return 0;
}
public double  _getgoodprice(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "getgoodprice", false))
	 {return ((Double) Debug.delegate(ba, "getgoodprice", new Object[] {_goodid}));}
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub GetGoodPrice(GoodID As Int) As Double";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim g As Good = ScannedItems.Get(GoodID)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Return g.Price";
if (true) return _g.Price;
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Private ItemNamelbl,ItemPricelbl,ItemQttylbl,Fina";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_finalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_sumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Public ShopList As ScrollView";
_shoplist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Public ScannedItems As Map";
_scanneditems = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="Public ItemsSuppliers As Map";
_itemssuppliers = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Public CurrentItem As Good";
_currentitem = new b4a.diplomna.types._good();
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="Public CurrentSupplier As Supplier";
_currentsupplier = new b4a.diplomna.types._supplier();
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Public FinishOrderbtn As Button";
_finishorderbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="End Sub";
return "";
}
public String  _clearcart(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "clearcart", false))
	 {return ((String) Debug.delegate(ba, "clearcart", null));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub ClearCart";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="ScannedItems.Clear";
__ref._scanneditems.Clear();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="CallSub(Main,\"ClearItemInfo\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ClearItemInfo");
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="End Sub";
return "";
}
public String  _delqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "delqtty_click", false))
	 {return ((String) Debug.delegate(ba, "delqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub DelQtty_Click";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get(_btn.getTag()));
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="g.Qtty = g.Qtty - 1";
_g.Qtty = (int) (_g.Qtty-1);
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="If g.Qtty <= 0 Then";
if (_g.Qtty<=0) { 
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="ScannedItems.Remove(g.ID)";
__ref._scanneditems.Remove((Object)(_g.ID));
 }else {
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="End Sub";
return "";
}
public void  _finishorder_click(b4a.diplomna.shoppingcart __ref) throws Exception{
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "finishorder_click", false))
	 {Debug.delegate(ba, "finishorder_click", null); return;}
ResumableSub_FinishOrder_Click rsub = new ResumableSub_FinishOrder_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_FinishOrder_Click extends BA.ResumableSub {
public ResumableSub_FinishOrder_Click(b4a.diplomna.shoppingcart parent,b4a.diplomna.shoppingcart __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.diplomna.shoppingcart __ref;
b4a.diplomna.shoppingcart parent;
b4a.diplomna.types._order _neworder = null;
b4a.diplomna.types._good _g = null;
b4a.diplomna.types._orderedgood _ordergood = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _sendorder = null;
Object _result = null;
anywheresoftware.b4a.BA.IterableList group5;
int index5;
int groupLen5;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="shoppingcart";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If ScannedItems.Size > 0 Then";
if (true) break;

case 1:
//if
this.state = 16;
if (__ref._scanneditems.getSize()>0) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Dim neworder As Order";
_neworder = new b4a.diplomna.types._order();
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="neworder.Initialize()";
_neworder.Initialize();
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="neworder.OrderedGoods.Initialize()";
_neworder.OrderedGoods.Initialize();
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="For Each g As Good In ScannedItems.Values";
if (true) break;

case 4:
//for
this.state = 7;
group5 = __ref._scanneditems.Values();
index5 = 0;
groupLen5 = group5.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 7;
if (index5 < groupLen5) {
this.state = 6;
_g = (b4a.diplomna.types._good)(group5.Get(index5));}
if (true) break;

case 18:
//C
this.state = 17;
index5++;
if (true) break;

case 6:
//C
this.state = 18;
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="Dim ordergood As OrderedGood";
_ordergood = new b4a.diplomna.types._orderedgood();
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="ordergood.Initialize";
_ordergood.Initialize();
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="ordergood.Order = neworder";
_ordergood.Order = _neworder;
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="ordergood.GoodID = g.ID";
_ordergood.GoodID = _g.ID;
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="ordergood.Qtty = g.Qtty";
_ordergood.Qtty = _g.Qtty;
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="neworder.OrderedGoods.Add(ordergood)";
_neworder.OrderedGoods.Add((Object)(_ordergood));
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="neworder.OrderTotalPrice = neworder.OrderTotalP";
_neworder.OrderTotalPrice = _neworder.OrderTotalPrice+(_g.Price*_g.Qtty);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="neworder.CutomerID = Main.LoggedCustomer.ID";
_neworder.CutomerID = parent._main._loggedcustomer.ID;
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="neworder.OrderStatus = \"Waiting\"";
_neworder.OrderStatus = "Waiting";
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="neworder.OrderCode = \"#\" & GenerateRandomString(";
_neworder.OrderCode = "#"+__ref._generaterandomstring(null,(int) (10));
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="Dim sendorder As ResumableSub = Main.HTTP.SendOr";
_sendorder = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_sendorder = parent._main._http._sendorder(null,_neworder);
RDebugUtils.currentLine=5242901;
 //BA.debugLineNum = 5242901;BA.debugLine="Wait For (sendorder)  Complete (Result As Object";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "shoppingcart", "finishorder_click"), _sendorder);
this.state = 19;
return;
case 19:
//C
this.state = 8;
_result = (Object) result[1];
;
RDebugUtils.currentLine=5242903;
 //BA.debugLineNum = 5242903;BA.debugLine="If Main.HTTP.Output = \"502\" Then";
if (true) break;

case 8:
//if
this.state = 13;
if ((parent._main._http._output).equals("502")) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=5242904;
 //BA.debugLineNum = 5242904;BA.debugLine="ToastMessageShow(\"Error sending order,try again";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error sending order,try again!"),parent.__c.False);
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=5242906;
 //BA.debugLineNum = 5242906;BA.debugLine="ClearCart";
__ref._clearcart(null);
 if (true) break;

case 13:
//C
this.state = 16;
;
RDebugUtils.currentLine=5242909;
 //BA.debugLineNum = 5242909;BA.debugLine="Main.HTTP.Output = \"\"";
parent._main._http._output = "";
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=5242911;
 //BA.debugLineNum = 5242911;BA.debugLine="ToastMessageShow(\"No items in cart\",False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("No items in cart"),parent.__c.False);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=5242913;
 //BA.debugLineNum = 5242913;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _generaterandomstring(b4a.diplomna.shoppingcart __ref,int _strlength) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "generaterandomstring", false))
	 {return ((String) Debug.delegate(ba, "generaterandomstring", new Object[] {_strlength}));}
String _rndstring = "";
int _rndnumber = 0;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub GenerateRandomString(StrLength As Int) As Stri";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim RndString As String";
_rndstring = "";
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Dim RndNumber As Int";
_rndnumber = 0;
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="Do While RndString.Length < StrLength";
while (_rndstring.length()<_strlength) {
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
_rndnumber = __c.Rnd((int) (48),(int) (123));
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
if ((_rndnumber>=48 && _rndnumber<=57) || (_rndnumber>=65 && _rndnumber<=90) || (_rndnumber>=97 && _rndnumber<=112)) { 
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="RndString = RndString & Chr(RndNumber)";
_rndstring = _rndstring+BA.ObjectToString(__c.Chr(_rndnumber));
 };
 }
;
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="Return RndString";
if (true) return _rndstring;
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim GetGood As ResumableSub = Main.HTTP.GetGoodBy";
_getgood = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getgood = parent._main._http._getgoodbyid(null,_goodid);
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Wait For (GetGood)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "shoppingcart", "getitemfromdb"), _getgood);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="CurrentItem = JSONSerializations.SerializeGood(Ma";
__ref._currentitem = parent._jsonserializations._serializegood(ba,parent._main._http._output);
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="CurrentItem.Qtty = 1";
__ref._currentitem.Qtty = (int) (1);
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Dim GetSupplier As ResumableSub = Main.HTTP.GetSu";
_getsupplier = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getsupplier = parent._main._http._getsupplierbyid(null,__ref._currentitem.SupplierID);
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Wait For (GetSupplier)  Complete (Result As Objec";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "shoppingcart", "getitemfromdb"), _getsupplier);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="CurrentSupplier = JSONSerializations.SerializeSup";
__ref._currentsupplier = parent._jsonserializations._serializesupplier(ba,parent._main._http._output);
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
RDebugUtils.currentLine=4653070;
 //BA.debugLineNum = 4653070;BA.debugLine="AddSupplier(CurrentSupplier)";
__ref._addsupplier(null,__ref._currentsupplier);
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="AddItemToBasket(CurrentItem)";
__ref._additemtobasket(null,__ref._currentitem);
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.diplomna.shoppingcart __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="ScannedItems.Initialize";
__ref._scanneditems.Initialize();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="CurrentItem.Initialize";
__ref._currentitem.Initialize();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="CurrentSupplier.Initialize";
__ref._currentsupplier.Initialize();
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="ItemsSuppliers.Initialize";
__ref._itemssuppliers.Initialize();
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="ItemNamelbl.Initialize(\"\")";
__ref._itemnamelbl.Initialize(ba,"");
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="ItemPricelbl.Initialize(\"\")";
__ref._itempricelbl.Initialize(ba,"");
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="ItemQttylbl.Initialize(\"\")";
__ref._itemqttylbl.Initialize(ba,"");
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="FinalSumlbl.Initialize(\"\")";
__ref._finalsumlbl.Initialize(ba,"");
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="Sumlbl.Initialize(\"\")";
__ref._sumlbl.Initialize(ba,"");
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="FinishOrderbtn.Initialize(\"FinishOrder\")";
__ref._finishorderbtn.Initialize(ba,"FinishOrder");
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="ShopList.Initialize(10%y)";
__ref._shoplist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="BuildCartUI";
__ref._buildcartui(null);
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket", false))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket", new Object[] {_goodid}));}
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub RemoveItemFromBasket(GoodID As Int)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(GoodID)";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_goodid)));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="ItemsSuppliers.Remove(s.ID)";
__ref._itemssuppliers.Remove((Object)(_s.ID));
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="ScannedItems.Remove(GoodID)";
__ref._scanneditems.Remove((Object)(_goodid));
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket_click", false))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub RemoveItemFromBasket_Click";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="RemoveItemFromBasket(btn.Tag)";
__ref._removeitemfrombasket(null,(int)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="End Sub";
return "";
}
public String  _selectitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "selectitemfrombasket_click", false))
	 {return ((String) Debug.delegate(ba, "selectitemfrombasket_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub SelectItemFromBasket_Click";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="ViewSelectedItemInfo(pnl.Tag)";
__ref._viewselectediteminfo(null,(int)(BA.ObjectToNumber(_pnl.getTag())));
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Log(\"Clicked \" & pnl.Tag)";
__c.LogImpl("45111812","Clicked "+BA.ObjectToString(_pnl.getTag()),0);
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="End Sub";
return "";
}
public String  _viewselectediteminfo(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "viewselectediteminfo", false))
	 {return ((String) Debug.delegate(ba, "viewselectediteminfo", new Object[] {_goodid}));}
b4a.diplomna.types._good _item = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub ViewSelectedItemInfo(GoodID As Int)";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim item As Good = ScannedItems.Get(GoodID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(item.Suppl";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_item.SupplierID)));
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="CallSub3(Main,\"ShowItemInfo\",item,s)";
__c.CallSubDebug3(ba,(Object)(_main.getObject()),"ShowItemInfo",(Object)(_item),(Object)(_s));
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub TestWithFakes(num As Int)";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="For i = 0 To num";
{
final int step1 = 1;
final int limit1 = _num;
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Dim g As Good";
_g = new b4a.diplomna.types._good();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Dim s As Supplier";
_s = new b4a.diplomna.types._supplier();
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="g.ID = i";
_g.ID = _i;
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="g.SupplierID = i";
_g.SupplierID = _i;
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="g.Qtty = 1";
_g.Qtty = (int) (1);
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="g.Name = \"Name\"&i";
_g.Name = "Name"+BA.NumberToString(_i);
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="g.PLU = 100+i";
_g.PLU = (int) (100+_i);
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="g.Price = 5.99 + i";
_g.Price = 5.99+_i;
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="g.Description = \"nothing\"";
_g.Description = "nothing";
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="g.Is_Discontinued = 0";
_g.Is_Discontinued = (int) (0);
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="s.ID = i";
_s.ID = _i;
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="s.SupplierName = \"Micro\"&i";
_s.SupplierName = "Micro"+BA.NumberToString(_i);
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="s.SupploerPhone = \"088896451\"&i";
_s.SupploerPhone = "088896451"+BA.NumberToString(_i);
RDebugUtils.currentLine=5046291;
 //BA.debugLineNum = 5046291;BA.debugLine="AddItemToBasket(g)";
__ref._additemtobasket(null,_g);
RDebugUtils.currentLine=5046292;
 //BA.debugLineNum = 5046292;BA.debugLine="AddSupplier(s)";
__ref._addsupplier(null,_s);
 }
};
RDebugUtils.currentLine=5046294;
 //BA.debugLineNum = 5046294;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=5046295;
 //BA.debugLineNum = 5046295;BA.debugLine="End Sub";
return "";
}
}