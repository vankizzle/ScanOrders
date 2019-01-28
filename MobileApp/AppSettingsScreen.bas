B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private ScreenPnl As Panel

	Private SpnLanguage As Spinner
	Private SpnFontSize As Spinner
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ScreenPnl.Initialize("")
	
	SpnLanguage.Initialize("SpnLng")
	SpnFontSize.Initialize("SpnFntSize")
	
	BuildUI
End Sub


Public Sub BuildUI
	
	ScreenPnl.Color = Colors.ARGB(150,0,0,0)
	
	FillSettings
	SpinnersView
	
	ScreenPnl.AddView(SpnLanguage,UISizes.SettingsSpinnersLeft,UISizes.SettingsSpinnersTop,UISizes.SettingsSpinnersWidth,UISizes.SettingsSpinnersHeight)
	ScreenPnl.AddView(SpnFontSize,SpnLanguage.Left,SpnLanguage.Top + SpnLanguage.Height + 2%y,SpnLanguage.Width,SpnLanguage.Height)

End Sub

Public Sub FillSettings
	
	SpnLanguage.AddAll(Data.LoadLanguages)
	SpnFontSize.AddAll(Data.LoadFontSizes)
	
End Sub

Public Sub SpinnersView
	SpnLanguage.Color = Colors.ARGB(200,0,0,0)
	SpnFontSize.Color = Colors.ARGB(200,0,0,0)
	
	SpnLanguage.TextColor = Colors.LightGray
	SpnFontSize.TextColor = Colors.LightGray
	
	SpnLanguage.Padding =  Array As Int (0dip, 0dip, 0dip, 0dip)
	SpnFontSize.Padding =  Array As Int (0dip, 0dip, 0dip, 0dip)
End Sub

Public Sub SpnLng_ItemClick (Position As Int, Value As Object)

End Sub

Public Sub SpnFntSize_ItemClick (Position As Int, Value As Object)

End Sub

Public Sub AsView As View
	Return ScreenPnl
End Sub