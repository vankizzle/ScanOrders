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
	
	Private usernametxt As EditText
	Private passwordtxt As EditText
	
'	Private usernamelbl As Label
'	Private passwordlbl As Label
'	
	Private loginbtn As Button
	Private registerbtn As Button
	Private settingsbtn As Button
	
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
	loginbtn.Initialize("")
	registerbtn.Initialize("")
	settingsbtn.Initialize("")
	BuildUI
End Sub

Public Sub BuildUI
'	ScreenPnl.Color = Colors.RGB(36,104,189)
	ScreenPnl.Color = Colors.White

	usernametxt.Color = Colors.White
	
	usernametxt.Hint = "Username"
	usernametxt.HintColor = Colors.LightGray
	usernametxt.SingleLine = True
	passwordtxt.Hint = "Password"
	passwordtxt.SingleLine = True
	passwordtxt.HintColor = Colors.LightGray
	Support.ApplyViewStyle(usernametxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	Support.ApplyViewStyle(passwordtxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	
	loginbtn.Text = "Login"
	loginbtn.Gravity = Gravity.CENTER
	Support.ApplyViewStyle(loginbtn,Colors.DarkGray,Colors.Gray,Colors.White,Colors.DarkGray,Colors.White,Colors.White,Colors.White,20)
	
	registerbtn.Text = "Register"
	registerbtn.Gravity = Gravity.CENTER
	Support.ApplyViewStyle(registerbtn,Colors.DarkGray,Colors.Gray,Colors.White,Colors.DarkGray,Colors.White,Colors.White,Colors.White,20)
	
	ScreenLogo.Color = Colors.DarkGray
	
	Logo.Bitmap = LoadBitmap(File.DirAssets,"express-shop-logo-01.jpg")
	Logo.Gravity = Gravity.FILL
	ScreenPnl.AddView(ScreenLogo,UISizes.LoginScrDefaultLeft,15%y,UISizes.LoginScrDefaultWidth,20%y)
	ScreenPnl.AddView(usernametxt,ScreenLogo.Left,ScreenLogo.Top + ScreenLogo.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	ScreenLogo.AddView(Logo,0,0,ScreenLogo.Width,ScreenLogo.Height)
	ScreenPnl.AddView(passwordtxt,ScreenLogo.Left,usernametxt.Top + usernametxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	ScreenPnl.AddView(loginbtn,ScreenLogo.Left,passwordtxt.Top + passwordtxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	ScreenPnl.AddView(registerbtn,ScreenLogo.Left,loginbtn.Top + loginbtn.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
'	ScreenPnl.AddView(ScreenLogo,UISizes.LoginScrDefaultLeft,15%y,UISizes.LoginScrDefaultWidth,20%y)
'	ScreenPnl.AddView(ScreenLogo,UISizes.LoginScrDefaultLeft,15%y,UISizes.LoginScrDefaultWidth,20%y)
	
End Sub

Public Sub AsView As View
	Return ScreenPnl
End Sub