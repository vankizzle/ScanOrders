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
	Public IP As String = "192.168.63.163"
	Public Port As String = "1948"
End Sub
'Apply style to control. TextColor is only relevant for views that have it, but you should pass a value for others too.
Public Sub ApplyViewStyle (Control As View, TextColor As Int, ColorA As Int, ColorB As Int, ColorPressedA As Int, ColorPressedB As Int, ColorDisabledA As Int, ColorDisabledB As Int, CornerRound As Int)
	'Handle controls with TextColor
	If Control Is Button Then
		Dim btn As Button = Control
		btn.TextColor = TextColor
	End If

	If Control Is EditText Then
		Dim txt As EditText = Control
		txt.TextColor = TextColor
	End If
	
	If Control Is Spinner Then
		Dim sp As Spinner = Control
		sp.TextColor = TextColor
	End If
	
	'Apply background gradient
	Control.Background = Gradient(ColorA, ColorB, ColorPressedA, ColorPressedB, ColorDisabledA, ColorDisabledB, CornerRound)
	MinimumPadding(Control)
End Sub

'Задава градиент за фон на контролите в приложението - добавено заобляне
Private Sub Gradient(ColorA As Int, ColorB As Int, ColorPressedA As Int, ColorPressedB As Int, ColorDisabledA As Int, ColorDisabledB As Int, CornerRound As Int) As StateListDrawable

	'Дефинира два цвята за стандартния режим на бутона
	Dim colsEnabled(2) As Int
	
	colsEnabled(0) = ColorA
	colsEnabled(1) = ColorB
	'Дефинира градиент за стандартния режим на бутона
	Dim gdwEnabled As GradientDrawable
	gdwEnabled.Initialize("TOP_BOTTOM", colsEnabled)
	gdwEnabled.CornerRadius = CornerRound
	
	'Дефинира два цвята за натиснат бутон
	Dim colsPressed(2) As Int
	colsPressed(0) = ColorPressedA
	colsPressed(1) = ColorPressedB
	
	'Дефинира градиент за натиснат бутон
	Dim gdwPressed As GradientDrawable
	
	gdwPressed.Initialize("TOP_BOTTOM", colsPressed)
	gdwPressed.CornerRadius = CornerRound

	'Дефинира два цвята за неактивния режим на работа
	Dim colsDisabled(2) As Int
	colsDisabled(0) = ColorDisabledA
	colsDisabled(1) = ColorDisabledB
	
	'Дефинира градиент за натиснат бутон
	Dim gdwDisabled As GradientDrawable
	gdwDisabled.Initialize("TOP_BOTTOM", colsDisabled)
	gdwDisabled.CornerRadius = CornerRound

	'Дефинира StateListDrawable като контейнер на градиента
	Dim stdGradient As StateListDrawable
	stdGradient.Initialize
	Dim states(2) As Int
	states(0) = stdGradient.State_Enabled
	states(1) = -stdGradient.State_Pressed
	stdGradient.addState2(states, gdwEnabled)
	Dim states(1) As Int
	states(0) = stdGradient.State_Pressed
	stdGradient.addState2(states, gdwPressed)
	Dim states(1) As Int
	states(0) = stdGradient.State_Disabled
	stdGradient.addState2(states, gdwDisabled)
	' Връща градиента като параметър
	Return stdGradient
End Sub

Public Sub MinimumPadding(MyObj As Object)
	Dim PaddingTopBottom = 1dip, PaddingLeftRight = 5dip As Int
	Dim r As Reflector
	r.Target = MyObj
	r.RunMethod4("setPadding", Array As Object(PaddingLeftRight, PaddingTopBottom, PaddingLeftRight, PaddingTopBottom), Array As String("java.lang.int", "java.lang.int", "java.lang.int", "java.lang.int"))
End Sub


