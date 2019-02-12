using System.Windows.Input;
using System.Net;
using DesktopApp.Helpers;
using System.IO;
using DesktopApp.Models;
using DesktopApp;
using DesktopApp.Commands;
using System.Net.Http;
using System.Collections.Generic;
using System.Text;
using System;
using Newtonsoft.Json;
using System.Net.Http.Headers;
using MahApps.Metro.Controls;
using DesktopApp.Views;
using System.Windows;
using System.Threading;

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

        public LoginScreenViewModel()
        {
            credentials = new PostHelperLogin();
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

        public async void POST_LoginAsync()
        {
            IsLoadingActive = true;

            if ( username != null && password != null)
            {
                //using (var client = new HttpClient())
                //{
                //    client.BaseAddress = new Uri("http://" + Support.IP + ":" + Support.Port );
                //    var info = CreateHelperObject(username, password);
                //    var content = JsonConvert.SerializeObject(info);
                //    var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                //    var byteContent = new ByteArrayContent(buffer);
                //    byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                //    var result = await client.PostAsync(Support.ApiController + "/" + Support.Login_Url, byteContent);
                //    string resultContent = await result.Content.ReadAsStringAsync();

                //}
               // Thread.Sleep(4000);
               ShowMainScreen();
                //IsLoadingActive = false;
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
