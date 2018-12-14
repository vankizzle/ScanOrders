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
	Public LoginScrDefaultLeft As Int
	Public LoginScrDefaultTop As Int
	Public LoginScrDefaultWidth As Int
	Public LoginScrDefaultHeight As Int
	Public EditTextDefaultHeight As Int
End Sub

Public Sub Initialize(Is_Landscape As Boolean)
	If Is_Landscape Then
		
	Else
		LoginScrDefaultLeft = 30%x
		LoginScrDefaultTop = 0%y
		LoginScrDefaultWidth = 40%x
		LoginScrDefaultHeight = 10%y
		EditTextDefaultHeight = 5%y
	End If
End Sub