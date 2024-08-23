package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.YurutecYurumeYardimcilariPage;
import test.kategorilerTest.BaseTest;

public class YurutecYurumeYardimcilariPageTest extends BaseTest {
    private YurutecYurumeYardimcilariPage yuruteçYurumeYardimcilariPage;
    @Override
    public void intializePages() {
        super.intializePages();
        yuruteçYurumeYardimcilariPage = new YurutecYurumeYardimcilariPage(driver);
    }
    @Test
    public void yuruteçYurumeYardimcilariKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.YURUTEC_YURUME_YARDIMCILARI);
        yuruteçYurumeYardimcilariPage.gezAndValidateCategories( anneBebekKategorilerPage,yuruteçYurumeYardimcilariPage, AnneBebekKategorilerPage.Kategori.YURUTEC_YURUME_YARDIMCILARI );
    }
}
