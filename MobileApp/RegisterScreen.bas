B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private ScreenPnl As Panel
	
	Private pnlInfo1 As Panel
	Private pnlInfo2 As Panel
	Private pnlInfo3 As Panel
	
	Private usernametxt As EditText
	Private passwordtxt As EditText
	Private emailtxt As EditText
	
	Private firstnametxt As EditText
	Private lastnametxt As EditText
	Private phonetxt As EditText
	
	Private citytxt As EditText
	Private countrytxt As EditText
	Private addresstxt As EditText
	
	Private btnNext0,btnNext1,btnDone As Button
	
	Private btnBack0,btnBack1 As Button
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ScreenPnl.Initialize("")
	
	pnlInfo1.Initialize("")
	pnlInfo2.Initialize("")
	pnlInfo3.Initialize("")
	
	usernametxt.Initialize("")
	passwordtxt.Initialize("")
	emailtxt.Initialize("")
	
	firstnametxt.Initialize("")
	lastnametxt.Initialize("")
	phonetxt.Initialize("")
	
	citytxt.Initialize("")
	countrytxt.Initialize("")
	addresstxt.Initialize("")
	
	btnNext0.Initialize("NextInfo")
	btnNext1.Initialize("NextInfo1")
	btnDone.Initialize("RegistrationDone")
	btnBack0.Initialize("BackInfo")
	btnBack1.Initialize("BackInfo1")
	
	BuildUI
End Sub

Public Sub AsView As View
	Return ScreenPnl
End Sub

Public Sub BuildUI
	ScreenPnl.Color = Colors.white

	usernametxt.Hint = "Username"
	usernametxt.HintColor = Colors.ARGB(120,0,0,0)
	usernametxt.SingleLine = True
	passwordtxt.Hint = "Password"
	passwordtxt.SingleLine = True
	passwordtxt.HintColor = Colors.ARGB(120,0,0,0)
	emailtxt.Hint = "Email"
	emailtxt.SingleLine = True
	emailtxt.HintColor = Colors.ARGB(120,0,0,0)
	
	Support.ApplyViewStyle(usernametxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	Support.ApplyViewStyle(passwordtxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	Support.ApplyViewStyle(emailtxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	
	btnNext0.Text = "Next"
	btnNext0.Gravity = Gravity.CENTER
	Support.ApplyViewStyle(btnNext0,Colors.DarkGray,Colors.Gray,Colors.White,Colors.DarkGray,Colors.White,Colors.White,Colors.White,20)
	
	BuildInfo1
	BuildInfo2
	
	ScreenPnl.AddView(pnlInfo1,UISizes.LoginScrDefaultLeft,30%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight*4 + 4%y)
	pnlInfo1.AddView(usernametxt,0,0%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	pnlInfo1.AddView(passwordtxt,usernametxt.Left,usernametxt.Top + usernametxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	pnlInfo1.AddView(emailtxt,passwordtxt.Left,passwordtxt.Top + passwordtxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	pnlInfo1.AddView(btnNext0,UISizes.LoginScrDefaultWidth/2*0.50,emailtxt.Top + emailtxt.Height + 1%y,UISizes.LoginScrDefaultWidth/2,UISizes.EditTextDefaultHeight)
	
	ScreenPnl.AddView(pnlInfo2,pnlInfo1.Left,pnlInfo1.Top,pnlInfo1.Width,pnlInfo1.Height)
	pnlInfo2.Visible = False
	pnlInfo2.Enabled = False
	
	ScreenPnl.AddView(pnlInfo3,pnlInfo1.Left,pnlInfo1.Top,pnlInfo1.Width,pnlInfo1.Height)
	pnlInfo3.Visible = False
	pnlInfo3.Enabled = False
End Sub


Public Sub BuildInfo1
	pnlInfo2.Color = Colors.white

	firstnametxt.Hint = "First Name"
	firstnametxt.HintColor = Colors.ARGB(120,0,0,0)
	firstnametxt.SingleLine = True
	lastnametxt.Hint = "Last Name"
	lastnametxt.SingleLine = True
	lastnametxt.HintColor = Colors.ARGB(120,0,0,0)
	phonetxt.Hint = "Phone"
	phonetxt.SingleLine = True
	phonetxt.HintColor = Colors.ARGB(120,0,0,0)
	
	Support.ApplyViewStyle(firstnametxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	Support.ApplyViewStyle(lastnametxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	Support.ApplyViewStyle(phonetxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	
	btnNext1.Text = "Next"
	btnNext1.Gravity = Gravity.CENTER
	Support.ApplyViewStyle(btnNext1,Colors.DarkGray,Colors.Gray,Colors.White,Colors.DarkGray,Colors.White,Colors.White,Colors.White,20)
	btnBack0.Text = "Back"
	btnBack0.Gravity = Gravity.CENTER
	Support.ApplyViewStyle(btnBack0,Colors.DarkGray,Colors.Gray,Colors.White,Colors.DarkGray,Colors.White,Colors.White,Colors.White,20)
	pnlInfo2.AddView(firstnametxt,0,0%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	pnlInfo2.AddView(lastnametxt,firstnametxt.Left,firstnametxt.Top + firstnametxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	pnlInfo2.AddView(phonetxt,lastnametxt.Left,lastnametxt.Top + lastnametxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	pnlInfo2.AddView(btnNext1,UISizes.LoginScrDefaultWidth/2,phonetxt.Top + phonetxt.Height + 1%y,UISizes.LoginScrDefaultWidth/2,UISizes.EditTextDefaultHeight)
	pnlInfo2.AddView(btnBack0,phonetxt.left,phonetxt.Top + phonetxt.Height + 1%y,UISizes.LoginScrDefaultWidth/2,UISizes.EditTextDefaultHeight)

End Sub

Public Sub BuildInfo2
	pnlInfo3.Color = Colors.white

	citytxt.Hint = "City"
	citytxt.HintColor = Colors.ARGB(120,0,0,0)
	citytxt.SingleLine = True
	countrytxt.Hint = "Country"
	countrytxt.SingleLine = True
	countrytxt.HintColor = Colors.ARGB(120,0,0,0)
	addresstxt.Hint = "Address"
	addresstxt.SingleLine = True
	addresstxt.HintColor = Colors.ARGB(120,0,0,0)
	
	Support.ApplyViewStyle(citytxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	Support.ApplyViewStyle(countrytxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	Support.ApplyViewStyle(addresstxt,Colors.DarkGray,Colors.LightGray,Colors.LightGray,Colors.White,Colors.White,Colors.White,Colors.White,20)
	
	btnDone.Text = "Done"
	btnDone.Gravity = Gravity.CENTER
	Support.ApplyViewStyle(btnDone,Colors.DarkGray,Colors.Gray,Colors.White,Colors.DarkGray,Colors.White,Colors.White,Colors.White,20)
	btnBack1.Text = "Back"
	btnBack1.Gravity = Gravity.CENTER
	Support.ApplyViewStyle(btnBack1,Colors.DarkGray,Colors.Gray,Colors.White,Colors.DarkGray,Colors.White,Colors.White,Colors.White,20)
	pnlInfo3.AddView(citytxt,0,0%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	pnlInfo3.AddView(countrytxt,citytxt.Left,citytxt.Top + citytxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	pnlInfo3.AddView(addresstxt,countrytxt.Left,countrytxt.Top + countrytxt.Height + 1%y,UISizes.LoginScrDefaultWidth,UISizes.EditTextDefaultHeight)
	pnlInfo3.AddView(btnDone,UISizes.LoginScrDefaultWidth/2,addresstxt.Top + addresstxt.Height + 1%y,UISizes.LoginScrDefaultWidth/2,UISizes.EditTextDefaultHeight)
	pnlInfo3.AddView(btnBack1,addresstxt.left,addresstxt.Top + addresstxt.Height + 1%y,UISizes.LoginScrDefaultWidth/2,UISizes.EditTextDefaultHeight)

End Sub

Public Sub NextInfo_Click
	ShowInfo1
End Sub

Public Sub BackInfo_Click
	ShowInfo1
End Sub

Public Sub NextInfo1_Click
	ShowInfo2
End Sub

Public Sub BackInfo1_Click
	ShowInfo2
End Sub

Public Sub ShowInfo1
	If pnlInfo2.Visible = False Then
		pnlInfo2.Visible = True
		pnlInfo2.Enabled = True
	Else
		pnlInfo2.Visible = False
		pnlInfo2.Enabled = False
	End If
End Sub

Public Sub ShowInfo2
	If pnlInfo3.Visible = False Then
		pnlInfo3.Visible = True
		pnlInfo3.Enabled = True
	Else
		pnlInfo3.Visible = False
		pnlInfo3.Enabled = False
	End If
End Sub

Public Sub RegistrationDone_Click
'	test
	usernametxt.Text = "test"
	passwordtxt.Text = "test"
	emailtxt.Text = "test"
	firstnametxt.Text = "test"
	lastnametxt.Text = "test"
	phonetxt.Text  = "test"
	citytxt.Text = "test"
	countrytxt.Text = "test"
	addresstxt.Text = "test"
	
	Public NewCustomer As Customer
	NewCustomer.Initialize
	
	If CheckForMissingFields = True Then
		NewCustomer.username = usernametxt.Text
		NewCustomer.password = passwordtxt.Text
		NewCustomer.email = emailtxt.Text
		NewCustomer.FirstName = firstnametxt.Text
		NewCustomer.LastName = lastnametxt.Text
		NewCustomer.Phone = phonetxt.Text
		NewCustomer.City = citytxt.Text
		NewCustomer.Country = countrytxt.Text
		NewCustomer.Address = addresstxt.Text
	
		Dim register As ResumableSub = Main.HTTP.RegisterNewCustomer(NewCustomer)
		Wait For (register)  Complete (Result As Object)
		If Main.HTTP.Output = "Satus_Code:401" Then
			Log("LOGIN FAILED")
		Else if Main.HTTP.Output = "Satus_Code:200" Then
			CallSub(Main,"ShowMainScreen")
			Main.HTTP.ClearOuput
			ReturnToLoginScreen
			ClearTextFields
		End If
	Else 
		Log("missing info")
	End If
End Sub

Public Sub CheckForMissingFields As Boolean
	Dim result As Boolean = False
	If usernametxt.Text.Length > 0 Then 
		If passwordtxt.Text.Length > 0 Then
			If emailtxt.Text.Length > 0 Then
				If firstnametxt.Text.Length > 0 Then
					If lastnametxt.Text.Length > 0 Then
						If phonetxt.Text.Length > 0 Then
							If citytxt.Text.Length > 0 Then
								If countrytxt.Text.Length > 0 Then
									If addresstxt.Text.Length > 0 Then
										result = True
									End If
								End If
							End If
						End If
					End If
				End If
			End If
		End If
	End If
	Return result
End Sub

Public Sub ReturnToLoginScreen
	CallSub(Main,"ShowRegisterScreen")
End Sub

Public Sub ClearTextFields
	usernametxt.Text = ""
	passwordtxt.Text = ""
	emailtxt.Text = ""
	firstnametxt.Text = ""
	lastnametxt.Text = ""
	phonetxt.Text = ""
	citytxt.Text = ""
	countrytxt.Text = ""
	addresstxt.Text = ""
End Sub

Public Sub SendInfoToAPI
'	http request to the api with the info of the new user
End Sub