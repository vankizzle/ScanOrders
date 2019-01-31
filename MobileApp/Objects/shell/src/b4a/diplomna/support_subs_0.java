package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class support_subs_0 {


public static RemoteObject  _applyviewstyle(RemoteObject _ba,RemoteObject _control,RemoteObject _textcolor,RemoteObject _colora,RemoteObject _colorb,RemoteObject _colorpresseda,RemoteObject _colorpressedb,RemoteObject _colordisableda,RemoteObject _colordisabledb,RemoteObject _cornerround) throws Exception{
try {
		Debug.PushSubsStack("ApplyViewStyle (support) ","support",17,_ba,support.mostCurrent,10);
if (RapidSub.canDelegate("applyviewstyle")) { return b4a.diplomna.support.remoteMe.runUserSub(false, "support","applyviewstyle", _ba, _control, _textcolor, _colora, _colorb, _colorpresseda, _colorpressedb, _colordisableda, _colordisabledb, _cornerround);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _txt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
;
Debug.locals.put("Control", _control);
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("ColorA", _colora);
Debug.locals.put("ColorB", _colorb);
Debug.locals.put("ColorPressedA", _colorpresseda);
Debug.locals.put("ColorPressedB", _colorpressedb);
Debug.locals.put("ColorDisabledA", _colordisableda);
Debug.locals.put("ColorDisabledB", _colordisabledb);
Debug.locals.put("CornerRound", _cornerround);
 BA.debugLineNum = 10;BA.debugLine="Public Sub ApplyViewStyle (Control As View, TextCo";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="If Control Is Button Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("i",_control.getObjectOrNull(), RemoteObject.createImmutable("android.widget.Button"))) { 
 BA.debugLineNum = 13;BA.debugLine="Dim btn As Button = Control";
Debug.ShouldStop(4096);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn.setObject(_control.getObject());Debug.locals.put("btn", _btn);
 BA.debugLineNum = 14;BA.debugLine="btn.TextColor = TextColor";
Debug.ShouldStop(8192);
_btn.runMethod(true,"setTextColor",_textcolor);
 };
 BA.debugLineNum = 17;BA.debugLine="If Control Is EditText Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("i",_control.getObjectOrNull(), RemoteObject.createImmutable("android.widget.EditText"))) { 
 BA.debugLineNum = 18;BA.debugLine="Dim txt As EditText = Control";
Debug.ShouldStop(131072);
_txt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_txt.setObject(_control.getObject());Debug.locals.put("txt", _txt);
 BA.debugLineNum = 19;BA.debugLine="txt.TextColor = TextColor";
Debug.ShouldStop(262144);
_txt.runMethod(true,"setTextColor",_textcolor);
 };
 BA.debugLineNum = 22;BA.debugLine="If Control Is Spinner Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("i",_control.getObjectOrNull(), RemoteObject.createImmutable("anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner"))) { 
 BA.debugLineNum = 23;BA.debugLine="Dim sp As Spinner = Control";
Debug.ShouldStop(4194304);
_sp = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
_sp.setObject(_control.getObject());Debug.locals.put("sp", _sp);
 BA.debugLineNum = 24;BA.debugLine="sp.TextColor = TextColor";
Debug.ShouldStop(8388608);
_sp.runMethod(true,"setTextColor",_textcolor);
 };
 BA.debugLineNum = 28;BA.debugLine="Control.Background = Gradient(ColorA, ColorB, Col";
Debug.ShouldStop(134217728);
_control.runMethod(false,"setBackground",(_gradient(_ba,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround).getObject()));
 BA.debugLineNum = 29;BA.debugLine="MinimumPadding(Control)";
Debug.ShouldStop(268435456);
_minimumpadding(_ba,(_control.getObject()));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gradient(RemoteObject _ba,RemoteObject _colora,RemoteObject _colorb,RemoteObject _colorpresseda,RemoteObject _colorpressedb,RemoteObject _colordisableda,RemoteObject _colordisabledb,RemoteObject _cornerround) throws Exception{
try {
		Debug.PushSubsStack("Gradient (support) ","support",17,_ba,support.mostCurrent,33);
if (RapidSub.canDelegate("gradient")) { return b4a.diplomna.support.remoteMe.runUserSub(false, "support","gradient", _ba, _colora, _colorb, _colorpresseda, _colorpressedb, _colordisableda, _colordisabledb, _cornerround);}
RemoteObject _colsenabled = null;
RemoteObject _gdwenabled = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _colspressed = null;
RemoteObject _gdwpressed = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _colsdisabled = null;
RemoteObject _gdwdisabled = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _stdgradient = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.StateListDrawable");
RemoteObject _states = null;
;
Debug.locals.put("ColorA", _colora);
Debug.locals.put("ColorB", _colorb);
Debug.locals.put("ColorPressedA", _colorpresseda);
Debug.locals.put("ColorPressedB", _colorpressedb);
Debug.locals.put("ColorDisabledA", _colordisableda);
Debug.locals.put("ColorDisabledB", _colordisabledb);
Debug.locals.put("CornerRound", _cornerround);
 BA.debugLineNum = 33;BA.debugLine="Private Sub Gradient(ColorA As Int, ColorB As Int,";
Debug.ShouldStop(1);
 BA.debugLineNum = 36;BA.debugLine="Dim colsEnabled(2) As Int";
Debug.ShouldStop(8);
_colsenabled = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colsEnabled", _colsenabled);
 BA.debugLineNum = 38;BA.debugLine="colsEnabled(0) = ColorA";
Debug.ShouldStop(32);
_colsenabled.setArrayElement (_colora,BA.numberCast(int.class, 0));
 BA.debugLineNum = 39;BA.debugLine="colsEnabled(1) = ColorB";
Debug.ShouldStop(64);
_colsenabled.setArrayElement (_colorb,BA.numberCast(int.class, 1));
 BA.debugLineNum = 41;BA.debugLine="Dim gdwEnabled As GradientDrawable";
Debug.ShouldStop(256);
_gdwenabled = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gdwEnabled", _gdwenabled);
 BA.debugLineNum = 42;BA.debugLine="gdwEnabled.Initialize(\"TOP_BOTTOM\", colsEnabled)";
Debug.ShouldStop(512);
_gdwenabled.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_colsenabled));
 BA.debugLineNum = 43;BA.debugLine="gdwEnabled.CornerRadius = CornerRound";
Debug.ShouldStop(1024);
_gdwenabled.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _cornerround));
 BA.debugLineNum = 46;BA.debugLine="Dim colsPressed(2) As Int";
Debug.ShouldStop(8192);
_colspressed = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colsPressed", _colspressed);
 BA.debugLineNum = 47;BA.debugLine="colsPressed(0) = ColorPressedA";
Debug.ShouldStop(16384);
_colspressed.setArrayElement (_colorpresseda,BA.numberCast(int.class, 0));
 BA.debugLineNum = 48;BA.debugLine="colsPressed(1) = ColorPressedB";
Debug.ShouldStop(32768);
_colspressed.setArrayElement (_colorpressedb,BA.numberCast(int.class, 1));
 BA.debugLineNum = 51;BA.debugLine="Dim gdwPressed As GradientDrawable";
Debug.ShouldStop(262144);
_gdwpressed = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gdwPressed", _gdwpressed);
 BA.debugLineNum = 53;BA.debugLine="gdwPressed.Initialize(\"TOP_BOTTOM\", colsPressed)";
Debug.ShouldStop(1048576);
_gdwpressed.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_colspressed));
 BA.debugLineNum = 54;BA.debugLine="gdwPressed.CornerRadius = CornerRound";
Debug.ShouldStop(2097152);
_gdwpressed.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _cornerround));
 BA.debugLineNum = 57;BA.debugLine="Dim colsDisabled(2) As Int";
Debug.ShouldStop(16777216);
_colsdisabled = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colsDisabled", _colsdisabled);
 BA.debugLineNum = 58;BA.debugLine="colsDisabled(0) = ColorDisabledA";
Debug.ShouldStop(33554432);
_colsdisabled.setArrayElement (_colordisableda,BA.numberCast(int.class, 0));
 BA.debugLineNum = 59;BA.debugLine="colsDisabled(1) = ColorDisabledB";
Debug.ShouldStop(67108864);
_colsdisabled.setArrayElement (_colordisabledb,BA.numberCast(int.class, 1));
 BA.debugLineNum = 62;BA.debugLine="Dim gdwDisabled As GradientDrawable";
Debug.ShouldStop(536870912);
_gdwdisabled = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gdwDisabled", _gdwdisabled);
 BA.debugLineNum = 63;BA.debugLine="gdwDisabled.Initialize(\"TOP_BOTTOM\", colsDisabled";
Debug.ShouldStop(1073741824);
_gdwdisabled.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_colsdisabled));
 BA.debugLineNum = 64;BA.debugLine="gdwDisabled.CornerRadius = CornerRound";
Debug.ShouldStop(-2147483648);
_gdwdisabled.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _cornerround));
 BA.debugLineNum = 67;BA.debugLine="Dim stdGradient As StateListDrawable";
Debug.ShouldStop(4);
_stdgradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.StateListDrawable");Debug.locals.put("stdGradient", _stdgradient);
 BA.debugLineNum = 68;BA.debugLine="stdGradient.Initialize";
Debug.ShouldStop(8);
_stdgradient.runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="Dim states(2) As Int";
Debug.ShouldStop(16);
_states = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("states", _states);
 BA.debugLineNum = 70;BA.debugLine="states(0) = stdGradient.State_Enabled";
Debug.ShouldStop(32);
_states.setArrayElement (_stdgradient.getField(true,"State_Enabled"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 71;BA.debugLine="states(1) = -stdGradient.State_Pressed";
Debug.ShouldStop(64);
_states.setArrayElement (BA.numberCast(int.class, -(double) (0 + _stdgradient.getField(true,"State_Pressed").<Integer>get().intValue())),BA.numberCast(int.class, 1));
 BA.debugLineNum = 72;BA.debugLine="stdGradient.addState2(states, gdwEnabled)";
Debug.ShouldStop(128);
_stdgradient.runVoidMethod ("AddState2",(Object)(_states),(Object)((_gdwenabled.getObject())));
 BA.debugLineNum = 73;BA.debugLine="Dim states(1) As Int";
Debug.ShouldStop(256);
_states = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("states", _states);
 BA.debugLineNum = 74;BA.debugLine="states(0) = stdGradient.State_Pressed";
Debug.ShouldStop(512);
_states.setArrayElement (_stdgradient.getField(true,"State_Pressed"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 75;BA.debugLine="stdGradient.addState2(states, gdwPressed)";
Debug.ShouldStop(1024);
_stdgradient.runVoidMethod ("AddState2",(Object)(_states),(Object)((_gdwpressed.getObject())));
 BA.debugLineNum = 76;BA.debugLine="Dim states(1) As Int";
Debug.ShouldStop(2048);
_states = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("states", _states);
 BA.debugLineNum = 77;BA.debugLine="states(0) = stdGradient.State_Disabled";
Debug.ShouldStop(4096);
_states.setArrayElement (_stdgradient.getField(true,"State_Disabled"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 78;BA.debugLine="stdGradient.addState2(states, gdwDisabled)";
Debug.ShouldStop(8192);
_stdgradient.runVoidMethod ("AddState2",(Object)(_states),(Object)((_gdwdisabled.getObject())));
 BA.debugLineNum = 80;BA.debugLine="Return stdGradient";
Debug.ShouldStop(32768);
if (true) return _stdgradient;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _minimumpadding(RemoteObject _ba,RemoteObject _myobj) throws Exception{
try {
		Debug.PushSubsStack("MinimumPadding (support) ","support",17,_ba,support.mostCurrent,83);
if (RapidSub.canDelegate("minimumpadding")) { return b4a.diplomna.support.remoteMe.runUserSub(false, "support","minimumpadding", _ba, _myobj);}
RemoteObject _paddingtopbottom = RemoteObject.createImmutable(0);
RemoteObject _paddingleftright = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("MyObj", _myobj);
 BA.debugLineNum = 83;BA.debugLine="Public Sub MinimumPadding(MyObj As Object)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Dim PaddingTopBottom = 1dip, PaddingLeftRight = 5";
Debug.ShouldStop(524288);
_paddingtopbottom = support.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("PaddingTopBottom", _paddingtopbottom);Debug.locals.put("PaddingTopBottom", _paddingtopbottom);
_paddingleftright = support.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("PaddingLeftRight", _paddingleftright);Debug.locals.put("PaddingLeftRight", _paddingleftright);
 BA.debugLineNum = 85;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1048576);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 86;BA.debugLine="r.Target = MyObj";
Debug.ShouldStop(2097152);
_r.setField ("Target",_myobj);
 BA.debugLineNum = 87;BA.debugLine="r.RunMethod4(\"setPadding\", Array As Object(Paddin";
Debug.ShouldStop(4194304);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_paddingleftright),(_paddingtopbottom),(_paddingleftright),(_paddingtopbottom)})),(Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public IP As String = \"192.168.63.163\"";
support._ip = BA.ObjectToString("192.168.63.163");
 //BA.debugLineNum = 7;BA.debugLine="Public Port As String = \"1948\"";
support._port = BA.ObjectToString("1948");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}