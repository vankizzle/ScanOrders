package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class registerscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "registerscreen","asview", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Return ScreenPnl";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_screenpnl").getObject());
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backinfo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BackInfo_Click (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("backinfo_click")) { return __ref.runUserSub(false, "registerscreen","backinfo_click", __ref);}
 BA.debugLineNum = 165;BA.debugLine="Public Sub BackInfo_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="ShowInfo1";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_showinfo1");
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backinfo1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BackInfo1_Click (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("backinfo1_click")) { return __ref.runUserSub(false, "registerscreen","backinfo1_click", __ref);}
 BA.debugLineNum = 173;BA.debugLine="Public Sub BackInfo1_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="ShowInfo2";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_showinfo2");
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildinfo1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildInfo1 (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("buildinfo1")) { return __ref.runUserSub(false, "registerscreen","buildinfo1", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Public Sub BuildInfo1";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="pnlInfo2.Color = Colors.white";
Debug.ShouldStop(8);
__ref.getField(false,"_pnlinfo2").runVoidMethod ("setColor",registerscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 102;BA.debugLine="firstnametxt.Hint = \"First Name\"";
Debug.ShouldStop(32);
__ref.getField(false,"_firstnametxt").runMethod(true,"setHint",BA.ObjectToString("First Name"));
 BA.debugLineNum = 103;BA.debugLine="firstnametxt.HintColor = Colors.ARGB(120,0,0,0)";
Debug.ShouldStop(64);
__ref.getField(false,"_firstnametxt").runMethod(true,"setHintColor",registerscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 104;BA.debugLine="firstnametxt.SingleLine = True";
Debug.ShouldStop(128);
__ref.getField(false,"_firstnametxt").runVoidMethod ("setSingleLine",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 105;BA.debugLine="lastnametxt.Hint = \"Last Name\"";
Debug.ShouldStop(256);
__ref.getField(false,"_lastnametxt").runMethod(true,"setHint",BA.ObjectToString("Last Name"));
 BA.debugLineNum = 106;BA.debugLine="lastnametxt.SingleLine = True";
Debug.ShouldStop(512);
__ref.getField(false,"_lastnametxt").runVoidMethod ("setSingleLine",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 107;BA.debugLine="lastnametxt.HintColor = Colors.ARGB(120,0,0,0)";
Debug.ShouldStop(1024);
__ref.getField(false,"_lastnametxt").runMethod(true,"setHintColor",registerscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 108;BA.debugLine="phonetxt.Hint = \"Phone\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_phonetxt").runMethod(true,"setHint",BA.ObjectToString("Phone"));
 BA.debugLineNum = 109;BA.debugLine="phonetxt.SingleLine = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_phonetxt").runVoidMethod ("setSingleLine",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="phonetxt.HintColor = Colors.ARGB(120,0,0,0)";
Debug.ShouldStop(8192);
__ref.getField(false,"_phonetxt").runMethod(true,"setHintColor",registerscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 112;BA.debugLine="Support.ApplyViewStyle(firstnametxt,Colors.DarkGr";
Debug.ShouldStop(32768);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_firstnametxt").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 113;BA.debugLine="Support.ApplyViewStyle(lastnametxt,Colors.DarkGra";
Debug.ShouldStop(65536);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_lastnametxt").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 114;BA.debugLine="Support.ApplyViewStyle(phonetxt,Colors.DarkGray,C";
Debug.ShouldStop(131072);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_phonetxt").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 116;BA.debugLine="btnNext1.Text = \"Next\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnnext1").runMethod(true,"setText",BA.ObjectToCharSequence("Next"));
 BA.debugLineNum = 117;BA.debugLine="btnNext1.Gravity = Gravity.CENTER";
Debug.ShouldStop(1048576);
__ref.getField(false,"_btnnext1").runMethod(true,"setGravity",registerscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 118;BA.debugLine="Support.ApplyViewStyle(btnNext1,Colors.DarkGray,C";
Debug.ShouldStop(2097152);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnnext1").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 119;BA.debugLine="btnBack0.Text = \"Back\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnback0").runMethod(true,"setText",BA.ObjectToCharSequence("Back"));
 BA.debugLineNum = 120;BA.debugLine="btnBack0.Gravity = Gravity.CENTER";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnback0").runMethod(true,"setGravity",registerscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 121;BA.debugLine="Support.ApplyViewStyle(btnBack0,Colors.DarkGray,C";
Debug.ShouldStop(16777216);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnback0").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 122;BA.debugLine="pnlInfo2.AddView(firstnametxt,0,0%y,UISizes.Login";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlinfo2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_firstnametxt").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 123;BA.debugLine="pnlInfo2.AddView(lastnametxt,firstnametxt.Left,fi";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlinfo2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lastnametxt").getObject())),(Object)(__ref.getField(false,"_firstnametxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_firstnametxt").runMethod(true,"getTop"),__ref.getField(false,"_firstnametxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 124;BA.debugLine="pnlInfo2.AddView(phonetxt,lastnametxt.Left,lastna";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlinfo2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_phonetxt").getObject())),(Object)(__ref.getField(false,"_lastnametxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lastnametxt").runMethod(true,"getTop"),__ref.getField(false,"_lastnametxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 125;BA.debugLine="pnlInfo2.AddView(btnNext1,UISizes.LoginScrDefault";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlinfo2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnnext1").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {registerscreen._uisizes._loginscrdefaultwidth,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_phonetxt").runMethod(true,"getTop"),__ref.getField(false,"_phonetxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {registerscreen._uisizes._loginscrdefaultwidth,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 126;BA.debugLine="pnlInfo2.AddView(btnBack0,phonetxt.left,phonetxt.";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlinfo2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnback0").getObject())),(Object)(__ref.getField(false,"_phonetxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_phonetxt").runMethod(true,"getTop"),__ref.getField(false,"_phonetxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {registerscreen._uisizes._loginscrdefaultwidth,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildinfo2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildInfo2 (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("buildinfo2")) { return __ref.runUserSub(false, "registerscreen","buildinfo2", __ref);}
 BA.debugLineNum = 130;BA.debugLine="Public Sub BuildInfo2";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="pnlInfo3.Color = Colors.white";
Debug.ShouldStop(4);
__ref.getField(false,"_pnlinfo3").runVoidMethod ("setColor",registerscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 133;BA.debugLine="citytxt.Hint = \"City\"";
Debug.ShouldStop(16);
__ref.getField(false,"_citytxt").runMethod(true,"setHint",BA.ObjectToString("City"));
 BA.debugLineNum = 134;BA.debugLine="citytxt.HintColor = Colors.ARGB(120,0,0,0)";
Debug.ShouldStop(32);
__ref.getField(false,"_citytxt").runMethod(true,"setHintColor",registerscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 135;BA.debugLine="citytxt.SingleLine = True";
Debug.ShouldStop(64);
__ref.getField(false,"_citytxt").runVoidMethod ("setSingleLine",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 136;BA.debugLine="countrytxt.Hint = \"Country\"";
Debug.ShouldStop(128);
__ref.getField(false,"_countrytxt").runMethod(true,"setHint",BA.ObjectToString("Country"));
 BA.debugLineNum = 137;BA.debugLine="countrytxt.SingleLine = True";
Debug.ShouldStop(256);
__ref.getField(false,"_countrytxt").runVoidMethod ("setSingleLine",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 138;BA.debugLine="countrytxt.HintColor = Colors.ARGB(120,0,0,0)";
Debug.ShouldStop(512);
__ref.getField(false,"_countrytxt").runMethod(true,"setHintColor",registerscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 139;BA.debugLine="addresstxt.Hint = \"Address\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_addresstxt").runMethod(true,"setHint",BA.ObjectToString("Address"));
 BA.debugLineNum = 140;BA.debugLine="addresstxt.SingleLine = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_addresstxt").runVoidMethod ("setSingleLine",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 141;BA.debugLine="addresstxt.HintColor = Colors.ARGB(120,0,0,0)";
Debug.ShouldStop(4096);
__ref.getField(false,"_addresstxt").runMethod(true,"setHintColor",registerscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 143;BA.debugLine="Support.ApplyViewStyle(citytxt,Colors.DarkGray,Co";
Debug.ShouldStop(16384);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_citytxt").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 144;BA.debugLine="Support.ApplyViewStyle(countrytxt,Colors.DarkGray";
Debug.ShouldStop(32768);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_countrytxt").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 145;BA.debugLine="Support.ApplyViewStyle(addresstxt,Colors.DarkGray";
Debug.ShouldStop(65536);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_addresstxt").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 147;BA.debugLine="btnDone.Text = \"Done\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_btndone").runMethod(true,"setText",BA.ObjectToCharSequence("Done"));
 BA.debugLineNum = 148;BA.debugLine="btnDone.Gravity = Gravity.CENTER";
Debug.ShouldStop(524288);
__ref.getField(false,"_btndone").runMethod(true,"setGravity",registerscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 149;BA.debugLine="Support.ApplyViewStyle(btnDone,Colors.DarkGray,Co";
Debug.ShouldStop(1048576);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btndone").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 150;BA.debugLine="btnBack1.Text = \"Back\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btnback1").runMethod(true,"setText",BA.ObjectToCharSequence("Back"));
 BA.debugLineNum = 151;BA.debugLine="btnBack1.Gravity = Gravity.CENTER";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnback1").runMethod(true,"setGravity",registerscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 152;BA.debugLine="Support.ApplyViewStyle(btnBack1,Colors.DarkGray,C";
Debug.ShouldStop(8388608);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnback1").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 153;BA.debugLine="pnlInfo3.AddView(citytxt,0,0%y,UISizes.LoginScrDe";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlinfo3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_citytxt").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 154;BA.debugLine="pnlInfo3.AddView(countrytxt,citytxt.Left,citytxt.";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlinfo3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_countrytxt").getObject())),(Object)(__ref.getField(false,"_citytxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_citytxt").runMethod(true,"getTop"),__ref.getField(false,"_citytxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 155;BA.debugLine="pnlInfo3.AddView(addresstxt,countrytxt.Left,count";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlinfo3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_addresstxt").getObject())),(Object)(__ref.getField(false,"_countrytxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_countrytxt").runMethod(true,"getTop"),__ref.getField(false,"_countrytxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 156;BA.debugLine="pnlInfo3.AddView(btnDone,UISizes.LoginScrDefaultW";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlinfo3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btndone").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {registerscreen._uisizes._loginscrdefaultwidth,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_addresstxt").runMethod(true,"getTop"),__ref.getField(false,"_addresstxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {registerscreen._uisizes._loginscrdefaultwidth,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 157;BA.debugLine="pnlInfo3.AddView(btnBack1,addresstxt.left,address";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlinfo3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnback1").getObject())),(Object)(__ref.getField(false,"_addresstxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_addresstxt").runMethod(true,"getTop"),__ref.getField(false,"_addresstxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {registerscreen._uisizes._loginscrdefaultwidth,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "registerscreen","buildui", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="ScreenPnl.Color = Colors.white";
Debug.ShouldStop(134217728);
__ref.getField(false,"_screenpnl").runVoidMethod ("setColor",registerscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 62;BA.debugLine="usernametxt.Hint = \"Username\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_usernametxt").runMethod(true,"setHint",BA.ObjectToString("Username"));
 BA.debugLineNum = 63;BA.debugLine="usernametxt.HintColor = Colors.ARGB(120,0,0,0)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_usernametxt").runMethod(true,"setHintColor",registerscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 64;BA.debugLine="usernametxt.SingleLine = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_usernametxt").runVoidMethod ("setSingleLine",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="passwordtxt.Hint = \"Password\"";
Debug.ShouldStop(1);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHint",BA.ObjectToString("Password"));
 BA.debugLineNum = 66;BA.debugLine="passwordtxt.SingleLine = True";
Debug.ShouldStop(2);
__ref.getField(false,"_passwordtxt").runVoidMethod ("setSingleLine",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="passwordtxt.HintColor = Colors.ARGB(120,0,0,0)";
Debug.ShouldStop(4);
__ref.getField(false,"_passwordtxt").runMethod(true,"setHintColor",registerscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 68;BA.debugLine="emailtxt.Hint = \"Email\"";
Debug.ShouldStop(8);
__ref.getField(false,"_emailtxt").runMethod(true,"setHint",BA.ObjectToString("Email"));
 BA.debugLineNum = 69;BA.debugLine="emailtxt.SingleLine = True";
Debug.ShouldStop(16);
__ref.getField(false,"_emailtxt").runVoidMethod ("setSingleLine",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 70;BA.debugLine="emailtxt.HintColor = Colors.ARGB(120,0,0,0)";
Debug.ShouldStop(32);
__ref.getField(false,"_emailtxt").runMethod(true,"setHintColor",registerscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 72;BA.debugLine="Support.ApplyViewStyle(usernametxt,Colors.DarkGra";
Debug.ShouldStop(128);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_usernametxt").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 73;BA.debugLine="Support.ApplyViewStyle(passwordtxt,Colors.DarkGra";
Debug.ShouldStop(256);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_passwordtxt").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 74;BA.debugLine="Support.ApplyViewStyle(emailtxt,Colors.DarkGray,C";
Debug.ShouldStop(512);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_emailtxt").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 76;BA.debugLine="btnNext0.Text = \"Next\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_btnnext0").runMethod(true,"setText",BA.ObjectToCharSequence("Next"));
 BA.debugLineNum = 77;BA.debugLine="btnNext0.Gravity = Gravity.CENTER";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnnext0").runMethod(true,"setGravity",registerscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 78;BA.debugLine="Support.ApplyViewStyle(btnNext0,Colors.DarkGray,C";
Debug.ShouldStop(8192);
registerscreen._support.runVoidMethod ("_applyviewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnnext0").getObject()),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(registerscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 80;BA.debugLine="BuildInfo1";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_buildinfo1");
 BA.debugLineNum = 81;BA.debugLine="BuildInfo2";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_buildinfo2");
 BA.debugLineNum = 83;BA.debugLine="ScreenPnl.AddView(pnlInfo1,UISizes.LoginScrDefaul";
Debug.ShouldStop(262144);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlinfo1").getObject())),(Object)(registerscreen._uisizes._loginscrdefaultleft),(Object)(registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(RemoteObject.solve(new RemoteObject[] {registerscreen._uisizes._edittextdefaultheight,RemoteObject.createImmutable(4),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),__ref.getField(false, "ba"))}, "*+",1, 1)));
 BA.debugLineNum = 84;BA.debugLine="pnlInfo1.AddView(usernametxt,0,0%y,UISizes.LoginS";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlinfo1").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernametxt").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 85;BA.debugLine="pnlInfo1.AddView(passwordtxt,usernametxt.Left,use";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnlinfo1").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_passwordtxt").getObject())),(Object)(__ref.getField(false,"_usernametxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_usernametxt").runMethod(true,"getTop"),__ref.getField(false,"_usernametxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 86;BA.debugLine="pnlInfo1.AddView(emailtxt,passwordtxt.Left,passwo";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnlinfo1").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_emailtxt").getObject())),(Object)(__ref.getField(false,"_passwordtxt").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_passwordtxt").runMethod(true,"getTop"),__ref.getField(false,"_passwordtxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(registerscreen._uisizes._loginscrdefaultwidth),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 87;BA.debugLine="pnlInfo1.AddView(btnNext0,UISizes.LoginScrDefault";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlinfo1").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnnext0").getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {registerscreen._uisizes._loginscrdefaultwidth,RemoteObject.createImmutable(2),RemoteObject.createImmutable(0.50)}, "/*",0, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_emailtxt").runMethod(true,"getTop"),__ref.getField(false,"_emailtxt").runMethod(true,"getHeight"),registerscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "++",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {registerscreen._uisizes._loginscrdefaultwidth,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(registerscreen._uisizes._edittextdefaultheight));
 BA.debugLineNum = 89;BA.debugLine="ScreenPnl.AddView(pnlInfo2,pnlInfo1.Left,pnlInfo1";
Debug.ShouldStop(16777216);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlinfo2").getObject())),(Object)(__ref.getField(false,"_pnlinfo1").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pnlinfo1").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pnlinfo1").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnlinfo1").runMethod(true,"getHeight")));
 BA.debugLineNum = 90;BA.debugLine="pnlInfo2.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlinfo2").runMethod(true,"setVisible",registerscreen.__c.getField(true,"False"));
 BA.debugLineNum = 91;BA.debugLine="pnlInfo2.Enabled = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlinfo2").runMethod(true,"setEnabled",registerscreen.__c.getField(true,"False"));
 BA.debugLineNum = 93;BA.debugLine="ScreenPnl.AddView(pnlInfo3,pnlInfo1.Left,pnlInfo1";
Debug.ShouldStop(268435456);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlinfo3").getObject())),(Object)(__ref.getField(false,"_pnlinfo1").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pnlinfo1").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pnlinfo1").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnlinfo1").runMethod(true,"getHeight")));
 BA.debugLineNum = 94;BA.debugLine="pnlInfo3.Visible = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlinfo3").runMethod(true,"setVisible",registerscreen.__c.getField(true,"False"));
 BA.debugLineNum = 95;BA.debugLine="pnlInfo3.Enabled = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlinfo3").runMethod(true,"setEnabled",registerscreen.__c.getField(true,"False"));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkformissingfields(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckForMissingFields (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("checkformissingfields")) { return __ref.runUserSub(false, "registerscreen","checkformissingfields", __ref);}
RemoteObject _result = RemoteObject.createImmutable(false);
 BA.debugLineNum = 221;BA.debugLine="Public Sub CheckForMissingFields As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="Dim result As Boolean = False";
Debug.ShouldStop(536870912);
_result = registerscreen.__c.getField(true,"False");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 223;BA.debugLine="If usernametxt.Text.Length > 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_usernametxt").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 224;BA.debugLine="If passwordtxt.Text.Length > 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_passwordtxt").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 225;BA.debugLine="If emailtxt.Text.Length > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_emailtxt").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 226;BA.debugLine="If firstnametxt.Text.Length > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_firstnametxt").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 227;BA.debugLine="If lastnametxt.Text.Length > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lastnametxt").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 228;BA.debugLine="If phonetxt.Text.Length > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_phonetxt").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 229;BA.debugLine="If citytxt.Text.Length > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_citytxt").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 230;BA.debugLine="If countrytxt.Text.Length > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_countrytxt").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 231;BA.debugLine="If addresstxt.Text.Length > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_addresstxt").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 232;BA.debugLine="result = True";
Debug.ShouldStop(128);
_result = registerscreen.__c.getField(true,"True");Debug.locals.put("result", _result);
 };
 };
 };
 };
 };
 };
 };
 };
 };
 BA.debugLineNum = 242;BA.debugLine="Return result";
Debug.ShouldStop(131072);
if (true) return _result;
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
registerscreen._screenpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_screenpnl",registerscreen._screenpnl);
 //BA.debugLineNum = 4;BA.debugLine="Private pnlInfo1 As Panel";
registerscreen._pnlinfo1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlinfo1",registerscreen._pnlinfo1);
 //BA.debugLineNum = 5;BA.debugLine="Private pnlInfo2 As Panel";
registerscreen._pnlinfo2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlinfo2",registerscreen._pnlinfo2);
 //BA.debugLineNum = 6;BA.debugLine="Private pnlInfo3 As Panel";
registerscreen._pnlinfo3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlinfo3",registerscreen._pnlinfo3);
 //BA.debugLineNum = 8;BA.debugLine="Private usernametxt As EditText";
registerscreen._usernametxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_usernametxt",registerscreen._usernametxt);
 //BA.debugLineNum = 9;BA.debugLine="Private passwordtxt As EditText";
registerscreen._passwordtxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_passwordtxt",registerscreen._passwordtxt);
 //BA.debugLineNum = 10;BA.debugLine="Private emailtxt As EditText";
registerscreen._emailtxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_emailtxt",registerscreen._emailtxt);
 //BA.debugLineNum = 12;BA.debugLine="Private firstnametxt As EditText";
registerscreen._firstnametxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_firstnametxt",registerscreen._firstnametxt);
 //BA.debugLineNum = 13;BA.debugLine="Private lastnametxt As EditText";
registerscreen._lastnametxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_lastnametxt",registerscreen._lastnametxt);
 //BA.debugLineNum = 14;BA.debugLine="Private phonetxt As EditText";
registerscreen._phonetxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_phonetxt",registerscreen._phonetxt);
 //BA.debugLineNum = 16;BA.debugLine="Private citytxt As EditText";
registerscreen._citytxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_citytxt",registerscreen._citytxt);
 //BA.debugLineNum = 17;BA.debugLine="Private countrytxt As EditText";
registerscreen._countrytxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_countrytxt",registerscreen._countrytxt);
 //BA.debugLineNum = 18;BA.debugLine="Private addresstxt As EditText";
registerscreen._addresstxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_addresstxt",registerscreen._addresstxt);
 //BA.debugLineNum = 20;BA.debugLine="Private btnNext0,btnNext1,btnDone As Button";
registerscreen._btnnext0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnnext0",registerscreen._btnnext0);
registerscreen._btnnext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnnext1",registerscreen._btnnext1);
registerscreen._btndone = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btndone",registerscreen._btndone);
 //BA.debugLineNum = 22;BA.debugLine="Private btnBack0,btnBack1 As Button";
registerscreen._btnback0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnback0",registerscreen._btnback0);
registerscreen._btnback1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnback1",registerscreen._btnback1);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleartextfields(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearTextFields (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("cleartextfields")) { return __ref.runUserSub(false, "registerscreen","cleartextfields", __ref);}
 BA.debugLineNum = 249;BA.debugLine="Public Sub ClearTextFields";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="usernametxt.Text = \"\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_usernametxt").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 251;BA.debugLine="passwordtxt.Text = \"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_passwordtxt").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 252;BA.debugLine="emailtxt.Text = \"\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_emailtxt").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 253;BA.debugLine="firstnametxt.Text = \"\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_firstnametxt").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 254;BA.debugLine="lastnametxt.Text = \"\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lastnametxt").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 255;BA.debugLine="phonetxt.Text = \"\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_phonetxt").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 256;BA.debugLine="citytxt.Text = \"\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_citytxt").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 257;BA.debugLine="countrytxt.Text = \"\"";
Debug.ShouldStop(1);
__ref.getField(false,"_countrytxt").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 258;BA.debugLine="addresstxt.Text = \"\"";
Debug.ShouldStop(2);
__ref.getField(false,"_addresstxt").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "registerscreen","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="ScreenPnl.Initialize(\"\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_screenpnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 30;BA.debugLine="pnlInfo1.Initialize(\"\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlinfo1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 31;BA.debugLine="pnlInfo2.Initialize(\"\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlinfo2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 32;BA.debugLine="pnlInfo3.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlinfo3").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 34;BA.debugLine="usernametxt.Initialize(\"\")";
Debug.ShouldStop(2);
__ref.getField(false,"_usernametxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 35;BA.debugLine="passwordtxt.Initialize(\"\")";
Debug.ShouldStop(4);
__ref.getField(false,"_passwordtxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 36;BA.debugLine="emailtxt.Initialize(\"\")";
Debug.ShouldStop(8);
__ref.getField(false,"_emailtxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 38;BA.debugLine="firstnametxt.Initialize(\"\")";
Debug.ShouldStop(32);
__ref.getField(false,"_firstnametxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 39;BA.debugLine="lastnametxt.Initialize(\"\")";
Debug.ShouldStop(64);
__ref.getField(false,"_lastnametxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 40;BA.debugLine="phonetxt.Initialize(\"\")";
Debug.ShouldStop(128);
__ref.getField(false,"_phonetxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 42;BA.debugLine="citytxt.Initialize(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_citytxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 43;BA.debugLine="countrytxt.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_countrytxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 44;BA.debugLine="addresstxt.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_addresstxt").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 46;BA.debugLine="btnNext0.Initialize(\"NextInfo\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnnext0").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("NextInfo")));
 BA.debugLineNum = 47;BA.debugLine="btnNext1.Initialize(\"NextInfo1\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_btnnext1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("NextInfo1")));
 BA.debugLineNum = 48;BA.debugLine="btnDone.Initialize(\"RegistrationDone\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_btndone").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("RegistrationDone")));
 BA.debugLineNum = 49;BA.debugLine="btnBack0.Initialize(\"BackInfo\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_btnback0").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("BackInfo")));
 BA.debugLineNum = 50;BA.debugLine="btnBack1.Initialize(\"BackInfo1\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_btnback1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("BackInfo1")));
 BA.debugLineNum = 52;BA.debugLine="BuildUI";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_buildui");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nextinfo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NextInfo_Click (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("nextinfo_click")) { return __ref.runUserSub(false, "registerscreen","nextinfo_click", __ref);}
 BA.debugLineNum = 161;BA.debugLine="Public Sub NextInfo_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="ShowInfo1";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_showinfo1");
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nextinfo1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NextInfo1_Click (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("nextinfo1_click")) { return __ref.runUserSub(false, "registerscreen","nextinfo1_click", __ref);}
 BA.debugLineNum = 169;BA.debugLine="Public Sub NextInfo1_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="ShowInfo2";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_showinfo2");
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _registrationdone_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RegistrationDone_Click (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("registrationdone_click")) { return __ref.runUserSub(false, "registerscreen","registrationdone_click", __ref);}
RemoteObject _newcustomer = RemoteObject.declareNull("b4a.diplomna.types._customer");
 BA.debugLineNum = 197;BA.debugLine="Public Sub RegistrationDone_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 199;BA.debugLine="Public NewCustomer As Customer";
Debug.ShouldStop(64);
_newcustomer = RemoteObject.createNew ("b4a.diplomna.types._customer");Debug.locals.put("NewCustomer", _newcustomer);
 BA.debugLineNum = 200;BA.debugLine="NewCustomer.Initialize";
Debug.ShouldStop(128);
_newcustomer.runVoidMethod ("Initialize");
 BA.debugLineNum = 202;BA.debugLine="If CheckForMissingFields = True Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_checkformissingfields"),registerscreen.__c.getField(true,"True"))) { 
 BA.debugLineNum = 203;BA.debugLine="NewCustomer.username = usernametxt.Text";
Debug.ShouldStop(1024);
_newcustomer.setField ("username",__ref.getField(false,"_usernametxt").runMethod(true,"getText"));
 BA.debugLineNum = 204;BA.debugLine="NewCustomer.password = passwordtxt.Text";
Debug.ShouldStop(2048);
_newcustomer.setField ("password",__ref.getField(false,"_passwordtxt").runMethod(true,"getText"));
 BA.debugLineNum = 205;BA.debugLine="NewCustomer.email = emailtxt.Text";
Debug.ShouldStop(4096);
_newcustomer.setField ("email",__ref.getField(false,"_emailtxt").runMethod(true,"getText"));
 BA.debugLineNum = 206;BA.debugLine="NewCustomer.FirstName = firstnametxt.Text";
Debug.ShouldStop(8192);
_newcustomer.setField ("FirstName",__ref.getField(false,"_firstnametxt").runMethod(true,"getText"));
 BA.debugLineNum = 207;BA.debugLine="NewCustomer.LastName = lastnametxt.Text";
Debug.ShouldStop(16384);
_newcustomer.setField ("LastName",__ref.getField(false,"_lastnametxt").runMethod(true,"getText"));
 BA.debugLineNum = 208;BA.debugLine="NewCustomer.Phone = phonetxt.Text";
Debug.ShouldStop(32768);
_newcustomer.setField ("Phone",__ref.getField(false,"_phonetxt").runMethod(true,"getText"));
 BA.debugLineNum = 209;BA.debugLine="NewCustomer.City = citytxt.Text";
Debug.ShouldStop(65536);
_newcustomer.setField ("City",__ref.getField(false,"_citytxt").runMethod(true,"getText"));
 BA.debugLineNum = 210;BA.debugLine="NewCustomer.Country = countrytxt.Text";
Debug.ShouldStop(131072);
_newcustomer.setField ("Country",__ref.getField(false,"_countrytxt").runMethod(true,"getText"));
 BA.debugLineNum = 211;BA.debugLine="NewCustomer.Address = addresstxt.Text";
Debug.ShouldStop(262144);
_newcustomer.setField ("Address",__ref.getField(false,"_addresstxt").runMethod(true,"getText"));
 BA.debugLineNum = 212;BA.debugLine="Log(\"successfully registered\")";
Debug.ShouldStop(524288);
registerscreen.__c.runVoidMethod ("LogImpl","410878991",RemoteObject.createImmutable("successfully registered"),0);
 BA.debugLineNum = 213;BA.debugLine="Log(NewCustomer)";
Debug.ShouldStop(1048576);
registerscreen.__c.runVoidMethod ("LogImpl","410878992",BA.ObjectToString(_newcustomer),0);
 BA.debugLineNum = 214;BA.debugLine="ReturnToLoginScreen";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_returntologinscreen");
 BA.debugLineNum = 215;BA.debugLine="ClearTextFields";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.diplomna.registerscreen.class, "_cleartextfields");
 }else {
 BA.debugLineNum = 217;BA.debugLine="Log(\"missing info\")";
Debug.ShouldStop(16777216);
registerscreen.__c.runVoidMethod ("LogImpl","410878996",RemoteObject.createImmutable("missing info"),0);
 };
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _returntologinscreen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReturnToLoginScreen (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("returntologinscreen")) { return __ref.runUserSub(false, "registerscreen","returntologinscreen", __ref);}
 BA.debugLineNum = 245;BA.debugLine="Public Sub ReturnToLoginScreen";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="CallSub(Main,\"ShowRegisterScreen\")";
Debug.ShouldStop(2097152);
registerscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((registerscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowRegisterScreen")));
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendinfotoapi(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SendInfoToAPI (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("sendinfotoapi")) { return __ref.runUserSub(false, "registerscreen","sendinfotoapi", __ref);}
 BA.debugLineNum = 261;BA.debugLine="Public Sub SendInfoToAPI";
Debug.ShouldStop(16);
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showinfo1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowInfo1 (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("showinfo1")) { return __ref.runUserSub(false, "registerscreen","showinfo1", __ref);}
 BA.debugLineNum = 177;BA.debugLine="Public Sub ShowInfo1";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="If pnlInfo2.Visible = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_pnlinfo2").runMethod(true,"getVisible"),registerscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 179;BA.debugLine="pnlInfo2.Visible = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlinfo2").runMethod(true,"setVisible",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 180;BA.debugLine="pnlInfo2.Enabled = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlinfo2").runMethod(true,"setEnabled",registerscreen.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 182;BA.debugLine="pnlInfo2.Visible = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnlinfo2").runMethod(true,"setVisible",registerscreen.__c.getField(true,"False"));
 BA.debugLineNum = 183;BA.debugLine="pnlInfo2.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlinfo2").runMethod(true,"setEnabled",registerscreen.__c.getField(true,"False"));
 };
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showinfo2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowInfo2 (registerscreen) ","registerscreen",15,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("showinfo2")) { return __ref.runUserSub(false, "registerscreen","showinfo2", __ref);}
 BA.debugLineNum = 187;BA.debugLine="Public Sub ShowInfo2";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="If pnlInfo3.Visible = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_pnlinfo3").runMethod(true,"getVisible"),registerscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 189;BA.debugLine="pnlInfo3.Visible = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlinfo3").runMethod(true,"setVisible",registerscreen.__c.getField(true,"True"));
 BA.debugLineNum = 190;BA.debugLine="pnlInfo3.Enabled = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlinfo3").runMethod(true,"setEnabled",registerscreen.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 192;BA.debugLine="pnlInfo3.Visible = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlinfo3").runMethod(true,"setVisible",registerscreen.__c.getField(true,"False"));
 BA.debugLineNum = 193;BA.debugLine="pnlInfo3.Enabled = False";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlinfo3").runMethod(true,"setEnabled",registerscreen.__c.getField(true,"False"));
 };
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}