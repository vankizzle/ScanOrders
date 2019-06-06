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
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public static String  _applyviewstyle(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _control,int _textcolor,int _colora,int _colorb,int _colorpresseda,int _colorpressedb,int _colordisableda,int _colordisabledb,int _cornerround) throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.EditTextWrapper _txt = null;
anywheresoftware.b4a.objects.SpinnerWrapper _sp = null;
 //BA.debugLineNum = 10;BA.debugLine="Public Sub ApplyViewStyle (Control As View, TextCo";
 //BA.debugLineNum = 12;BA.debugLine="If Control Is Button Then";
if (_control.getObjectOrNull() instanceof android.widget.Button) { 
 //BA.debugLineNum = 13;BA.debugLine="Dim btn As Button = Control";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn.setObject((android.widget.Button)(_control.getObject()));
 //BA.debugLineNum = 14;BA.debugLine="btn.TextColor = TextColor";
_btn.setTextColor(_textcolor);
 };
 //BA.debugLineNum = 17;BA.debugLine="If Control Is EditText Then";
if (_control.getObjectOrNull() instanceof android.widget.EditText) { 
 //BA.debugLineNum = 18;BA.debugLine="Dim txt As EditText = Control";
_txt = new anywheresoftware.b4a.objects.EditTextWrapper();
_txt.setObject((android.widget.EditText)(_control.getObject()));
 //BA.debugLineNum = 19;BA.debugLine="txt.TextColor = TextColor";
_txt.setTextColor(_textcolor);
 };
 //BA.debugLineNum = 22;BA.debugLine="If Control Is Spinner Then";
if (_control.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
 //BA.debugLineNum = 23;BA.debugLine="Dim sp As Spinner = Control";
_sp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_sp.setObject((anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_control.getObject()));
 //BA.debugLineNum = 24;BA.debugLine="sp.TextColor = TextColor";
_sp.setTextColor(_textcolor);
 };
 //BA.debugLineNum = 28;BA.debugLine="Control.Background = Gradient(ColorA, ColorB, Col";
_control.setBackground((android.graphics.drawable.Drawable)(_gradient(_ba,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround).getObject()));
 //BA.debugLineNum = 29;BA.debugLine="MinimumPadding(Control)";
_minimumpadding(_ba,(Object)(_control.getObject()));
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.StateListDrawable  _gradient(anywheresoftware.b4a.BA _ba,int _colora,int _colorb,int _colorpresseda,int _colorpressedb,int _colordisableda,int _colordisabledb,int _cornerround) throws Exception{
int[] _colsenabled = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwenabled = null;
int[] _colspressed = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwpressed = null;
int[] _colsdisabled = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwdisabled = null;
anywheresoftware.b4a.objects.drawable.StateListDrawable _stdgradient = null;
int[] _states = null;
 //BA.debugLineNum = 33;BA.debugLine="Private Sub Gradient(ColorA As Int, ColorB As Int,";
 //BA.debugLineNum = 36;BA.debugLine="Dim colsEnabled(2) As Int";
_colsenabled = new int[(int) (2)];
;
 //BA.debugLineNum = 38;BA.debugLine="colsEnabled(0) = ColorA";
_colsenabled[(int) (0)] = _colora;
 //BA.debugLineNum = 39;BA.debugLine="colsEnabled(1) = ColorB";
_colsenabled[(int) (1)] = _colorb;
 //BA.debugLineNum = 41;BA.debugLine="Dim gdwEnabled As GradientDrawable";
_gdwenabled = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 42;BA.debugLine="gdwEnabled.Initialize(\"TOP_BOTTOM\", colsEnabled)";
_gdwenabled.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colsenabled);
 //BA.debugLineNum = 43;BA.debugLine="gdwEnabled.CornerRadius = CornerRound";
_gdwenabled.setCornerRadius((float) (_cornerround));
 //BA.debugLineNum = 46;BA.debugLine="Dim colsPressed(2) As Int";
_colspressed = new int[(int) (2)];
;
 //BA.debugLineNum = 47;BA.debugLine="colsPressed(0) = ColorPressedA";
_colspressed[(int) (0)] = _colorpresseda;
 //BA.debugLineNum = 48;BA.debugLine="colsPressed(1) = ColorPressedB";
_colspressed[(int) (1)] = _colorpressedb;
 //BA.debugLineNum = 51;BA.debugLine="Dim gdwPressed As GradientDrawable";
_gdwpressed = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 53;BA.debugLine="gdwPressed.Initialize(\"TOP_BOTTOM\", colsPressed)";
_gdwpressed.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colspressed);
 //BA.debugLineNum = 54;BA.debugLine="gdwPressed.CornerRadius = CornerRound";
_gdwpressed.setCornerRadius((float) (_cornerround));
 //BA.debugLineNum = 57;BA.debugLine="Dim colsDisabled(2) As Int";
_colsdisabled = new int[(int) (2)];
;
 //BA.debugLineNum = 58;BA.debugLine="colsDisabled(0) = ColorDisabledA";
_colsdisabled[(int) (0)] = _colordisableda;
 //BA.debugLineNum = 59;BA.debugLine="colsDisabled(1) = ColorDisabledB";
_colsdisabled[(int) (1)] = _colordisabledb;
 //BA.debugLineNum = 62;BA.debugLine="Dim gdwDisabled As GradientDrawable";
_gdwdisabled = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 63;BA.debugLine="gdwDisabled.Initialize(\"TOP_BOTTOM\", colsDisabled";
_gdwdisabled.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colsdisabled);
 //BA.debugLineNum = 64;BA.debugLine="gdwDisabled.CornerRadius = CornerRound";
_gdwdisabled.setCornerRadius((float) (_cornerround));
 //BA.debugLineNum = 67;BA.debugLine="Dim stdGradient As StateListDrawable";
_stdgradient = new anywheresoftware.b4a.objects.drawable.StateListDrawable();
 //BA.debugLineNum = 68;BA.debugLine="stdGradient.Initialize";
_stdgradient.Initialize();
 //BA.debugLineNum = 69;BA.debugLine="Dim states(2) As Int";
_states = new int[(int) (2)];
;
 //BA.debugLineNum = 70;BA.debugLine="states(0) = stdGradient.State_Enabled";
_states[(int) (0)] = _stdgradient.State_Enabled;
 //BA.debugLineNum = 71;BA.debugLine="states(1) = -stdGradient.State_Pressed";
_states[(int) (1)] = (int) (-_stdgradient.State_Pressed);
 //BA.debugLineNum = 72;BA.debugLine="stdGradient.addState2(states, gdwEnabled)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwenabled.getObject()));
 //BA.debugLineNum = 73;BA.debugLine="Dim states(1) As Int";
_states = new int[(int) (1)];
;
 //BA.debugLineNum = 74;BA.debugLine="states(0) = stdGradient.State_Pressed";
_states[(int) (0)] = _stdgradient.State_Pressed;
 //BA.debugLineNum = 75;BA.debugLine="stdGradient.addState2(states, gdwPressed)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwpressed.getObject()));
 //BA.debugLineNum = 76;BA.debugLine="Dim states(1) As Int";
_states = new int[(int) (1)];
;
 //BA.debugLineNum = 77;BA.debugLine="states(0) = stdGradient.State_Disabled";
_states[(int) (0)] = _stdgradient.State_Disabled;
 //BA.debugLineNum = 78;BA.debugLine="stdGradient.addState2(states, gdwDisabled)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwdisabled.getObject()));
 //BA.debugLineNum = 80;BA.debugLine="Return stdGradient";
if (true) return _stdgradient;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public static String  _minimumpadding(anywheresoftware.b4a.BA _ba,Object _myobj) throws Exception{
int _paddingtopbottom = 0;
int _paddingleftright = 0;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
 //BA.debugLineNum = 83;BA.debugLine="Public Sub MinimumPadding(MyObj As Object)";
 //BA.debugLineNum = 84;BA.debugLine="Dim PaddingTopBottom = 1dip, PaddingLeftRight = 5";
_paddingtopbottom = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1));
_paddingleftright = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5));
 //BA.debugLineNum = 85;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 86;BA.debugLine="r.Target = MyObj";
_r.Target = _myobj;
 //BA.debugLineNum = 87;BA.debugLine="r.RunMethod4(\"setPadding\", Array As Object(Paddin";
_r.RunMethod4("setPadding",new Object[]{(Object)(_paddingleftright),(Object)(_paddingtopbottom),(Object)(_paddingleftright),(Object)(_paddingtopbottom)},new String[]{"java.lang.int","java.lang.int","java.lang.int","java.lang.int"});
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public IP As String = \"192.168.43.61\"";
_ip = "192.168.43.61";
 //BA.debugLineNum = 7;BA.debugLine="Public Port As String = \"8080\"";
_port = "8080";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
