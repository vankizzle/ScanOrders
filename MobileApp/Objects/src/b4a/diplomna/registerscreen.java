package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class registerscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.registerscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.registerscreen.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _screenpnl = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlinfo1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlinfo2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlinfo3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _usernametxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _passwordtxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _emailtxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _firstnametxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _lastnametxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _phonetxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _citytxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _countrytxt = null;
public anywheresoftware.b4a.objects.EditTextWrapper _addresstxt = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnext0 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnext1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndone = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback0 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnback1 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public String  _initialize(b4a.diplomna.registerscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="pnlInfo1.Initialize(\"\")";
__ref._pnlinfo1.Initialize(ba,"");
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="pnlInfo2.Initialize(\"\")";
__ref._pnlinfo2.Initialize(ba,"");
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="pnlInfo3.Initialize(\"\")";
__ref._pnlinfo3.Initialize(ba,"");
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="usernametxt.Initialize(\"\")";
__ref._usernametxt.Initialize(ba,"");
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="passwordtxt.Initialize(\"\")";
__ref._passwordtxt.Initialize(ba,"");
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="emailtxt.Initialize(\"\")";
__ref._emailtxt.Initialize(ba,"");
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="firstnametxt.Initialize(\"\")";
__ref._firstnametxt.Initialize(ba,"");
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="lastnametxt.Initialize(\"\")";
__ref._lastnametxt.Initialize(ba,"");
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="phonetxt.Initialize(\"\")";
__ref._phonetxt.Initialize(ba,"");
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="citytxt.Initialize(\"\")";
__ref._citytxt.Initialize(ba,"");
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="countrytxt.Initialize(\"\")";
__ref._countrytxt.Initialize(ba,"");
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="addresstxt.Initialize(\"\")";
__ref._addresstxt.Initialize(ba,"");
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="btnNext0.Initialize(\"NextInfo\")";
__ref._btnnext0.Initialize(ba,"NextInfo");
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="btnNext1.Initialize(\"NextInfo1\")";
__ref._btnnext1.Initialize(ba,"NextInfo1");
RDebugUtils.currentLine=4849685;
 //BA.debugLineNum = 4849685;BA.debugLine="btnDone.Initialize(\"RegistrationDone\")";
__ref._btndone.Initialize(ba,"RegistrationDone");
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="btnBack0.Initialize(\"BackInfo\")";
__ref._btnback0.Initialize(ba,"BackInfo");
RDebugUtils.currentLine=4849687;
 //BA.debugLineNum = 4849687;BA.debugLine="btnBack1.Initialize(\"BackInfo1\")";
__ref._btnback1.Initialize(ba,"BackInfo1");
RDebugUtils.currentLine=4849689;
 //BA.debugLineNum = 4849689;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=4849690;
 //BA.debugLineNum = 4849690;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return null;
}
public String  _backinfo_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "backinfo_click"))
	 {return ((String) Debug.delegate(ba, "backinfo_click", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub BackInfo_Click";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="ShowInfo1";
__ref._showinfo1(null);
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public String  _showinfo1(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "showinfo1"))
	 {return ((String) Debug.delegate(ba, "showinfo1", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub ShowInfo1";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If pnlInfo2.Visible = False Then";
if (__ref._pnlinfo2.getVisible()==__c.False) { 
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="pnlInfo2.Visible = True";
__ref._pnlinfo2.setVisible(__c.True);
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="pnlInfo2.Enabled = True";
__ref._pnlinfo2.setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="pnlInfo2.Visible = False";
__ref._pnlinfo2.setVisible(__c.False);
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="pnlInfo2.Enabled = False";
__ref._pnlinfo2.setEnabled(__c.False);
 };
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="End Sub";
return "";
}
public String  _backinfo1_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "backinfo1_click"))
	 {return ((String) Debug.delegate(ba, "backinfo1_click", null));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub BackInfo1_Click";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="ShowInfo2";
__ref._showinfo2(null);
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public String  _showinfo2(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "showinfo2"))
	 {return ((String) Debug.delegate(ba, "showinfo2", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub ShowInfo2";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If pnlInfo3.Visible = False Then";
if (__ref._pnlinfo3.getVisible()==__c.False) { 
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="pnlInfo3.Visible = True";
__ref._pnlinfo3.setVisible(__c.True);
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="pnlInfo3.Enabled = True";
__ref._pnlinfo3.setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="pnlInfo3.Visible = False";
__ref._pnlinfo3.setVisible(__c.False);
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="pnlInfo3.Enabled = False";
__ref._pnlinfo3.setEnabled(__c.False);
 };
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo1(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildinfo1"))
	 {return ((String) Debug.delegate(ba, "buildinfo1", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub BuildInfo1";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="pnlInfo2.Color = Colors.white";
__ref._pnlinfo2.setColor(__c.Colors.White);
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="firstnametxt.Hint = \"First Name\"";
__ref._firstnametxt.setHint("First Name");
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="firstnametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._firstnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="firstnametxt.SingleLine = True";
__ref._firstnametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="lastnametxt.Hint = \"Last Name\"";
__ref._lastnametxt.setHint("Last Name");
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="lastnametxt.SingleLine = True";
__ref._lastnametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="lastnametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._lastnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="phonetxt.Hint = \"Phone\"";
__ref._phonetxt.setHint("Phone");
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="phonetxt.SingleLine = True";
__ref._phonetxt.setSingleLine(__c.True);
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="phonetxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._phonetxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="Support.ApplyViewStyle(firstnametxt,Colors.DarkGr";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._firstnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="Support.ApplyViewStyle(lastnametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._lastnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="Support.ApplyViewStyle(phonetxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._phonetxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="btnNext1.Text = \"Next\"";
__ref._btnnext1.setText(BA.ObjectToCharSequence("Next"));
RDebugUtils.currentLine=5046290;
 //BA.debugLineNum = 5046290;BA.debugLine="btnNext1.Gravity = Gravity.CENTER";
__ref._btnnext1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=5046291;
 //BA.debugLineNum = 5046291;BA.debugLine="Support.ApplyViewStyle(btnNext1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnnext1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5046292;
 //BA.debugLineNum = 5046292;BA.debugLine="btnBack0.Text = \"Back\"";
__ref._btnback0.setText(BA.ObjectToCharSequence("Back"));
RDebugUtils.currentLine=5046293;
 //BA.debugLineNum = 5046293;BA.debugLine="btnBack0.Gravity = Gravity.CENTER";
__ref._btnback0.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=5046294;
 //BA.debugLineNum = 5046294;BA.debugLine="Support.ApplyViewStyle(btnBack0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnback0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5046295;
 //BA.debugLineNum = 5046295;BA.debugLine="pnlInfo2.AddView(firstnametxt,0,0%y,UISizes.Login";
__ref._pnlinfo2.AddView((android.view.View)(__ref._firstnametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5046296;
 //BA.debugLineNum = 5046296;BA.debugLine="pnlInfo2.AddView(lastnametxt,firstnametxt.Left,fi";
__ref._pnlinfo2.AddView((android.view.View)(__ref._lastnametxt.getObject()),__ref._firstnametxt.getLeft(),(int) (__ref._firstnametxt.getTop()+__ref._firstnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5046297;
 //BA.debugLineNum = 5046297;BA.debugLine="pnlInfo2.AddView(phonetxt,lastnametxt.Left,lastna";
__ref._pnlinfo2.AddView((android.view.View)(__ref._phonetxt.getObject()),__ref._lastnametxt.getLeft(),(int) (__ref._lastnametxt.getTop()+__ref._lastnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5046298;
 //BA.debugLineNum = 5046298;BA.debugLine="pnlInfo2.AddView(btnNext1,UISizes.LoginScrDefault";
__ref._pnlinfo2.AddView((android.view.View)(__ref._btnnext1.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2),(int) (__ref._phonetxt.getTop()+__ref._phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5046299;
 //BA.debugLineNum = 5046299;BA.debugLine="pnlInfo2.AddView(btnBack0,phonetxt.left,phonetxt.";
__ref._pnlinfo2.AddView((android.view.View)(__ref._btnback0.getObject()),__ref._phonetxt.getLeft(),(int) (__ref._phonetxt.getTop()+__ref._phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5046301;
 //BA.debugLineNum = 5046301;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo2(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildinfo2"))
	 {return ((String) Debug.delegate(ba, "buildinfo2", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub BuildInfo2";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="pnlInfo3.Color = Colors.white";
__ref._pnlinfo3.setColor(__c.Colors.White);
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="citytxt.Hint = \"City\"";
__ref._citytxt.setHint("City");
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="citytxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._citytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="citytxt.SingleLine = True";
__ref._citytxt.setSingleLine(__c.True);
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="countrytxt.Hint = \"Country\"";
__ref._countrytxt.setHint("Country");
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="countrytxt.SingleLine = True";
__ref._countrytxt.setSingleLine(__c.True);
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="countrytxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._countrytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="addresstxt.Hint = \"Address\"";
__ref._addresstxt.setHint("Address");
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="addresstxt.SingleLine = True";
__ref._addresstxt.setSingleLine(__c.True);
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="addresstxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._addresstxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="Support.ApplyViewStyle(citytxt,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._citytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="Support.ApplyViewStyle(countrytxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._countrytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="Support.ApplyViewStyle(addresstxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._addresstxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5111825;
 //BA.debugLineNum = 5111825;BA.debugLine="btnDone.Text = \"Done\"";
__ref._btndone.setText(BA.ObjectToCharSequence("Done"));
RDebugUtils.currentLine=5111826;
 //BA.debugLineNum = 5111826;BA.debugLine="btnDone.Gravity = Gravity.CENTER";
__ref._btndone.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=5111827;
 //BA.debugLineNum = 5111827;BA.debugLine="Support.ApplyViewStyle(btnDone,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btndone.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5111828;
 //BA.debugLineNum = 5111828;BA.debugLine="btnBack1.Text = \"Back\"";
__ref._btnback1.setText(BA.ObjectToCharSequence("Back"));
RDebugUtils.currentLine=5111829;
 //BA.debugLineNum = 5111829;BA.debugLine="btnBack1.Gravity = Gravity.CENTER";
__ref._btnback1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=5111830;
 //BA.debugLineNum = 5111830;BA.debugLine="Support.ApplyViewStyle(btnBack1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnback1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=5111831;
 //BA.debugLineNum = 5111831;BA.debugLine="pnlInfo3.AddView(citytxt,0,0%y,UISizes.LoginScrDe";
__ref._pnlinfo3.AddView((android.view.View)(__ref._citytxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5111832;
 //BA.debugLineNum = 5111832;BA.debugLine="pnlInfo3.AddView(countrytxt,citytxt.Left,citytxt.";
__ref._pnlinfo3.AddView((android.view.View)(__ref._countrytxt.getObject()),__ref._citytxt.getLeft(),(int) (__ref._citytxt.getTop()+__ref._citytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5111833;
 //BA.debugLineNum = 5111833;BA.debugLine="pnlInfo3.AddView(addresstxt,countrytxt.Left,count";
__ref._pnlinfo3.AddView((android.view.View)(__ref._addresstxt.getObject()),__ref._countrytxt.getLeft(),(int) (__ref._countrytxt.getTop()+__ref._countrytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5111834;
 //BA.debugLineNum = 5111834;BA.debugLine="pnlInfo3.AddView(btnDone,UISizes.LoginScrDefaultW";
__ref._pnlinfo3.AddView((android.view.View)(__ref._btndone.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2),(int) (__ref._addresstxt.getTop()+__ref._addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5111835;
 //BA.debugLineNum = 5111835;BA.debugLine="pnlInfo3.AddView(btnBack1,addresstxt.left,address";
__ref._pnlinfo3.AddView((android.view.View)(__ref._btnback1.getObject()),__ref._addresstxt.getLeft(),(int) (__ref._addresstxt.getTop()+__ref._addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=5111837;
 //BA.debugLineNum = 5111837;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="ScreenPnl.Color = Colors.white";
__ref._screenpnl.setColor(__c.Colors.White);
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="usernametxt.Hint = \"Username\"";
__ref._usernametxt.setHint("Username");
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="usernametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._usernametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="usernametxt.SingleLine = True";
__ref._usernametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="passwordtxt.Hint = \"Password\"";
__ref._passwordtxt.setHint("Password");
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="passwordtxt.SingleLine = True";
__ref._passwordtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="passwordtxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._passwordtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="emailtxt.Hint = \"Email\"";
__ref._emailtxt.setHint("Email");
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="emailtxt.SingleLine = True";
__ref._emailtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="emailtxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._emailtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._usernametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=4980750;
 //BA.debugLineNum = 4980750;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._passwordtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="Support.ApplyViewStyle(emailtxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._emailtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="btnNext0.Text = \"Next\"";
__ref._btnnext0.setText(BA.ObjectToCharSequence("Next"));
RDebugUtils.currentLine=4980754;
 //BA.debugLineNum = 4980754;BA.debugLine="btnNext0.Gravity = Gravity.CENTER";
__ref._btnnext0.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4980755;
 //BA.debugLineNum = 4980755;BA.debugLine="Support.ApplyViewStyle(btnNext0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnnext0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=4980757;
 //BA.debugLineNum = 4980757;BA.debugLine="BuildInfo1";
__ref._buildinfo1(null);
RDebugUtils.currentLine=4980758;
 //BA.debugLineNum = 4980758;BA.debugLine="BuildInfo2";
__ref._buildinfo2(null);
RDebugUtils.currentLine=4980760;
 //BA.debugLineNum = 4980760;BA.debugLine="ScreenPnl.AddView(pnlInfo1,UISizes.LoginScrDefaul";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo1.getObject()),_uisizes._loginscrdefaultleft,__c.PerYToCurrent((float) (30),ba),_uisizes._loginscrdefaultwidth,(int) (_uisizes._edittextdefaultheight*4+__c.PerYToCurrent((float) (4),ba)));
RDebugUtils.currentLine=4980761;
 //BA.debugLineNum = 4980761;BA.debugLine="pnlInfo1.AddView(usernametxt,0,0%y,UISizes.LoginS";
__ref._pnlinfo1.AddView((android.view.View)(__ref._usernametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=4980762;
 //BA.debugLineNum = 4980762;BA.debugLine="pnlInfo1.AddView(passwordtxt,usernametxt.Left,use";
__ref._pnlinfo1.AddView((android.view.View)(__ref._passwordtxt.getObject()),__ref._usernametxt.getLeft(),(int) (__ref._usernametxt.getTop()+__ref._usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=4980763;
 //BA.debugLineNum = 4980763;BA.debugLine="pnlInfo1.AddView(emailtxt,passwordtxt.Left,passwo";
__ref._pnlinfo1.AddView((android.view.View)(__ref._emailtxt.getObject()),__ref._passwordtxt.getLeft(),(int) (__ref._passwordtxt.getTop()+__ref._passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=4980764;
 //BA.debugLineNum = 4980764;BA.debugLine="pnlInfo1.AddView(btnNext0,UISizes.LoginScrDefault";
__ref._pnlinfo1.AddView((android.view.View)(__ref._btnnext0.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2*0.50),(int) (__ref._emailtxt.getTop()+__ref._emailtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=4980766;
 //BA.debugLineNum = 4980766;BA.debugLine="ScreenPnl.AddView(pnlInfo2,pnlInfo1.Left,pnlInfo1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo2.getObject()),__ref._pnlinfo1.getLeft(),__ref._pnlinfo1.getTop(),__ref._pnlinfo1.getWidth(),__ref._pnlinfo1.getHeight());
RDebugUtils.currentLine=4980767;
 //BA.debugLineNum = 4980767;BA.debugLine="pnlInfo2.Visible = False";
__ref._pnlinfo2.setVisible(__c.False);
RDebugUtils.currentLine=4980768;
 //BA.debugLineNum = 4980768;BA.debugLine="pnlInfo2.Enabled = False";
__ref._pnlinfo2.setEnabled(__c.False);
RDebugUtils.currentLine=4980770;
 //BA.debugLineNum = 4980770;BA.debugLine="ScreenPnl.AddView(pnlInfo3,pnlInfo1.Left,pnlInfo1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo3.getObject()),__ref._pnlinfo1.getLeft(),__ref._pnlinfo1.getTop(),__ref._pnlinfo1.getWidth(),__ref._pnlinfo1.getHeight());
RDebugUtils.currentLine=4980771;
 //BA.debugLineNum = 4980771;BA.debugLine="pnlInfo3.Visible = False";
__ref._pnlinfo3.setVisible(__c.False);
RDebugUtils.currentLine=4980772;
 //BA.debugLineNum = 4980772;BA.debugLine="pnlInfo3.Enabled = False";
__ref._pnlinfo3.setEnabled(__c.False);
RDebugUtils.currentLine=4980773;
 //BA.debugLineNum = 4980773;BA.debugLine="End Sub";
return "";
}
public boolean  _checkformissingfields(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "checkformissingfields"))
	 {return ((Boolean) Debug.delegate(ba, "checkformissingfields", null));}
boolean _result = false;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub CheckForMissingFields As Boolean";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim result As Boolean = False";
_result = __c.False;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="If usernametxt.Text.Length > 0 Then";
if (__ref._usernametxt.getText().length()>0) { 
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="If passwordtxt.Text.Length > 0 Then";
if (__ref._passwordtxt.getText().length()>0) { 
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="If emailtxt.Text.Length > 0 Then";
if (__ref._emailtxt.getText().length()>0) { 
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="If firstnametxt.Text.Length > 0 Then";
if (__ref._firstnametxt.getText().length()>0) { 
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="If lastnametxt.Text.Length > 0 Then";
if (__ref._lastnametxt.getText().length()>0) { 
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="If phonetxt.Text.Length > 0 Then";
if (__ref._phonetxt.getText().length()>0) { 
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="If citytxt.Text.Length > 0 Then";
if (__ref._citytxt.getText().length()>0) { 
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="If countrytxt.Text.Length > 0 Then";
if (__ref._countrytxt.getText().length()>0) { 
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="If addresstxt.Text.Length > 0 Then";
if (__ref._addresstxt.getText().length()>0) { 
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="result = True";
_result = __c.True;
 };
 };
 };
 };
 };
 };
 };
 };
 };
RDebugUtils.currentLine=5636117;
 //BA.debugLineNum = 5636117;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=5636118;
 //BA.debugLineNum = 5636118;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Private pnlInfo1 As Panel";
_pnlinfo1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Private pnlInfo2 As Panel";
_pnlinfo2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Private pnlInfo3 As Panel";
_pnlinfo3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="Private emailtxt As EditText";
_emailtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Private firstnametxt As EditText";
_firstnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Private lastnametxt As EditText";
_lastnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="Private phonetxt As EditText";
_phonetxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="Private citytxt As EditText";
_citytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="Private countrytxt As EditText";
_countrytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="Private addresstxt As EditText";
_addresstxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="Private btnNext0,btnNext1,btnDone As Button";
_btnnext0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnnext1 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btndone = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4784149;
 //BA.debugLineNum = 4784149;BA.debugLine="Private btnBack0,btnBack1 As Button";
_btnback0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnback1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4784151;
 //BA.debugLineNum = 4784151;BA.debugLine="End Sub";
return "";
}
public String  _cleartextfields(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "cleartextfields"))
	 {return ((String) Debug.delegate(ba, "cleartextfields", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub ClearTextFields";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="usernametxt.Text = \"\"";
__ref._usernametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="passwordtxt.Text = \"\"";
__ref._passwordtxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="emailtxt.Text = \"\"";
__ref._emailtxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="firstnametxt.Text = \"\"";
__ref._firstnametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="lastnametxt.Text = \"\"";
__ref._lastnametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="phonetxt.Text = \"\"";
__ref._phonetxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="citytxt.Text = \"\"";
__ref._citytxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="countrytxt.Text = \"\"";
__ref._countrytxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5767177;
 //BA.debugLineNum = 5767177;BA.debugLine="addresstxt.Text = \"\"";
__ref._addresstxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "nextinfo_click"))
	 {return ((String) Debug.delegate(ba, "nextinfo_click", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub NextInfo_Click";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="ShowInfo1";
__ref._showinfo1(null);
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo1_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "nextinfo1_click"))
	 {return ((String) Debug.delegate(ba, "nextinfo1_click", null));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub NextInfo1_Click";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="ShowInfo2";
__ref._showinfo2(null);
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return "";
}
public String  _registrationdone_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "registrationdone_click"))
	 {return ((String) Debug.delegate(ba, "registrationdone_click", null));}
b4a.diplomna.types._customer _newcustomer = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub RegistrationDone_Click";
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Public NewCustomer As Customer";
_newcustomer = new b4a.diplomna.types._customer();
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="NewCustomer.Initialize";
_newcustomer.Initialize();
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="If CheckForMissingFields = True Then";
if (__ref._checkformissingfields(null)==__c.True) { 
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="NewCustomer.username = usernametxt.Text";
_newcustomer.username = __ref._usernametxt.getText();
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="NewCustomer.password = passwordtxt.Text";
_newcustomer.password = __ref._passwordtxt.getText();
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="NewCustomer.email = emailtxt.Text";
_newcustomer.email = __ref._emailtxt.getText();
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="NewCustomer.FirstName = firstnametxt.Text";
_newcustomer.FirstName = __ref._firstnametxt.getText();
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="NewCustomer.LastName = lastnametxt.Text";
_newcustomer.LastName = __ref._lastnametxt.getText();
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="NewCustomer.Phone = phonetxt.Text";
_newcustomer.Phone = __ref._phonetxt.getText();
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="NewCustomer.City = citytxt.Text";
_newcustomer.City = __ref._citytxt.getText();
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="NewCustomer.Country = countrytxt.Text";
_newcustomer.Country = __ref._countrytxt.getText();
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="NewCustomer.Address = addresstxt.Text";
_newcustomer.Address = __ref._addresstxt.getText();
RDebugUtils.currentLine=5570575;
 //BA.debugLineNum = 5570575;BA.debugLine="Log(\"successfully registered\")";
__c.Log("successfully registered");
RDebugUtils.currentLine=5570576;
 //BA.debugLineNum = 5570576;BA.debugLine="Log(NewCustomer)";
__c.Log(BA.ObjectToString(_newcustomer));
RDebugUtils.currentLine=5570577;
 //BA.debugLineNum = 5570577;BA.debugLine="ReturnToLoginScreen";
__ref._returntologinscreen(null);
RDebugUtils.currentLine=5570578;
 //BA.debugLineNum = 5570578;BA.debugLine="ClearTextFields";
__ref._cleartextfields(null);
 }else {
RDebugUtils.currentLine=5570580;
 //BA.debugLineNum = 5570580;BA.debugLine="Log(\"missing info\")";
__c.Log("missing info");
 };
RDebugUtils.currentLine=5570582;
 //BA.debugLineNum = 5570582;BA.debugLine="End Sub";
return "";
}
public String  _returntologinscreen(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "returntologinscreen"))
	 {return ((String) Debug.delegate(ba, "returntologinscreen", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub ReturnToLoginScreen";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRegisterScreen");
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return "";
}
public String  _sendinfotoapi(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "sendinfotoapi"))
	 {return ((String) Debug.delegate(ba, "sendinfotoapi", null));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub SendInfoToAPI";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
}