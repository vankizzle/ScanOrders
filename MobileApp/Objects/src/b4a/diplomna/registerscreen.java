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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _initialize(b4a.diplomna.registerscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="ScreenPnl.Initialize(\"\")";
__ref._screenpnl.Initialize(ba,"");
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="pnlInfo1.Initialize(\"\")";
__ref._pnlinfo1.Initialize(ba,"");
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="pnlInfo2.Initialize(\"\")";
__ref._pnlinfo2.Initialize(ba,"");
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="pnlInfo3.Initialize(\"\")";
__ref._pnlinfo3.Initialize(ba,"");
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="usernametxt.Initialize(\"\")";
__ref._usernametxt.Initialize(ba,"");
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="passwordtxt.Initialize(\"\")";
__ref._passwordtxt.Initialize(ba,"");
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="emailtxt.Initialize(\"\")";
__ref._emailtxt.Initialize(ba,"");
RDebugUtils.currentLine=7077899;
 //BA.debugLineNum = 7077899;BA.debugLine="firstnametxt.Initialize(\"\")";
__ref._firstnametxt.Initialize(ba,"");
RDebugUtils.currentLine=7077900;
 //BA.debugLineNum = 7077900;BA.debugLine="lastnametxt.Initialize(\"\")";
__ref._lastnametxt.Initialize(ba,"");
RDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="phonetxt.Initialize(\"\")";
__ref._phonetxt.Initialize(ba,"");
RDebugUtils.currentLine=7077903;
 //BA.debugLineNum = 7077903;BA.debugLine="citytxt.Initialize(\"\")";
__ref._citytxt.Initialize(ba,"");
RDebugUtils.currentLine=7077904;
 //BA.debugLineNum = 7077904;BA.debugLine="countrytxt.Initialize(\"\")";
__ref._countrytxt.Initialize(ba,"");
RDebugUtils.currentLine=7077905;
 //BA.debugLineNum = 7077905;BA.debugLine="addresstxt.Initialize(\"\")";
__ref._addresstxt.Initialize(ba,"");
RDebugUtils.currentLine=7077907;
 //BA.debugLineNum = 7077907;BA.debugLine="btnNext0.Initialize(\"NextInfo\")";
__ref._btnnext0.Initialize(ba,"NextInfo");
RDebugUtils.currentLine=7077908;
 //BA.debugLineNum = 7077908;BA.debugLine="btnNext1.Initialize(\"NextInfo1\")";
__ref._btnnext1.Initialize(ba,"NextInfo1");
RDebugUtils.currentLine=7077909;
 //BA.debugLineNum = 7077909;BA.debugLine="btnDone.Initialize(\"RegistrationDone\")";
__ref._btndone.Initialize(ba,"RegistrationDone");
RDebugUtils.currentLine=7077910;
 //BA.debugLineNum = 7077910;BA.debugLine="btnBack0.Initialize(\"BackInfo\")";
__ref._btnback0.Initialize(ba,"BackInfo");
RDebugUtils.currentLine=7077911;
 //BA.debugLineNum = 7077911;BA.debugLine="btnBack1.Initialize(\"BackInfo1\")";
__ref._btnback1.Initialize(ba,"BackInfo1");
RDebugUtils.currentLine=7077913;
 //BA.debugLineNum = 7077913;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=7077914;
 //BA.debugLineNum = 7077914;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._screenpnl.getObject()));
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return null;
}
public String  _backinfo_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "backinfo_click", false))
	 {return ((String) Debug.delegate(ba, "backinfo_click", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub BackInfo_Click";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="ShowInfo1";
__ref._showinfo1(null);
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="End Sub";
return "";
}
public String  _showinfo1(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "showinfo1", false))
	 {return ((String) Debug.delegate(ba, "showinfo1", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub ShowInfo1";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="If pnlInfo2.Visible = False Then";
if (__ref._pnlinfo2.getVisible()==__c.False) { 
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="pnlInfo2.Visible = True";
__ref._pnlinfo2.setVisible(__c.True);
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="pnlInfo2.Enabled = True";
__ref._pnlinfo2.setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="pnlInfo2.Visible = False";
__ref._pnlinfo2.setVisible(__c.False);
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="pnlInfo2.Enabled = False";
__ref._pnlinfo2.setEnabled(__c.False);
 };
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="End Sub";
return "";
}
public String  _backinfo1_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "backinfo1_click", false))
	 {return ((String) Debug.delegate(ba, "backinfo1_click", null));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub BackInfo1_Click";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="ShowInfo2";
__ref._showinfo2(null);
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public String  _showinfo2(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "showinfo2", false))
	 {return ((String) Debug.delegate(ba, "showinfo2", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub ShowInfo2";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="If pnlInfo3.Visible = False Then";
if (__ref._pnlinfo3.getVisible()==__c.False) { 
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="pnlInfo3.Visible = True";
__ref._pnlinfo3.setVisible(__c.True);
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="pnlInfo3.Enabled = True";
__ref._pnlinfo3.setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="pnlInfo3.Visible = False";
__ref._pnlinfo3.setVisible(__c.False);
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="pnlInfo3.Enabled = False";
__ref._pnlinfo3.setEnabled(__c.False);
 };
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo1(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildinfo1", false))
	 {return ((String) Debug.delegate(ba, "buildinfo1", null));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub BuildInfo1";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="pnlInfo2.Color = AppColors.DarkGray";
__ref._pnlinfo2.setColor(_appcolors._darkgray);
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="firstnametxt.Hint = \"First Name\"";
__ref._firstnametxt.setHint("First Name");
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="firstnametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._firstnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="firstnametxt.SingleLine = True";
__ref._firstnametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="lastnametxt.Hint = \"Last Name\"";
__ref._lastnametxt.setHint("Last Name");
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="lastnametxt.SingleLine = True";
__ref._lastnametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="lastnametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._lastnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="phonetxt.Hint = \"Phone\"";
__ref._phonetxt.setHint("Phone");
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="phonetxt.SingleLine = True";
__ref._phonetxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="phonetxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._phonetxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="Support.ApplyViewStyle(firstnametxt,Colors.DarkGr";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._firstnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="Support.ApplyViewStyle(lastnametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._lastnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="Support.ApplyViewStyle(phonetxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._phonetxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="btnNext1.Text = \"Next\"";
__ref._btnnext1.setText(BA.ObjectToCharSequence("Next"));
RDebugUtils.currentLine=7274514;
 //BA.debugLineNum = 7274514;BA.debugLine="btnNext1.Gravity = Gravity.CENTER";
__ref._btnnext1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="Support.ApplyViewStyle(btnNext1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnnext1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (0));
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="btnBack0.Text = \"Back\"";
__ref._btnback0.setText(BA.ObjectToCharSequence("Back"));
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="btnBack0.Gravity = Gravity.CENTER";
__ref._btnback0.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="Support.ApplyViewStyle(btnBack0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnback0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (0));
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="pnlInfo2.AddView(firstnametxt,0,0%y,UISizes.Login";
__ref._pnlinfo2.AddView((android.view.View)(__ref._firstnametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7274520;
 //BA.debugLineNum = 7274520;BA.debugLine="pnlInfo2.AddView(lastnametxt,firstnametxt.Left,fi";
__ref._pnlinfo2.AddView((android.view.View)(__ref._lastnametxt.getObject()),__ref._firstnametxt.getLeft(),(int) (__ref._firstnametxt.getTop()+__ref._firstnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="pnlInfo2.AddView(phonetxt,lastnametxt.Left,lastna";
__ref._pnlinfo2.AddView((android.view.View)(__ref._phonetxt.getObject()),__ref._lastnametxt.getLeft(),(int) (__ref._lastnametxt.getTop()+__ref._lastnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="pnlInfo2.AddView(btnNext1,UISizes.LoginScrDefault";
__ref._pnlinfo2.AddView((android.view.View)(__ref._btnnext1.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)1.9),(int) (__ref._phonetxt.getTop()+__ref._phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7274523;
 //BA.debugLineNum = 7274523;BA.debugLine="pnlInfo2.AddView(btnBack0,phonetxt.left,phonetxt.";
__ref._pnlinfo2.AddView((android.view.View)(__ref._btnback0.getObject()),__ref._phonetxt.getLeft(),(int) (__ref._phonetxt.getTop()+__ref._phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7274525;
 //BA.debugLineNum = 7274525;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo2(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildinfo2", false))
	 {return ((String) Debug.delegate(ba, "buildinfo2", null));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub BuildInfo2";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="pnlInfo3.Color = AppColors.DarkGray";
__ref._pnlinfo3.setColor(_appcolors._darkgray);
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="citytxt.Hint = \"City\"";
__ref._citytxt.setHint("City");
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="citytxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._citytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="citytxt.SingleLine = True";
__ref._citytxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="countrytxt.Hint = \"Country\"";
__ref._countrytxt.setHint("Country");
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="countrytxt.SingleLine = True";
__ref._countrytxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="countrytxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._countrytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="addresstxt.Hint = \"Address\"";
__ref._addresstxt.setHint("Address");
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="addresstxt.SingleLine = True";
__ref._addresstxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="addresstxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._addresstxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="Support.ApplyViewStyle(citytxt,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._citytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="Support.ApplyViewStyle(countrytxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._countrytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="Support.ApplyViewStyle(addresstxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._addresstxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7340049;
 //BA.debugLineNum = 7340049;BA.debugLine="btnDone.Text = \"Done\"";
__ref._btndone.setText(BA.ObjectToCharSequence("Done"));
RDebugUtils.currentLine=7340050;
 //BA.debugLineNum = 7340050;BA.debugLine="btnDone.Gravity = Gravity.CENTER";
__ref._btndone.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="Support.ApplyViewStyle(btnDone,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btndone.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (0));
RDebugUtils.currentLine=7340052;
 //BA.debugLineNum = 7340052;BA.debugLine="btnBack1.Text = \"Back\"";
__ref._btnback1.setText(BA.ObjectToCharSequence("Back"));
RDebugUtils.currentLine=7340053;
 //BA.debugLineNum = 7340053;BA.debugLine="btnBack1.Gravity = Gravity.CENTER";
__ref._btnback1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7340054;
 //BA.debugLineNum = 7340054;BA.debugLine="Support.ApplyViewStyle(btnBack1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnback1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (0));
RDebugUtils.currentLine=7340055;
 //BA.debugLineNum = 7340055;BA.debugLine="pnlInfo3.AddView(citytxt,0,0%y,UISizes.LoginScrDe";
__ref._pnlinfo3.AddView((android.view.View)(__ref._citytxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7340056;
 //BA.debugLineNum = 7340056;BA.debugLine="pnlInfo3.AddView(countrytxt,citytxt.Left,citytxt.";
__ref._pnlinfo3.AddView((android.view.View)(__ref._countrytxt.getObject()),__ref._citytxt.getLeft(),(int) (__ref._citytxt.getTop()+__ref._citytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7340057;
 //BA.debugLineNum = 7340057;BA.debugLine="pnlInfo3.AddView(addresstxt,countrytxt.Left,count";
__ref._pnlinfo3.AddView((android.view.View)(__ref._addresstxt.getObject()),__ref._countrytxt.getLeft(),(int) (__ref._countrytxt.getTop()+__ref._countrytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7340058;
 //BA.debugLineNum = 7340058;BA.debugLine="pnlInfo3.AddView(btnDone,UISizes.LoginScrDefaultW";
__ref._pnlinfo3.AddView((android.view.View)(__ref._btndone.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)1.9),(int) (__ref._addresstxt.getTop()+__ref._addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7340059;
 //BA.debugLineNum = 7340059;BA.debugLine="pnlInfo3.AddView(btnBack1,addresstxt.left,address";
__ref._pnlinfo3.AddView((android.view.View)(__ref._btnback1.getObject()),__ref._addresstxt.getLeft(),(int) (__ref._addresstxt.getTop()+__ref._addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7340061;
 //BA.debugLineNum = 7340061;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub BuildUI";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
__ref._screenpnl.setColor(_appcolors._darkgray);
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="usernametxt.Hint = \"Username\"";
__ref._usernametxt.setHint("Username");
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="usernametxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._usernametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="usernametxt.SingleLine = True";
__ref._usernametxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="passwordtxt.Hint = \"Password\"";
__ref._passwordtxt.setHint("Password");
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="passwordtxt.SingleLine = True";
__ref._passwordtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="passwordtxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._passwordtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="emailtxt.Hint = \"Email\"";
__ref._emailtxt.setHint("Email");
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="emailtxt.SingleLine = True";
__ref._emailtxt.setSingleLine(__c.True);
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="emailtxt.HintColor = Colors.ARGB(120,0,0,0)";
__ref._emailtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._usernametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._passwordtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="Support.ApplyViewStyle(emailtxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._emailtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="btnNext0.Text = \"Next\"";
__ref._btnnext0.setText(BA.ObjectToCharSequence("Next"));
RDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="btnNext0.Gravity = Gravity.CENTER";
__ref._btnnext0.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=7208979;
 //BA.debugLineNum = 7208979;BA.debugLine="Support.ApplyViewStyle(btnNext0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnnext0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (0));
RDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="BuildInfo1";
__ref._buildinfo1(null);
RDebugUtils.currentLine=7208982;
 //BA.debugLineNum = 7208982;BA.debugLine="BuildInfo2";
__ref._buildinfo2(null);
RDebugUtils.currentLine=7208984;
 //BA.debugLineNum = 7208984;BA.debugLine="ScreenPnl.AddView(pnlInfo1,UISizes.LoginScrDefaul";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo1.getObject()),_uisizes._loginscrdefaultleft,__c.PerYToCurrent((float) (30),ba),_uisizes._loginscrdefaultwidth,(int) (_uisizes._edittextdefaultheight*4+__c.PerYToCurrent((float) (4),ba)));
RDebugUtils.currentLine=7208985;
 //BA.debugLineNum = 7208985;BA.debugLine="pnlInfo1.AddView(usernametxt,0,0%y,UISizes.LoginS";
__ref._pnlinfo1.AddView((android.view.View)(__ref._usernametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7208986;
 //BA.debugLineNum = 7208986;BA.debugLine="pnlInfo1.AddView(passwordtxt,usernametxt.Left,use";
__ref._pnlinfo1.AddView((android.view.View)(__ref._passwordtxt.getObject()),__ref._usernametxt.getLeft(),(int) (__ref._usernametxt.getTop()+__ref._usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7208987;
 //BA.debugLineNum = 7208987;BA.debugLine="pnlInfo1.AddView(emailtxt,passwordtxt.Left,passwo";
__ref._pnlinfo1.AddView((android.view.View)(__ref._emailtxt.getObject()),__ref._passwordtxt.getLeft(),(int) (__ref._passwordtxt.getTop()+__ref._passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7208988;
 //BA.debugLineNum = 7208988;BA.debugLine="pnlInfo1.AddView(btnNext0,UISizes.LoginScrDefault";
__ref._pnlinfo1.AddView((android.view.View)(__ref._btnnext0.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2*0.50),(int) (__ref._emailtxt.getTop()+__ref._emailtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
RDebugUtils.currentLine=7208990;
 //BA.debugLineNum = 7208990;BA.debugLine="ScreenPnl.AddView(pnlInfo2,pnlInfo1.Left,pnlInfo1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo2.getObject()),__ref._pnlinfo1.getLeft(),__ref._pnlinfo1.getTop(),__ref._pnlinfo1.getWidth(),__ref._pnlinfo1.getHeight());
RDebugUtils.currentLine=7208991;
 //BA.debugLineNum = 7208991;BA.debugLine="pnlInfo2.Visible = False";
__ref._pnlinfo2.setVisible(__c.False);
RDebugUtils.currentLine=7208992;
 //BA.debugLineNum = 7208992;BA.debugLine="pnlInfo2.Enabled = False";
__ref._pnlinfo2.setEnabled(__c.False);
RDebugUtils.currentLine=7208994;
 //BA.debugLineNum = 7208994;BA.debugLine="ScreenPnl.AddView(pnlInfo3,pnlInfo1.Left,pnlInfo1";
__ref._screenpnl.AddView((android.view.View)(__ref._pnlinfo3.getObject()),__ref._pnlinfo1.getLeft(),__ref._pnlinfo1.getTop(),__ref._pnlinfo1.getWidth(),__ref._pnlinfo1.getHeight());
RDebugUtils.currentLine=7208995;
 //BA.debugLineNum = 7208995;BA.debugLine="pnlInfo3.Visible = False";
__ref._pnlinfo3.setVisible(__c.False);
RDebugUtils.currentLine=7208996;
 //BA.debugLineNum = 7208996;BA.debugLine="pnlInfo3.Enabled = False";
__ref._pnlinfo3.setEnabled(__c.False);
RDebugUtils.currentLine=7208997;
 //BA.debugLineNum = 7208997;BA.debugLine="End Sub";
return "";
}
public boolean  _checkformissingfields(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "checkformissingfields", false))
	 {return ((Boolean) Debug.delegate(ba, "checkformissingfields", null));}
boolean _result = false;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub CheckForMissingFields As Boolean";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Dim result As Boolean = False";
_result = __c.False;
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="If usernametxt.Text.Length > 0 Then";
if (__ref._usernametxt.getText().length()>0) { 
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="If passwordtxt.Text.Length > 0 Then";
if (__ref._passwordtxt.getText().length()>0) { 
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="If emailtxt.Text.Length > 0 Then";
if (__ref._emailtxt.getText().length()>0) { 
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="If firstnametxt.Text.Length > 0 Then";
if (__ref._firstnametxt.getText().length()>0) { 
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="If lastnametxt.Text.Length > 0 Then";
if (__ref._lastnametxt.getText().length()>0) { 
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="If phonetxt.Text.Length > 0 Then";
if (__ref._phonetxt.getText().length()>0) { 
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="If citytxt.Text.Length > 0 Then";
if (__ref._citytxt.getText().length()>0) { 
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="If countrytxt.Text.Length > 0 Then";
if (__ref._countrytxt.getText().length()>0) { 
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="If addresstxt.Text.Length > 0 Then";
if (__ref._addresstxt.getText().length()>0) { 
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="result = True";
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
RDebugUtils.currentLine=7864341;
 //BA.debugLineNum = 7864341;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=7864342;
 //BA.debugLineNum = 7864342;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Private pnlInfo1 As Panel";
_pnlinfo1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Private pnlInfo2 As Panel";
_pnlinfo2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Private pnlInfo3 As Panel";
_pnlinfo3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="Private emailtxt As EditText";
_emailtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="Private firstnametxt As EditText";
_firstnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="Private lastnametxt As EditText";
_lastnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="Private phonetxt As EditText";
_phonetxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="Private citytxt As EditText";
_citytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="Private countrytxt As EditText";
_countrytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="Private addresstxt As EditText";
_addresstxt = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=7012371;
 //BA.debugLineNum = 7012371;BA.debugLine="Private btnNext0,btnNext1,btnDone As Button";
_btnnext0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnnext1 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btndone = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="Private btnBack0,btnBack1 As Button";
_btnback0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnback1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=7012375;
 //BA.debugLineNum = 7012375;BA.debugLine="End Sub";
return "";
}
public String  _cleartextfields(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "cleartextfields", false))
	 {return ((String) Debug.delegate(ba, "cleartextfields", null));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub ClearTextFields";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="usernametxt.Text = \"\"";
__ref._usernametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="passwordtxt.Text = \"\"";
__ref._passwordtxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="emailtxt.Text = \"\"";
__ref._emailtxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="firstnametxt.Text = \"\"";
__ref._firstnametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="lastnametxt.Text = \"\"";
__ref._lastnametxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="phonetxt.Text = \"\"";
__ref._phonetxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="citytxt.Text = \"\"";
__ref._citytxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="countrytxt.Text = \"\"";
__ref._countrytxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="addresstxt.Text = \"\"";
__ref._addresstxt.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "nextinfo_click", false))
	 {return ((String) Debug.delegate(ba, "nextinfo_click", null));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub NextInfo_Click";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="ShowInfo1";
__ref._showinfo1(null);
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo1_click(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "nextinfo1_click", false))
	 {return ((String) Debug.delegate(ba, "nextinfo1_click", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub NextInfo1_Click";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="ShowInfo2";
__ref._showinfo2(null);
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Public NewCustomer As Customer";
_newcustomer = new b4a.diplomna.types._customer();
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="NewCustomer.Initialize";
_newcustomer.Initialize();
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="If CheckForMissingFields = True Then";
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
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="NewCustomer.username = usernametxt.Text";
_newcustomer.username = __ref._usernametxt.getText();
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="NewCustomer.password = passwordtxt.Text";
_newcustomer.password = __ref._passwordtxt.getText();
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="NewCustomer.email = emailtxt.Text";
_newcustomer.email = __ref._emailtxt.getText();
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="NewCustomer.FirstName = firstnametxt.Text";
_newcustomer.FirstName = __ref._firstnametxt.getText();
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="NewCustomer.LastName = lastnametxt.Text";
_newcustomer.LastName = __ref._lastnametxt.getText();
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="NewCustomer.Phone = phonetxt.Text";
_newcustomer.Phone = __ref._phonetxt.getText();
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="NewCustomer.City = citytxt.Text";
_newcustomer.City = __ref._citytxt.getText();
RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="NewCustomer.Country = countrytxt.Text";
_newcustomer.Country = __ref._countrytxt.getText();
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="NewCustomer.Address = addresstxt.Text";
_newcustomer.Address = __ref._addresstxt.getText();
RDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="Dim register As ResumableSub = Main.HTTP.Registe";
_register = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_register = parent._main._http._registernewcustomer(null,_newcustomer);
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="Wait For (register)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "registerscreen", "registrationdone_click"), _register);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (Object) result[1];
;
RDebugUtils.currentLine=7798802;
 //BA.debugLineNum = 7798802;BA.debugLine="If Main.HTTP.Output = \"401\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((parent._main._http._output).equals("401")) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=7798806;
 //BA.debugLineNum = 7798806;BA.debugLine="Else if Main.HTTP.Output = \"200\" Then";
if ((parent._main._http._output).equals("200")) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=7798803;
 //BA.debugLineNum = 7798803;BA.debugLine="Log(\"LOGIN FAILED\")";
parent.__c.LogImpl("47798803","LOGIN FAILED",0);
RDebugUtils.currentLine=7798804;
 //BA.debugLineNum = 7798804;BA.debugLine="ToastMessageShow(\"Registration failed!\",False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Registration failed!"),parent.__c.False);
RDebugUtils.currentLine=7798805;
 //BA.debugLineNum = 7798805;BA.debugLine="CallSub2(Main,\"Activity_KeyPress\",4)";
parent.__c.CallSubDebug2(ba,(Object)(parent._main.getObject()),"Activity_KeyPress",(Object)(4));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=7798807;
 //BA.debugLineNum = 7798807;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
parent.__c.CallSubDebug(ba,(Object)(parent._main.getObject()),"ShowMainScreen");
RDebugUtils.currentLine=7798808;
 //BA.debugLineNum = 7798808;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput(null);
RDebugUtils.currentLine=7798809;
 //BA.debugLineNum = 7798809;BA.debugLine="ReturnToLoginScreen";
__ref._returntologinscreen(null);
RDebugUtils.currentLine=7798810;
 //BA.debugLineNum = 7798810;BA.debugLine="ClearTextFields";
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
RDebugUtils.currentLine=7798813;
 //BA.debugLineNum = 7798813;BA.debugLine="Log(\"missing info\")";
parent.__c.LogImpl("47798813","missing info",0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=7798816;
 //BA.debugLineNum = 7798816;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub ReturnToLoginScreen";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRegisterScreen");
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="End Sub";
return "";
}
public String  _sendinfotoapi(b4a.diplomna.registerscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="registerscreen";
if (Debug.shouldDelegate(ba, "sendinfotoapi", false))
	 {return ((String) Debug.delegate(ba, "sendinfotoapi", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub SendInfoToAPI";
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="End Sub";
return "";
}
}