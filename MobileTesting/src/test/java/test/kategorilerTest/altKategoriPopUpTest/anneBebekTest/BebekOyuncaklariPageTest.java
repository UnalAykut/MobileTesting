package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekOyuncaklariPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class BebekOyuncaklariPageTest extends BaseTest {
    private BebekOyuncaklariPage bebekOyuncaklariPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekOyuncaklariPage = new BebekOyuncaklariPage(driver);
    }
    @Test
    public void bebekOyuncaklariKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_OYUNCAKLARI);
        for (int i = 0; i < bebekOyuncaklariPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = bebekOyuncaklariPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_OYUNCAKLARI);
        }
    }
}
