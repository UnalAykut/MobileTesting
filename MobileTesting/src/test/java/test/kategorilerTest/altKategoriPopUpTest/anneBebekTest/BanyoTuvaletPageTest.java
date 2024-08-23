package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import test.kategorilerTest.BaseTest;

public class BanyoTuvaletPageTest extends BaseTest {
    private BanyoTuvaletPage banyoTuvaletPage;

    @Override
    public void intializePages() {
        super.intializePages();
        banyoTuvaletPage = new BanyoTuvaletPage(driver);
    }

    @Test
    public void banyoTuvaletKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BANYO_TUVALET);
        banyoTuvaletPage.gezAndValidateCategories(anneBebekKategorilerPage, banyoTuvaletPage, AnneBebekKategorilerPage.Kategori.BANYO_TUVALET);
    }

}
