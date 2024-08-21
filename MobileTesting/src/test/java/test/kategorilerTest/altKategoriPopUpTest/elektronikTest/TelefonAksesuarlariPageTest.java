package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.TelefonAksesuarlariPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class TelefonAksesuarlariPageTest extends BaseTest {
    private TelefonAksesuarlariPage telefonAksesuarlariPage;
    @Override
    public void intializePages() {
        super.intializePages();
        telefonAksesuarlariPage=new TelefonAksesuarlariPage( driver );
    }
    @Test
    public void telefonAksesuarlariKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.TELEFON_AKSESUARLARI);
        for (int i = 0; i < telefonAksesuarlariPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = telefonAksesuarlariPage.categoryList(); // Her seferinde elementleri yeniden al
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep( 2000 );
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility( elektronikKategorilerPage.categoryList().get(0));
            elektronikKategorilerPage.loadCategories();
            elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.TELEFON_AKSESUARLARI);
        }
    }
}
