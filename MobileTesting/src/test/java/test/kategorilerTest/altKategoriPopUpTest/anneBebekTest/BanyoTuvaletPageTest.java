package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

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
        for (int i = 0; i < banyoTuvaletPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = banyoTuvaletPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BANYO_TUVALET);
        }
    }
}
