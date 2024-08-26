package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.evYasam.BanyoEvGerecleriPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class BanyoEvGerecleriPageTest extends AbstractBaseCategoryTest {

    @Test
    public void banyoEvGerecleriKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.EV_YASAM,
                EvVeYasamKategorilerPage.class,
                EvVeYasamKategorilerPage.Kategori.BANYO_EV_GERECLERI,
                BanyoTuvaletPage.class
        );
    }
}
