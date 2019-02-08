using System.Windows.Input;
using System.Net;
using DesktopApp.Helpers;
using System.IO;
using DesktopApp.Models;

namespace DesktopApp.ViewModels
{
    class LoginScreenViewModel : BaseViewModel
    {
        private string username;
        private string password;

        private PostHelperLogin credentials;

        private ICommand Login;

        public LoginScreenViewModel()
        {
            credentials = new PostHelperLogin();
        }

        public string UsernameTextBox
        {
            get
            {
                return username;
            }
            set
            {
                username = value;
                base.OnPropertyChanged();
            }
        }

        public string PasswordTextBox
        {
            get
            {
                return password;
            }
            set
            {
                password = value;
                base.OnPropertyChanged();
            }
        }

        public PostHelperLogin CreateHelperObject(string username_, string password_)
        {
            PostHelperLogin x = new PostHelperLogin();
            if (username.Length > 0 && password.Length > 0)
            {
                x.username = username;
                x.password = password;
                return x;
            }
            else return null;
            
        }

        public void POST_Login()
        {
            var info = CreateHelperObject(username, password);

            if( info != null)
            {
                var httpWebRequest = (HttpWebRequest)WebRequest.Create("http://" + Support.IP + "/" + Support.Port + "/" + Support.ApiController + "/" + Support.Login_Url);

                httpWebRequest.ContentType = "application/json";
                httpWebRequest.Method = "POST";

                using (var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream()))
                {
                    streamWriter.Write(info);
                    streamWriter.Flush();
                    streamWriter.Close();
                }

                var httpResponse = (HttpWebResponse)httpWebRequest.GetResponse();
                using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
                {
                    var result = streamReader.ReadToEnd();
                }
            } 
            
        }
    }
}
