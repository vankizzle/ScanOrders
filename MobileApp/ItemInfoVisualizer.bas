B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private InfoHolder As Panel
	Private ItemNamelbl,ItemDescriptionlbl,ItemPricelbl,ItemQttylbl,ItemPLUlbl,ItemIsDicontinuedlbl As Label
	Private ItemSupplierNamelbl,ItemSupplierPhone,ItemPricelbl,ItemQttylbl,ItemIsDicontinuedlbl As Label
	Private DescriptionContext As ScrollView
	Private DescriptionText As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
	InfoHolder.Initialize("")
	
	ItemNamelbl.Initialize("")
	ItemDescriptionlbl.Initialize("")
	ItemPricelbl.Initialize("")
	ItemQttylbl.Initialize("")
	ItemIsDicontinuedlbl.Initialize("")
	ItemPLUlbl.Initialize("")
	
	ItemSupplierNamelbl.Initialize("")
	ItemSupplierPhone.Initialize("")
	
	InfoHolder.Initialize("")
	DescriptionContext.Initialize(20%y)
	DescriptionText.Initialize("")
	
	BuildInfoUI
End Sub

Public Sub BuildInfoUI
	InfoHolder.Color = Colors.DarkGray
	
	ItemNamelbl.Gravity = Gravity.CENTER
	ItemNamelbl.TextColor = Colors.White
	ItemNamelbl.TextSize = 20
	ItemNamelbl.Text = "Name"
'	ItemNamelbl.Color = Colors.Magenta
	
	ItemDescriptionlbl.Gravity = Gravity.CENTER
	ItemDescriptionlbl.TextColor = Colors.White
'	ItemDescriptionlbl.Color = Colors.Green
	ItemDescriptionlbl.Text = "Description"
	ItemDescriptionlbl.TextSize = 20
	
	ItemIsDicontinuedlbl.Gravity = Gravity.CENTER
	ItemIsDicontinuedlbl.TextColor = Colors.White
'	ItemIsDicontinuedlbl.Color = Colors.Blue
	ItemIsDicontinuedlbl.Text = "In Stock"
	ItemIsDicontinuedlbl.TextSize = 18
	
	ItemPLUlbl.Gravity = Gravity.CENTER
	ItemPLUlbl.TextColor = Colors.White
	ItemPLUlbl.Text = "PLU:"
'	ItemPLUlbl.Color = Colors.Yellow
	
	ItemSupplierNamelbl.Gravity = Gravity.CENTER
	ItemSupplierNamelbl.TextColor = Colors.White
	ItemSupplierNamelbl.Text = "Supplier:"
	ItemSupplierNamelbl.TextSize = 18
'	ItemSupplierNamelbl.Color = Colors.Magenta
	
'	DescriptionContext.Panel.Color = Colors.Cyan
	
	DescriptionText.Initialize("")
	DescriptionText.Color = Colors.Transparent
	DescriptionText.Textcolor = Colors.White
	DescriptionText.Gravity = Gravity.CENTER
	DescriptionText.TextSize = 14
	DescriptionContext.Panel.AddView(DescriptionText, 0, 0, DescriptionContext.Panel.Width, DescriptionContext.Panel.Height)
	
	InfoHolder.AddView(ItemNamelbl,0,0,40%x,5%y)
	InfoHolder.AddView(ItemSupplierNamelbl,ItemNamelbl.Left,ItemNamelbl.Top + ItemNamelbl.Height,ItemNamelbl.Width,ItemNamelbl.Height)
	InfoHolder.AddView(ItemPLUlbl,ItemSupplierNamelbl.Left,ItemSupplierNamelbl.Top + ItemSupplierNamelbl.Height,ItemSupplierNamelbl.Width,ItemSupplierNamelbl.Height)
	InfoHolder.AddView(ItemIsDicontinuedlbl,ItemPLUlbl.Left,ItemPLUlbl.Top + ItemPLUlbl.Height,ItemPLUlbl.Width,ItemPLUlbl.Height + 3dip)
	InfoHolder.AddView(ItemDescriptionlbl,ItemNamelbl.Left + ItemNamelbl.Width,ItemNamelbl.Top,50%x,ItemNamelbl.Height)
	InfoHolder.AddView(DescriptionContext,ItemDescriptionlbl.Left,ItemDescriptionlbl.Top + ItemDescriptionlbl.Height,50%x,18%y + 3dip)
End Sub

Public Sub AsView As View
	Return InfoHolder
End Sub

Public Sub SetCurrentInfo(g As Good,s As Supplier)
	ItemNamelbl.Text = g.Name
	If g.Is_Discontinued = 1 Then
		ItemIsDicontinuedlbl.Text = "Out of stock"
	Else if  g.Is_Discontinued = 0 Then
		ItemIsDicontinuedlbl.Text = "In stock"
	End If
	
	ItemPLUlbl.Text = "PLU:" & g.PLU
	
	ItemSupplierNamelbl.Text = "Supplier:" & s.SupplierName
	DescriptionText.Text = g.Description
End Sub
