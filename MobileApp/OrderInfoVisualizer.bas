B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.8
@EndOfDesignText@
Sub Class_Globals
	Private InfoHolder As Panel
	Private OrderCodelbl,OrderStatusbl,OrderTotalSumlbl As Label
	Private OrderContentContext As ListView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
	InfoHolder.Initialize("")
	
	OrderCodelbl.Initialize("")
	OrderStatusbl.Initialize("")
	OrderTotalSumlbl.Initialize("")

	
	InfoHolder.Initialize("")
	OrderContentContext.Initialize("")

	BuildInfoUI
End Sub

Public Sub BuildInfoUI
	InfoHolder.Color = Colors.DarkGray
	
	OrderCodelbl.Gravity = Gravity.CENTER
	OrderCodelbl.TextColor = Colors.White
	OrderCodelbl.TextSize = 20
	OrderCodelbl.Text = "#example"
'	OrderCodelbl.Color = Colors.Magenta
	
	OrderStatusbl.Gravity = Gravity.CENTER
	OrderStatusbl.TextColor = Colors.White
	OrderStatusbl.Text = "status"
	OrderStatusbl.TextSize = 20

	OrderContentContext.SingleLineLayout.Label.TextSize = 15
	OrderContentContext.FastScrollEnabled = True
	OrderContentContext.SingleLineLayout.ItemHeight = 3%y
	
	InfoHolder.AddView(OrderCodelbl,0,0,40%x,6%y)
	InfoHolder.AddView(OrderStatusbl,OrderCodelbl.Left + OrderCodelbl.Width,OrderCodelbl.Top,50%x,OrderCodelbl.Height)
	InfoHolder.AddView(OrderContentContext,OrderCodelbl.Left,OrderCodelbl.Top + OrderCodelbl.Height,OrderCodelbl.Width + OrderStatusbl.Width ,18%y)
End Sub

Public Sub AsView As View
	Return InfoHolder
End Sub

Public Sub GoodToString(g As Good,GoodQtty As Int) As String
	Dim result As String
	result = g.Name & " / " & g.Price & " / " & GoodQtty
	Return result 
End Sub

Public Sub SetCurrentInfo(o As Order)
	OrderContentContext.Clear
	OrderCodelbl.Text = o.OrderCode
	OrderStatusbl.Text = o.OrderStatus
	For Each good As OrderedGoods In o.OrderedGoods
		Dim GetGood As ResumableSub = Main.HTTP.GetGoodByID(good.GoodID)
		Wait For (GetGood)  Complete (Result As Object)
	
		Dim tmpgood As Good = JSONSerializations.SerializeGood(Main.HTTP.Output)
		
		Main.HTTP.ClearOuput
		OrderContentContext.AddSingleLine(GoodToString(tmpgood,good.Qtty))
	Next
End Sub
