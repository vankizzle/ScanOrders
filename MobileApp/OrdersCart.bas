B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Public CartPan,pblBase,pnlHeader As Panel
	Private OrderCodelbl,OrderPricelbl,OrderStatuslbl,ItemQttylbl,ItemPricelbl,ItemQttylbl As Label
	Public OrderList As ScrollView
	
	Public CustomerOrders As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	CartPan.Initialize("")
	pblBase.Initialize("")
	pnlHeader.Initialize("")
	CustomerOrders.Initialize
	OrderList.Initialize(10%y)
	BuildUI
End Sub

Public Sub BuildUI
	CartPan.Color = Colors.ARGB(100,0,0,0)
	pblBase.Color = Colors.ARGB(180,150,4,4)
	pnlHeader.Color = Colors.ARGB(180,150,4,4)
	
	CartPan.AddView(pnlHeader,0,0,90%x,2%y)
	CartPan.AddView(pblBase,0,42%y,90%x,2%y)
	CartPan.AddView(OrderList,0%x, 2%y,100%x,40%y)
End Sub

Public Sub AddOrder(o As Order)
	CustomerOrders.Put(o.OrderCode,o)
End Sub

Public Sub AsView As View
	Return CartPan
End Sub

Public Sub BuildCart
	OrderList.Panel.RemoveAllViews
	Dim row As Int = 0
	For Each o As Order In CustomerOrders.Values
		Private holder As Panel
		Private OrderCode,OrderPrice,OrderStatus As Label
		
		holder.Initialize("")
		OrderCode.Initialize("")
		OrderPrice.Initialize("")
		OrderStatus.Initialize("")
		
		holder.Color = Colors.ARGB(150,0,0,0)
		
		OrderCode.Text = o.OrderCode
		OrderCode.TextColor = Colors.LightGray
		OrderCode.TextSize = 16
		OrderCode.Gravity = Gravity.CENTER
		
		OrderPrice.Text = o.OrderTotalPrice
		OrderPrice.TextColor = Colors.LightGray
		OrderPrice.TextSize = 18
		OrderPrice.Gravity = Gravity.CENTER

		OrderStatus.Text = o.OrderStatus
		OrderStatus.TextColor = Colors.LightGray
		OrderStatus.TextSize = 16
		OrderStatus.Gravity = Gravity.CENTER
		
		holder.AddView(OrderCode,0,0,20%x,5%y)
		holder.AddView(OrderPrice,70%x,OrderCode.Top,OrderCode.Width, OrderCode.Height*2)
		holder.AddView(OrderStatus,OrderCode.Left,OrderCode.Top + OrderCode.Height,OrderCode.Width, OrderCode.Height)
		
		OrderList.Panel.AddView(holder,0,0+(10%y + 1dip)*row,OrderList.Panel.Width,10%y)
'		ShopList.ScrollPosition=((5%y + 1dip)*row)
		If row < CustomerOrders.Size - 1 Then
			OrderList.Panel.Height = 10%y + ((10%y + 1dip)*row)
			row = row + 1
		End If
	Next
End Sub

Public Sub TestWithFakes
	Dim g,g1 As Good
	g.Initialize
	g1.Initialize
	
	g.Name = "Coca Cola"
	g.PLU = 101
	g.Price = 1.20
   
	g1.Name = "Coca"
	g1.PLU = 102
	g1.Price = 120
	
	Dim order1 As Order
	
	order1.Initialize
	order1.Goods.Initialize
	order1.Goods.Add(g)
	order1.Goods.Add(g1)
	order1.Goods.Add(g)
	
	order1.OrderCode = "#asd14z24d"
	order1.OrderStatus = "Waiting"
	order1.OrderTotalPrice = CalcOrderPrice(order1.Goods)
	AddOrder(order1)

	For i = 0 To 5
		Dim order As Order
		order.Initialize
		order.OrderCode = "#asd14z24d" & i
		order.OrderStatus = "Waiting"
		order.OrderTotalPrice = CalcOrderPrice(order1.Goods)
		AddOrder(order)
	Next
	
	
End Sub

Public Sub CalcOrderPrice(Goods As List) As Double
	Dim result As Double = 0
	For Each g As Good In Goods
		result = result + g.Price
	Next
	Return result
End Sub
