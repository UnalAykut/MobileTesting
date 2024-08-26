package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.elektronik.TelefonAksesuarlariPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class TelefonAksesuarlariPageTest extends AbstractBaseCategoryTest {

    @Test
    public void telefonAksesuarlariKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.ELEKTRONIK,
                ElektronikKategorilerPage.class,
                ElektronikKategorilerPage.Kategori.TELEFON_AKSESUARLARI,
                BanyoTuvaletPage.class
        );
    }
}
