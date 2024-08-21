package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BeslenmeMamaSandalyesiPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

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
        for (int i = 0; i < beslenmeMamaSandalyesiPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = beslenmeMamaSandalyesiPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BESLENME_MAMA_SANDALYESI);
        }
    }
}
