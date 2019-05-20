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
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return CartPan";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._cartpan.getObject()));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.shoppingcart __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="ScannedItems.Initialize";
__ref._scanneditems.Initialize();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="CurrentItem.Initialize";
__ref._currentitem.Initialize();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="CurrentSupplier.Initialize";
__ref._currentsupplier.Initialize();
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="ItemsSuppliers.Initialize";
__ref._itemssuppliers.Initialize();
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="CartPan.Initialize(\"\")";
__ref._cartpan.Initialize(ba,"");
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="pblBase.Initialize(\"\")";
__ref._pblbase.Initialize(ba,"");
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="pnlHeader.Initialize(\"\")";
__ref._pnlheader.Initialize(ba,"");
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="ItemNamelbl.Initialize(\"\")";
__ref._itemnamelbl.Initialize(ba,"");
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="ItemPricelbl.Initialize(\"\")";
__ref._itempricelbl.Initialize(ba,"");
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="ItemQttylbl.Initialize(\"\")";
__ref._itemqttylbl.Initialize(ba,"");
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="FinalSumlbl.Initialize(\"\")";
__ref._finalsumlbl.Initialize(ba,"");
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="Sumlbl.Initialize(\"\")";
__ref._sumlbl.Initialize(ba,"");
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="FinishOrderbtn.Initialize(\"FinishOrder\")";
__ref._finishorderbtn.Initialize(ba,"FinishOrder");
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="ShopList.Initialize(10%y)";
__ref._shoplist.Initialize(ba,__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="BuildCartUI";
__ref._buildcartui(null);
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim GetGood As ResumableSub = Main.HTTP.GetGoodBy";
_getgood = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getgood = parent._main._http._getgoodbyid(null,_goodid);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Wait For (GetGood)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "shoppingcart", "getitemfromdb"), _getgood);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="CurrentItem = JSONSerializations.SerializeGood(Ma";
__ref._currentitem = parent._jsonserializations._serializegood(ba,parent._main._http._output);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="CurrentItem.Qtty = 1";
__ref._currentitem.Qtty = (int) (1);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Dim GetSupplier As ResumableSub = Main.HTTP.GetSu";
_getsupplier = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getsupplier = parent._main._http._getsupplierbyid(null,__ref._currentitem.SupplierID);
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="Wait For (GetSupplier)  Complete (Result As Objec";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "shoppingcart", "getitemfromdb"), _getsupplier);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Object) result[1];
;
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="CurrentSupplier = JSONSerializations.SerializeSup";
__ref._currentsupplier = parent._jsonserializations._serializesupplier(ba,parent._main._http._output);
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="AddSupplier(CurrentSupplier)";
__ref._addsupplier(null,__ref._currentsupplier);
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="AddItemToBasket(CurrentItem)";
__ref._additemtobasket(null,__ref._currentitem);
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _additemtobasket(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._good _g) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "additemtobasket", false))
	 {return ((String) Debug.delegate(ba, "additemtobasket", new Object[] {_g}));}
b4a.diplomna.types._good _item = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub AddItemToBasket(g As Good)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If ScannedItems.ContainsKey(g.ID) Then";
if (__ref._scanneditems.ContainsKey((Object)(_g.ID))) { 
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim Item As Good = ScannedItems.Get(g.ID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_g.ID)));
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Item.Qtty = Item.Qtty + 1";
_item.Qtty = (int) (_item.Qtty+1);
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="ScannedItems.Put(Item.ID,Item)";
__ref._scanneditems.Put((Object)(_item.ID),(Object)(_item));
 }else {
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub BuildCart";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="ShopList.Panel.RemoveAllViews";
__ref._shoplist.getPanel().RemoveAllViews();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._scanneditems.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_g = (b4a.diplomna.types._good)(group3.Get(index3));
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Private itemName,itemPrice,itemQtty As Label";
_itemname = new anywheresoftware.b4a.objects.LabelWrapper();
_itemprice = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqtty = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Private delitemX,additem,delitem As Button";
_delitemx = new anywheresoftware.b4a.objects.ButtonWrapper();
_additem = new anywheresoftware.b4a.objects.ButtonWrapper();
_delitem = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="holder.Initialize(\"SelectItemFromBasket\")";
_holder.Initialize(ba,"SelectItemFromBasket");
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="itemQtty.Initialize(\"\")";
_itemqtty.Initialize(ba,"");
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="itemName.Initialize(\"\")";
_itemname.Initialize(ba,"");
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="itemPrice.Initialize(\"\")";
_itemprice.Initialize(ba,"");
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="delitemX.Initialize(\"RemoveItemFromBasket\")";
_delitemx.Initialize(ba,"RemoveItemFromBasket");
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="additem.Initialize(\"AddQtty\")";
_additem.Initialize(ba,"AddQtty");
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="delitem.Initialize(\"DelQtty\")";
_delitem.Initialize(ba,"DelQtty");
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="holder.Tag = g.ID";
_holder.setTag((Object)(_g.ID));
RDebugUtils.currentLine=2818067;
 //BA.debugLineNum = 2818067;BA.debugLine="itemName.Text = g.Name";
_itemname.setText(BA.ObjectToCharSequence(_g.Name));
RDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="itemName.Gravity = Gravity.CENTER";
_itemname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="itemName.TextColor =  Colors.DarkGray";
_itemname.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=2818072;
 //BA.debugLineNum = 2818072;BA.debugLine="itemPrice.Text = g.Price";
_itemprice.setText(BA.ObjectToCharSequence(_g.Price));
RDebugUtils.currentLine=2818073;
 //BA.debugLineNum = 2818073;BA.debugLine="itemPrice.Gravity = Gravity.CENTER";
_itemprice.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2818074;
 //BA.debugLineNum = 2818074;BA.debugLine="itemPrice.TextColor =  Colors.DarkGray";
_itemprice.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=2818077;
 //BA.debugLineNum = 2818077;BA.debugLine="itemQtty.Text = g.Qtty";
_itemqtty.setText(BA.ObjectToCharSequence(_g.Qtty));
RDebugUtils.currentLine=2818078;
 //BA.debugLineNum = 2818078;BA.debugLine="itemQtty.Gravity = Gravity.CENTER";
_itemqtty.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2818079;
 //BA.debugLineNum = 2818079;BA.debugLine="itemQtty.TextColor =  Colors.DarkGray";
_itemqtty.setTextColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=2818082;
 //BA.debugLineNum = 2818082;BA.debugLine="holder.AddView(itemName, 0, 0, 20%x, 5%y)";
_holder.AddView((android.view.View)(_itemname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2818083;
 //BA.debugLineNum = 2818083;BA.debugLine="holder.AddView(itemPrice, itemName.Left + itemNa";
_holder.AddView((android.view.View)(_itemprice.getObject()),(int) (_itemname.getLeft()+_itemname.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2818084;
 //BA.debugLineNum = 2818084;BA.debugLine="holder.AddView(itemQtty, itemPrice.Left + itemPr";
_holder.AddView((android.view.View)(_itemqtty.getObject()),(int) (_itemprice.getLeft()+_itemprice.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2818085;
 //BA.debugLineNum = 2818085;BA.debugLine="holder.AddView(additem, itemQtty.Left + itemQtty";
_holder.AddView((android.view.View)(_additem.getObject()),(int) (_itemqtty.getLeft()+_itemqtty.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2818086;
 //BA.debugLineNum = 2818086;BA.debugLine="holder.AddView(delitem, additem.Left + additem.W";
_holder.AddView((android.view.View)(_delitem.getObject()),(int) (_additem.getLeft()+_additem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2818087;
 //BA.debugLineNum = 2818087;BA.debugLine="holder.AddView(delitemX, delitem.Left + delitem.";
_holder.AddView((android.view.View)(_delitemx.getObject()),(int) (_delitem.getLeft()+_delitem.getWidth()),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2818089;
 //BA.debugLineNum = 2818089;BA.debugLine="delitemX.Text = \"x\"";
_delitemx.setText(BA.ObjectToCharSequence("x"));
RDebugUtils.currentLine=2818090;
 //BA.debugLineNum = 2818090;BA.debugLine="delitemX.TextSize = 14";
_delitemx.setTextSize((float) (14));
RDebugUtils.currentLine=2818091;
 //BA.debugLineNum = 2818091;BA.debugLine="delitemX.Gravity = Gravity.CENTER";
_delitemx.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2818092;
 //BA.debugLineNum = 2818092;BA.debugLine="delitemX.TextColor =  AppColors.FadedDarkRed";
_delitemx.setTextColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=2818093;
 //BA.debugLineNum = 2818093;BA.debugLine="delitemX.Color = AppColors.Transparent";
_delitemx.setColor(_appcolors._transparent);
RDebugUtils.currentLine=2818094;
 //BA.debugLineNum = 2818094;BA.debugLine="delitemX.Tag = g.ID";
_delitemx.setTag((Object)(_g.ID));
RDebugUtils.currentLine=2818096;
 //BA.debugLineNum = 2818096;BA.debugLine="additem.Text = \"+\"";
_additem.setText(BA.ObjectToCharSequence("+"));
RDebugUtils.currentLine=2818097;
 //BA.debugLineNum = 2818097;BA.debugLine="additem.TextSize = 14";
_additem.setTextSize((float) (14));
RDebugUtils.currentLine=2818098;
 //BA.debugLineNum = 2818098;BA.debugLine="additem.Textcolor = AppColors.Black";
_additem.setTextColor(_appcolors._black);
RDebugUtils.currentLine=2818099;
 //BA.debugLineNum = 2818099;BA.debugLine="additem.Color = AppColors.Transparent";
_additem.setColor(_appcolors._transparent);
RDebugUtils.currentLine=2818100;
 //BA.debugLineNum = 2818100;BA.debugLine="additem.Gravity = Gravity.CENTER";
_additem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2818101;
 //BA.debugLineNum = 2818101;BA.debugLine="additem.Tag = g.ID";
_additem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=2818103;
 //BA.debugLineNum = 2818103;BA.debugLine="delitem.Text = \"-\"";
_delitem.setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=2818104;
 //BA.debugLineNum = 2818104;BA.debugLine="delitem.Textsize = 14";
_delitem.setTextSize((float) (14));
RDebugUtils.currentLine=2818105;
 //BA.debugLineNum = 2818105;BA.debugLine="delitem.TextColor = AppColors.Black";
_delitem.setTextColor(_appcolors._black);
RDebugUtils.currentLine=2818106;
 //BA.debugLineNum = 2818106;BA.debugLine="delitem.Color = AppColors.Transparent";
_delitem.setColor(_appcolors._transparent);
RDebugUtils.currentLine=2818107;
 //BA.debugLineNum = 2818107;BA.debugLine="delitem.Gravity = Gravity.CENTER";
_delitem.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2818108;
 //BA.debugLineNum = 2818108;BA.debugLine="delitem.Tag = g.ID";
_delitem.setTag((Object)(_g.ID));
RDebugUtils.currentLine=2818110;
 //BA.debugLineNum = 2818110;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_holder.getObject())),__c.Colors.Transparent,_appcolors._lightgray,_appcolors._lightgray,_appcolors._lightgraypressed,_appcolors._lightgraypressed,__c.Colors.Transparent,__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=2818111;
 //BA.debugLineNum = 2818111;BA.debugLine="ShopList.Panel.AddView(holder,0,0+(5%y + 1dip)*r";
__ref._shoplist.getPanel().AddView((android.view.View)(_holder.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row),__ref._shoplist.getPanel().getWidth(),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2818113;
 //BA.debugLineNum = 2818113;BA.debugLine="If row < ScannedItems.Size - 1 Then";
if (_row<__ref._scanneditems.getSize()-1) { 
RDebugUtils.currentLine=2818114;
 //BA.debugLineNum = 2818114;BA.debugLine="ShopList.Panel.Height = 10%y + ((5%y + 1dip)*ro";
__ref._shoplist.getPanel().setHeight((int) (__c.PerYToCurrent((float) (10),ba)+((__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (1)))*_row)));
RDebugUtils.currentLine=2818115;
 //BA.debugLineNum = 2818115;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 };
 }
};
RDebugUtils.currentLine=2818119;
 //BA.debugLineNum = 2818119;BA.debugLine="RefreshOverall";
__ref._refreshoverall(null);
RDebugUtils.currentLine=2818120;
 //BA.debugLineNum = 2818120;BA.debugLine="End Sub";
return "";
}
public String  _addqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addqtty_click", false))
	 {return ((String) Debug.delegate(ba, "addqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub AddQtty_Click";
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
 //BA.debugLineNum = 2883588;BA.debugLine="g.Qtty = g.Qtty + 1";
_g.Qtty = (int) (_g.Qtty+1);
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="End Sub";
return "";
}
public String  _addsupplier(b4a.diplomna.shoppingcart __ref,b4a.diplomna.types._supplier _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "addsupplier", false))
	 {return ((String) Debug.delegate(ba, "addsupplier", new Object[] {_s}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub AddSupplier(s As Supplier)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="ItemsSuppliers.Put(s.ID,s)";
__ref._itemssuppliers.Put((Object)(_s.ID),(Object)(_s));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public String  _refreshoverall(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "refreshoverall", false))
	 {return ((String) Debug.delegate(ba, "refreshoverall", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub RefreshOverall";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Sumlbl.Text =  NumberFormat2(CalculateSum,1,2,2,F";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__c.NumberFormat2(__ref._calculatesum(null),(int) (1),(int) (2),(int) (2),__c.False)));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
public String  _buildcartui(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "buildcartui", false))
	 {return ((String) Debug.delegate(ba, "buildcartui", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub BuildCartUI";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
__ref._cartpan.setColor(_appcolors._fadedblack);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
__ref._pblbase.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="pnlHeader.Color = AppColors.FadedDarkRed";
__ref._pnlheader.setColor(_appcolors._fadeddarkred);
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pnlheader.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="CartPan.AddView(pblBase,0,45%y,90%x,5%y)";
__ref._cartpan.AddView((android.view.View)(__ref._pblbase.getObject()),(int) (0),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (90),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="ItemNamelbl.Text = \"Name\"";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
__ref._itemnamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
__ref._itemnamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="ItemPricelbl.Text = \"Price\"";
__ref._itempricelbl.setText(BA.ObjectToCharSequence("Price"));
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="ItemPricelbl.Gravity = Gravity.CENTER";
__ref._itempricelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="ItemPricelbl.TextColor = Colors.White";
__ref._itempricelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="ItemQttylbl.Text = \"Quantity\"";
__ref._itemqttylbl.setText(BA.ObjectToCharSequence("Quantity"));
RDebugUtils.currentLine=2228241;
 //BA.debugLineNum = 2228241;BA.debugLine="ItemQttylbl.Gravity = Gravity.CENTER";
__ref._itemqttylbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="ItemQttylbl.TextColor = Colors.White";
__ref._itemqttylbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2228244;
 //BA.debugLineNum = 2228244;BA.debugLine="FinalSumlbl.Text = \"Total\"";
__ref._finalsumlbl.setText(BA.ObjectToCharSequence("Total"));
RDebugUtils.currentLine=2228245;
 //BA.debugLineNum = 2228245;BA.debugLine="FinalSumlbl.Gravity = Gravity.CENTER";
__ref._finalsumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2228246;
 //BA.debugLineNum = 2228246;BA.debugLine="FinalSumlbl.TextColor = Colors.White";
__ref._finalsumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2228248;
 //BA.debugLineNum = 2228248;BA.debugLine="Sumlbl.Text = CalculateSum";
__ref._sumlbl.setText(BA.ObjectToCharSequence(__ref._calculatesum(null)));
RDebugUtils.currentLine=2228249;
 //BA.debugLineNum = 2228249;BA.debugLine="Sumlbl.Gravity = Gravity.CENTER";
__ref._sumlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2228250;
 //BA.debugLineNum = 2228250;BA.debugLine="Sumlbl.TextColor = Colors.White";
__ref._sumlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2228252;
 //BA.debugLineNum = 2228252;BA.debugLine="FinishOrderbtn.Text = \"Finish\"";
__ref._finishorderbtn.setText(BA.ObjectToCharSequence("Finish"));
RDebugUtils.currentLine=2228253;
 //BA.debugLineNum = 2228253;BA.debugLine="FinishOrderbtn.Gravity = Gravity.CENTER";
__ref._finishorderbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2228254;
 //BA.debugLineNum = 2228254;BA.debugLine="FinishOrderbtn.TextColor = AppColors.FadedBlack";
__ref._finishorderbtn.setTextColor(_appcolors._fadedblack);
RDebugUtils.currentLine=2228255;
 //BA.debugLineNum = 2228255;BA.debugLine="FinishOrderbtn.Color = AppColors.LightGray";
__ref._finishorderbtn.setColor(_appcolors._lightgray);
RDebugUtils.currentLine=2228258;
 //BA.debugLineNum = 2228258;BA.debugLine="pnlHeader.AddView(ItemNamelbl, 0, 0, 20%x, 5%y)";
__ref._pnlheader.AddView((android.view.View)(__ref._itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2228259;
 //BA.debugLineNum = 2228259;BA.debugLine="pnlHeader.AddView(ItemPricelbl,  ItemNamelbl.Left";
__ref._pnlheader.AddView((android.view.View)(__ref._itempricelbl.getObject()),(int) (__ref._itemnamelbl.getLeft()+__ref._itemnamelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2228260;
 //BA.debugLineNum = 2228260;BA.debugLine="pnlHeader.AddView(ItemQttylbl,   ItemPricelbl.Lef";
__ref._pnlheader.AddView((android.view.View)(__ref._itemqttylbl.getObject()),(int) (__ref._itempricelbl.getLeft()+__ref._itempricelbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2228262;
 //BA.debugLineNum = 2228262;BA.debugLine="pblBase.AddView(FinalSumlbl, 0, 0, 20%x, 5%y)";
__ref._pblbase.AddView((android.view.View)(__ref._finalsumlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2228263;
 //BA.debugLineNum = 2228263;BA.debugLine="pblBase.AddView(Sumlbl, FinalSumlbl.Left + FinalS";
__ref._pblbase.AddView((android.view.View)(__ref._sumlbl.getObject()),(int) (__ref._finalsumlbl.getLeft()+__ref._finalsumlbl.getWidth()),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2228264;
 //BA.debugLineNum = 2228264;BA.debugLine="pblBase.AddView(FinishOrderbtn, 70%x +2dip, 0+2di";
__ref._pblbase.AddView((android.view.View)(__ref._finishorderbtn.getObject()),(int) (__c.PerXToCurrent((float) (70),ba)+__c.DipToCurrent((int) (2))),(int) (0+__c.DipToCurrent((int) (2))),(int) (__c.PerXToCurrent((float) (20),ba)-__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=2228266;
 //BA.debugLineNum = 2228266;BA.debugLine="CartPan.AddView(ShopList,0%x, 5%y,100%x,40%y)";
__ref._cartpan.AddView((android.view.View)(__ref._shoplist.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (40),ba));
RDebugUtils.currentLine=2228267;
 //BA.debugLineNum = 2228267;BA.debugLine="End Sub";
return "";
}
public double  _calculatesum(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "calculatesum", false))
	 {return ((Double) Debug.delegate(ba, "calculatesum", null));}
double _sum = 0;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub CalculateSum As Double";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim sum As Double = 0";
_sum = 0;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._scanneditems.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (b4a.diplomna.types._good)(group2.Get(index2));
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="sum = sum + (g.Qtty*GetGoodPrice(g.ID))";
_sum = _sum+(_g.Qtty*__ref._getgoodprice(null,_g.ID));
 }
};
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Return sum";
if (true) return _sum;
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="End Sub";
return 0;
}
public double  _getgoodprice(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "getgoodprice", false))
	 {return ((Double) Debug.delegate(ba, "getgoodprice", new Object[] {_goodid}));}
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub GetGoodPrice(GoodID As Int) As Double";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim g As Good = ScannedItems.Get(GoodID)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Return g.Price";
if (true) return _g.Price;
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Public CartPan,pblBase,pnlHeader As Panel";
_cartpan = new anywheresoftware.b4a.objects.PanelWrapper();
_pblbase = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Private ItemNamelbl,ItemPricelbl,ItemQttylbl,Fina";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_finalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_sumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Public ShopList As ScrollView";
_shoplist = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Public ScannedItems As Map";
_scanneditems = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Public ItemsSuppliers As Map";
_itemssuppliers = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Public CurrentItem As Good";
_currentitem = new b4a.diplomna.types._good();
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Public CurrentSupplier As Supplier";
_currentsupplier = new b4a.diplomna.types._supplier();
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Public FinishOrderbtn As Button";
_finishorderbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="End Sub";
return "";
}
public String  _delqtty_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "delqtty_click", false))
	 {return ((String) Debug.delegate(ba, "delqtty_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub DelQtty_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
_g = (b4a.diplomna.types._good)(__ref._scanneditems.Get(_btn.getTag()));
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="g.Qtty = g.Qtty - 1";
_g.Qtty = (int) (_g.Qtty-1);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="If g.Qtty <= 0 Then";
if (_g.Qtty<=0) { 
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="ScannedItems.Remove(g.ID)";
__ref._scanneditems.Remove((Object)(_g.ID));
 }else {
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="ScannedItems.Put(g.ID,g)";
__ref._scanneditems.Put((Object)(_g.ID),(Object)(_g));
 };
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="End Sub";
return "";
}
public String  _finishorder_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "finishorder_click", false))
	 {return ((String) Debug.delegate(ba, "finishorder_click", null));}
b4a.diplomna.types._order _neworder = null;
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub FinishOrder_Click";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="If ScannedItems.Size > 0 Then";
if (__ref._scanneditems.getSize()>0) { 
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim neworder As Order";
_neworder = new b4a.diplomna.types._order();
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="neworder.Initialize()";
_neworder.Initialize();
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="For Each g As Good In ScannedItems.Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._scanneditems.Values();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_g = (b4a.diplomna.types._good)(group4.Get(index4));
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="neworder.OrderedGoods.Add(g)";
_neworder.OrderedGoods.Add((Object)(_g));
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="neworder.OrderTotalPrice = neworder.OrderTotalP";
_neworder.OrderTotalPrice = _neworder.OrderTotalPrice+_g.Price;
 }
};
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="neworder.CutomerID = Main.LoggedCustomer.ID";
_neworder.CutomerID = _main._loggedcustomer.ID;
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="neworder.OrderStatus = \"Waiting\"";
_neworder.OrderStatus = "Waiting";
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="neworder.OrderCode = \"#\" & GenerateRandomString(";
_neworder.OrderCode = "#"+__ref._generaterandomstring(null,(int) (10));
RDebugUtils.currentLine=12582923;
 //BA.debugLineNum = 12582923;BA.debugLine="Main.HTTP.SendOrder(neworder)";
_main._http._sendorder(null,_neworder);
 }else {
RDebugUtils.currentLine=12582925;
 //BA.debugLineNum = 12582925;BA.debugLine="ToastMessageShow(\"No items in cart\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No items in cart"),__c.False);
 };
RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="End Sub";
return "";
}
public String  _generaterandomstring(b4a.diplomna.shoppingcart __ref,int _strlength) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "generaterandomstring", false))
	 {return ((String) Debug.delegate(ba, "generaterandomstring", new Object[] {_strlength}));}
String _rndstring = "";
int _rndnumber = 0;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub GenerateRandomString(StrLength As Int) As Stri";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Dim RndString As String";
_rndstring = "";
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="Dim RndNumber As Int";
_rndnumber = 0;
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="Do While RndString.Length < StrLength";
while (_rndstring.length()<_strlength) {
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
_rndnumber = __c.Rnd((int) (48),(int) (123));
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
if ((_rndnumber>=48 && _rndnumber<=57) || (_rndnumber>=65 && _rndnumber<=90) || (_rndnumber>=97 && _rndnumber<=112)) { 
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="RndString = RndString & Chr(RndNumber)";
_rndstring = _rndstring+BA.ObjectToString(__c.Chr(_rndnumber));
 };
 }
;
RDebugUtils.currentLine=12648457;
 //BA.debugLineNum = 12648457;BA.debugLine="Return RndString";
if (true) return _rndstring;
RDebugUtils.currentLine=12648458;
 //BA.debugLineNum = 12648458;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket", false))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket", new Object[] {_goodid}));}
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub RemoveItemFromBasket(GoodID As Int)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(GoodID)";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_goodid)));
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="ItemsSuppliers.Remove(s.ID)";
__ref._itemssuppliers.Remove((Object)(_s.ID));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="ScannedItems.Remove(GoodID)";
__ref._scanneditems.Remove((Object)(_goodid));
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="End Sub";
return "";
}
public String  _removeitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "removeitemfrombasket_click", false))
	 {return ((String) Debug.delegate(ba, "removeitemfrombasket_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub RemoveItemFromBasket_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="btn = Sender";
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="RemoveItemFromBasket(btn.Tag)";
__ref._removeitemfrombasket(null,(int)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="End Sub";
return "";
}
public String  _selectitemfrombasket_click(b4a.diplomna.shoppingcart __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "selectitemfrombasket_click", false))
	 {return ((String) Debug.delegate(ba, "selectitemfrombasket_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub SelectItemFromBasket_Click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="ViewSelectedItemInfo(pnl.Tag)";
__ref._viewselectediteminfo(null,(int)(BA.ObjectToNumber(_pnl.getTag())));
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Log(\"Clicked \" & pnl.Tag)";
__c.LogImpl("43145732","Clicked "+BA.ObjectToString(_pnl.getTag()),0);
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="End Sub";
return "";
}
public String  _viewselectediteminfo(b4a.diplomna.shoppingcart __ref,int _goodid) throws Exception{
__ref = this;
RDebugUtils.currentModule="shoppingcart";
if (Debug.shouldDelegate(ba, "viewselectediteminfo", false))
	 {return ((String) Debug.delegate(ba, "viewselectediteminfo", new Object[] {_goodid}));}
b4a.diplomna.types._good _item = null;
b4a.diplomna.types._supplier _s = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub ViewSelectedItemInfo(GoodID As Int)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim item As Good = ScannedItems.Get(GoodID)";
_item = (b4a.diplomna.types._good)(__ref._scanneditems.Get((Object)(_goodid)));
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(item.Suppl";
_s = (b4a.diplomna.types._supplier)(__ref._itemssuppliers.Get((Object)(_item.SupplierID)));
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="CallSub3(Main,\"ShowItemInfo\",item,s)";
__c.CallSubDebug3(ba,(Object)(_main.getObject()),"ShowItemInfo",(Object)(_item),(Object)(_s));
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub TestWithFakes(num As Int)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="For i = 0 To num";
{
final int step1 = 1;
final int limit1 = _num;
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim g As Good";
_g = new b4a.diplomna.types._good();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Dim s As Supplier";
_s = new b4a.diplomna.types._supplier();
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="g.ID = i";
_g.ID = _i;
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="g.SupplierID = i";
_g.SupplierID = _i;
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="g.Qtty = 1";
_g.Qtty = (int) (1);
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="g.Name = \"Name\"&i";
_g.Name = "Name"+BA.NumberToString(_i);
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="g.PLU = 100+i";
_g.PLU = (int) (100+_i);
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="g.Price = 5.99 + i";
_g.Price = 5.99+_i;
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="g.Description = \"nothing\"";
_g.Description = "nothing";
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="g.Is_Discontinued = 0";
_g.Is_Discontinued = (int) (0);
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="s.ID = i";
_s.ID = _i;
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="s.SupplierName = \"Micro\"&i";
_s.SupplierName = "Micro"+BA.NumberToString(_i);
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="s.SupploerPhone = \"088896451\"&i";
_s.SupploerPhone = "088896451"+BA.NumberToString(_i);
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="AddItemToBasket(g)";
__ref._additemtobasket(null,_g);
RDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="AddSupplier(s)";
__ref._addsupplier(null,_s);
 }
};
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="BuildCart";
__ref._buildcart(null);
RDebugUtils.currentLine=3080215;
 //BA.debugLineNum = 3080215;BA.debugLine="End Sub";
return "";
}
}