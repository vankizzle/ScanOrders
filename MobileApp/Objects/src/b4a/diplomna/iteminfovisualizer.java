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
public anywheresoftware.b4a.objects.EditTextWrapper _descriptiontext = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _clearinfo(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "clearinfo", false))
	 {return ((String) Debug.delegate(ba, "clearinfo", null));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub ClearInfo";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="ItemNamelbl.Text = \"Name\"";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="DescriptionText.Text = \"\"";
__ref._descriptiontext.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="ItemIsDicontinuedlbl.Text = \"-\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="ItemPLUlbl.Text = \"PLU:\"";
__ref._itemplulbl.setText(BA.ObjectToCharSequence("PLU:"));
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier:\"";
__ref._itemsuppliernamelbl.setText(BA.ObjectToCharSequence("Supplier:"));
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentinfo(b4a.diplomna.iteminfovisualizer __ref,b4a.diplomna.types._good _g,b4a.diplomna.types._supplier _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "setcurrentinfo", false))
	 {return ((String) Debug.delegate(ba, "setcurrentinfo", new Object[] {_g,_s}));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Public Sub SetCurrentInfo(g As Good,s As Supplier)";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="ItemNamelbl.Text = g.Name";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence(_g.Name));
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="If g.Is_Discontinued = 1 Then";
if (_g.Is_Discontinued==1) { 
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="ItemIsDicontinuedlbl.Text = \"Out of stock\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("Out of stock"));
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="ItemIsDicontinuedlbl.TextColor = Colors.Red";
__ref._itemisdicontinuedlbl.setTextColor(__c.Colors.Red);
 }else 
{RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Else if  g.Is_Discontinued = 0 Then";
if (_g.Is_Discontinued==0) { 
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="ItemIsDicontinuedlbl.Text = \"In stock\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("In stock"));
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="ItemIsDicontinuedlbl.TextColor = Colors.Green";
__ref._itemisdicontinuedlbl.setTextColor(__c.Colors.Green);
 }}
;
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="ItemPLUlbl.Text = \"PLU:\" & g.PLU";
__ref._itemplulbl.setText(BA.ObjectToCharSequence("PLU:"+BA.NumberToString(_g.PLU)));
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="ItemSupplierNamelbl.Text = s.SupplierName";
__ref._itemsuppliernamelbl.setText(BA.ObjectToCharSequence(_s.SupplierName));
RDebugUtils.currentLine=9961485;
 //BA.debugLineNum = 9961485;BA.debugLine="DescriptionText.Text = g.Description";
__ref._descriptiontext.setText(BA.ObjectToCharSequence(_g.Description));
RDebugUtils.currentLine=9961486;
 //BA.debugLineNum = 9961486;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Return InfoHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._infoholder.getObject()));
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.diplomna.iteminfovisualizer __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="ItemNamelbl.Initialize(\"\")";
__ref._itemnamelbl.Initialize(ba,"");
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="ItemDescriptionlbl.Initialize(\"\")";
__ref._itemdescriptionlbl.Initialize(ba,"");
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="ItemPricelbl.Initialize(\"\")";
__ref._itempricelbl.Initialize(ba,"");
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="ItemQttylbl.Initialize(\"\")";
__ref._itemqttylbl.Initialize(ba,"");
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="ItemIsDicontinuedlbl.Initialize(\"\")";
__ref._itemisdicontinuedlbl.Initialize(ba,"");
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="ItemPLUlbl.Initialize(\"\")";
__ref._itemplulbl.Initialize(ba,"");
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="ItemSupplierNamelbl.Initialize(\"\")";
__ref._itemsuppliernamelbl.Initialize(ba,"");
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="ItemSupplierPhone.Initialize(\"\")";
__ref._itemsupplierphone.Initialize(ba,"");
RDebugUtils.currentLine=9764878;
 //BA.debugLineNum = 9764878;BA.debugLine="InfoHolder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=9764879;
 //BA.debugLineNum = 9764879;BA.debugLine="DescriptionContext.Initialize(20%y)";
__ref._descriptioncontext.Initialize(ba,__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=9764880;
 //BA.debugLineNum = 9764880;BA.debugLine="DescriptionText.Initialize(\"\")";
__ref._descriptiontext.Initialize(ba,"");
RDebugUtils.currentLine=9764882;
 //BA.debugLineNum = 9764882;BA.debugLine="BuildInfoUI";
__ref._buildinfoui(null);
RDebugUtils.currentLine=9764883;
 //BA.debugLineNum = 9764883;BA.debugLine="End Sub";
return "";
}
public String  _buildinfoui(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
if (Debug.shouldDelegate(ba, "buildinfoui", false))
	 {return ((String) Debug.delegate(ba, "buildinfoui", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub BuildInfoUI";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
__ref._infoholder.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
__ref._itemnamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
__ref._itemnamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="ItemNamelbl.TextSize = 20";
__ref._itemnamelbl.setTextSize((float) (20));
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="ItemNamelbl.Text = \"Name\"";
__ref._itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
RDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="ItemDescriptionlbl.Gravity = Gravity.CENTER";
__ref._itemdescriptionlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="ItemDescriptionlbl.TextColor = Colors.White";
__ref._itemdescriptionlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=9830412;
 //BA.debugLineNum = 9830412;BA.debugLine="ItemDescriptionlbl.Text = \"Description\"";
__ref._itemdescriptionlbl.setText(BA.ObjectToCharSequence("Description"));
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="ItemDescriptionlbl.TextSize = 20";
__ref._itemdescriptionlbl.setTextSize((float) (20));
RDebugUtils.currentLine=9830415;
 //BA.debugLineNum = 9830415;BA.debugLine="ItemIsDicontinuedlbl.Gravity = Gravity.CENTER";
__ref._itemisdicontinuedlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=9830416;
 //BA.debugLineNum = 9830416;BA.debugLine="ItemIsDicontinuedlbl.TextColor = Colors.White";
__ref._itemisdicontinuedlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=9830418;
 //BA.debugLineNum = 9830418;BA.debugLine="ItemIsDicontinuedlbl.Text = \"-\"";
__ref._itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=9830419;
 //BA.debugLineNum = 9830419;BA.debugLine="ItemIsDicontinuedlbl.TextSize = 18";
__ref._itemisdicontinuedlbl.setTextSize((float) (18));
RDebugUtils.currentLine=9830421;
 //BA.debugLineNum = 9830421;BA.debugLine="ItemPLUlbl.Gravity = Gravity.CENTER";
__ref._itemplulbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=9830422;
 //BA.debugLineNum = 9830422;BA.debugLine="ItemPLUlbl.TextColor = Colors.White";
__ref._itemplulbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=9830423;
 //BA.debugLineNum = 9830423;BA.debugLine="ItemPLUlbl.Text = \"PLU:\"";
__ref._itemplulbl.setText(BA.ObjectToCharSequence("PLU:"));
RDebugUtils.currentLine=9830426;
 //BA.debugLineNum = 9830426;BA.debugLine="ItemSupplierNamelbl.Gravity = Gravity.CENTER";
__ref._itemsuppliernamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=9830427;
 //BA.debugLineNum = 9830427;BA.debugLine="ItemSupplierNamelbl.TextColor = Colors.White";
__ref._itemsuppliernamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=9830428;
 //BA.debugLineNum = 9830428;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier\"";
__ref._itemsuppliernamelbl.setText(BA.ObjectToCharSequence("Supplier"));
RDebugUtils.currentLine=9830429;
 //BA.debugLineNum = 9830429;BA.debugLine="ItemSupplierNamelbl.TextSize = 16";
__ref._itemsuppliernamelbl.setTextSize((float) (16));
RDebugUtils.currentLine=9830434;
 //BA.debugLineNum = 9830434;BA.debugLine="DescriptionText.Initialize(\"\")";
__ref._descriptiontext.Initialize(ba,"");
RDebugUtils.currentLine=9830435;
 //BA.debugLineNum = 9830435;BA.debugLine="DescriptionText.Color = Colors.Transparent";
__ref._descriptiontext.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=9830436;
 //BA.debugLineNum = 9830436;BA.debugLine="DescriptionText.Textcolor = Colors.White";
__ref._descriptiontext.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=9830437;
 //BA.debugLineNum = 9830437;BA.debugLine="DescriptionText.Gravity = Gravity.FILL";
__ref._descriptiontext.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=9830438;
 //BA.debugLineNum = 9830438;BA.debugLine="DescriptionText.Enabled = False";
__ref._descriptiontext.setEnabled(__c.False);
RDebugUtils.currentLine=9830439;
 //BA.debugLineNum = 9830439;BA.debugLine="DescriptionText.TextSize = 14";
__ref._descriptiontext.setTextSize((float) (14));
RDebugUtils.currentLine=9830440;
 //BA.debugLineNum = 9830440;BA.debugLine="DescriptionContext.Panel.AddView(DescriptionText,";
__ref._descriptioncontext.getPanel().AddView((android.view.View)(__ref._descriptiontext.getObject()),(int) (0),(int) (0),__ref._descriptioncontext.getPanel().getWidth(),__ref._descriptioncontext.getPanel().getHeight());
RDebugUtils.currentLine=9830442;
 //BA.debugLineNum = 9830442;BA.debugLine="InfoHolder.AddView(ItemNamelbl,0,0,40%x,5%y)";
__ref._infoholder.AddView((android.view.View)(__ref._itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=9830443;
 //BA.debugLineNum = 9830443;BA.debugLine="InfoHolder.AddView(ItemSupplierNamelbl,ItemNamelb";
__ref._infoholder.AddView((android.view.View)(__ref._itemsuppliernamelbl.getObject()),__ref._itemnamelbl.getLeft(),(int) (__ref._itemnamelbl.getTop()+__ref._itemnamelbl.getHeight()),__ref._itemnamelbl.getWidth(),__ref._itemnamelbl.getHeight());
RDebugUtils.currentLine=9830444;
 //BA.debugLineNum = 9830444;BA.debugLine="InfoHolder.AddView(ItemPLUlbl,ItemSupplierNamelbl";
__ref._infoholder.AddView((android.view.View)(__ref._itemplulbl.getObject()),__ref._itemsuppliernamelbl.getLeft(),(int) (__ref._itemsuppliernamelbl.getTop()+__ref._itemsuppliernamelbl.getHeight()),__ref._itemsuppliernamelbl.getWidth(),__ref._itemsuppliernamelbl.getHeight());
RDebugUtils.currentLine=9830445;
 //BA.debugLineNum = 9830445;BA.debugLine="InfoHolder.AddView(ItemIsDicontinuedlbl,ItemPLUlb";
__ref._infoholder.AddView((android.view.View)(__ref._itemisdicontinuedlbl.getObject()),__ref._itemplulbl.getLeft(),(int) (__ref._itemplulbl.getTop()+__ref._itemplulbl.getHeight()),__ref._itemplulbl.getWidth(),(int) (__ref._itemplulbl.getHeight()+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=9830446;
 //BA.debugLineNum = 9830446;BA.debugLine="InfoHolder.AddView(ItemDescriptionlbl,ItemNamelbl";
__ref._infoholder.AddView((android.view.View)(__ref._itemdescriptionlbl.getObject()),(int) (__ref._itemnamelbl.getLeft()+__ref._itemnamelbl.getWidth()),__ref._itemnamelbl.getTop(),__c.PerXToCurrent((float) (50),ba),__ref._itemnamelbl.getHeight());
RDebugUtils.currentLine=9830447;
 //BA.debugLineNum = 9830447;BA.debugLine="InfoHolder.AddView(DescriptionContext,ItemDescrip";
__ref._infoholder.AddView((android.view.View)(__ref._descriptioncontext.getObject()),__ref._itemdescriptionlbl.getLeft(),(int) (__ref._itemdescriptionlbl.getTop()+__ref._itemdescriptionlbl.getHeight()),__c.PerXToCurrent((float) (50),ba),(int) (__c.PerYToCurrent((float) (18),ba)+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=9830448;
 //BA.debugLineNum = 9830448;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.iteminfovisualizer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="iteminfovisualizer";
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Private InfoHolder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Private ItemNamelbl,ItemDescriptionlbl,ItemPricel";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemdescriptionlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemplulbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemisdicontinuedlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Private ItemSupplierNamelbl,ItemSupplierPhone,Ite";
_itemsuppliernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemsupplierphone = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemisdicontinuedlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="Private DescriptionContext As ScrollView";
_descriptioncontext = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Private DescriptionText As EditText";
_descriptiontext = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="End Sub";
return "";
}
}