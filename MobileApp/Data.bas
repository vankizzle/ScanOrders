B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
End Sub

Public Sub LoadLanguages As List
	Dim Languages As List
	Languages.Initialize
	
	Languages.Add("English")
	Languages.Add("Bulgarian")
	Languages.Add("test")
	
	Return Languages
End Sub

Public Sub LoadFontSizes As List
	Public FontSizes As List
	FontSizes.Initialize
	
	FontSizes.Add(6)
	FontSizes.Add(8)
	FontSizes.Add(10)
	FontSizes.Add(12)
	FontSizes.Add(14)
	FontSizes.Add(16)
	
	Return FontSizes
End Sub