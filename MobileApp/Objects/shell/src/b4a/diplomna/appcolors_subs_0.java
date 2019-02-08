package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class appcolors_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public FadedDarkRed As Int = Colors.ARGB(180,150,";
appcolors._fadeddarkred = appcolors.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 4)),(Object)(BA.numberCast(int.class, 4)));
 //BA.debugLineNum = 7;BA.debugLine="Public FadedBlack As Int = Colors.ARGB(100,0,0,0)";
appcolors._fadedblack = appcolors.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 //BA.debugLineNum = 8;BA.debugLine="Public FadedBlack2 As Int = Colors.ARGB(150,0,0,0";
appcolors._fadedblack2 = appcolors.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 //BA.debugLineNum = 9;BA.debugLine="Public DarkGray As Int = 0xFF4E4E4E";
appcolors._darkgray = BA.numberCast(int.class, 0xff4e4e4e);
 //BA.debugLineNum = 10;BA.debugLine="Public LightGray As Int = 0xFFBBBBBB";
appcolors._lightgray = BA.numberCast(int.class, 0xffbbbbbb);
 //BA.debugLineNum = 11;BA.debugLine="Public LightGrayPressed As Int = 0xFF828282";
appcolors._lightgraypressed = BA.numberCast(int.class, 0xff828282);
 //BA.debugLineNum = 12;BA.debugLine="Public DarkDarkGray As Int = 0xFF313131";
appcolors._darkdarkgray = BA.numberCast(int.class, 0xff313131);
 //BA.debugLineNum = 13;BA.debugLine="Public White As Int = Colors.White";
appcolors._white = appcolors.mostCurrent.__c.getField(false,"Colors").getField(true,"White");
 //BA.debugLineNum = 14;BA.debugLine="Public Transparent As Int = Colors.Transparent";
appcolors._transparent = appcolors.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent");
 //BA.debugLineNum = 15;BA.debugLine="Public Black As Int = Colors.Black";
appcolors._black = appcolors.mostCurrent.__c.getField(false,"Colors").getField(true,"Black");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}