package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.BanyoEvGerecleriPage;
import test.baseTest.BaseTest;

public class BanyoEvGerecleriPageTest extends BaseTest {
    private BanyoEvGerecleriPage banyoEvGerecleriPage;

    @Override
    public void intializePages() {
        super.intializePages();
        banyoEvGerecleriPage = new BanyoEvGerecleriPage(driver);
    }

    @Test
    public void banyoEvGerecleriKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.BANYO_EV_GERECLERI);
        banyoEvGerecleriPage.gezAndValidateCategories(evVeYasamKategorilerPage, banyoEvGerecleriPage, EvVeYasamKategorilerPage.Kategori.BANYO_EV_GERECLERI);
    }
}
