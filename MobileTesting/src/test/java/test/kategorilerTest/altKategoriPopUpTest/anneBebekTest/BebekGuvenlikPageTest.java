package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BebekGuvenlikPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class BebekGuvenlikPageTest extends AbstractBaseCategoryTest {

    @Test
    public void bebekGuvenlikKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.ANNE_BEBEK,
                AnneBebekKategorilerPage.class,
                AnneBebekKategorilerPage.Kategori.BEBEK_GUVENLIK,
                BanyoTuvaletPage.class
        );
    }
}
