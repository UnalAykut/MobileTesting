package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class KategorilerPage extends BasePage {

    public KategorilerPage(AppiumDriver driver) {
        super(driver);

    }
    @FindBy(xpath = "//*[contains(@resource-id, 'com.dmall.mfandroid:id/ivCategoryItem')]")
    private List<WebElement> kategoriler;
    public enum Kategori {
        MODA( "Moda" ),
        ELEKTRONIK( "Elektronik" ),
        EV_YASAM( "Ev & Yaşam" ),
        ANNE_BEBEK( "Anne & Bebek" ),
        KOZMETIK( "Kozmetik & Kişisel Bakım" ),
        MUCEVHER_SAAT( "Mücevher & Saat" ),
        SPOR_OUTDOOR( "Spor & Outdoor" ),
        KITAP_MUZIK_FILM_OYUN( "Kitap, Müzik, Film ,Oyun" ),
        OTOMOTIV_MOTOSIKLET( "Otomotiv & Motosiklet" ),
        YURT_DISINDAN_URUNLER( "Yurt Dışından Ürünler" ),
        PET11( "pet11" );

        private String displayName;

        Kategori(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    public void clickOnCategory(KategorilerPage.Kategori kategori) {
        for (WebElement element : kategoriler) {
            if (element.getText().equalsIgnoreCase( kategori.getDisplayName() )) {
                element.click();
                break;
            }
        }
    }
    public List<WebElement> categoryList(){
        return kategoriler;
    }

}