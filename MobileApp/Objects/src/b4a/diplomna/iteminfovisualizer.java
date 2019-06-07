package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class iteminfovisualizer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.iteminfovisualizer");
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
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 82;BA.debugLine="Return InfoHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_infoholder.getObject()));
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public String  _buildinfoui() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub BuildInfoUI";
 //BA.debugLineNum = 32;BA.debugLine="InfoHolder.Color = Colors.DarkGray";
_infoholder.setColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 34;BA.debugLine="ItemNamelbl.Gravity = Gravity.CENTER";
_itemnamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 35;BA.debugLine="ItemNamelbl.TextColor = Colors.White";
_itemnamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 36;BA.debugLine="ItemNamelbl.TextSize = 20";
_itemnamelbl.setTextSize((float) (20));
 //BA.debugLineNum = 37;BA.debugLine="ItemNamelbl.Text = \"Name\"";
_itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
 //BA.debugLineNum = 40;BA.debugLine="ItemDescriptionlbl.Gravity = Gravity.CENTER";
_itemdescriptionlbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 41;BA.debugLine="ItemDescriptionlbl.TextColor = Colors.White";
_itemdescriptionlbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 43;BA.debugLine="ItemDescriptionlbl.Text = \"Description\"";
_itemdescriptionlbl.setText(BA.ObjectToCharSequence("Description"));
 //BA.debugLineNum = 44;BA.debugLine="ItemDescriptionlbl.TextSize = 20";
_itemdescriptionlbl.setTextSize((float) (20));
 //BA.debugLineNum = 46;BA.debugLine="ItemIsDicontinuedlbl.Gravity = Gravity.CENTER";
_itemisdicontinuedlbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 47;BA.debugLine="ItemIsDicontinuedlbl.TextColor = Colors.White";
_itemisdicontinuedlbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 49;BA.debugLine="ItemIsDicontinuedlbl.Text = \"-\"";
_itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("-"));
 //BA.debugLineNum = 50;BA.debugLine="ItemIsDicontinuedlbl.TextSize = 18";
_itemisdicontinuedlbl.setTextSize((float) (18));
 //BA.debugLineNum = 52;BA.debugLine="ItemPLUlbl.Gravity = Gravity.CENTER";
_itemplulbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 53;BA.debugLine="ItemPLUlbl.TextColor = Colors.White";
_itemplulbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 54;BA.debugLine="ItemPLUlbl.Text = \"PLU:\"";
_itemplulbl.setText(BA.ObjectToCharSequence("PLU:"));
 //BA.debugLineNum = 57;BA.debugLine="ItemSupplierNamelbl.Gravity = Gravity.CENTER";
_itemsuppliernamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 58;BA.debugLine="ItemSupplierNamelbl.TextColor = Colors.White";
_itemsuppliernamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 59;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier\"";
_itemsuppliernamelbl.setText(BA.ObjectToCharSequence("Supplier"));
 //BA.debugLineNum = 60;BA.debugLine="ItemSupplierNamelbl.TextSize = 16";
_itemsuppliernamelbl.setTextSize((float) (16));
 //BA.debugLineNum = 65;BA.debugLine="DescriptionText.Initialize(\"\")";
_descriptiontext.Initialize(ba,"");
 //BA.debugLineNum = 66;BA.debugLine="DescriptionText.Color = Colors.Transparent";
_descriptiontext.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 67;BA.debugLine="DescriptionText.Textcolor = Colors.White";
_descriptiontext.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 68;BA.debugLine="DescriptionText.Gravity = Gravity.FILL";
_descriptiontext.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 69;BA.debugLine="DescriptionText.Enabled = False";
_descriptiontext.setEnabled(__c.False);
 //BA.debugLineNum = 70;BA.debugLine="DescriptionText.TextSize = 14";
_descriptiontext.setTextSize((float) (14));
 //BA.debugLineNum = 71;BA.debugLine="DescriptionContext.Panel.AddView(DescriptionText,";
_descriptioncontext.getPanel().AddView((android.view.View)(_descriptiontext.getObject()),(int) (0),(int) (0),_descriptioncontext.getPanel().getWidth(),_descriptioncontext.getPanel().getHeight());
 //BA.debugLineNum = 73;BA.debugLine="InfoHolder.AddView(ItemNamelbl,0,0,40%x,5%y)";
_infoholder.AddView((android.view.View)(_itemnamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 74;BA.debugLine="InfoHolder.AddView(ItemSupplierNamelbl,ItemNamelb";
_infoholder.AddView((android.view.View)(_itemsuppliernamelbl.getObject()),_itemnamelbl.getLeft(),(int) (_itemnamelbl.getTop()+_itemnamelbl.getHeight()),_itemnamelbl.getWidth(),_itemnamelbl.getHeight());
 //BA.debugLineNum = 75;BA.debugLine="InfoHolder.AddView(ItemPLUlbl,ItemSupplierNamelbl";
_infoholder.AddView((android.view.View)(_itemplulbl.getObject()),_itemsuppliernamelbl.getLeft(),(int) (_itemsuppliernamelbl.getTop()+_itemsuppliernamelbl.getHeight()),_itemsuppliernamelbl.getWidth(),_itemsuppliernamelbl.getHeight());
 //BA.debugLineNum = 76;BA.debugLine="InfoHolder.AddView(ItemIsDicontinuedlbl,ItemPLUlb";
_infoholder.AddView((android.view.View)(_itemisdicontinuedlbl.getObject()),_itemplulbl.getLeft(),(int) (_itemplulbl.getTop()+_itemplulbl.getHeight()),_itemplulbl.getWidth(),(int) (_itemplulbl.getHeight()+__c.DipToCurrent((int) (3))));
 //BA.debugLineNum = 77;BA.debugLine="InfoHolder.AddView(ItemDescriptionlbl,ItemNamelbl";
_infoholder.AddView((android.view.View)(_itemdescriptionlbl.getObject()),(int) (_itemnamelbl.getLeft()+_itemnamelbl.getWidth()),_itemnamelbl.getTop(),__c.PerXToCurrent((float) (50),ba),_itemnamelbl.getHeight());
 //BA.debugLineNum = 78;BA.debugLine="InfoHolder.AddView(DescriptionContext,ItemDescrip";
_infoholder.AddView((android.view.View)(_descriptioncontext.getObject()),_itemdescriptionlbl.getLeft(),(int) (_itemdescriptionlbl.getTop()+_itemdescriptionlbl.getHeight()),__c.PerXToCurrent((float) (50),ba),(int) (__c.PerYToCurrent((float) (18),ba)+__c.DipToCurrent((int) (3))));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private InfoHolder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private ItemNamelbl,ItemDescriptionlbl,ItemPricel";
_itemnamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemdescriptionlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemplulbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemisdicontinuedlbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private ItemSupplierNamelbl,ItemSupplierPhone,Ite";
_itemsuppliernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemsupplierphone = new anywheresoftware.b4a.objects.LabelWrapper();
_itempricelbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemqttylbl = new anywheresoftware.b4a.objects.LabelWrapper();
_itemisdicontinuedlbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private DescriptionContext As ScrollView";
_descriptioncontext = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private DescriptionText As EditText";
_descriptiontext = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _clearinfo() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub ClearInfo";
 //BA.debugLineNum = 102;BA.debugLine="ItemNamelbl.Text = \"Name\"";
_itemnamelbl.setText(BA.ObjectToCharSequence("Name"));
 //BA.debugLineNum = 103;BA.debugLine="DescriptionText.Text = \"\"";
_descriptiontext.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 104;BA.debugLine="ItemIsDicontinuedlbl.Text = \"-\"";
_itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("-"));
 //BA.debugLineNum = 105;BA.debugLine="ItemPLUlbl.Text = \"PLU:\"";
_itemplulbl.setText(BA.ObjectToCharSequence("PLU:"));
 //BA.debugLineNum = 106;BA.debugLine="ItemSupplierNamelbl.Text = \"Supplier:\"";
_itemsuppliernamelbl.setText(BA.ObjectToCharSequence("Supplier:"));
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 12;BA.debugLine="InfoHolder.Initialize(\"\")";
_infoholder.Initialize(ba,"");
 //BA.debugLineNum = 14;BA.debugLine="ItemNamelbl.Initialize(\"\")";
_itemnamelbl.Initialize(ba,"");
 //BA.debugLineNum = 15;BA.debugLine="ItemDescriptionlbl.Initialize(\"\")";
_itemdescriptionlbl.Initialize(ba,"");
 //BA.debugLineNum = 16;BA.debugLine="ItemPricelbl.Initialize(\"\")";
_itempricelbl.Initialize(ba,"");
 //BA.debugLineNum = 17;BA.debugLine="ItemQttylbl.Initialize(\"\")";
_itemqttylbl.Initialize(ba,"");
 //BA.debugLineNum = 18;BA.debugLine="ItemIsDicontinuedlbl.Initialize(\"\")";
_itemisdicontinuedlbl.Initialize(ba,"");
 //BA.debugLineNum = 19;BA.debugLine="ItemPLUlbl.Initialize(\"\")";
_itemplulbl.Initialize(ba,"");
 //BA.debugLineNum = 21;BA.debugLine="ItemSupplierNamelbl.Initialize(\"\")";
_itemsuppliernamelbl.Initialize(ba,"");
 //BA.debugLineNum = 22;BA.debugLine="ItemSupplierPhone.Initialize(\"\")";
_itemsupplierphone.Initialize(ba,"");
 //BA.debugLineNum = 24;BA.debugLine="InfoHolder.Initialize(\"\")";
_infoholder.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="DescriptionContext.Initialize(20%y)";
_descriptioncontext.Initialize(ba,__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 26;BA.debugLine="DescriptionText.Initialize(\"\")";
_descriptiontext.Initialize(ba,"");
 //BA.debugLineNum = 28;BA.debugLine="BuildInfoUI";
_buildinfoui();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentinfo(b4a.diplomna.types._good _g,b4a.diplomna.types._supplier _s) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub SetCurrentInfo(g As Good,s As Supplier)";
 //BA.debugLineNum = 86;BA.debugLine="ItemNamelbl.Text = g.Name";
_itemnamelbl.setText(BA.ObjectToCharSequence(_g.Name));
 //BA.debugLineNum = 87;BA.debugLine="If g.Is_Discontinued = 1 Then";
if (_g.Is_Discontinued==1) { 
 //BA.debugLineNum = 88;BA.debugLine="ItemIsDicontinuedlbl.Text = \"Out of stock\"";
_itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("Out of stock"));
 //BA.debugLineNum = 89;BA.debugLine="ItemIsDicontinuedlbl.TextColor = Colors.Red";
_itemisdicontinuedlbl.setTextColor(__c.Colors.Red);
 }else if(_g.Is_Discontinued==0) { 
 //BA.debugLineNum = 91;BA.debugLine="ItemIsDicontinuedlbl.Text = \"In stock\"";
_itemisdicontinuedlbl.setText(BA.ObjectToCharSequence("In stock"));
 //BA.debugLineNum = 92;BA.debugLine="ItemIsDicontinuedlbl.TextColor = Colors.Green";
_itemisdicontinuedlbl.setTextColor(__c.Colors.Green);
 };
 //BA.debugLineNum = 95;BA.debugLine="ItemPLUlbl.Text = \"PLU:\" & g.PLU";
_itemplulbl.setText(BA.ObjectToCharSequence("PLU:"+BA.NumberToString(_g.PLU)));
 //BA.debugLineNum = 97;BA.debugLine="ItemSupplierNamelbl.Text = s.SupplierName";
_itemsuppliernamelbl.setText(BA.ObjectToCharSequence(_s.SupplierName));
 //BA.debugLineNum = 98;BA.debugLine="DescriptionText.Text = g.Description";
_descriptiontext.setText(BA.ObjectToCharSequence(_g.Description));
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
