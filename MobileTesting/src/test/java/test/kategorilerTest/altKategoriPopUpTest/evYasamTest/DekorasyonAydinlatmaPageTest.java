package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.DekorasyonAydinlatmaPage;
import test.kategorilerTest.BaseTest;
import java.util.List;

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
        for (int i = 0; i < dekorasyonAydinlatmaPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = dekorasyonAydinlatmaPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(evVeYasamKategorilerPage.categoryList().get(0));
            evVeYasamKategorilerPage.loadCategories();
            evVeYasamKategorilerPage.clickOnCategory(EvVeYasamKategorilerPage.Kategori.DEKORASYON_AYDINLATMA);
        }
    }
}
