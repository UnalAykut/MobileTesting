package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.KategorilerElektronikPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BeyazEsyaPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BilgisayarPage;
import test.BaseTest;

import java.util.List;

public class BilgisayarPageTest extends BaseTest {
    private BilgisayarPage bilgisayarPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bilgisayarPage=new BilgisayarPage( driver );
    }
    @Test
    public void bilgisayarKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
        kategorilerElektronikPage.loadCategories();
        kategorilerElektronikPage.clickOnCategory( KategorilerElektronikPage.Kategori.BILGISAYAR);
        for (int i = 0; i < bilgisayarPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = bilgisayarPage.categoryList(); // Her seferinde elementleri yeniden al
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep( 2000 );
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(kategorilerElektronikPage.categoryList().get(0));
            kategorilerElektronikPage.loadCategories();
            kategorilerElektronikPage.clickOnCategory(KategorilerElektronikPage.Kategori.BILGISAYAR);
        }
    }
}
