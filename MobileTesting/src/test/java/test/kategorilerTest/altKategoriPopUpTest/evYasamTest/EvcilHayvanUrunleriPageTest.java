package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.EvcilHayvanUrunleriPage;
import test.kategorilerTest.BaseTest;
import java.util.List;

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
        for (int i = 0; i < evcilHayvanUrunleriPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = evcilHayvanUrunleriPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(evVeYasamKategorilerPage.categoryList().get(0));
            evVeYasamKategorilerPage.loadCategories();
            evVeYasamKategorilerPage.clickOnCategory(EvVeYasamKategorilerPage.Kategori.EVCIL_HAYVAN_URUNLERI);
        }
    }
}

