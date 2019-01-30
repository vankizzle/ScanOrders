B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub


Public Sub SerializeGood(jstring As String) As Good
	Dim JSON As JSONParser
	Dim Map1 As Map
	Dim good As Good
	Map1.Initialize
	good.Initialize
	
	JSON.Initialize(jstring)
	Map1 = JSON.NextObject
	
	good.ID = Map1.Get("id")
	good.PLU = Map1.Get("plu")
	good.Name = Map1.Get("name")
	good.Price = Map1.Get("price")
	good.Description = Map1.Get("description")
	good.Is_Discontinued = Map1.Get("is_Discontinued")
	good.SupplierID = Map1.Get("supplierID")

	Return good	
End Sub

Public Sub SerializeSupplier(jstring As String) As Supplier
	Dim JSON As JSONParser
	Dim Map1 As Map
	Dim supplier As Supplier
	Map1.Initialize
	supplier.Initialize
	
	JSON.Initialize(jstring)
	Map1 = JSON.NextObject
	
	supplier.ID =  Map1.Get("id")
	supplier.SupplierName =  Map1.Get("supplierName")
	supplier.SupploerPhone =  Map1.Get("supplierPhone")
	
	Return supplier
End Sub