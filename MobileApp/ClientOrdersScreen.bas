B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private ScreenPnl As Panel
	Private Header As Panel
	Private SettingsButton As Button
	Private SettingsMenuLogin As SettingsMenu
	
	Private test As Button
	
	Public CartOrders As OrdersCart
	Public OrderInfoVisual As OrderInfoVisualizer
	
	Public FakePnl As Panel
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ScreenPnl.Initialize("")
	Header.Initialize("")
	SettingsButton.Initialize("Settings")
	SettingsMenuLogin.Initialize(2)
	CartOrders.Initialize
	OrderInfoVisual.Initialize
'	
	test.Initialize("test")
	test.Color = Colors.Red
	test.Text = "TEST"
	test.Visible = False
	ScreenPnl.AddView(test,0%x,5%y,10%x,5%y)
'	
	FakePnl.Initialize("")
	
	BuildUI
	test_Click
End Sub

Public Sub test_Click
	CartOrders.TestWithFakes
	CartOrders.BuildCart
End Sub

Public Sub HideSettings
	If SettingsMenuLogin.AsView.Left = 0 Then
		SettingsMenuLogin.AsView.SetLayoutAnimated(500,-15%x,5%y,15%x,10%y)
	End If
End Sub

Public Sub BuildUI
	
	ScreenPnl.Color = AppColors.DarkGray
	ScreenPnl.AddView(Header,0,0,100%x,5%y)
	Header.Color = AppColors.FadedDarkRed
	FakePnl.Color = AppColors.White
	
	Dim bc As Bitmap
	bc.Initialize(File.DirAssets,"optbutton.png")
	SettingsButton.SetBackgroundImage(bc)
	Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y - 4dip)
	ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,5%y,15%x,10%y)
	ScreenPnl.AddView(CartOrders.AsView,5%x,45%y,90%x,44%y)
	ScreenPnl.AddView(FakePnl,5%x - 2dip,10%y - 2dip,90%x + 4dip,24%y + 4dip)
	ScreenPnl.AddView(OrderInfoVisual.AsView,5%x,10%y,90%x,24%y)
	
End Sub

Public Sub Settings_Click
	If SettingsMenuLogin.AsView.Left = -15%x Then
		SettingsMenuLogin.AsView.SetLayoutAnimated(500,0,5%y,15%x,10%y)
	else if SettingsMenuLogin.AsView.Left = 0 Then
		SettingsMenuLogin.AsView.SetLayoutAnimated(500,-15%x,5%y,15%x,10%y)
	End If
End Sub

Public Sub AsView As View
	Return ScreenPnl
End Sub