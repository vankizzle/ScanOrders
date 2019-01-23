package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class iteminfovisualizer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.iteminfovisualizer");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.iteminfovisualizer.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _itemnamelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemdescriptionlbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _itempricelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemqttylbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemplulbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemisdicontinuedlbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemsuppliernamelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemsupplierphone = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _descriptioncontext = null;
public anywheresoftware.b4a.objects.LabelWrapper _descriptiontext = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public String  _setcurrentinfo(b4a.diplomna.iteminfovisualizer __ref,b4a.diplomna.types._gooddetail _gd,b4a.diplomna.types._supplier _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "setcurrentinfo"))
	 {return ((String) Debug.delegate(ba, "setcurrentinfo", new Object[] {_gd,_s}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub SetCurrentInfo(gd As GoodDetail,s As Su";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="ItemNamelbl.Text = gd.Name";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence(_gd.Name));
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="If gd.Is_Discontinued = 1 Then";
if (_gd.Is_Discontinued==1) { 
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="ItemIsDicontinuedlbl.Text = \"Out of stock\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("Out of stock"));
 }else 
{RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="Else if  gd.Is_Discontinued = 0 Then";
if (_gd.Is_Discontinued==0) { 
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="ItemIsDicontinuedlbl.Text = \"In stock\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("In stock"));
 }}
;
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="ItemPLUlbl.Text = \"PLU:\" & gd.PLU";
__ref._itemplulbl.setText(BA.ObjectToCharSequence("PLU:"+BA.NumberToString(_gd.PLU)));
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier:\"& s.Supplie";
__ref._itemsuppliernamelbl.setText(BA.ObjectToCharSequence("Supplier:"+_s.SupplierName));
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="DescriptionText.Text = gd.Description";
__ref._descriptiontext.setText(BA.ObjectToCharSequence(_gd.Description));
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Return InfoHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._infoholder.getObject()));
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.iteminfovisualizer __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="ItemNamelbl.Initialize(\"\")";
__ref._itemnamelbl.Initialize(ba,"");
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="ItemDescriptionlbl.Initialize(\"\")";
__ref._itemdescriptionlbl.Initialize(ba,"");
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="ItemPricelbl.Initialize(\"\")";
__ref._itempricelbl.Initialize(ba,"");
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="ItemQttylbl.Initialize(\"\")";
__ref._itemqttylbl.Initialize(ba,"");
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="ItemIsDicontinuedlbl.Initialize(\"\")";
__ref._itemisdicontinuedlbl.Initialize(ba,"");
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="ItemPLUlbl.Initialize(\"\")";
__ref._itemplulbl.Initialize(ba,"");
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="ItemSupplierNamelbl.Initialize(\"\")";
__ref._itemsuppliernamelbl.Initialize(ba,"");
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="ItemSupplierPhone.Initialize(\"\")";
__ref._itemsupplierphone.Initialize(ba,"");
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="DescriptionContext.Initialize(20%y)";
__ref._descriptioncontext.Initialize(ba,__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="DescriptionText.Initialize(\"\")";
__ref._descriptiontext.Initialize(ba,"");
RDebugUtils.currentLine=4390930;
 //BA.debugLineNum = 4390930;BA.debugLine="BuildInfoUI";
__ref._buildinfoui(null);
RDebugUtils.currentLine=4390931;
 //BA.debugLineNum = 4390931;BA.debugLine="End Sub";
return "";
}
public String  _buildinfoui(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "buildinfoui"))
	 {return ((String) Debug.delegate(ba, "buildinfoui", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub BuildInfoUI";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
__ref._infoholder.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
__ref._itemnamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
__ref._itemnamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="ItemNamelbl.TextSize = 20";
__ref._itemnamelbl.setTextSize((float) (20));
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="ItemNamelbl.Text = \"TEST\"";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence("TEST"));
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="ItemDescriptionlbl.Gravity = Gravity.CENTER";
__ref._itemdescriptionlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="ItemDescriptionlbl.TextColor = Colors.White";
__ref._itemdescriptionlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4456460;
 //BA.debugLineNum = 4456460;BA.debugLine="ItemDescriptionlbl.Text = \"Description\"";
__ref._itemdescriptionlbl.setText(BA.ObjectToCharSequence("Description"));
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="ItemDescriptionlbl.TextSize = 25";
__ref._itemdescriptionlbl.setTextSize((float) (25));
RDebugUtils.currentLine=4456463;
 //BA.debugLineNum = 4456463;BA.debugLine="ItemIsDicontinuedlbl.Gravity = Gravity.CENTER";
__ref._itemisdicontinuedlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4456464;
 //BA.debugLineNum = 4456464;BA.debugLine="ItemIsDicontinuedlbl.TextColor = Colors.White";
__ref._itemisdicontinuedlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4456466;
 //BA.debugLineNum = 4456466;BA.debugLine="ItemIsDicontinuedlbl.Text = \"In Stock\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("In Stock"));
RDebugUtils.currentLine=4456467;
 //BA.debugLineNum = 4456467;BA.debugLine="ItemIsDicontinuedlbl.TextSize = 20";
__ref._itemisdicontinuedlbl.setTextSize((float) (20));
RDebugUtils.currentLine=4456469;
 //BA.debugLineNum = 4456469;BA.debugLine="ItemPLUlbl.Gravity = Gravity.CENTER";
__ref._itemplulbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4456470;
 //BA.debugLineNum = 4456470;BA.debugLine="ItemPLUlbl.TextColor = Colors.White";
__ref._itemplulbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4456471;
 //BA.debugLineNum = 4456471;BA.debugLine="ItemPLUlbl.Text = \"PLU:\" & 555";
__ref._itemplulbl.setText(BA.ObjectToCharSequence("PLU:"+BA.NumberToString(555)));
RDebugUtils.currentLine=4456474;
 //BA.debugLineNum = 4456474;BA.debugLine="ItemSupplierNamelbl.Gravity = Gravity.CENTER";
__ref._itemsuppliernamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4456475;
 //BA.debugLineNum = 4456475;BA.debugLine="ItemSupplierNamelbl.TextColor = Colors.White";
__ref._itemsuppliernamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4456476;
 //BA.debugLineNum = 4456476;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier:\" & \"BILLA\"";
__ref._itemsuppliernamelbl.setText(BA.ObjectToCharSequence("Supplier:"+"BILLA"));
RDebugUtils.currentLine=4456477;
 //BA.debugLineNum = 4456477;BA.debugLine="ItemSupplierNamelbl.TextSize = 20";
__ref._itemsuppliernamelbl.setTextSize((float) (20));
RDebugUtils.currentLine=4456482;
 //BA.debugLineNum = 4456482;BA.debugLine="DescriptionText.Initialize(\"\")";
__ref._descriptiontext.Initialize(ba,"");
RDebugUtils.currentLine=4456483;
 //BA.debugLineNum = 4456483;BA.debugLine="DescriptionText.Color = Colors.Transparent";
__ref._descriptiontext.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=4456484;
 //BA.debugLineNum = 4456484;BA.debugLine="DescriptionText.Textcolor = Colors.White";
__ref._descriptiontext.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4456485;
 //BA.debugLineNum = 4456485;BA.debugLine="DescriptionText.Gravity = Gravity.CENTER";
__ref._descriptiontext.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4456486;
 //BA.debugLineNum = 4456486;BA.debugLine="DescriptionText.TextSize = 14";
__ref._descriptiontext.setTextSize((float) (14));
RDebugUtils.currentLine=4456487;
 //BA.debugLineNum = 4456487;BA.debugLine="DescriptionContext.Panel.AddView(DescriptionText,";
__ref._descriptioncontext.getPanel().AddView((android.view.View)(__ref._descriptiontext.getObject()),(int) (0),(int) (0),__ref._descriptioncontext.getPanel().getWidth(),__ref._descriptioncontext.getPanel().getHeight());
RDebugUtils.currentLine=4456489;
 //BA.debugLineNum = 4456489;BA.debugLine="InfoHolder.AddView(ItemNamelbl,0,0,40%x,6%y)";
__ref._infoholder.AddView((android.view.View)(__ref._itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (6),ba));
RDebugUtils.currentLine=4456490;
 //BA.debugLineNum = 4456490;BA.debugLine="InfoHolder.AddView(ItemSupplierNamelbl,ItemNamelb";
__ref._infoholder.AddView((android.view.View)(__ref._itemsuppliernamelbl.getObject()),__ref._itemnamelbl.getLeft(),(int) (__ref._itemnamelbl.getTop()+__ref._itemnamelbl.getHeight()),__ref._itemnamelbl.getWidth(),__ref._itemnamelbl.getHeight());
RDebugUtils.currentLine=4456491;
 //BA.debugLineNum = 4456491;BA.debugLine="InfoHolder.AddView(ItemPLUlbl,ItemSupplierNamelbl";
__ref._infoholder.AddView((android.view.View)(__ref._itemplulbl.getObject()),__ref._itemsuppliernamelbl.getLeft(),(int) (__ref._itemsuppliernamelbl.getTop()+__ref._itemsuppliernamelbl.getHeight()),__ref._itemsuppliernamelbl.getWidth(),__ref._itemsuppliernamelbl.getHeight());
RDebugUtils.currentLine=4456492;
 //BA.debugLineNum = 4456492;BA.debugLine="InfoHolder.AddView(ItemIsDicontinuedlbl,ItemPLUlb";
__ref._infoholder.AddView((android.view.View)(__ref._itemisdicontinuedlbl.getObject()),__ref._itemplulbl.getLeft(),(int) (__ref._itemplulbl.getTop()+__ref._itemplulbl.getHeight()),__ref._itemplulbl.getWidth(),(int) (__ref._itemplulbl.getHeight()+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=4456493;
 //BA.debugLineNum = 4456493;BA.debugLine="InfoHolder.AddView(ItemDescriptionlbl,ItemNamelbl";
__ref._infoholder.AddView((android.view.View)(__ref._itemdescriptionlbl.getObject()),(int) (__ref._itemnamelbl.getLeft()+__ref._itemnamelbl.getWidth()),__ref._itemnamelbl.getTop(),__c.PerXToCurrent((float) (50),ba),__ref._itemnamelbl.getHeight());
RDebugUtils.currentLine=4456494;
 //BA.debugLineNum = 4456494;BA.debugLine="InfoHolder.AddView(DescriptionContext,ItemDescrip";
__ref._infoholder.AddView((android.view.View)(__ref._descriptioncontext.getObject()),__ref._itemdescriptionlbl.getLeft(),(int) (__ref._itemdescriptionlbl.getTop()+__ref._itemdescriptionlbl.getHeight()),__c.PerXToCurrent((float) (50),ba),(int) (__c.PerYToCurrent((float) (18),ba)+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=4456495;
 //BA.debugLineNum = 4456495;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Private InfoHolder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Private ItemNamelbl,ItemDescriptionlbl,ItemPricel";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemdescriptionlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemplulbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemisdicontinuedlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Private ItemSupplierNamelbl,ItemSupplierPhone,Ite";
_itemsuppliernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemsupplierphone = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemisdicontinuedlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Private DescriptionContext As ScrollView";
_descriptioncontext = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Private DescriptionText As Label";
_descriptiontext = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="End Sub";
return "";
}
}