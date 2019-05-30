B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private lblAppSettings As Label
	Private lblMyOrders As Label
	Private lblShoppingCart As Label
	Private lblLoginScreen As Label
	Private pnlHolder As Panel
	Private flag As Int
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Location As Int)
	pnlHolder.initialize("MainPan")
	lblMyOrders.initialize("MyOrders")
	lblAppSettings.initialize("AppSettings")
	lblShoppingCart.Initialize("ShoppingCart")
	lblLoginScreen.Initialize("LoginScreen")
	
	If Location = 0 Then
		flag = 0
	Else If Location = 1 Then
		flag = 1
	else if Location = 2 Then
		flag = 2
	else if Location = 3 Then
		flag = 3
	End If
	Log(flag)
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
	
	lblMyOrders.Text = "My orders"
	lblMyOrders.Gravity = Gravity.CENTER
	lblMyOrders.Color = Colors.LightGray
	lblMyOrders.TextColor = Colors.Black
	
	lblShoppingCart.Text = "Cart"
	lblShoppingCart.Gravity = Gravity.CENTER
	lblShoppingCart.Color = Colors.LightGray
	lblShoppingCart.TextColor = Colors.Black
	
	lblLoginScreen.Text = "Login Screen"
	lblLoginScreen.Gravity = Gravity.CENTER
	lblLoginScreen.Color = Colors.LightGray
	lblLoginScreen.TextColor = Colors.Black
	
	If flag = 0 Then
		pnlHolder.AddView(lblAppSettings,0,0,20%x,5%y)
	else if flag = 1 Then
		pnlHolder.AddView(lblMyOrders,0,0,20%x,5%y)
	else if flag = 2 Then
		pnlHolder.AddView(lblShoppingCart,0,0,20%x,5%y)
	else if flag = 3 Then
		pnlHolder.AddView(lblLoginScreen,0,0,20%x,5%y)
	End If
End Sub

Public Sub HideSettingsWindow
	CallSub(Main,"HideSettingsWindows")
End Sub

Public Sub MyOrders_Click
'	shows my orders screen
	CallSub(Main,"ShowClientOrdersScreen")
	CallSub(Main,"HideMainScreen")
	CallSub(Main,"HideAppSettingsScreen")
	HideSettingsWindow
End Sub

Public Sub AppSettings_Click
'	shows general settings window/screen
	CallSub(Main,"ShowHideAppSettingsScreen")
'	CallSub(Main,"HideMainScreen")
'	CallSub(Main,"HideClientOrdersScreen")
'	HideSettingsWindow
End Sub

Public Sub ShoppingCart_Click
	CallSub(Main,"ShowMainScreen")
	CallSub(Main,"HideClientOrdersScreen")
	CallSub(Main,"HideAppSettingsScreen")
	HideSettingsWindow
End Sub

Public Sub LoginScreen_Click
	CallSub(Main,"HideAppSettingsScreen")
	HideSettingsWindow
End Sub