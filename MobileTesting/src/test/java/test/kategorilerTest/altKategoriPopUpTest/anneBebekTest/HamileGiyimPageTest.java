package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.HamileGiyimPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class HamileGiyimPageTest extends BaseTest {
    private HamileGiyimPage hamileGiyimPage;
    @Override
    public void intializePages() {
        super.intializePages();
        hamileGiyimPage = new HamileGiyimPage(driver);
    }
    @Test
    public void hamileGiyimKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.HAMILE_GIYIM);
        for (int i = 0; i < hamileGiyimPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = hamileGiyimPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.HAMILE_GIYIM);
        }
    }
}
