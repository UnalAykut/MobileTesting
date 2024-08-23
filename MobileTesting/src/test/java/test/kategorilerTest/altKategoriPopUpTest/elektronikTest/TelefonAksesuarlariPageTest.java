package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.TelefonAksesuarlariPage;
import test.kategorilerTest.BaseTest;

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
        telefonAksesuarlariPage.gezAndValidateCategories(elektronikKategorilerPage, telefonAksesuarlariPage, ElektronikKategorilerPage.Kategori.TELEFON_AKSESUARLARI);
    }
}
