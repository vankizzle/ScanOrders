using System;
using System.ComponentModel;
using System.Runtime.CompilerServices;

namespace DesktopApp.ViewModels
{
    class BaseViewModel : INotifyPropertyChanged
    {
        public readonly string IP = "192.168.0.104";
        public readonly string Port = "8080";
        public readonly string ApiController = "api/actions";
      
        public readonly string Login_Url = "LoginUser";

        public readonly string RegisterClient_Url = "RegisterC";

        public readonly string GetCustomerByID = "GetCustomerByID";

        public readonly string RegisterUser_Url = "RegisterU";

        public readonly string GetGoodByID_Url = "GetGoodByID";

        public readonly string GetGoodByPLU_Url = "GetGoodByPLU";

        public readonly string SendOrder_Url = "SendOrder";

        public readonly string GetSupplierByID_Url = "GetSupplierByID";

        public readonly string GetSupplier_Url = "GetSupplier";

        public readonly string SendSupplier_Url = "SendSupplier";

        public readonly string SendGood_Url = "SendGood";

        public readonly string GetOrders_Url = "GetOrders";

        public readonly string GetOrderGoods_Url = "GetOrderGoods";

        public readonly string UpdateOrder_Url = "UpdateOrder";

        internal static string QRCodesfilePath = Environment.GetFolderPath(Environment.SpecialFolder.ApplicationData) + "\\ExpressMarket\\QR_Codes\\";

        public event PropertyChangedEventHandler PropertyChanged;

        public void OnPropertyChanged([CallerMemberName]string propertyName = null)
        {
            PropertyChangedEventHandler handler = PropertyChanged;

            if (handler != null)
            {
                handler(this, new PropertyChangedEventArgs(propertyName));
            }
        }


    }
}
