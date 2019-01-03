B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private ScreenPnl As Panel
	Public downPanel As ImageView
	Public QRScanner As Zxing_B4A
	Private CameraExists As Boolean
	Private pnlCheckCamera As Panel
	Public camera As Camera
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ScreenPnl.Initialize("")
	'Инициализираме бутонът за сканиране
	downPanel.Initialize("startScan")
	
	BuildUI
	Check_IfCameraExists
End Sub

Public Sub BuildUI
	ScreenPnl.Color = Colors.White
	ScreenPnl.AddView(downPanel, UISizes.ScanBtnDefaultLeft, UISizes.ScanBtnDefaultTop, UISizes.ScanBtnDefaultWidth, UISizes.ScanBtnDefaultHeight)
	downPanel.Bitmap = LoadBitmap(File.DirAssets,"ScanBtn.png")
	downPanel.Gravity = Gravity.FILL
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
		QRScanner.BeginScan("QRScanner")
	Else
		Log("Camera:"&CameraExists)
	End If
End Sub

Public Sub QRScanner_result(atype As String, Values As String)
	
End Sub