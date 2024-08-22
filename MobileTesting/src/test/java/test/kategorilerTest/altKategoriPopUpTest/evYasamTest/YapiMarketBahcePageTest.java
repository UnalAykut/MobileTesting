package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.YapiMarketBahcePage;
import test.kategorilerTest.BaseTest;
import java.util.List;

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

        for (int i = 0; i < yapiMarketBahcePage.categoryList().size(); i++) {
            List<WebElement> kategoriler = yapiMarketBahcePage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(evVeYasamKategorilerPage.categoryList().get(0));
            evVeYasamKategorilerPage.loadCategories();
            evVeYasamKategorilerPage.clickOnCategory(EvVeYasamKategorilerPage.Kategori.YAPI_MARKET_BAHCE);
        }
    }
}
