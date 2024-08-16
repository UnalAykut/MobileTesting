package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class N11Pages {
    private AppiumDriver driver;

    public N11Pages(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this );
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.FrameLayout/android.widget.ImageView\n")
    private WebElement kategoriButton;
    @FindBy(xpath = "//*[contains(@resource-id, 'com.dmall.mfandroid:id/ivCategoryItem')]")
    private List<WebElement> kategoriler;

    public void clickKategoriler() {
        kategoriButton.click();
    }

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
        public void clickOnCategory(Kategori kategori) {
            for (WebElement element : kategoriler) {
                if (element.getText().equals( kategori.getDisplayName() )) {
                    element.click();
                    break;
                }

            }
        }
}