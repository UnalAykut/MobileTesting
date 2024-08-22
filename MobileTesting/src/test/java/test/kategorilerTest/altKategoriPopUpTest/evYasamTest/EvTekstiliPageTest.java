package test.kategorilerTest.altKategoriPopUpTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.EvTekstiliPage;
import test.kategorilerTest.BaseTest;
import java.util.List;

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
        for (int i = 0; i < evTekstiliPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = evTekstiliPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(evVeYasamKategorilerPage.categoryList().get(0));
            evVeYasamKategorilerPage.loadCategories();
            evVeYasamKategorilerPage.clickOnCategory(EvVeYasamKategorilerPage.Kategori.EV_TEKSTILI);
        }
    }
}
