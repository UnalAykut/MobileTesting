package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.MutfakGerecleriPage;
import test.baseTest.BaseTest;

public class MutfakGerecleriPageTest extends BaseTest {
    private MutfakGerecleriPage mutfakGerecleriPage;

    @Override
    public void intializePages() {
        super.intializePages();
        mutfakGerecleriPage = new MutfakGerecleriPage(driver);
    }

    @Test
    public void mutfakGerecleriKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.MUTFAK_GERECLERI);
        mutfakGerecleriPage.gezAndValidateCategories(evVeYasamKategorilerPage, mutfakGerecleriPage, EvVeYasamKategorilerPage.Kategori.MUTFAK_GERECLERI);
    }
}
