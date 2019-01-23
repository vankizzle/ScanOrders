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
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ScreenPnl.Initialize("")
	Header.Initialize("")
	SettingsButton.Initialize("Settings")
	SettingsMenuLogin.Initialize(2)
	
	BuildUI
End Sub

Public Sub HideSettings
	If SettingsMenuLogin.AsView.Left = 0 Then
		SettingsMenuLogin.AsView.SetLayoutAnimated(500,-15%x,5%y,15%x,10%y)
	End If
End Sub

Public Sub BuildUI
	
	ScreenPnl.Color = Colors.Blue
	ScreenPnl.AddView(Header,0,0,100%x,5%y)
	Header.Color = Colors.RGB(182,0,0)
	
	Dim bc As Bitmap
	bc.Initialize(File.DirAssets,"optbutton.png")
	SettingsButton.SetBackgroundImage(bc)
	Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y - 4dip)
	ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,5%y,15%x,10%y)
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