package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.KategorilerElektronikPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BilgisayarPage;


public class KategorilerElektronikPageTest extends BaseTest{

    @Test
    public void elektronikKategorilerValueTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        Thread.sleep(2000);
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ELEKTRONIK);
        Thread.sleep(2000);
        kategorilerElektronikPage.loadCategories();
        kategorilerElektronikPage.clickOnCategory( KategorilerElektronikPage.ElektrikKategori.BILGISAYAR );
        Thread.sleep( 2000 );
        bilgisayarPage.loadCategories();
        bilgisayarPage.clickOnCategory( BilgisayarPage.BilgisayarKategori.DIZUSTU_BILGISAYAR );

    }
    @Test
    public void elektronikKategorilerTest(){
        n11Pages.clickKategoriler();
        for (WebElement kategoriGez: kategorilerElektronikPage.categoryList()){
            elementHelper.waitForClickability( kategoriGez);//kategorilerdeki ögelerin yüklenmesini bekle
            elementHelper.clickElement( kategoriGez );//kategorileredeki ögeye tıkla
            elementHelper.clickBackButton();
            elementHelper.waitForVisibility( kategorilerPage.categoryList().get( 0 ) );
        }
    }



}
