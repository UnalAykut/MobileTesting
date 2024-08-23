package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;


import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.EvcilHayvanUrunleriPage;
import test.kategorilerTest.BaseTest;

public class EvcilHayvanUrunleriPageTest extends BaseTest {
    private EvcilHayvanUrunleriPage evcilHayvanUrunleriPage;

    @Override
    public void intializePages() {
        super.intializePages();
        evcilHayvanUrunleriPage = new EvcilHayvanUrunleriPage(driver);
    }

    @Test
    public void evcilHayvanUrunleriKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.EVCIL_HAYVAN_URUNLERI);
        evcilHayvanUrunleriPage.gezAndValidateCategories(evVeYasamKategorilerPage, evcilHayvanUrunleriPage, EvVeYasamKategorilerPage.Kategori.EVCIL_HAYVAN_URUNLERI);
    }
}

