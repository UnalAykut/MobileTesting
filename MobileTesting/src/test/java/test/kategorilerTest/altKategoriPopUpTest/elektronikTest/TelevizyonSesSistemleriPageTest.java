package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.TelevizyonSesSistemleriPage;
import test.baseTest.BaseTest;

public class TelevizyonSesSistemleriPageTest extends BaseTest {
    private TelevizyonSesSistemleriPage televizyonSesSistemleriPage;
    @Override
    public void intializePages() {
        super.intializePages();
        televizyonSesSistemleriPage=new TelevizyonSesSistemleriPage( driver );
    }
    @Test
    public void bilgisayarKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.TELEVİZYON_SES_SISTEMLERI);
        televizyonSesSistemleriPage.gezAndValidateCategories(elektronikKategorilerPage, televizyonSesSistemleriPage, ElektronikKategorilerPage.Kategori.TELEVİZYON_SES_SISTEMLERI);
    }
}
