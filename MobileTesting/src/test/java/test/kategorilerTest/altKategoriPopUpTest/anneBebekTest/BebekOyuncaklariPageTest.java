package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekOyuncaklariPage;
import test.kategorilerTest.BaseTest;

public class BebekOyuncaklariPageTest extends BaseTest {
    private BebekOyuncaklariPage bebekOyuncaklariPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekOyuncaklariPage = new BebekOyuncaklariPage(driver);
    }
    @Test
    public void bebekOyuncaklariKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_OYUNCAKLARI);
        bebekOyuncaklariPage.gezAndValidateCategories( anneBebekKategorilerPage,bebekOyuncaklariPage, AnneBebekKategorilerPage.Kategori.BEBEK_OYUNCAKLARI );
    }
}
