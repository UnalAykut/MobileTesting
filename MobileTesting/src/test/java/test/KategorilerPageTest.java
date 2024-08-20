package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.KategorilerElektronikPage;
import pages.KategorilerPage;
import pages.altKategoriPopUp.elektronik.ElektrikliEvAletleriPage;


public class KategorilerPageTest extends BaseTest{

    @Test(priority = 0)
     public void kategorilerTest() {
        if (driver == null) {
            throw new RuntimeException( "Driver null, test çalıştırılamaz!" );
        }
        n11Pages.clickKategoriler();
        for (WebElement kategoriGez : kategorilerPage.categoryList()) {//kategorileri gez
            elementHelper.waitForClickability( kategoriGez, 10 );//kategorilerdeki ögelerin yüklenmesini bekle
            kategoriGez.click();//kategorileredeki ögeye tıkla
            elementHelper.clickBackButton();
            elementHelper.waitForVisibility( kategorilerPage.categoryList().get( 0 ), 10 );//kategori listesi tekrar yüklenmesi bekle
        }
    }
    @Test(priority = 1)
    public void kategorilerValueTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.clickOnElektronikCategory( KategorilerPage.Kategori.ELEKTRONIK);
        kategorilerElektronikPage.clickOnElektronikCategory( KategorilerElektronikPage.ElektrikKategori.ELEKRIKLI_EV_ALETLERI );
        elektrikliEvAletleriPage.selectCategory( elektrikliEvAletleriPage.elektrikliEvAletleriKategoriler, ElektrikliEvAletleriPage.ElektrikliEvAletleriKategori.UTU );
        }
    }



