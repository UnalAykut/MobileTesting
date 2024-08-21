package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekGuvenlikPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class BebekGuvenlikPageTest extends BaseTest {
    private BebekGuvenlikPage bebekGuvenlikPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekGuvenlikPage = new BebekGuvenlikPage(driver);
    }
    @Test
    public void bebekGuvenlikKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_GUVENLIK);
        for (int i = 0; i < bebekGuvenlikPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = bebekGuvenlikPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_GUVENLIK);
        }
    }
}
