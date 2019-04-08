using MahApps.Metro.Controls;
using System;
using System.Windows;

namespace DesktopApp.Views
{
    /// <summary>
    /// Interaction logic for BaseScreen.xaml
    /// </summary>
    public partial class MainScreenView : MetroWindow
    {
        public MainScreenView()
        {
            InitializeComponent();
        }

        private void Window_Closed(object sender, EventArgs e)
        {
          Application.Current.Shutdown();
        }
    }
}
