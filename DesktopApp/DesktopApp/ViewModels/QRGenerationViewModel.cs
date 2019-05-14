﻿using DesktopApp.Commands;
using DesktopApp.Models;
using Newtonsoft.Json;
using System;
using System.Drawing.Imaging;
using System.IO;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;

namespace DesktopApp.ViewModels
{
    class QRGenerationViewModel : BaseViewModel
    {
        #region Declarations
        private Good newgood;

        private Supplier supplier;

        private ICommand generatecode;

        private ICommand savecode;

        private ICommand clearcode;

        private ImageSource qrcode;
        #endregion

        #region Properties
        public Good NewGood
        {
            get
            {
                return newgood;
            }
            set
            {
                if(newgood != value)
                {
                    newgood = value;
                    OnPropertyChanged("NewGood");
                }
            }
        }

        public Supplier GoodSupplier
        {
            get
            {
                return supplier;
            }
            set
            {
                if (supplier != value)
                {
                    supplier = value;
                    OnPropertyChanged("GoodSupplier");
                }
            }
        }

        public ImageSource QRCode
        {
            get
            {
                return qrcode;
            }
            set
            {
                if(qrcode != value)
                {
                    qrcode = value;
                    OnPropertyChanged("QRCode");
                }           
            }
        }

        public ICommand GenerateCodeCommand
        {
            get
            {
                if (generatecode == null)
                {
                    generatecode = new DelegateCommand(GenerateQRCode);
                    //generatecode = new DelegateCommand(GenerateQRCode,CanGenerate);
                }
                return generatecode;
            }
        }

        public ICommand SaveCodeCommand
        {
            get
            {
                if (savecode == null)
                {
                    savecode = new DelegateCommand(Save);
                }
                return savecode;
            }
        }

        public ICommand ClearCommand
        {
            get
            {
                if (clearcode == null)
                {
                    clearcode = new DelegateCommand(ClearCode);
                }
                return clearcode;
            }
        }
        #endregion

        #region Methods
        public QRGenerationViewModel()
        {
            newgood = new Good();
            supplier = new Supplier();
        }

        private void ClearCode()
        {
            NewGood = new Good();
            GoodSupplier = new Supplier();
            QRCode = null;
        }

        private bool CanGenerate(object obj)
        {
            if (string.IsNullOrWhiteSpace(NewGood.Name) || string.IsNullOrWhiteSpace(GoodSupplier.SupplierName) || string.IsNullOrWhiteSpace(GoodSupplier.SupplierPhone))
            {
                return false;
            }

            if (NewGood.PLU <= 0 || NewGood.Price <= 0)
            {
                return false;
            }

            return true;
        }

        private async void Save()
        {
            var encoder = new PngBitmapEncoder();
            encoder.Frames.Add(BitmapFrame.Create((BitmapSource)QRCode));         
            Directory.CreateDirectory(QRCodesfilePath);
            using (FileStream stream = new FileStream(QRCodesfilePath + NewGood.Name + ".png" , FileMode.Create))
                encoder.Save(stream);

            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                var info = NewGood;
                var content = JsonConvert.SerializeObject(info);
                var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                var byteContent = new ByteArrayContent(buffer);
                byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                var result = await client.PostAsync(base.ApiController + "/" + base.Login_Url, byteContent);
                string resultContent = await result.Content.ReadAsStringAsync();

                Thread.Sleep(4000);

                if (result.StatusCode != HttpStatusCode.OK)
                {
                    //message
                }

            }       
        }

        private void GenerateQRCode()
        {
            Zen.Barcode.CodeQrBarcodeDraw newbarcode = Zen.Barcode.BarcodeDrawFactory.CodeQr;
            var code  = newbarcode.Draw(GetInfo(), 50);

            BitmapImage tmpbitmap = new BitmapImage();

            tmpbitmap.BeginInit();
            MemoryStream ms = new MemoryStream();
            code.Save(ms, ImageFormat.Png);
            ms.Seek(0, SeekOrigin.Begin);
            tmpbitmap.StreamSource = ms;
            tmpbitmap.EndInit();
            QRCode = tmpbitmap;
        }

        private string GetInfo()
        {
            return NewGood.ID.ToString() + "," + NewGood.PLU.ToString();
        }
        #endregion
    }
}
