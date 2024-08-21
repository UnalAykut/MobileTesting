package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.KategorilerElektronikPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BilgisayarPage;
import pages.kategoriler.altKategoriPopUp.elektronik.VideoOyunKonsolPage;
import test.BaseTest;

import java.util.List;

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
        kategorilerElektronikPage.loadCategories();
        kategorilerElektronikPage.clickOnCategory( KategorilerElektronikPage.Kategori.VİDEO_OYUN_KONSOL);
        for (int i = 0; i < videoOyunKonsolPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = videoOyunKonsolPage.categoryList(); // Her seferinde elementleri yeniden al
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep( 2000 );
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(kategorilerElektronikPage.categoryList().get(0));
            kategorilerElektronikPage.loadCategories();
            kategorilerElektronikPage.clickOnCategory(KategorilerElektronikPage.Kategori.VİDEO_OYUN_KONSOL);
        }
    }
}
