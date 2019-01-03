package b4a.example;


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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.uisizes _uisizes = null;
public static String  _applyviewstyle(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _control,int _textcolor,int _colora,int _colorb,int _colorpresseda,int _colorpressedb,int _colordisableda,int _colordisabledb,int _cornerround) throws Exception{
RDebugUtils.currentModule="support";
if (Debug.shouldDelegate(null, "applyviewstyle"))
	 {return ((String) Debug.delegate(null, "applyviewstyle", new Object[] {_ba,_control,_textcolor,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround}));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.EditTextWrapper _txt = null;
anywheresoftware.b4a.objects.SpinnerWrapper _sp = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub ApplyViewStyle (Control As View, TextCo";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="If Control Is Button Then";
if (_control.getObjectOrNull() instanceof android.widget.Button) { 
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim btn As Button = Control";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn.setObject((android.widget.Button)(_control.getObject()));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="btn.TextColor = TextColor";
_btn.setTextColor(_textcolor);
 };
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="If Control Is EditText Then";
if (_control.getObjectOrNull() instanceof android.widget.EditText) { 
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim txt As EditText = Control";
_txt = new anywheresoftware.b4a.objects.EditTextWrapper();
_txt.setObject((android.widget.EditText)(_control.getObject()));
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="txt.TextColor = TextColor";
_txt.setTextColor(_textcolor);
 };
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="If Control Is Spinner Then";
if (_control.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="Dim sp As Spinner = Control";
_sp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_sp.setObject((anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_control.getObject()));
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="sp.TextColor = TextColor";
_sp.setTextColor(_textcolor);
 };
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="Control.Background = Gradient(ColorA, ColorB, Col";
_control.setBackground((android.graphics.drawable.Drawable)(_gradient(_ba,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround).getObject()));
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="MinimumPadding(Control)";
_minimumpadding(_ba,(Object)(_control.getObject()));
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.StateListDrawable  _gradient(anywheresoftware.b4a.BA _ba,int _colora,int _colorb,int _colorpresseda,int _colorpressedb,int _colordisableda,int _colordisabledb,int _cornerround) throws Exception{
RDebugUtils.currentModule="support";
if (Debug.shouldDelegate(null, "gradient"))
	 {return ((anywheresoftware.b4a.objects.drawable.StateListDrawable) Debug.delegate(null, "gradient", new Object[] {_ba,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround}));}
int[] _colsenabled = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwenabled = null;
int[] _colspressed = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwpressed = null;
int[] _colsdisabled = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwdisabled = null;
anywheresoftware.b4a.objects.drawable.StateListDrawable _stdgradient = null;
int[] _states = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub Gradient(ColorA As Int, ColorB As Int,";
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Dim colsEnabled(2) As Int";
_colsenabled = new int[(int) (2)];
;
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="colsEnabled(0) = ColorA";
_colsenabled[(int) (0)] = _colora;
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="colsEnabled(1) = ColorB";
_colsenabled[(int) (1)] = _colorb;
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Dim gdwEnabled As GradientDrawable";
_gdwenabled = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="gdwEnabled.Initialize(\"TOP_BOTTOM\", colsEnabled)";
_gdwenabled.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colsenabled);
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="gdwEnabled.CornerRadius = CornerRound";
_gdwenabled.setCornerRadius((float) (_cornerround));
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="Dim colsPressed(2) As Int";
_colspressed = new int[(int) (2)];
;
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="colsPressed(0) = ColorPressedA";
_colspressed[(int) (0)] = _colorpresseda;
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="colsPressed(1) = ColorPressedB";
_colspressed[(int) (1)] = _colorpressedb;
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="Dim gdwPressed As GradientDrawable";
_gdwpressed = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="gdwPressed.Initialize(\"TOP_BOTTOM\", colsPressed)";
_gdwpressed.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colspressed);
RDebugUtils.currentLine=2686997;
 //BA.debugLineNum = 2686997;BA.debugLine="gdwPressed.CornerRadius = CornerRound";
_gdwpressed.setCornerRadius((float) (_cornerround));
RDebugUtils.currentLine=2687000;
 //BA.debugLineNum = 2687000;BA.debugLine="Dim colsDisabled(2) As Int";
_colsdisabled = new int[(int) (2)];
;
RDebugUtils.currentLine=2687001;
 //BA.debugLineNum = 2687001;BA.debugLine="colsDisabled(0) = ColorDisabledA";
_colsdisabled[(int) (0)] = _colordisableda;
RDebugUtils.currentLine=2687002;
 //BA.debugLineNum = 2687002;BA.debugLine="colsDisabled(1) = ColorDisabledB";
_colsdisabled[(int) (1)] = _colordisabledb;
RDebugUtils.currentLine=2687005;
 //BA.debugLineNum = 2687005;BA.debugLine="Dim gdwDisabled As GradientDrawable";
_gdwdisabled = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=2687006;
 //BA.debugLineNum = 2687006;BA.debugLine="gdwDisabled.Initialize(\"TOP_BOTTOM\", colsDisabled";
_gdwdisabled.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colsdisabled);
RDebugUtils.currentLine=2687007;
 //BA.debugLineNum = 2687007;BA.debugLine="gdwDisabled.CornerRadius = CornerRound";
_gdwdisabled.setCornerRadius((float) (_cornerround));
RDebugUtils.currentLine=2687010;
 //BA.debugLineNum = 2687010;BA.debugLine="Dim stdGradient As StateListDrawable";
_stdgradient = new anywheresoftware.b4a.objects.drawable.StateListDrawable();
RDebugUtils.currentLine=2687011;
 //BA.debugLineNum = 2687011;BA.debugLine="stdGradient.Initialize";
_stdgradient.Initialize();
RDebugUtils.currentLine=2687012;
 //BA.debugLineNum = 2687012;BA.debugLine="Dim states(2) As Int";
_states = new int[(int) (2)];
;
RDebugUtils.currentLine=2687013;
 //BA.debugLineNum = 2687013;BA.debugLine="states(0) = stdGradient.State_Enabled";
_states[(int) (0)] = _stdgradient.State_Enabled;
RDebugUtils.currentLine=2687014;
 //BA.debugLineNum = 2687014;BA.debugLine="states(1) = -stdGradient.State_Pressed";
_states[(int) (1)] = (int) (-_stdgradient.State_Pressed);
RDebugUtils.currentLine=2687015;
 //BA.debugLineNum = 2687015;BA.debugLine="stdGradient.addState2(states, gdwEnabled)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwenabled.getObject()));
RDebugUtils.currentLine=2687016;
 //BA.debugLineNum = 2687016;BA.debugLine="Dim states(1) As Int";
_states = new int[(int) (1)];
;
RDebugUtils.currentLine=2687017;
 //BA.debugLineNum = 2687017;BA.debugLine="states(0) = stdGradient.State_Pressed";
_states[(int) (0)] = _stdgradient.State_Pressed;
RDebugUtils.currentLine=2687018;
 //BA.debugLineNum = 2687018;BA.debugLine="stdGradient.addState2(states, gdwPressed)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwpressed.getObject()));
RDebugUtils.currentLine=2687019;
 //BA.debugLineNum = 2687019;BA.debugLine="Dim states(1) As Int";
_states = new int[(int) (1)];
;
RDebugUtils.currentLine=2687020;
 //BA.debugLineNum = 2687020;BA.debugLine="states(0) = stdGradient.State_Disabled";
_states[(int) (0)] = _stdgradient.State_Disabled;
RDebugUtils.currentLine=2687021;
 //BA.debugLineNum = 2687021;BA.debugLine="stdGradient.addState2(states, gdwDisabled)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwdisabled.getObject()));
RDebugUtils.currentLine=2687023;
 //BA.debugLineNum = 2687023;BA.debugLine="Return stdGradient";
if (true) return _stdgradient;
RDebugUtils.currentLine=2687024;
 //BA.debugLineNum = 2687024;BA.debugLine="End Sub";
return null;
}
public static String  _minimumpadding(anywheresoftware.b4a.BA _ba,Object _myobj) throws Exception{
RDebugUtils.currentModule="support";
if (Debug.shouldDelegate(null, "minimumpadding"))
	 {return ((String) Debug.delegate(null, "minimumpadding", new Object[] {_ba,_myobj}));}
int _paddingtopbottom = 0;
int _paddingleftright = 0;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub MinimumPadding(MyObj As Object)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim PaddingTopBottom = 1dip, PaddingLeftRight = 5";
_paddingtopbottom = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1));
_paddingleftright = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5));
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="r.Target = MyObj";
_r.Target = _myobj;
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="r.RunMethod4(\"setPadding\", Array As Object(Paddin";
_r.RunMethod4("setPadding",new Object[]{(Object)(_paddingleftright),(Object)(_paddingtopbottom),(Object)(_paddingleftright),(Object)(_paddingtopbottom)},new String[]{"java.lang.int","java.lang.int","java.lang.int","java.lang.int"});
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="End Sub";
return "";
}
}