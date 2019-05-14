using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesktopApp.Helpers
{
    class PageNavigation
    {
        #region Declarations
        private int recordsPerPage;

        private int collectionLength;

        private int currentPage;

        private int numberOfPage;
        #endregion

        #region Properties

        public int RecordsPerPage
        {
            get
            {
                return recordsPerPage;
            }
        }

        public int CollectionLength
        {
            get
            {
                return collectionLength;
            }
        }

        public int CurrentPage
        {
            get
            {
                return currentPage;
            }
        }

        public int NumberOfPage
        {
            get
            {
                return numberOfPage;
            }
        }

        #endregion

        #region Constructor

        public PageNavigation(int recordsPerPage, int collectionLegth)
        {
            currentPage = 1;

            this.recordsPerPage = recordsPerPage;

            this.collectionLength = collectionLegth;

            if (collectionLegth % recordsPerPage == 0)
            {
                if (collectionLegth == 0)
                    numberOfPage = 1;
                else
                    numberOfPage = (collectionLegth / recordsPerPage);
            }
            else
            {
                numberOfPage = (collectionLegth / recordsPerPage) + 1;
            }
        }

        #endregion

        #region Methods
        /// <summary>
        /// Навигиране до първата станица
        /// </summary>
        /// <returns></returns>
        public int First()
        {
            currentPage = 1;
            return currentPage;
        }
        /// <summary>
        /// Навигиране към следваща страница
        /// </summary>
        /// <param name="pageToSkip">Незадължителен параметър, който определя с колко страници се навигираме на ляво.PageToSkip е в интервала [1,numberOfPage]</param>
        public int Next(int pageToSkip = 1)
        {
            if (pageToSkip < 1)
                throw new ArgumentException();

            if ((currentPage + pageToSkip) * recordsPerPage < collectionLength)
                currentPage = currentPage + pageToSkip;
            else
                currentPage = numberOfPage;

            return currentPage;
        }

        /// <summary>
        /// Навигиране към предишна страница
        /// </summary>
        /// <param name="pageToSkip">Незадължителен параметър, който определя с колко страници се навигираме на дясно.PageToSkip е в интервала [1,numberOfPage]</param>
        public int Previous(int pageToSkip = 1)
        {
            if (pageToSkip < 1)
                throw new ArgumentException();

            if ((currentPage - pageToSkip) >= 1)
                currentPage = currentPage - pageToSkip;
            else
                currentPage = 1;

            return currentPage;
        }
        /// <summary>
        /// Навигиране към последна страница
        /// </summary>
        public int Last()
        {
            currentPage = numberOfPage;
            return currentPage;
        }
        /// <summary>
        /// Навигиране към желаната старница
        /// </summary>
        /// <param name="numberOfSelectedPage">номер на желаната страницата</param>
        /// <returns></returns>
        public int NavigateTo(int numberOfSelectedPage)
        {
            if (numberOfSelectedPage < 1)
                throw new ArgumentException();
            else if (numberOfSelectedPage > numberOfPage)
                currentPage = numberOfPage;
            else
                currentPage = numberOfSelectedPage;

            return currentPage;
        }

        /// <summary>
        /// Обновява страницирането при промяна на навигирания списък
        /// </summary>
        /// <param name="newCollectionLength">Дължината на навигирания списък</param>
        public void RefreshPageNavigation(int newCollectionLength)
        {
            collectionLength = newCollectionLength;

            if (collectionLength % recordsPerPage == 0)
            {
                if (collectionLength == 0)
                    numberOfPage = 1;
                else
                    numberOfPage = (collectionLength / recordsPerPage);
            }
            else
            {
                numberOfPage = (collectionLength / recordsPerPage) + 1;
            }
        }
        #endregion

    }
}
