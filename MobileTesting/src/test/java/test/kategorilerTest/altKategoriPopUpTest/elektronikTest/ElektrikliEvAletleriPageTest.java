package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.ElektrikliEvAletleriPage;
import test.baseTest.BaseTest;

public class ElektrikliEvAletleriPageTest extends BaseTest {
    private ElektrikliEvAletleriPage elektrikliEvAletleriPage;
    @Override
    public void intializePages() {
        super.intializePages();
        elektrikliEvAletleriPage=new ElektrikliEvAletleriPage( driver );
    }
    @Test
    public void bilgisayarKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.ELEKRIKLI_EV_ALETLERI);
        elektrikliEvAletleriPage.gezAndValidateCategories(elektronikKategorilerPage, elektrikliEvAletleriPage, ElektronikKategorilerPage.Kategori.ELEKRIKLI_EV_ALETLERI);
    }

}
