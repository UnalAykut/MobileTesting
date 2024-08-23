package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.EmzirmeUrunleriPage;
import test.kategorilerTest.BaseTest;

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
        emzirmeUrunleriPage.gezAndValidateCategories( anneBebekKategorilerPage,emzirmeUrunleriPage, AnneBebekKategorilerPage.Kategori.EMZIRME_URUNLERI );
    }
}
