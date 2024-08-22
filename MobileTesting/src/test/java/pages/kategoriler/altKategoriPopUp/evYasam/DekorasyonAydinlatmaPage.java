package pages.kategoriler.altKategoriPopUp.evYasam;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;
import java.util.List;

public class DekorasyonAydinlatmaPage extends BasePage {
    public DekorasyonAydinlatmaPage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        AYDINLATMA("Aydınlatma"),
        AYNA("Ayna"),
        DUVAR_KAGIDI("Duvar Kağıdı"),
        DUVAR_STICKER("Duvar Sticker"),
        EV_DEKORATIF_AKSESUARLAR("Ev & Dekoratif Aksesuarlar"),
        PARAVAN_SEPERATOR("Paravan & Separatör"),
        SAAT("Saat"),
        TABLO("Tablo"),
        DUVAR_ORTUSU("Duvar Örtüsü"),
        HEYKEK_EYYA("Hediyelik Eşya");

        private final String displayName;

        Kategori(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String getDisplayName() {
            return displayName;
        }
    }

    public void loadCategories() {
        kategoriMap = loadCategories(kategoriElements, categoryTextXPath,Kategori.class);
    }

    public void clickOnCategory(Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }

    public List<WebElement> categoryList(){
        return getCategoryElements(kategoriElements);
    }
}
