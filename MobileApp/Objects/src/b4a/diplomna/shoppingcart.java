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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.shoppingcart __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="ScannedItems.Initialize";
__ref._scanneditems.Initialize();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="CurrentItem.Initialize";
__ref._currentitem.Initialize();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="ItemsDetails.Initialize";
__ref._itemsdetails.Initialize();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="ItemsSuppliers.Initialize";
__ref._itemssuppliers.Initialize();
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="ItemNamelbl.Initialize(\"\")";
__ref._itemnamelbl.Initialize(ba,"");
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="ItemPricelbl.Initialize(\"\")";
__ref._itempricelbl.Initialize(ba,"");
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="ItemQttylbl.Initialize(\"\")";
__ref._itemqttylbl.Initialize(ba,"");
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="FinalSumlbl.Initialize(\"\")";
__ref._finalsumlbl.Initialize(ba,"");
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="Sumlbl.Initialize(\"\")";
__ref._sumlbl.Initialize(ba,"");
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="ShopList.Initialize(10%y)";
__ref._shoplist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="BuildCartUI";
__ref._buildcartui(null);
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="End Sub";
return "";
}
public String  _testwithfakes(b4a.diplomna.shoppingcart __ref,int _num) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "testwithfakes"))
	 {return ((String) Debug.delegate(ba, "testwithfakes", new Object[] {_num}));}
int _i = 0;
b4a.diplomna.types._good _g = null;
b4a.diplomna.types._gooddetail _gd = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub TestWithFakes(num As Int)";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="For i = 0 To num";
{
final int step1 = 1;
final int limit1 = _num;
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim g As Good";
_g = new b4a.diplomna.types._good();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Dim gd As GoodDetail";
_gd = new b4a.diplomna.types._gooddetail();
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Dim s As Supplier";
_s = new b4a.diplomna.types._supplier();
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="g.ID = i";
_g.ID = _i;
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="g.DetailID = i";
_g.DetailID = _i;
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="g.SupplierID = i";
_g.SupplierID = _i;
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="g.Qtty = 1";
_g.Qtty = (int) (1);
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="gd.ID = i";
_gd.ID = _i;
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="gd.Name = \"Name\"&i";
_gd.Name = "Name"+BA.NumberToString(_i);
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="gd.PLU = 100+i";
_gd.PLU = (int) (100+_i);
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="gd.Price = 5.99 + i";
_gd.Price = 5.99+_i;
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="gd.Description = \"nothing\"";
_gd.Description = "nothing";
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="gd.Is_Discontinued = 0";
_gd.Is_Discontinued = (int) (0);
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="s.ID = i";
_s.ID = _i;
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="s.SupplierName = \"Micro\"&i";
_s.SupplierName = "Micro"+BA.NumberToString(_i);
RDebugUtils.currentLine=4128788;
 //BA.debugLineNum = 4128788;BA.debugLine="s.SupploerPhone = \"088896451\"&i";
_s.SupploerPhone = "088896451"+BA.NumberToString(_i);
RDebugUtils.currentLine=4128790;
 //BA.debugLineNum = 4128790;BA.debugLine="AddItemToBasket(g)";
__ref._additemtobasket(null,_g);
RDebugUtils.currentLine=4128791;
 //BA.debugLineNum = 4128791;BA.debugLine="AddGoodDetail(gd)";
__ref._addgooddetail(null,_gd);
RDebugUtils.currentLine=4128792;
 //BA.debugLineNum = 4128792;BA.debugLine="AddSupplier(s)";
__ref._addsupplier(null,_s);
 }
};
RDebugUtils.currentLine=4128794;
 //BA.debugLineNum = 4128794;BA.debugLine="End Sub";
return "";
}
public String  _buildcart(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "buildcart"))
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
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="ShopList.Panel.RemoveAllViews";
__ref._shoplist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._scanneditems.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_g = (b4a.diplomna.types._good)(group3.Get(index3));
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Private itemdetail As GoodDetail = ItemsDetails.";
_itemdetail = (b4a.diplomna.types._gooddetail)(__ref._itemsdetails.Get((Object)(_g.ID)));
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="Private itemName,itemPrice,itemQtty As Label";
_itemname = new anywheresoftware.b4a.objects.LabelWrapper();
_itemprice = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqtty = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Private delitemX,additem,delitem As Button";
_delitemx = new anywheresoftware.b4a.objects.ButtonWrapper();
_additem = new anywheresoftware.b4a.objects.ButtonWrapper();
_delitem = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="holder.Initialize(\"SelectItemFromBasket\")";
_holder.Initialize(ba,"SelectItemFromBasket");
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="itemQtty.Initialize(\"\")";
_itemqtty.Initialize(ba,"");
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="itemName.Initialize(\"\")";
_itemname.Initialize(ba,"");
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="itemPrice.Initialize(\"\")";
_itemprice.Initialize(ba,"");
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="delitemX.Initialize(\"RemoveItemFromBasket\")";
_delitemx.Initialize(ba,"RemoveItemFromBasket");
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="additem.Initialize(\"AddQtty\")";
_additem.Initialize(ba,"AddQtty");
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="delitem.Initialize(\"DelQtty\")";
_delitem.Initialize(ba,"DelQtty");
RDebugUtils.currentLine=3866641;
 //BA.debugLineNum = 3866641;BA.debugLine="holder.Color = Colors.White";
_holder.setColor(__c.Colors.White);
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="holder.Tag = g.ID";
_holder.setTag((Object)(_g.ID));
RDebugUtils.currentLine=3866644;
 //BA.debugLineNum = 3866644;BA.debugLine="itemName.Text = itemdetail.Name";
_itemname.setText(BA.ObjectToCharSequence(_itemdetail.Name));
RDebugUtils.currentLine=3866645;
 //BA.debugLineNum = 3866645;BA.debugLine="itemName.Gravity = Gravity.CENTER";
_itemname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3866646;
 //BA.debugLineNum = 3866646;BA.debugLine="itemName.TextColor =  Colors.DarkGray";
_itemname.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=3866649;
 //BA.debugLineNum = 3866649;BA.debugLine="itemPrice.Text = itemdetail.Price";
_itemprice.setText(BA.ObjectToCharSequence(_itemdetail.Price));
RDebugUtils.currentLine=3866650;
 //BA.debugLineNum = 3866650;BA.debugLine="itemPrice.Gravity = Gravity.CENTER";
_itemprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3866651;
 //BA.debugLineNum = 3866651;BA.debugLine="itemPrice.TextColor =  Colors.DarkGray";
_itemprice.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=3866654;
 //BA.debugLineNum = 3866654;BA.debugLine="itemQtty.Text = g.Qtty";
_itemqtty.setText(BA.ObjectToCharSequence(_g.Qtty));
RDebugUtils.currentLine=3866655;
 //BA.debugLineNum = 3866655;BA.debugLine="itemQtty.Gravity = Gravity.CENTER";
_itemqtty.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3866656;
 //BA.debugLineNum = 3866656;BA.debugLine="itemQtty.TextColor =  Colors.DarkGray";
_itemqtty.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=3866659;
 //BA.debugLineNum = 3866659;BA.debugLine="holder.AddView(itemName, 0, 0, 20%x, 5%y)";
_holder.AddView((android.view.View)(_itemname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3866660;
 //BA.debugLineNum = 3866660;BA.debugLine="holder.AddView(itemPrice, itemName.Left + itemNa";
_holder.AddView((android.view.View)(_itemprice.getObject()),(int) (_itemname.getLeft()+_itemname.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3866661;
 //BA.debugLineNum = 3866661;BA.debugLine="holder.AddView(itemQtty, itemPrice.Left + itemPr";
_holder.AddView((android.view.View)(_itemqtty.getObject()),(int) (_itemprice.getLeft()+_itemprice.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3866662;
 //BA.debugLineNum = 3866662;BA.debugLine="holder.AddView(additem, itemQtty.Left + itemQtty";
_holder.AddView((android.view.View)(_additem.getObject()),(int) (_itemqtty.getLeft()+_itemqtty.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3866663;
 //BA.debugLineNum = 3866663;BA.debugLine="holder.AddView(delitem, additem.Left + additem.W";
_holder.AddView((android.view.View)(_delitem.getObject()),(int) (_additem.getLeft()+_additem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3866664;
 //BA.debugLineNum = 3866664;BA.debugLine="holder.AddView(delitemX, delitem.Left + delitem.";
_holder.AddView((android.view.View)(_delitemx.getObject()),(int) (_delitem.getLeft()+_delitem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3866666;
 //BA.debugLineNum = 3866666;BA.debugLine="delitemX.Text = \"x\"";
_delitemx.setText(BA.ObjectToCharSequence("x"));
RDebugUtils.currentLine=3866667;
 //BA.debugLineNum = 3866667;BA.debugLine="delitemX.TextSize = 8";
_delitemx.setTextSize((float) (8));
RDebugUtils.currentLine=3866668;
 //BA.debugLineNum = 3866668;BA.debugLine="delitemX.Gravity = Gravity.CENTER";
_delitemx.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3866669;
 //BA.debugLineNum = 3866669;BA.debugLine="delitemX.TextColor =  Colors.Black";
_delitemx.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3866670;
 //BA.debugLineNum = 3866670;BA.debugLine="delitemX.Color = Colors.rgb(255, 102, 0)";
_delitemx.setColor(__c.Colors.RGB((int) (255),(int) (102),(int) (0)));
RDebugUtils.currentLine=3866671;
 //BA.debugLineNum = 3866671;BA.debugLine="delitemX.Tag = g.ID";
_delitemx.setTag((Object)(_g.ID));
RDebugUtils.currentLine=3866673;
 //BA.debugLineNum = 3866673;BA.debugLine="additem.Text = \"+\"";
_additem.setText(BA.ObjectToCharSequence("+"));
RDebugUtils.currentLine=3866674;
 //BA.debugLineNum = 3866674;BA.debugLine="additem.TextSize = 8";
_additem.setTextSize((float) (8));
RDebugUtils.currentLine=3866675;
 //BA.debugLineNum = 3866675;BA.debugLine="additem.Textcolor = Colors.Black";
_additem.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3866676;
 //BA.debugLineNum = 3866676;BA.debugLine="additem.Color = Colors.Transparent";
_additem.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=3866677;
 //BA.debugLineNum = 3866677;BA.debugLine="additem.Gravity = Gravity.CENTER";
_additem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3866678;
 //BA.debugLineNum = 3866678;BA.debugLine="additem.Tag = g.ID";
_additem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=3866680;
 //BA.debugLineNum = 3866680;BA.debugLine="delitem.Text = \"-\"";
_delitem.setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=3866681;
 //BA.debugLineNum = 3866681;BA.debugLine="delitem.Textsize = 8";
_delitem.setTextSize((float) (8));
RDebugUtils.currentLine=3866682;
 //BA.debugLineNum = 3866682;BA.debugLine="delitem.TextColor = Colors.Black";
_delitem.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3866683;
 //BA.debugLineNum = 3866683;BA.debugLine="delitem.Color = Colors.Transparent";
_delitem.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=3866684;
 //BA.debugLineNum = 3866684;BA.debugLine="delitem.Gravity = Gravity.CENTER";
_delitem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3866685;
 //BA.debugLineNum = 3866685;BA.debugLine="delitem.Tag = g.ID";
_delitem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=3866687;
 //BA.debugLineNum = 3866687;BA.debugLine="ShopList.Panel.AddView(holder,0,0+(5%y + 1dip)*r";
__ref._shoplist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._shoplist.getPanel().getWidth(),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3866689;
 //BA.debugLineNum = 3866689;BA.debugLine="If row < ScannedItems.Size - 1 Then";
if (_row<__ref._scanneditems.getSize()-1) { 
RDebugUtils.currentLine=3866690;
 //BA.debugLineNum = 3866690;BA.debugLine="ShopList.Panel.Height = 10%y + ((5%y + 1dip)*ro";
__ref._shoplist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=3866691;
 //BA.debugLineNum = 3866691;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=3866695;
 //BA.debugLineNum = 3866695;BA.debugLine="RefreshOverall";
__ref._refreshoverall(null);
RDebugUtils.currentLine=3866696;
 //BA.debugLineNum = 3866696;BA.debugLine="End Sub";
return "";
}
public String  _addgooddetail(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._gooddetail _gd) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addgooddetail"))
	 {return ((String) Debug.delegate(ba, "addgooddetail", new Object[] {_gd}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub AddGoodDetail(gd As GoodDetail)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="ItemsDetails.Put(gd.ID , gd)";
__ref._itemsdetails.Put((Object)(_gd.ID),(Object)(_gd));
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return "";
}
public String  _additemtobasket(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._good _g) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "additemtobasket"))
	 {return ((String) Debug.delegate(ba, "additemtobasket", new Object[] {_g}));}
b4a.diplomna.types._good _item = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub AddItemToBasket(g As Good)";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="If ScannedItems.ContainsKey(g.ID) Then";
if (__ref._scanneditems.ContainsKey((Object)(_g.ID))) { 
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim Item As Good = ScannedItems.Get(g.ID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_g.ID)));
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Item.Qtty = Item.Qtty + 1";
_item.Qtty = (int) (_item.Qtty+1);
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="ScannedItems.Put(Item.ID,Item)";
__ref._scanneditems.Put((Object)(_item.ID),(Object)(_item));
 }else {
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="End Sub";
return "";
}
public String  _addqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addqtty_click"))
	 {return ((String) Debug.delegate(ba, "addqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub AddQtty_Click";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get(_btn.getTag()));
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="g.Qtty = g.Qtty + 1";
_g.Qtty = (int) (_g.Qtty+1);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="End Sub";
return "";
}
public String  _addsupplier(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._supplier _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addsupplier"))
	 {return ((String) Debug.delegate(ba, "addsupplier", new Object[] {_s}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub AddSupplier(s As Supplier)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="ItemsSuppliers.Put(s.ID,s)";
__ref._itemssuppliers.Put((Object)(_s.ID),(Object)(_s));
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public String  _refreshoverall(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "refreshoverall"))
	 {return ((String) Debug.delegate(ba, "refreshoverall", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub RefreshOverall";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Sumlbl.Text =  NumberFormat2(CalculateSum,1,2,2,F";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__c.NumberFormat2(__ref._calculatesum(null),(int) (1),(int) (2),(int) (2),__c.False)));
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public String  _buildcartui(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "buildcartui"))
	 {return ((String) Debug.delegate(ba, "buildcartui", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub BuildCartUI";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="CartPan.Color = Colors.LightGray";
__ref._cartpan.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="pblBase.Color = Colors.RGB(182,0,0)";
__ref._pblbase.setColor(__c.Colors.RGB((int) (182),(int) (0),(int) (0)));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="pnlHeader.Color = Colors.RGB(182,0,0)";
__ref._pnlheader.setColor(__c.Colors.RGB((int) (182),(int) (0),(int) (0)));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="CartPan.AddView(pblBase,0,45%y,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="ItemNamelbl.Text = \"Name\"";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
__ref._itemnamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
__ref._itemnamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="ItemPricelbl.Text = \"Price\"";
__ref._itempricelbl.setText(BA.ObjectToCharSequence("Price"));
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="ItemPricelbl.Gravity = Gravity.CENTER";
__ref._itempricelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="ItemPricelbl.TextColor = Colors.White";
__ref._itempricelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="ItemQttylbl.Text = \"Quantity\"";
__ref._itemqttylbl.setText(BA.ObjectToCharSequence("Quantity"));
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="ItemQttylbl.Gravity = Gravity.CENTER";
__ref._itemqttylbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="ItemQttylbl.TextColor = Colors.White";
__ref._itemqttylbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="FinalSumlbl.Text = \"Quantity\"";
__ref._finalsumlbl.setText(BA.ObjectToCharSequence("Quantity"));
RDebugUtils.currentLine=3145749;
 //BA.debugLineNum = 3145749;BA.debugLine="FinalSumlbl.Gravity = Gravity.CENTER";
__ref._finalsumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3145750;
 //BA.debugLineNum = 3145750;BA.debugLine="FinalSumlbl.TextColor = Colors.White";
__ref._finalsumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="Sumlbl.Text = CalculateSum";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__ref._calculatesum(null)));
RDebugUtils.currentLine=3145753;
 //BA.debugLineNum = 3145753;BA.debugLine="Sumlbl.Gravity = Gravity.CENTER";
__ref._sumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3145754;
 //BA.debugLineNum = 3145754;BA.debugLine="Sumlbl.TextColor = Colors.White";
__ref._sumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3145756;
 //BA.debugLineNum = 3145756;BA.debugLine="pnlHeader.AddView(ItemNamelbl, 0, 0, 20%x, 5%y)";
__ref._pnlheader.AddView((android.view.View)(__ref._itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145757;
 //BA.debugLineNum = 3145757;BA.debugLine="pnlHeader.AddView(ItemPricelbl,  ItemNamelbl.Left";
__ref._pnlheader.AddView((android.view.View)(__ref._itempricelbl.getObject()),(int) (__ref._itemnamelbl.getLeft()+__ref._itemnamelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145758;
 //BA.debugLineNum = 3145758;BA.debugLine="pnlHeader.AddView(ItemQttylbl,   ItemPricelbl.Lef";
__ref._pnlheader.AddView((android.view.View)(__ref._itemqttylbl.getObject()),(int) (__ref._itempricelbl.getLeft()+__ref._itempricelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145760;
 //BA.debugLineNum = 3145760;BA.debugLine="pblBase.AddView(FinalSumlbl, 0, 0, 20%x, 5%y)";
__ref._pblbase.AddView((android.view.View)(__ref._finalsumlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145761;
 //BA.debugLineNum = 3145761;BA.debugLine="pblBase.AddView(Sumlbl, FinalSumlbl.Left + FinalS";
__ref._pblbase.AddView((android.view.View)(__ref._sumlbl.getObject()),(int) (__ref._finalsumlbl.getLeft()+__ref._finalsumlbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145763;
 //BA.debugLineNum = 3145763;BA.debugLine="CartPan.AddView(ShopList,0%x, 5%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._shoplist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=3145764;
 //BA.debugLineNum = 3145764;BA.debugLine="End Sub";
return "";
}
public double  _calculatesum(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "calculatesum"))
	 {return ((Double) Debug.delegate(ba, "calculatesum", null));}
double _sum = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub CalculateSum As Double";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim sum As Double = 0";
_sum = 0;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._scanneditems.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="sum = sum + (g.Qtty*GetGoodPrice(g.ID))";
_sum = _sum+(_g.Qtty*__ref._getgoodprice(null,_g.ID));
 }
};
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="Return sum";
if (true) return _sum;
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="End Sub";
return 0;
}
public double  _getgoodprice(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "getgoodprice"))
	 {return ((Double) Debug.delegate(ba, "getgoodprice", new Object[] {_goodid}));}
b4a.diplomna.types._gooddetail _gd = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub GetGoodPrice(GoodID As Int) As Double";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim gd As GoodDetail = ItemsDetails.Get(GoodID)";
_gd = (b4a.diplomna.types._gooddetail)(__ref._itemsdetails.Get((Object)(_goodid)));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Return gd.Price";
if (true) return _gd.Price;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Private ItemNamelbl,ItemPricelbl,ItemQttylbl,Fina";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_finalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_sumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Public ShopList As ScrollView";
_shoplist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Public ScannedItems As Map";
_scanneditems = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Public ItemsDetails As Map";
_itemsdetails = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Public ItemsSuppliers As Map";
_itemssuppliers = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Public CurrentItem As Good";
_currentitem = new b4a.diplomna.types._good();
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="End Sub";
return "";
}
public String  _delqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "delqtty_click"))
	 {return ((String) Debug.delegate(ba, "delqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub DelQtty_Click";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get(_btn.getTag()));
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="g.Qtty = g.Qtty - 1";
_g.Qtty = (int) (_g.Qtty-1);
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="If g.Qtty <= 0 Then";
if (_g.Qtty<=0) { 
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="ScannedItems.Remove(g.ID)";
__ref._scanneditems.Remove((Object)(_g.ID));
 }else {
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="End Sub";
return "";
}
public b4a.diplomna.types._good  _deserializeiteminfo(b4a.diplomna.shoppingcart __ref,String _info) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "deserializeiteminfo"))
	 {return ((b4a.diplomna.types._good) Debug.delegate(ba, "deserializeiteminfo", new Object[] {_info}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub DeserializeItemInfo(Info As String) As";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return null;
}
public void  _getiteminformation(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "getiteminformation"))
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
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim test As ResumableSub = Main.HTTP.GetGoodByID(";
_test = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_test = parent._main._http._getgoodbyid(null,_goodid);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Wait For (test)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "shoppingcart", "getiteminformation"), _test);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="If Result = False Then";
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
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Log(\"FAILED\")";
parent.__c.Log("FAILED");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="CurrentItem = DeserializeItemInfo(Main.HTTP.Outp";
__ref._currentitem = __ref._deserializeiteminfo(null,parent._main._http._output);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _removeitemfrombasket(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket"))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket", new Object[] {_goodid}));}
b4a.diplomna.types._good _good = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub RemoveItemFromBasket(GoodID As Int)";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim good As Good = ScannedItems.Get(GoodID)";
_good = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(GoodID)";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_goodid)));
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="ItemsDetails.Remove(good.DetailID)";
__ref._itemsdetails.Remove((Object)(_good.DetailID));
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="ItemsSuppliers.Remove(s.ID)";
__ref._itemssuppliers.Remove((Object)(_s.ID));
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="ScannedItems.Remove(GoodID)";
__ref._scanneditems.Remove((Object)(_goodid));
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket_click"))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub RemoveItemFromBasket_Click";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="RemoveItemFromBasket(btn.Tag)";
__ref._removeitemfrombasket(null,(int)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="End Sub";
return "";
}
public String  _selectitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "selectitemfrombasket_click"))
	 {return ((String) Debug.delegate(ba, "selectitemfrombasket_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub SelectItemFromBasket_Click";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="ViewSelectedItemInfo(pnl.Tag)";
__ref._viewselectediteminfo(null,(int)(BA.ObjectToNumber(_pnl.getTag())));
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Log(\"Clicked \" & pnl.Tag)";
__c.Log("Clicked "+BA.ObjectToString(_pnl.getTag()));
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="End Sub";
return "";
}
public String  _viewselectediteminfo(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "viewselectediteminfo"))
	 {return ((String) Debug.delegate(ba, "viewselectediteminfo", new Object[] {_goodid}));}
b4a.diplomna.types._good _item = null;
b4a.diplomna.types._gooddetail _gd = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub ViewSelectedItemInfo(GoodID As Int)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim item As Good = ScannedItems.Get(GoodID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim gd As GoodDetail = ItemsDetails.Get(item.Deta";
_gd = (b4a.diplomna.types._gooddetail)(__ref._itemsdetails.Get((Object)(_item.DetailID)));
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(item.Suppl";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_item.SupplierID)));
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="CallSub3(Main,\"ShowItemInfo\",gd,s)";
__c.CallSubDebug3(ba,(Object)(_main.getObject()),"ShowItemInfo",(Object)(_gd),(Object)(_s));
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="End Sub";
return "";
}
}