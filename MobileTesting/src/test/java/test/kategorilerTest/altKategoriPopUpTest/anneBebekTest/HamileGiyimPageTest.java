package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.HamileGiyimPage;
import test.baseTest.BaseTest;

public class HamileGiyimPageTest extends BaseTest {
    private HamileGiyimPage hamileGiyimPage;
    @Override
    public void intializePages() {
        super.intializePages();
        hamileGiyimPage = new HamileGiyimPage(driver);
    }
    @Test
    public void hamileGiyimKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.HAMILE_GIYIM);
        hamileGiyimPage.gezAndValidateCategories( anneBebekKategorilerPage,hamileGiyimPage, AnneBebekKategorilerPage.Kategori.HAMILE_GIYIM );
    }
}
