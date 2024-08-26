package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;

import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.evYasam.DekorasyonAydinlatmaPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class DekorasyonAydinlatmaPageTest extends AbstractBaseCategoryTest {

    @Test
    public void dekorasyonAydinlatmaKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.EV_YASAM,
                EvVeYasamKategorilerPage.class,
                EvVeYasamKategorilerPage.Kategori.DEKORASYON_AYDINLATMA,
                BanyoTuvaletPage.class
        );
    }
}
