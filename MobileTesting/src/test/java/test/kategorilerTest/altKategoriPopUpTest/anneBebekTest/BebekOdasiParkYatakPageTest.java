package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekOdasiParkYatakPage;
import test.kategorilerTest.BaseTest;

public class BebekOdasiParkYatakPageTest extends BaseTest {
    private BebekOdasiParkYatakPage bebekOdasiParkYatakPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekOdasiParkYatakPage = new BebekOdasiParkYatakPage(driver);
    }
    @Test
    public void bebekOdasiParkYatakKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_ODASI_PARK_YATAK);
        bebekOdasiParkYatakPage.gezAndValidateCategories( anneBebekKategorilerPage,bebekOdasiParkYatakPage, AnneBebekKategorilerPage.Kategori.BEBEK_ODASI_PARK_YATAK );
    }
}
