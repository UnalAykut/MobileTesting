package test.kategorilerTest.altKategoriPopUpTest.anneBebekTest;

import org.testng.annotations.Test;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.BanyoTuvaletPage;
import pages.kategoriler.altKategoriPopUp.anneBebek.HamileGiyimPage;
import test.baseTest.AbstractBaseCategoryTest;
import test.baseTest.BaseTest;

public class HamileGiyimPageTest extends AbstractBaseCategoryTest {

    @Test
    public void hamileGiyimKategorilerTest() throws InterruptedException {
        performCategoryTest(KategorilerPage.Kategori.ANNE_BEBEK,
                AnneBebekKategorilerPage.class,
                AnneBebekKategorilerPage.Kategori.HAMILE_GIYIM,
                BanyoTuvaletPage.class
        );
    }
}
