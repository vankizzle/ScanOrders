package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class iteminfovisualizer_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (iteminfovisualizer) ","iteminfovisualizer",7,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "iteminfovisualizer","asview", __ref);}
 BA.debugLineNum = 80;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Return InfoHolder";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_infoholder").getObject());
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildinfoui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildInfoUI (iteminfovisualizer) ","iteminfovisualizer",7,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("buildinfoui")) { return __ref.runUserSub(false, "iteminfovisualizer","buildinfoui", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Public Sub BuildInfoUI";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_infoholder").runVoidMethod ("setColor",iteminfovisualizer.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 34;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(2);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setGravity",iteminfovisualizer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 35;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
Debug.ShouldStop(4);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setTextColor",iteminfovisualizer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 36;BA.debugLine="ItemNamelbl.TextSize = 20";
Debug.ShouldStop(8);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 37;BA.debugLine="ItemNamelbl.Text = \"TEST\"";
Debug.ShouldStop(16);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setText",BA.ObjectToCharSequence("TEST"));
 BA.debugLineNum = 40;BA.debugLine="ItemDescriptionlbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(128);
__ref.getField(false,"_itemdescriptionlbl").runMethod(true,"setGravity",iteminfovisualizer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 41;BA.debugLine="ItemDescriptionlbl.TextColor = Colors.White";
Debug.ShouldStop(256);
__ref.getField(false,"_itemdescriptionlbl").runMethod(true,"setTextColor",iteminfovisualizer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 43;BA.debugLine="ItemDescriptionlbl.Text = \"Description\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_itemdescriptionlbl").runMethod(true,"setText",BA.ObjectToCharSequence("Description"));
 BA.debugLineNum = 44;BA.debugLine="ItemDescriptionlbl.TextSize = 25";
Debug.ShouldStop(2048);
__ref.getField(false,"_itemdescriptionlbl").runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 46;BA.debugLine="ItemIsDicontinuedlbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(8192);
__ref.getField(false,"_itemisdicontinuedlbl").runMethod(true,"setGravity",iteminfovisualizer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 47;BA.debugLine="ItemIsDicontinuedlbl.TextColor = Colors.White";
Debug.ShouldStop(16384);
__ref.getField(false,"_itemisdicontinuedlbl").runMethod(true,"setTextColor",iteminfovisualizer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 49;BA.debugLine="ItemIsDicontinuedlbl.Text = \"In Stock\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_itemisdicontinuedlbl").runMethod(true,"setText",BA.ObjectToCharSequence("In Stock"));
 BA.debugLineNum = 50;BA.debugLine="ItemIsDicontinuedlbl.TextSize = 20";
Debug.ShouldStop(131072);
__ref.getField(false,"_itemisdicontinuedlbl").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 52;BA.debugLine="ItemPLUlbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(524288);
__ref.getField(false,"_itemplulbl").runMethod(true,"setGravity",iteminfovisualizer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 53;BA.debugLine="ItemPLUlbl.TextColor = Colors.White";
Debug.ShouldStop(1048576);
__ref.getField(false,"_itemplulbl").runMethod(true,"setTextColor",iteminfovisualizer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 54;BA.debugLine="ItemPLUlbl.Text = \"PLU:\" & 555";
Debug.ShouldStop(2097152);
__ref.getField(false,"_itemplulbl").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("PLU:"),RemoteObject.createImmutable(555))));
 BA.debugLineNum = 57;BA.debugLine="ItemSupplierNamelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(16777216);
__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"setGravity",iteminfovisualizer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 58;BA.debugLine="ItemSupplierNamelbl.TextColor = Colors.White";
Debug.ShouldStop(33554432);
__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"setTextColor",iteminfovisualizer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 59;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier:\" & \"BILLA\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Supplier:"),RemoteObject.createImmutable("BILLA"))));
 BA.debugLineNum = 60;BA.debugLine="ItemSupplierNamelbl.TextSize = 20";
Debug.ShouldStop(134217728);
__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 65;BA.debugLine="DescriptionText.Initialize(\"\")";
Debug.ShouldStop(1);
__ref.getField(false,"_descriptiontext").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 66;BA.debugLine="DescriptionText.Color = Colors.Transparent";
Debug.ShouldStop(2);
__ref.getField(false,"_descriptiontext").runVoidMethod ("setColor",iteminfovisualizer.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 67;BA.debugLine="DescriptionText.Textcolor = Colors.White";
Debug.ShouldStop(4);
__ref.getField(false,"_descriptiontext").runMethod(true,"setTextColor",iteminfovisualizer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 68;BA.debugLine="DescriptionText.Gravity = Gravity.CENTER";
Debug.ShouldStop(8);
__ref.getField(false,"_descriptiontext").runMethod(true,"setGravity",iteminfovisualizer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 69;BA.debugLine="DescriptionText.TextSize = 14";
Debug.ShouldStop(16);
__ref.getField(false,"_descriptiontext").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 70;BA.debugLine="DescriptionContext.Panel.AddView(DescriptionText,";
Debug.ShouldStop(32);
__ref.getField(false,"_descriptioncontext").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_descriptiontext").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_descriptioncontext").runMethod(false,"getPanel").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_descriptioncontext").runMethod(false,"getPanel").runMethod(true,"getHeight")));
 BA.debugLineNum = 72;BA.debugLine="InfoHolder.AddView(ItemNamelbl,0,0,40%x,6%y)";
Debug.ShouldStop(128);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itemnamelbl").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(iteminfovisualizer.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(iteminfovisualizer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 73;BA.debugLine="InfoHolder.AddView(ItemSupplierNamelbl,ItemNamelb";
Debug.ShouldStop(256);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itemsuppliernamelbl").getObject())),(Object)(__ref.getField(false,"_itemnamelbl").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemnamelbl").runMethod(true,"getTop"),__ref.getField(false,"_itemnamelbl").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(__ref.getField(false,"_itemnamelbl").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_itemnamelbl").runMethod(true,"getHeight")));
 BA.debugLineNum = 74;BA.debugLine="InfoHolder.AddView(ItemPLUlbl,ItemSupplierNamelbl";
Debug.ShouldStop(512);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itemplulbl").getObject())),(Object)(__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"getTop"),__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"getHeight")));
 BA.debugLineNum = 75;BA.debugLine="InfoHolder.AddView(ItemIsDicontinuedlbl,ItemPLUlb";
Debug.ShouldStop(1024);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itemisdicontinuedlbl").getObject())),(Object)(__ref.getField(false,"_itemplulbl").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemplulbl").runMethod(true,"getTop"),__ref.getField(false,"_itemplulbl").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(__ref.getField(false,"_itemplulbl").runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemplulbl").runMethod(true,"getHeight"),iteminfovisualizer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "+",1, 1)));
 BA.debugLineNum = 76;BA.debugLine="InfoHolder.AddView(ItemDescriptionlbl,ItemNamelbl";
Debug.ShouldStop(2048);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_itemdescriptionlbl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemnamelbl").runMethod(true,"getLeft"),__ref.getField(false,"_itemnamelbl").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_itemnamelbl").runMethod(true,"getTop")),(Object)(iteminfovisualizer.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(__ref.getField(false,"_itemnamelbl").runMethod(true,"getHeight")));
 BA.debugLineNum = 77;BA.debugLine="InfoHolder.AddView(DescriptionContext,ItemDescrip";
Debug.ShouldStop(4096);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_descriptioncontext").getObject())),(Object)(__ref.getField(false,"_itemdescriptionlbl").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_itemdescriptionlbl").runMethod(true,"getTop"),__ref.getField(false,"_itemdescriptionlbl").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(iteminfovisualizer.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {iteminfovisualizer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 18)),__ref.getField(false, "ba")),iteminfovisualizer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "+",1, 1)));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private InfoHolder As Panel";
iteminfovisualizer._infoholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_infoholder",iteminfovisualizer._infoholder);
 //BA.debugLineNum = 3;BA.debugLine="Private ItemNamelbl,ItemDescriptionlbl,ItemPricel";
iteminfovisualizer._itemnamelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemnamelbl",iteminfovisualizer._itemnamelbl);
iteminfovisualizer._itemdescriptionlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemdescriptionlbl",iteminfovisualizer._itemdescriptionlbl);
iteminfovisualizer._itempricelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itempricelbl",iteminfovisualizer._itempricelbl);
iteminfovisualizer._itemqttylbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemqttylbl",iteminfovisualizer._itemqttylbl);
iteminfovisualizer._itemplulbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemplulbl",iteminfovisualizer._itemplulbl);
iteminfovisualizer._itemisdicontinuedlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemisdicontinuedlbl",iteminfovisualizer._itemisdicontinuedlbl);
 //BA.debugLineNum = 4;BA.debugLine="Private ItemSupplierNamelbl,ItemSupplierPhone,Ite";
iteminfovisualizer._itemsuppliernamelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemsuppliernamelbl",iteminfovisualizer._itemsuppliernamelbl);
iteminfovisualizer._itemsupplierphone = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemsupplierphone",iteminfovisualizer._itemsupplierphone);
iteminfovisualizer._itempricelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itempricelbl",iteminfovisualizer._itempricelbl);
iteminfovisualizer._itemqttylbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemqttylbl",iteminfovisualizer._itemqttylbl);
iteminfovisualizer._itemisdicontinuedlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_itemisdicontinuedlbl",iteminfovisualizer._itemisdicontinuedlbl);
 //BA.debugLineNum = 5;BA.debugLine="Private DescriptionContext As ScrollView";
iteminfovisualizer._descriptioncontext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_descriptioncontext",iteminfovisualizer._descriptioncontext);
 //BA.debugLineNum = 6;BA.debugLine="Private DescriptionText As Label";
iteminfovisualizer._descriptiontext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_descriptiontext",iteminfovisualizer._descriptiontext);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (iteminfovisualizer) ","iteminfovisualizer",7,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "iteminfovisualizer","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="InfoHolder.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_infoholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 14;BA.debugLine="ItemNamelbl.Initialize(\"\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_itemnamelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 15;BA.debugLine="ItemDescriptionlbl.Initialize(\"\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_itemdescriptionlbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 16;BA.debugLine="ItemPricelbl.Initialize(\"\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_itempricelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 17;BA.debugLine="ItemQttylbl.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_itemqttylbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 18;BA.debugLine="ItemIsDicontinuedlbl.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_itemisdicontinuedlbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 19;BA.debugLine="ItemPLUlbl.Initialize(\"\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_itemplulbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="ItemSupplierNamelbl.Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_itemsuppliernamelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 22;BA.debugLine="ItemSupplierPhone.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_itemsupplierphone").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="InfoHolder.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_infoholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="DescriptionContext.Initialize(20%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_descriptioncontext").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(iteminfovisualizer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 26;BA.debugLine="DescriptionText.Initialize(\"\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_descriptiontext").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="BuildInfoUI";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.diplomna.iteminfovisualizer.class, "_buildinfoui");
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrentinfo(RemoteObject __ref,RemoteObject _g,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("SetCurrentInfo (iteminfovisualizer) ","iteminfovisualizer",7,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("setcurrentinfo")) { return __ref.runUserSub(false, "iteminfovisualizer","setcurrentinfo", __ref, _g, _s);}
Debug.locals.put("g", _g);
Debug.locals.put("s", _s);
 BA.debugLineNum = 84;BA.debugLine="Public Sub SetCurrentInfo(g As Good,s As Supplier)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="ItemNamelbl.Text = g.Name";
Debug.ShouldStop(1048576);
__ref.getField(false,"_itemnamelbl").runMethod(true,"setText",BA.ObjectToCharSequence(_g.getField(true,"Name")));
 BA.debugLineNum = 86;BA.debugLine="If g.Is_Discontinued = 1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_g.getField(true,"Is_Discontinued"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 87;BA.debugLine="ItemIsDicontinuedlbl.Text = \"Out of stock\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_itemisdicontinuedlbl").runMethod(true,"setText",BA.ObjectToCharSequence("Out of stock"));
 }else 
{ BA.debugLineNum = 88;BA.debugLine="Else if  g.Is_Discontinued = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_g.getField(true,"Is_Discontinued"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 89;BA.debugLine="ItemIsDicontinuedlbl.Text = \"In stock\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_itemisdicontinuedlbl").runMethod(true,"setText",BA.ObjectToCharSequence("In stock"));
 }}
;
 BA.debugLineNum = 92;BA.debugLine="ItemPLUlbl.Text = \"PLU:\" & g.PLU";
Debug.ShouldStop(134217728);
__ref.getField(false,"_itemplulbl").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("PLU:"),_g.getField(true,"PLU"))));
 BA.debugLineNum = 94;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier:\"& s.Supplie";
Debug.ShouldStop(536870912);
__ref.getField(false,"_itemsuppliernamelbl").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Supplier:"),_s.getField(true,"SupplierName"))));
 BA.debugLineNum = 95;BA.debugLine="DescriptionText.Text = g.Description";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_descriptiontext").runMethod(true,"setText",BA.ObjectToCharSequence(_g.getField(true,"Description")));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}