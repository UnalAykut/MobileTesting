package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.BanyoEvGerecleriPage;
import test.kategorilerTest.BaseTest;
import java.util.List;

public class BanyoEvGerecleriPageTest extends BaseTest {
    private BanyoEvGerecleriPage banyoEvGerecleriPage;

    @Override
    public void intializePages() {
        super.intializePages();
        banyoEvGerecleriPage = new BanyoEvGerecleriPage(driver);
    }

    @Test
    public void banyoEvGerecleriKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.BANYO_EV_GERECLERI);

        for (int i = 0; i < banyoEvGerecleriPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = banyoEvGerecleriPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(evVeYasamKategorilerPage.categoryList().get(0));
            evVeYasamKategorilerPage.loadCategories();
            evVeYasamKategorilerPage.clickOnCategory(EvVeYasamKategorilerPage.Kategori.BANYO_EV_GERECLERI);
        }
    }
}
