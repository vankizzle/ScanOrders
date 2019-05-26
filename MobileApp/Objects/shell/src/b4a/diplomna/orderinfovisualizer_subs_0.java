package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class orderinfovisualizer_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (orderinfovisualizer) ","orderinfovisualizer",14,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "orderinfovisualizer","asview", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Return InfoHolder";
Debug.ShouldStop(16384);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_infoholder").getObject());
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("BuildInfoUI (orderinfovisualizer) ","orderinfovisualizer",14,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("buildinfoui")) { return __ref.runUserSub(false, "orderinfovisualizer","buildinfoui", __ref);}
 BA.debugLineNum = 23;BA.debugLine="Public Sub BuildInfoUI";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
Debug.ShouldStop(8388608);
__ref.getField(false,"_infoholder").runVoidMethod ("setColor",orderinfovisualizer.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 26;BA.debugLine="OrderCodelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(33554432);
__ref.getField(false,"_ordercodelbl").runMethod(true,"setGravity",orderinfovisualizer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 27;BA.debugLine="OrderCodelbl.TextColor = Colors.White";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ordercodelbl").runMethod(true,"setTextColor",orderinfovisualizer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 28;BA.debugLine="OrderCodelbl.TextSize = 20";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ordercodelbl").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 29;BA.debugLine="OrderCodelbl.Text = \"#testcode\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_ordercodelbl").runMethod(true,"setText",BA.ObjectToCharSequence("#testcode"));
 BA.debugLineNum = 32;BA.debugLine="OrderStatusbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_orderstatusbl").runMethod(true,"setGravity",orderinfovisualizer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 33;BA.debugLine="OrderStatusbl.TextColor = Colors.White";
Debug.ShouldStop(1);
__ref.getField(false,"_orderstatusbl").runMethod(true,"setTextColor",orderinfovisualizer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 34;BA.debugLine="OrderStatusbl.Text = \"status\"";
Debug.ShouldStop(2);
__ref.getField(false,"_orderstatusbl").runMethod(true,"setText",BA.ObjectToCharSequence("status"));
 BA.debugLineNum = 35;BA.debugLine="OrderStatusbl.TextSize = 20";
Debug.ShouldStop(4);
__ref.getField(false,"_orderstatusbl").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 37;BA.debugLine="OrderContentContext.SingleLineLayout.Label.TextSi";
Debug.ShouldStop(16);
__ref.getField(false,"_ordercontentcontext").runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 38;BA.debugLine="OrderContentContext.FastScrollEnabled = True";
Debug.ShouldStop(32);
__ref.getField(false,"_ordercontentcontext").runMethod(true,"setFastScrollEnabled",orderinfovisualizer.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="OrderContentContext.SingleLineLayout.ItemHeight =";
Debug.ShouldStop(64);
__ref.getField(false,"_ordercontentcontext").runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",orderinfovisualizer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),__ref.getField(false, "ba")));
 BA.debugLineNum = 41;BA.debugLine="InfoHolder.AddView(OrderCodelbl,0,0,40%x,6%y)";
Debug.ShouldStop(256);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_ordercodelbl").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(orderinfovisualizer.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(orderinfovisualizer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 42;BA.debugLine="InfoHolder.AddView(OrderStatusbl,OrderCodelbl.Lef";
Debug.ShouldStop(512);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_orderstatusbl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ordercodelbl").runMethod(true,"getLeft"),__ref.getField(false,"_ordercodelbl").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(__ref.getField(false,"_ordercodelbl").runMethod(true,"getTop")),(Object)(orderinfovisualizer.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(__ref.getField(false,"_ordercodelbl").runMethod(true,"getHeight")));
 BA.debugLineNum = 43;BA.debugLine="InfoHolder.AddView(OrderContentContext,OrderCodel";
Debug.ShouldStop(1024);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_ordercontentcontext").getObject())),(Object)(__ref.getField(false,"_ordercodelbl").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ordercodelbl").runMethod(true,"getTop"),__ref.getField(false,"_ordercodelbl").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ordercodelbl").runMethod(true,"getWidth"),__ref.getField(false,"_orderstatusbl").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(orderinfovisualizer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 18)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
orderinfovisualizer._infoholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_infoholder",orderinfovisualizer._infoholder);
 //BA.debugLineNum = 3;BA.debugLine="Private OrderCodelbl,OrderStatusbl,OrderTotalSuml";
orderinfovisualizer._ordercodelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_ordercodelbl",orderinfovisualizer._ordercodelbl);
orderinfovisualizer._orderstatusbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_orderstatusbl",orderinfovisualizer._orderstatusbl);
orderinfovisualizer._ordertotalsumlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_ordertotalsumlbl",orderinfovisualizer._ordertotalsumlbl);
 //BA.debugLineNum = 4;BA.debugLine="Private OrderContentContext As ListView";
orderinfovisualizer._ordercontentcontext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");__ref.setField("_ordercontentcontext",orderinfovisualizer._ordercontentcontext);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _goodtostring(RemoteObject __ref,RemoteObject _g,RemoteObject _goodqtty) throws Exception{
try {
		Debug.PushSubsStack("GoodToString (orderinfovisualizer) ","orderinfovisualizer",14,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("goodtostring")) { return __ref.runUserSub(false, "orderinfovisualizer","goodtostring", __ref, _g, _goodqtty);}
RemoteObject _result = RemoteObject.createImmutable("");
Debug.locals.put("g", _g);
Debug.locals.put("GoodQtty", _goodqtty);
 BA.debugLineNum = 50;BA.debugLine="Public Sub GoodToString(g As Good,GoodQtty As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Dim result As String";
Debug.ShouldStop(262144);
_result = RemoteObject.createImmutable("");Debug.locals.put("result", _result);
 BA.debugLineNum = 52;BA.debugLine="result = g.Name & \" / \" & g.Price & \" / \" & GoodQ";
Debug.ShouldStop(524288);
_result = RemoteObject.concat(_g.getField(true,"Name"),RemoteObject.createImmutable(" / "),_g.getField(true,"Price"),RemoteObject.createImmutable(" / "),_goodqtty);Debug.locals.put("result", _result);
 BA.debugLineNum = 53;BA.debugLine="Return result";
Debug.ShouldStop(1048576);
if (true) return _result;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (orderinfovisualizer) ","orderinfovisualizer",14,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "orderinfovisualizer","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="InfoHolder.Initialize(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_infoholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 12;BA.debugLine="OrderCodelbl.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_ordercodelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 13;BA.debugLine="OrderStatusbl.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_orderstatusbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 14;BA.debugLine="OrderTotalSumlbl.Initialize(\"\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_ordertotalsumlbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 17;BA.debugLine="InfoHolder.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_infoholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 18;BA.debugLine="OrderContentContext.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_ordercontentcontext").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 20;BA.debugLine="BuildInfoUI";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.diplomna.orderinfovisualizer.class, "_buildinfoui");
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setcurrentinfo(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("SetCurrentInfo (orderinfovisualizer) ","orderinfovisualizer",14,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setcurrentinfo")) { __ref.runUserSub(false, "orderinfovisualizer","setcurrentinfo", __ref, _o); return;}
ResumableSub_SetCurrentInfo rsub = new ResumableSub_SetCurrentInfo(null,__ref,_o);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetCurrentInfo extends BA.ResumableSub {
public ResumableSub_SetCurrentInfo(b4a.diplomna.orderinfovisualizer parent,RemoteObject __ref,RemoteObject _o) {
this.parent = parent;
this.__ref = __ref;
this._o = _o;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.diplomna.orderinfovisualizer parent;
RemoteObject _o;
RemoteObject _good = RemoteObject.declareNull("b4a.diplomna.types._orderedgoods");
RemoteObject _getgood = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
RemoteObject _tmpgood = RemoteObject.declareNull("b4a.diplomna.types._good");
RemoteObject group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetCurrentInfo (orderinfovisualizer) ","orderinfovisualizer",14,__ref.getField(false, "ba"),__ref,56);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("o", _o);
 BA.debugLineNum = 57;BA.debugLine="OrderContentContext.Clear";
Debug.ShouldStop(16777216);
__ref.getField(false,"_ordercontentcontext").runVoidMethod ("Clear");
 BA.debugLineNum = 58;BA.debugLine="OrderCodelbl.Text = o.OrderCode";
Debug.ShouldStop(33554432);
__ref.getField(false,"_ordercodelbl").runMethod(true,"setText",BA.ObjectToCharSequence(_o.getField(true,"OrderCode")));
 BA.debugLineNum = 59;BA.debugLine="OrderStatusbl.Text = o.OrderStatus";
Debug.ShouldStop(67108864);
__ref.getField(false,"_orderstatusbl").runMethod(true,"setText",BA.ObjectToCharSequence(_o.getField(true,"OrderStatus")));
 BA.debugLineNum = 60;BA.debugLine="For Each good As OrderedGoods In o.OrderedGoods";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//for
this.state = 4;
group4 = _o.getField(false,"OrderedGoods");
index4 = 0;
groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("good", _good);
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if (index4 < groupLen4) {
this.state = 3;
_good = (group4.runMethod(false,"Get",index4));Debug.locals.put("good", _good);}
if (true) break;

case 6:
//C
this.state = 5;
index4++;
Debug.locals.put("good", _good);
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 61;BA.debugLine="Dim GetGood As ResumableSub = Main.HTTP.GetGoodB";
Debug.ShouldStop(268435456);
_getgood = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_getgood = parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_getgoodbyid",(Object)(_good.getField(true,"GoodID")));Debug.locals.put("GetGood", _getgood);Debug.locals.put("GetGood", _getgood);
 BA.debugLineNum = 62;BA.debugLine="Wait For (GetGood)  Complete (Result As Object)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "orderinfovisualizer", "setcurrentinfo"), _getgood);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 64;BA.debugLine="Dim tmpgood As Good = JSONSerializations.Seriali";
Debug.ShouldStop(-2147483648);
_tmpgood = parent._jsonserializations.runMethod(false,"_serializegood",__ref.getField(false, "ba"),(Object)(parent._main._http.getField(true,"_output")));Debug.locals.put("tmpgood", _tmpgood);Debug.locals.put("tmpgood", _tmpgood);
 BA.debugLineNum = 66;BA.debugLine="Main.HTTP.ClearOuput";
Debug.ShouldStop(2);
parent._main._http.runClassMethod (b4a.diplomna.http_requests.class, "_clearouput");
 BA.debugLineNum = 67;BA.debugLine="OrderContentContext.AddSingleLine(GoodToString(t";
Debug.ShouldStop(4);
__ref.getField(false,"_ordercontentcontext").runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(__ref.runClassMethod (b4a.diplomna.orderinfovisualizer.class, "_goodtostring",(Object)(_tmpgood),(Object)(_good.getField(true,"Qtty"))))));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("good", _good);
;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
}