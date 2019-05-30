package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class orderinfovisualizer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.orderinfovisualizer");
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
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 47;BA.debugLine="Return InfoHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_infoholder.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _buildinfoui() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub BuildInfoUI";
 //BA.debugLineNum = 24;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
_infoholder.setColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 26;BA.debugLine="OrderCodelbl.Gravity = Gravity.CENTER";
_ordercodelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 27;BA.debugLine="OrderCodelbl.TextColor = Colors.White";
_ordercodelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 28;BA.debugLine="OrderCodelbl.TextSize = 20";
_ordercodelbl.setTextSize((float) (20));
 //BA.debugLineNum = 29;BA.debugLine="OrderCodelbl.Text = \"#example\"";
_ordercodelbl.setText(BA.ObjectToCharSequence("#example"));
 //BA.debugLineNum = 32;BA.debugLine="OrderStatusbl.Gravity = Gravity.CENTER";
_orderstatusbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 33;BA.debugLine="OrderStatusbl.TextColor = Colors.White";
_orderstatusbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 34;BA.debugLine="OrderStatusbl.Text = \"status\"";
_orderstatusbl.setText(BA.ObjectToCharSequence("status"));
 //BA.debugLineNum = 35;BA.debugLine="OrderStatusbl.TextSize = 20";
_orderstatusbl.setTextSize((float) (20));
 //BA.debugLineNum = 37;BA.debugLine="OrderContentContext.SingleLineLayout.Label.TextSi";
_ordercontentcontext.getSingleLineLayout().Label.setTextSize((float) (15));
 //BA.debugLineNum = 38;BA.debugLine="OrderContentContext.FastScrollEnabled = True";
_ordercontentcontext.setFastScrollEnabled(__c.True);
 //BA.debugLineNum = 39;BA.debugLine="OrderContentContext.SingleLineLayout.ItemHeight =";
_ordercontentcontext.getSingleLineLayout().setItemHeight(__c.PerYToCurrent((float) (3),ba));
 //BA.debugLineNum = 41;BA.debugLine="InfoHolder.AddView(OrderCodelbl,0,0,40%x,6%y)";
_infoholder.AddView((android.view.View)(_ordercodelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (6),ba));
 //BA.debugLineNum = 42;BA.debugLine="InfoHolder.AddView(OrderStatusbl,OrderCodelbl.Lef";
_infoholder.AddView((android.view.View)(_orderstatusbl.getObject()),(int) (_ordercodelbl.getLeft()+_ordercodelbl.getWidth()),_ordercodelbl.getTop(),__c.PerXToCurrent((float) (50),ba),_ordercodelbl.getHeight());
 //BA.debugLineNum = 43;BA.debugLine="InfoHolder.AddView(OrderContentContext,OrderCodel";
_infoholder.AddView((android.view.View)(_ordercontentcontext.getObject()),_ordercodelbl.getLeft(),(int) (_ordercodelbl.getTop()+_ordercodelbl.getHeight()),(int) (_ordercodelbl.getWidth()+_orderstatusbl.getWidth()),__c.PerYToCurrent((float) (18),ba));
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private InfoHolder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private OrderCodelbl,OrderStatusbl,OrderTotalSuml";
_ordercodelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_orderstatusbl = new anywheresoftware.b4a.objects.LabelWrapper();
_ordertotalsumlbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private OrderContentContext As ListView";
_ordercontentcontext = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _goodtostring(b4a.diplomna.types._good _g,int _goodqtty) throws Exception{
String _result = "";
 //BA.debugLineNum = 50;BA.debugLine="Public Sub GoodToString(g As Good,GoodQtty As Int)";
 //BA.debugLineNum = 51;BA.debugLine="Dim result As String";
_result = "";
 //BA.debugLineNum = 52;BA.debugLine="result = g.Name & \" / \" & g.Price & \" / \" & GoodQ";
_result = _g.Name+" / "+BA.NumberToString(_g.Price)+" / "+BA.NumberToString(_goodqtty);
 //BA.debugLineNum = 53;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="InfoHolder.Initialize(\"\")";
_infoholder.Initialize(ba,"");
 //BA.debugLineNum = 12;BA.debugLine="OrderCodelbl.Initialize(\"\")";
_ordercodelbl.Initialize(ba,"");
 //BA.debugLineNum = 13;BA.debugLine="OrderStatusbl.Initialize(\"\")";
_orderstatusbl.Initialize(ba,"");
 //BA.debugLineNum = 14;BA.debugLine="OrderTotalSumlbl.Initialize(\"\")";
_ordertotalsumlbl.Initialize(ba,"");
 //BA.debugLineNum = 17;BA.debugLine="InfoHolder.Initialize(\"\")";
_infoholder.Initialize(ba,"");
 //BA.debugLineNum = 18;BA.debugLine="OrderContentContext.Initialize(\"\")";
_ordercontentcontext.Initialize(ba,"");
 //BA.debugLineNum = 20;BA.debugLine="BuildInfoUI";
_buildinfoui();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public void  _setcurrentinfo(b4a.diplomna.types._order _o) throws Exception{
ResumableSub_SetCurrentInfo rsub = new ResumableSub_SetCurrentInfo(this,_o);
rsub.resume(ba, null);
}
public static class ResumableSub_SetCurrentInfo extends BA.ResumableSub {
public ResumableSub_SetCurrentInfo(b4a.diplomna.orderinfovisualizer parent,b4a.diplomna.types._order _o) {
this.parent = parent;
this._o = _o;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 57;BA.debugLine="OrderContentContext.Clear";
parent._ordercontentcontext.Clear();
 //BA.debugLineNum = 58;BA.debugLine="OrderCodelbl.Text = o.OrderCode";
parent._ordercodelbl.setText(BA.ObjectToCharSequence(_o.OrderCode));
 //BA.debugLineNum = 59;BA.debugLine="OrderStatusbl.Text = o.OrderStatus";
parent._orderstatusbl.setText(BA.ObjectToCharSequence(_o.OrderStatus));
 //BA.debugLineNum = 60;BA.debugLine="For Each good As OrderedGood In o.OrderedGoods";
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
 //BA.debugLineNum = 61;BA.debugLine="Dim GetGood As ResumableSub = Main.HTTP.GetGoodB";
_getgood = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_getgood = parent._main._http._getgoodbyid(_good.GoodID);
 //BA.debugLineNum = 62;BA.debugLine="Wait For (GetGood)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, this, _getgood);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_result = (Object) result[0];
;
 //BA.debugLineNum = 64;BA.debugLine="Dim tmpgood As Good = JSONSerializations.Seriali";
_tmpgood = parent._jsonserializations._serializegood(ba,parent._main._http._output);
 //BA.debugLineNum = 66;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput();
 //BA.debugLineNum = 67;BA.debugLine="OrderContentContext.AddSingleLine(GoodToString(t";
parent._ordercontentcontext.AddSingleLine(BA.ObjectToCharSequence(parent._goodtostring(_tmpgood,_good.Qtty)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(Object _result) throws Exception{
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
