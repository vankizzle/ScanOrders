using System.Windows.Input;
using DesktopApp.Models;
using DesktopApp.Commands;
using System.Net.Http;
using System;
using Newtonsoft.Json;
using System.Net.Http.Headers;
using DesktopApp.Views;
using System.Windows;
using System.Threading;
using System.Net;
using MahApps.Metro.Controls.Dialogs;

namespace DesktopApp.ViewModels
{
    class LoginScreenViewModel : BaseViewModel
    {
        private string username;

        private string password;

        private bool isloading;

        private PostHelperLogin credentials;

        private ICommand _loginCommand;

        private static readonly HttpClient client = new HttpClient();

        public BaseViewModel ViewModel { get; set; }

        // Variable
        private IDialogCoordinator dialogCoordinator;

        public LoginScreenViewModel(MahApps.Metro.Controls.Dialogs.IDialogCoordinator instance)
        {
            credentials = new PostHelperLogin();

            dialogCoordinator = instance;
        }

        private void ShowMainScreen()
        {
            var a = new MainScreenView();
            a.Show();
            Application.Current.MainWindow.Hide();
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

        public bool IsLoadingActive
        {
            get
            {
                return isloading;
            }
            set
            {
                isloading = value;
                base.OnPropertyChanged();
            }
        }

        public PostHelperLogin CreateLoginHelperObject(string username_, string password_)
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

        public async void POST_LoginAsync()
        {
            IsLoadingActive = true;

            if ( username != null && password != null)
            {
                using (var client = new HttpClient())
                {
                    client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                    var info = CreateLoginHelperObject(username, password);
                    var content = JsonConvert.SerializeObject(info);
                    var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                    var byteContent = new ByteArrayContent(buffer);
                    byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                    using(HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.Login_Url, byteContent))
                    {
                        using (HttpContent httpcontent = response.Content)
                        {
                            string mycontent = await httpcontent.ReadAsStringAsync();

                            if (mycontent == "200")
                            {
                                ShowMainScreen();
                            }
                            else
                            {
                                await dialogCoordinator.ShowMessageAsync(this, "Wrong credentials!", "Wrong username or password");
                            }
                        }
                    }
                              
                }

                IsLoadingActive = false;
            }

            IsLoadingActive = false;
        }
     
        public ICommand LoginCommand
        {
           
            get
            {

                if (_loginCommand == null)
                {
                    _loginCommand = new DelegateCommand(POST_LoginAsync);
                }
                return _loginCommand;
            }
        }

    }
}
