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
public b4a.diplomna.main _main = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.registerscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="pnlInfo1.Initialize(\"\")";
__ref._pnlinfo1.Initialize(ba,"");
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="pnlInfo2.Initialize(\"\")";
__ref._pnlinfo2.Initialize(ba,"");
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="pnlInfo3.Initialize(\"\")";
__ref._pnlinfo3.Initialize(ba,"");
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="usernametxt.Initialize(\"\")";
__ref._usernametxt.Initialize(ba,"");
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="passwordtxt.Initialize(\"\")";
__ref._passwordtxt.Initialize(ba,"");
RDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="emailtxt.Initialize(\"\")";
__ref._emailtxt.Initialize(ba,"");
RDebugUtils.currentLine=8388619;
 //BA.debugLineNum = 8388619;BA.debugLine="firstnametxt.Initialize(\"\")";
__ref._firstnametxt.Initialize(ba,"");
RDebugUtils.currentLine=8388620;
 //BA.debugLineNum = 8388620;BA.debugLine="lastnametxt.Initialize(\"\")";
__ref._lastnametxt.Initialize(ba,"");
RDebugUtils.currentLine=8388621;
 //BA.debugLineNum = 8388621;BA.debugLine="phonetxt.Initialize(\"\")";
__ref._phonetxt.Initialize(ba,"");
RDebugUtils.currentLine=8388623;
 //BA.debugLineNum = 8388623;BA.debugLine="citytxt.Initialize(\"\")";
__ref._citytxt.Initialize(ba,"");
RDebugUtils.currentLine=8388624;
 //BA.debugLineNum = 8388624;BA.debugLine="countrytxt.Initialize(\"\")";
__ref._countrytxt.Initialize(ba,"");
RDebugUtils.currentLine=8388625;
 //BA.debugLineNum = 8388625;BA.debugLine="addresstxt.Initialize(\"\")";
__ref._addresstxt.Initialize(ba,"");
RDebugUtils.currentLine=8388627;
 //BA.debugLineNum = 8388627;BA.debugLine="btnNext0.Initialize(\"NextInfo\")";
__ref._btnnext0.Initialize(ba,"NextInfo");
RDebugUtils.currentLine=8388628;
 //BA.debugLineNum = 8388628;BA.debugLine="btnNext1.Initialize(\"NextInfo1\")";
__ref._btnnext1.Initialize(ba,"NextInfo1");
RDebugUtils.currentLine=8388629;
 //BA.debugLineNum = 8388629;BA.debugLine="btnDone.Initialize(\"RegistrationDone\")";
__ref._btndone.Initialize(ba,"RegistrationDone");
RDebugUtils.currentLine=8388630;
 //BA.debugLineNum = 8388630;BA.debugLine="btnBack0.Initialize(\"BackInfo\")";
__ref._btnback0.Initialize(ba,"BackInfo");
RDebugUtils.currentLine=8388631;
 //BA.debugLineNum = 8388631;BA.debugLine="btnBack1.Initialize(\"BackInfo1\")";
__ref._btnback1.Initialize(ba,"BackInfo1");
RDebugUtils.currentLine=8388633;
 //BA.debugLineNum = 8388633;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=8388634;
 //BA.debugLineNum = 8388634;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return null;
}
public String  _backinfo_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "backinfo_click", false))
	 {return ((String) Debug.delegate(ba, "backinfo_click", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub BackInfo_Click";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="ShowInfo1";
__ref._showinfo1(null);
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="End Sub";
return "";
}
public String  _showinfo1(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "showinfo1", false))
	 {return ((String) Debug.delegate(ba, "showinfo1", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub ShowInfo1";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="If pnlInfo2.Visible = False Then";
if (__ref._pnlinfo2.getVisible()==__c.False) { 
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="pnlInfo2.Visible = True";
__ref._pnlinfo2.setVisible(__c.True);
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="pnlInfo2.Enabled = True";
__ref._pnlinfo2.setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="pnlInfo2.Visible = False";
__ref._pnlinfo2.setVisible(__c.False);
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="pnlInfo2.Enabled = False";
__ref._pnlinfo2.setEnabled(__c.False);
 };
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="End Sub";
return "";
}
public String  _backinfo1_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "backinfo1_click", false))
	 {return ((String) Debug.delegate(ba, "backinfo1_click", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub BackInfo1_Click";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="ShowInfo2";
__ref._showinfo2(null);
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return "";
}
public String  _showinfo2(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "showinfo2", false))
	 {return ((String) Debug.delegate(ba, "showinfo2", null));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub ShowInfo2";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="If pnlInfo3.Visible = False Then";
if (__ref._pnlinfo3.getVisible()==__c.False) { 
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="pnlInfo3.Visible = True";
__ref._pnlinfo3.setVisible(__c.True);
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="pnlInfo3.Enabled = True";
__ref._pnlinfo3.setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="pnlInfo3.Visible = False";
__ref._pnlinfo3.setVisible(__c.False);
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="pnlInfo3.Enabled = False";
__ref._pnlinfo3.setEnabled(__c.False);
 };
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo1(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildinfo1", false))
	 {return ((String) Debug.delegate(ba, "buildinfo1", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub BuildInfo1";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="pnlInfo2.Color = Colors.white";
__ref._pnlinfo2.setColor(__c.Colors.White);
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="firstnametxt.Hint = \"First Name\"";
__ref._firstnametxt.setHint("First Name");
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="firstnametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._firstnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="firstnametxt.SingleLine = True";
__ref._firstnametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="lastnametxt.Hint = \"Last Name\"";
__ref._lastnametxt.setHint("Last Name");
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="lastnametxt.SingleLine = True";
__ref._lastnametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=8585224;
 //BA.debugLineNum = 8585224;BA.debugLine="lastnametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._lastnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="phonetxt.Hint = \"Phone\"";
__ref._phonetxt.setHint("Phone");
RDebugUtils.currentLine=8585226;
 //BA.debugLineNum = 8585226;BA.debugLine="phonetxt.SingleLine = True";
__ref._phonetxt.setSingleLine(__c.True);
RDebugUtils.currentLine=8585227;
 //BA.debugLineNum = 8585227;BA.debugLine="phonetxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._phonetxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=8585229;
 //BA.debugLineNum = 8585229;BA.debugLine="Support.ApplyViewStyle(firstnametxt,Colors.DarkGr";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._firstnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8585230;
 //BA.debugLineNum = 8585230;BA.debugLine="Support.ApplyViewStyle(lastnametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._lastnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8585231;
 //BA.debugLineNum = 8585231;BA.debugLine="Support.ApplyViewStyle(phonetxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._phonetxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8585233;
 //BA.debugLineNum = 8585233;BA.debugLine="btnNext1.Text = \"Next\"";
__ref._btnnext1.setText(BA.ObjectToCharSequence("Next"));
RDebugUtils.currentLine=8585234;
 //BA.debugLineNum = 8585234;BA.debugLine="btnNext1.Gravity = Gravity.CENTER";
__ref._btnnext1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8585235;
 //BA.debugLineNum = 8585235;BA.debugLine="Support.ApplyViewStyle(btnNext1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnnext1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8585236;
 //BA.debugLineNum = 8585236;BA.debugLine="btnBack0.Text = \"Back\"";
__ref._btnback0.setText(BA.ObjectToCharSequence("Back"));
RDebugUtils.currentLine=8585237;
 //BA.debugLineNum = 8585237;BA.debugLine="btnBack0.Gravity = Gravity.CENTER";
__ref._btnback0.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8585238;
 //BA.debugLineNum = 8585238;BA.debugLine="Support.ApplyViewStyle(btnBack0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnback0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8585239;
 //BA.debugLineNum = 8585239;BA.debugLine="pnlInfo2.AddView(firstnametxt,0,0%y,UISizes.Login";
__ref._pnlinfo2.AddView((android.view.View)(__ref._firstnametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8585240;
 //BA.debugLineNum = 8585240;BA.debugLine="pnlInfo2.AddView(lastnametxt,firstnametxt.Left,fi";
__ref._pnlinfo2.AddView((android.view.View)(__ref._lastnametxt.getObject()),__ref._firstnametxt.getLeft(),(int) (__ref._firstnametxt.getTop()+__ref._firstnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8585241;
 //BA.debugLineNum = 8585241;BA.debugLine="pnlInfo2.AddView(phonetxt,lastnametxt.Left,lastna";
__ref._pnlinfo2.AddView((android.view.View)(__ref._phonetxt.getObject()),__ref._lastnametxt.getLeft(),(int) (__ref._lastnametxt.getTop()+__ref._lastnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8585242;
 //BA.debugLineNum = 8585242;BA.debugLine="pnlInfo2.AddView(btnNext1,UISizes.LoginScrDefault";
__ref._pnlinfo2.AddView((android.view.View)(__ref._btnnext1.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2),(int) (__ref._phonetxt.getTop()+__ref._phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8585243;
 //BA.debugLineNum = 8585243;BA.debugLine="pnlInfo2.AddView(btnBack0,phonetxt.left,phonetxt.";
__ref._pnlinfo2.AddView((android.view.View)(__ref._btnback0.getObject()),__ref._phonetxt.getLeft(),(int) (__ref._phonetxt.getTop()+__ref._phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8585245;
 //BA.debugLineNum = 8585245;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo2(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildinfo2", false))
	 {return ((String) Debug.delegate(ba, "buildinfo2", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub BuildInfo2";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="pnlInfo3.Color = Colors.white";
__ref._pnlinfo3.setColor(__c.Colors.White);
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="citytxt.Hint = \"City\"";
__ref._citytxt.setHint("City");
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="citytxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._citytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="citytxt.SingleLine = True";
__ref._citytxt.setSingleLine(__c.True);
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="countrytxt.Hint = \"Country\"";
__ref._countrytxt.setHint("Country");
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="countrytxt.SingleLine = True";
__ref._countrytxt.setSingleLine(__c.True);
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="countrytxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._countrytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="addresstxt.Hint = \"Address\"";
__ref._addresstxt.setHint("Address");
RDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="addresstxt.SingleLine = True";
__ref._addresstxt.setSingleLine(__c.True);
RDebugUtils.currentLine=8650763;
 //BA.debugLineNum = 8650763;BA.debugLine="addresstxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._addresstxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=8650765;
 //BA.debugLineNum = 8650765;BA.debugLine="Support.ApplyViewStyle(citytxt,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._citytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8650766;
 //BA.debugLineNum = 8650766;BA.debugLine="Support.ApplyViewStyle(countrytxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._countrytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8650767;
 //BA.debugLineNum = 8650767;BA.debugLine="Support.ApplyViewStyle(addresstxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._addresstxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8650769;
 //BA.debugLineNum = 8650769;BA.debugLine="btnDone.Text = \"Done\"";
__ref._btndone.setText(BA.ObjectToCharSequence("Done"));
RDebugUtils.currentLine=8650770;
 //BA.debugLineNum = 8650770;BA.debugLine="btnDone.Gravity = Gravity.CENTER";
__ref._btndone.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8650771;
 //BA.debugLineNum = 8650771;BA.debugLine="Support.ApplyViewStyle(btnDone,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btndone.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8650772;
 //BA.debugLineNum = 8650772;BA.debugLine="btnBack1.Text = \"Back\"";
__ref._btnback1.setText(BA.ObjectToCharSequence("Back"));
RDebugUtils.currentLine=8650773;
 //BA.debugLineNum = 8650773;BA.debugLine="btnBack1.Gravity = Gravity.CENTER";
__ref._btnback1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8650774;
 //BA.debugLineNum = 8650774;BA.debugLine="Support.ApplyViewStyle(btnBack1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnback1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8650775;
 //BA.debugLineNum = 8650775;BA.debugLine="pnlInfo3.AddView(citytxt,0,0%y,UISizes.LoginScrDe";
__ref._pnlinfo3.AddView((android.view.View)(__ref._citytxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8650776;
 //BA.debugLineNum = 8650776;BA.debugLine="pnlInfo3.AddView(countrytxt,citytxt.Left,citytxt.";
__ref._pnlinfo3.AddView((android.view.View)(__ref._countrytxt.getObject()),__ref._citytxt.getLeft(),(int) (__ref._citytxt.getTop()+__ref._citytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8650777;
 //BA.debugLineNum = 8650777;BA.debugLine="pnlInfo3.AddView(addresstxt,countrytxt.Left,count";
__ref._pnlinfo3.AddView((android.view.View)(__ref._addresstxt.getObject()),__ref._countrytxt.getLeft(),(int) (__ref._countrytxt.getTop()+__ref._countrytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8650778;
 //BA.debugLineNum = 8650778;BA.debugLine="pnlInfo3.AddView(btnDone,UISizes.LoginScrDefaultW";
__ref._pnlinfo3.AddView((android.view.View)(__ref._btndone.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2),(int) (__ref._addresstxt.getTop()+__ref._addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8650779;
 //BA.debugLineNum = 8650779;BA.debugLine="pnlInfo3.AddView(btnBack1,addresstxt.left,address";
__ref._pnlinfo3.AddView((android.view.View)(__ref._btnback1.getObject()),__ref._addresstxt.getLeft(),(int) (__ref._addresstxt.getTop()+__ref._addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8650781;
 //BA.debugLineNum = 8650781;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="ScreenPnl.Color = Colors.white";
__ref._screenpnl.setColor(__c.Colors.White);
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="usernametxt.Hint = \"Username\"";
__ref._usernametxt.setHint("Username");
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="usernametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._usernametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="usernametxt.SingleLine = True";
__ref._usernametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="passwordtxt.Hint = \"Password\"";
__ref._passwordtxt.setHint("Password");
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="passwordtxt.SingleLine = True";
__ref._passwordtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="passwordtxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._passwordtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="emailtxt.Hint = \"Email\"";
__ref._emailtxt.setHint("Email");
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="emailtxt.SingleLine = True";
__ref._emailtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="emailtxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._emailtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._usernametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._passwordtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="Support.ApplyViewStyle(emailtxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._emailtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8519697;
 //BA.debugLineNum = 8519697;BA.debugLine="btnNext0.Text = \"Next\"";
__ref._btnnext0.setText(BA.ObjectToCharSequence("Next"));
RDebugUtils.currentLine=8519698;
 //BA.debugLineNum = 8519698;BA.debugLine="btnNext0.Gravity = Gravity.CENTER";
__ref._btnnext0.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=8519699;
 //BA.debugLineNum = 8519699;BA.debugLine="Support.ApplyViewStyle(btnNext0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnnext0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=8519701;
 //BA.debugLineNum = 8519701;BA.debugLine="BuildInfo1";
__ref._buildinfo1(null);
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="BuildInfo2";
__ref._buildinfo2(null);
RDebugUtils.currentLine=8519704;
 //BA.debugLineNum = 8519704;BA.debugLine="ScreenPnl.AddView(pnlInfo1,UISizes.LoginScrDefaul";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo1.getObject()),_uisizes._loginscrdefaultleft,__c.PerYToCurrent((float) (30),ba),_uisizes._loginscrdefaultwidth,(int) (_uisizes._edittextdefaultheight*4+__c.PerYToCurrent((float) (4),ba)));
RDebugUtils.currentLine=8519705;
 //BA.debugLineNum = 8519705;BA.debugLine="pnlInfo1.AddView(usernametxt,0,0%y,UISizes.LoginS";
__ref._pnlinfo1.AddView((android.view.View)(__ref._usernametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8519706;
 //BA.debugLineNum = 8519706;BA.debugLine="pnlInfo1.AddView(passwordtxt,usernametxt.Left,use";
__ref._pnlinfo1.AddView((android.view.View)(__ref._passwordtxt.getObject()),__ref._usernametxt.getLeft(),(int) (__ref._usernametxt.getTop()+__ref._usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8519707;
 //BA.debugLineNum = 8519707;BA.debugLine="pnlInfo1.AddView(emailtxt,passwordtxt.Left,passwo";
__ref._pnlinfo1.AddView((android.view.View)(__ref._emailtxt.getObject()),__ref._passwordtxt.getLeft(),(int) (__ref._passwordtxt.getTop()+__ref._passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8519708;
 //BA.debugLineNum = 8519708;BA.debugLine="pnlInfo1.AddView(btnNext0,UISizes.LoginScrDefault";
__ref._pnlinfo1.AddView((android.view.View)(__ref._btnnext0.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2*0.50),(int) (__ref._emailtxt.getTop()+__ref._emailtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=8519710;
 //BA.debugLineNum = 8519710;BA.debugLine="ScreenPnl.AddView(pnlInfo2,pnlInfo1.Left,pnlInfo1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo2.getObject()),__ref._pnlinfo1.getLeft(),__ref._pnlinfo1.getTop(),__ref._pnlinfo1.getWidth(),__ref._pnlinfo1.getHeight());
RDebugUtils.currentLine=8519711;
 //BA.debugLineNum = 8519711;BA.debugLine="pnlInfo2.Visible = False";
__ref._pnlinfo2.setVisible(__c.False);
RDebugUtils.currentLine=8519712;
 //BA.debugLineNum = 8519712;BA.debugLine="pnlInfo2.Enabled = False";
__ref._pnlinfo2.setEnabled(__c.False);
RDebugUtils.currentLine=8519714;
 //BA.debugLineNum = 8519714;BA.debugLine="ScreenPnl.AddView(pnlInfo3,pnlInfo1.Left,pnlInfo1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo3.getObject()),__ref._pnlinfo1.getLeft(),__ref._pnlinfo1.getTop(),__ref._pnlinfo1.getWidth(),__ref._pnlinfo1.getHeight());
RDebugUtils.currentLine=8519715;
 //BA.debugLineNum = 8519715;BA.debugLine="pnlInfo3.Visible = False";
__ref._pnlinfo3.setVisible(__c.False);
RDebugUtils.currentLine=8519716;
 //BA.debugLineNum = 8519716;BA.debugLine="pnlInfo3.Enabled = False";
__ref._pnlinfo3.setEnabled(__c.False);
RDebugUtils.currentLine=8519717;
 //BA.debugLineNum = 8519717;BA.debugLine="End Sub";
return "";
}
public boolean  _checkformissingfields(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "checkformissingfields", false))
	 {return ((Boolean) Debug.delegate(ba, "checkformissingfields", null));}
boolean _result = false;
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub CheckForMissingFields As Boolean";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Dim result As Boolean = False";
_result = __c.False;
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="If usernametxt.Text.Length > 0 Then";
if (__ref._usernametxt.getText().length()>0) { 
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="If passwordtxt.Text.Length > 0 Then";
if (__ref._passwordtxt.getText().length()>0) { 
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="If emailtxt.Text.Length > 0 Then";
if (__ref._emailtxt.getText().length()>0) { 
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="If firstnametxt.Text.Length > 0 Then";
if (__ref._firstnametxt.getText().length()>0) { 
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="If lastnametxt.Text.Length > 0 Then";
if (__ref._lastnametxt.getText().length()>0) { 
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="If phonetxt.Text.Length > 0 Then";
if (__ref._phonetxt.getText().length()>0) { 
RDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="If citytxt.Text.Length > 0 Then";
if (__ref._citytxt.getText().length()>0) { 
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="If countrytxt.Text.Length > 0 Then";
if (__ref._countrytxt.getText().length()>0) { 
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="If addresstxt.Text.Length > 0 Then";
if (__ref._addresstxt.getText().length()>0) { 
RDebugUtils.currentLine=9175051;
 //BA.debugLineNum = 9175051;BA.debugLine="result = True";
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
RDebugUtils.currentLine=9175061;
 //BA.debugLineNum = 9175061;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=9175062;
 //BA.debugLineNum = 9175062;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Private pnlInfo1 As Panel";
_pnlinfo1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Private pnlInfo2 As Panel";
_pnlinfo2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="Private pnlInfo3 As Panel";
_pnlinfo3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="Private emailtxt As EditText";
_emailtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="Private firstnametxt As EditText";
_firstnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="Private lastnametxt As EditText";
_lastnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="Private phonetxt As EditText";
_phonetxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="Private citytxt As EditText";
_citytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="Private countrytxt As EditText";
_countrytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="Private addresstxt As EditText";
_addresstxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="Private btnNext0,btnNext1,btnDone As Button";
_btnnext0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnnext1 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btndone = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=8323093;
 //BA.debugLineNum = 8323093;BA.debugLine="Private btnBack0,btnBack1 As Button";
_btnback0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnback1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=8323095;
 //BA.debugLineNum = 8323095;BA.debugLine="End Sub";
return "";
}
public String  _cleartextfields(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "cleartextfields", false))
	 {return ((String) Debug.delegate(ba, "cleartextfields", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub ClearTextFields";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="usernametxt.Text = \"\"";
__ref._usernametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="passwordtxt.Text = \"\"";
__ref._passwordtxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="emailtxt.Text = \"\"";
__ref._emailtxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="firstnametxt.Text = \"\"";
__ref._firstnametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="lastnametxt.Text = \"\"";
__ref._lastnametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="phonetxt.Text = \"\"";
__ref._phonetxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="citytxt.Text = \"\"";
__ref._citytxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="countrytxt.Text = \"\"";
__ref._countrytxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9306121;
 //BA.debugLineNum = 9306121;BA.debugLine="addresstxt.Text = \"\"";
__ref._addresstxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9306122;
 //BA.debugLineNum = 9306122;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "nextinfo_click", false))
	 {return ((String) Debug.delegate(ba, "nextinfo_click", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub NextInfo_Click";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="ShowInfo1";
__ref._showinfo1(null);
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo1_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "nextinfo1_click", false))
	 {return ((String) Debug.delegate(ba, "nextinfo1_click", null));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub NextInfo1_Click";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="ShowInfo2";
__ref._showinfo2(null);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
return "";
}
public void  _registrationdone_click(b4a.diplomna.registerscreen __ref) throws Exception{
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "registrationdone_click", false))
	 {Debug.delegate(ba, "registrationdone_click", null); return;}
ResumableSub_RegistrationDone_Click rsub = new ResumableSub_RegistrationDone_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_RegistrationDone_Click extends BA.ResumableSub {
public ResumableSub_RegistrationDone_Click(b4a.diplomna.registerscreen parent,b4a.diplomna.registerscreen __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.diplomna.registerscreen __ref;
b4a.diplomna.registerscreen parent;
b4a.diplomna.types._customer _newcustomer = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _register = null;
Object _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="registerscreen";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="usernametxt.Text = \"test\"";
__ref._usernametxt.setText(BA.ObjectToCharSequence("test"));
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="passwordtxt.Text = \"test\"";
__ref._passwordtxt.setText(BA.ObjectToCharSequence("test"));
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="emailtxt.Text = \"test\"";
__ref._emailtxt.setText(BA.ObjectToCharSequence("test"));
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="firstnametxt.Text = \"test\"";
__ref._firstnametxt.setText(BA.ObjectToCharSequence("test"));
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="lastnametxt.Text = \"test\"";
__ref._lastnametxt.setText(BA.ObjectToCharSequence("test"));
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="phonetxt.Text  = \"test\"";
__ref._phonetxt.setText(BA.ObjectToCharSequence("test"));
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="citytxt.Text = \"test\"";
__ref._citytxt.setText(BA.ObjectToCharSequence("test"));
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="countrytxt.Text = \"test\"";
__ref._countrytxt.setText(BA.ObjectToCharSequence("test"));
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="addresstxt.Text = \"test\"";
__ref._addresstxt.setText(BA.ObjectToCharSequence("test"));
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="Public NewCustomer As Customer";
_newcustomer = new b4a.diplomna.types._customer();
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="NewCustomer.Initialize";
_newcustomer.Initialize();
RDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="If CheckForMissingFields = True Then";
if (true) break;

case 1:
//if
this.state = 12;
if (__ref._checkformissingfields(null)==parent.__c.True) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="NewCustomer.username = usernametxt.Text";
_newcustomer.username = __ref._usernametxt.getText();
RDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="NewCustomer.password = passwordtxt.Text";
_newcustomer.password = __ref._passwordtxt.getText();
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="NewCustomer.email = emailtxt.Text";
_newcustomer.email = __ref._emailtxt.getText();
RDebugUtils.currentLine=9109522;
 //BA.debugLineNum = 9109522;BA.debugLine="NewCustomer.FirstName = firstnametxt.Text";
_newcustomer.FirstName = __ref._firstnametxt.getText();
RDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="NewCustomer.LastName = lastnametxt.Text";
_newcustomer.LastName = __ref._lastnametxt.getText();
RDebugUtils.currentLine=9109524;
 //BA.debugLineNum = 9109524;BA.debugLine="NewCustomer.Phone = phonetxt.Text";
_newcustomer.Phone = __ref._phonetxt.getText();
RDebugUtils.currentLine=9109525;
 //BA.debugLineNum = 9109525;BA.debugLine="NewCustomer.City = citytxt.Text";
_newcustomer.City = __ref._citytxt.getText();
RDebugUtils.currentLine=9109526;
 //BA.debugLineNum = 9109526;BA.debugLine="NewCustomer.Country = countrytxt.Text";
_newcustomer.Country = __ref._countrytxt.getText();
RDebugUtils.currentLine=9109527;
 //BA.debugLineNum = 9109527;BA.debugLine="NewCustomer.Address = addresstxt.Text";
_newcustomer.Address = __ref._addresstxt.getText();
RDebugUtils.currentLine=9109529;
 //BA.debugLineNum = 9109529;BA.debugLine="Dim register As ResumableSub = Main.HTTP.Registe";
_register = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_register = parent._main._http._registernewcustomer(null,_newcustomer);
RDebugUtils.currentLine=9109530;
 //BA.debugLineNum = 9109530;BA.debugLine="Wait For (register)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "registerscreen", "registrationdone_click"), _register);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (Object) result[1];
;
RDebugUtils.currentLine=9109531;
 //BA.debugLineNum = 9109531;BA.debugLine="If Main.HTTP.Output = \"Satus_Code:401\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((parent._main._http._output).equals("Satus_Code:401")) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=9109533;
 //BA.debugLineNum = 9109533;BA.debugLine="Else if Main.HTTP.Output = \"Satus_Code:200\" Then";
if ((parent._main._http._output).equals("Satus_Code:200")) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=9109532;
 //BA.debugLineNum = 9109532;BA.debugLine="Log(\"LOGIN FAILED\")";
parent.__c.LogImpl("29109532","LOGIN FAILED",0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=9109534;
 //BA.debugLineNum = 9109534;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
parent.__c.CallSubDebug(ba,(Object)(parent._main.getObject()),"ShowMainScreen");
RDebugUtils.currentLine=9109535;
 //BA.debugLineNum = 9109535;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
RDebugUtils.currentLine=9109536;
 //BA.debugLineNum = 9109536;BA.debugLine="ReturnToLoginScreen";
__ref._returntologinscreen(null);
RDebugUtils.currentLine=9109537;
 //BA.debugLineNum = 9109537;BA.debugLine="ClearTextFields";
__ref._cleartextfields(null);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=9109540;
 //BA.debugLineNum = 9109540;BA.debugLine="Log(\"missing info\")";
parent.__c.LogImpl("29109540","missing info",0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=9109542;
 //BA.debugLineNum = 9109542;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _returntologinscreen(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "returntologinscreen", false))
	 {return ((String) Debug.delegate(ba, "returntologinscreen", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub ReturnToLoginScreen";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRegisterScreen");
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="End Sub";
return "";
}
public String  _sendinfotoapi(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "sendinfotoapi", false))
	 {return ((String) Debug.delegate(ba, "sendinfotoapi", null));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub SendInfoToAPI";
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return "";
}
}