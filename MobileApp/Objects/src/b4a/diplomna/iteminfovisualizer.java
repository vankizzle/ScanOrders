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
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _setcurrentinfo(b4a.diplomna.iteminfovisualizer __ref,b4a.diplomna.types._good _g,b4a.diplomna.types._supplier _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "setcurrentinfo", false))
	 {return ((String) Debug.delegate(ba, "setcurrentinfo", new Object[] {_g,_s}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub SetCurrentInfo(g As Good,s As Supplier)";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="ItemNamelbl.Text = g.Name";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence(_g.Name));
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="If g.Is_Discontinued = 1 Then";
if (_g.Is_Discontinued==1) { 
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="ItemIsDicontinuedlbl.Text = \"Out of stock\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("Out of stock"));
 }else 
{RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="Else if  g.Is_Discontinued = 0 Then";
if (_g.Is_Discontinued==0) { 
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="ItemIsDicontinuedlbl.Text = \"In stock\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("In stock"));
 }}
;
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="ItemPLUlbl.Text = \"PLU:\" & g.PLU";
__ref._itemplulbl.setText(BA.ObjectToCharSequence("PLU:"+BA.NumberToString(_g.PLU)));
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier:\"& s.Supplie";
__ref._itemsuppliernamelbl.setText(BA.ObjectToCharSequence("Supplier:"+_s.SupplierName));
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="DescriptionText.Text = g.Description";
__ref._descriptiontext.setText(BA.ObjectToCharSequence(_g.Description));
RDebugUtils.currentLine=7929868;
 //BA.debugLineNum = 7929868;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Return InfoHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._infoholder.getObject()));
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.iteminfovisualizer __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="ItemNamelbl.Initialize(\"\")";
__ref._itemnamelbl.Initialize(ba,"");
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="ItemDescriptionlbl.Initialize(\"\")";
__ref._itemdescriptionlbl.Initialize(ba,"");
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="ItemPricelbl.Initialize(\"\")";
__ref._itempricelbl.Initialize(ba,"");
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="ItemQttylbl.Initialize(\"\")";
__ref._itemqttylbl.Initialize(ba,"");
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="ItemIsDicontinuedlbl.Initialize(\"\")";
__ref._itemisdicontinuedlbl.Initialize(ba,"");
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="ItemPLUlbl.Initialize(\"\")";
__ref._itemplulbl.Initialize(ba,"");
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="ItemSupplierNamelbl.Initialize(\"\")";
__ref._itemsuppliernamelbl.Initialize(ba,"");
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="ItemSupplierPhone.Initialize(\"\")";
__ref._itemsupplierphone.Initialize(ba,"");
RDebugUtils.currentLine=7733262;
 //BA.debugLineNum = 7733262;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="DescriptionContext.Initialize(20%y)";
__ref._descriptioncontext.Initialize(ba,__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="DescriptionText.Initialize(\"\")";
__ref._descriptiontext.Initialize(ba,"");
RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="BuildInfoUI";
__ref._buildinfoui(null);
RDebugUtils.currentLine=7733267;
 //BA.debugLineNum = 7733267;BA.debugLine="End Sub";
return "";
}
public String  _buildinfoui(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "buildinfoui", false))
	 {return ((String) Debug.delegate(ba, "buildinfoui", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub BuildInfoUI";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
__ref._infoholder.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
__ref._itemnamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
__ref._itemnamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="ItemNamelbl.TextSize = 20";
__ref._itemnamelbl.setTextSize((float) (20));
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="ItemNamelbl.Text = \"TEST\"";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence("TEST"));
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="ItemDescriptionlbl.Gravity = Gravity.CENTER";
__ref._itemdescriptionlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="ItemDescriptionlbl.TextColor = Colors.White";
__ref._itemdescriptionlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="ItemDescriptionlbl.Text = \"Description\"";
__ref._itemdescriptionlbl.setText(BA.ObjectToCharSequence("Description"));
RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="ItemDescriptionlbl.TextSize = 25";
__ref._itemdescriptionlbl.setTextSize((float) (25));
RDebugUtils.currentLine=7798799;
 //BA.debugLineNum = 7798799;BA.debugLine="ItemIsDicontinuedlbl.Gravity = Gravity.CENTER";
__ref._itemisdicontinuedlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="ItemIsDicontinuedlbl.TextColor = Colors.White";
__ref._itemisdicontinuedlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7798802;
 //BA.debugLineNum = 7798802;BA.debugLine="ItemIsDicontinuedlbl.Text = \"In Stock\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("In Stock"));
RDebugUtils.currentLine=7798803;
 //BA.debugLineNum = 7798803;BA.debugLine="ItemIsDicontinuedlbl.TextSize = 20";
__ref._itemisdicontinuedlbl.setTextSize((float) (20));
RDebugUtils.currentLine=7798805;
 //BA.debugLineNum = 7798805;BA.debugLine="ItemPLUlbl.Gravity = Gravity.CENTER";
__ref._itemplulbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7798806;
 //BA.debugLineNum = 7798806;BA.debugLine="ItemPLUlbl.TextColor = Colors.White";
__ref._itemplulbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7798807;
 //BA.debugLineNum = 7798807;BA.debugLine="ItemPLUlbl.Text = \"PLU:\" & 555";
__ref._itemplulbl.setText(BA.ObjectToCharSequence("PLU:"+BA.NumberToString(555)));
RDebugUtils.currentLine=7798810;
 //BA.debugLineNum = 7798810;BA.debugLine="ItemSupplierNamelbl.Gravity = Gravity.CENTER";
__ref._itemsuppliernamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7798811;
 //BA.debugLineNum = 7798811;BA.debugLine="ItemSupplierNamelbl.TextColor = Colors.White";
__ref._itemsuppliernamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7798812;
 //BA.debugLineNum = 7798812;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier:\" & \"BILLA\"";
__ref._itemsuppliernamelbl.setText(BA.ObjectToCharSequence("Supplier:"+"BILLA"));
RDebugUtils.currentLine=7798813;
 //BA.debugLineNum = 7798813;BA.debugLine="ItemSupplierNamelbl.TextSize = 20";
__ref._itemsuppliernamelbl.setTextSize((float) (20));
RDebugUtils.currentLine=7798818;
 //BA.debugLineNum = 7798818;BA.debugLine="DescriptionText.Initialize(\"\")";
__ref._descriptiontext.Initialize(ba,"");
RDebugUtils.currentLine=7798819;
 //BA.debugLineNum = 7798819;BA.debugLine="DescriptionText.Color = Colors.Transparent";
__ref._descriptiontext.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=7798820;
 //BA.debugLineNum = 7798820;BA.debugLine="DescriptionText.Textcolor = Colors.White";
__ref._descriptiontext.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=7798821;
 //BA.debugLineNum = 7798821;BA.debugLine="DescriptionText.Gravity = Gravity.CENTER";
__ref._descriptiontext.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7798822;
 //BA.debugLineNum = 7798822;BA.debugLine="DescriptionText.TextSize = 14";
__ref._descriptiontext.setTextSize((float) (14));
RDebugUtils.currentLine=7798823;
 //BA.debugLineNum = 7798823;BA.debugLine="DescriptionContext.Panel.AddView(DescriptionText,";
__ref._descriptioncontext.getPanel().AddView((android.view.View)(__ref._descriptiontext.getObject()),(int) (0),(int) (0),__ref._descriptioncontext.getPanel().getWidth(),__ref._descriptioncontext.getPanel().getHeight());
RDebugUtils.currentLine=7798825;
 //BA.debugLineNum = 7798825;BA.debugLine="InfoHolder.AddView(ItemNamelbl,0,0,40%x,6%y)";
__ref._infoholder.AddView((android.view.View)(__ref._itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (6),ba));
RDebugUtils.currentLine=7798826;
 //BA.debugLineNum = 7798826;BA.debugLine="InfoHolder.AddView(ItemSupplierNamelbl,ItemNamelb";
__ref._infoholder.AddView((android.view.View)(__ref._itemsuppliernamelbl.getObject()),__ref._itemnamelbl.getLeft(),(int) (__ref._itemnamelbl.getTop()+__ref._itemnamelbl.getHeight()),__ref._itemnamelbl.getWidth(),__ref._itemnamelbl.getHeight());
RDebugUtils.currentLine=7798827;
 //BA.debugLineNum = 7798827;BA.debugLine="InfoHolder.AddView(ItemPLUlbl,ItemSupplierNamelbl";
__ref._infoholder.AddView((android.view.View)(__ref._itemplulbl.getObject()),__ref._itemsuppliernamelbl.getLeft(),(int) (__ref._itemsuppliernamelbl.getTop()+__ref._itemsuppliernamelbl.getHeight()),__ref._itemsuppliernamelbl.getWidth(),__ref._itemsuppliernamelbl.getHeight());
RDebugUtils.currentLine=7798828;
 //BA.debugLineNum = 7798828;BA.debugLine="InfoHolder.AddView(ItemIsDicontinuedlbl,ItemPLUlb";
__ref._infoholder.AddView((android.view.View)(__ref._itemisdicontinuedlbl.getObject()),__ref._itemplulbl.getLeft(),(int) (__ref._itemplulbl.getTop()+__ref._itemplulbl.getHeight()),__ref._itemplulbl.getWidth(),(int) (__ref._itemplulbl.getHeight()+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=7798829;
 //BA.debugLineNum = 7798829;BA.debugLine="InfoHolder.AddView(ItemDescriptionlbl,ItemNamelbl";
__ref._infoholder.AddView((android.view.View)(__ref._itemdescriptionlbl.getObject()),(int) (__ref._itemnamelbl.getLeft()+__ref._itemnamelbl.getWidth()),__ref._itemnamelbl.getTop(),__c.PerXToCurrent((float) (50),ba),__ref._itemnamelbl.getHeight());
RDebugUtils.currentLine=7798830;
 //BA.debugLineNum = 7798830;BA.debugLine="InfoHolder.AddView(DescriptionContext,ItemDescrip";
__ref._infoholder.AddView((android.view.View)(__ref._descriptioncontext.getObject()),__ref._itemdescriptionlbl.getLeft(),(int) (__ref._itemdescriptionlbl.getTop()+__ref._itemdescriptionlbl.getHeight()),__c.PerXToCurrent((float) (50),ba),(int) (__c.PerYToCurrent((float) (18),ba)+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=7798831;
 //BA.debugLineNum = 7798831;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Private InfoHolder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Private ItemNamelbl,ItemDescriptionlbl,ItemPricel";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemdescriptionlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemplulbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemisdicontinuedlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="Private ItemSupplierNamelbl,ItemSupplierPhone,Ite";
_itemsuppliernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemsupplierphone = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemisdicontinuedlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="Private DescriptionContext As ScrollView";
_descriptioncontext = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="Private DescriptionText As Label";
_descriptiontext = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="End Sub";
return "";
}
}