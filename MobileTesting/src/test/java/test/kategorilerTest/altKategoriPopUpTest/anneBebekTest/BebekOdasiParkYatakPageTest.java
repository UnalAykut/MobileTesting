package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekOdasiParkYatakPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class BebekOdasiParkYatakPageTest extends AbstractBaseCategoryTest {

    @Test
    public void bebekOdasiParkYatakKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.ANNE_BEBEK,
                AnneBebekKategorilerPage.class,
                AnneBebekKategorilerPage.Kategori.BEBEK_ODASI_PARK_YATAK,
                BanyoTuvaletPage.class
        );
    }
}
