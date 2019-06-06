B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private ScreenPnl As Panel
	Private ScreenLogo As Panel
	Private Logo As ImageView
	Private Header As Panel
	
	
	Private usernametxt As EditText
	Private passwordtxt As EditText
	
'	Private usernamelbl As Label
'	Private passwordlbl As Label
'	
	Private loginbtn As Button
	Private registerbtn As Button
	Private settingsbtn As Button
	
	Private SettingsButton As Button
	Private SettingsMenuLogin As SettingsMenu
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ScreenPnl.Initialize("")
	ScreenLogo.Initialize("")
	Logo.Initialize("")
	usernametxt.Initialize("")
	passwordtxt.Initialize("")
'	usernamelbl.Initialize("")
'	passwordlbl.Initialize("")
	Header.Initialize("")
	loginbtn.Initialize("Login")
	registerbtn.Initialize("Register")
	settingsbtn.Initialize("")

	SettingsButton.Initialize("Settings")
	SettingsMenuLogin.Initialize(0)
	BuildUI
End Sub

Public Sub BuildUI
'	ScreenPnl.Color = Colors.RGB(36,104,189)
	ScreenPnl.Color = AppColors.DarkGray
	Header.Color = AppColors.FadedDarkRed
	
	ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,5%y,15%x,5%y)
'	SettingsMenuLogin.AsView.Visible = True
	
	ScreenPnl.AddView(Header,0,0,100%x,5%y)
	
	usernametxt.SingleLine = True
	usernametxt.Hint = "Username"
	usernametxt.HintColor = AppColors.LightGray
	
	passwordtxt.Hint = "Password"
	passwordtxt.PasswordMode = True
'	passwordtxt.InputType =  Bit.Or(passwordtxt.InputType, 0x00000080)
	passwordtxt.HintColor = AppColors.LightGray
	
'   usernametxt.Text = "admin"
'	passwordtxt.Text = "1234"
	
'	Support.ApplyViewStyle(usernametxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
'	Support.ApplyViewStyle(passwordtxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	
	loginbtn.Text = "Login"
	loginbtn.Gravity = Gravity.CENTER
	Support.ApplyViewStyle(loginbtn,AppColors.LightGray,AppColors.FadedBlack2,AppColors.FadedBlack2,AppColors.FadedBlack,AppColors.FadedBlack,Colors.White,Colors.White,0)
	
	registerbtn.Text = "Register"
	registerbtn.Gravity = Gravity.CENTER
	Support.ApplyViewStyle(registerbtn,AppColors.LightGray,AppColors.FadedBlack2,AppColors.FadedBlack2,AppColors.FadedBlack,AppColors.FadedBlack,Colors.White,Colors.White,0)
	
	ScreenLogo.Color = Colors.DarkGray
	
	Logo.Bitmap = LoadBitmap(File.DirAssets,"Logo3.jpg")
	Logo.Gravity = Gravity.FILL
	ScreenPnl.AddView(ScreenLogo,30%x,15%y,UISizes.LoginScrDefaultWidth,15%y)
	ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,ScreenLogo.Height)
	ScreenPnl.AddView(usernametxt,ScreenLogo.Left ,ScreenLogo.Top + ScreenLogo.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	ScreenPnl.AddView(passwordtxt,usernametxt.Left,usernametxt.Top + usernametxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	ScreenPnl.AddView(loginbtn,usernametxt.Left,passwordtxt.Top + passwordtxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	ScreenPnl.AddView(registerbtn,usernametxt.Left,loginbtn.Top + loginbtn.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	
	Dim bc As Bitmap 
	bc.Initialize(File.DirAssets,"optbutton.png")
	SettingsButton.SetBackgroundImage(bc)
	Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y - 4dip)

	
End Sub

Public Sub AsView As View
	Return ScreenPnl
End Sub

Public Sub SettingsIsVisible As Int
	Return SettingsMenuLogin.AsView.Left
End Sub

Public Sub HideSettings
	If SettingsMenuLogin.AsView.Left = 0 Then
		SettingsMenuLogin.AsView.SetLayoutAnimated(500,-15%x,5%y,15%x,5%y)
	End If
End Sub

Public Sub Settings_Click
	
	SettingsMenuLogin.AppSettings_Click
End Sub

Public Sub Login_Click
	CallSub(Main,"HideAppSettingsScreen")
	loginbtn.Enabled = False
'	CallSub(Main,"ShowMainScreen")
	If Not( usernametxt.Text = "") Then
		If Not( passwordtxt.Text = "") Then
			Dim login As ResumableSub = Main.HTTP.Login(usernametxt.Text, passwordtxt.Text )
			Wait For (login)  Complete (Result As Object)
				
			If Main.HTTP.Output = "" Then
				Log("LOGIN FAILED")
				ToastMessageShow("Wrong username or password! Try again!",False)
				Sleep(20)
				loginbtn.Enabled = True
			Else
				Log("Login Output:" & Main.HTTP.Output)
				Try
					Main.LoggedCustomer = JSONSerializations.SerializeLoginCustomer(Main.HTTP.Output)
				Catch
					Log("error")
				End Try
				CallSub(Main,"ShowMainScreen")
				Main.HTTP.ClearOuput
				loginbtn.Enabled = True
			End If
		Else
			ToastMessageShow("Enter Password!",False)
		End If
	Else
		ToastMessageShow("Enter Username!",False)
	End If
End Sub

Sub JobDone (Job As HttpJob)
	If Job.Success = False Then
		Log("login failed")
	Else
		Log("login success")
		Log(Job.GetString)
	End If
	Job.Release
End Sub

Sub Register_Click
	CallSub(Main,"HideAppSettingsScreen")
	CallSub(Main,"ShowRegisterScreen")
End Sub

