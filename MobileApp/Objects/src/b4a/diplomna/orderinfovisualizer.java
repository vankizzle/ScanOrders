package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class orderinfovisualizer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.orderinfovisualizer");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.orderinfovisualizer.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _infoholder = null;
public anywheresoftware.b4a.objects.LabelWrapper _ordercodelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _orderstatusbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _ordertotalsumlbl = null;
public anywheresoftware.b4a.objects.ListViewWrapper _ordercontentcontext = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public void  _setcurrentinfo(b4a.diplomna.orderinfovisualizer __ref,b4a.diplomna.types._order _o) throws Exception{
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "setcurrentinfo", false))
	 {Debug.delegate(ba, "setcurrentinfo", new Object[] {_o}); return;}
ResumableSub_SetCurrentInfo rsub = new ResumableSub_SetCurrentInfo(this,__ref,_o);
rsub.resume(ba, null);
}
public static class ResumableSub_SetCurrentInfo extends BA.ResumableSub {
public ResumableSub_SetCurrentInfo(b4a.diplomna.orderinfovisualizer parent,b4a.diplomna.orderinfovisualizer __ref,b4a.diplomna.types._order _o) {
this.parent = parent;
this.__ref = __ref;
this._o = _o;
this.__ref = parent;
}
b4a.diplomna.orderinfovisualizer __ref;
b4a.diplomna.orderinfovisualizer parent;
b4a.diplomna.types._order _o;
b4a.diplomna.types._orderedgood _good = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _getgood = null;
Object _result = null;
b4a.diplomna.types._good _tmpgood = null;
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="orderinfovisualizer";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="OrderContentContext.Clear";
__ref._ordercontentcontext.Clear();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="OrderCodelbl.Text = o.OrderCode";
__ref._ordercodelbl.setText(BA.ObjectToCharSequence(_o.OrderCode));
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="OrderStatusbl.Text = o.OrderStatus";
__ref._orderstatusbl.setText(BA.ObjectToCharSequence(_o.OrderStatus));
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="For Each good As OrderedGood In o.OrderedGoods";
if (true) break;

case 1:
//for
this.state = 4;
group4 = _o.OrderedGoods;
index4 = 0;
groupLen4 = group4.getSize();
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if (index4 < groupLen4) {
this.state = 3;
_good = (b4a.diplomna.types._orderedgood)(group4.Get(index4));}
if (true) break;

case 6:
//C
this.state = 5;
index4++;
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="Dim GetGood As ResumableSub = Main.HTTP.GetGoodB";
_getgood = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getgood = parent._main._http._getgoodbyid(null,_good.GoodID);
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="Wait For (GetGood)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "orderinfovisualizer", "setcurrentinfo"), _getgood);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_result = (Object) result[1];
;
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="Dim tmpgood As Good = JSONSerializations.Seriali";
_tmpgood = parent._jsonserializations._serializegood(ba,parent._main._http._output);
RDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
RDebugUtils.currentLine=7077899;
 //BA.debugLineNum = 7077899;BA.debugLine="OrderContentContext.AddSingleLine(GoodToString(t";
__ref._ordercontentcontext.AddSingleLine(BA.ObjectToCharSequence(__ref._goodtostring(null,_tmpgood,_good.Qtty)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.orderinfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Return InfoHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._infoholder.getObject()));
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.orderinfovisualizer __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="OrderCodelbl.Initialize(\"\")";
__ref._ordercodelbl.Initialize(ba,"");
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="OrderStatusbl.Initialize(\"\")";
__ref._orderstatusbl.Initialize(ba,"");
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="OrderTotalSumlbl.Initialize(\"\")";
__ref._ordertotalsumlbl.Initialize(ba,"");
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="OrderContentContext.Initialize(\"\")";
__ref._ordercontentcontext.Initialize(ba,"");
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="BuildInfoUI";
__ref._buildinfoui(null);
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="End Sub";
return "";
}
public String  _buildinfoui(b4a.diplomna.orderinfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "buildinfoui", false))
	 {return ((String) Debug.delegate(ba, "buildinfoui", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub BuildInfoUI";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
__ref._infoholder.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="OrderCodelbl.Gravity = Gravity.CENTER";
__ref._ordercodelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="OrderCodelbl.TextColor = Colors.White";
__ref._ordercodelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="OrderCodelbl.TextSize = 20";
__ref._ordercodelbl.setTextSize((float) (20));
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="OrderCodelbl.Text = \"#example\"";
__ref._ordercodelbl.setText(BA.ObjectToCharSequence("#example"));
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="OrderStatusbl.Gravity = Gravity.CENTER";
__ref._orderstatusbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="OrderStatusbl.TextColor = Colors.White";
__ref._orderstatusbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="OrderStatusbl.Text = \"status\"";
__ref._orderstatusbl.setText(BA.ObjectToCharSequence("status"));
RDebugUtils.currentLine=6881292;
 //BA.debugLineNum = 6881292;BA.debugLine="OrderStatusbl.TextSize = 20";
__ref._orderstatusbl.setTextSize((float) (20));
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="OrderContentContext.SingleLineLayout.Label.TextSi";
__ref._ordercontentcontext.getSingleLineLayout().Label.setTextSize((float) (15));
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="OrderContentContext.FastScrollEnabled = True";
__ref._ordercontentcontext.setFastScrollEnabled(__c.True);
RDebugUtils.currentLine=6881296;
 //BA.debugLineNum = 6881296;BA.debugLine="OrderContentContext.SingleLineLayout.ItemHeight =";
__ref._ordercontentcontext.getSingleLineLayout().setItemHeight(__c.PerYToCurrent((float) (3),ba));
RDebugUtils.currentLine=6881298;
 //BA.debugLineNum = 6881298;BA.debugLine="InfoHolder.AddView(OrderCodelbl,0,0,40%x,6%y)";
__ref._infoholder.AddView((android.view.View)(__ref._ordercodelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (6),ba));
RDebugUtils.currentLine=6881299;
 //BA.debugLineNum = 6881299;BA.debugLine="InfoHolder.AddView(OrderStatusbl,OrderCodelbl.Lef";
__ref._infoholder.AddView((android.view.View)(__ref._orderstatusbl.getObject()),(int) (__ref._ordercodelbl.getLeft()+__ref._ordercodelbl.getWidth()),__ref._ordercodelbl.getTop(),__c.PerXToCurrent((float) (50),ba),__ref._ordercodelbl.getHeight());
RDebugUtils.currentLine=6881300;
 //BA.debugLineNum = 6881300;BA.debugLine="InfoHolder.AddView(OrderContentContext,OrderCodel";
__ref._infoholder.AddView((android.view.View)(__ref._ordercontentcontext.getObject()),__ref._ordercodelbl.getLeft(),(int) (__ref._ordercodelbl.getTop()+__ref._ordercodelbl.getHeight()),(int) (__ref._ordercodelbl.getWidth()+__ref._orderstatusbl.getWidth()),__c.PerYToCurrent((float) (18),ba));
RDebugUtils.currentLine=6881301;
 //BA.debugLineNum = 6881301;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.orderinfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Private InfoHolder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Private OrderCodelbl,OrderStatusbl,OrderTotalSuml";
_ordercodelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatusbl = new anywheresoftware.b4a.objects.LabelWrapper();
_ordertotalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Private OrderContentContext As ListView";
_ordercontentcontext = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="End Sub";
return "";
}
public String  _goodtostring(b4a.diplomna.orderinfovisualizer __ref,b4a.diplomna.types._good _g,int _goodqtty) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "goodtostring", false))
	 {return ((String) Debug.delegate(ba, "goodtostring", new Object[] {_g,_goodqtty}));}
String _result = "";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub GoodToString(g As Good,GoodQtty As Int)";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim result As String";
_result = "";
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="result = g.Name & \" / \" & g.Price & \" / \" & GoodQ";
_result = _g.Name+" / "+BA.NumberToString(_g.Price)+" / "+BA.NumberToString(_goodqtty);
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="End Sub";
return "";
}
}