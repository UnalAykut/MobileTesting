package test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.KategorilerPage;
import pages.N11Pages;
import util.DriverFactory;

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
    public void kategorilerValueTest(){
        n11Pages.clickKategoriler();
        for (KategorilerPage.Kategori kategori : KategorilerPage.Kategori.values()) {
            kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
            elementHelper.clickBackButton(); // Kategoriler sayfasına dön
        }
    }


}
