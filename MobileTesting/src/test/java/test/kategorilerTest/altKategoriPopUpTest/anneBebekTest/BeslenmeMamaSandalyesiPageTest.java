package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BeslenmeMamaSandalyesiPage;
import test.kategorilerTest.BaseTest;

public class BeslenmeMamaSandalyesiPageTest extends BaseTest {
    private BeslenmeMamaSandalyesiPage beslenmeMamaSandalyesiPage;
    @Override
    public void intializePages() {
        super.intializePages();
        beslenmeMamaSandalyesiPage = new BeslenmeMamaSandalyesiPage(driver);
    }
    @Test
    public void beslenmeMamaSandalyesiKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BESLENME_MAMA_SANDALYESI);
        beslenmeMamaSandalyesiPage.gezAndValidateCategories( anneBebekKategorilerPage,beslenmeMamaSandalyesiPage, AnneBebekKategorilerPage.Kategori.BESLENME_MAMA_SANDALYESI );
    }
}
