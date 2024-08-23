package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BeyazEsyaPage;
import test.baseTest.BaseTest;

public class BeyazEsyaPageTest extends BaseTest {
    private BeyazEsyaPage beyazEsyaPage;
    @Override
    public void intializePages() {
        super.intializePages();
        beyazEsyaPage=new BeyazEsyaPage( driver );
    }
    @Test
    public void beyazEsyaKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ELEKTRONIK);
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.BEYAZ_ESYA);
        beyazEsyaPage.gezAndValidateCategories(elektronikKategorilerPage, beyazEsyaPage, ElektronikKategorilerPage.Kategori.BEYAZ_ESYA);
    }


}
