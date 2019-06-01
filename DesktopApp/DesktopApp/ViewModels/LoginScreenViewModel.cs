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
using System.Runtime.InteropServices;
using System.Security;
using DesktopApp.Helpers;

namespace DesktopApp.ViewModels
{
    class LoginScreenViewModel : BaseViewModel
    {
        #region Declarations

        private string username;

        private string password;

        private bool isloading;

        private PostHelperLogin credentials;

        private ICommand _loginCommand;

        private static readonly HttpClient client = new HttpClient();

        public BaseViewModel ViewModel { get; set; }

        private IDialogCoordinator dialogCoordinator;

        #endregion

        #region Constructor

        public LoginScreenViewModel(MahApps.Metro.Controls.Dialogs.IDialogCoordinator instance)
        {
            credentials = new PostHelperLogin();

            dialogCoordinator = instance;
        }
        #endregion

        #region Properties
        /// <summary>
        /// Пропърти за полето за парола на потребителя
        /// </summary>
        //public string PasswordTextBox
        //{
        //    get
        //    {
        //        return password;
        //    }
        //    set
        //    {
        //        password = value;
        //        base.OnPropertyChanged();
        //    }
        //}

        /// <summary>
        /// Пропърти за полето за име на потребителя
        /// </summary>
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
        /// <summary>
        /// пропърти за анимацията за зареждане
        /// </summary>
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
        #endregion

        #region Methods
        /// <summary>
        /// Метод за трансформиране на SecureString в обикновен,при влизане на потребителя в системата
        /// </summary>
        /// <param name="securePassword">паролата във вид securestring </param>
        /// <returns></returns>
        private string ConvertToUnsecureString(SecureString securePassword)
        {
            if (securePassword == null)
            {
                return string.Empty;
            }

            IntPtr unmanagedString = IntPtr.Zero;
            try
            {
                unmanagedString = Marshal.SecureStringToGlobalAllocUnicode(securePassword);
                return Marshal.PtrToStringUni(unmanagedString);
            }
            finally
            {
                Marshal.ZeroFreeGlobalAllocUnicode(unmanagedString);
            }
        }

        /// <summary>
        /// Метод за отваряне на главния екран
        /// </summary>
        private void ShowMainScreen()
        {
            var a = new MainScreenView();
            a.Show();
            Application.Current.MainWindow.Hide();
        }

        /// <summary>
        /// Метод за създаване на помощен обект,който бива изпратен при опит за вход
        /// </summary>
        /// <param name="username_">име на потребителя</param>
        /// <param name="password_">парола на потребителя</param>
        /// <returns>връща PostHelperLogin обект</returns>
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
        /// <summary>
        /// HTTP заявка за вход в системата
        /// </summary>
        /// <param name="parameter"></param>
        public async void POST_LoginAsync(object parameter)
        {
            IsLoadingActive = true;

            if (UsernameTextBox != null)
            {
                var passwordContainer = parameter as IHavePassword;

                if (passwordContainer != null)
                {
                    var secureString = passwordContainer.Password;
                    password = ConvertToUnsecureString(secureString); //моментно конвертиране на паролата за работа със заявката (secure way)

                    using (var client = new HttpClient())
                    {
                        client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                        var info = CreateLoginHelperObject(username, password);
                        var content = JsonConvert.SerializeObject(info);
                        var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                        var byteContent = new ByteArrayContent(buffer);
                        byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                        try
                        {
                            using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.Login_Url, byteContent))
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
                        catch (Exception e)
                        {
                            await dialogCoordinator.ShowMessageAsync(this, "Connection Error!", "Please check internet connection or contact support.");
                        }
                    }

                }
                else
                {
                    await dialogCoordinator.ShowMessageAsync(this, "Empty credentials!", "Please enter your credentials!");
                }

                IsLoadingActive = false;
            }
            else
            {
                await dialogCoordinator.ShowMessageAsync(this, "Empty credentials!", "Please enter your credentials!");
            }

            IsLoadingActive = false;
        }
        #endregion

        #region Commands

        public ICommand LoginCommand
        {

            get
            {

                if (_loginCommand == null)
                {
                    _loginCommand = new RelayCommand(POST_LoginAsync);
                }
                return _loginCommand;
            }
        }

        #endregion

    }
}
