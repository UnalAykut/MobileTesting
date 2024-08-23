package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;


import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.MobilyaPage;
import test.kategorilerTest.BaseTest;


public class MobilyaPageTest extends BaseTest {
    private MobilyaPage mobilyaPage;

    @Override
    public void intializePages() {
        super.intializePages();
        mobilyaPage = new MobilyaPage(driver);
    }

    @Test
    public void mobilyaKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.MOBILYA);
        mobilyaPage.gezAndValidateCategories(evVeYasamKategorilerPage, mobilyaPage, EvVeYasamKategorilerPage.Kategori.MOBILYA);
    }
}
