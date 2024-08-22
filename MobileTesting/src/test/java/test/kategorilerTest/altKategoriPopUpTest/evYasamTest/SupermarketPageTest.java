package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.SupermarketPage;
import test.kategorilerTest.BaseTest;
import java.util.List;

public class SupermarketPageTest extends BaseTest {
    private SupermarketPage supermarketPage;

    @Override
    public void intializePages() {
        super.intializePages();
        supermarketPage = new SupermarketPage(driver);
    }

    @Test
    public void supermarketKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.EV_YASAM);
        evVeYasamKategorilerPage.loadCategories();
        evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.SUPERMARKET);

        for (int i = 0; i < supermarketPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = supermarketPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(evVeYasamKategorilerPage.categoryList().get(0));
            evVeYasamKategorilerPage.loadCategories();
            evVeYasamKategorilerPage.clickOnCategory( EvVeYasamKategorilerPage.Kategori.SUPERMARKET);
        }
    }
}

