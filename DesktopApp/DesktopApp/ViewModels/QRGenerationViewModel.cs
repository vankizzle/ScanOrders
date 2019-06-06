using DesktopApp.Commands;
using DesktopApp.Models;
using MahApps.Metro.Controls.Dialogs;
using Newtonsoft.Json;
using System;
using System.Drawing.Imaging;
using System.IO;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading;
using System.Threading.Tasks;
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

        private ICommand clearcode;

        private ImageSource qrcode;

        private IDialogCoordinator dialogCoordinator;
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
                if (newgood != value)
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
                if (qrcode != value)
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
                    generatecode = new DelegateCommand(GenerateQRCodeAsync);
                    //generatecode = new DelegateCommand(GenerateQRCode,CanGenerate);
                }
                return generatecode;
            }
        }

        //public ICommand SaveCodeCommand
        //{
        //    get
        //    {
        //        if (savecode == null)
        //        {
        //            savecode = new DelegateCommand(Save);
        //        }
        //        return savecode;
        //    }
        //}

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

        #region Constructor
        public QRGenerationViewModel(MahApps.Metro.Controls.Dialogs.IDialogCoordinator instance)
        {
            newgood = new Good();
            supplier = new Supplier();
            dialogCoordinator = instance;
        }
        #endregion

        #region Methods

        /// <summary>
        /// Изчиства данните за въведения продукт,което води и до визуалното изчистване на полетата
        /// </summary>
        private void ClearCode()
        {
            NewGood = new Good();
            GoodSupplier = new Supplier();
            QRCode = null;
        }

        /// <summary>
        /// Валидация за това,дали можем да изпълним командата Generate
        /// </summary>
        /// <param name="obj"></param>
        /// <returns></returns>
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

        /// <summary>
        /// Извикване на последователни HTTP заявки за успешен запис на продукт
        /// </summary>
        /// <returns></returns>
        private async Task AddGoodToDB()
        {
                       
            await GetSupplier(GoodSupplier);
            //XXX Check if Supplier exists and assing his ID to the new good
            // if not add him to db and assing his ID to the new good

            await InsertGoodToDB();
            //inserts the new good to the db


        }

        /// <summary>
        /// Добавяне на продукт в базата,при успех се връща статус 200
        /// </summary>
        /// <returns></returns>
        public async Task InsertGoodToDB()
        {
            using (var client = new HttpClient())
            {
             // client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                client.BaseAddress = new Uri("http://" + base.Address);
                NewGood.SupplierID = GoodSupplier.ID;
                var info = NewGood;
                var content = JsonConvert.SerializeObject(info);
                var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                var byteContent = new ByteArrayContent(buffer);
                byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.SendGood_Url, byteContent))
                {
                    using (HttpContent httpcontent = response.Content)
                    {
                        string mycontent = await httpcontent.ReadAsStringAsync();

                        if (mycontent != "200")
                        {
                            await dialogCoordinator.ShowMessageAsync(this, "Error saving good", "Couldn't add good to database!");
                        }

                    }
                }

            }
        }

        /// <summary>
        /// HTTP заявка,която проверява за наличието на въведеният доставчик в базата
        /// </summary>
        /// <param name="s"></param>
        /// <returns></returns>
        public async Task GetSupplier(Supplier s)
        {
            using (var client = new HttpClient())
            {
            //    client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                client.BaseAddress = new Uri("http://" + base.Address);
                var info = GoodSupplier;
                var content = JsonConvert.SerializeObject(info);
                var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                var byteContent = new ByteArrayContent(buffer);
                byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.GetSupplier_Url, byteContent))
                {
                    using (HttpContent httpcontent = response.Content)
                    {
                        string mycontent = await httpcontent.ReadAsStringAsync();

                        if (mycontent != "") //при съществуващ такъв доставчик, взимаме отговора и го десериализираме
                        {
                            GoodSupplier = JsonConvert.DeserializeObject<Supplier>(mycontent);
                        }
                        else    //ако ли не , добавяме го в базата
                        {
                            await InsertSupplier(GoodSupplier);
                        }

                    }
                }
            }
        }

        /// <summary>
        /// HTTP заявка с която добавяме доставчик в базата
        /// </summary>
        /// <param name="s"> Обект доставчик</param>
        /// <returns></returns>
        public async Task InsertSupplier(Supplier s)
        {
            using (var client = new HttpClient())
            {
               // client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                client.BaseAddress = new Uri("http://" + base.Address);
                var info = s;
                var content = JsonConvert.SerializeObject(info);
                var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                var byteContent = new ByteArrayContent(buffer);
                byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.SendSupplier_Url, byteContent))
                {
                    using (HttpContent httpcontent = response.Content)
                    {
                        string mycontent = await httpcontent.ReadAsStringAsync();

                        if (mycontent != "200")
                        {
                            await dialogCoordinator.ShowMessageAsync(this, "Error saving good", "Couldn't add supplier to database!");
                        }
                        else
                        {
                            await GetSupplier(GoodSupplier);    //При успешен запис извикаваме заявката с която да го вземем от базата с цел получаване на неговото ID
                        }                  

                    }
                }
            }
        }
        /// <summary>
        /// HTTP заявка с която взимаме продукт по неговото PLU
        /// </summary>
        /// <returns></returns>
        public async Task GetGoogByPLU()
        {
            using (var client = new HttpClient())
            {
            //    client.BaseAddress = new Uri("http://" + base.IP + ":" + base.Port);
                client.BaseAddress = new Uri("http://" + base.Address);
                var info = NewGood;
                var content = JsonConvert.SerializeObject(info);
                var buffer = System.Text.Encoding.UTF8.GetBytes(content);

                var byteContent = new ByteArrayContent(buffer);
                byteContent.Headers.ContentType = new MediaTypeHeaderValue("application/json");

                using (HttpResponseMessage response = await client.PostAsync(base.ApiController + "/" + base.GetGoodByPLU_Url, byteContent))
                {
                    using (HttpContent httpcontent = response.Content)
                    {
                        string mycontent = await httpcontent.ReadAsStringAsync();

                        if (mycontent != "")
                        {
                            NewGood = JsonConvert.DeserializeObject<Good>(mycontent);
                        }
                        else
                        {
                            await dialogCoordinator.ShowMessageAsync(this, "Error loading good", "Couldn't load good ID!");
                        }

                    }
                }

            }
        }

        /// <summary>
        /// Метод за генерирането на QR код на продукта
        /// </summary>
        private async void GenerateQRCodeAsync()
        {

            //Добавяне на продукта към базата
            await AddGoodToDB();

            //Взимане на продукта и неговото ID
            await GetGoogByPLU();

            //Генериране на QR код
            Zen.Barcode.CodeQrBarcodeDraw newbarcode = Zen.Barcode.BarcodeDrawFactory.CodeQr;
            var code = newbarcode.Draw(GetInfo(), 50);

            BitmapImage tmpbitmap = new BitmapImage();

            tmpbitmap.BeginInit();
            MemoryStream ms = new MemoryStream();
            code.Save(ms, ImageFormat.Png);
            ms.Seek(0, SeekOrigin.Begin);
            tmpbitmap.StreamSource = ms;
            tmpbitmap.EndInit();
            QRCode = tmpbitmap;


            //При успешно генериран QR код , го запазваме под формата на .PNG  в user/%appdata%/roaming/marketname/filename.png

            if (QRCode == null)
            {
                await dialogCoordinator.ShowMessageAsync(this, "Error saving good", "First generate the QR Code!!!");
            }
            else
            {
                var encoder = new PngBitmapEncoder();
                encoder.Frames.Add(BitmapFrame.Create((BitmapSource)QRCode));
                Directory.CreateDirectory(QRCodesfilePath);
                using (FileStream stream = new FileStream(QRCodesfilePath + NewGood.Name + ".png", FileMode.Create))
                    encoder.Save(stream);

            }
        }

        /// <summary>
        /// Взимаме информацията,която ще запишем в QR код
        /// </summary>
        /// <returns></returns>
        private string GetInfo()
        {
            return NewGood.ID.ToString() + "*" + NewGood.PLU.ToString();
        }
        #endregion
    }
}
