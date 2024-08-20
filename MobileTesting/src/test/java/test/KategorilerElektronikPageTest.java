package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.KategorilerElektronikPage;
import pages.KategorilerPage;


public class KategorilerElektronikPageTest extends BaseTest{

    @Test
    public void elektronikKategorilerValueTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
        kategorilerElektronikPage.clickOnElektronikCategory( KategorilerElektronikPage.ElektrikKategori.ELEKRIKLI_EV_ALETLERI );
        Thread.sleep( 3000 );
    }
    @Test
    public void elektronikKategorilerTest(){
        n11Pages.clickKategoriler();
        for (WebElement kategoriGez: kategorilerElektronikPage.elektronikKategoriGez()){
            elementHelper.waitForClickability( kategoriGez);//kategorilerdeki ögelerin yüklenmesini bekle
            elementHelper.clickElement( kategoriGez );//kategorileredeki ögeye tıkla
            elementHelper.clickBackButton();
            elementHelper.waitForVisibility( kategorilerPage.categoryList().get( 0 ) );
        }
    }



}
