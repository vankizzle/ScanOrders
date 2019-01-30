B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Public CartPan,pblBase,pnlHeader As Panel
	Private ItemNamelbl,ItemPricelbl,ItemQttylbl,FinalSumlbl,Sumlbl As Label
	Public ShopList As ScrollView
	
	Public ScannedItems As Map

	Public ItemsSuppliers As Map
	Public CurrentItem As Good	
	Public CurrentSupplier As Supplier	

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ScannedItems.Initialize
	CurrentItem.Initialize
	CurrentSupplier.Initialize
	
	ItemsSuppliers.Initialize
	
	CartPan.Initialize("")
	pblBase.Initialize("")
	pnlHeader.Initialize("")
	ItemNamelbl.Initialize("")
	ItemPricelbl.Initialize("")
	ItemQttylbl.Initialize("")
	FinalSumlbl.Initialize("")
	Sumlbl.Initialize("")
	ShopList.Initialize(10%y)

	BuildCartUI
End Sub

Public Sub BuildCartUI
	CartPan.Color = AppColors.FadedBlack
	pblBase.Color = AppColors.FadedDarkRed
	pnlHeader.Color = AppColors.FadedDarkRed
	
	CartPan.AddView(pnlHeader,0,0,90%x,5%y)
	CartPan.AddView(pblBase,0,45%y,90%x,5%y)
	
	ItemNamelbl.Text = "Name"
	ItemNamelbl.Gravity = Gravity.CENTER
	ItemNamelbl.TextColor = Colors.White
	
	ItemPricelbl.Text = "Price"
	ItemPricelbl.Gravity = Gravity.CENTER
	ItemPricelbl.TextColor = Colors.White
	
	ItemQttylbl.Text = "Quantity"
	ItemQttylbl.Gravity = Gravity.CENTER
	ItemQttylbl.TextColor = Colors.White
	
	FinalSumlbl.Text = "Total"
	FinalSumlbl.Gravity = Gravity.CENTER
	FinalSumlbl.TextColor = Colors.White
	
	Sumlbl.Text = CalculateSum
	Sumlbl.Gravity = Gravity.CENTER
	Sumlbl.TextColor = Colors.White
	
	pnlHeader.AddView(ItemNamelbl, 0, 0, 20%x, 5%y)
	pnlHeader.AddView(ItemPricelbl,  ItemNamelbl.Left + ItemNamelbl.Width, 0, 20%x, 5%y)
	pnlHeader.AddView(ItemQttylbl,   ItemPricelbl.Left + ItemPricelbl.Width, 0, 20%x, 5%y)
	
	pblBase.AddView(FinalSumlbl, 0, 0, 20%x, 5%y)
	pblBase.AddView(Sumlbl, FinalSumlbl.Left + FinalSumlbl.Width, 0, 20%x, 5%y)
	
	CartPan.AddView(ShopList,0%x, 5%y,100%x,40%y)
End Sub

Public Sub CalculateSum As Double
 	Dim sum As Double = 0 
	For Each g As Good In ScannedItems.Values
		sum = sum + (g.Qtty*GetGoodPrice(g.ID))
	Next
	Return sum
End Sub

Public Sub GetGoodPrice(GoodID As Int) As Double
	Dim g As Good = ScannedItems.Get(GoodID)
	Return g.Price
End Sub

Public Sub RefreshOverall
	Sumlbl.Text =  NumberFormat2(CalculateSum,1,2,2,False)
End Sub

Public Sub AsView As View
	Return CartPan
End Sub

Public Sub AddItemToBasket(g As Good)
	If ScannedItems.ContainsKey(g.ID) Then
		Dim Item As Good = ScannedItems.Get(g.ID)
		Item.Qtty = Item.Qtty + 1
		ScannedItems.Put(Item.ID,Item)
	Else
		ScannedItems.Put(g.ID,g)
	End If
	BuildCart
End Sub
'
'Public Sub AddGoodDetail(gd As GoodDetail)
'	ItemsDetails.Put(gd.ID , gd)
'End Sub

Public Sub AddSupplier(s As Supplier)
	ItemsSuppliers.Put(s.ID,s)
End Sub

Public Sub GetItemFromDB(GoodID As Int)
	Dim GetGood As ResumableSub = Main.HTTP.GetGoodByID(GoodID)
	Wait For (GetGood)  Complete (Result As Object)
	
	CurrentItem = JSONSerializations.SerializeGood(Main.HTTP.Output)
	CurrentItem.Qtty = 1
	Main.HTTP.ClearOuput
	
	Dim GetSupplier As ResumableSub = Main.HTTP.GetSupplierByID(CurrentItem.SupplierID)
	Wait For (GetSupplier)  Complete (Result As Object)
	CurrentSupplier = JSONSerializations.SerializeSupplier(Main.HTTP.Output)
'	Log(CurrentSupplier)
	Main.HTTP.ClearOuput
	AddSupplier(CurrentSupplier)
	AddItemToBasket(CurrentItem)
	

End Sub

Public Sub RemoveItemFromBasket(GoodID As Int)
	Dim s As Supplier = ItemsSuppliers.Get(GoodID)
	ItemsSuppliers.Remove(s.ID)
	ScannedItems.Remove(GoodID)
End Sub

Public Sub BuildCart
	ShopList.Panel.RemoveAllViews
	Dim row As Int = 0
	For Each g As Good In ScannedItems.Values
		Private holder As Panel
		Private itemName,itemPrice,itemQtty As Label
		Private delitemX,additem,delitem As Button
		
		holder.Initialize("SelectItemFromBasket")
		itemQtty.Initialize("")
		itemName.Initialize("")
		itemPrice.Initialize("")
		delitemX.Initialize("RemoveItemFromBasket")
		additem.Initialize("AddQtty")
		delitem.Initialize("DelQtty")
		
'		holder.Color = AppColors.LightGray
		holder.Tag = g.ID
		
		itemName.Text = g.Name
		itemName.Gravity = Gravity.CENTER
		itemName.TextColor =  Colors.DarkGray
'		itemName.Color = Colors.LightGray
		
		itemPrice.Text = g.Price
		itemPrice.Gravity = Gravity.CENTER
		itemPrice.TextColor =  Colors.DarkGray
'		itemPrice.Color = Colors.LightGray
		
		itemQtty.Text = g.Qtty
		itemQtty.Gravity = Gravity.CENTER
		itemQtty.TextColor =  Colors.DarkGray
'		itemQtty.Color = Colors.LightGray
		
		holder.AddView(itemName, 0, 0, 20%x, 5%y)
		holder.AddView(itemPrice, itemName.Left + itemName.Width, 0, 20%x, 5%y)
		holder.AddView(itemQtty, itemPrice.Left + itemPrice.Width, 0, 20%x, 5%y)
		holder.AddView(additem, itemQtty.Left + itemQtty.Width, 0, 10%x, 5%y)
		holder.AddView(delitem, additem.Left + additem.Width, 0, 10%x, 5%y)
		holder.AddView(delitemX, delitem.Left + delitem.Width, 0, 10%x, 5%y)
		
		delitemX.Text = "x"
		delitemX.TextSize = 14
		delitemX.Gravity = Gravity.CENTER
		delitemX.TextColor =  AppColors.FadedDarkRed
		delitemX.Color = AppColors.Transparent
		delitemX.Tag = g.ID
		
		additem.Text = "+"
		additem.TextSize = 14
		additem.Textcolor = AppColors.Black
		additem.Color = AppColors.Transparent
		additem.Gravity = Gravity.CENTER
		additem.Tag = g.ID
		
		delitem.Text = "-"
		delitem.Textsize = 14
		delitem.TextColor = AppColors.Black
		delitem.Color = AppColors.Transparent
		delitem.Gravity = Gravity.CENTER
		delitem.Tag = g.ID
		
		Support.ApplyViewStyle(holder,Colors.Transparent, AppColors.LightGray, AppColors.LightGray,AppColors.LightGrayPressed,AppColors.LightGrayPressed,Colors.Transparent,Colors.Transparent,0)
		ShopList.Panel.AddView(holder,0,0+(5%y + 1dip)*row,ShopList.Panel.Width,5%y)
'		ShopList.ScrollPosition=((5%y + 1dip)*row)
		If row < ScannedItems.Size - 1 Then
			ShopList.Panel.Height = 10%y + ((5%y + 1dip)*row)
			row = row + 1
		End If
	
	Next
	RefreshOverall
End Sub

Public Sub AddQtty_Click
	Dim btn As Button
	btn = Sender
	Dim g As Good = ScannedItems.Get(btn.tag)
	g.Qtty = g.Qtty + 1
	ScannedItems.Put(g.ID,g)
	BuildCart
End Sub

Public Sub DelQtty_Click
	Dim btn As Button
	btn = Sender
	Dim g As Good = ScannedItems.Get(btn.tag)
	g.Qtty = g.Qtty - 1
	If g.Qtty <= 0 Then
	ScannedItems.Remove(g.ID)
	Else
	ScannedItems.Put(g.ID,g)
	End If
	BuildCart
	
End Sub

Public Sub RemoveItemFromBasket_Click
	Dim btn As Button
	btn = Sender  
	RemoveItemFromBasket(btn.Tag)
	BuildCart
End Sub

Public Sub TestWithFakes(num As Int)
	For i = 0 To num
		Dim g As Good
		Dim s As Supplier
		
		g.ID = i
		g.SupplierID = i
		g.Qtty = 1
	
		g.Name = "Name"&i
		g.PLU = 100+i
		g.Price = 5.99 + i
		g.Description = "nothing"
		g.Is_Discontinued = 0
		
		s.ID = i
		s.SupplierName = "Micro"&i
		s.SupploerPhone = "088896451"&i
		
	AddItemToBasket(g)
	AddSupplier(s)
	Next
End Sub

Public Sub SelectItemFromBasket_Click
	Dim pnl As Panel
	pnl = Sender
	ViewSelectedItemInfo(pnl.Tag)
	Log("Clicked " & pnl.Tag)
End Sub

Public Sub ViewSelectedItemInfo(GoodID As Int)
	Dim item As Good = ScannedItems.Get(GoodID)
	Dim s As Supplier = ItemsSuppliers.Get(item.SupplierID)
	
	CallSub3(Main,"ShowItemInfo",item,s)
End Sub