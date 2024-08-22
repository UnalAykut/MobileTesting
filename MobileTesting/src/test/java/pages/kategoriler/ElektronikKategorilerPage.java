package pages.kategoriler;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;

import java.util.List;

public class ElektronikKategorilerPage extends BasePage {
    public ElektronikKategorilerPage(AppiumDriver driver) {
        super( driver );
    }

    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        TELEFON_AKSESUARLARI("Telefon & Aksesuarları"),
        BILGISAYAR("Bilgisayar"),
        TELEVİZYON_SES_SISTEMLERI("Televizyon & Ses Sistemleri"),
        ELEKRIKLI_EV_ALETLERI("Elektrikli Ev Aletleri"),
        BEYAZ_ESYA("Beyaz Eşya"),
        FOTOGRAF_KAMERA("Fotoğraf & Kamera"),
        VİDEO_OYUN_KONSOL("Video Oyun & Konsol");
    private String displayName;
        Kategori(String displayName) {
            this.displayName = displayName; // Parametre olarak verilen gösterim adı, ilgili enum değerine atanır.
        }

        @Override
        public String getDisplayName() {
            return displayName;
        }
    }
    public void loadCategories() {
        kategoriMap = loadCategories(kategoriElements, categoryTextXPath,Kategori.class);
    }
    public void clickOnCategory(ElektronikKategorilerPage.Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }
    public List<WebElement> categoryList(){
        return getCategoryElements(kategoriElements);
    }

}
