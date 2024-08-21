package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BiberonAksesuarlariPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class BiberonAksesuarlariPageTest extends BaseTest {
    private BiberonAksesuarlariPage biberonAksesuarlariPage;
    @Override
    public void intializePages() {
        super.intializePages();
        biberonAksesuarlariPage = new BiberonAksesuarlariPage(driver);
    }
    @Test
    public void biberonAksesuarlariKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BIBERON_AKSESUARLARI);
        for (int i = 0; i < biberonAksesuarlariPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = biberonAksesuarlariPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BIBERON_AKSESUARLARI);
        }
    }
}
