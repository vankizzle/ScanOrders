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
public anywheresoftware.b4a.objects.collections.Map _itemsdetails = null;
public anywheresoftware.b4a.objects.collections.Map _itemssuppliers = null;
public b4a.diplomna.types._good _currentitem = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _addgooddetail(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._gooddetail _gd) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addgooddetail", false))
	 {return ((String) Debug.delegate(ba, "addgooddetail", new Object[] {_gd}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub AddGoodDetail(gd As GoodDetail)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="ItemsDetails.Put(gd.ID , gd)";
__ref._itemsdetails.Put((Object)(_gd.ID),(Object)(_gd));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
public String  _additemtobasket(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._good _g) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "additemtobasket", false))
	 {return ((String) Debug.delegate(ba, "additemtobasket", new Object[] {_g}));}
b4a.diplomna.types._good _item = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub AddItemToBasket(g As Good)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If ScannedItems.ContainsKey(g.ID) Then";
if (__ref._scanneditems.ContainsKey((Object)(_g.ID))) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim Item As Good = ScannedItems.Get(g.ID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_g.ID)));
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Item.Qtty = Item.Qtty + 1";
_item.Qtty = (int) (_item.Qtty+1);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="ScannedItems.Put(Item.ID,Item)";
__ref._scanneditems.Put((Object)(_item.ID),(Object)(_item));
 }else {
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="End Sub";
return "";
}
public String  _addqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addqtty_click", false))
	 {return ((String) Debug.delegate(ba, "addqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub AddQtty_Click";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get(_btn.getTag()));
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="g.Qtty = g.Qtty + 1";
_g.Qtty = (int) (_g.Qtty+1);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="End Sub";
return "";
}
public String  _buildcart(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "buildcart", false))
	 {return ((String) Debug.delegate(ba, "buildcart", null));}
int _row = 0;
b4a.diplomna.types._good _g = null;
b4a.diplomna.types._gooddetail _itemdetail = null;
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _itemname = null;
anywheresoftware.b4a.objects.LabelWrapper _itemprice = null;
anywheresoftware.b4a.objects.LabelWrapper _itemqtty = null;
anywheresoftware.b4a.objects.ButtonWrapper _delitemx = null;
anywheresoftware.b4a.objects.ButtonWrapper _additem = null;
anywheresoftware.b4a.objects.ButtonWrapper _delitem = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="ShopList.Panel.RemoveAllViews";
__ref._shoplist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._scanneditems.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_g = (b4a.diplomna.types._good)(group3.Get(index3));
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Private itemdetail As GoodDetail = ItemsDetails.";
_itemdetail = (b4a.diplomna.types._gooddetail)(__ref._itemsdetails.Get((Object)(_g.ID)));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Private itemName,itemPrice,itemQtty As Label";
_itemname = new anywheresoftware.b4a.objects.LabelWrapper();
_itemprice = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqtty = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Private delitemX,additem,delitem As Button";
_delitemx = new anywheresoftware.b4a.objects.ButtonWrapper();
_additem = new anywheresoftware.b4a.objects.ButtonWrapper();
_delitem = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="holder.Initialize(\"SelectItemFromBasket\")";
_holder.Initialize(ba,"SelectItemFromBasket");
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="itemQtty.Initialize(\"\")";
_itemqtty.Initialize(ba,"");
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="itemName.Initialize(\"\")";
_itemname.Initialize(ba,"");
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="itemPrice.Initialize(\"\")";
_itemprice.Initialize(ba,"");
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="delitemX.Initialize(\"RemoveItemFromBasket\")";
_delitemx.Initialize(ba,"RemoveItemFromBasket");
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="additem.Initialize(\"AddQtty\")";
_additem.Initialize(ba,"AddQtty");
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="delitem.Initialize(\"DelQtty\")";
_delitem.Initialize(ba,"DelQtty");
RDebugUtils.currentLine=2752530;
 //BA.debugLineNum = 2752530;BA.debugLine="holder.Tag = g.ID";
_holder.setTag((Object)(_g.ID));
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="itemName.Text = itemdetail.Name";
_itemname.setText(BA.ObjectToCharSequence(_itemdetail.Name));
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="itemName.Gravity = Gravity.CENTER";
_itemname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752534;
 //BA.debugLineNum = 2752534;BA.debugLine="itemName.TextColor =  Colors.DarkGray";
_itemname.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=2752537;
 //BA.debugLineNum = 2752537;BA.debugLine="itemPrice.Text = itemdetail.Price";
_itemprice.setText(BA.ObjectToCharSequence(_itemdetail.Price));
RDebugUtils.currentLine=2752538;
 //BA.debugLineNum = 2752538;BA.debugLine="itemPrice.Gravity = Gravity.CENTER";
_itemprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="itemPrice.TextColor =  Colors.DarkGray";
_itemprice.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=2752542;
 //BA.debugLineNum = 2752542;BA.debugLine="itemQtty.Text = g.Qtty";
_itemqtty.setText(BA.ObjectToCharSequence(_g.Qtty));
RDebugUtils.currentLine=2752543;
 //BA.debugLineNum = 2752543;BA.debugLine="itemQtty.Gravity = Gravity.CENTER";
_itemqtty.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752544;
 //BA.debugLineNum = 2752544;BA.debugLine="itemQtty.TextColor =  Colors.DarkGray";
_itemqtty.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=2752547;
 //BA.debugLineNum = 2752547;BA.debugLine="holder.AddView(itemName, 0, 0, 20%x, 5%y)";
_holder.AddView((android.view.View)(_itemname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752548;
 //BA.debugLineNum = 2752548;BA.debugLine="holder.AddView(itemPrice, itemName.Left + itemNa";
_holder.AddView((android.view.View)(_itemprice.getObject()),(int) (_itemname.getLeft()+_itemname.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752549;
 //BA.debugLineNum = 2752549;BA.debugLine="holder.AddView(itemQtty, itemPrice.Left + itemPr";
_holder.AddView((android.view.View)(_itemqtty.getObject()),(int) (_itemprice.getLeft()+_itemprice.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752550;
 //BA.debugLineNum = 2752550;BA.debugLine="holder.AddView(additem, itemQtty.Left + itemQtty";
_holder.AddView((android.view.View)(_additem.getObject()),(int) (_itemqtty.getLeft()+_itemqtty.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752551;
 //BA.debugLineNum = 2752551;BA.debugLine="holder.AddView(delitem, additem.Left + additem.W";
_holder.AddView((android.view.View)(_delitem.getObject()),(int) (_additem.getLeft()+_additem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752552;
 //BA.debugLineNum = 2752552;BA.debugLine="holder.AddView(delitemX, delitem.Left + delitem.";
_holder.AddView((android.view.View)(_delitemx.getObject()),(int) (_delitem.getLeft()+_delitem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752554;
 //BA.debugLineNum = 2752554;BA.debugLine="delitemX.Text = \"x\"";
_delitemx.setText(BA.ObjectToCharSequence("x"));
RDebugUtils.currentLine=2752555;
 //BA.debugLineNum = 2752555;BA.debugLine="delitemX.TextSize = 14";
_delitemx.setTextSize((float) (14));
RDebugUtils.currentLine=2752556;
 //BA.debugLineNum = 2752556;BA.debugLine="delitemX.Gravity = Gravity.CENTER";
_delitemx.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752557;
 //BA.debugLineNum = 2752557;BA.debugLine="delitemX.TextColor =  AppColors.FadedDarkRed";
_delitemx.setTextColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=2752558;
 //BA.debugLineNum = 2752558;BA.debugLine="delitemX.Color = AppColors.Transparent";
_delitemx.setColor(_appcolors._transparent);
RDebugUtils.currentLine=2752559;
 //BA.debugLineNum = 2752559;BA.debugLine="delitemX.Tag = g.ID";
_delitemx.setTag((Object)(_g.ID));
RDebugUtils.currentLine=2752561;
 //BA.debugLineNum = 2752561;BA.debugLine="additem.Text = \"+\"";
_additem.setText(BA.ObjectToCharSequence("+"));
RDebugUtils.currentLine=2752562;
 //BA.debugLineNum = 2752562;BA.debugLine="additem.TextSize = 14";
_additem.setTextSize((float) (14));
RDebugUtils.currentLine=2752563;
 //BA.debugLineNum = 2752563;BA.debugLine="additem.Textcolor = AppColors.Black";
_additem.setTextColor(_appcolors._black);
RDebugUtils.currentLine=2752564;
 //BA.debugLineNum = 2752564;BA.debugLine="additem.Color = AppColors.Transparent";
_additem.setColor(_appcolors._transparent);
RDebugUtils.currentLine=2752565;
 //BA.debugLineNum = 2752565;BA.debugLine="additem.Gravity = Gravity.CENTER";
_additem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752566;
 //BA.debugLineNum = 2752566;BA.debugLine="additem.Tag = g.ID";
_additem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=2752568;
 //BA.debugLineNum = 2752568;BA.debugLine="delitem.Text = \"-\"";
_delitem.setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=2752569;
 //BA.debugLineNum = 2752569;BA.debugLine="delitem.Textsize = 14";
_delitem.setTextSize((float) (14));
RDebugUtils.currentLine=2752570;
 //BA.debugLineNum = 2752570;BA.debugLine="delitem.TextColor = AppColors.Black";
_delitem.setTextColor(_appcolors._black);
RDebugUtils.currentLine=2752571;
 //BA.debugLineNum = 2752571;BA.debugLine="delitem.Color = AppColors.Transparent";
_delitem.setColor(_appcolors._transparent);
RDebugUtils.currentLine=2752572;
 //BA.debugLineNum = 2752572;BA.debugLine="delitem.Gravity = Gravity.CENTER";
_delitem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752573;
 //BA.debugLineNum = 2752573;BA.debugLine="delitem.Tag = g.ID";
_delitem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=2752575;
 //BA.debugLineNum = 2752575;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=2752576;
 //BA.debugLineNum = 2752576;BA.debugLine="ShopList.Panel.AddView(holder,0,0+(5%y + 1dip)*r";
__ref._shoplist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._shoplist.getPanel().getWidth(),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752578;
 //BA.debugLineNum = 2752578;BA.debugLine="If row < ScannedItems.Size - 1 Then";
if (_row<__ref._scanneditems.getSize()-1) { 
RDebugUtils.currentLine=2752579;
 //BA.debugLineNum = 2752579;BA.debugLine="ShopList.Panel.Height = 10%y + ((5%y + 1dip)*ro";
__ref._shoplist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=2752580;
 //BA.debugLineNum = 2752580;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=2752584;
 //BA.debugLineNum = 2752584;BA.debugLine="RefreshOverall";
__ref._refreshoverall(null);
RDebugUtils.currentLine=2752585;
 //BA.debugLineNum = 2752585;BA.debugLine="End Sub";
return "";
}
public String  _addsupplier(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._supplier _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addsupplier", false))
	 {return ((String) Debug.delegate(ba, "addsupplier", new Object[] {_s}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub AddSupplier(s As Supplier)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="ItemsSuppliers.Put(s.ID,s)";
__ref._itemssuppliers.Put((Object)(_s.ID),(Object)(_s));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return null;
}
public String  _refreshoverall(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "refreshoverall", false))
	 {return ((String) Debug.delegate(ba, "refreshoverall", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub RefreshOverall";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Sumlbl.Text =  NumberFormat2(CalculateSum,1,2,2,F";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__c.NumberFormat2(__ref._calculatesum(null),(int) (1),(int) (2),(int) (2),__c.False)));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public String  _buildcartui(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "buildcartui", false))
	 {return ((String) Debug.delegate(ba, "buildcartui", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub BuildCartUI";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
__ref._cartpan.setColor(_appcolors._fadedblack);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
__ref._pblbase.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="pnlHeader.Color = AppColors.FadedDarkRed";
__ref._pnlheader.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="CartPan.AddView(pblBase,0,45%y,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="ItemNamelbl.Text = \"Name\"";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
__ref._itemnamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
__ref._itemnamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="ItemPricelbl.Text = \"Price\"";
__ref._itempricelbl.setText(BA.ObjectToCharSequence("Price"));
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="ItemPricelbl.Gravity = Gravity.CENTER";
__ref._itempricelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="ItemPricelbl.TextColor = Colors.White";
__ref._itempricelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="ItemQttylbl.Text = \"Quantity\"";
__ref._itemqttylbl.setText(BA.ObjectToCharSequence("Quantity"));
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="ItemQttylbl.Gravity = Gravity.CENTER";
__ref._itemqttylbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="ItemQttylbl.TextColor = Colors.White";
__ref._itemqttylbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2031636;
 //BA.debugLineNum = 2031636;BA.debugLine="FinalSumlbl.Text = \"Total\"";
__ref._finalsumlbl.setText(BA.ObjectToCharSequence("Total"));
RDebugUtils.currentLine=2031637;
 //BA.debugLineNum = 2031637;BA.debugLine="FinalSumlbl.Gravity = Gravity.CENTER";
__ref._finalsumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="FinalSumlbl.TextColor = Colors.White";
__ref._finalsumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2031640;
 //BA.debugLineNum = 2031640;BA.debugLine="Sumlbl.Text = CalculateSum";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__ref._calculatesum(null)));
RDebugUtils.currentLine=2031641;
 //BA.debugLineNum = 2031641;BA.debugLine="Sumlbl.Gravity = Gravity.CENTER";
__ref._sumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031642;
 //BA.debugLineNum = 2031642;BA.debugLine="Sumlbl.TextColor = Colors.White";
__ref._sumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2031644;
 //BA.debugLineNum = 2031644;BA.debugLine="pnlHeader.AddView(ItemNamelbl, 0, 0, 20%x, 5%y)";
__ref._pnlheader.AddView((android.view.View)(__ref._itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031645;
 //BA.debugLineNum = 2031645;BA.debugLine="pnlHeader.AddView(ItemPricelbl,  ItemNamelbl.Left";
__ref._pnlheader.AddView((android.view.View)(__ref._itempricelbl.getObject()),(int) (__ref._itemnamelbl.getLeft()+__ref._itemnamelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031646;
 //BA.debugLineNum = 2031646;BA.debugLine="pnlHeader.AddView(ItemQttylbl,   ItemPricelbl.Lef";
__ref._pnlheader.AddView((android.view.View)(__ref._itemqttylbl.getObject()),(int) (__ref._itempricelbl.getLeft()+__ref._itempricelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031648;
 //BA.debugLineNum = 2031648;BA.debugLine="pblBase.AddView(FinalSumlbl, 0, 0, 20%x, 5%y)";
__ref._pblbase.AddView((android.view.View)(__ref._finalsumlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031649;
 //BA.debugLineNum = 2031649;BA.debugLine="pblBase.AddView(Sumlbl, FinalSumlbl.Left + FinalS";
__ref._pblbase.AddView((android.view.View)(__ref._sumlbl.getObject()),(int) (__ref._finalsumlbl.getLeft()+__ref._finalsumlbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031651;
 //BA.debugLineNum = 2031651;BA.debugLine="CartPan.AddView(ShopList,0%x, 5%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._shoplist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=2031652;
 //BA.debugLineNum = 2031652;BA.debugLine="End Sub";
return "";
}
public double  _calculatesum(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "calculatesum", false))
	 {return ((Double) Debug.delegate(ba, "calculatesum", null));}
double _sum = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub CalculateSum As Double";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim sum As Double = 0";
_sum = 0;
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._scanneditems.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="sum = sum + (g.Qtty*GetGoodPrice(g.ID))";
_sum = _sum+(_g.Qtty*__ref._getgoodprice(null,_g.ID));
 }
};
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Return sum";
if (true) return _sum;
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="End Sub";
return 0;
}
public double  _getgoodprice(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "getgoodprice", false))
	 {return ((Double) Debug.delegate(ba, "getgoodprice", new Object[] {_goodid}));}
b4a.diplomna.types._gooddetail _gd = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub GetGoodPrice(GoodID As Int) As Double";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim gd As GoodDetail = ItemsDetails.Get(GoodID)";
_gd = (b4a.diplomna.types._gooddetail)(__ref._itemsdetails.Get((Object)(_goodid)));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Return gd.Price";
if (true) return _gd.Price;
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Private ItemNamelbl,ItemPricelbl,ItemQttylbl,Fina";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_finalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_sumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Public ShopList As ScrollView";
_shoplist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Public ScannedItems As Map";
_scanneditems = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Public ItemsDetails As Map";
_itemsdetails = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Public ItemsSuppliers As Map";
_itemssuppliers = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Public CurrentItem As Good";
_currentitem = new b4a.diplomna.types._good();
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="End Sub";
return "";
}
public String  _delqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "delqtty_click", false))
	 {return ((String) Debug.delegate(ba, "delqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub DelQtty_Click";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get(_btn.getTag()));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="g.Qtty = g.Qtty - 1";
_g.Qtty = (int) (_g.Qtty-1);
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="If g.Qtty <= 0 Then";
if (_g.Qtty<=0) { 
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="ScannedItems.Remove(g.ID)";
__ref._scanneditems.Remove((Object)(_g.ID));
 }else {
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="End Sub";
return "";
}
public b4a.diplomna.types._good  _deserializeiteminfo(b4a.diplomna.shoppingcart __ref,String _info) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "deserializeiteminfo", false))
	 {return ((b4a.diplomna.types._good) Debug.delegate(ba, "deserializeiteminfo", new Object[] {_info}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub DeserializeItemInfo(Info As String) As";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return null;
}
public void  _getiteminformation(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "getiteminformation", false))
	 {Debug.delegate(ba, "getiteminformation", new Object[] {_goodid}); return;}
ResumableSub_GetItemInformation rsub = new ResumableSub_GetItemInformation(this,__ref,_goodid);
rsub.resume(ba, null);
}
public static class ResumableSub_GetItemInformation extends BA.ResumableSub {
public ResumableSub_GetItemInformation(b4a.diplomna.shoppingcart parent,b4a.diplomna.shoppingcart __ref,int _goodid) {
this.parent = parent;
this.__ref = __ref;
this._goodid = _goodid;
this.__ref = parent;
}
b4a.diplomna.shoppingcart __ref;
b4a.diplomna.shoppingcart parent;
int _goodid;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _test = null;
Object _result = null;

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
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim test As ResumableSub = Main.HTTP.GetGoodByID(";
_test = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_test = parent._main._http._getgoodbyid(null,_goodid);
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Wait For (test)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "shoppingcart", "getiteminformation"), _test);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="If Result = False Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_result).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Log(\"FAILED\")";
parent.__c.LogImpl("42555908","FAILED",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="CurrentItem = DeserializeItemInfo(Main.HTTP.Outp";
__ref._currentitem = __ref._deserializeiteminfo(null,parent._main._http._output);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="ScannedItems.Initialize";
__ref._scanneditems.Initialize();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="CurrentItem.Initialize";
__ref._currentitem.Initialize();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="ItemsDetails.Initialize";
__ref._itemsdetails.Initialize();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="ItemsSuppliers.Initialize";
__ref._itemssuppliers.Initialize();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="ItemNamelbl.Initialize(\"\")";
__ref._itemnamelbl.Initialize(ba,"");
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="ItemPricelbl.Initialize(\"\")";
__ref._itempricelbl.Initialize(ba,"");
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="ItemQttylbl.Initialize(\"\")";
__ref._itemqttylbl.Initialize(ba,"");
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="FinalSumlbl.Initialize(\"\")";
__ref._finalsumlbl.Initialize(ba,"");
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="Sumlbl.Initialize(\"\")";
__ref._sumlbl.Initialize(ba,"");
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="ShopList.Initialize(10%y)";
__ref._shoplist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="BuildCartUI";
__ref._buildcartui(null);
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket", false))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket", new Object[] {_goodid}));}
b4a.diplomna.types._good _good = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub RemoveItemFromBasket(GoodID As Int)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim good As Good = ScannedItems.Get(GoodID)";
_good = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(GoodID)";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_goodid)));
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="ItemsDetails.Remove(good.DetailID)";
__ref._itemsdetails.Remove((Object)(_good.DetailID));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="ItemsSuppliers.Remove(s.ID)";
__ref._itemssuppliers.Remove((Object)(_s.ID));
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="ScannedItems.Remove(GoodID)";
__ref._scanneditems.Remove((Object)(_goodid));
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket_click", false))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub RemoveItemFromBasket_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="RemoveItemFromBasket(btn.Tag)";
__ref._removeitemfrombasket(null,(int)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="End Sub";
return "";
}
public String  _selectitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "selectitemfrombasket_click", false))
	 {return ((String) Debug.delegate(ba, "selectitemfrombasket_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub SelectItemFromBasket_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="ViewSelectedItemInfo(pnl.Tag)";
__ref._viewselectediteminfo(null,(int)(BA.ObjectToNumber(_pnl.getTag())));
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Log(\"Clicked \" & pnl.Tag)";
__c.LogImpl("43080196","Clicked "+BA.ObjectToString(_pnl.getTag()),0);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="End Sub";
return "";
}
public String  _viewselectediteminfo(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "viewselectediteminfo", false))
	 {return ((String) Debug.delegate(ba, "viewselectediteminfo", new Object[] {_goodid}));}
b4a.diplomna.types._good _item = null;
b4a.diplomna.types._gooddetail _gd = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub ViewSelectedItemInfo(GoodID As Int)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim item As Good = ScannedItems.Get(GoodID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim gd As GoodDetail = ItemsDetails.Get(item.Deta";
_gd = (b4a.diplomna.types._gooddetail)(__ref._itemsdetails.Get((Object)(_item.DetailID)));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(item.Suppl";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_item.SupplierID)));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="CallSub3(Main,\"ShowItemInfo\",gd,s)";
__c.CallSubDebug3(ba,(Object)(_main.getObject()),"ShowItemInfo",(Object)(_gd),(Object)(_s));
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes(b4a.diplomna.shoppingcart __ref,int _num) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "testwithfakes", false))
	 {return ((String) Debug.delegate(ba, "testwithfakes", new Object[] {_num}));}
int _i = 0;
b4a.diplomna.types._good _g = null;
b4a.diplomna.types._gooddetail _gd = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub TestWithFakes(num As Int)";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="For i = 0 To num";
{
final int step1 = 1;
final int limit1 = _num;
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim g As Good";
_g = new b4a.diplomna.types._good();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Dim gd As GoodDetail";
_gd = new b4a.diplomna.types._gooddetail();
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Dim s As Supplier";
_s = new b4a.diplomna.types._supplier();
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="g.ID = i";
_g.ID = _i;
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="g.DetailID = i";
_g.DetailID = _i;
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="g.SupplierID = i";
_g.SupplierID = _i;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="g.Qtty = 1";
_g.Qtty = (int) (1);
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="gd.ID = i";
_gd.ID = _i;
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="gd.Name = \"Name\"&i";
_gd.Name = "Name"+BA.NumberToString(_i);
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="gd.PLU = 100+i";
_gd.PLU = (int) (100+_i);
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="gd.Price = 5.99 + i";
_gd.Price = 5.99+_i;
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="gd.Description = \"nothing\"";
_gd.Description = "nothing";
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="gd.Is_Discontinued = 0";
_gd.Is_Discontinued = (int) (0);
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="s.ID = i";
_s.ID = _i;
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="s.SupplierName = \"Micro\"&i";
_s.SupplierName = "Micro"+BA.NumberToString(_i);
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="s.SupploerPhone = \"088896451\"&i";
_s.SupploerPhone = "088896451"+BA.NumberToString(_i);
RDebugUtils.currentLine=3014678;
 //BA.debugLineNum = 3014678;BA.debugLine="AddItemToBasket(g)";
__ref._additemtobasket(null,_g);
RDebugUtils.currentLine=3014679;
 //BA.debugLineNum = 3014679;BA.debugLine="AddGoodDetail(gd)";
__ref._addgooddetail(null,_gd);
RDebugUtils.currentLine=3014680;
 //BA.debugLineNum = 3014680;BA.debugLine="AddSupplier(s)";
__ref._addsupplier(null,_s);
 }
};
RDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="End Sub";
return "";
}
}