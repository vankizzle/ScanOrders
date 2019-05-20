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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _setcurrentinfo(b4a.diplomna.orderinfovisualizer __ref,b4a.diplomna.types._localorder _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "setcurrentinfo", false))
	 {return ((String) Debug.delegate(ba, "setcurrentinfo", new Object[] {_o}));}
b4a.diplomna.types._good _g = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub SetCurrentInfo(o As LocalOrder)";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="OrderContentContext.Clear";
__ref._ordercontentcontext.Clear();
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="OrderCodelbl.Text = o.OrderCode";
__ref._ordercodelbl.setText(BA.ObjectToCharSequence(_o.OrderCode));
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="OrderStatusbl.Text = o.OrderStatus";
__ref._orderstatusbl.setText(BA.ObjectToCharSequence(_o.OrderStatus));
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="For Each g As Good In o.Goods";
{
final anywheresoftware.b4a.BA.IterableList group4 = _o.Goods;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_g = (b4a.diplomna.types._good)(group4.Get(index4));
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="OrderContentContext.AddSingleLine(GoodToString(g";
__ref._ordercontentcontext.AddSingleLine(BA.ObjectToCharSequence(__ref._goodtostring(null,_g)));
 }
};
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.orderinfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Return InfoHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._infoholder.getObject()));
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.orderinfovisualizer __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="OrderCodelbl.Initialize(\"\")";
__ref._ordercodelbl.Initialize(ba,"");
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="OrderStatusbl.Initialize(\"\")";
__ref._orderstatusbl.Initialize(ba,"");
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="OrderTotalSumlbl.Initialize(\"\")";
__ref._ordertotalsumlbl.Initialize(ba,"");
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=10223626;
 //BA.debugLineNum = 10223626;BA.debugLine="OrderContentContext.Initialize(\"\")";
__ref._ordercontentcontext.Initialize(ba,"");
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="BuildInfoUI";
__ref._buildinfoui(null);
RDebugUtils.currentLine=10223629;
 //BA.debugLineNum = 10223629;BA.debugLine="End Sub";
return "";
}
public String  _buildinfoui(b4a.diplomna.orderinfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "buildinfoui", false))
	 {return ((String) Debug.delegate(ba, "buildinfoui", null));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Public Sub BuildInfoUI";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
__ref._infoholder.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="OrderCodelbl.Gravity = Gravity.CENTER";
__ref._ordercodelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="OrderCodelbl.TextColor = Colors.White";
__ref._ordercodelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="OrderCodelbl.TextSize = 20";
__ref._ordercodelbl.setTextSize((float) (20));
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="OrderCodelbl.Text = \"#testcode\"";
__ref._ordercodelbl.setText(BA.ObjectToCharSequence("#testcode"));
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="OrderStatusbl.Gravity = Gravity.CENTER";
__ref._orderstatusbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="OrderStatusbl.TextColor = Colors.White";
__ref._orderstatusbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="OrderStatusbl.Text = \"status\"";
__ref._orderstatusbl.setText(BA.ObjectToCharSequence("status"));
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="OrderStatusbl.TextSize = 20";
__ref._orderstatusbl.setTextSize((float) (20));
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="OrderContentContext.SingleLineLayout.Label.TextSi";
__ref._ordercontentcontext.getSingleLineLayout().Label.setTextSize((float) (15));
RDebugUtils.currentLine=10289167;
 //BA.debugLineNum = 10289167;BA.debugLine="OrderContentContext.FastScrollEnabled = True";
__ref._ordercontentcontext.setFastScrollEnabled(__c.True);
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="OrderContentContext.SingleLineLayout.ItemHeight =";
__ref._ordercontentcontext.getSingleLineLayout().setItemHeight(__c.PerYToCurrent((float) (3),ba));
RDebugUtils.currentLine=10289170;
 //BA.debugLineNum = 10289170;BA.debugLine="InfoHolder.AddView(OrderCodelbl,0,0,40%x,6%y)";
__ref._infoholder.AddView((android.view.View)(__ref._ordercodelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (6),ba));
RDebugUtils.currentLine=10289171;
 //BA.debugLineNum = 10289171;BA.debugLine="InfoHolder.AddView(OrderStatusbl,OrderCodelbl.Lef";
__ref._infoholder.AddView((android.view.View)(__ref._orderstatusbl.getObject()),(int) (__ref._ordercodelbl.getLeft()+__ref._ordercodelbl.getWidth()),__ref._ordercodelbl.getTop(),__c.PerXToCurrent((float) (50),ba),__ref._ordercodelbl.getHeight());
RDebugUtils.currentLine=10289172;
 //BA.debugLineNum = 10289172;BA.debugLine="InfoHolder.AddView(OrderContentContext,OrderCodel";
__ref._infoholder.AddView((android.view.View)(__ref._ordercontentcontext.getObject()),__ref._ordercodelbl.getLeft(),(int) (__ref._ordercodelbl.getTop()+__ref._ordercodelbl.getHeight()),(int) (__ref._ordercodelbl.getWidth()+__ref._orderstatusbl.getWidth()),__c.PerYToCurrent((float) (18),ba));
RDebugUtils.currentLine=10289173;
 //BA.debugLineNum = 10289173;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.orderinfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Private InfoHolder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Private OrderCodelbl,OrderStatusbl,OrderTotalSuml";
_ordercodelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatusbl = new anywheresoftware.b4a.objects.LabelWrapper();
_ordertotalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Private OrderContentContext As ListView";
_ordercontentcontext = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="End Sub";
return "";
}
public String  _goodtostring(b4a.diplomna.orderinfovisualizer __ref,b4a.diplomna.types._good _g) throws Exception{
__ref = this;
RDebugUtils.currentModule="orderinfovisualizer";
if (Debug.shouldDelegate(ba, "goodtostring", false))
	 {return ((String) Debug.delegate(ba, "goodtostring", new Object[] {_g}));}
String _result = "";
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub GoodToString(g As Good) As String";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Dim result As String";
_result = "";
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="result = g.Name & \" / \" & g.Price & \" / \" & g.Qtt";
_result = _g.Name+" / "+BA.NumberToString(_g.Price)+" / "+BA.NumberToString(_g.Qtty);
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="End Sub";
return "";
}
}