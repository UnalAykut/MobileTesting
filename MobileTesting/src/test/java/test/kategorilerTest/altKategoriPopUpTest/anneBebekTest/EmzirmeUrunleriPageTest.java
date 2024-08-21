package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.EmzirmeUrunleriPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class EmzirmeUrunleriPageTest extends BaseTest {
    private EmzirmeUrunleriPage emzirmeUrunleriPage;
    @Override
    public void intializePages() {
        super.intializePages();
        emzirmeUrunleriPage = new EmzirmeUrunleriPage(driver);
    }
    @Test
    public void emzirmeUrunleriKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.EMZIRME_URUNLERI);
        for (int i = 0; i < emzirmeUrunleriPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = emzirmeUrunleriPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.EMZIRME_URUNLERI);
        }
    }
}
