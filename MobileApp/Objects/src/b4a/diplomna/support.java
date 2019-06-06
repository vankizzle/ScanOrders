package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class support {
private static support mostCurrent = new support();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _ip = "";
public static String _port = "";
public static String _address = "";
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static String  _applyviewstyle(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _control,int _textcolor,int _colora,int _colorb,int _colorpresseda,int _colorpressedb,int _colordisableda,int _colordisabledb,int _cornerround) throws Exception{
RDebugUtils.currentModule="support";
if (Debug.shouldDelegate(null, "applyviewstyle", false))
	 {return ((String) Debug.delegate(null, "applyviewstyle", new Object[] {_ba,_control,_textcolor,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround}));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.EditTextWrapper _txt = null;
anywheresoftware.b4a.objects.SpinnerWrapper _sp = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub ApplyViewStyle (Control As View, TextCo";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="If Control Is Button Then";
if (_control.getObjectOrNull() instanceof android.widget.Button) { 
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Dim btn As Button = Control";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn.setObject((android.widget.Button)(_control.getObject()));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="btn.TextColor = TextColor";
_btn.setTextColor(_textcolor);
 };
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="If Control Is EditText Then";
if (_control.getObjectOrNull() instanceof android.widget.EditText) { 
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Dim txt As EditText = Control";
_txt = new anywheresoftware.b4a.objects.EditTextWrapper();
_txt.setObject((android.widget.EditText)(_control.getObject()));
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="txt.TextColor = TextColor";
_txt.setTextColor(_textcolor);
 };
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="If Control Is Spinner Then";
if (_control.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="Dim sp As Spinner = Control";
_sp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_sp.setObject((anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_control.getObject()));
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="sp.TextColor = TextColor";
_sp.setTextColor(_textcolor);
 };
RDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="Control.Background = Gradient(ColorA, ColorB, Col";
_control.setBackground((android.graphics.drawable.Drawable)(_gradient(_ba,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround).getObject()));
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="MinimumPadding(Control)";
_minimumpadding(_ba,(Object)(_control.getObject()));
RDebugUtils.currentLine=5505044;
 //BA.debugLineNum = 5505044;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.StateListDrawable  _gradient(anywheresoftware.b4a.BA _ba,int _colora,int _colorb,int _colorpresseda,int _colorpressedb,int _colordisableda,int _colordisabledb,int _cornerround) throws Exception{
RDebugUtils.currentModule="support";
if (Debug.shouldDelegate(null, "gradient", false))
	 {return ((anywheresoftware.b4a.objects.drawable.StateListDrawable) Debug.delegate(null, "gradient", new Object[] {_ba,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround}));}
int[] _colsenabled = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwenabled = null;
int[] _colspressed = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwpressed = null;
int[] _colsdisabled = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwdisabled = null;
anywheresoftware.b4a.objects.drawable.StateListDrawable _stdgradient = null;
int[] _states = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub Gradient(ColorA As Int, ColorB As Int,";
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Dim colsEnabled(2) As Int";
_colsenabled = new int[(int) (2)];
;
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="colsEnabled(0) = ColorA";
_colsenabled[(int) (0)] = _colora;
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="colsEnabled(1) = ColorB";
_colsenabled[(int) (1)] = _colorb;
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="Dim gdwEnabled As GradientDrawable";
_gdwenabled = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="gdwEnabled.Initialize(\"TOP_BOTTOM\", colsEnabled)";
_gdwenabled.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colsenabled);
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="gdwEnabled.CornerRadius = CornerRound";
_gdwenabled.setCornerRadius((float) (_cornerround));
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="Dim colsPressed(2) As Int";
_colspressed = new int[(int) (2)];
;
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="colsPressed(0) = ColorPressedA";
_colspressed[(int) (0)] = _colorpresseda;
RDebugUtils.currentLine=5570575;
 //BA.debugLineNum = 5570575;BA.debugLine="colsPressed(1) = ColorPressedB";
_colspressed[(int) (1)] = _colorpressedb;
RDebugUtils.currentLine=5570578;
 //BA.debugLineNum = 5570578;BA.debugLine="Dim gdwPressed As GradientDrawable";
_gdwpressed = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=5570580;
 //BA.debugLineNum = 5570580;BA.debugLine="gdwPressed.Initialize(\"TOP_BOTTOM\", colsPressed)";
_gdwpressed.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colspressed);
RDebugUtils.currentLine=5570581;
 //BA.debugLineNum = 5570581;BA.debugLine="gdwPressed.CornerRadius = CornerRound";
_gdwpressed.setCornerRadius((float) (_cornerround));
RDebugUtils.currentLine=5570584;
 //BA.debugLineNum = 5570584;BA.debugLine="Dim colsDisabled(2) As Int";
_colsdisabled = new int[(int) (2)];
;
RDebugUtils.currentLine=5570585;
 //BA.debugLineNum = 5570585;BA.debugLine="colsDisabled(0) = ColorDisabledA";
_colsdisabled[(int) (0)] = _colordisableda;
RDebugUtils.currentLine=5570586;
 //BA.debugLineNum = 5570586;BA.debugLine="colsDisabled(1) = ColorDisabledB";
_colsdisabled[(int) (1)] = _colordisabledb;
RDebugUtils.currentLine=5570589;
 //BA.debugLineNum = 5570589;BA.debugLine="Dim gdwDisabled As GradientDrawable";
_gdwdisabled = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=5570590;
 //BA.debugLineNum = 5570590;BA.debugLine="gdwDisabled.Initialize(\"TOP_BOTTOM\", colsDisabled";
_gdwdisabled.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colsdisabled);
RDebugUtils.currentLine=5570591;
 //BA.debugLineNum = 5570591;BA.debugLine="gdwDisabled.CornerRadius = CornerRound";
_gdwdisabled.setCornerRadius((float) (_cornerround));
RDebugUtils.currentLine=5570594;
 //BA.debugLineNum = 5570594;BA.debugLine="Dim stdGradient As StateListDrawable";
_stdgradient = new anywheresoftware.b4a.objects.drawable.StateListDrawable();
RDebugUtils.currentLine=5570595;
 //BA.debugLineNum = 5570595;BA.debugLine="stdGradient.Initialize";
_stdgradient.Initialize();
RDebugUtils.currentLine=5570596;
 //BA.debugLineNum = 5570596;BA.debugLine="Dim states(2) As Int";
_states = new int[(int) (2)];
;
RDebugUtils.currentLine=5570597;
 //BA.debugLineNum = 5570597;BA.debugLine="states(0) = stdGradient.State_Enabled";
_states[(int) (0)] = _stdgradient.State_Enabled;
RDebugUtils.currentLine=5570598;
 //BA.debugLineNum = 5570598;BA.debugLine="states(1) = -stdGradient.State_Pressed";
_states[(int) (1)] = (int) (-_stdgradient.State_Pressed);
RDebugUtils.currentLine=5570599;
 //BA.debugLineNum = 5570599;BA.debugLine="stdGradient.addState2(states, gdwEnabled)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwenabled.getObject()));
RDebugUtils.currentLine=5570600;
 //BA.debugLineNum = 5570600;BA.debugLine="Dim states(1) As Int";
_states = new int[(int) (1)];
;
RDebugUtils.currentLine=5570601;
 //BA.debugLineNum = 5570601;BA.debugLine="states(0) = stdGradient.State_Pressed";
_states[(int) (0)] = _stdgradient.State_Pressed;
RDebugUtils.currentLine=5570602;
 //BA.debugLineNum = 5570602;BA.debugLine="stdGradient.addState2(states, gdwPressed)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwpressed.getObject()));
RDebugUtils.currentLine=5570603;
 //BA.debugLineNum = 5570603;BA.debugLine="Dim states(1) As Int";
_states = new int[(int) (1)];
;
RDebugUtils.currentLine=5570604;
 //BA.debugLineNum = 5570604;BA.debugLine="states(0) = stdGradient.State_Disabled";
_states[(int) (0)] = _stdgradient.State_Disabled;
RDebugUtils.currentLine=5570605;
 //BA.debugLineNum = 5570605;BA.debugLine="stdGradient.addState2(states, gdwDisabled)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwdisabled.getObject()));
RDebugUtils.currentLine=5570607;
 //BA.debugLineNum = 5570607;BA.debugLine="Return stdGradient";
if (true) return _stdgradient;
RDebugUtils.currentLine=5570608;
 //BA.debugLineNum = 5570608;BA.debugLine="End Sub";
return null;
}
public static String  _minimumpadding(anywheresoftware.b4a.BA _ba,Object _myobj) throws Exception{
RDebugUtils.currentModule="support";
if (Debug.shouldDelegate(null, "minimumpadding", false))
	 {return ((String) Debug.delegate(null, "minimumpadding", new Object[] {_ba,_myobj}));}
int _paddingtopbottom = 0;
int _paddingleftright = 0;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub MinimumPadding(MyObj As Object)";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim PaddingTopBottom = 1dip, PaddingLeftRight = 5";
_paddingtopbottom = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1));
_paddingleftright = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5));
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="r.Target = MyObj";
_r.Target = _myobj;
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="r.RunMethod4(\"setPadding\", Array As Object(Paddin";
_r.RunMethod4("setPadding",new Object[]{(Object)(_paddingleftright),(Object)(_paddingtopbottom),(Object)(_paddingleftright),(Object)(_paddingtopbottom)},new String[]{"java.lang.int","java.lang.int","java.lang.int","java.lang.int"});
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="End Sub";
return "";
}
}