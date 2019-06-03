package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class shoppingcart_subs_0 {


public static RemoteObject  _additemtobasket(RemoteObject __ref,RemoteObject _g) throws Exception{
try {
		Debug.PushSubsStack("AddItemToBasket (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("additemtobasket")) { return __ref.runUserSub(false, "shoppingcart","additemtobasket", __ref, _g);}
RemoteObject _item = RemoteObject.declareNull("b4a.diplomna.types._good");
Debug.locals.put("g", _g);
 BA.debugLineNum = 104;BA.debugLine="Public Sub AddItemToBasket(g As Good)";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="If ScannedItems.ContainsKey(g.ID) Then";
Debug.ShouldStop(256);
if (__ref.getField(false,"_scanneditems").runMethod(true,"ContainsKey",(Object)((_g.getField(true,"ID")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="Dim Item As Good = ScannedItems.Get(g.ID)";
Debug.ShouldStop(512);
_item = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)((_g.getField(true,"ID")))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 107;BA.debugLine="Item.Qtty = Item.Qtty + 1";
Debug.ShouldStop(1024);
_item.setField ("Qtty",RemoteObject.solve(new RemoteObject[] {_item.getField(true,"Qtty"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 108;BA.debugLine="ScannedItems.Put(Item.ID,Item)";
Debug.ShouldStop(2048);
__ref.getField(false,"_scanneditems").runVoidMethod ("Put",(Object)((_item.getField(true,"ID"))),(Object)((_item)));
 }else {
 BA.debugLineNum = 110;BA.debugLine="ScannedItems.Put(g.ID,g)";
Debug.ShouldStop(8192);
__ref.getField(false,"_scanneditems").runVoidMethod ("Put",(Object)((_g.getField(true,"ID"))),(Object)((_g)));
 };
 BA.debugLineNum = 112;BA.debugLine="BuildCart";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcart");
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("AddQtty_Click (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("addqtty_click")) { return __ref.runUserSub(false, "shoppingcart","addqtty_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
 BA.debugLineNum = 226;BA.debugLine="Public Sub AddQtty_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(4);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 228;BA.debugLine="btn = Sender";
Debug.ShouldStop(8);
_btn.setObject(shoppingcart.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 229;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
Debug.ShouldStop(16);
_g = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)(_btn.runMethod(false,"getTag"))));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 230;BA.debugLine="g.Qtty = g.Qtty + 1";
Debug.ShouldStop(32);
_g.setField ("Qtty",RemoteObject.solve(new RemoteObject[] {_g.getField(true,"Qtty"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 231;BA.debugLine="ScannedItems.Put(g.ID,g)";
Debug.ShouldStop(64);
__ref.getField(false,"_scanneditems").runVoidMethod ("Put",(Object)((_g.getField(true,"ID"))),(Object)((_g)));
 BA.debugLineNum = 232;BA.debugLine="BuildCart";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcart");
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("AddSupplier (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("addsupplier")) { return __ref.runUserSub(false, "shoppingcart","addsupplier", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 119;BA.debugLine="Public Sub AddSupplier(s As Supplier)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="ItemsSuppliers.Put(s.ID,s)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_itemssuppliers").runVoidMethod ("Put",(Object)((_s.getField(true,"ID"))),(Object)((_s)));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("AsView (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "shoppingcart","asview", __ref);}
 BA.debugLineNum = 100;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Return CartPan";
Debug.ShouldStop(16);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_cartpan").getObject());
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("BuildCart (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("buildcart")) { return __ref.runUserSub(false, "shoppingcart","buildcart", __ref);}
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
RemoteObject _holder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _itemname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _itemprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _itemqtty = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _delitemx = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _additem = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _delitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 149;BA.debugLine="Public Sub BuildCart";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="ShopList.Panel.RemoveAllViews";
Debug.ShouldStop(2097152);
__ref.getField(false,"_shoplist").runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 151;BA.debugLine="Dim row As Int = 0";
Debug.ShouldStop(4194304);
_row = BA.numberCast(int.class, 0);Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 152;BA.debugLine="For Each g As Good In ScannedItems.Values";
Debug.ShouldStop(8388608);
{
final RemoteObject group3 = __ref.getField(false,"_scanneditems").runMethod(false,"Values");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_g = (group3.runMethod(false,"Get",index3));Debug.locals.put("g", _g);
Debug.locals.put("g", _g);
 BA.debugLineNum = 153;BA.debugLine="Private holder As Panel";
Debug.ShouldStop(16777216);
_holder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("holder", _holder);
 BA.debugLineNum = 154;BA.debugLine="Private itemName,itemPrice,itemQtty As Label";
Debug.ShouldStop(33554432);
_itemname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("itemName", _itemname);
_itemprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("itemPrice", _itemprice);
_itemqtty = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("itemQtty", _itemqtty);
 BA.debugLineNum = 155;BA.debugLine="Private delitemX,additem,delitem As Button";
Debug.ShouldStop(67108864);
_delitemx = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("delitemX", _delitemx);
_additem = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("additem", _additem);
_delitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("delitem", _delitem);
 BA.debugLineNum = 157;BA.debugLine="holder.Initialize(\"SelectItemFromBasket\")";
Debug.ShouldStop(268435456);
_holder.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SelectItemFromBasket")));
 BA.debugLineNum = 158;BA.debugLine="itemQtty.Initialize(\"\")";
Debug.ShouldStop(536870912);
_itemqtty.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 159;BA.debugLine="itemName.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_itemname.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 160;BA.debugLine="itemPrice.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_itemprice.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 161;BA.debugLine="delitemX.Initialize(\"RemoveItemFromBasket\")";
Debug.ShouldStop(1);
_delitemx.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("RemoveItemFromBasket")));
 BA.debugLineNum = 162;BA.debugLine="additem.Initialize(\"AddQtty\")";
Debug.ShouldStop(2);
_additem.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AddQtty")));
 BA.debugLineNum = 163;BA.debugLine="delitem.Initialize(\"DelQtty\")";
Debug.ShouldStop(4);
_delitem.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DelQtty")));
 BA.debugLineNum = 166;BA.debugLine="holder.Tag = g.ID";
Debug.ShouldStop(32);
_holder.runMethod(false,"setTag",(_g.getField(true,"ID")));
 BA.debugLineNum = 168;BA.debugLine="itemName.Text = g.Name";
Debug.ShouldStop(128);
_itemname.runMethod(true,"setText",BA.ObjectToCharSequence(_g.getField(true,"Name")));
 BA.debugLineNum = 169;BA.debugLine="itemName.Gravity = Gravity.CENTER";
Debug.ShouldStop(256);
_itemname.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 170;BA.debugLine="itemName.TextColor =  Colors.DarkGray";
Debug.ShouldStop(512);
_itemname.runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 173;BA.debugLine="itemPrice.Text = g.Price";
Debug.ShouldStop(4096);
_itemprice.runMethod(true,"setText",BA.ObjectToCharSequence(_g.getField(true,"Price")));
 BA.debugLineNum = 174;BA.debugLine="itemPrice.Gravity = Gravity.CENTER";
Debug.ShouldStop(8192);
_itemprice.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 175;BA.debugLine="itemPrice.TextColor =  Colors.DarkGray";
Debug.ShouldStop(16384);
_itemprice.runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 178;BA.debugLine="itemQtty.Text = g.Qtty";
Debug.ShouldStop(131072);
_itemqtty.runMethod(true,"setText",BA.ObjectToCharSequence(_g.getField(true,"Qtty")));
 BA.debugLineNum = 179;BA.debugLine="itemQtty.Gravity = Gravity.CENTER";
Debug.ShouldStop(262144);
_itemqtty.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 180;BA.debugLine="itemQtty.TextColor =  Colors.DarkGray";
Debug.ShouldStop(524288);
_itemqtty.runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 183;BA.debugLine="holder.AddView(itemName, 0, 0, 20%x, 5%y)";
Debug.ShouldStop(4194304);
_holder.runVoidMethod ("AddView",(Object)((_itemname.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 184;BA.debugLine="holder.AddView(itemPrice, itemName.Left + itemNa";
Debug.ShouldStop(8388608);
_holder.runVoidMethod ("AddView",(Object)((_itemprice.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_itemname.runMethod(true,"getLeft"),_itemname.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 185;BA.debugLine="holder.AddView(itemQtty, itemPrice.Left + itemPr";
Debug.ShouldStop(16777216);
_holder.runVoidMethod ("AddView",(Object)((_itemqtty.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_itemprice.runMethod(true,"getLeft"),_itemprice.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 186;BA.debugLine="holder.AddView(additem, itemQtty.Left + itemQtty";
Debug.ShouldStop(33554432);
_holder.runVoidMethod ("AddView",(Object)((_additem.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_itemqtty.runMethod(true,"getLeft"),_itemqtty.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 187;BA.debugLine="holder.AddView(delitem, additem.Left + additem.W";
Debug.ShouldStop(67108864);
_holder.runVoidMethod ("AddView",(Object)((_delitem.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_additem.runMethod(true,"getLeft"),_additem.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 188;BA.debugLine="holder.AddView(delitemX, delitem.Left + delitem.";
Debug.ShouldStop(134217728);
_holder.runVoidMethod ("AddView",(Object)((_delitemx.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_delitem.runMethod(true,"getLeft"),_delitem.runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 190;BA.debugLine="delitemX.Text = \"x\"";
Debug.ShouldStop(536870912);
_delitemx.runMethod(true,"setText",BA.ObjectToCharSequence("x"));
 BA.debugLineNum = 191;BA.debugLine="delitemX.TextSize = 14";
Debug.ShouldStop(1073741824);
_delitemx.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 192;BA.debugLine="delitemX.Gravity = Gravity.CENTER";
Debug.ShouldStop(-2147483648);
_delitemx.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 193;BA.debugLine="delitemX.Padding = Array As Int (0dip, 0dip, 0di";
Debug.ShouldStop(1);
_delitemx.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 194;BA.debugLine="delitemX.TextColor =  AppColors.FadedDarkRed";
Debug.ShouldStop(2);
_delitemx.runMethod(true,"setTextColor",shoppingcart._appcolors._fadeddarkred);
 BA.debugLineNum = 195;BA.debugLine="delitemX.Color = AppColors.Transparent";
Debug.ShouldStop(4);
_delitemx.runVoidMethod ("setColor",shoppingcart._appcolors._transparent);
 BA.debugLineNum = 196;BA.debugLine="delitemX.Tag = g.ID";
Debug.ShouldStop(8);
_delitemx.runMethod(false,"setTag",(_g.getField(true,"ID")));
 BA.debugLineNum = 198;BA.debugLine="additem.Text = \"+\"";
Debug.ShouldStop(32);
_additem.runMethod(true,"setText",BA.ObjectToCharSequence("+"));
 BA.debugLineNum = 199;BA.debugLine="additem.TextSize = 14";
Debug.ShouldStop(64);
_additem.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 200;BA.debugLine="additem.Textcolor = AppColors.Black";
Debug.ShouldStop(128);
_additem.runMethod(true,"setTextColor",shoppingcart._appcolors._black);
 BA.debugLineNum = 201;BA.debugLine="additem.Padding = Array As Int (0dip, 0dip, 0dip";
Debug.ShouldStop(256);
_additem.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 202;BA.debugLine="additem.Color = AppColors.Transparent";
Debug.ShouldStop(512);
_additem.runVoidMethod ("setColor",shoppingcart._appcolors._transparent);
 BA.debugLineNum = 203;BA.debugLine="additem.Gravity = Gravity.CENTER";
Debug.ShouldStop(1024);
_additem.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 204;BA.debugLine="additem.Tag = g.ID";
Debug.ShouldStop(2048);
_additem.runMethod(false,"setTag",(_g.getField(true,"ID")));
 BA.debugLineNum = 206;BA.debugLine="delitem.Text = \"-\"";
Debug.ShouldStop(8192);
_delitem.runMethod(true,"setText",BA.ObjectToCharSequence("-"));
 BA.debugLineNum = 207;BA.debugLine="delitem.Textsize = 14";
Debug.ShouldStop(16384);
_delitem.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 208;BA.debugLine="delitem.TextColor = AppColors.Black";
Debug.ShouldStop(32768);
_delitem.runMethod(true,"setTextColor",shoppingcart._appcolors._black);
 BA.debugLineNum = 209;BA.debugLine="delitem.Padding = Array As Int (0dip, 0dip, 0dip";
Debug.ShouldStop(65536);
_delitem.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 210;BA.debugLine="delitem.Color = AppColors.Transparent";
Debug.ShouldStop(131072);
_delitem.runVoidMethod ("setColor",shoppingcart._appcolors._transparent);
 BA.debugLineNum = 211;BA.debugLine="delitem.Gravity = Gravity.CENTER";
Debug.ShouldStop(262144);
_delitem.runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 212;BA.debugLine="delitem.Tag = g.ID";
Debug.ShouldStop(524288);
_delitem.runMethod(false,"setTag",(_g.getField(true,"ID")));
 BA.debugLineNum = 214;BA.debugLine="Support.ApplyViewStyle(holder,Colors.Transparent";
Debug.ShouldStop(2097152);
shoppingcart._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _holder.getObject()),(Object)(shoppingcart.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(shoppingcart._appcolors._lightgray),(Object)(shoppingcart._appcolors._lightgray),(Object)(shoppingcart._appcolors._lightgraypressed),(Object)(shoppingcart._appcolors._lightgraypressed),(Object)(shoppingcart.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(shoppingcart.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 215;BA.debugLine="ShopList.Panel.AddView(holder,0,0+(5%y + 1dip)*r";
Debug.ShouldStop(4194304);
__ref.getField(false,"_shoplist").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_holder.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),(RemoteObject.solve(new RemoteObject[] {shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),_row}, "+*",1, 1)),(Object)(__ref.getField(false,"_shoplist").runMethod(false,"getPanel").runMethod(true,"getWidth")),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 217;BA.debugLine="If row < ScannedItems.Size - 1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_scanneditems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 218;BA.debugLine="ShopList.Panel.Height = 10%y + ((5%y + 1dip)*ro";
Debug.ShouldStop(33554432);
__ref.getField(false,"_shoplist").runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba")),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),_row}, "*",0, 1))}, "+",1, 1));
 BA.debugLineNum = 219;BA.debugLine="row = row + 1";
Debug.ShouldStop(67108864);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 };
 }
}Debug.locals.put("g", _g);
;
 BA.debugLineNum = 223;BA.debugLine="RefreshOverall";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_refreshoverall");
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("BuildCartUI (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("buildcartui")) { return __ref.runUserSub(false, "shoppingcart","buildcartui", __ref);}
 BA.debugLineNum = 37;BA.debugLine="Public Sub BuildCartUI";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="CartPan.Color = AppColors.FadedBlack";
Debug.ShouldStop(32);
__ref.getField(false,"_cartpan").runVoidMethod ("setColor",shoppingcart._appcolors._fadedblack);
 BA.debugLineNum = 39;BA.debugLine="pblBase.Color = AppColors.FadedDarkRed";
Debug.ShouldStop(64);
__ref.getField(false,"_pblbase").runVoidMethod ("setColor",shoppingcart._appcolors._fadeddarkred);
 BA.debugLineNum = 40;BA.debugLine="pnlHeader.Color = AppColors.FadedDarkRed";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlheader").runVoidMethod ("setColor",shoppingcart._appcolors._fadeddarkred);
 BA.debugLineNum = 42;BA.debugLine="CartPan.AddView(pnlHeader,0,0,90%x,5%y)";
Debug.ShouldStop(512);
__ref.getField(false,"_cartpan").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlheader").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 43;BA.debugLine="CartPan.AddView(pblBase,0,45%y,90%x,5%y)";
Debug.ShouldStop(1024);
__ref.getField(false,"_cartpan").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pblbase").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 45)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 45;BA.debugLine="ItemNamelbl.Text = \"Name\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setText",BA.ObjectToCharSequence("Name"));
 BA.debugLineNum = 46;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(8192);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 47;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
Debug.ShouldStop(16384);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 49;BA.debugLine="ItemPricelbl.Text = \"Price\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_itempricelbl").runMethod(true,"setText",BA.ObjectToCharSequence("Price"));
 BA.debugLineNum = 50;BA.debugLine="ItemPricelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(131072);
__ref.getField(false,"_itempricelbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 51;BA.debugLine="ItemPricelbl.TextColor = Colors.White";
Debug.ShouldStop(262144);
__ref.getField(false,"_itempricelbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 53;BA.debugLine="ItemQttylbl.Text = \"Quantity\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_itemqttylbl").runMethod(true,"setText",BA.ObjectToCharSequence("Quantity"));
 BA.debugLineNum = 54;BA.debugLine="ItemQttylbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(2097152);
__ref.getField(false,"_itemqttylbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 55;BA.debugLine="ItemQttylbl.TextColor = Colors.White";
Debug.ShouldStop(4194304);
__ref.getField(false,"_itemqttylbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 57;BA.debugLine="FinalSumlbl.Text = \"Total\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_finalsumlbl").runMethod(true,"setText",BA.ObjectToCharSequence("Total"));
 BA.debugLineNum = 58;BA.debugLine="FinalSumlbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(33554432);
__ref.getField(false,"_finalsumlbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 59;BA.debugLine="FinalSumlbl.TextColor = Colors.White";
Debug.ShouldStop(67108864);
__ref.getField(false,"_finalsumlbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 61;BA.debugLine="Sumlbl.Text = CalculateSum";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sumlbl").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_calculatesum")));
 BA.debugLineNum = 62;BA.debugLine="Sumlbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sumlbl").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 63;BA.debugLine="Sumlbl.TextColor = Colors.White";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sumlbl").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 65;BA.debugLine="FinishOrderbtn.Text = \"Finish\"";
Debug.ShouldStop(1);
__ref.getField(false,"_finishorderbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Finish"));
 BA.debugLineNum = 66;BA.debugLine="FinishOrderbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(2);
__ref.getField(false,"_finishorderbtn").runMethod(true,"setGravity",shoppingcart.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 67;BA.debugLine="FinishOrderbtn.TextColor = Colors.White";
Debug.ShouldStop(4);
__ref.getField(false,"_finishorderbtn").runMethod(true,"setTextColor",shoppingcart.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 68;BA.debugLine="FinishOrderbtn.Padding = Array As Int (0dip, 0dip";
Debug.ShouldStop(8);
__ref.getField(false,"_finishorderbtn").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),shoppingcart.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}));
 BA.debugLineNum = 69;BA.debugLine="FinishOrderbtn.Color = AppColors.LightGray";
Debug.ShouldStop(16);
__ref.getField(false,"_finishorderbtn").runVoidMethod ("setColor",shoppingcart._appcolors._lightgray);
 BA.debugLineNum = 71;BA.debugLine="pnlHeader.AddView(ItemNamelbl, 0, 0, 20%x, 5%y)";
Debug.ShouldStop(64);
__ref.getField(false,"_pnlheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itemnamelbl").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 72;BA.debugLine="pnlHeader.AddView(ItemPricelbl,  ItemNamelbl.Left";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itempricelbl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemnamelbl").runMethod(true,"getLeft"),__ref.getField(false,"_itemnamelbl").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 73;BA.debugLine="pnlHeader.AddView(ItemQttylbl,   ItemPricelbl.Lef";
Debug.ShouldStop(256);
__ref.getField(false,"_pnlheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itemqttylbl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itempricelbl").runMethod(true,"getLeft"),__ref.getField(false,"_itempricelbl").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 75;BA.debugLine="pblBase.AddView(FinishOrderbtn, 65%x , 0, 25%x ,";
Debug.ShouldStop(1024);
__ref.getField(false,"_pblbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_finishorderbtn").getObject())),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 65)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 76;BA.debugLine="pblBase.AddView(FinalSumlbl, 0, 0, 20%x, 5%y)";
Debug.ShouldStop(2048);
__ref.getField(false,"_pblbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_finalsumlbl").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 77;BA.debugLine="pblBase.AddView(Sumlbl, FinalSumlbl.Left + FinalS";
Debug.ShouldStop(4096);
__ref.getField(false,"_pblbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sumlbl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_finalsumlbl").runMethod(true,"getLeft"),__ref.getField(false,"_finalsumlbl").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 80;BA.debugLine="CartPan.AddView(ShopList,0%x, 5%y,100%x,40%y)";
Debug.ShouldStop(32768);
__ref.getField(false,"_cartpan").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_shoplist").getObject())),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("CalculateSum (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("calculatesum")) { return __ref.runUserSub(false, "shoppingcart","calculatesum", __ref);}
RemoteObject _sum = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
 BA.debugLineNum = 83;BA.debugLine="Public Sub CalculateSum As Double";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Dim sum As Double = 0";
Debug.ShouldStop(524288);
_sum = BA.numberCast(double.class, 0);Debug.locals.put("sum", _sum);Debug.locals.put("sum", _sum);
 BA.debugLineNum = 85;BA.debugLine="For Each g As Good In ScannedItems.Values";
Debug.ShouldStop(1048576);
{
final RemoteObject group2 = __ref.getField(false,"_scanneditems").runMethod(false,"Values");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_g = (group2.runMethod(false,"Get",index2));Debug.locals.put("g", _g);
Debug.locals.put("g", _g);
 BA.debugLineNum = 86;BA.debugLine="sum = sum + (g.Qtty*GetGoodPrice(g.ID))";
Debug.ShouldStop(2097152);
_sum = RemoteObject.solve(new RemoteObject[] {_sum,(RemoteObject.solve(new RemoteObject[] {_g.getField(true,"Qtty"),__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_getgoodprice",(Object)(_g.getField(true,"ID")))}, "*",0, 0))}, "+",1, 0);Debug.locals.put("sum", _sum);
 }
}Debug.locals.put("g", _g);
;
 BA.debugLineNum = 88;BA.debugLine="Return sum";
Debug.ShouldStop(8388608);
if (true) return _sum;
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 8;BA.debugLine="Public ItemsSuppliers As Map";
shoppingcart._itemssuppliers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_itemssuppliers",shoppingcart._itemssuppliers);
 //BA.debugLineNum = 9;BA.debugLine="Public CurrentItem As Good";
shoppingcart._currentitem = RemoteObject.createNew ("b4a.diplomna.types._good");__ref.setField("_currentitem",shoppingcart._currentitem);
 //BA.debugLineNum = 10;BA.debugLine="Public CurrentSupplier As Supplier";
shoppingcart._currentsupplier = RemoteObject.createNew ("b4a.diplomna.types._supplier");__ref.setField("_currentsupplier",shoppingcart._currentsupplier);
 //BA.debugLineNum = 12;BA.debugLine="Public FinishOrderbtn As Button";
shoppingcart._finishorderbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_finishorderbtn",shoppingcart._finishorderbtn);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearcart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearCart (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("clearcart")) { return __ref.runUserSub(false, "shoppingcart","clearcart", __ref);}
 BA.debugLineNum = 343;BA.debugLine="Public Sub ClearCart";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="ScannedItems.Clear";
Debug.ShouldStop(8388608);
__ref.getField(false,"_scanneditems").runVoidMethod ("Clear");
 BA.debugLineNum = 345;BA.debugLine="CallSub(Main,\"ClearItemInfo\")";
Debug.ShouldStop(16777216);
shoppingcart.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((shoppingcart._main.getObject())),(Object)(RemoteObject.createImmutable("ClearItemInfo")));
 BA.debugLineNum = 346;BA.debugLine="BuildCart";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcart");
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delqtty_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DelQtty_Click (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("delqtty_click")) { return __ref.runUserSub(false, "shoppingcart","delqtty_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
 BA.debugLineNum = 235;BA.debugLine="Public Sub DelQtty_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(2048);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 237;BA.debugLine="btn = Sender";
Debug.ShouldStop(4096);
_btn.setObject(shoppingcart.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 238;BA.debugLine="Dim g As Good = ScannedItems.Get(btn.tag)";
Debug.ShouldStop(8192);
_g = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)(_btn.runMethod(false,"getTag"))));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 239;BA.debugLine="g.Qtty = g.Qtty - 1";
Debug.ShouldStop(16384);
_g.setField ("Qtty",RemoteObject.solve(new RemoteObject[] {_g.getField(true,"Qtty"),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 240;BA.debugLine="If g.Qtty <= 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("k",_g.getField(true,"Qtty"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 241;BA.debugLine="ScannedItems.Remove(g.ID)";
Debug.ShouldStop(65536);
__ref.getField(false,"_scanneditems").runVoidMethod ("Remove",(Object)((_g.getField(true,"ID"))));
 }else {
 BA.debugLineNum = 243;BA.debugLine="ScannedItems.Put(g.ID,g)";
Debug.ShouldStop(262144);
__ref.getField(false,"_scanneditems").runVoidMethod ("Put",(Object)((_g.getField(true,"ID"))),(Object)((_g)));
 };
 BA.debugLineNum = 245;BA.debugLine="BuildCart";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcart");
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _finishorder_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FinishOrder_Click (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("finishorder_click")) { __ref.runUserSub(false, "shoppingcart","finishorder_click", __ref); return;}
ResumableSub_FinishOrder_Click rsub = new ResumableSub_FinishOrder_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FinishOrder_Click extends BA.ResumableSub {
public ResumableSub_FinishOrder_Click(b4a.diplomna.shoppingcart parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.shoppingcart parent;
RemoteObject _neworder = RemoteObject.declareNull("b4a.diplomna.types._order");
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
RemoteObject _ordergood = RemoteObject.declareNull("b4a.diplomna.types._orderedgood");
RemoteObject _sendorder = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
RemoteObject group5;
int index5;
int groupLen5;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FinishOrder_Click (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,296);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 297;BA.debugLine="If ScannedItems.Size > 0 Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_scanneditems").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 298;BA.debugLine="Dim neworder As Order";
Debug.ShouldStop(512);
_neworder = RemoteObject.createNew ("b4a.diplomna.types._order");Debug.locals.put("neworder", _neworder);
 BA.debugLineNum = 299;BA.debugLine="neworder.Initialize()";
Debug.ShouldStop(1024);
_neworder.runVoidMethod ("Initialize");
 BA.debugLineNum = 300;BA.debugLine="neworder.OrderedGoods.Initialize()";
Debug.ShouldStop(2048);
_neworder.getField(false,"OrderedGoods").runVoidMethod ("Initialize");
 BA.debugLineNum = 302;BA.debugLine="For Each g As Good In ScannedItems.Values";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//for
this.state = 7;
group5 = __ref.getField(false,"_scanneditems").runMethod(false,"Values");
index5 = 0;
groupLen5 = group5.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("g", _g);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 7;
if (index5 < groupLen5) {
this.state = 6;
_g = (group5.runMethod(false,"Get",index5));Debug.locals.put("g", _g);}
if (true) break;

case 18:
//C
this.state = 17;
index5++;
Debug.locals.put("g", _g);
if (true) break;

case 6:
//C
this.state = 18;
 BA.debugLineNum = 303;BA.debugLine="Dim ordergood As OrderedGood";
Debug.ShouldStop(16384);
_ordergood = RemoteObject.createNew ("b4a.diplomna.types._orderedgood");Debug.locals.put("ordergood", _ordergood);
 BA.debugLineNum = 304;BA.debugLine="ordergood.Initialize";
Debug.ShouldStop(32768);
_ordergood.runVoidMethod ("Initialize");
 BA.debugLineNum = 305;BA.debugLine="ordergood.Order = neworder";
Debug.ShouldStop(65536);
_ordergood.setField ("Order",_neworder);
 BA.debugLineNum = 306;BA.debugLine="ordergood.GoodID = g.ID";
Debug.ShouldStop(131072);
_ordergood.setField ("GoodID",_g.getField(true,"ID"));
 BA.debugLineNum = 307;BA.debugLine="ordergood.Qtty = g.Qtty";
Debug.ShouldStop(262144);
_ordergood.setField ("Qtty",_g.getField(true,"Qtty"));
 BA.debugLineNum = 309;BA.debugLine="neworder.OrderedGoods.Add(ordergood)";
Debug.ShouldStop(1048576);
_neworder.getField(false,"OrderedGoods").runVoidMethod ("Add",(Object)((_ordergood)));
 BA.debugLineNum = 310;BA.debugLine="neworder.OrderTotalPrice = neworder.OrderTotalP";
Debug.ShouldStop(2097152);
_neworder.setField ("OrderTotalPrice",RemoteObject.solve(new RemoteObject[] {_neworder.getField(true,"OrderTotalPrice"),(RemoteObject.solve(new RemoteObject[] {_g.getField(true,"Price"),_g.getField(true,"Qtty")}, "*",0, 0))}, "+",1, 0));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("g", _g);
;
 BA.debugLineNum = 312;BA.debugLine="neworder.CutomerID = Main.LoggedCustomer.ID";
Debug.ShouldStop(8388608);
_neworder.setField ("CutomerID",parent._main._loggedcustomer.getField(true,"ID"));
 BA.debugLineNum = 313;BA.debugLine="neworder.OrderStatus = \"Waiting\"";
Debug.ShouldStop(16777216);
_neworder.setField ("OrderStatus",BA.ObjectToString("Waiting"));
 BA.debugLineNum = 314;BA.debugLine="neworder.OrderCode = \"#\" & GenerateRandomString(";
Debug.ShouldStop(33554432);
_neworder.setField ("OrderCode",RemoteObject.concat(RemoteObject.createImmutable("#"),__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_generaterandomstring",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 316;BA.debugLine="Dim sendorder As ResumableSub = Main.HTTP.SendOr";
Debug.ShouldStop(134217728);
_sendorder = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_sendorder = parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_sendorder",(Object)(_neworder));Debug.locals.put("sendorder", _sendorder);Debug.locals.put("sendorder", _sendorder);
 BA.debugLineNum = 317;BA.debugLine="Wait For (sendorder)  Complete (Result As Object";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "shoppingcart", "finishorder_click"), _sendorder);
this.state = 19;
return;
case 19:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 319;BA.debugLine="If Main.HTTP.Output = \"502\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",parent._main._http.getField(true,"_output"),BA.ObjectToString("502"))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 320;BA.debugLine="ToastMessageShow(\"Error sending order,try again";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error sending order,try again!")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 322;BA.debugLine="ClearCart";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_clearcart");
 if (true) break;

case 13:
//C
this.state = 16;
;
 BA.debugLineNum = 325;BA.debugLine="Main.HTTP.Output = \"\"";
Debug.ShouldStop(16);
parent._main._http.setField ("_output",BA.ObjectToString(""));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 327;BA.debugLine="ToastMessageShow(\"No items in cart\",False)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No items in cart")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static RemoteObject  _generaterandomstring(RemoteObject __ref,RemoteObject _strlength) throws Exception{
try {
		Debug.PushSubsStack("GenerateRandomString (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("generaterandomstring")) { return __ref.runUserSub(false, "shoppingcart","generaterandomstring", __ref, _strlength);}
RemoteObject _rndstring = RemoteObject.createImmutable("");
RemoteObject _rndnumber = RemoteObject.createImmutable(0);
Debug.locals.put("StrLength", _strlength);
 BA.debugLineNum = 331;BA.debugLine="Sub GenerateRandomString(StrLength As Int) As Stri";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="Dim RndString As String";
Debug.ShouldStop(2048);
_rndstring = RemoteObject.createImmutable("");Debug.locals.put("RndString", _rndstring);
 BA.debugLineNum = 333;BA.debugLine="Dim RndNumber As Int";
Debug.ShouldStop(4096);
_rndnumber = RemoteObject.createImmutable(0);Debug.locals.put("RndNumber", _rndnumber);
 BA.debugLineNum = 334;BA.debugLine="Do While RndString.Length < StrLength";
Debug.ShouldStop(8192);
while (RemoteObject.solveBoolean("<",_rndstring.runMethod(true,"length"),BA.numberCast(double.class, _strlength))) {
 BA.debugLineNum = 335;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
Debug.ShouldStop(16384);
_rndnumber = shoppingcart.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 48)),(Object)(BA.numberCast(int.class, 123)));Debug.locals.put("RndNumber", _rndnumber);
 BA.debugLineNum = 336;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_rndnumber,BA.numberCast(double.class, 48)) && RemoteObject.solveBoolean("k",_rndnumber,BA.numberCast(double.class, 57))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_rndnumber,BA.numberCast(double.class, 65)) && RemoteObject.solveBoolean("k",_rndnumber,BA.numberCast(double.class, 90))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_rndnumber,BA.numberCast(double.class, 97)) && RemoteObject.solveBoolean("k",_rndnumber,BA.numberCast(double.class, 112)))))) { 
 BA.debugLineNum = 337;BA.debugLine="RndString = RndString & Chr(RndNumber)";
Debug.ShouldStop(65536);
_rndstring = RemoteObject.concat(_rndstring,shoppingcart.__c.runMethod(true,"Chr",(Object)(_rndnumber)));Debug.locals.put("RndString", _rndstring);
 };
 }
;
 BA.debugLineNum = 340;BA.debugLine="Return RndString";
Debug.ShouldStop(524288);
if (true) return _rndstring;
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgoodprice(RemoteObject __ref,RemoteObject _goodid) throws Exception{
try {
		Debug.PushSubsStack("GetGoodPrice (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("getgoodprice")) { return __ref.runUserSub(false, "shoppingcart","getgoodprice", __ref, _goodid);}
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
Debug.locals.put("GoodID", _goodid);
 BA.debugLineNum = 91;BA.debugLine="Public Sub GetGoodPrice(GoodID As Int) As Double";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Dim g As Good = ScannedItems.Get(GoodID)";
Debug.ShouldStop(134217728);
_g = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)((_goodid))));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 93;BA.debugLine="Return g.Price";
Debug.ShouldStop(268435456);
if (true) return _g.getField(true,"Price");
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getitemfromdb(RemoteObject __ref,RemoteObject _goodid) throws Exception{
try {
		Debug.PushSubsStack("GetItemFromDB (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("getitemfromdb")) { __ref.runUserSub(false, "shoppingcart","getitemfromdb", __ref, _goodid); return;}
ResumableSub_GetItemFromDB rsub = new ResumableSub_GetItemFromDB(null,__ref,_goodid);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetItemFromDB extends BA.ResumableSub {
public ResumableSub_GetItemFromDB(b4a.diplomna.shoppingcart parent,RemoteObject __ref,RemoteObject _goodid) {
this.parent = parent;
this.__ref = __ref;
this._goodid = _goodid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.shoppingcart parent;
RemoteObject _goodid;
RemoteObject _getgood = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
RemoteObject _getsupplier = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetItemFromDB (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,123);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("GoodID", _goodid);
 BA.debugLineNum = 124;BA.debugLine="Dim GetGood As ResumableSub = Main.HTTP.GetGoodBy";
Debug.ShouldStop(134217728);
_getgood = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_getgood = parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_getgoodbyid",(Object)(_goodid));Debug.locals.put("GetGood", _getgood);Debug.locals.put("GetGood", _getgood);
 BA.debugLineNum = 125;BA.debugLine="Wait For (GetGood)  Complete (Result As Object)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "shoppingcart", "getitemfromdb"), _getgood);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 127;BA.debugLine="CurrentItem = JSONSerializations.SerializeGood(Ma";
Debug.ShouldStop(1073741824);
__ref.setField ("_currentitem",parent._jsonserializations.runMethod(false,"_serializegood",__ref.getField(false, "ba"),(Object)(parent._main._http.getField(true,"_output"))));
 BA.debugLineNum = 128;BA.debugLine="CurrentItem.Qtty = 1";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_currentitem").setField ("Qtty",BA.numberCast(int.class, 1));
 BA.debugLineNum = 129;BA.debugLine="Main.HTTP.ClearOuput";
Debug.ShouldStop(1);
parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_clearouput");
 BA.debugLineNum = 131;BA.debugLine="Dim GetSupplier As ResumableSub = Main.HTTP.GetSu";
Debug.ShouldStop(4);
_getsupplier = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_getsupplier = parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_getsupplierbyid",(Object)(__ref.getField(false,"_currentitem").getField(true,"SupplierID")));Debug.locals.put("GetSupplier", _getsupplier);Debug.locals.put("GetSupplier", _getsupplier);
 BA.debugLineNum = 132;BA.debugLine="Wait For (GetSupplier)  Complete (Result As Objec";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "shoppingcart", "getitemfromdb"), _getsupplier);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 133;BA.debugLine="CurrentSupplier = JSONSerializations.SerializeSup";
Debug.ShouldStop(16);
__ref.setField ("_currentsupplier",parent._jsonserializations.runMethod(false,"_serializesupplier",__ref.getField(false, "ba"),(Object)(parent._main._http.getField(true,"_output"))));
 BA.debugLineNum = 135;BA.debugLine="Main.HTTP.ClearOuput";
Debug.ShouldStop(64);
parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_clearouput");
 BA.debugLineNum = 137;BA.debugLine="AddSupplier(CurrentSupplier)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_addsupplier",(Object)(__ref.getField(false,"_currentsupplier")));
 BA.debugLineNum = 138;BA.debugLine="AddItemToBasket(CurrentItem)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_additemtobasket",(Object)(__ref.getField(false,"_currentitem")));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "shoppingcart","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="ScannedItems.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_scanneditems").runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="CurrentItem.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_currentitem").runVoidMethod ("Initialize");
 BA.debugLineNum = 19;BA.debugLine="CurrentSupplier.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_currentsupplier").runVoidMethod ("Initialize");
 BA.debugLineNum = 21;BA.debugLine="ItemsSuppliers.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_itemssuppliers").runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="CartPan.Initialize(\"\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cartpan").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="pblBase.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pblbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="pnlHeader.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlheader").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 26;BA.debugLine="ItemNamelbl.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_itemnamelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 27;BA.debugLine="ItemPricelbl.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_itempricelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="ItemQttylbl.Initialize(\"\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_itemqttylbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 29;BA.debugLine="FinalSumlbl.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_finalsumlbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 30;BA.debugLine="Sumlbl.Initialize(\"\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sumlbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 31;BA.debugLine="FinishOrderbtn.Initialize(\"FinishOrder\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_finishorderbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("FinishOrder")));
 BA.debugLineNum = 32;BA.debugLine="ShopList.Initialize(10%y)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_shoplist").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(shoppingcart.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 34;BA.debugLine="BuildCartUI";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcartui");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("RefreshOverall (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("refreshoverall")) { return __ref.runUserSub(false, "shoppingcart","refreshoverall", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Public Sub RefreshOverall";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Sumlbl.Text =  NumberFormat2(CalculateSum,1,2,2,F";
Debug.ShouldStop(1);
__ref.getField(false,"_sumlbl").runMethod(true,"setText",BA.ObjectToCharSequence(shoppingcart.__c.runMethod(true,"NumberFormat2",(Object)(__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_calculatesum")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(shoppingcart.__c.getField(true,"False")))));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("RemoveItemFromBasket (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("removeitemfrombasket")) { return __ref.runUserSub(false, "shoppingcart","removeitemfrombasket", __ref, _goodid);}
RemoteObject _s = RemoteObject.declareNull("b4a.diplomna.types._supplier");
Debug.locals.put("GoodID", _goodid);
 BA.debugLineNum = 143;BA.debugLine="Public Sub RemoveItemFromBasket(GoodID As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(GoodID)";
Debug.ShouldStop(32768);
_s = (__ref.getField(false,"_itemssuppliers").runMethod(false,"Get",(Object)((_goodid))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 145;BA.debugLine="ItemsSuppliers.Remove(s.ID)";
Debug.ShouldStop(65536);
__ref.getField(false,"_itemssuppliers").runVoidMethod ("Remove",(Object)((_s.getField(true,"ID"))));
 BA.debugLineNum = 146;BA.debugLine="ScannedItems.Remove(GoodID)";
Debug.ShouldStop(131072);
__ref.getField(false,"_scanneditems").runVoidMethod ("Remove",(Object)((_goodid)));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("RemoveItemFromBasket_Click (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("removeitemfrombasket_click")) { return __ref.runUserSub(false, "shoppingcart","removeitemfrombasket_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 249;BA.debugLine="Public Sub RemoveItemFromBasket_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(33554432);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 251;BA.debugLine="btn = Sender";
Debug.ShouldStop(67108864);
_btn.setObject(shoppingcart.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 252;BA.debugLine="RemoveItemFromBasket(btn.Tag)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_removeitemfrombasket",(Object)(BA.numberCast(int.class, _btn.runMethod(false,"getTag"))));
 BA.debugLineNum = 253;BA.debugLine="BuildCart";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcart");
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("SelectItemFromBasket_Click (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("selectitemfrombasket_click")) { return __ref.runUserSub(false, "shoppingcart","selectitemfrombasket_click", __ref);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 281;BA.debugLine="Public Sub SelectItemFromBasket_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 282;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(33554432);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 283;BA.debugLine="pnl = Sender";
Debug.ShouldStop(67108864);
_pnl.setObject(shoppingcart.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 284;BA.debugLine="ViewSelectedItemInfo(pnl.Tag)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_viewselectediteminfo",(Object)(BA.numberCast(int.class, _pnl.runMethod(false,"getTag"))));
 BA.debugLineNum = 285;BA.debugLine="Log(\"Clicked \" & pnl.Tag)";
Debug.ShouldStop(268435456);
shoppingcart.__c.runVoidMethod ("LogImpl","56619140",RemoteObject.concat(RemoteObject.createImmutable("Clicked "),_pnl.runMethod(false,"getTag")),0);
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("TestWithFakes (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("testwithfakes")) { return __ref.runUserSub(false, "shoppingcart","testwithfakes", __ref, _num);}
int _i = 0;
RemoteObject _g = RemoteObject.declareNull("b4a.diplomna.types._good");
RemoteObject _s = RemoteObject.declareNull("b4a.diplomna.types._supplier");
Debug.locals.put("num", _num);
 BA.debugLineNum = 256;BA.debugLine="Public Sub TestWithFakes(num As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="For i = 0 To num";
Debug.ShouldStop(1);
{
final int step1 = 1;
final int limit1 = _num.<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 258;BA.debugLine="Dim g As Good";
Debug.ShouldStop(2);
_g = RemoteObject.createNew ("b4a.diplomna.types._good");Debug.locals.put("g", _g);
 BA.debugLineNum = 259;BA.debugLine="Dim s As Supplier";
Debug.ShouldStop(4);
_s = RemoteObject.createNew ("b4a.diplomna.types._supplier");Debug.locals.put("s", _s);
 BA.debugLineNum = 261;BA.debugLine="g.ID = i";
Debug.ShouldStop(16);
_g.setField ("ID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 262;BA.debugLine="g.SupplierID = i";
Debug.ShouldStop(32);
_g.setField ("SupplierID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 263;BA.debugLine="g.Qtty = 1";
Debug.ShouldStop(64);
_g.setField ("Qtty",BA.numberCast(int.class, 1));
 BA.debugLineNum = 265;BA.debugLine="g.Name = \"Name\"&i";
Debug.ShouldStop(256);
_g.setField ("Name",RemoteObject.concat(RemoteObject.createImmutable("Name"),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 266;BA.debugLine="g.PLU = 100+i";
Debug.ShouldStop(512);
_g.setField ("PLU",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),RemoteObject.createImmutable(_i)}, "+",1, 1));
 BA.debugLineNum = 267;BA.debugLine="g.Price = 5.99 + i";
Debug.ShouldStop(1024);
_g.setField ("Price",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(5.99),RemoteObject.createImmutable(_i)}, "+",1, 0));
 BA.debugLineNum = 268;BA.debugLine="g.Description = \"nothing\"";
Debug.ShouldStop(2048);
_g.setField ("Description",BA.ObjectToString("nothing"));
 BA.debugLineNum = 269;BA.debugLine="g.Is_Discontinued = 0";
Debug.ShouldStop(4096);
_g.setField ("Is_Discontinued",BA.numberCast(int.class, 0));
 BA.debugLineNum = 271;BA.debugLine="s.ID = i";
Debug.ShouldStop(16384);
_s.setField ("ID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 272;BA.debugLine="s.SupplierName = \"Micro\"&i";
Debug.ShouldStop(32768);
_s.setField ("SupplierName",RemoteObject.concat(RemoteObject.createImmutable("Micro"),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 273;BA.debugLine="s.SupploerPhone = \"088896451\"&i";
Debug.ShouldStop(65536);
_s.setField ("SupploerPhone",RemoteObject.concat(RemoteObject.createImmutable("088896451"),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 275;BA.debugLine="AddItemToBasket(g)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_additemtobasket",(Object)(_g));
 BA.debugLineNum = 276;BA.debugLine="AddSupplier(s)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_addsupplier",(Object)(_s));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 278;BA.debugLine="BuildCart";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.diplomna.shoppingcart.class, "_buildcart");
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
public static RemoteObject  _viewselectediteminfo(RemoteObject __ref,RemoteObject _goodid) throws Exception{
try {
		Debug.PushSubsStack("ViewSelectedItemInfo (shoppingcart) ","shoppingcart",9,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("viewselectediteminfo")) { return __ref.runUserSub(false, "shoppingcart","viewselectediteminfo", __ref, _goodid);}
RemoteObject _item = RemoteObject.declareNull("b4a.diplomna.types._good");
RemoteObject _s = RemoteObject.declareNull("b4a.diplomna.types._supplier");
Debug.locals.put("GoodID", _goodid);
 BA.debugLineNum = 288;BA.debugLine="Public Sub ViewSelectedItemInfo(GoodID As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="Dim item As Good = ScannedItems.Get(GoodID)";
Debug.ShouldStop(1);
_item = (__ref.getField(false,"_scanneditems").runMethod(false,"Get",(Object)((_goodid))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 290;BA.debugLine="Dim s As Supplier = ItemsSuppliers.Get(item.Suppl";
Debug.ShouldStop(2);
_s = (__ref.getField(false,"_itemssuppliers").runMethod(false,"Get",(Object)((_item.getField(true,"SupplierID")))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 292;BA.debugLine="CallSub3(Main,\"ShowItemInfo\",item,s)";
Debug.ShouldStop(8);
shoppingcart.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)((shoppingcart._main.getObject())),(Object)(BA.ObjectToString("ShowItemInfo")),(Object)((_item)),(Object)((_s)));
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}