package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BilgisayarPage;
import test.kategorilerTest.BaseTest;

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
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.BILGISAYAR);
        bilgisayarPage.gezAndValidateCategories(elektronikKategorilerPage, bilgisayarPage, ElektronikKategorilerPage.Kategori.BILGISAYAR);
    }
}
