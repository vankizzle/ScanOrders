package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.diplomna.httpjob");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _multipartfiledata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response = null;
public Object _tag = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _getstring(b4a.diplomna.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2(null,"UTF8");
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="End Sub";
return "";
}
public String  _release(b4a.diplomna.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "release", true))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder,__ref._taskid);
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.diplomna.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="JobName = Name";
__ref._jobname = _name;
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="target = TargetModule";
__ref._target = _targetmodule;
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="End Sub";
return "";
}
public String  _poststring(b4a.diplomna.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes(null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4a.diplomna.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Return req";
if (true) return __ref._req;
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="End Sub";
return null;
}
public String  _complete(b4a.diplomna.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="taskId = id";
__ref._taskid = BA.NumberToString(_id);
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target,"JobDone",this);
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.diplomna.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=11599881;
 //BA.debugLineNum = 11599881;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=11599891;
 //BA.debugLineNum = 11599891;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4a.diplomna.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="req.InitializeDelete(Link)";
__ref._req.InitializeDelete(_link);
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4a.diplomna.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters)";
__ref._req.InitializeDelete(__ref._escapelink(null,_link,_parameters));
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="End Sub";
return "";
}
public String  _escapelink(b4a.diplomna.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "escapelink", true))
	 {return ((String) Debug.delegate(ba, "escapelink", new Object[] {_link,_parameters}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=12517385;
 //BA.debugLineNum = 12517385;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=12517388;
 //BA.debugLineNum = 12517388;BA.debugLine="End Sub";
return "";
}
public String  _download(b4a.diplomna.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="req.InitializeGet(Link)";
__ref._req.InitializeGet(_link);
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4a.diplomna.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req.InitializeGet(__ref._escapelink(null,_link,_parameters));
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(b4a.diplomna.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub GetBitmap As Bitmap";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
_b = __c.LoadBitmap(_httputils2service._tempfolder,__ref._taskid);
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapresize(b4a.diplomna.httpjob __ref,int _width,int _height,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapresize", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapresize", new Object[] {_width,_height,_keepaspectratio}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Return LoadBitmapResize(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapResize(_httputils2service._tempfolder,__ref._taskid,_width,_height,_keepaspectratio);
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapsample(b4a.diplomna.httpjob __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapsample", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapsample", new Object[] {_width,_height}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub GetBitmapSample(Width As Int, Height As";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Return LoadBitmapSample(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapSample(_httputils2service._tempfolder,__ref._taskid,_width,_height);
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4a.diplomna.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder,__ref._taskid);
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="End Sub";
return null;
}
public String  _getstring2(b4a.diplomna.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder,__ref._taskid).getObject()),_encoding);
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="End Sub";
return "";
}
public String  _head(b4a.diplomna.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="req.InitializeHead(Link)";
__ref._req.InitializeHead(_link);
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4a.diplomna.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=12255239;
 //BA.debugLineNum = 12255239;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4a.diplomna.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req.InitializePatch2(_link,_data);
RDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4a.diplomna.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes(null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(b4a.diplomna.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req.InitializePost2(_link,_data);
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="End Sub";
return "";
}
public String  _postfile(b4a.diplomna.httpjob __ref,String _link,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postfile", true))
	 {return ((String) Debug.delegate(ba, "postfile", new Object[] {_link,_dir,_filename}));}
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("912320775","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=12320779;
 //BA.debugLineNum = 12320779;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=12320780;
 //BA.debugLineNum = 12320780;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=12320781;
 //BA.debugLineNum = 12320781;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=12320784;
 //BA.debugLineNum = 12320784;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=12320785;
 //BA.debugLineNum = 12320785;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=12320786;
 //BA.debugLineNum = 12320786;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=12320787;
 //BA.debugLineNum = 12320787;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes(null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=12320789;
 //BA.debugLineNum = 12320789;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req.InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=12320790;
 //BA.debugLineNum = 12320790;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=12320793;
 //BA.debugLineNum = 12320793;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(b4a.diplomna.httpjob __ref,String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postmultipart", true))
	 {return ((String) Debug.delegate(ba, "postmultipart", new Object[] {_link,_namevalues,_files}));}
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
byte[] _b = null;
String _eol = "";
boolean _empty = false;
String _key = "";
String _value = "";
String _s = "";
b4a.diplomna.httpjob._multipartfiledata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=12189706;
 //BA.debugLineNum = 12189706;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection(null,_stream,_empty);
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=12189712;
 //BA.debugLineNum = 12189712;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=12189713;
 //BA.debugLineNum = 12189713;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=12189716;
 //BA.debugLineNum = 12189716;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=12189717;
 //BA.debugLineNum = 12189717;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4a.diplomna.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=12189718;
 //BA.debugLineNum = 12189718;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection(null,_stream,_empty);
RDebugUtils.currentLine=12189719;
 //BA.debugLineNum = 12189719;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType))+"\n"+"\n"+"");
RDebugUtils.currentLine=12189725;
 //BA.debugLineNum = 12189725;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=12189726;
 //BA.debugLineNum = 12189726;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=12189727;
 //BA.debugLineNum = 12189727;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir,_fd.FileName);
RDebugUtils.currentLine=12189728;
 //BA.debugLineNum = 12189728;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=12189731;
 //BA.debugLineNum = 12189731;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection(null,_stream,_empty);
RDebugUtils.currentLine=12189732;
 //BA.debugLineNum = 12189732;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=12189735;
 //BA.debugLineNum = 12189735;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=12189736;
 //BA.debugLineNum = 12189736;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=12189737;
 //BA.debugLineNum = 12189737;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes(null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=12189738;
 //BA.debugLineNum = 12189738;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req.SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=12189739;
 //BA.debugLineNum = 12189739;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req.SetContentEncoding("UTF8");
RDebugUtils.currentLine=12189740;
 //BA.debugLineNum = 12189740;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4a.diplomna.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req.InitializePut2(_link,_data);
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4a.diplomna.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes(null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="End Sub";
return "";
}
}