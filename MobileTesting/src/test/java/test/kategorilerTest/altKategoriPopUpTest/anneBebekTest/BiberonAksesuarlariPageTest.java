package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BiberonAksesuarlariPage;
import test.baseTest.BaseTest;

public class BiberonAksesuarlariPageTest extends BaseTest {
    private BiberonAksesuarlariPage biberonAksesuarlariPage;
    @Override
    public void intializePages() {
        super.intializePages();
        biberonAksesuarlariPage = new BiberonAksesuarlariPage(driver);
    }
    @Test
    public void biberonAksesuarlariKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BIBERON_AKSESUARLARI);
        biberonAksesuarlariPage.gezAndValidateCategories( anneBebekKategorilerPage,biberonAksesuarlariPage, AnneBebekKategorilerPage.Kategori.BIBERON_AKSESUARLARI );
    }
}
