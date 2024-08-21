package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekArabasiPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class BebekArabasiPageTest extends BaseTest {
    private BebekArabasiPage bebekArabasiPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekArabasiPage = new BebekArabasiPage(driver);
    }
    @Test
    public void bebekArabasiKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_ARABALARI);
        for (int i = 0; i < bebekArabasiPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = bebekArabasiPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_ARABALARI);
        }
    }
}
