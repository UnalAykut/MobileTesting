package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.OtoKoltuguAnaKucagiPage;
import test.kategorilerTest.BaseTest;

public class OtoKoltuguAnaKucagiPageTest extends BaseTest {
    private OtoKoltuguAnaKucagiPage otoKoltuguAnaKucagiPage;
    @Override
    public void intializePages() {
        super.intializePages();
        otoKoltuguAnaKucagiPage = new OtoKoltuguAnaKucagiPage(driver);
    }
    @Test
    public void otoKoltuguAnaKucagiKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.OTO_KOLTUGU_ANA_KUCAGI);
        otoKoltuguAnaKucagiPage.gezAndValidateCategories( anneBebekKategorilerPage,otoKoltuguAnaKucagiPage, AnneBebekKategorilerPage.Kategori.OTO_KOLTUGU_ANA_KUCAGI );
    }
}
