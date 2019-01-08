B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private lblAppSettings As Label
	Private lblMyOrders As Label
	Private pnlHolder As Panel
	Private flag As Boolean
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Location As Int)
	pnlHolder.initialize("MainPan")
	lblMyOrders.initialize("MyOrders")
	lblAppSettings.initialize("AppSettings")

	If Location = 0 Then
		flag = False
	Else If Location = 1 Then
		flag = True
	End If
	
	BuildMenu
End Sub

Public Sub AsView As View 
	Return pnlHolder
End Sub

Public Sub BuildMenu
	lblAppSettings.Text = "Settings"
	lblAppSettings.Gravity = Gravity.CENTER
	lblAppSettings.Color = Colors.LightGray
	lblAppSettings.TextColor = Colors.Black
	
	lblMyOrders.Text = "My Orders"
	lblMyOrders.Gravity = Gravity.CENTER
	lblMyOrders.Color = Colors.LightGray
	lblMyOrders.TextColor = Colors.Black
	
	pnlHolder.AddView(lblAppSettings,0,0,15%x,5%y)
	If flag = True Then
		pnlHolder.AddView(lblMyOrders,lblAppSettings.Left,lblAppSettings.Top + lblAppSettings.Height,lblAppSettings.Width,lblAppSettings.Height)
	End If
End Sub

Public Sub MyOrders_Click
'	shows my orders screen
End Sub

Public Sub AppSettings_Click
'	shows general settings window/screen
End Sub