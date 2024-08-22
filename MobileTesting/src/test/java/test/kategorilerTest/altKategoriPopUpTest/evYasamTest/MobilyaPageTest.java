package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.MobilyaPage;
import test.kategorilerTest.BaseTest;
import java.util.List;

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
        for (int i = 0; i < mobilyaPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = mobilyaPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(evVeYasamKategorilerPage.categoryList().get(0));
            evVeYasamKategorilerPage.loadCategories();
            evVeYasamKategorilerPage.clickOnCategory(EvVeYasamKategorilerPage.Kategori.MOBILYA);
        }
    }
}
