package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.KategorilerElektronikPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BilgisayarPage;
import pages.kategoriler.altKategoriPopUp.elektronik.FotografKameraPage;
import test.BaseTest;
import util.DriverFactory;

import java.util.List;

public class FotografKameraPageTest extends BaseTest {
    private FotografKameraPage fotografKameraPage;

    @Override
    public void intializePages() {
        super.intializePages();
        fotografKameraPage=new FotografKameraPage( driver );
    }
    @Test
    public void fotografKameraKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
        kategorilerElektronikPage.loadCategories();
        kategorilerElektronikPage.clickOnCategory( KategorilerElektronikPage.Kategori.FOTOGRAF_KAMERA);
        for (int i = 0; i < fotografKameraPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = fotografKameraPage.categoryList(); // Her seferinde elementleri yeniden al
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep( 2000 );
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(kategorilerElektronikPage.categoryList().get(0));
            kategorilerElektronikPage.loadCategories();
            kategorilerElektronikPage.clickOnCategory(KategorilerElektronikPage.Kategori.FOTOGRAF_KAMERA);
        }
    }
}
