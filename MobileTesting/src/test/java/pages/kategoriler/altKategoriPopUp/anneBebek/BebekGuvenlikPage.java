package pages.kategoriler.altKategoriPopUp.anneBebek;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;
import java.util.List;

public class BebekGuvenlikPage extends BasePage {
    public BebekGuvenlikPage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        BEBEK_TELSIZI_KAMERA("Bebek Telsizi & Kamera"),
        EV_GUVENLIK_URUNLERI("Ev Güvenlik Ürünleri"),
        KILIT_KOSE_KORUYUCU("Kilit & Köşe Koruyucusu"),
        OTO_GUVENLIK_URUNLERI("Oto Güvenlik Ürünleri"),
        PRIZ_EMNIYETI("Priz Emniyeti"),
        YATAK_BARIYERI("Yatak Bariyeri");

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
        kategoriMap = loadCategories(kategoriElements, categoryTextXPath);
    }

    public void clickOnCategory(BebekGuvenlikPage.Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }

    public List<WebElement> categoryList(){
        return getCategoryElements(kategoriElements);
    }
}
