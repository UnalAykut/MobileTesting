package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.DekorasyonAydinlatmaPage;
import test.kategorilerTest.BaseTest;

public class DekorasyonAydinlatmaPageTest extends BaseTest {
    private DekorasyonAydinlatmaPage dekorasyonAydinlatmaPage;

    @Override
    public void intializePages() {
        super.intializePages();
        dekorasyonAydinlatmaPage = new DekorasyonAydinlatmaPage(driver);
    }

    @Test
    public void dekorasyonAydinlatmaKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.DEKORASYON_AYDINLATMA);
        dekorasyonAydinlatmaPage.gezAndValidateCategories(evVeYasamKategorilerPage, dekorasyonAydinlatmaPage, EvVeYasamKategorilerPage.Kategori.DEKORASYON_AYDINLATMA);
    }
}
