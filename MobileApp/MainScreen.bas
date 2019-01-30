B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private ScreenPnl As Panel
	Public ScanButton As ImageView
	Public QRScanner As Zxing_B4A
	Private CameraExists As Boolean
	Private pnlCheckCamera As Panel
	Public camera As Camera
	
	Private Header As Panel
	Private SettingsButton As Button
	Private SettingsMenuLogin As SettingsMenu
	
	Public Cart As ShoppingCart
	Public InfoScreen As ItemInfoVisualizer
	
	Public FakePnl As Panel
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

	ScreenPnl.Initialize("")
	'Инициализираме бутонът за сканиране
	ScanButton.Initialize("startScan")
	Header.Initialize("")
	SettingsButton.Initialize("Settings")
	SettingsMenuLogin.Initialize(1)
	
	Cart.Initialize
	InfoScreen.Initialize
	
	FakePnl.Initialize("")
	BuildUI
	Check_IfCameraExists
End Sub

Public Sub SettingsIsVisible As Int
	Return SettingsMenuLogin.AsView.Left
End Sub

Public Sub HideSettings
	If SettingsMenuLogin.AsView.Left = 0 Then
		SettingsMenuLogin.AsView.SetLayoutAnimated(500,-15%x,5%y,15%x,10%y)
	End If
End Sub

Public Sub Settings_Click
	If SettingsMenuLogin.AsView.Left = -15%x Then
		SettingsMenuLogin.AsView.SetLayoutAnimated(500,0,5%y,15%x,10%y)
	else if SettingsMenuLogin.AsView.Left = 0 Then
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
	
	ScreenPnl.AddView(ScanButton, UISizes.ScanBtnDefaultLeft, UISizes.ScanBtnDefaultTop, UISizes.ScanBtnDefaultWidth, UISizes.ScanBtnDefaultHeight)
	ScanButton.Bitmap = LoadBitmap(File.DirAssets,"scanbtn1.png")
	ScanButton.Gravity = Gravity.FILL
	
	ScreenPnl.AddView(Cart.AsView,5%x,35%y,90%x,50%y)
	ScreenPnl.AddView(FakePnl,5%x - 2dip,10%y - 2dip,90%x + 4dip,24%y + 4dip)
	ScreenPnl.AddView(InfoScreen.AsView,5%x,10%y,90%x,24%y)
	ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,5%y,15%x,10%y)
End Sub

Public Sub AsView As View
	Return ScreenPnl
End Sub

Private Sub CameraCheck_Ready (Success As Boolean)
	Log("Camera Exists- "&Success)
	CameraExists=Success
	CallSubDelayed(Me,"Remove_CameraChecker")
End Sub

'Проверка за наличието на камера / Check for camera
Public Sub Check_IfCameraExists
	Log("Start- Checking Camera")
	pnlCheckCamera.Initialize("")
	ScreenPnl.AddView(pnlCheckCamera,-999,-999,1dip,1dip)
	camera.Initialize(pnlCheckCamera,"CameraCheck")
End Sub

private Sub Remove_CameraChecker
	camera.Release
	pnlCheckCamera.RemoveView
	Log("End- Checking Camera")
End Sub

Public Sub startScan_Click
	If CameraExists Then
		Log("click")
'		QRScanner.BeginScan("QRScanner")
'		Cart.TestWithFakes(10)
'		Cart.BuildCart
		Cart.GetItemFromDB(3)
		
		
	Else
		Log("Camera:"&CameraExists)
	End If
End Sub

Public Sub QRScanner_result(atype As String, Values As String)
	
End Sub