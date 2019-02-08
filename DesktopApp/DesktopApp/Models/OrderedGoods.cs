namespace DesktopApp.Models
{
    public class OrderedGoods
    {

        public Order Order { get; set; }
        public int OrderID { get; set; }
        
        public int GoodID { get; set; }

        public int Qtty { get; set; }
    }
}
