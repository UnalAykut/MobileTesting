package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;


import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.evYasam.SupermarketPage;
import test.kategorilerTest.BaseTest;

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

        supermarketPage.gezAndValidateCategories(evVeYasamKategorilerPage, supermarketPage, EvVeYasamKategorilerPage.Kategori.SUPERMARKET);
    }
}

