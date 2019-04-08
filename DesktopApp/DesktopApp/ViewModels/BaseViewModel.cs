using System;
using System.ComponentModel;
using System.Runtime.CompilerServices;

namespace DesktopApp.ViewModels
{
    class BaseViewModel : INotifyPropertyChanged
    {
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
