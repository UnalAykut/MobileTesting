package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BiberonAksesuarlariPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class BiberonAksesuarlariPageTest extends AbstractBaseCategoryTest {
    @Test
    public void biberonAksesuarlariKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.ANNE_BEBEK,
                AnneBebekKategorilerPage.class,
                AnneBebekKategorilerPage.Kategori.BIBERON_AKSESUARLARI,
                BanyoTuvaletPage.class
        );
    }
}
