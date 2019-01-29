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
public b4a.diplomna.types _types = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.registerscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="pnlInfo1.Initialize(\"\")";
__ref._pnlinfo1.Initialize(ba,"");
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="pnlInfo2.Initialize(\"\")";
__ref._pnlinfo2.Initialize(ba,"");
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="pnlInfo3.Initialize(\"\")";
__ref._pnlinfo3.Initialize(ba,"");
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="usernametxt.Initialize(\"\")";
__ref._usernametxt.Initialize(ba,"");
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="passwordtxt.Initialize(\"\")";
__ref._passwordtxt.Initialize(ba,"");
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="emailtxt.Initialize(\"\")";
__ref._emailtxt.Initialize(ba,"");
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="firstnametxt.Initialize(\"\")";
__ref._firstnametxt.Initialize(ba,"");
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="lastnametxt.Initialize(\"\")";
__ref._lastnametxt.Initialize(ba,"");
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="phonetxt.Initialize(\"\")";
__ref._phonetxt.Initialize(ba,"");
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="citytxt.Initialize(\"\")";
__ref._citytxt.Initialize(ba,"");
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="countrytxt.Initialize(\"\")";
__ref._countrytxt.Initialize(ba,"");
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="addresstxt.Initialize(\"\")";
__ref._addresstxt.Initialize(ba,"");
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="btnNext0.Initialize(\"NextInfo\")";
__ref._btnnext0.Initialize(ba,"NextInfo");
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="btnNext1.Initialize(\"NextInfo1\")";
__ref._btnnext1.Initialize(ba,"NextInfo1");
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="btnDone.Initialize(\"RegistrationDone\")";
__ref._btndone.Initialize(ba,"RegistrationDone");
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="btnBack0.Initialize(\"BackInfo\")";
__ref._btnback0.Initialize(ba,"BackInfo");
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="btnBack1.Initialize(\"BackInfo1\")";
__ref._btnback1.Initialize(ba,"BackInfo1");
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="End Sub";
return null;
}
public String  _backinfo_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "backinfo_click", false))
	 {return ((String) Debug.delegate(ba, "backinfo_click", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub BackInfo_Click";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="ShowInfo1";
__ref._showinfo1(null);
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public String  _showinfo1(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "showinfo1", false))
	 {return ((String) Debug.delegate(ba, "showinfo1", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub ShowInfo1";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="If pnlInfo2.Visible = False Then";
if (__ref._pnlinfo2.getVisible()==__c.False) { 
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="pnlInfo2.Visible = True";
__ref._pnlinfo2.setVisible(__c.True);
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="pnlInfo2.Enabled = True";
__ref._pnlinfo2.setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="pnlInfo2.Visible = False";
__ref._pnlinfo2.setVisible(__c.False);
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="pnlInfo2.Enabled = False";
__ref._pnlinfo2.setEnabled(__c.False);
 };
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="End Sub";
return "";
}
public String  _backinfo1_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "backinfo1_click", false))
	 {return ((String) Debug.delegate(ba, "backinfo1_click", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub BackInfo1_Click";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="ShowInfo2";
__ref._showinfo2(null);
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return "";
}
public String  _showinfo2(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "showinfo2", false))
	 {return ((String) Debug.delegate(ba, "showinfo2", null));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub ShowInfo2";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="If pnlInfo3.Visible = False Then";
if (__ref._pnlinfo3.getVisible()==__c.False) { 
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="pnlInfo3.Visible = True";
__ref._pnlinfo3.setVisible(__c.True);
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="pnlInfo3.Enabled = True";
__ref._pnlinfo3.setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="pnlInfo3.Visible = False";
__ref._pnlinfo3.setVisible(__c.False);
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="pnlInfo3.Enabled = False";
__ref._pnlinfo3.setEnabled(__c.False);
 };
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo1(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildinfo1", false))
	 {return ((String) Debug.delegate(ba, "buildinfo1", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub BuildInfo1";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="pnlInfo2.Color = Colors.white";
__ref._pnlinfo2.setColor(__c.Colors.White);
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="firstnametxt.Hint = \"First Name\"";
__ref._firstnametxt.setHint("First Name");
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="firstnametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._firstnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="firstnametxt.SingleLine = True";
__ref._firstnametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="lastnametxt.Hint = \"Last Name\"";
__ref._lastnametxt.setHint("Last Name");
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="lastnametxt.SingleLine = True";
__ref._lastnametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="lastnametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._lastnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="phonetxt.Hint = \"Phone\"";
__ref._phonetxt.setHint("Phone");
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="phonetxt.SingleLine = True";
__ref._phonetxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="phonetxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._phonetxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="Support.ApplyViewStyle(firstnametxt,Colors.DarkGr";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._firstnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="Support.ApplyViewStyle(lastnametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._lastnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="Support.ApplyViewStyle(phonetxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._phonetxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="btnNext1.Text = \"Next\"";
__ref._btnnext1.setText(BA.ObjectToCharSequence("Next"));
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="btnNext1.Gravity = Gravity.CENTER";
__ref._btnnext1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="Support.ApplyViewStyle(btnNext1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnnext1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="btnBack0.Text = \"Back\"";
__ref._btnback0.setText(BA.ObjectToCharSequence("Back"));
RDebugUtils.currentLine=7471125;
 //BA.debugLineNum = 7471125;BA.debugLine="btnBack0.Gravity = Gravity.CENTER";
__ref._btnback0.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7471126;
 //BA.debugLineNum = 7471126;BA.debugLine="Support.ApplyViewStyle(btnBack0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnback0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7471127;
 //BA.debugLineNum = 7471127;BA.debugLine="pnlInfo2.AddView(firstnametxt,0,0%y,UISizes.Login";
__ref._pnlinfo2.AddView((android.view.View)(__ref._firstnametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7471128;
 //BA.debugLineNum = 7471128;BA.debugLine="pnlInfo2.AddView(lastnametxt,firstnametxt.Left,fi";
__ref._pnlinfo2.AddView((android.view.View)(__ref._lastnametxt.getObject()),__ref._firstnametxt.getLeft(),(int) (__ref._firstnametxt.getTop()+__ref._firstnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7471129;
 //BA.debugLineNum = 7471129;BA.debugLine="pnlInfo2.AddView(phonetxt,lastnametxt.Left,lastna";
__ref._pnlinfo2.AddView((android.view.View)(__ref._phonetxt.getObject()),__ref._lastnametxt.getLeft(),(int) (__ref._lastnametxt.getTop()+__ref._lastnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7471130;
 //BA.debugLineNum = 7471130;BA.debugLine="pnlInfo2.AddView(btnNext1,UISizes.LoginScrDefault";
__ref._pnlinfo2.AddView((android.view.View)(__ref._btnnext1.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2),(int) (__ref._phonetxt.getTop()+__ref._phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7471131;
 //BA.debugLineNum = 7471131;BA.debugLine="pnlInfo2.AddView(btnBack0,phonetxt.left,phonetxt.";
__ref._pnlinfo2.AddView((android.view.View)(__ref._btnback0.getObject()),__ref._phonetxt.getLeft(),(int) (__ref._phonetxt.getTop()+__ref._phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7471133;
 //BA.debugLineNum = 7471133;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo2(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildinfo2", false))
	 {return ((String) Debug.delegate(ba, "buildinfo2", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub BuildInfo2";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="pnlInfo3.Color = Colors.white";
__ref._pnlinfo3.setColor(__c.Colors.White);
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="citytxt.Hint = \"City\"";
__ref._citytxt.setHint("City");
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="citytxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._citytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="citytxt.SingleLine = True";
__ref._citytxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="countrytxt.Hint = \"Country\"";
__ref._countrytxt.setHint("Country");
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="countrytxt.SingleLine = True";
__ref._countrytxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="countrytxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._countrytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="addresstxt.Hint = \"Address\"";
__ref._addresstxt.setHint("Address");
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="addresstxt.SingleLine = True";
__ref._addresstxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="addresstxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._addresstxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="Support.ApplyViewStyle(citytxt,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._citytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="Support.ApplyViewStyle(countrytxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._countrytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="Support.ApplyViewStyle(addresstxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._addresstxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7536657;
 //BA.debugLineNum = 7536657;BA.debugLine="btnDone.Text = \"Done\"";
__ref._btndone.setText(BA.ObjectToCharSequence("Done"));
RDebugUtils.currentLine=7536658;
 //BA.debugLineNum = 7536658;BA.debugLine="btnDone.Gravity = Gravity.CENTER";
__ref._btndone.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="Support.ApplyViewStyle(btnDone,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btndone.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7536660;
 //BA.debugLineNum = 7536660;BA.debugLine="btnBack1.Text = \"Back\"";
__ref._btnback1.setText(BA.ObjectToCharSequence("Back"));
RDebugUtils.currentLine=7536661;
 //BA.debugLineNum = 7536661;BA.debugLine="btnBack1.Gravity = Gravity.CENTER";
__ref._btnback1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7536662;
 //BA.debugLineNum = 7536662;BA.debugLine="Support.ApplyViewStyle(btnBack1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnback1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7536663;
 //BA.debugLineNum = 7536663;BA.debugLine="pnlInfo3.AddView(citytxt,0,0%y,UISizes.LoginScrDe";
__ref._pnlinfo3.AddView((android.view.View)(__ref._citytxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7536664;
 //BA.debugLineNum = 7536664;BA.debugLine="pnlInfo3.AddView(countrytxt,citytxt.Left,citytxt.";
__ref._pnlinfo3.AddView((android.view.View)(__ref._countrytxt.getObject()),__ref._citytxt.getLeft(),(int) (__ref._citytxt.getTop()+__ref._citytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7536665;
 //BA.debugLineNum = 7536665;BA.debugLine="pnlInfo3.AddView(addresstxt,countrytxt.Left,count";
__ref._pnlinfo3.AddView((android.view.View)(__ref._addresstxt.getObject()),__ref._countrytxt.getLeft(),(int) (__ref._countrytxt.getTop()+__ref._countrytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7536666;
 //BA.debugLineNum = 7536666;BA.debugLine="pnlInfo3.AddView(btnDone,UISizes.LoginScrDefaultW";
__ref._pnlinfo3.AddView((android.view.View)(__ref._btndone.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2),(int) (__ref._addresstxt.getTop()+__ref._addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7536667;
 //BA.debugLineNum = 7536667;BA.debugLine="pnlInfo3.AddView(btnBack1,addresstxt.left,address";
__ref._pnlinfo3.AddView((android.view.View)(__ref._btnback1.getObject()),__ref._addresstxt.getLeft(),(int) (__ref._addresstxt.getTop()+__ref._addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7536669;
 //BA.debugLineNum = 7536669;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="ScreenPnl.Color = Colors.white";
__ref._screenpnl.setColor(__c.Colors.White);
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="usernametxt.Hint = \"Username\"";
__ref._usernametxt.setHint("Username");
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="usernametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._usernametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="usernametxt.SingleLine = True";
__ref._usernametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="passwordtxt.Hint = \"Password\"";
__ref._passwordtxt.setHint("Password");
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="passwordtxt.SingleLine = True";
__ref._passwordtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="passwordtxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._passwordtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="emailtxt.Hint = \"Email\"";
__ref._emailtxt.setHint("Email");
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="emailtxt.SingleLine = True";
__ref._emailtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="emailtxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._emailtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._usernametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._passwordtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7405583;
 //BA.debugLineNum = 7405583;BA.debugLine="Support.ApplyViewStyle(emailtxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._emailtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="btnNext0.Text = \"Next\"";
__ref._btnnext0.setText(BA.ObjectToCharSequence("Next"));
RDebugUtils.currentLine=7405586;
 //BA.debugLineNum = 7405586;BA.debugLine="btnNext0.Gravity = Gravity.CENTER";
__ref._btnnext0.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7405587;
 //BA.debugLineNum = 7405587;BA.debugLine="Support.ApplyViewStyle(btnNext0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnnext0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7405589;
 //BA.debugLineNum = 7405589;BA.debugLine="BuildInfo1";
__ref._buildinfo1(null);
RDebugUtils.currentLine=7405590;
 //BA.debugLineNum = 7405590;BA.debugLine="BuildInfo2";
__ref._buildinfo2(null);
RDebugUtils.currentLine=7405592;
 //BA.debugLineNum = 7405592;BA.debugLine="ScreenPnl.AddView(pnlInfo1,UISizes.LoginScrDefaul";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo1.getObject()),_uisizes._loginscrdefaultleft,__c.PerYToCurrent((float) (30),ba),_uisizes._loginscrdefaultwidth,(int) (_uisizes._edittextdefaultheight*4+__c.PerYToCurrent((float) (4),ba)));
RDebugUtils.currentLine=7405593;
 //BA.debugLineNum = 7405593;BA.debugLine="pnlInfo1.AddView(usernametxt,0,0%y,UISizes.LoginS";
__ref._pnlinfo1.AddView((android.view.View)(__ref._usernametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7405594;
 //BA.debugLineNum = 7405594;BA.debugLine="pnlInfo1.AddView(passwordtxt,usernametxt.Left,use";
__ref._pnlinfo1.AddView((android.view.View)(__ref._passwordtxt.getObject()),__ref._usernametxt.getLeft(),(int) (__ref._usernametxt.getTop()+__ref._usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7405595;
 //BA.debugLineNum = 7405595;BA.debugLine="pnlInfo1.AddView(emailtxt,passwordtxt.Left,passwo";
__ref._pnlinfo1.AddView((android.view.View)(__ref._emailtxt.getObject()),__ref._passwordtxt.getLeft(),(int) (__ref._passwordtxt.getTop()+__ref._passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7405596;
 //BA.debugLineNum = 7405596;BA.debugLine="pnlInfo1.AddView(btnNext0,UISizes.LoginScrDefault";
__ref._pnlinfo1.AddView((android.view.View)(__ref._btnnext0.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2*0.50),(int) (__ref._emailtxt.getTop()+__ref._emailtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7405598;
 //BA.debugLineNum = 7405598;BA.debugLine="ScreenPnl.AddView(pnlInfo2,pnlInfo1.Left,pnlInfo1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo2.getObject()),__ref._pnlinfo1.getLeft(),__ref._pnlinfo1.getTop(),__ref._pnlinfo1.getWidth(),__ref._pnlinfo1.getHeight());
RDebugUtils.currentLine=7405599;
 //BA.debugLineNum = 7405599;BA.debugLine="pnlInfo2.Visible = False";
__ref._pnlinfo2.setVisible(__c.False);
RDebugUtils.currentLine=7405600;
 //BA.debugLineNum = 7405600;BA.debugLine="pnlInfo2.Enabled = False";
__ref._pnlinfo2.setEnabled(__c.False);
RDebugUtils.currentLine=7405602;
 //BA.debugLineNum = 7405602;BA.debugLine="ScreenPnl.AddView(pnlInfo3,pnlInfo1.Left,pnlInfo1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo3.getObject()),__ref._pnlinfo1.getLeft(),__ref._pnlinfo1.getTop(),__ref._pnlinfo1.getWidth(),__ref._pnlinfo1.getHeight());
RDebugUtils.currentLine=7405603;
 //BA.debugLineNum = 7405603;BA.debugLine="pnlInfo3.Visible = False";
__ref._pnlinfo3.setVisible(__c.False);
RDebugUtils.currentLine=7405604;
 //BA.debugLineNum = 7405604;BA.debugLine="pnlInfo3.Enabled = False";
__ref._pnlinfo3.setEnabled(__c.False);
RDebugUtils.currentLine=7405605;
 //BA.debugLineNum = 7405605;BA.debugLine="End Sub";
return "";
}
public boolean  _checkformissingfields(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "checkformissingfields", false))
	 {return ((Boolean) Debug.delegate(ba, "checkformissingfields", null));}
boolean _result = false;
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub CheckForMissingFields As Boolean";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim result As Boolean = False";
_result = __c.False;
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="If usernametxt.Text.Length > 0 Then";
if (__ref._usernametxt.getText().length()>0) { 
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="If passwordtxt.Text.Length > 0 Then";
if (__ref._passwordtxt.getText().length()>0) { 
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="If emailtxt.Text.Length > 0 Then";
if (__ref._emailtxt.getText().length()>0) { 
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="If firstnametxt.Text.Length > 0 Then";
if (__ref._firstnametxt.getText().length()>0) { 
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="If lastnametxt.Text.Length > 0 Then";
if (__ref._lastnametxt.getText().length()>0) { 
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="If phonetxt.Text.Length > 0 Then";
if (__ref._phonetxt.getText().length()>0) { 
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="If citytxt.Text.Length > 0 Then";
if (__ref._citytxt.getText().length()>0) { 
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="If countrytxt.Text.Length > 0 Then";
if (__ref._countrytxt.getText().length()>0) { 
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="If addresstxt.Text.Length > 0 Then";
if (__ref._addresstxt.getText().length()>0) { 
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="result = True";
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
RDebugUtils.currentLine=8060949;
 //BA.debugLineNum = 8060949;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=8060950;
 //BA.debugLineNum = 8060950;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Private pnlInfo1 As Panel";
_pnlinfo1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="Private pnlInfo2 As Panel";
_pnlinfo2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Private pnlInfo3 As Panel";
_pnlinfo3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="Private emailtxt As EditText";
_emailtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="Private firstnametxt As EditText";
_firstnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="Private lastnametxt As EditText";
_lastnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="Private phonetxt As EditText";
_phonetxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="Private citytxt As EditText";
_citytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="Private countrytxt As EditText";
_countrytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="Private addresstxt As EditText";
_addresstxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7208979;
 //BA.debugLineNum = 7208979;BA.debugLine="Private btnNext0,btnNext1,btnDone As Button";
_btnnext0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnnext1 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btndone = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="Private btnBack0,btnBack1 As Button";
_btnback0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnback1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7208983;
 //BA.debugLineNum = 7208983;BA.debugLine="End Sub";
return "";
}
public String  _cleartextfields(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "cleartextfields", false))
	 {return ((String) Debug.delegate(ba, "cleartextfields", null));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub ClearTextFields";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="usernametxt.Text = \"\"";
__ref._usernametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="passwordtxt.Text = \"\"";
__ref._passwordtxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="emailtxt.Text = \"\"";
__ref._emailtxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="firstnametxt.Text = \"\"";
__ref._firstnametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="lastnametxt.Text = \"\"";
__ref._lastnametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="phonetxt.Text = \"\"";
__ref._phonetxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="citytxt.Text = \"\"";
__ref._citytxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="countrytxt.Text = \"\"";
__ref._countrytxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="addresstxt.Text = \"\"";
__ref._addresstxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "nextinfo_click", false))
	 {return ((String) Debug.delegate(ba, "nextinfo_click", null));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub NextInfo_Click";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="ShowInfo1";
__ref._showinfo1(null);
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo1_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "nextinfo1_click", false))
	 {return ((String) Debug.delegate(ba, "nextinfo1_click", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub NextInfo1_Click";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="ShowInfo2";
__ref._showinfo2(null);
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public String  _registrationdone_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "registrationdone_click", false))
	 {return ((String) Debug.delegate(ba, "registrationdone_click", null));}
b4a.diplomna.types._customer _newcustomer = null;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub RegistrationDone_Click";
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Public NewCustomer As Customer";
_newcustomer = new b4a.diplomna.types._customer();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="NewCustomer.Initialize";
_newcustomer.Initialize();
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="If CheckForMissingFields = True Then";
if (__ref._checkformissingfields(null)==__c.True) { 
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="NewCustomer.username = usernametxt.Text";
_newcustomer.username = __ref._usernametxt.getText();
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="NewCustomer.password = passwordtxt.Text";
_newcustomer.password = __ref._passwordtxt.getText();
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="NewCustomer.email = emailtxt.Text";
_newcustomer.email = __ref._emailtxt.getText();
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="NewCustomer.FirstName = firstnametxt.Text";
_newcustomer.FirstName = __ref._firstnametxt.getText();
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="NewCustomer.LastName = lastnametxt.Text";
_newcustomer.LastName = __ref._lastnametxt.getText();
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="NewCustomer.Phone = phonetxt.Text";
_newcustomer.Phone = __ref._phonetxt.getText();
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="NewCustomer.City = citytxt.Text";
_newcustomer.City = __ref._citytxt.getText();
RDebugUtils.currentLine=7995405;
 //BA.debugLineNum = 7995405;BA.debugLine="NewCustomer.Country = countrytxt.Text";
_newcustomer.Country = __ref._countrytxt.getText();
RDebugUtils.currentLine=7995406;
 //BA.debugLineNum = 7995406;BA.debugLine="NewCustomer.Address = addresstxt.Text";
_newcustomer.Address = __ref._addresstxt.getText();
RDebugUtils.currentLine=7995407;
 //BA.debugLineNum = 7995407;BA.debugLine="Log(\"successfully registered\")";
__c.LogImpl("47995407","successfully registered",0);
RDebugUtils.currentLine=7995408;
 //BA.debugLineNum = 7995408;BA.debugLine="Log(NewCustomer)";
__c.LogImpl("47995408",BA.ObjectToString(_newcustomer),0);
RDebugUtils.currentLine=7995409;
 //BA.debugLineNum = 7995409;BA.debugLine="ReturnToLoginScreen";
__ref._returntologinscreen(null);
RDebugUtils.currentLine=7995410;
 //BA.debugLineNum = 7995410;BA.debugLine="ClearTextFields";
__ref._cleartextfields(null);
 }else {
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="Log(\"missing info\")";
__c.LogImpl("47995412","missing info",0);
 };
RDebugUtils.currentLine=7995414;
 //BA.debugLineNum = 7995414;BA.debugLine="End Sub";
return "";
}
public String  _returntologinscreen(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "returntologinscreen", false))
	 {return ((String) Debug.delegate(ba, "returntologinscreen", null));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub ReturnToLoginScreen";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRegisterScreen");
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return "";
}
public String  _sendinfotoapi(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "sendinfotoapi", false))
	 {return ((String) Debug.delegate(ba, "sendinfotoapi", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub SendInfoToAPI";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return "";
}
}