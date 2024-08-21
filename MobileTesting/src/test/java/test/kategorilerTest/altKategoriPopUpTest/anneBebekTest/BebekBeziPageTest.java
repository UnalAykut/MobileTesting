package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekBeziIslakMendilPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class BebekBeziPageTest extends BaseTest {
    private BebekBeziIslakMendilPage bebekBeziIslakMendilPage;
    @Override
    public void intializePages() {
        super.intializePages();
        bebekBeziIslakMendilPage = new BebekBeziIslakMendilPage(driver);
    }
    @Test
    public void bebekBeziKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ANNE_BEBEK);
        anneBebekKategorilerPage.loadCategories();
        anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_BEZI_ISLAK_MENDIL);
        for (int i = 0; i < bebekBeziIslakMendilPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = bebekBeziIslakMendilPage.categoryList();
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep(2000);
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(anneBebekKategorilerPage.categoryList().get(0));
            anneBebekKategorilerPage.loadCategories();
            anneBebekKategorilerPage.clickOnCategory(AnneBebekKategorilerPage.Kategori.BEBEK_BEZI_ISLAK_MENDIL);
        }
    }
}
