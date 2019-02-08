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
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _setcurrentinfo(b4a.diplomna.orderinfovisualizer __ref,b4a.diplomna.types._localorder _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "setcurrentinfo", false))
	 {return ((String) Debug.delegate(ba, "setcurrentinfo", new Object[] {_o}));}
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub SetCurrentInfo(o As LocalOrder)";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="OrderContentContext.Clear";
__ref._ordercontentcontext.Clear();
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="OrderCodelbl.Text = o.OrderCode";
__ref._ordercodelbl.setText(BA.ObjectToCharSequence(_o.OrderCode));
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="OrderStatusbl.Text = o.OrderStatus";
__ref._orderstatusbl.setText(BA.ObjectToCharSequence(_o.OrderStatus));
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="For Each g As Good In o.Goods";
{
final anywheresoftware.b4a.BA.IterableList group4 = _o.Goods;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_g = (b4a.diplomna.types._good)(group4.Get(index4));
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="OrderContentContext.AddSingleLine(GoodToString(g";
__ref._ordercontentcontext.AddSingleLine(BA.ObjectToCharSequence(__ref._goodtostring(null,_g)));
 }
};
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.orderinfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Return InfoHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._infoholder.getObject()));
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return null;
}
public String  _buildinfoui(b4a.diplomna.orderinfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "buildinfoui", false))
	 {return ((String) Debug.delegate(ba, "buildinfoui", null));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub BuildInfoUI";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
__ref._infoholder.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="OrderCodelbl.Gravity = Gravity.CENTER";
__ref._ordercodelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="OrderCodelbl.TextColor = Colors.White";
__ref._ordercodelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="OrderCodelbl.TextSize = 20";
__ref._ordercodelbl.setTextSize((float) (20));
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="OrderCodelbl.Text = \"#testcode\"";
__ref._ordercodelbl.setText(BA.ObjectToCharSequence("#testcode"));
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="OrderStatusbl.Gravity = Gravity.CENTER";
__ref._orderstatusbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="OrderStatusbl.TextColor = Colors.White";
__ref._orderstatusbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="OrderStatusbl.Text = \"status\"";
__ref._orderstatusbl.setText(BA.ObjectToCharSequence("status"));
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="OrderStatusbl.TextSize = 20";
__ref._orderstatusbl.setTextSize((float) (20));
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="OrderContentContext.SingleLineLayout.Label.TextSi";
__ref._ordercontentcontext.getSingleLineLayout().Label.setTextSize((float) (15));
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="OrderContentContext.FastScrollEnabled = True";
__ref._ordercontentcontext.setFastScrollEnabled(__c.True);
RDebugUtils.currentLine=7340048;
 //BA.debugLineNum = 7340048;BA.debugLine="OrderContentContext.SingleLineLayout.ItemHeight =";
__ref._ordercontentcontext.getSingleLineLayout().setItemHeight(__c.PerYToCurrent((float) (3),ba));
RDebugUtils.currentLine=7340050;
 //BA.debugLineNum = 7340050;BA.debugLine="InfoHolder.AddView(OrderCodelbl,0,0,40%x,6%y)";
__ref._infoholder.AddView((android.view.View)(__ref._ordercodelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (6),ba));
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="InfoHolder.AddView(OrderStatusbl,OrderCodelbl.Lef";
__ref._infoholder.AddView((android.view.View)(__ref._orderstatusbl.getObject()),(int) (__ref._ordercodelbl.getLeft()+__ref._ordercodelbl.getWidth()),__ref._ordercodelbl.getTop(),__c.PerXToCurrent((float) (50),ba),__ref._ordercodelbl.getHeight());
RDebugUtils.currentLine=7340052;
 //BA.debugLineNum = 7340052;BA.debugLine="InfoHolder.AddView(OrderContentContext,OrderCodel";
__ref._infoholder.AddView((android.view.View)(__ref._ordercontentcontext.getObject()),__ref._ordercodelbl.getLeft(),(int) (__ref._ordercodelbl.getTop()+__ref._ordercodelbl.getHeight()),(int) (__ref._ordercodelbl.getWidth()+__ref._orderstatusbl.getWidth()),__c.PerYToCurrent((float) (18),ba));
RDebugUtils.currentLine=7340053;
 //BA.debugLineNum = 7340053;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.orderinfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Private InfoHolder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Private OrderCodelbl,OrderStatusbl,OrderTotalSuml";
_ordercodelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatusbl = new anywheresoftware.b4a.objects.LabelWrapper();
_ordertotalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Private OrderContentContext As ListView";
_ordercontentcontext = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="End Sub";
return "";
}
public String  _goodtostring(b4a.diplomna.orderinfovisualizer __ref,b4a.diplomna.types._good _g) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "goodtostring", false))
	 {return ((String) Debug.delegate(ba, "goodtostring", new Object[] {_g}));}
String _result = "";
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub GoodToString(g As Good) As String";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Dim result As String";
_result = "";
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="result = g.Name & \" / \" & g.Price & \" / \" & g.Qtt";
_result = _g.Name+" / "+BA.NumberToString(_g.Price)+" / "+BA.NumberToString(_g.Qtty);
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.diplomna.orderinfovisualizer __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="OrderCodelbl.Initialize(\"\")";
__ref._ordercodelbl.Initialize(ba,"");
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="OrderStatusbl.Initialize(\"\")";
__ref._orderstatusbl.Initialize(ba,"");
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="OrderTotalSumlbl.Initialize(\"\")";
__ref._ordertotalsumlbl.Initialize(ba,"");
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="OrderContentContext.Initialize(\"\")";
__ref._ordercontentcontext.Initialize(ba,"");
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="BuildInfoUI";
__ref._buildinfoui(null);
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="End Sub";
return "";
}
}