package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekBakimSaglikPage;
import test.kategorilerTest.BaseTest;

public class BebekBakimSaglikPageTest extends BaseTest {
    private BebekBakimSaglikPage bebekBakimSaglikPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekBakimSaglikPage = new BebekBakimSaglikPage(driver);
    }
    @Test
    public void bebekBakimSaglikKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_BAKIM_SAGLIK);
        bebekBakimSaglikPage.gezAndValidateCategories( anneBebekKategorilerPage,bebekBakimSaglikPage, AnneBebekKategorilerPage.Kategori.BEBEK_BAKIM_SAGLIK );
    }
}
