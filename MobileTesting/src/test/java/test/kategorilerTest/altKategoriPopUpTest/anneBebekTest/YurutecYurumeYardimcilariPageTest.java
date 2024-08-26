package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.YurutecYurumeYardimcilariPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class YurutecYurumeYardimcilariPageTest extends AbstractBaseCategoryTest {

    @Test
    public void yuruteçYurumeYardimcilariKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.ANNE_BEBEK,
                AnneBebekKategorilerPage.class,
                AnneBebekKategorilerPage.Kategori.YURUTEC_YURUME_YARDIMCILARI,
                BanyoTuvaletPage.class
        );
    }
}
