package test.kategorilerTest.altKategoriPopUpTest.evYasamTest;


import org.testng.annotations.Test;
import pages.kategoriler.EvVeYasamKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.evYasam.MobilyaPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;


public class MobilyaPageTest extends AbstractBaseCategoryTest {

    @Test
    public void mobilyaKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.EV_YASAM,
                EvVeYasamKategorilerPage.class,
                EvVeYasamKategorilerPage.Kategori.MOBILYA,
                BanyoTuvaletPage.class
        );
    }
}
