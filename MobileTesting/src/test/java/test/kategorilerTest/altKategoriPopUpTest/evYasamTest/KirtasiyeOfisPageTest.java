package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;


import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.evYasam.KirtasiyeOfisPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class KirtasiyeOfisPageTest extends AbstractBaseCategoryTest {

    @Test
    public void kirtasiyeOfisKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.EV_YASAM,
                EvVeYasamKategorilerPage.class,
                EvVeYasamKategorilerPage.Kategori.KIRTASIYE_OFIS,
                BanyoTuvaletPage.class
        );
    }
}

