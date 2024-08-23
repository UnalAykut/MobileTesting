package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.FotografKameraPage;
import test.baseTest.BaseTest;

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
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.FOTOGRAF_KAMERA);
        fotografKameraPage.gezAndValidateCategories(elektronikKategorilerPage, fotografKameraPage, ElektronikKategorilerPage.Kategori.FOTOGRAF_KAMERA);
    }
}
