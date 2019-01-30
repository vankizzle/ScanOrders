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

Public Sub RegisterNewCustomer(C As Customer)
	If IsConnected = True Then
		
	End If
End Sub

Public Sub Login(Username As String,Password As String)
	If IsConnected = True Then
		
	End If
End Sub

Public Sub TestJob As ResumableSub
	If IsConnected = True Then
		Dim HttpJobLogin As HttpJob
		Dim Link As String = "http://"&	Support.IP &":" & Support.Port &"/api/actions/GetUserForTest"
		HttpJobLogin.Initialize("LoginJob",Me)
		HttpJobLogin.Download(Link)
		Wait For JobDone(Job As HttpJob)
		Try
			If Job.Success = False Then
				Log("login failed")
			Else
				Log("login success")
				Log(Job.GetString)
			End If
		Catch
			Log(LastException)
		End Try
		Job.Release
	End If
	Return Null
End Sub
'
'Sub JobDone (Job As HttpJob)
'	
'	
'End Sub
