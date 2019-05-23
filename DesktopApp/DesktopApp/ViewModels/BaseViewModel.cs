using System;
using System.ComponentModel;
using System.Runtime.CompilerServices;

namespace DesktopApp.ViewModels
{
    class BaseViewModel : INotifyPropertyChanged
    {
        public readonly string IP = "192.168.63.167";
        public readonly string Port = "1948";
        public readonly string ApiController = "api/actions";
        //implemented
        public readonly string Login_Url = "LoginUser";
        public readonly string RegisterClient_Url = "RegisterC";
        public readonly string RegisterUser_Url = "RegisterU";
        public readonly string GetGoodByID_Url = "GetGoodByID";
        public readonly string SendOrder_Url = "SendOrder";
        public readonly string GetSupplier_Url = "GetSupplierByID";
        //not implemented
        public readonly string SendGood_Url = "SendGood";
        public readonly string GetOrders_Url = "GetAllOrders";
        public readonly string UpdateOrder_Url = "UpdateOrder";

        internal static string QRCodesfilePath = Environment.GetFolderPath(Environment.SpecialFolder.UserProfile) + "\\ExpressMarket\\QR_Codes\\";

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
