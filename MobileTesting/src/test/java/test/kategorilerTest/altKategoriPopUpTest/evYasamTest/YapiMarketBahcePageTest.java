package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;



import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.YapiMarketBahcePage;
import test.baseTest.BaseTest;


public class YapiMarketBahcePageTest extends BaseTest {
    private YapiMarketBahcePage yapiMarketBahcePage;

    @Override
    public void intializePages() {
        super.intializePages();
        yapiMarketBahcePage = new YapiMarketBahcePage(driver);
    }

    @Test
    public void yapiMarketBahceKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.YAPI_MARKET_BAHCE);

        yapiMarketBahcePage.gezAndValidateCategories(evVeYasamKategorilerPage, yapiMarketBahcePage, EvVeYasamKategorilerPage.Kategori.YAPI_MARKET_BAHCE);
    }
}
