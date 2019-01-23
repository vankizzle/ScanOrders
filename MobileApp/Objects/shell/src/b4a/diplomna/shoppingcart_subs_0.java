package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class shoppingcart_subs_0 {


public static RemoteObject  _addgooddetail(RemoteObject __ref,RemoteObject _gd) throws Exception{
try {
		Debug.PushSubsStack("AddGoodDetail (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("addgooddetail")) { return __ref.runUserSub(false, "shoppingcart","addgooddetail", __ref, _gd);}
Debug.locals.put("gd", _gd);
 BA.debugLineNum = 103;BA.debugLine="Public Sub AddGoodDetail(gd As GoodDetail)";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="ItemsDetails.Put(gd.ID , gd)";
Debug.ShouldStop(128);
__ref.getField(false,"_itemsdetails").runVoidMethod ("Put",(Object)((_gd.getField(true,"ID"))),(Object)((_gd)));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _additemtobasket(RemoteObject __ref,RemoteObject _g) throws Exception{
try {
		Debug.PushSubsStack("AddItemToBasket (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("additemtobasket")) { return __ref.runUserSub(false, "shoppingcart","additemtobasket", __ref, _g);}
RemoteObject _item = RemoteObject.declareNull("b4a.diplomna.types._good");
Debug.locals.put("g", _g);
 BA.debugLineNum = 93;BA.debugLine="Public Sub AddItemToBasket(g As Good)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="If ScannedItems.ContainsKey(g.ID) Then";
Debug.ShouldStop(536870912);
if (__ref.getField(false,"_scanneditems").runMethod(true,"ContainsKey",(Object)((_g.getField(true,"ID")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 95;BA.debugLine="Dim Item As Good = ScannedItems.Get(g.ID)";
Debug.ShouldStop(1073741824);
_item = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)((_g.getField(true,"ID")))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 96;BA.debugLine="Item.Qtty = Item.Qtty + 1";
Debug.ShouldStop(-2147483648);
_item.setField ("Qtty",RemoteObject.solve(new RemoteObject[] {_item.getField(true,"Qtty"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 97;BA.debugLine="ScannedItems.Put(Item.ID,Item)";
Debug.ShouldStop(1);
__ref.getField(false,"_scanneditems").runVoidMethod ("Put",(Object)((_item.getField(true,"ID"))),(Object)((_item)));
 }else {
 BA.debugLineNum = 99;BA.debugLine="ScannedItems.Put(g.ID,g)";
Debug.ShouldStop(4);
__ref.getField(false,"_scanneditems").runVoidMethod ("Put",(Object)((_g.getField(true,"ID"))),(Object)((_g)));
 };
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addqtty_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddQtty_Click (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("addqtty_click")) { return __ref.runUserSub(false, "shoppingcart","addqtty_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
 BA.debugLineNum = 208;BA.debugLine="Public Sub AddQtty_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 209;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(65536);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 210;BA.debugLine="btn = Sender";
Debug.ShouldStop(131072);
_btn.setObject(shoppingcart.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 211;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
Debug.ShouldStop(262144);
_g = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)(_btn.runMethod(false,"getTag"))));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 212;BA.debugLine="g.Qtty = g.Qtty + 1";
Debug.ShouldStop(524288);
_g.setField ("Qtty",RemoteObject.solve(new RemoteObject[] {_g.getField(true,"Qtty"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 213;BA.debugLine="ScannedItems.Put(g.ID,g)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_scanneditems").runVoidMethod ("Put",(Object)((_g.getField(true,"ID"))),(Object)((_g)));
 BA.debugLineNum = 214;BA.debugLine="BuildCart";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcart");
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addsupplier(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("AddSupplier (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("addsupplier")) { return __ref.runUserSub(false, "shoppingcart","addsupplier", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 107;BA.debugLine="Public Sub AddSupplier(s As Supplier)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="ItemsSuppliers.Put(s.ID,s)";
Debug.ShouldStop(2048);
__ref.getField(false,"_itemssuppliers").runVoidMethod ("Put",(Object)((_s.getField(true,"ID"))),(Object)((_s)));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("AsView (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "shoppingcart","asview", __ref);}
 BA.debugLineNum = 89;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Return CartPan";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_cartpan").getObject());
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("BuildCart (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("buildcart")) { return __ref.runUserSub(false, "shoppingcart","buildcart", __ref);}
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
RemoteObject _itemdetail = RemoteObject.declareNull("b4a.diplomna.types._gooddetail");
RemoteObject _holder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _itemname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _itemprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _itemqtty = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _delitemx = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _additem = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _delitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 134;BA.debugLine="Public Sub BuildCart";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="ShopList.Panel.RemoveAllViews";
Debug.ShouldStop(64);
__ref.getField(false,"_shoplist").runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 136;BA.debugLine="Dim row As Int = 0";
Debug.ShouldStop(128);
_row = BA.numberCast(int.class, 0);Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 137;BA.debugLine="For Each g As Good In ScannedItems.Values";
Debug.ShouldStop(256);
{
final RemoteObject group3 = __ref.getField(false,"_scanneditems").runMethod(false,"Values");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_g = (group3.runMethod(false,"Get",index3));Debug.locals.put("g", _g);
Debug.locals.put("g", _g);
 BA.debugLineNum = 138;BA.debugLine="Private itemdetail As GoodDetail = ItemsDetails.";
Debug.ShouldStop(512);
_itemdetail = (__ref.getField(false,"_itemsdetails").runMethod(false,"Get",(Object)((_g.getField(true,"ID")))));Debug.locals.put("itemdetail", _itemdetail);Debug.locals.put("itemdetail", _itemdetail);
 BA.debugLineNum = 139;BA.debugLine="Private holder As Panel";
Debug.ShouldStop(1024);
_holder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("holder", _holder);
 BA.debugLineNum = 140;BA.debugLine="Private itemName,itemPrice,itemQtty As Label";
Debug.ShouldStop(2048);
_itemname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("itemName", _itemname);
_itemprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("itemPrice", _itemprice);
_itemqtty = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("itemQtty", _itemqtty);
 BA.debugLineNum = 141;BA.debugLine="Private delitemX,additem,delitem As Button";
Debug.ShouldStop(4096);
_delitemx = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("delitemX", _delitemx);
_additem = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("additem", _additem);
_delitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("delitem", _delitem);
 BA.debugLineNum = 143;BA.debugLine="holder.Initialize(\"SelectItemFromBasket\")";
Debug.ShouldStop(16384);
_holder.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SelectItemFromBasket")));
 BA.debugLineNum = 144;BA.debugLine="itemQtty.Initialize(\"\")";
Debug.ShouldStop(32768);
_itemqtty.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 145;BA.debugLine="itemName.Initialize(\"\")";
Debug.ShouldStop(65536);
_itemname.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 146;BA.debugLine="itemPrice.Initialize(\"\")";
Debug.ShouldStop(131072);
_itemprice.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 147;BA.debugLine="delitemX.Initialize(\"RemoveItemFromBasket\")";
Debug.ShouldStop(262144);
_delitemx.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("RemoveItemFromBasket")));
 BA.debugLineNum = 148;BA.debugLine="additem.Initialize(\"AddQtty\")";
Debug.ShouldStop(524288);
_additem.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AddQtty")));
 BA.debugLineNum = 149;BA.debugLine="delitem.Initialize(\"DelQtty\")";
Debug.ShouldStop(1048576);
_delitem.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DelQtty")));
 BA.debugLineNum = 151;BA.debugLine="holder.Color = Colors.White";
Debug.ShouldStop(4194304);
_holder.runVoidMethod ("setColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 152;BA.debugLine="holder.Tag = g.ID";
Debug.ShouldStop(8388608);
_holder.runMethod(false,"setTag",(_g.getField(true,"ID")));
 BA.debugLineNum = 154;BA.debugLine="itemName.Text = itemdetail.Name";
Debug.ShouldStop(33554432);
_itemname.runMethod(true,"setText",BA.ObjectToCharSequence(_itemdetail.getField(true,"Name")));
 BA.debugLineNum = 155;BA.debugLine="itemName.Gravity = Gravity.CENTER";
Debug.ShouldStop(67108864);
_itemname.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 156;BA.debugLine="itemName.TextColor =  Colors.DarkGray";
Debug.ShouldStop(134217728);
_itemname.runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 159;BA.debugLine="itemPrice.Text = itemdetail.Price";
Debug.ShouldStop(1073741824);
_itemprice.runMethod(true,"setText",BA.ObjectToCharSequence(_itemdetail.getField(true,"Price")));
 BA.debugLineNum = 160;BA.debugLine="itemPrice.Gravity = Gravity.CENTER";
Debug.ShouldStop(-2147483648);
_itemprice.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 161;BA.debugLine="itemPrice.TextColor =  Colors.DarkGray";
Debug.ShouldStop(1);
_itemprice.runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 164;BA.debugLine="itemQtty.Text = g.Qtty";
Debug.ShouldStop(8);
_itemqtty.runMethod(true,"setText",BA.ObjectToCharSequence(_g.getField(true,"Qtty")));
 BA.debugLineNum = 165;BA.debugLine="itemQtty.Gravity = Gravity.CENTER";
Debug.ShouldStop(16);
_itemqtty.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 166;BA.debugLine="itemQtty.TextColor =  Colors.DarkGray";
Debug.ShouldStop(32);
_itemqtty.runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 169;BA.debugLine="holder.AddView(itemName, 0, 0, 20%x, 5%y)";
Debug.ShouldStop(256);
_holder.runVoidMethod ("AddView",(Object)((_itemname.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 170;BA.debugLine="holder.AddView(itemPrice, itemName.Left + itemNa";
Debug.ShouldStop(512);
_holder.runVoidMethod ("AddView",(Object)((_itemprice.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_itemname.runMethod(true,"getLeft"),_itemname.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 171;BA.debugLine="holder.AddView(itemQtty, itemPrice.Left + itemPr";
Debug.ShouldStop(1024);
_holder.runVoidMethod ("AddView",(Object)((_itemqtty.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_itemprice.runMethod(true,"getLeft"),_itemprice.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 172;BA.debugLine="holder.AddView(additem, itemQtty.Left + itemQtty";
Debug.ShouldStop(2048);
_holder.runVoidMethod ("AddView",(Object)((_additem.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_itemqtty.runMethod(true,"getLeft"),_itemqtty.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 173;BA.debugLine="holder.AddView(delitem, additem.Left + additem.W";
Debug.ShouldStop(4096);
_holder.runVoidMethod ("AddView",(Object)((_delitem.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_additem.runMethod(true,"getLeft"),_additem.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 174;BA.debugLine="holder.AddView(delitemX, delitem.Left + delitem.";
Debug.ShouldStop(8192);
_holder.runVoidMethod ("AddView",(Object)((_delitemx.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_delitem.runMethod(true,"getLeft"),_delitem.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 176;BA.debugLine="delitemX.Text = \"x\"";
Debug.ShouldStop(32768);
_delitemx.runMethod(true,"setText",BA.ObjectToCharSequence("x"));
 BA.debugLineNum = 177;BA.debugLine="delitemX.TextSize = 8";
Debug.ShouldStop(65536);
_delitemx.runMethod(true,"setTextSize",BA.numberCast(float.class, 8));
 BA.debugLineNum = 178;BA.debugLine="delitemX.Gravity = Gravity.CENTER";
Debug.ShouldStop(131072);
_delitemx.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 179;BA.debugLine="delitemX.TextColor =  Colors.Black";
Debug.ShouldStop(262144);
_delitemx.runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 180;BA.debugLine="delitemX.Color = Colors.rgb(255, 102, 0)";
Debug.ShouldStop(524288);
_delitemx.runVoidMethod ("setColor",shoppingcart.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 102)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 181;BA.debugLine="delitemX.Tag = g.ID";
Debug.ShouldStop(1048576);
_delitemx.runMethod(false,"setTag",(_g.getField(true,"ID")));
 BA.debugLineNum = 183;BA.debugLine="additem.Text = \"+\"";
Debug.ShouldStop(4194304);
_additem.runMethod(true,"setText",BA.ObjectToCharSequence("+"));
 BA.debugLineNum = 184;BA.debugLine="additem.TextSize = 8";
Debug.ShouldStop(8388608);
_additem.runMethod(true,"setTextSize",BA.numberCast(float.class, 8));
 BA.debugLineNum = 185;BA.debugLine="additem.Textcolor = Colors.Black";
Debug.ShouldStop(16777216);
_additem.runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 186;BA.debugLine="additem.Color = Colors.Transparent";
Debug.ShouldStop(33554432);
_additem.runVoidMethod ("setColor",shoppingcart.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 187;BA.debugLine="additem.Gravity = Gravity.CENTER";
Debug.ShouldStop(67108864);
_additem.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 188;BA.debugLine="additem.Tag = g.ID";
Debug.ShouldStop(134217728);
_additem.runMethod(false,"setTag",(_g.getField(true,"ID")));
 BA.debugLineNum = 190;BA.debugLine="delitem.Text = \"-\"";
Debug.ShouldStop(536870912);
_delitem.runMethod(true,"setText",BA.ObjectToCharSequence("-"));
 BA.debugLineNum = 191;BA.debugLine="delitem.Textsize = 8";
Debug.ShouldStop(1073741824);
_delitem.runMethod(true,"setTextSize",BA.numberCast(float.class, 8));
 BA.debugLineNum = 192;BA.debugLine="delitem.TextColor = Colors.Black";
Debug.ShouldStop(-2147483648);
_delitem.runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 193;BA.debugLine="delitem.Color = Colors.Transparent";
Debug.ShouldStop(1);
_delitem.runVoidMethod ("setColor",shoppingcart.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 194;BA.debugLine="delitem.Gravity = Gravity.CENTER";
Debug.ShouldStop(2);
_delitem.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 195;BA.debugLine="delitem.Tag = g.ID";
Debug.ShouldStop(4);
_delitem.runMethod(false,"setTag",(_g.getField(true,"ID")));
 BA.debugLineNum = 197;BA.debugLine="ShopList.Panel.AddView(holder,0,0+(5%y + 1dip)*r";
Debug.ShouldStop(16);
__ref.getField(false,"_shoplist").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_holder.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),(RemoteObject.solve(new RemoteObject[] {shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),_row}, "+*",1, 1)),(Object)(__ref.getField(false,"_shoplist").runMethod(false,"getPanel").runMethod(true,"getWidth")),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 199;BA.debugLine="If row < ScannedItems.Size - 1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_scanneditems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 200;BA.debugLine="ShopList.Panel.Height = 10%y + ((5%y + 1dip)*ro";
Debug.ShouldStop(128);
__ref.getField(false,"_shoplist").runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba")),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),_row}, "*",0, 1))}, "+",1, 1));
 BA.debugLineNum = 201;BA.debugLine="row = row + 1";
Debug.ShouldStop(256);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 };
 }
}Debug.locals.put("g", _g);
;
 BA.debugLineNum = 205;BA.debugLine="RefreshOverall";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_refreshoverall");
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildcartui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildCartUI (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("buildcartui")) { return __ref.runUserSub(false, "shoppingcart","buildcartui", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub BuildCartUI";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="CartPan.Color = Colors.LightGray";
Debug.ShouldStop(4);
__ref.getField(false,"_cartpan").runVoidMethod ("setColor",shoppingcart.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 36;BA.debugLine="pblBase.Color = Colors.RGB(182,0,0)";
Debug.ShouldStop(8);
__ref.getField(false,"_pblbase").runVoidMethod ("setColor",shoppingcart.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 182)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 37;BA.debugLine="pnlHeader.Color = Colors.RGB(182,0,0)";
Debug.ShouldStop(16);
__ref.getField(false,"_pnlheader").runVoidMethod ("setColor",shoppingcart.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 182)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 39;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,5%y)";
Debug.ShouldStop(64);
__ref.getField(false,"_cartpan").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlheader").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 40;BA.debugLine="CartPan.AddView(pblBase,0,45%y,90%x,5%y)";
Debug.ShouldStop(128);
__ref.getField(false,"_cartpan").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pblbase").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 45)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 42;BA.debugLine="ItemNamelbl.Text = \"Name\"";
Debug.ShouldStop(512);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setText",BA.ObjectToCharSequence("Name"));
 BA.debugLineNum = 43;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(1024);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 44;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
Debug.ShouldStop(2048);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 46;BA.debugLine="ItemPricelbl.Text = \"Price\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_itempricelbl").runMethod(true,"setText",BA.ObjectToCharSequence("Price"));
 BA.debugLineNum = 47;BA.debugLine="ItemPricelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(16384);
__ref.getField(false,"_itempricelbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 48;BA.debugLine="ItemPricelbl.TextColor = Colors.White";
Debug.ShouldStop(32768);
__ref.getField(false,"_itempricelbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="ItemQttylbl.Text = \"Quantity\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_itemqttylbl").runMethod(true,"setText",BA.ObjectToCharSequence("Quantity"));
 BA.debugLineNum = 51;BA.debugLine="ItemQttylbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(262144);
__ref.getField(false,"_itemqttylbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 52;BA.debugLine="ItemQttylbl.TextColor = Colors.White";
Debug.ShouldStop(524288);
__ref.getField(false,"_itemqttylbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 54;BA.debugLine="FinalSumlbl.Text = \"Quantity\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_finalsumlbl").runMethod(true,"setText",BA.ObjectToCharSequence("Quantity"));
 BA.debugLineNum = 55;BA.debugLine="FinalSumlbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(4194304);
__ref.getField(false,"_finalsumlbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 56;BA.debugLine="FinalSumlbl.TextColor = Colors.White";
Debug.ShouldStop(8388608);
__ref.getField(false,"_finalsumlbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 58;BA.debugLine="Sumlbl.Text = CalculateSum";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sumlbl").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_calculatesum")));
 BA.debugLineNum = 59;BA.debugLine="Sumlbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sumlbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 60;BA.debugLine="Sumlbl.TextColor = Colors.White";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sumlbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 62;BA.debugLine="pnlHeader.AddView(ItemNamelbl, 0, 0, 20%x, 5%y)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itemnamelbl").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 63;BA.debugLine="pnlHeader.AddView(ItemPricelbl,  ItemNamelbl.Left";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itempricelbl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemnamelbl").runMethod(true,"getLeft"),__ref.getField(false,"_itemnamelbl").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 64;BA.debugLine="pnlHeader.AddView(ItemQttylbl,   ItemPricelbl.Lef";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itemqttylbl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itempricelbl").runMethod(true,"getLeft"),__ref.getField(false,"_itempricelbl").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 66;BA.debugLine="pblBase.AddView(FinalSumlbl, 0, 0, 20%x, 5%y)";
Debug.ShouldStop(2);
__ref.getField(false,"_pblbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_finalsumlbl").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 67;BA.debugLine="pblBase.AddView(Sumlbl, FinalSumlbl.Left + FinalS";
Debug.ShouldStop(4);
__ref.getField(false,"_pblbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sumlbl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_finalsumlbl").runMethod(true,"getLeft"),__ref.getField(false,"_finalsumlbl").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 69;BA.debugLine="CartPan.AddView(ShopList,0%x, 5%y,100%x,40%y)";
Debug.ShouldStop(16);
__ref.getField(false,"_cartpan").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_shoplist").getObject())),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calculatesum(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CalculateSum (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("calculatesum")) { return __ref.runUserSub(false, "shoppingcart","calculatesum", __ref);}
RemoteObject _sum = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
 BA.debugLineNum = 72;BA.debugLine="Public Sub CalculateSum As Double";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Dim sum As Double = 0";
Debug.ShouldStop(256);
_sum = BA.numberCast(double.class, 0);Debug.locals.put("sum", _sum);Debug.locals.put("sum", _sum);
 BA.debugLineNum = 74;BA.debugLine="For Each g As Good In ScannedItems.Values";
Debug.ShouldStop(512);
{
final RemoteObject group2 = __ref.getField(false,"_scanneditems").runMethod(false,"Values");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (group2.runMethod(false,"Get",index2));Debug.locals.put("g", _g);
Debug.locals.put("g", _g);
 BA.debugLineNum = 75;BA.debugLine="sum = sum + (g.Qtty*GetGoodPrice(g.ID))";
Debug.ShouldStop(1024);
_sum = RemoteObject.solve(new RemoteObject[] {_sum,(RemoteObject.solve(new RemoteObject[] {_g.getField(true,"Qtty"),__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_getgoodprice",(Object)(_g.getField(true,"ID")))}, "*",0, 0))}, "+",1, 0);Debug.locals.put("sum", _sum);
 }
}Debug.locals.put("g", _g);
;
 BA.debugLineNum = 77;BA.debugLine="Return sum";
Debug.ShouldStop(4096);
if (true) return _sum;
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
shoppingcart._cartpan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_cartpan",shoppingcart._cartpan);
shoppingcart._pblbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pblbase",shoppingcart._pblbase);
shoppingcart._pnlheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlheader",shoppingcart._pnlheader);
 //BA.debugLineNum = 3;BA.debugLine="Private ItemNamelbl,ItemPricelbl,ItemQttylbl,Fina";
shoppingcart._itemnamelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemnamelbl",shoppingcart._itemnamelbl);
shoppingcart._itempricelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itempricelbl",shoppingcart._itempricelbl);
shoppingcart._itemqttylbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemqttylbl",shoppingcart._itemqttylbl);
shoppingcart._finalsumlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_finalsumlbl",shoppingcart._finalsumlbl);
shoppingcart._sumlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_sumlbl",shoppingcart._sumlbl);
 //BA.debugLineNum = 4;BA.debugLine="Public ShopList As ScrollView";
shoppingcart._shoplist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_shoplist",shoppingcart._shoplist);
 //BA.debugLineNum = 6;BA.debugLine="Public ScannedItems As Map";
shoppingcart._scanneditems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_scanneditems",shoppingcart._scanneditems);
 //BA.debugLineNum = 7;BA.debugLine="Public ItemsDetails As Map";
shoppingcart._itemsdetails = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_itemsdetails",shoppingcart._itemsdetails);
 //BA.debugLineNum = 8;BA.debugLine="Public ItemsSuppliers As Map";
shoppingcart._itemssuppliers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_itemssuppliers",shoppingcart._itemssuppliers);
 //BA.debugLineNum = 9;BA.debugLine="Public CurrentItem As Good";
shoppingcart._currentitem = RemoteObject.createNew ("b4a.diplomna.types._good");__ref.setField("_currentitem",shoppingcart._currentitem);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _delqtty_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DelQtty_Click (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("delqtty_click")) { return __ref.runUserSub(false, "shoppingcart","delqtty_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
 BA.debugLineNum = 217;BA.debugLine="Public Sub DelQtty_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(33554432);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 219;BA.debugLine="btn = Sender";
Debug.ShouldStop(67108864);
_btn.setObject(shoppingcart.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 220;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
Debug.ShouldStop(134217728);
_g = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)(_btn.runMethod(false,"getTag"))));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 221;BA.debugLine="g.Qtty = g.Qtty - 1";
Debug.ShouldStop(268435456);
_g.setField ("Qtty",RemoteObject.solve(new RemoteObject[] {_g.getField(true,"Qtty"),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 222;BA.debugLine="If g.Qtty <= 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("k",_g.getField(true,"Qtty"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 223;BA.debugLine="ScannedItems.Remove(g.ID)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_scanneditems").runVoidMethod ("Remove",(Object)((_g.getField(true,"ID"))));
 }else {
 BA.debugLineNum = 225;BA.debugLine="ScannedItems.Put(g.ID,g)";
Debug.ShouldStop(1);
__ref.getField(false,"_scanneditems").runVoidMethod ("Put",(Object)((_g.getField(true,"ID"))),(Object)((_g)));
 };
 BA.debugLineNum = 227;BA.debugLine="BuildCart";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcart");
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deserializeiteminfo(RemoteObject __ref,RemoteObject _info) throws Exception{
try {
		Debug.PushSubsStack("DeserializeItemInfo (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("deserializeiteminfo")) { return __ref.runUserSub(false, "shoppingcart","deserializeiteminfo", __ref, _info);}
Debug.locals.put("Info", _info);
 BA.debugLineNum = 130;BA.debugLine="Public Sub DeserializeItemInfo(Info As String) As";
Debug.ShouldStop(2);
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgoodprice(RemoteObject __ref,RemoteObject _goodid) throws Exception{
try {
		Debug.PushSubsStack("GetGoodPrice (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("getgoodprice")) { return __ref.runUserSub(false, "shoppingcart","getgoodprice", __ref, _goodid);}
RemoteObject _gd = RemoteObject.declareNull("b4a.diplomna.types._gooddetail");
Debug.locals.put("GoodID", _goodid);
 BA.debugLineNum = 80;BA.debugLine="Public Sub GetGoodPrice(GoodID As Int) As Double";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Dim gd As GoodDetail = ItemsDetails.Get(GoodID)";
Debug.ShouldStop(65536);
_gd = (__ref.getField(false,"_itemsdetails").runMethod(false,"Get",(Object)((_goodid))));Debug.locals.put("gd", _gd);Debug.locals.put("gd", _gd);
 BA.debugLineNum = 82;BA.debugLine="Return gd.Price";
Debug.ShouldStop(131072);
if (true) return _gd.getField(true,"Price");
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getiteminformation(RemoteObject __ref,RemoteObject _goodid) throws Exception{
try {
		Debug.PushSubsStack("GetItemInformation (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("getiteminformation")) { __ref.runUserSub(false, "shoppingcart","getiteminformation", __ref, _goodid); return;}
ResumableSub_GetItemInformation rsub = new ResumableSub_GetItemInformation(null,__ref,_goodid);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetItemInformation extends BA.ResumableSub {
public ResumableSub_GetItemInformation(b4a.diplomna.shoppingcart parent,RemoteObject __ref,RemoteObject _goodid) {
this.parent = parent;
this.__ref = __ref;
this._goodid = _goodid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.shoppingcart parent;
RemoteObject _goodid;
RemoteObject _test = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetItemInformation (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("GoodID", _goodid);
 BA.debugLineNum = 112;BA.debugLine="Dim test As ResumableSub = Main.HTTP.GetGoodByID(";
Debug.ShouldStop(32768);
_test = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_test = parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_getgoodbyid",(Object)(_goodid));Debug.locals.put("test", _test);Debug.locals.put("test", _test);
 BA.debugLineNum = 113;BA.debugLine="Wait For (test)  Complete (Result As Object)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), _test);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 114;BA.debugLine="If Result = False Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 115;BA.debugLine="Log(\"FAILED\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("FAILED")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 118;BA.debugLine="CurrentItem = DeserializeItemInfo(Main.HTTP.Outp";
Debug.ShouldStop(2097152);
__ref.setField ("_currentitem",__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_deserializeiteminfo",(Object)(parent._main._http.getField(true,"_output"))));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;

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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "shoppingcart","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="ScannedItems.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_scanneditems").runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="CurrentItem.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_currentitem").runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="ItemsDetails.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_itemsdetails").runVoidMethod ("Initialize");
 BA.debugLineNum = 19;BA.debugLine="ItemsSuppliers.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_itemssuppliers").runVoidMethod ("Initialize");
 BA.debugLineNum = 21;BA.debugLine="CartPan.Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cartpan").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 22;BA.debugLine="pblBase.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pblbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 23;BA.debugLine="pnlHeader.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlheader").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="ItemNamelbl.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_itemnamelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="ItemPricelbl.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_itempricelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 26;BA.debugLine="ItemQttylbl.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_itemqttylbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 27;BA.debugLine="FinalSumlbl.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_finalsumlbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="Sumlbl.Initialize(\"\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sumlbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 29;BA.debugLine="ShopList.Initialize(10%y)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_shoplist").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 31;BA.debugLine="BuildCartUI";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcartui");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshoverall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshOverall (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("refreshoverall")) { return __ref.runUserSub(false, "shoppingcart","refreshoverall", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Public Sub RefreshOverall";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Sumlbl.Text =  NumberFormat2(CalculateSum,1,2,2,F";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sumlbl").runMethod(true,"setText",BA.ObjectToCharSequence(shoppingcart.__c.runMethod(true,"NumberFormat2",(Object)(__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_calculatesum")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(shoppingcart.__c.getField(true,"False")))));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeitemfrombasket(RemoteObject __ref,RemoteObject _goodid) throws Exception{
try {
		Debug.PushSubsStack("RemoveItemFromBasket (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("removeitemfrombasket")) { return __ref.runUserSub(false, "shoppingcart","removeitemfrombasket", __ref, _goodid);}
RemoteObject _good = RemoteObject.declareNull("b4a.diplomna.types._good");
RemoteObject _s = RemoteObject.declareNull("b4a.diplomna.types._supplier");
Debug.locals.put("GoodID", _goodid);
 BA.debugLineNum = 122;BA.debugLine="Public Sub RemoveItemFromBasket(GoodID As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Dim good As Good = ScannedItems.Get(GoodID)";
Debug.ShouldStop(67108864);
_good = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)((_goodid))));Debug.locals.put("good", _good);Debug.locals.put("good", _good);
 BA.debugLineNum = 124;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(GoodID)";
Debug.ShouldStop(134217728);
_s = (__ref.getField(false,"_itemssuppliers").runMethod(false,"Get",(Object)((_goodid))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 125;BA.debugLine="ItemsDetails.Remove(good.DetailID)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_itemsdetails").runVoidMethod ("Remove",(Object)((_good.getField(true,"DetailID"))));
 BA.debugLineNum = 126;BA.debugLine="ItemsSuppliers.Remove(s.ID)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_itemssuppliers").runVoidMethod ("Remove",(Object)((_s.getField(true,"ID"))));
 BA.debugLineNum = 127;BA.debugLine="ScannedItems.Remove(GoodID)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_scanneditems").runVoidMethod ("Remove",(Object)((_goodid)));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeitemfrombasket_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveItemFromBasket_Click (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("removeitemfrombasket_click")) { return __ref.runUserSub(false, "shoppingcart","removeitemfrombasket_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 231;BA.debugLine="Public Sub RemoveItemFromBasket_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(128);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 233;BA.debugLine="btn = Sender";
Debug.ShouldStop(256);
_btn.setObject(shoppingcart.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 234;BA.debugLine="RemoveItemFromBasket(btn.Tag)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_removeitemfrombasket",(Object)(BA.numberCast(int.class, _btn.runMethod(false,"getTag"))));
 BA.debugLineNum = 235;BA.debugLine="BuildCart";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcart");
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectitemfrombasket_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SelectItemFromBasket_Click (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("selectitemfrombasket_click")) { return __ref.runUserSub(false, "shoppingcart","selectitemfrombasket_click", __ref);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 266;BA.debugLine="Public Sub SelectItemFromBasket_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 267;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(1024);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 268;BA.debugLine="pnl = Sender";
Debug.ShouldStop(2048);
_pnl.setObject(shoppingcart.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 269;BA.debugLine="ViewSelectedItemInfo(pnl.Tag)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_viewselectediteminfo",(Object)(BA.numberCast(int.class, _pnl.runMethod(false,"getTag"))));
 BA.debugLineNum = 270;BA.debugLine="Log(\"Clicked \" & pnl.Tag)";
Debug.ShouldStop(8192);
shoppingcart.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Clicked "),_pnl.runMethod(false,"getTag"))));
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _testwithfakes(RemoteObject __ref,RemoteObject _num) throws Exception{
try {
		Debug.PushSubsStack("TestWithFakes (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("testwithfakes")) { return __ref.runUserSub(false, "shoppingcart","testwithfakes", __ref, _num);}
int _i = 0;
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
RemoteObject _gd = RemoteObject.declareNull("b4a.diplomna.types._gooddetail");
RemoteObject _s = RemoteObject.declareNull("b4a.diplomna.types._supplier");
Debug.locals.put("num", _num);
 BA.debugLineNum = 238;BA.debugLine="Public Sub TestWithFakes(num As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="For i = 0 To num";
Debug.ShouldStop(16384);
{
final int step1 = 1;
final int limit1 = _num.<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 240;BA.debugLine="Dim g As Good";
Debug.ShouldStop(32768);
_g = RemoteObject.createNew ("b4a.diplomna.types._good");Debug.locals.put("g", _g);
 BA.debugLineNum = 241;BA.debugLine="Dim gd As GoodDetail";
Debug.ShouldStop(65536);
_gd = RemoteObject.createNew ("b4a.diplomna.types._gooddetail");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 242;BA.debugLine="Dim s As Supplier";
Debug.ShouldStop(131072);
_s = RemoteObject.createNew ("b4a.diplomna.types._supplier");Debug.locals.put("s", _s);
 BA.debugLineNum = 244;BA.debugLine="g.ID = i";
Debug.ShouldStop(524288);
_g.setField ("ID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 245;BA.debugLine="g.DetailID = i";
Debug.ShouldStop(1048576);
_g.setField ("DetailID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 246;BA.debugLine="g.SupplierID = i";
Debug.ShouldStop(2097152);
_g.setField ("SupplierID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 247;BA.debugLine="g.Qtty = 1";
Debug.ShouldStop(4194304);
_g.setField ("Qtty",BA.numberCast(int.class, 1));
 BA.debugLineNum = 249;BA.debugLine="gd.ID = i";
Debug.ShouldStop(16777216);
_gd.setField ("ID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 250;BA.debugLine="gd.Name = \"Name\"&i";
Debug.ShouldStop(33554432);
_gd.setField ("Name",RemoteObject.concat(RemoteObject.createImmutable("Name"),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 251;BA.debugLine="gd.PLU = 100+i";
Debug.ShouldStop(67108864);
_gd.setField ("PLU",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),RemoteObject.createImmutable(_i)}, "+",1, 1));
 BA.debugLineNum = 252;BA.debugLine="gd.Price = 5.99 + i";
Debug.ShouldStop(134217728);
_gd.setField ("Price",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(5.99),RemoteObject.createImmutable(_i)}, "+",1, 0));
 BA.debugLineNum = 253;BA.debugLine="gd.Description = \"nothing\"";
Debug.ShouldStop(268435456);
_gd.setField ("Description",BA.ObjectToString("nothing"));
 BA.debugLineNum = 254;BA.debugLine="gd.Is_Discontinued = 0";
Debug.ShouldStop(536870912);
_gd.setField ("Is_Discontinued",BA.numberCast(int.class, 0));
 BA.debugLineNum = 256;BA.debugLine="s.ID = i";
Debug.ShouldStop(-2147483648);
_s.setField ("ID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 257;BA.debugLine="s.SupplierName = \"Micro\"&i";
Debug.ShouldStop(1);
_s.setField ("SupplierName",RemoteObject.concat(RemoteObject.createImmutable("Micro"),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 258;BA.debugLine="s.SupploerPhone = \"088896451\"&i";
Debug.ShouldStop(2);
_s.setField ("SupploerPhone",RemoteObject.concat(RemoteObject.createImmutable("088896451"),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 260;BA.debugLine="AddItemToBasket(g)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_additemtobasket",(Object)(_g));
 BA.debugLineNum = 261;BA.debugLine="AddGoodDetail(gd)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_addgooddetail",(Object)(_gd));
 BA.debugLineNum = 262;BA.debugLine="AddSupplier(s)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_addsupplier",(Object)(_s));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _viewselectediteminfo(RemoteObject __ref,RemoteObject _goodid) throws Exception{
try {
		Debug.PushSubsStack("ViewSelectedItemInfo (shoppingcart) ","shoppingcart",5,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("viewselectediteminfo")) { return __ref.runUserSub(false, "shoppingcart","viewselectediteminfo", __ref, _goodid);}
RemoteObject _item = RemoteObject.declareNull("b4a.diplomna.types._good");
RemoteObject _gd = RemoteObject.declareNull("b4a.diplomna.types._gooddetail");
RemoteObject _s = RemoteObject.declareNull("b4a.diplomna.types._supplier");
Debug.locals.put("GoodID", _goodid);
 BA.debugLineNum = 273;BA.debugLine="Public Sub ViewSelectedItemInfo(GoodID As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="Dim item As Good = ScannedItems.Get(GoodID)";
Debug.ShouldStop(131072);
_item = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)((_goodid))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 275;BA.debugLine="Dim gd As GoodDetail = ItemsDetails.Get(item.Deta";
Debug.ShouldStop(262144);
_gd = (__ref.getField(false,"_itemsdetails").runMethod(false,"Get",(Object)((_item.getField(true,"DetailID")))));Debug.locals.put("gd", _gd);Debug.locals.put("gd", _gd);
 BA.debugLineNum = 276;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(item.Suppl";
Debug.ShouldStop(524288);
_s = (__ref.getField(false,"_itemssuppliers").runMethod(false,"Get",(Object)((_item.getField(true,"SupplierID")))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 278;BA.debugLine="CallSub3(Main,\"ShowItemInfo\",gd,s)";
Debug.ShouldStop(2097152);
shoppingcart.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)((shoppingcart._main.getObject())),(Object)(BA.ObjectToString("ShowItemInfo")),(Object)((_gd)),(Object)((_s)));
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}