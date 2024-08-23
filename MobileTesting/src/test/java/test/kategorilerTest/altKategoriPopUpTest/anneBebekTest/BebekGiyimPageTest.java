package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekGiyimPage;
import test.baseTest.BaseTest;

public class BebekGiyimPageTest extends BaseTest {
    private BebekGiyimPage bebekGiyimPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekGiyimPage = new BebekGiyimPage(driver);
    }
    @Test
    public void bebekGiyimKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_GIYIM);
        bebekGiyimPage.gezAndValidateCategories( anneBebekKategorilerPage,bebekGiyimPage, AnneBebekKategorilerPage.Kategori.BEBEK_GIYIM );
    }
}
