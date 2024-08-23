package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.VideoOyunKonsolPage;
import test.kategorilerTest.BaseTest;

public class VideoOyunKonsolPageTest extends BaseTest {
    private VideoOyunKonsolPage videoOyunKonsolPage;
    @Override
    public void intializePages() {
        super.intializePages();
        videoOyunKonsolPage=new VideoOyunKonsolPage( driver );
    }
    @Test
    public void bilgisayarKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.VİDEO_OYUN_KONSOL);
        videoOyunKonsolPage.gezAndValidateCategories(elektronikKategorilerPage, videoOyunKonsolPage, ElektronikKategorilerPage.Kategori.VİDEO_OYUN_KONSOL);
    }
}
