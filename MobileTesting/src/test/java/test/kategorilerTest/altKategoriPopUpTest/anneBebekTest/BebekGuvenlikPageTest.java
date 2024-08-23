package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekGuvenlikPage;
import test.baseTest.BaseTest;

public class BebekGuvenlikPageTest extends BaseTest {
    private BebekGuvenlikPage bebekGuvenlikPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekGuvenlikPage = new BebekGuvenlikPage(driver);
    }
    @Test
    public void bebekGuvenlikKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_GUVENLIK);
        bebekGuvenlikPage.gezAndValidateCategories( anneBebekKategorilerPage,bebekGuvenlikPage, AnneBebekKategorilerPage.Kategori.BEBEK_GUVENLIK );
    }
}
