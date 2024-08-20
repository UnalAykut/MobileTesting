package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.KategorilerElektronikPage;
import pages.KategorilerPage;


public class KategorilerElektronikPageTest extends BaseTest{

    @Test
    public void elektronikKategorilerValueTest(){
        n11Pages.clickKategoriler();
        kategorilerPage.clickOnElektronikCategory(KategorilerPage.Kategori.ELEKTRONIK );
        kategorilerElektronikPage.clickOnElektronikCategory(KategorilerElektronikPage.ElektrikKategori.TELEFON_AKSESUARLARI );
    }
    @Test
    public void elektronikKategorilerTest(){
        n11Pages.clickKategoriler();
        for (WebElement kategoriGez: kategorilerElektronikPage.elektronikKategoriGez()){
            elementHelper.waitForClickability( kategoriGez, 10 );//kategorilerdeki ögelerin yüklenmesini bekle
            kategoriGez.click();//kategorileredeki ögeye tıkla
            elementHelper.clickBackButton();
            elementHelper.waitForVisibility( kategorilerPage.categoryList().get( 0 ), 10 );
        }
    }



}
