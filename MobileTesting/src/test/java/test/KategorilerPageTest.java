package test;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import pages.KategorilerPage;
import pages.N11Pages;
import util.DriverFactory;

public class KategorilerPageTest extends BaseTest{

    @Test
     public void kategorilerTest(){
        n11Pages.clickKategoriler();
        for (KategorilerPage.Kategori kategori : KategorilerPage.Kategori.values()) {
            kategorilerPage.clickOnCategory(kategori);
            // Sayfada istenen kontrolleri yapın
            driver.navigate().back(); // Kategoriler sayfasına dön
        }
     }


}
