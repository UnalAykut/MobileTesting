package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekBeziIslakMendilPage;
import test.baseTest.BaseTest;

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
        bebekBeziIslakMendilPage.gezAndValidateCategories( anneBebekKategorilerPage,bebekBeziIslakMendilPage, AnneBebekKategorilerPage.Kategori.BEBEK_BEZI_ISLAK_MENDIL );
    }
}
