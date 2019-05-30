package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class shoppingcart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.shoppingcart");
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
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _additemtobasket(b4a.diplomna.types._good _g) throws Exception{
b4a.diplomna.types._good _item = null;
 //BA.debugLineNum = 104;BA.debugLine="Public Sub AddItemToBasket(g As Good)";
 //BA.debugLineNum = 105;BA.debugLine="If ScannedItems.ContainsKey(g.ID) Then";
if (_scanneditems.ContainsKey((Object)(_g.ID))) { 
 //BA.debugLineNum = 106;BA.debugLine="Dim Item As Good = ScannedItems.Get(g.ID)";
_item = (b4a.diplomna.types._good)(_scanneditems.Get((Object)(_g.ID)));
 //BA.debugLineNum = 107;BA.debugLine="Item.Qtty = Item.Qtty + 1";
_item.Qtty = (int) (_item.Qtty+1);
 //BA.debugLineNum = 108;BA.debugLine="ScannedItems.Put(Item.ID,Item)";
_scanneditems.Put((Object)(_item.ID),(Object)(_item));
 }else {
 //BA.debugLineNum = 110;BA.debugLine="ScannedItems.Put(g.ID,g)";
_scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
 //BA.debugLineNum = 112;BA.debugLine="BuildCart";
_buildcart();
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _addqtty_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
 //BA.debugLineNum = 223;BA.debugLine="Public Sub AddQtty_Click";
 //BA.debugLineNum = 224;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 225;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 226;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(_scanneditems.Get(_btn.getTag()));
 //BA.debugLineNum = 227;BA.debugLine="g.Qtty = g.Qtty + 1";
_g.Qtty = (int) (_g.Qtty+1);
 //BA.debugLineNum = 228;BA.debugLine="ScannedItems.Put(g.ID,g)";
_scanneditems.Put((Object)(_g.ID),(Object)(_g));
 //BA.debugLineNum = 229;BA.debugLine="BuildCart";
_buildcart();
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public String  _addsupplier(b4a.diplomna.types._supplier _s) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub AddSupplier(s As Supplier)";
 //BA.debugLineNum = 120;BA.debugLine="ItemsSuppliers.Put(s.ID,s)";
_itemssuppliers.Put((Object)(_s.ID),(Object)(_s));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 101;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_cartpan.getObject()));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public String  _buildcart() throws Exception{
int _row = 0;
b4a.diplomna.types._good _g = null;
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _itemname = null;
anywheresoftware.b4a.objects.LabelWrapper _itemprice = null;
anywheresoftware.b4a.objects.LabelWrapper _itemqtty = null;
anywheresoftware.b4a.objects.ButtonWrapper _delitemx = null;
anywheresoftware.b4a.objects.ButtonWrapper _additem = null;
anywheresoftware.b4a.objects.ButtonWrapper _delitem = null;
 //BA.debugLineNum = 149;BA.debugLine="Public Sub BuildCart";
 //BA.debugLineNum = 150;BA.debugLine="ShopList.Panel.RemoveAllViews";
_shoplist.getPanel().RemoveAllViews();
 //BA.debugLineNum = 151;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
 //BA.debugLineNum = 152;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _scanneditems.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_g = (b4a.diplomna.types._good)(group3.Get(index3));
 //BA.debugLineNum = 153;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 154;BA.debugLine="Private itemName,itemPrice,itemQtty As Label";
_itemname = new anywheresoftware.b4a.objects.LabelWrapper();
_itemprice = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqtty = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 155;BA.debugLine="Private delitemX,additem,delitem As Button";
_delitemx = new anywheresoftware.b4a.objects.ButtonWrapper();
_additem = new anywheresoftware.b4a.objects.ButtonWrapper();
_delitem = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 157;BA.debugLine="holder.Initialize(\"SelectItemFromBasket\")";
_holder.Initialize(ba,"SelectItemFromBasket");
 //BA.debugLineNum = 158;BA.debugLine="itemQtty.Initialize(\"\")";
_itemqtty.Initialize(ba,"");
 //BA.debugLineNum = 159;BA.debugLine="itemName.Initialize(\"\")";
_itemname.Initialize(ba,"");
 //BA.debugLineNum = 160;BA.debugLine="itemPrice.Initialize(\"\")";
_itemprice.Initialize(ba,"");
 //BA.debugLineNum = 161;BA.debugLine="delitemX.Initialize(\"RemoveItemFromBasket\")";
_delitemx.Initialize(ba,"RemoveItemFromBasket");
 //BA.debugLineNum = 162;BA.debugLine="additem.Initialize(\"AddQtty\")";
_additem.Initialize(ba,"AddQtty");
 //BA.debugLineNum = 163;BA.debugLine="delitem.Initialize(\"DelQtty\")";
_delitem.Initialize(ba,"DelQtty");
 //BA.debugLineNum = 166;BA.debugLine="holder.Tag = g.ID";
_holder.setTag((Object)(_g.ID));
 //BA.debugLineNum = 168;BA.debugLine="itemName.Text = g.Name";
_itemname.setText(BA.ObjectToCharSequence(_g.Name));
 //BA.debugLineNum = 169;BA.debugLine="itemName.Gravity = Gravity.CENTER";
_itemname.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 170;BA.debugLine="itemName.TextColor =  Colors.DarkGray";
_itemname.setTextColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 173;BA.debugLine="itemPrice.Text = g.Price";
_itemprice.setText(BA.ObjectToCharSequence(_g.Price));
 //BA.debugLineNum = 174;BA.debugLine="itemPrice.Gravity = Gravity.CENTER";
_itemprice.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 175;BA.debugLine="itemPrice.TextColor =  Colors.DarkGray";
_itemprice.setTextColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 178;BA.debugLine="itemQtty.Text = g.Qtty";
_itemqtty.setText(BA.ObjectToCharSequence(_g.Qtty));
 //BA.debugLineNum = 179;BA.debugLine="itemQtty.Gravity = Gravity.CENTER";
_itemqtty.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 180;BA.debugLine="itemQtty.TextColor =  Colors.DarkGray";
_itemqtty.setTextColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 183;BA.debugLine="holder.AddView(itemName, 0, 0, 20%x, 5%y)";
_holder.AddView((android.view.View)(_itemname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 184;BA.debugLine="holder.AddView(itemPrice, itemName.Left + itemNa";
_holder.AddView((android.view.View)(_itemprice.getObject()),(int) (_itemname.getLeft()+_itemname.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 185;BA.debugLine="holder.AddView(itemQtty, itemPrice.Left + itemPr";
_holder.AddView((android.view.View)(_itemqtty.getObject()),(int) (_itemprice.getLeft()+_itemprice.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 186;BA.debugLine="holder.AddView(additem, itemQtty.Left + itemQtty";
_holder.AddView((android.view.View)(_additem.getObject()),(int) (_itemqtty.getLeft()+_itemqtty.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 187;BA.debugLine="holder.AddView(delitem, additem.Left + additem.W";
_holder.AddView((android.view.View)(_delitem.getObject()),(int) (_additem.getLeft()+_additem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 188;BA.debugLine="holder.AddView(delitemX, delitem.Left + delitem.";
_holder.AddView((android.view.View)(_delitemx.getObject()),(int) (_delitem.getLeft()+_delitem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 190;BA.debugLine="delitemX.Text = \"x\"";
_delitemx.setText(BA.ObjectToCharSequence("x"));
 //BA.debugLineNum = 191;BA.debugLine="delitemX.TextSize = 14";
_delitemx.setTextSize((float) (14));
 //BA.debugLineNum = 192;BA.debugLine="delitemX.Gravity = Gravity.CENTER";
_delitemx.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 193;BA.debugLine="delitemX.TextColor =  AppColors.FadedDarkRed";
_delitemx.setTextColor(_appcolors._fadeddarkred);
 //BA.debugLineNum = 194;BA.debugLine="delitemX.Color = AppColors.Transparent";
_delitemx.setColor(_appcolors._transparent);
 //BA.debugLineNum = 195;BA.debugLine="delitemX.Tag = g.ID";
_delitemx.setTag((Object)(_g.ID));
 //BA.debugLineNum = 197;BA.debugLine="additem.Text = \"+\"";
_additem.setText(BA.ObjectToCharSequence("+"));
 //BA.debugLineNum = 198;BA.debugLine="additem.TextSize = 14";
_additem.setTextSize((float) (14));
 //BA.debugLineNum = 199;BA.debugLine="additem.Textcolor = AppColors.Black";
_additem.setTextColor(_appcolors._black);
 //BA.debugLineNum = 200;BA.debugLine="additem.Color = AppColors.Transparent";
_additem.setColor(_appcolors._transparent);
 //BA.debugLineNum = 201;BA.debugLine="additem.Gravity = Gravity.CENTER";
_additem.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 202;BA.debugLine="additem.Tag = g.ID";
_additem.setTag((Object)(_g.ID));
 //BA.debugLineNum = 204;BA.debugLine="delitem.Text = \"-\"";
_delitem.setText(BA.ObjectToCharSequence("-"));
 //BA.debugLineNum = 205;BA.debugLine="delitem.Textsize = 14";
_delitem.setTextSize((float) (14));
 //BA.debugLineNum = 206;BA.debugLine="delitem.TextColor = AppColors.Black";
_delitem.setTextColor(_appcolors._black);
 //BA.debugLineNum = 207;BA.debugLine="delitem.Color = AppColors.Transparent";
_delitem.setColor(_appcolors._transparent);
 //BA.debugLineNum = 208;BA.debugLine="delitem.Gravity = Gravity.CENTER";
_delitem.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 209;BA.debugLine="delitem.Tag = g.ID";
_delitem.setTag((Object)(_g.ID));
 //BA.debugLineNum = 211;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
 //BA.debugLineNum = 212;BA.debugLine="ShopList.Panel.AddView(holder,0,0+(5%y + 1dip)*r";
_shoplist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row),_shoplist.getPanel().getWidth(),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 214;BA.debugLine="If row < ScannedItems.Size - 1 Then";
if (_row<_scanneditems.getSize()-1) { 
 //BA.debugLineNum = 215;BA.debugLine="ShopList.Panel.Height = 10%y + ((5%y + 1dip)*ro";
_shoplist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row)));
 //BA.debugLineNum = 216;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
 //BA.debugLineNum = 220;BA.debugLine="RefreshOverall";
_refreshoverall();
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public String  _buildcartui() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub BuildCartUI";
 //BA.debugLineNum = 38;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
_cartpan.setColor(_appcolors._fadedblack);
 //BA.debugLineNum = 39;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
_pblbase.setColor(_appcolors._fadeddarkred);
 //BA.debugLineNum = 40;BA.debugLine="pnlHeader.Color = AppColors.FadedDarkRed";
_pnlheader.setColor(_appcolors._fadeddarkred);
 //BA.debugLineNum = 42;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,5%y)";
_cartpan.AddView((android.view.View)(_pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 43;BA.debugLine="CartPan.AddView(pblBase,0,45%y,90%x,5%y)";
_cartpan.AddView((android.view.View)(_pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 45;BA.debugLine="ItemNamelbl.Text = \"Name\"";
_itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
 //BA.debugLineNum = 46;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
_itemnamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 47;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
_itemnamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 49;BA.debugLine="ItemPricelbl.Text = \"Price\"";
_itempricelbl.setText(BA.ObjectToCharSequence("Price"));
 //BA.debugLineNum = 50;BA.debugLine="ItemPricelbl.Gravity = Gravity.CENTER";
_itempricelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 51;BA.debugLine="ItemPricelbl.TextColor = Colors.White";
_itempricelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 53;BA.debugLine="ItemQttylbl.Text = \"Quantity\"";
_itemqttylbl.setText(BA.ObjectToCharSequence("Quantity"));
 //BA.debugLineNum = 54;BA.debugLine="ItemQttylbl.Gravity = Gravity.CENTER";
_itemqttylbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 55;BA.debugLine="ItemQttylbl.TextColor = Colors.White";
_itemqttylbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 57;BA.debugLine="FinalSumlbl.Text = \"Total\"";
_finalsumlbl.setText(BA.ObjectToCharSequence("Total"));
 //BA.debugLineNum = 58;BA.debugLine="FinalSumlbl.Gravity = Gravity.CENTER";
_finalsumlbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 59;BA.debugLine="FinalSumlbl.TextColor = Colors.White";
_finalsumlbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 61;BA.debugLine="Sumlbl.Text = CalculateSum";
_sumlbl.setText(BA.ObjectToCharSequence(_calculatesum()));
 //BA.debugLineNum = 62;BA.debugLine="Sumlbl.Gravity = Gravity.CENTER";
_sumlbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 63;BA.debugLine="Sumlbl.TextColor = Colors.White";
_sumlbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 65;BA.debugLine="FinishOrderbtn.Text = \"Finish\"";
_finishorderbtn.setText(BA.ObjectToCharSequence("Finish"));
 //BA.debugLineNum = 66;BA.debugLine="FinishOrderbtn.Gravity = Gravity.CENTER";
_finishorderbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 67;BA.debugLine="FinishOrderbtn.TextColor = Colors.White";
_finishorderbtn.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 68;BA.debugLine="FinishOrderbtn.Padding = Array As Int (0dip, 0dip";
_finishorderbtn.setPadding(new int[]{__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0))});
 //BA.debugLineNum = 69;BA.debugLine="FinishOrderbtn.Color = AppColors.LightGray";
_finishorderbtn.setColor(_appcolors._lightgray);
 //BA.debugLineNum = 71;BA.debugLine="pnlHeader.AddView(ItemNamelbl, 0, 0, 20%x, 5%y)";
_pnlheader.AddView((android.view.View)(_itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 72;BA.debugLine="pnlHeader.AddView(ItemPricelbl,  ItemNamelbl.Left";
_pnlheader.AddView((android.view.View)(_itempricelbl.getObject()),(int) (_itemnamelbl.getLeft()+_itemnamelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 73;BA.debugLine="pnlHeader.AddView(ItemQttylbl,   ItemPricelbl.Lef";
_pnlheader.AddView((android.view.View)(_itemqttylbl.getObject()),(int) (_itempricelbl.getLeft()+_itempricelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 75;BA.debugLine="pblBase.AddView(FinishOrderbtn, 65%x , 0, 25%x ,";
_pblbase.AddView((android.view.View)(_finishorderbtn.getObject()),__c.PerXToCurrent((float) (65),ba),(int) (0),__c.PerXToCurrent((float) (25),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 76;BA.debugLine="pblBase.AddView(FinalSumlbl, 0, 0, 20%x, 5%y)";
_pblbase.AddView((android.view.View)(_finalsumlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 77;BA.debugLine="pblBase.AddView(Sumlbl, FinalSumlbl.Left + FinalS";
_pblbase.AddView((android.view.View)(_sumlbl.getObject()),(int) (_finalsumlbl.getLeft()+_finalsumlbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 80;BA.debugLine="CartPan.AddView(ShopList,0%x, 5%y,100%x,40%y)";
_cartpan.AddView((android.view.View)(_shoplist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public double  _calculatesum() throws Exception{
double _sum = 0;
b4a.diplomna.types._good _g = null;
 //BA.debugLineNum = 83;BA.debugLine="Public Sub CalculateSum As Double";
 //BA.debugLineNum = 84;BA.debugLine="Dim sum As Double = 0";
_sum = 0;
 //BA.debugLineNum = 85;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group2 = _scanneditems.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
 //BA.debugLineNum = 86;BA.debugLine="sum = sum + (g.Qtty*GetGoodPrice(g.ID))";
_sum = _sum+(_g.Qtty*_getgoodprice(_g.ID));
 }
};
 //BA.debugLineNum = 88;BA.debugLine="Return sum";
if (true) return _sum;
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private ItemNamelbl,ItemPricelbl,ItemQttylbl,Fina";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_finalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_sumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Public ShopList As ScrollView";
_shoplist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Public ScannedItems As Map";
_scanneditems = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Public ItemsSuppliers As Map";
_itemssuppliers = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public CurrentItem As Good";
_currentitem = new b4a.diplomna.types._good();
 //BA.debugLineNum = 10;BA.debugLine="Public CurrentSupplier As Supplier";
_currentsupplier = new b4a.diplomna.types._supplier();
 //BA.debugLineNum = 12;BA.debugLine="Public FinishOrderbtn As Button";
_finishorderbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _delqtty_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
 //BA.debugLineNum = 232;BA.debugLine="Public Sub DelQtty_Click";
 //BA.debugLineNum = 233;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 234;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 235;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(_scanneditems.Get(_btn.getTag()));
 //BA.debugLineNum = 236;BA.debugLine="g.Qtty = g.Qtty - 1";
_g.Qtty = (int) (_g.Qtty-1);
 //BA.debugLineNum = 237;BA.debugLine="If g.Qtty <= 0 Then";
if (_g.Qtty<=0) { 
 //BA.debugLineNum = 238;BA.debugLine="ScannedItems.Remove(g.ID)";
_scanneditems.Remove((Object)(_g.ID));
 }else {
 //BA.debugLineNum = 240;BA.debugLine="ScannedItems.Put(g.ID,g)";
_scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
 //BA.debugLineNum = 242;BA.debugLine="BuildCart";
_buildcart();
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public String  _finishorder_click() throws Exception{
b4a.diplomna.types._order _neworder = null;
b4a.diplomna.types._good _g = null;
b4a.diplomna.types._orderedgood _ordergood = null;
 //BA.debugLineNum = 293;BA.debugLine="Public Sub FinishOrder_Click";
 //BA.debugLineNum = 294;BA.debugLine="If ScannedItems.Size > 0 Then";
if (_scanneditems.getSize()>0) { 
 //BA.debugLineNum = 295;BA.debugLine="Dim neworder As Order";
_neworder = new b4a.diplomna.types._order();
 //BA.debugLineNum = 296;BA.debugLine="neworder.Initialize()";
_neworder.Initialize();
 //BA.debugLineNum = 297;BA.debugLine="neworder.OrderedGoods.Initialize()";
_neworder.OrderedGoods.Initialize();
 //BA.debugLineNum = 299;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = _scanneditems.Values();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_g = (b4a.diplomna.types._good)(group5.Get(index5));
 //BA.debugLineNum = 300;BA.debugLine="Dim ordergood As OrderedGood";
_ordergood = new b4a.diplomna.types._orderedgood();
 //BA.debugLineNum = 301;BA.debugLine="ordergood.Initialize";
_ordergood.Initialize();
 //BA.debugLineNum = 302;BA.debugLine="ordergood.Order = neworder";
_ordergood.Order = _neworder;
 //BA.debugLineNum = 303;BA.debugLine="ordergood.GoodID = g.ID";
_ordergood.GoodID = _g.ID;
 //BA.debugLineNum = 304;BA.debugLine="ordergood.Qtty = g.Qtty";
_ordergood.Qtty = _g.Qtty;
 //BA.debugLineNum = 306;BA.debugLine="neworder.OrderedGoods.Add(ordergood)";
_neworder.OrderedGoods.Add((Object)(_ordergood));
 //BA.debugLineNum = 307;BA.debugLine="neworder.OrderTotalPrice = neworder.OrderTotalP";
_neworder.OrderTotalPrice = _neworder.OrderTotalPrice+(_g.Price*_g.Qtty);
 }
};
 //BA.debugLineNum = 309;BA.debugLine="neworder.CutomerID = Main.LoggedCustomer.ID";
_neworder.CutomerID = _main._loggedcustomer.ID;
 //BA.debugLineNum = 310;BA.debugLine="neworder.OrderStatus = \"Waiting\"";
_neworder.OrderStatus = "Waiting";
 //BA.debugLineNum = 311;BA.debugLine="neworder.OrderCode = \"#\" & GenerateRandomString(";
_neworder.OrderCode = "#"+_generaterandomstring((int) (10));
 //BA.debugLineNum = 312;BA.debugLine="Main.HTTP.SendOrder(neworder)";
_main._http._sendorder(_neworder);
 }else {
 //BA.debugLineNum = 314;BA.debugLine="ToastMessageShow(\"No items in cart\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No items in cart"),__c.False);
 };
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return "";
}
public String  _generaterandomstring(int _strlength) throws Exception{
String _rndstring = "";
int _rndnumber = 0;
 //BA.debugLineNum = 318;BA.debugLine="Sub GenerateRandomString(StrLength As Int) As Stri";
 //BA.debugLineNum = 319;BA.debugLine="Dim RndString As String";
_rndstring = "";
 //BA.debugLineNum = 320;BA.debugLine="Dim RndNumber As Int";
_rndnumber = 0;
 //BA.debugLineNum = 321;BA.debugLine="Do While RndString.Length < StrLength";
while (_rndstring.length()<_strlength) {
 //BA.debugLineNum = 322;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
_rndnumber = __c.Rnd((int) (48),(int) (123));
 //BA.debugLineNum = 323;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
if ((_rndnumber>=48 && _rndnumber<=57) || (_rndnumber>=65 && _rndnumber<=90) || (_rndnumber>=97 && _rndnumber<=112)) { 
 //BA.debugLineNum = 324;BA.debugLine="RndString = RndString & Chr(RndNumber)";
_rndstring = _rndstring+BA.ObjectToString(__c.Chr(_rndnumber));
 };
 }
;
 //BA.debugLineNum = 327;BA.debugLine="Return RndString";
if (true) return _rndstring;
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public double  _getgoodprice(int _goodid) throws Exception{
b4a.diplomna.types._good _g = null;
 //BA.debugLineNum = 91;BA.debugLine="Public Sub GetGoodPrice(GoodID As Int) As Double";
 //BA.debugLineNum = 92;BA.debugLine="Dim g As Good = ScannedItems.Get(GoodID)";
_g = (b4a.diplomna.types._good)(_scanneditems.Get((Object)(_goodid)));
 //BA.debugLineNum = 93;BA.debugLine="Return g.Price";
if (true) return _g.Price;
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return 0;
}
public void  _getitemfromdb(int _goodid) throws Exception{
ResumableSub_GetItemFromDB rsub = new ResumableSub_GetItemFromDB(this,_goodid);
rsub.resume(ba, null);
}
public static class ResumableSub_GetItemFromDB extends BA.ResumableSub {
public ResumableSub_GetItemFromDB(b4a.diplomna.shoppingcart parent,int _goodid) {
this.parent = parent;
this._goodid = _goodid;
}
b4a.diplomna.shoppingcart parent;
int _goodid;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _getgood = null;
Object _result = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _getsupplier = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 124;BA.debugLine="Dim GetGood As ResumableSub = Main.HTTP.GetGoodBy";
_getgood = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getgood = parent._main._http._getgoodbyid(_goodid);
 //BA.debugLineNum = 125;BA.debugLine="Wait For (GetGood)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, this, _getgood);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 127;BA.debugLine="CurrentItem = JSONSerializations.SerializeGood(Ma";
parent._currentitem = parent._jsonserializations._serializegood(ba,parent._main._http._output);
 //BA.debugLineNum = 128;BA.debugLine="CurrentItem.Qtty = 1";
parent._currentitem.Qtty = (int) (1);
 //BA.debugLineNum = 129;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput();
 //BA.debugLineNum = 131;BA.debugLine="Dim GetSupplier As ResumableSub = Main.HTTP.GetSu";
_getsupplier = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getsupplier = parent._main._http._getsupplierbyid(parent._currentitem.SupplierID);
 //BA.debugLineNum = 132;BA.debugLine="Wait For (GetSupplier)  Complete (Result As Objec";
parent.__c.WaitFor("complete", ba, this, _getsupplier);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 133;BA.debugLine="CurrentSupplier = JSONSerializations.SerializeSup";
parent._currentsupplier = parent._jsonserializations._serializesupplier(ba,parent._main._http._output);
 //BA.debugLineNum = 135;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput();
 //BA.debugLineNum = 137;BA.debugLine="AddSupplier(CurrentSupplier)";
parent._addsupplier(parent._currentsupplier);
 //BA.debugLineNum = 138;BA.debugLine="AddItemToBasket(CurrentItem)";
parent._additemtobasket(parent._currentitem);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(Object _result) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="ScannedItems.Initialize";
_scanneditems.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="CurrentItem.Initialize";
_currentitem.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="CurrentSupplier.Initialize";
_currentsupplier.Initialize();
 //BA.debugLineNum = 21;BA.debugLine="ItemsSuppliers.Initialize";
_itemssuppliers.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="CartPan.Initialize(\"\")";
_cartpan.Initialize(ba,"");
 //BA.debugLineNum = 24;BA.debugLine="pblBase.Initialize(\"\")";
_pblbase.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="pnlHeader.Initialize(\"\")";
_pnlheader.Initialize(ba,"");
 //BA.debugLineNum = 26;BA.debugLine="ItemNamelbl.Initialize(\"\")";
_itemnamelbl.Initialize(ba,"");
 //BA.debugLineNum = 27;BA.debugLine="ItemPricelbl.Initialize(\"\")";
_itempricelbl.Initialize(ba,"");
 //BA.debugLineNum = 28;BA.debugLine="ItemQttylbl.Initialize(\"\")";
_itemqttylbl.Initialize(ba,"");
 //BA.debugLineNum = 29;BA.debugLine="FinalSumlbl.Initialize(\"\")";
_finalsumlbl.Initialize(ba,"");
 //BA.debugLineNum = 30;BA.debugLine="Sumlbl.Initialize(\"\")";
_sumlbl.Initialize(ba,"");
 //BA.debugLineNum = 31;BA.debugLine="FinishOrderbtn.Initialize(\"FinishOrder\")";
_finishorderbtn.Initialize(ba,"FinishOrder");
 //BA.debugLineNum = 32;BA.debugLine="ShopList.Initialize(10%y)";
_shoplist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 34;BA.debugLine="BuildCartUI";
_buildcartui();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _refreshoverall() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub RefreshOverall";
 //BA.debugLineNum = 97;BA.debugLine="Sumlbl.Text =  NumberFormat2(CalculateSum,1,2,2,F";
_sumlbl.setText(BA.ObjectToCharSequence(__c.NumberFormat2(_calculatesum(),(int) (1),(int) (2),(int) (2),__c.False)));
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket(int _goodid) throws Exception{
b4a.diplomna.types._supplier _s = null;
 //BA.debugLineNum = 143;BA.debugLine="Public Sub RemoveItemFromBasket(GoodID As Int)";
 //BA.debugLineNum = 144;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(GoodID)";
_s = (b4a.diplomna.types._supplier)(_itemssuppliers.Get((Object)(_goodid)));
 //BA.debugLineNum = 145;BA.debugLine="ItemsSuppliers.Remove(s.ID)";
_itemssuppliers.Remove((Object)(_s.ID));
 //BA.debugLineNum = 146;BA.debugLine="ScannedItems.Remove(GoodID)";
_scanneditems.Remove((Object)(_goodid));
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
 //BA.debugLineNum = 246;BA.debugLine="Public Sub RemoveItemFromBasket_Click";
 //BA.debugLineNum = 247;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 248;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 249;BA.debugLine="RemoveItemFromBasket(btn.Tag)";
_removeitemfrombasket((int)(BA.ObjectToNumber(_btn.getTag())));
 //BA.debugLineNum = 250;BA.debugLine="BuildCart";
_buildcart();
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _selectitemfrombasket_click() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
 //BA.debugLineNum = 278;BA.debugLine="Public Sub SelectItemFromBasket_Click";
 //BA.debugLineNum = 279;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 280;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
 //BA.debugLineNum = 281;BA.debugLine="ViewSelectedItemInfo(pnl.Tag)";
_viewselectediteminfo((int)(BA.ObjectToNumber(_pnl.getTag())));
 //BA.debugLineNum = 282;BA.debugLine="Log(\"Clicked \" & pnl.Tag)";
__c.LogImpl("44325380","Clicked "+BA.ObjectToString(_pnl.getTag()),0);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes(int _num) throws Exception{
int _i = 0;
b4a.diplomna.types._good _g = null;
b4a.diplomna.types._supplier _s = null;
 //BA.debugLineNum = 253;BA.debugLine="Public Sub TestWithFakes(num As Int)";
 //BA.debugLineNum = 254;BA.debugLine="For i = 0 To num";
{
final int step1 = 1;
final int limit1 = _num;
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 255;BA.debugLine="Dim g As Good";
_g = new b4a.diplomna.types._good();
 //BA.debugLineNum = 256;BA.debugLine="Dim s As Supplier";
_s = new b4a.diplomna.types._supplier();
 //BA.debugLineNum = 258;BA.debugLine="g.ID = i";
_g.ID = _i;
 //BA.debugLineNum = 259;BA.debugLine="g.SupplierID = i";
_g.SupplierID = _i;
 //BA.debugLineNum = 260;BA.debugLine="g.Qtty = 1";
_g.Qtty = (int) (1);
 //BA.debugLineNum = 262;BA.debugLine="g.Name = \"Name\"&i";
_g.Name = "Name"+BA.NumberToString(_i);
 //BA.debugLineNum = 263;BA.debugLine="g.PLU = 100+i";
_g.PLU = (int) (100+_i);
 //BA.debugLineNum = 264;BA.debugLine="g.Price = 5.99 + i";
_g.Price = 5.99+_i;
 //BA.debugLineNum = 265;BA.debugLine="g.Description = \"nothing\"";
_g.Description = "nothing";
 //BA.debugLineNum = 266;BA.debugLine="g.Is_Discontinued = 0";
_g.Is_Discontinued = (int) (0);
 //BA.debugLineNum = 268;BA.debugLine="s.ID = i";
_s.ID = _i;
 //BA.debugLineNum = 269;BA.debugLine="s.SupplierName = \"Micro\"&i";
_s.SupplierName = "Micro"+BA.NumberToString(_i);
 //BA.debugLineNum = 270;BA.debugLine="s.SupploerPhone = \"088896451\"&i";
_s.SupploerPhone = "088896451"+BA.NumberToString(_i);
 //BA.debugLineNum = 272;BA.debugLine="AddItemToBasket(g)";
_additemtobasket(_g);
 //BA.debugLineNum = 273;BA.debugLine="AddSupplier(s)";
_addsupplier(_s);
 }
};
 //BA.debugLineNum = 275;BA.debugLine="BuildCart";
_buildcart();
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return "";
}
public String  _viewselectediteminfo(int _goodid) throws Exception{
b4a.diplomna.types._good _item = null;
b4a.diplomna.types._supplier _s = null;
 //BA.debugLineNum = 285;BA.debugLine="Public Sub ViewSelectedItemInfo(GoodID As Int)";
 //BA.debugLineNum = 286;BA.debugLine="Dim item As Good = ScannedItems.Get(GoodID)";
_item = (b4a.diplomna.types._good)(_scanneditems.Get((Object)(_goodid)));
 //BA.debugLineNum = 287;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(item.Suppl";
_s = (b4a.diplomna.types._supplier)(_itemssuppliers.Get((Object)(_item.SupplierID)));
 //BA.debugLineNum = 289;BA.debugLine="CallSub3(Main,\"ShowItemInfo\",item,s)";
__c.CallSubNew3(ba,(Object)(_main.getObject()),"ShowItemInfo",(Object)(_item),(Object)(_s));
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
