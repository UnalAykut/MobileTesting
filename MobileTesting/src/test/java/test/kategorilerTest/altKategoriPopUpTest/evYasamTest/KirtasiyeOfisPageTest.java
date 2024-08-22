package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.KirtasiyeOfisPage;
import test.kategorilerTest.BaseTest;
import java.util.List;

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
        for (int i = 0; i < kirtasiyeOfisPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = kirtasiyeOfisPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(evVeYasamKategorilerPage.categoryList().get(0));
            evVeYasamKategorilerPage.loadCategories();
            evVeYasamKategorilerPage.clickOnCategory(EvVeYasamKategorilerPage.Kategori.KIRTASIYE_OFIS);
        }
    }
}

