B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private IsConnected As Boolean
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Connection As Boolean)
	IsConnected = Connection
End Sub


Public Sub GetGoodByID(GoodID As Int) As ResumableSub
	If IsConnected = True Then
		Dim gID As String = GoodID
		Dim HttpJobGoodByID As HttpJob
		Dim Link As String = "http://"&	Support.IP &":"& Support.Port &"/api/actions/GetGoodByID"
		HttpJobGoodByID.Initialize("GetGoodJob",Me)
'		HttpJobGoodByID.PostBytes(Link,gID.GetBytes("UTF-8"))
		Wait For JobDone(Job As HttpJob)
		Try
			If Job.Success = False Then
				Log("failed")
			Else
				Log("success")
				Log(Job.GetString)
			End If
		Catch
			Log(LastException)
		End Try
		Job.Release
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
