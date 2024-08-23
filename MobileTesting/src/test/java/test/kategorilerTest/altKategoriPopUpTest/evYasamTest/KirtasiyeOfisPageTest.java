package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;


import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.KirtasiyeOfisPage;
import test.kategorilerTest.BaseTest;

public class KirtasiyeOfisPageTest extends BaseTest {
    private KirtasiyeOfisPage kirtasiyeOfisPage;

    @Override
    public void intializePages() {
        super.intializePages();
        kirtasiyeOfisPage = new KirtasiyeOfisPage(driver);
    }

    @Test
    public void kirtasiyeOfisKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.KIRTASIYE_OFIS);
        kirtasiyeOfisPage.gezAndValidateCategories(evVeYasamKategorilerPage, kirtasiyeOfisPage, EvVeYasamKategorilerPage.Kategori.KIRTASIYE_OFIS);
    }
}

