package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.elektronik.ElektrikliEvAletleriPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class ElektrikliEvAletleriPageTest extends AbstractBaseCategoryTest {

    @Test
    public void elektrikliEvAletleriKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.ELEKTRONIK,
                ElektronikKategorilerPage.class,
                ElektronikKategorilerPage.Kategori.ELEKRIKLI_EV_ALETLERI,
                BanyoTuvaletPage.class
        );
    }
}
