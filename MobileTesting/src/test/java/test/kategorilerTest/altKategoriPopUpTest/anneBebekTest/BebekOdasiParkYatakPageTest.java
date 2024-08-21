package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekOdasiParkYatakPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class BebekOdasiParkYatakPageTest extends BaseTest {
    private BebekOdasiParkYatakPage bebekOdasiParkYatakPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekOdasiParkYatakPage = new BebekOdasiParkYatakPage(driver);
    }
    @Test
    public void bebekOdasiParkYatakKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_ODASI_PARK_YATAK);
        for (int i = 0; i < bebekOdasiParkYatakPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = bebekOdasiParkYatakPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_ODASI_PARK_YATAK);
        }
    }
}
