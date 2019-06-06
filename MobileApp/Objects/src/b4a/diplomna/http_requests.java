package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class http_requests extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.diplomna.http_requests");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.diplomna.http_requests.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public boolean _isconnected = false;
public String _output = "";
public b4a.diplomna.main _main = null;
public b4a.diplomna.uisizes _uisizes = null;
public b4a.diplomna.jsonserializations _jsonserializations = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.appcolors _appcolors = null;
public b4a.diplomna.data _data = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private IsConnected As Boolean";
_isconnected = false;
 //BA.debugLineNum = 3;BA.debugLine="Public Output As String";
_output = "";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _clearouput() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Public Sub ClearOuput";
 //BA.debugLineNum = 12;BA.debugLine="Output = \"\"";
_output = "";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getcustomerorders(int _customerid) throws Exception{
ResumableSub_GetCustomerOrders rsub = new ResumableSub_GetCustomerOrders(this,_customerid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetCustomerOrders extends BA.ResumableSub {
public ResumableSub_GetCustomerOrders(b4a.diplomna.http_requests parent,int _customerid) {
this.parent = parent;
this._customerid = _customerid;
}
b4a.diplomna.http_requests parent;
int _customerid;
String _request_data = "";
b4a.diplomna.httpjob _httpjobgetcustomerorders = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 188;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 189;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._customerid(parent.getActivityBA(),_customerid).ToPrettyString((int) (1));
 //BA.debugLineNum = 190;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("05570563",_request_data,0);
 //BA.debugLineNum = 192;BA.debugLine="Dim HttpJobGetCustomerOrders As HttpJob";
_httpjobgetcustomerorders = new b4a.diplomna.httpjob();
 //BA.debugLineNum = 193;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetCustomerOrders";
 //BA.debugLineNum = 194;BA.debugLine="HttpJobGetCustomerOrders.Initialize(\"GetCustomer";
_httpjobgetcustomerorders._initialize(ba,"GetCustomerOrdersJob",parent);
 //BA.debugLineNum = 195;BA.debugLine="HttpJobGetCustomerOrders.PostString(Link,request";
_httpjobgetcustomerorders._poststring(_link,_request_data);
 //BA.debugLineNum = 196;BA.debugLine="HttpJobGetCustomerOrders.GetRequest.SetContentTy";
_httpjobgetcustomerorders._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 198;BA.debugLine="Wait For (HttpJobGetCustomerOrders) JobDone(Http";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_httpjobgetcustomerorders));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgetcustomerorders = (b4a.diplomna.httpjob) result[0];
;
 //BA.debugLineNum = 200;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 //BA.debugLineNum = 201;BA.debugLine="If HttpJobGetCustomerOrders.Success = False The";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobgetcustomerorders._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 202;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("05570575","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 204;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("05570577","success",0);
 //BA.debugLineNum = 205;BA.debugLine="Log(HttpJobGetCustomerOrders.GetString)";
parent.__c.LogImpl("05570578",_httpjobgetcustomerorders._getstring(),0);
 //BA.debugLineNum = 206;BA.debugLine="Output = HttpJobGetCustomerOrders.GetString";
parent._output = _httpjobgetcustomerorders._getstring();
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 209;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("05570582",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 //BA.debugLineNum = 211;BA.debugLine="HttpJobGetCustomerOrders.Release";
_httpjobgetcustomerorders._release();
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 213;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getgoodbyid(int _goodid) throws Exception{
ResumableSub_GetGoodByID rsub = new ResumableSub_GetGoodByID(this,_goodid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetGoodByID extends BA.ResumableSub {
public ResumableSub_GetGoodByID(b4a.diplomna.http_requests parent,int _goodid) {
this.parent = parent;
this._goodid = _goodid;
}
b4a.diplomna.http_requests parent;
int _goodid;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _request_data = "";
b4a.diplomna.httpjob _httpjobgoodbyid = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 16;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 18;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 19;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="Map1.Put(\"ID\",GoodID)";
_map1.Put((Object)("ID"),(Object)(_goodid));
 //BA.debugLineNum = 22;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 23;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
 //BA.debugLineNum = 24;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
 //BA.debugLineNum = 25;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("05177354",_request_data,0);
 //BA.debugLineNum = 27;BA.debugLine="Dim HttpJobGoodByID As HttpJob";
_httpjobgoodbyid = new b4a.diplomna.httpjob();
 //BA.debugLineNum = 28;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetGoodByID";
 //BA.debugLineNum = 29;BA.debugLine="HttpJobGoodByID.Initialize(\"GetGoodJob\",Me)";
_httpjobgoodbyid._initialize(ba,"GetGoodJob",parent);
 //BA.debugLineNum = 30;BA.debugLine="HttpJobGoodByID.PostString(Link,request_data)";
_httpjobgoodbyid._poststring(_link,_request_data);
 //BA.debugLineNum = 31;BA.debugLine="HttpJobGoodByID.GetRequest.SetContentType(\"appli";
_httpjobgoodbyid._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 33;BA.debugLine="Wait For (HttpJobGoodByID) JobDone(HttpJobGoodBy";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_httpjobgoodbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgoodbyid = (b4a.diplomna.httpjob) result[0];
;
 //BA.debugLineNum = 35;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 //BA.debugLineNum = 36;BA.debugLine="If HttpJobGoodByID.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobgoodbyid._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 37;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("05177366","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 39;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("05177368","success",0);
 //BA.debugLineNum = 40;BA.debugLine="Log(HttpJobGoodByID.GetString)";
parent.__c.LogImpl("05177369",_httpjobgoodbyid._getstring(),0);
 //BA.debugLineNum = 41;BA.debugLine="Output = HttpJobGoodByID.GetString";
parent._output = _httpjobgoodbyid._getstring();
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 44;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("05177373",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 //BA.debugLineNum = 46;BA.debugLine="HttpJobGoodByID.Release";
_httpjobgoodbyid._release();
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 48;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getorderedgoods(int _orderid) throws Exception{
ResumableSub_GetOrderedGoods rsub = new ResumableSub_GetOrderedGoods(this,_orderid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetOrderedGoods extends BA.ResumableSub {
public ResumableSub_GetOrderedGoods(b4a.diplomna.http_requests parent,int _orderid) {
this.parent = parent;
this._orderid = _orderid;
}
b4a.diplomna.http_requests parent;
int _orderid;
String _request_data = "";
b4a.diplomna.httpjob _httpjobgetordergoods = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 217;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 218;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._customerid(parent.getActivityBA(),_orderid).ToPrettyString((int) (1));
 //BA.debugLineNum = 219;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("05636099",_request_data,0);
 //BA.debugLineNum = 221;BA.debugLine="Dim HttpJobGetOrderGoods As HttpJob";
_httpjobgetordergoods = new b4a.diplomna.httpjob();
 //BA.debugLineNum = 222;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetOrderGoods";
 //BA.debugLineNum = 223;BA.debugLine="HttpJobGetOrderGoods.Initialize(\"GetCustomerOrde";
_httpjobgetordergoods._initialize(ba,"GetCustomerOrdersJob",parent);
 //BA.debugLineNum = 224;BA.debugLine="HttpJobGetOrderGoods.PostString(Link,request_dat";
_httpjobgetordergoods._poststring(_link,_request_data);
 //BA.debugLineNum = 225;BA.debugLine="HttpJobGetOrderGoods.GetRequest.SetContentType(\"";
_httpjobgetordergoods._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 227;BA.debugLine="Wait For (HttpJobGetOrderGoods) JobDone(HttpJobG";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_httpjobgetordergoods));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobgetordergoods = (b4a.diplomna.httpjob) result[0];
;
 //BA.debugLineNum = 229;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 //BA.debugLineNum = 230;BA.debugLine="If HttpJobGetOrderGoods.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobgetordergoods._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 231;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("05636111","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 233;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("05636113","success",0);
 //BA.debugLineNum = 234;BA.debugLine="Log(HttpJobGetOrderGoods.GetString)";
parent.__c.LogImpl("05636114",_httpjobgetordergoods._getstring(),0);
 //BA.debugLineNum = 235;BA.debugLine="Output = HttpJobGetOrderGoods.GetString";
parent._output = _httpjobgetordergoods._getstring();
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 238;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("05636118",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 //BA.debugLineNum = 240;BA.debugLine="HttpJobGetOrderGoods.Release";
_httpjobgetordergoods._release();
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 242;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getsupplierbyid(int _supplierid) throws Exception{
ResumableSub_GetSupplierByID rsub = new ResumableSub_GetSupplierByID(this,_supplierid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetSupplierByID extends BA.ResumableSub {
public ResumableSub_GetSupplierByID(b4a.diplomna.http_requests parent,int _supplierid) {
this.parent = parent;
this._supplierid = _supplierid;
}
b4a.diplomna.http_requests parent;
int _supplierid;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _request_data = "";
b4a.diplomna.httpjob _httpjobsupplierbyid = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 52;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 54;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 55;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="Map1.Put(\"ID\",SupplierID)";
_map1.Put((Object)("ID"),(Object)(_supplierid));
 //BA.debugLineNum = 58;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 59;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
 //BA.debugLineNum = 60;BA.debugLine="Dim request_data As String =   JSON.ToPrettyStri";
_request_data = _json.ToPrettyString((int) (1));
 //BA.debugLineNum = 61;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("05242890",_request_data,0);
 //BA.debugLineNum = 63;BA.debugLine="Dim HttpJobSupplierByID As HttpJob";
_httpjobsupplierbyid = new b4a.diplomna.httpjob();
 //BA.debugLineNum = 64;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/GetSupplierByID";
 //BA.debugLineNum = 65;BA.debugLine="HttpJobSupplierByID.Initialize(\"GetSupplierJob\",";
_httpjobsupplierbyid._initialize(ba,"GetSupplierJob",parent);
 //BA.debugLineNum = 66;BA.debugLine="HttpJobSupplierByID.PostString(Link,request_data";
_httpjobsupplierbyid._poststring(_link,_request_data);
 //BA.debugLineNum = 67;BA.debugLine="HttpJobSupplierByID.GetRequest.SetContentType(\"a";
_httpjobsupplierbyid._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 69;BA.debugLine="Wait For (HttpJobSupplierByID) JobDone(HttpJobSu";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_httpjobsupplierbyid));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobsupplierbyid = (b4a.diplomna.httpjob) result[0];
;
 //BA.debugLineNum = 71;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 //BA.debugLineNum = 72;BA.debugLine="If HttpJobSupplierByID.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobsupplierbyid._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 73;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("05242902","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 75;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("05242904","success",0);
 //BA.debugLineNum = 76;BA.debugLine="Log(HttpJobSupplierByID.GetString)";
parent.__c.LogImpl("05242905",_httpjobsupplierbyid._getstring(),0);
 //BA.debugLineNum = 77;BA.debugLine="Output = HttpJobSupplierByID.GetString";
parent._output = _httpjobsupplierbyid._getstring();
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 80;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("05242909",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 //BA.debugLineNum = 82;BA.debugLine="HttpJobSupplierByID.Release";
_httpjobsupplierbyid._release();
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 84;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _initialize(anywheresoftware.b4a.BA _ba,boolean _connection) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(Connection As Boolean)";
 //BA.debugLineNum = 8;BA.debugLine="IsConnected = Connection";
_isconnected = _connection;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(b4a.diplomna.httpjob _job) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub JobDone (Job As HttpJob)";
 //BA.debugLineNum = 117;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
__c.LogImpl("05373953","JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success),0);
 //BA.debugLineNum = 118;BA.debugLine="If Job.Success = True Then";
if (_job._success==__c.True) { 
 }else {
 //BA.debugLineNum = 124;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
__c.LogImpl("05373960","Error: "+_job._errormessage,0);
 };
 //BA.debugLineNum = 126;BA.debugLine="Job.Release";
_job._release();
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _login(String _username,String _password) throws Exception{
ResumableSub_Login rsub = new ResumableSub_Login(this,_username,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Login extends BA.ResumableSub {
public ResumableSub_Login(b4a.diplomna.http_requests parent,String _username,String _password) {
this.parent = parent;
this._username = _username;
this._password = _password;
}
b4a.diplomna.http_requests parent;
String _username;
String _password;
String _request_data = "";
b4a.diplomna.httpjob _httpjoblogin = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 159;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 160;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._loginjson(parent.getActivityBA(),_username,_password).ToPrettyString((int) (1));
 //BA.debugLineNum = 161;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("05505027",_request_data,0);
 //BA.debugLineNum = 163;BA.debugLine="Dim HttpJobLogin As HttpJob";
_httpjoblogin = new b4a.diplomna.httpjob();
 //BA.debugLineNum = 164;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/LoginCustomer";
 //BA.debugLineNum = 165;BA.debugLine="HttpJobLogin.Initialize(\"LoginJob\",Me)";
_httpjoblogin._initialize(ba,"LoginJob",parent);
 //BA.debugLineNum = 166;BA.debugLine="HttpJobLogin.PostString(Link,request_data)";
_httpjoblogin._poststring(_link,_request_data);
 //BA.debugLineNum = 167;BA.debugLine="HttpJobLogin.GetRequest.SetContentType(\"applicat";
_httpjoblogin._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 169;BA.debugLine="Wait For (HttpJobLogin) JobDone(HttpJobLogin As";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_httpjoblogin));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjoblogin = (b4a.diplomna.httpjob) result[0];
;
 //BA.debugLineNum = 171;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 //BA.debugLineNum = 172;BA.debugLine="If HttpJobLogin.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjoblogin._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 173;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("05505039","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 175;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("05505041","success",0);
 //BA.debugLineNum = 176;BA.debugLine="Log(HttpJobLogin.GetString)";
parent.__c.LogImpl("05505042",_httpjoblogin._getstring(),0);
 //BA.debugLineNum = 177;BA.debugLine="Output = HttpJobLogin.GetString";
parent._output = _httpjoblogin._getstring();
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 180;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("05505046",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 //BA.debugLineNum = 182;BA.debugLine="HttpJobLogin.Release";
_httpjoblogin._release();
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 184;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _registernewcustomer(b4a.diplomna.types._customer _c) throws Exception{
ResumableSub_RegisterNewCustomer rsub = new ResumableSub_RegisterNewCustomer(this,_c);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RegisterNewCustomer extends BA.ResumableSub {
public ResumableSub_RegisterNewCustomer(b4a.diplomna.http_requests parent,b4a.diplomna.types._customer _c) {
this.parent = parent;
this._c = _c;
}
b4a.diplomna.http_requests parent;
b4a.diplomna.types._customer _c;
String _request_data = "";
b4a.diplomna.httpjob _httpjobregister = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 130;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 131;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._customertojson(parent.getActivityBA(),_c).ToPrettyString((int) (1));
 //BA.debugLineNum = 132;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("05439491",_request_data,0);
 //BA.debugLineNum = 134;BA.debugLine="Dim HttpJobRegister As HttpJob";
_httpjobregister = new b4a.diplomna.httpjob();
 //BA.debugLineNum = 135;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/RegisterC";
 //BA.debugLineNum = 136;BA.debugLine="HttpJobRegister.Initialize(\"RegisterJob\",Me)";
_httpjobregister._initialize(ba,"RegisterJob",parent);
 //BA.debugLineNum = 137;BA.debugLine="HttpJobRegister.PostString(Link,request_data)";
_httpjobregister._poststring(_link,_request_data);
 //BA.debugLineNum = 138;BA.debugLine="HttpJobRegister.GetRequest.SetContentType(\"appli";
_httpjobregister._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 140;BA.debugLine="Wait For (HttpJobRegister) JobDone(HttpJobRegist";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_httpjobregister));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobregister = (b4a.diplomna.httpjob) result[0];
;
 //BA.debugLineNum = 142;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 //BA.debugLineNum = 143;BA.debugLine="If HttpJobRegister.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobregister._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 144;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("05439503","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 146;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("05439505","success",0);
 //BA.debugLineNum = 147;BA.debugLine="Log(HttpJobRegister.GetString)";
parent.__c.LogImpl("05439506",_httpjobregister._getstring(),0);
 //BA.debugLineNum = 148;BA.debugLine="Output = HttpJobRegister.GetString";
parent._output = _httpjobregister._getstring();
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 151;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("05439510",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 //BA.debugLineNum = 153;BA.debugLine="HttpJobRegister.Release";
_httpjobregister._release();
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 155;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sendorder(b4a.diplomna.types._order _o) throws Exception{
ResumableSub_SendOrder rsub = new ResumableSub_SendOrder(this,_o);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SendOrder extends BA.ResumableSub {
public ResumableSub_SendOrder(b4a.diplomna.http_requests parent,b4a.diplomna.types._order _o) {
this.parent = parent;
this._o = _o;
}
b4a.diplomna.http_requests parent;
b4a.diplomna.types._order _o;
String _request_data = "";
b4a.diplomna.httpjob _httpjobsendorder = null;
String _link = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 88;BA.debugLine="If IsConnected = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent._isconnected==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 89;BA.debugLine="Dim request_data As String  = JSONSerializations";
_request_data = parent._jsonserializations._ordertojson(parent.getActivityBA(),_o).ToPrettyString((int) (1));
 //BA.debugLineNum = 90;BA.debugLine="Log(request_data)";
parent.__c.LogImpl("05308419",_request_data,0);
 //BA.debugLineNum = 92;BA.debugLine="Dim HttpJobSendOrder As HttpJob";
_httpjobsendorder = new b4a.diplomna.httpjob();
 //BA.debugLineNum = 93;BA.debugLine="Dim Link As String = \"http://\"&	Support.IP &\":\"&";
_link = "http://"+parent._support._ip+":"+parent._support._port+"/api/actions/SendOrder";
 //BA.debugLineNum = 94;BA.debugLine="HttpJobSendOrder.Initialize(\"SendOrderJob\",Me)";
_httpjobsendorder._initialize(ba,"SendOrderJob",parent);
 //BA.debugLineNum = 95;BA.debugLine="HttpJobSendOrder.PostString(Link,request_data)";
_httpjobsendorder._poststring(_link,_request_data);
 //BA.debugLineNum = 96;BA.debugLine="HttpJobSendOrder.GetRequest.SetContentType(\"appl";
_httpjobsendorder._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 98;BA.debugLine="Wait For (HttpJobSendOrder) JobDone(HttpJobSendO";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_httpjobsendorder));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_httpjobsendorder = (b4a.diplomna.httpjob) result[0];
;
 //BA.debugLineNum = 100;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 //BA.debugLineNum = 101;BA.debugLine="If HttpJobSendOrder.Success = False Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_httpjobsendorder._success==parent.__c.False) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 102;BA.debugLine="Log(\"failed\")";
parent.__c.LogImpl("05308431","failed",0);
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 104;BA.debugLine="Log(\"success\")";
parent.__c.LogImpl("05308433","success",0);
 //BA.debugLineNum = 105;BA.debugLine="Log(HttpJobSendOrder.GetString)";
parent.__c.LogImpl("05308434",_httpjobsendorder._getstring(),0);
 //BA.debugLineNum = 106;BA.debugLine="Output = HttpJobSendOrder.GetString";
parent._output = _httpjobsendorder._getstring();
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 109;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("05308438",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 //BA.debugLineNum = 111;BA.debugLine="HttpJobSendOrder.Release";
_httpjobsendorder._release();
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 113;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "JOBDONE"))
	return _jobdone((b4a.diplomna.httpjob) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
