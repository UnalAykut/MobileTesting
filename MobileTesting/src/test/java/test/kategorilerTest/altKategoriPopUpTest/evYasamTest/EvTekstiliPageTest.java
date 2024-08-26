package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.evYasam.EvTekstiliPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class EvTekstiliPageTest extends AbstractBaseCategoryTest {

    @Test
    public void evTekstiliKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.EV_YASAM,
                EvVeYasamKategorilerPage.class,
                EvVeYasamKategorilerPage.Kategori.EV_TEKSTILI,
                BanyoTuvaletPage.class
        );
    }
}
