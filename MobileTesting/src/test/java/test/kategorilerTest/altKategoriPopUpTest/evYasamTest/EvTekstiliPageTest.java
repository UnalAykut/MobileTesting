package test.kategorilerTest.altKategoriPopUpTest;

import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.EvTekstiliPage;
import test.baseTest.BaseTest;

public class EvTekstiliPageTest extends BaseTest {
    private EvTekstiliPage evTekstiliPage;

    @Override
    public void intializePages() {
        super.intializePages();
        evTekstiliPage = new EvTekstiliPage(driver);
    }

    @Test
    public void evTekstiliKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.EV_TEKSTILI);
        evTekstiliPage.gezAndValidateCategories(evVeYasamKategorilerPage, evTekstiliPage, EvVeYasamKategorilerPage.Kategori.EV_TEKSTILI);
    }
}
