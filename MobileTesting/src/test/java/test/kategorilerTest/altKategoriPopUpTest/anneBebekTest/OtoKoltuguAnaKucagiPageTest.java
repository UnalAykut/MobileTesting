package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.OtoKoltuguAnaKucagiPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

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
        for (int i = 0; i < otoKoltuguAnaKucagiPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = otoKoltuguAnaKucagiPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.OTO_KOLTUGU_ANA_KUCAGI);
        }
    }
}
