package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BeyazEsyaPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class BeyazEsyaPageTest extends AbstractBaseCategoryTest {

    @Test
    public void beyazEsyaKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.ELEKTRONIK,
                ElektronikKategorilerPage.class,
                ElektronikKategorilerPage.Kategori.BEYAZ_ESYA,
                BanyoTuvaletPage.class
        );
    }

}
