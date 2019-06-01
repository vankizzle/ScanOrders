using System.Security;
using DesktopApp.Helpers;
using DesktopApp.ViewModels;
using MahApps.Metro.Controls;
using MahApps.Metro.Controls.Dialogs;

namespace DesktopApp.Views

{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class LoginScreenView : MetroWindow, IHavePassword

    {

        LoginScreenViewModel vm = new LoginScreenViewModel(DialogCoordinator.Instance);
        public LoginScreenView()
        {
            InitializeComponent();
            DataContext = vm;
        }

        public SecureString Password => UserPassword.SecurePassword;
    }
}
