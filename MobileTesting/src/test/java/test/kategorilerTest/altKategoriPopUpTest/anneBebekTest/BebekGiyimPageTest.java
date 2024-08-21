package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekGiyimPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class BebekGiyimPageTest extends BaseTest {
    private BebekGiyimPage bebekGiyimPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekGiyimPage = new BebekGiyimPage(driver);
    }
    @Test
    public void bebekGiyimKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_GIYIM);
        for (int i = 0; i < bebekGiyimPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = bebekGiyimPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_GIYIM);
        }
    }
}
