B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private IsConnected As Boolean
	Public Output As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Connection As Boolean)
	IsConnected = Connection
End Sub

Public Sub ClearOuput
	Output = "" 
End Sub

Public Sub GetGoodByID(GoodID As Int) As ResumableSub
	If IsConnected = True Then
		
		Dim Map1 As Map
		Map1.Initialize
		Map1.Put("ID",GoodID)
		
		Dim JSON As JSONGenerator
		JSON.Initialize(Map1)
		Dim request_data As String =   JSON.ToPrettyString(1) ' JSON.ToString()
		Log(request_data)
		
		Dim HttpJobGoodByID As HttpJob
		Dim Link As String = "http://"&	Support.IP &":"& Support.Port &"/api/actions/GetGoodByID"
		HttpJobGoodByID.Initialize("GetGoodJob",Me)
		HttpJobGoodByID.PostString(Link,request_data)
		HttpJobGoodByID.GetRequest.SetContentType("application/json")
		
		Wait For (HttpJobGoodByID) JobDone(HttpJobGoodByID As HttpJob)
		
		Try
			If HttpJobGoodByID.Success = False Then
				Log("failed")
			Else
				Log("success")
				Log(HttpJobGoodByID.GetString)
				Output = HttpJobGoodByID.GetString
			End If
		Catch
			Log(LastException)
		End Try
		HttpJobGoodByID.Release
	End If
	Return Null
End Sub

Public Sub GetSupplierByID(SupplierID As Int) As ResumableSub
	If IsConnected = True Then
		
		Dim Map1 As Map
		Map1.Initialize
		Map1.Put("ID",SupplierID)
		
		Dim JSON As JSONGenerator
		JSON.Initialize(Map1)
		Dim request_data As String =   JSON.ToPrettyString(1) ' JSON.ToString()
		Log(request_data)
		
		Dim HttpJobSupplierByID As HttpJob
		Dim Link As String = "http://"&	Support.IP &":"& Support.Port &"/api/actions/GetSupplierByID"
		HttpJobSupplierByID.Initialize("GetSupplierJob",Me)
		HttpJobSupplierByID.PostString(Link,request_data)
		HttpJobSupplierByID.GetRequest.SetContentType("application/json")
		
		Wait For (HttpJobSupplierByID) JobDone(HttpJobSupplierByID As HttpJob)
		
		Try
			If HttpJobSupplierByID.Success = False Then
				Log("failed")
			Else
				Log("success")
				Log(HttpJobSupplierByID.GetString)
				Output = HttpJobSupplierByID.GetString
			End If
		Catch
			Log(LastException)
		End Try
		HttpJobSupplierByID.Release
	End If
	Return Null
End Sub

Public Sub SendOrder(o As Order) As ResumableSub
	If IsConnected = True Then
		Dim request_data As String  = JSONSerializations.OrderToJSON(o).ToPrettyString(1)
		Log(request_data)
		
		Dim HttpJobSendOrder As HttpJob
		Dim Link As String = "http://"&	Support.IP &":"& Support.Port &"/api/actions/SendOrder"
		HttpJobSendOrder.Initialize("SendOrderJob",Me)
		HttpJobSendOrder.PostString(Link,request_data)
		HttpJobSendOrder.GetRequest.SetContentType("application/json")
		
		Wait For (HttpJobSendOrder) JobDone(HttpJobSendOrder As HttpJob)
		
		Try
			If HttpJobSendOrder.Success = False Then
				Log("failed")
			Else
				Log("success")
				Log(HttpJobSendOrder.GetString)
				Output = HttpJobSendOrder.GetString
			End If
		Catch
			Log(LastException)
		End Try
		HttpJobSendOrder.Release
	End If
	Return Null
End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success = True Then
'		Select Job.JobName
'			Case "SendOrderJob"
'				Output = Job.GetString
'		End Select
	Else
		Log("Error: " & Job.ErrorMessage)
	End If
	Job.Release
End Sub

Public Sub RegisterNewCustomer(C As Customer) As ResumableSub
	If IsConnected = True Then
		Dim request_data As String  = JSONSerializations.CustomerToJSON(C).ToPrettyString(1)
		Log(request_data)
		
		Dim HttpJobRegister As HttpJob
		Dim Link As String = "http://"&	Support.IP &":"& Support.Port &"/api/actions/RegisterC"
		HttpJobRegister.Initialize("RegisterJob",Me)
		HttpJobRegister.PostString(Link,request_data)
		HttpJobRegister.GetRequest.SetContentType("application/json")
		
		Wait For (HttpJobRegister) JobDone(HttpJobRegister As HttpJob)
		
		Try
			If HttpJobRegister.Success = False Then
				Log("failed")
			Else
				Log("success")
				Log(HttpJobRegister.GetString)
				Output = HttpJobRegister.GetString
			End If
		Catch
			Log(LastException)
		End Try
		HttpJobRegister.Release
	End If
	Return Null
End Sub

Public Sub Login(Username As String,Password As String) As ResumableSub
	If IsConnected = True Then
		Dim request_data As String  = JSONSerializations.LoginJson(Username,Password).ToPrettyString(1)
		Log(request_data)
		
		Dim HttpJobLogin As HttpJob
		Dim Link As String = "http://"&	Support.IP &":"& Support.Port &"/api/actions/LoginCustomer"
		HttpJobLogin.Initialize("LoginJob",Me)
		HttpJobLogin.PostString(Link,request_data)
		HttpJobLogin.GetRequest.SetContentType("application/json")
		
		Wait For (HttpJobLogin) JobDone(HttpJobLogin As HttpJob)
		
		Try
			If HttpJobLogin.Success = False Then
				Log("failed")
			Else
				Log("success")
				Log(HttpJobLogin.GetString)
				Output = HttpJobLogin.GetString
			End If
		Catch
			Log(LastException)
		End Try
		HttpJobLogin.Release
	End If
	Return Null
End Sub

Public Sub GetCustomerOrders(CustomerID As Int) As ResumableSub
	If IsConnected = True Then
		Dim request_data As String  = JSONSerializations.CustomerID(CustomerID).ToPrettyString(1)
		Log(request_data)
		
		Dim HttpJobGetCustomerOrders As HttpJob
		Dim Link As String = "http://"&	Support.IP &":"& Support.Port &"/api/actions/GetCustomerOrders"
		HttpJobGetCustomerOrders.Initialize("GetCustomerOrdersJob",Me)
		HttpJobGetCustomerOrders.PostString(Link,request_data)
		HttpJobGetCustomerOrders.GetRequest.SetContentType("application/json")
		
		Wait For (HttpJobGetCustomerOrders) JobDone(HttpJobGetCustomerOrders As HttpJob)
		
		Try
			If HttpJobGetCustomerOrders.Success = False Then
				Log("failed")
			Else
				Log("success")
				Log(HttpJobGetCustomerOrders.GetString)
				Output = HttpJobGetCustomerOrders.GetString
			End If
		Catch
			Log(LastException)
		End Try
		HttpJobGetCustomerOrders.Release
	End If
	Return Null
End Sub

Public Sub GetOrderedGoods(OrderID As Int) As ResumableSub
	If IsConnected = True Then
		Dim request_data As String  = JSONSerializations.CustomerID(OrderID).ToPrettyString(1)
		Log(request_data)
		
		Dim HttpJobGetOrderGoods As HttpJob
		Dim Link As String = "http://"&	Support.IP &":"& Support.Port &"/api/actions/GetOrderGoods"
		HttpJobGetOrderGoods.Initialize("GetCustomerOrdersJob",Me)
		HttpJobGetOrderGoods.PostString(Link,request_data)
		HttpJobGetOrderGoods.GetRequest.SetContentType("application/json")
		
		Wait For (HttpJobGetOrderGoods) JobDone(HttpJobGetOrderGoods As HttpJob)
		
		Try
			If HttpJobGetOrderGoods.Success = False Then
				Log("failed")
			Else
				Log("success")
				Log(HttpJobGetOrderGoods.GetString)
				Output = HttpJobGetOrderGoods.GetString
			End If
		Catch
			Log(LastException)
		End Try
		HttpJobGetOrderGoods.Release
	End If
	Return Null
End Sub
