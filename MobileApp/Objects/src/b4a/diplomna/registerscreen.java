package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class registerscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.registerscreen");
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
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub AsView As View";
 //BA.debugLineNum = 56;BA.debugLine="Return ScreenPnl";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_screenpnl.getObject()));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public String  _backinfo_click() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Public Sub BackInfo_Click";
 //BA.debugLineNum = 166;BA.debugLine="ShowInfo1";
_showinfo1();
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public String  _backinfo1_click() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Public Sub BackInfo1_Click";
 //BA.debugLineNum = 174;BA.debugLine="ShowInfo2";
_showinfo2();
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo1() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub BuildInfo1";
 //BA.debugLineNum = 100;BA.debugLine="pnlInfo2.Color = Colors.white";
_pnlinfo2.setColor(__c.Colors.White);
 //BA.debugLineNum = 102;BA.debugLine="firstnametxt.Hint = \"First Name\"";
_firstnametxt.setHint("First Name");
 //BA.debugLineNum = 103;BA.debugLine="firstnametxt.HintColor = Colors.ARGB(120,0,0,0)";
_firstnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 104;BA.debugLine="firstnametxt.SingleLine = True";
_firstnametxt.setSingleLine(__c.True);
 //BA.debugLineNum = 105;BA.debugLine="lastnametxt.Hint = \"Last Name\"";
_lastnametxt.setHint("Last Name");
 //BA.debugLineNum = 106;BA.debugLine="lastnametxt.SingleLine = True";
_lastnametxt.setSingleLine(__c.True);
 //BA.debugLineNum = 107;BA.debugLine="lastnametxt.HintColor = Colors.ARGB(120,0,0,0)";
_lastnametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 108;BA.debugLine="phonetxt.Hint = \"Phone\"";
_phonetxt.setHint("Phone");
 //BA.debugLineNum = 109;BA.debugLine="phonetxt.SingleLine = True";
_phonetxt.setSingleLine(__c.True);
 //BA.debugLineNum = 110;BA.debugLine="phonetxt.HintColor = Colors.ARGB(120,0,0,0)";
_phonetxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 112;BA.debugLine="Support.ApplyViewStyle(firstnametxt,Colors.DarkGr";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_firstnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 113;BA.debugLine="Support.ApplyViewStyle(lastnametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lastnametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 114;BA.debugLine="Support.ApplyViewStyle(phonetxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_phonetxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 116;BA.debugLine="btnNext1.Text = \"Next\"";
_btnnext1.setText(BA.ObjectToCharSequence("Next"));
 //BA.debugLineNum = 117;BA.debugLine="btnNext1.Gravity = Gravity.CENTER";
_btnnext1.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 118;BA.debugLine="Support.ApplyViewStyle(btnNext1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnnext1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 119;BA.debugLine="btnBack0.Text = \"Back\"";
_btnback0.setText(BA.ObjectToCharSequence("Back"));
 //BA.debugLineNum = 120;BA.debugLine="btnBack0.Gravity = Gravity.CENTER";
_btnback0.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 121;BA.debugLine="Support.ApplyViewStyle(btnBack0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnback0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 122;BA.debugLine="pnlInfo2.AddView(firstnametxt,0,0%y,UISizes.Login";
_pnlinfo2.AddView((android.view.View)(_firstnametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 123;BA.debugLine="pnlInfo2.AddView(lastnametxt,firstnametxt.Left,fi";
_pnlinfo2.AddView((android.view.View)(_lastnametxt.getObject()),_firstnametxt.getLeft(),(int) (_firstnametxt.getTop()+_firstnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 124;BA.debugLine="pnlInfo2.AddView(phonetxt,lastnametxt.Left,lastna";
_pnlinfo2.AddView((android.view.View)(_phonetxt.getObject()),_lastnametxt.getLeft(),(int) (_lastnametxt.getTop()+_lastnametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 125;BA.debugLine="pnlInfo2.AddView(btnNext1,UISizes.LoginScrDefault";
_pnlinfo2.AddView((android.view.View)(_btnnext1.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2),(int) (_phonetxt.getTop()+_phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 126;BA.debugLine="pnlInfo2.AddView(btnBack0,phonetxt.left,phonetxt.";
_pnlinfo2.AddView((android.view.View)(_btnback0.getObject()),_phonetxt.getLeft(),(int) (_phonetxt.getTop()+_phonetxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _buildinfo2() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub BuildInfo2";
 //BA.debugLineNum = 131;BA.debugLine="pnlInfo3.Color = Colors.white";
_pnlinfo3.setColor(__c.Colors.White);
 //BA.debugLineNum = 133;BA.debugLine="citytxt.Hint = \"City\"";
_citytxt.setHint("City");
 //BA.debugLineNum = 134;BA.debugLine="citytxt.HintColor = Colors.ARGB(120,0,0,0)";
_citytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 135;BA.debugLine="citytxt.SingleLine = True";
_citytxt.setSingleLine(__c.True);
 //BA.debugLineNum = 136;BA.debugLine="countrytxt.Hint = \"Country\"";
_countrytxt.setHint("Country");
 //BA.debugLineNum = 137;BA.debugLine="countrytxt.SingleLine = True";
_countrytxt.setSingleLine(__c.True);
 //BA.debugLineNum = 138;BA.debugLine="countrytxt.HintColor = Colors.ARGB(120,0,0,0)";
_countrytxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 139;BA.debugLine="addresstxt.Hint = \"Address\"";
_addresstxt.setHint("Address");
 //BA.debugLineNum = 140;BA.debugLine="addresstxt.SingleLine = True";
_addresstxt.setSingleLine(__c.True);
 //BA.debugLineNum = 141;BA.debugLine="addresstxt.HintColor = Colors.ARGB(120,0,0,0)";
_addresstxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 143;BA.debugLine="Support.ApplyViewStyle(citytxt,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_citytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 144;BA.debugLine="Support.ApplyViewStyle(countrytxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_countrytxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 145;BA.debugLine="Support.ApplyViewStyle(addresstxt,Colors.DarkGray";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_addresstxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 147;BA.debugLine="btnDone.Text = \"Done\"";
_btndone.setText(BA.ObjectToCharSequence("Done"));
 //BA.debugLineNum = 148;BA.debugLine="btnDone.Gravity = Gravity.CENTER";
_btndone.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 149;BA.debugLine="Support.ApplyViewStyle(btnDone,Colors.DarkGray,Co";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btndone.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 150;BA.debugLine="btnBack1.Text = \"Back\"";
_btnback1.setText(BA.ObjectToCharSequence("Back"));
 //BA.debugLineNum = 151;BA.debugLine="btnBack1.Gravity = Gravity.CENTER";
_btnback1.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 152;BA.debugLine="Support.ApplyViewStyle(btnBack1,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnback1.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 153;BA.debugLine="pnlInfo3.AddView(citytxt,0,0%y,UISizes.LoginScrDe";
_pnlinfo3.AddView((android.view.View)(_citytxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 154;BA.debugLine="pnlInfo3.AddView(countrytxt,citytxt.Left,citytxt.";
_pnlinfo3.AddView((android.view.View)(_countrytxt.getObject()),_citytxt.getLeft(),(int) (_citytxt.getTop()+_citytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 155;BA.debugLine="pnlInfo3.AddView(addresstxt,countrytxt.Left,count";
_pnlinfo3.AddView((android.view.View)(_addresstxt.getObject()),_countrytxt.getLeft(),(int) (_countrytxt.getTop()+_countrytxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 156;BA.debugLine="pnlInfo3.AddView(btnDone,UISizes.LoginScrDefaultW";
_pnlinfo3.AddView((android.view.View)(_btndone.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2),(int) (_addresstxt.getTop()+_addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 157;BA.debugLine="pnlInfo3.AddView(btnBack1,addresstxt.left,address";
_pnlinfo3.AddView((android.view.View)(_btnback1.getObject()),_addresstxt.getLeft(),(int) (_addresstxt.getTop()+_addresstxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub BuildUI";
 //BA.debugLineNum = 60;BA.debugLine="ScreenPnl.Color = Colors.white";
_screenpnl.setColor(__c.Colors.White);
 //BA.debugLineNum = 62;BA.debugLine="usernametxt.Hint = \"Username\"";
_usernametxt.setHint("Username");
 //BA.debugLineNum = 63;BA.debugLine="usernametxt.HintColor = Colors.ARGB(120,0,0,0)";
_usernametxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 64;BA.debugLine="usernametxt.SingleLine = True";
_usernametxt.setSingleLine(__c.True);
 //BA.debugLineNum = 65;BA.debugLine="passwordtxt.Hint = \"Password\"";
_passwordtxt.setHint("Password");
 //BA.debugLineNum = 66;BA.debugLine="passwordtxt.SingleLine = True";
_passwordtxt.setSingleLine(__c.True);
 //BA.debugLineNum = 67;BA.debugLine="passwordtxt.HintColor = Colors.ARGB(120,0,0,0)";
_passwordtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 68;BA.debugLine="emailtxt.Hint = \"Email\"";
_emailtxt.setHint("Email");
 //BA.debugLineNum = 69;BA.debugLine="emailtxt.SingleLine = True";
_emailtxt.setSingleLine(__c.True);
 //BA.debugLineNum = 70;BA.debugLine="emailtxt.HintColor = Colors.ARGB(120,0,0,0)";
_emailtxt.setHintColor(__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 72;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_usernametxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 73;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_passwordtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 74;BA.debugLine="Support.ApplyViewStyle(emailtxt,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_emailtxt.getObject())),__c.Colors.DarkGray,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 76;BA.debugLine="btnNext0.Text = \"Next\"";
_btnnext0.setText(BA.ObjectToCharSequence("Next"));
 //BA.debugLineNum = 77;BA.debugLine="btnNext0.Gravity = Gravity.CENTER";
_btnnext0.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 78;BA.debugLine="Support.ApplyViewStyle(btnNext0,Colors.DarkGray,C";
_support._applyviewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnnext0.getObject())),__c.Colors.DarkGray,__c.Colors.Gray,__c.Colors.White,__c.Colors.DarkGray,__c.Colors.White,__c.Colors.White,__c.Colors.White,(int) (20));
 //BA.debugLineNum = 80;BA.debugLine="BuildInfo1";
_buildinfo1();
 //BA.debugLineNum = 81;BA.debugLine="BuildInfo2";
_buildinfo2();
 //BA.debugLineNum = 83;BA.debugLine="ScreenPnl.AddView(pnlInfo1,UISizes.LoginScrDefaul";
_screenpnl.AddView((android.view.View)(_pnlinfo1.getObject()),_uisizes._loginscrdefaultleft,__c.PerYToCurrent((float) (30),ba),_uisizes._loginscrdefaultwidth,(int) (_uisizes._edittextdefaultheight*4+__c.PerYToCurrent((float) (4),ba)));
 //BA.debugLineNum = 84;BA.debugLine="pnlInfo1.AddView(usernametxt,0,0%y,UISizes.LoginS";
_pnlinfo1.AddView((android.view.View)(_usernametxt.getObject()),(int) (0),__c.PerYToCurrent((float) (0),ba),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 85;BA.debugLine="pnlInfo1.AddView(passwordtxt,usernametxt.Left,use";
_pnlinfo1.AddView((android.view.View)(_passwordtxt.getObject()),_usernametxt.getLeft(),(int) (_usernametxt.getTop()+_usernametxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 86;BA.debugLine="pnlInfo1.AddView(emailtxt,passwordtxt.Left,passwo";
_pnlinfo1.AddView((android.view.View)(_emailtxt.getObject()),_passwordtxt.getLeft(),(int) (_passwordtxt.getTop()+_passwordtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),_uisizes._loginscrdefaultwidth,_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 87;BA.debugLine="pnlInfo1.AddView(btnNext0,UISizes.LoginScrDefault";
_pnlinfo1.AddView((android.view.View)(_btnnext0.getObject()),(int) (_uisizes._loginscrdefaultwidth/(double)2*0.50),(int) (_emailtxt.getTop()+_emailtxt.getHeight()+__c.PerYToCurrent((float) (1),ba)),(int) (_uisizes._loginscrdefaultwidth/(double)2),_uisizes._edittextdefaultheight);
 //BA.debugLineNum = 89;BA.debugLine="ScreenPnl.AddView(pnlInfo2,pnlInfo1.Left,pnlInfo1";
_screenpnl.AddView((android.view.View)(_pnlinfo2.getObject()),_pnlinfo1.getLeft(),_pnlinfo1.getTop(),_pnlinfo1.getWidth(),_pnlinfo1.getHeight());
 //BA.debugLineNum = 90;BA.debugLine="pnlInfo2.Visible = False";
_pnlinfo2.setVisible(__c.False);
 //BA.debugLineNum = 91;BA.debugLine="pnlInfo2.Enabled = False";
_pnlinfo2.setEnabled(__c.False);
 //BA.debugLineNum = 93;BA.debugLine="ScreenPnl.AddView(pnlInfo3,pnlInfo1.Left,pnlInfo1";
_screenpnl.AddView((android.view.View)(_pnlinfo3.getObject()),_pnlinfo1.getLeft(),_pnlinfo1.getTop(),_pnlinfo1.getWidth(),_pnlinfo1.getHeight());
 //BA.debugLineNum = 94;BA.debugLine="pnlInfo3.Visible = False";
_pnlinfo3.setVisible(__c.False);
 //BA.debugLineNum = 95;BA.debugLine="pnlInfo3.Enabled = False";
_pnlinfo3.setEnabled(__c.False);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public boolean  _checkformissingfields() throws Exception{
boolean _result = false;
 //BA.debugLineNum = 238;BA.debugLine="Public Sub CheckForMissingFields As Boolean";
 //BA.debugLineNum = 239;BA.debugLine="Dim result As Boolean = False";
_result = __c.False;
 //BA.debugLineNum = 240;BA.debugLine="If usernametxt.Text.Length > 0 Then";
if (_usernametxt.getText().length()>0) { 
 //BA.debugLineNum = 241;BA.debugLine="If passwordtxt.Text.Length > 0 Then";
if (_passwordtxt.getText().length()>0) { 
 //BA.debugLineNum = 242;BA.debugLine="If emailtxt.Text.Length > 0 Then";
if (_emailtxt.getText().length()>0) { 
 //BA.debugLineNum = 243;BA.debugLine="If firstnametxt.Text.Length > 0 Then";
if (_firstnametxt.getText().length()>0) { 
 //BA.debugLineNum = 244;BA.debugLine="If lastnametxt.Text.Length > 0 Then";
if (_lastnametxt.getText().length()>0) { 
 //BA.debugLineNum = 245;BA.debugLine="If phonetxt.Text.Length > 0 Then";
if (_phonetxt.getText().length()>0) { 
 //BA.debugLineNum = 246;BA.debugLine="If citytxt.Text.Length > 0 Then";
if (_citytxt.getText().length()>0) { 
 //BA.debugLineNum = 247;BA.debugLine="If countrytxt.Text.Length > 0 Then";
if (_countrytxt.getText().length()>0) { 
 //BA.debugLineNum = 248;BA.debugLine="If addresstxt.Text.Length > 0 Then";
if (_addresstxt.getText().length()>0) { 
 //BA.debugLineNum = 249;BA.debugLine="result = True";
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
 //BA.debugLineNum = 259;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
_screenpnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private pnlInfo1 As Panel";
_pnlinfo1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private pnlInfo2 As Panel";
_pnlinfo2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private pnlInfo3 As Panel";
_pnlinfo3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private usernametxt As EditText";
_usernametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private passwordtxt As EditText";
_passwordtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private emailtxt As EditText";
_emailtxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private firstnametxt As EditText";
_firstnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private lastnametxt As EditText";
_lastnametxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private phonetxt As EditText";
_phonetxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private citytxt As EditText";
_citytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private countrytxt As EditText";
_countrytxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private addresstxt As EditText";
_addresstxt = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private btnNext0,btnNext1,btnDone As Button";
_btnnext0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnnext1 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btndone = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private btnBack0,btnBack1 As Button";
_btnback0 = new anywheresoftware.b4a.objects.ButtonWrapper();
_btnback1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _cleartextfields() throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Public Sub ClearTextFields";
 //BA.debugLineNum = 267;BA.debugLine="usernametxt.Text = \"\"";
_usernametxt.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 268;BA.debugLine="passwordtxt.Text = \"\"";
_passwordtxt.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 269;BA.debugLine="emailtxt.Text = \"\"";
_emailtxt.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 270;BA.debugLine="firstnametxt.Text = \"\"";
_firstnametxt.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 271;BA.debugLine="lastnametxt.Text = \"\"";
_lastnametxt.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 272;BA.debugLine="phonetxt.Text = \"\"";
_phonetxt.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 273;BA.debugLine="citytxt.Text = \"\"";
_citytxt.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 274;BA.debugLine="countrytxt.Text = \"\"";
_countrytxt.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 275;BA.debugLine="addresstxt.Text = \"\"";
_addresstxt.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 28;BA.debugLine="ScreenPnl.Initialize(\"\")";
_screenpnl.Initialize(ba,"");
 //BA.debugLineNum = 30;BA.debugLine="pnlInfo1.Initialize(\"\")";
_pnlinfo1.Initialize(ba,"");
 //BA.debugLineNum = 31;BA.debugLine="pnlInfo2.Initialize(\"\")";
_pnlinfo2.Initialize(ba,"");
 //BA.debugLineNum = 32;BA.debugLine="pnlInfo3.Initialize(\"\")";
_pnlinfo3.Initialize(ba,"");
 //BA.debugLineNum = 34;BA.debugLine="usernametxt.Initialize(\"\")";
_usernametxt.Initialize(ba,"");
 //BA.debugLineNum = 35;BA.debugLine="passwordtxt.Initialize(\"\")";
_passwordtxt.Initialize(ba,"");
 //BA.debugLineNum = 36;BA.debugLine="emailtxt.Initialize(\"\")";
_emailtxt.Initialize(ba,"");
 //BA.debugLineNum = 38;BA.debugLine="firstnametxt.Initialize(\"\")";
_firstnametxt.Initialize(ba,"");
 //BA.debugLineNum = 39;BA.debugLine="lastnametxt.Initialize(\"\")";
_lastnametxt.Initialize(ba,"");
 //BA.debugLineNum = 40;BA.debugLine="phonetxt.Initialize(\"\")";
_phonetxt.Initialize(ba,"");
 //BA.debugLineNum = 42;BA.debugLine="citytxt.Initialize(\"\")";
_citytxt.Initialize(ba,"");
 //BA.debugLineNum = 43;BA.debugLine="countrytxt.Initialize(\"\")";
_countrytxt.Initialize(ba,"");
 //BA.debugLineNum = 44;BA.debugLine="addresstxt.Initialize(\"\")";
_addresstxt.Initialize(ba,"");
 //BA.debugLineNum = 46;BA.debugLine="btnNext0.Initialize(\"NextInfo\")";
_btnnext0.Initialize(ba,"NextInfo");
 //BA.debugLineNum = 47;BA.debugLine="btnNext1.Initialize(\"NextInfo1\")";
_btnnext1.Initialize(ba,"NextInfo1");
 //BA.debugLineNum = 48;BA.debugLine="btnDone.Initialize(\"RegistrationDone\")";
_btndone.Initialize(ba,"RegistrationDone");
 //BA.debugLineNum = 49;BA.debugLine="btnBack0.Initialize(\"BackInfo\")";
_btnback0.Initialize(ba,"BackInfo");
 //BA.debugLineNum = 50;BA.debugLine="btnBack1.Initialize(\"BackInfo1\")";
_btnback1.Initialize(ba,"BackInfo1");
 //BA.debugLineNum = 52;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo_click() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Public Sub NextInfo_Click";
 //BA.debugLineNum = 162;BA.debugLine="ShowInfo1";
_showinfo1();
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _nextinfo1_click() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Public Sub NextInfo1_Click";
 //BA.debugLineNum = 170;BA.debugLine="ShowInfo2";
_showinfo2();
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public void  _registrationdone_click() throws Exception{
ResumableSub_RegistrationDone_Click rsub = new ResumableSub_RegistrationDone_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RegistrationDone_Click extends BA.ResumableSub {
public ResumableSub_RegistrationDone_Click(b4a.diplomna.registerscreen parent) {
this.parent = parent;
}
b4a.diplomna.registerscreen parent;
b4a.diplomna.types._customer _newcustomer = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _register = null;
Object _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 199;BA.debugLine="usernametxt.Text = \"test\"";
parent._usernametxt.setText(BA.ObjectToCharSequence("test"));
 //BA.debugLineNum = 200;BA.debugLine="passwordtxt.Text = \"test\"";
parent._passwordtxt.setText(BA.ObjectToCharSequence("test"));
 //BA.debugLineNum = 201;BA.debugLine="emailtxt.Text = \"test\"";
parent._emailtxt.setText(BA.ObjectToCharSequence("test"));
 //BA.debugLineNum = 202;BA.debugLine="firstnametxt.Text = \"test\"";
parent._firstnametxt.setText(BA.ObjectToCharSequence("test"));
 //BA.debugLineNum = 203;BA.debugLine="lastnametxt.Text = \"test\"";
parent._lastnametxt.setText(BA.ObjectToCharSequence("test"));
 //BA.debugLineNum = 204;BA.debugLine="phonetxt.Text  = \"test\"";
parent._phonetxt.setText(BA.ObjectToCharSequence("test"));
 //BA.debugLineNum = 205;BA.debugLine="citytxt.Text = \"test\"";
parent._citytxt.setText(BA.ObjectToCharSequence("test"));
 //BA.debugLineNum = 206;BA.debugLine="countrytxt.Text = \"test\"";
parent._countrytxt.setText(BA.ObjectToCharSequence("test"));
 //BA.debugLineNum = 207;BA.debugLine="addresstxt.Text = \"test\"";
parent._addresstxt.setText(BA.ObjectToCharSequence("test"));
 //BA.debugLineNum = 209;BA.debugLine="Public NewCustomer As Customer";
_newcustomer = new b4a.diplomna.types._customer();
 //BA.debugLineNum = 210;BA.debugLine="NewCustomer.Initialize";
_newcustomer.Initialize();
 //BA.debugLineNum = 212;BA.debugLine="If CheckForMissingFields = True Then";
if (true) break;

case 1:
//if
this.state = 12;
if (parent._checkformissingfields()==parent.__c.True) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 213;BA.debugLine="NewCustomer.username = usernametxt.Text";
_newcustomer.username = parent._usernametxt.getText();
 //BA.debugLineNum = 214;BA.debugLine="NewCustomer.password = passwordtxt.Text";
_newcustomer.password = parent._passwordtxt.getText();
 //BA.debugLineNum = 215;BA.debugLine="NewCustomer.email = emailtxt.Text";
_newcustomer.email = parent._emailtxt.getText();
 //BA.debugLineNum = 216;BA.debugLine="NewCustomer.FirstName = firstnametxt.Text";
_newcustomer.FirstName = parent._firstnametxt.getText();
 //BA.debugLineNum = 217;BA.debugLine="NewCustomer.LastName = lastnametxt.Text";
_newcustomer.LastName = parent._lastnametxt.getText();
 //BA.debugLineNum = 218;BA.debugLine="NewCustomer.Phone = phonetxt.Text";
_newcustomer.Phone = parent._phonetxt.getText();
 //BA.debugLineNum = 219;BA.debugLine="NewCustomer.City = citytxt.Text";
_newcustomer.City = parent._citytxt.getText();
 //BA.debugLineNum = 220;BA.debugLine="NewCustomer.Country = countrytxt.Text";
_newcustomer.Country = parent._countrytxt.getText();
 //BA.debugLineNum = 221;BA.debugLine="NewCustomer.Address = addresstxt.Text";
_newcustomer.Address = parent._addresstxt.getText();
 //BA.debugLineNum = 223;BA.debugLine="Dim register As ResumableSub = Main.HTTP.Registe";
_register = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_register = parent._main._http._registernewcustomer(_newcustomer);
 //BA.debugLineNum = 224;BA.debugLine="Wait For (register)  Complete (Result As Object)";
parent.__c.WaitFor("complete", ba, this, _register);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (Object) result[0];
;
 //BA.debugLineNum = 225;BA.debugLine="If Main.HTTP.Output = \"Satus_Code:401\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((parent._main._http._output).equals("Satus_Code:401")) { 
this.state = 6;
}else if((parent._main._http._output).equals("Satus_Code:200")) { 
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 226;BA.debugLine="Log(\"LOGIN FAILED\")";
parent.__c.LogImpl("57143453","LOGIN FAILED",0);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 228;BA.debugLine="CallSub(Main,\"ShowMainScreen\")";
parent.__c.CallSubNew(ba,(Object)(parent._main.getObject()),"ShowMainScreen");
 //BA.debugLineNum = 229;BA.debugLine="Main.HTTP.ClearOuput";
parent._main._http._clearouput();
 //BA.debugLineNum = 230;BA.debugLine="ReturnToLoginScreen";
parent._returntologinscreen();
 //BA.debugLineNum = 231;BA.debugLine="ClearTextFields";
parent._cleartextfields();
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 234;BA.debugLine="Log(\"missing info\")";
parent.__c.LogImpl("57143461","missing info",0);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(Object _result) throws Exception{
}
public String  _returntologinscreen() throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Public Sub ReturnToLoginScreen";
 //BA.debugLineNum = 263;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowRegisterScreen");
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return "";
}
public String  _sendinfotoapi() throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Public Sub SendInfoToAPI";
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _showinfo1() throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub ShowInfo1";
 //BA.debugLineNum = 178;BA.debugLine="If pnlInfo2.Visible = False Then";
if (_pnlinfo2.getVisible()==__c.False) { 
 //BA.debugLineNum = 179;BA.debugLine="pnlInfo2.Visible = True";
_pnlinfo2.setVisible(__c.True);
 //BA.debugLineNum = 180;BA.debugLine="pnlInfo2.Enabled = True";
_pnlinfo2.setEnabled(__c.True);
 }else {
 //BA.debugLineNum = 182;BA.debugLine="pnlInfo2.Visible = False";
_pnlinfo2.setVisible(__c.False);
 //BA.debugLineNum = 183;BA.debugLine="pnlInfo2.Enabled = False";
_pnlinfo2.setEnabled(__c.False);
 };
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _showinfo2() throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Public Sub ShowInfo2";
 //BA.debugLineNum = 188;BA.debugLine="If pnlInfo3.Visible = False Then";
if (_pnlinfo3.getVisible()==__c.False) { 
 //BA.debugLineNum = 189;BA.debugLine="pnlInfo3.Visible = True";
_pnlinfo3.setVisible(__c.True);
 //BA.debugLineNum = 190;BA.debugLine="pnlInfo3.Enabled = True";
_pnlinfo3.setEnabled(__c.True);
 }else {
 //BA.debugLineNum = 192;BA.debugLine="pnlInfo3.Visible = False";
_pnlinfo3.setVisible(__c.False);
 //BA.debugLineNum = 193;BA.debugLine="pnlInfo3.Enabled = False";
_pnlinfo3.setEnabled(__c.False);
 };
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
