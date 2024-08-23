package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekArabasiPage;
import test.kategorilerTest.BaseTest;

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
        bebekArabasiPage.gezAndValidateCategories( anneBebekKategorilerPage,bebekArabasiPage, AnneBebekKategorilerPage.Kategori.BEBEK_ARABALARI);
    }
}
