package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.YurutecYurumeYardimcilariPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class YurutecYurumeYardimcilariPageTest extends BaseTest {
    private YurutecYurumeYardimcilariPage yuruteçYurumeYardimcilariPage;
    @Override
    public void intializePages() {
        super.intializePages();
        yuruteçYurumeYardimcilariPage = new YurutecYurumeYardimcilariPage(driver);
    }
    @Test
    public void yuruteçYurumeYardimcilariKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.YURUTEC_YURUME_YARDIMCILARI);
        for (int i = 0; i < yuruteçYurumeYardimcilariPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = yuruteçYurumeYardimcilariPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.YURUTEC_YURUME_YARDIMCILARI);
        }
    }
}
