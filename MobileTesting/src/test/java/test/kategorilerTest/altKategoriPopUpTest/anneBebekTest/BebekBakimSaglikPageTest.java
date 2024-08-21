package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekBakimSaglikPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class BebekBakimSaglikPageTest extends BaseTest {
    private BebekBakimSaglikPage bebekBakimSaglikPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekBakimSaglikPage = new BebekBakimSaglikPage(driver);
    }
    @Test
    public void bebekBakimSaglikKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_BAKIM_SAGLIK);
        for (int i = 0; i < bebekBakimSaglikPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = bebekBakimSaglikPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_BAKIM_SAGLIK);
        }
    }
}
