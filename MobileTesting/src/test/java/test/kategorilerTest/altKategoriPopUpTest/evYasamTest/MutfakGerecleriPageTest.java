package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.evYasam.MutfakGerecleriPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class MutfakGerecleriPageTest extends AbstractBaseCategoryTest {

    @Test
    public void mutfakGerecleriKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.EV_YASAM,
                EvVeYasamKategorilerPage.class,
                EvVeYasamKategorilerPage.Kategori.MUTFAK_GERECLERI,
                BanyoTuvaletPage.class
        );
    }
}
