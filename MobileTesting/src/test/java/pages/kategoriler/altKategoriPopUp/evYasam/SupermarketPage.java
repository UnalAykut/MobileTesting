package pages.kategoriler.altKategoriPopUp.evYasam;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;
import java.util.List;

public class SupermarketPage extends BasePage {
    public SupermarketPage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        DETERJAN_TEMIZLIK("Deterjan & Temizlik"),
        YAGLAR("Yağlar"),
        GIDA_SEKERLEME("Gıda & Şekerleme"),
        ICECEK("İçecek"),
        MEYVE_SEBZE("Meyve & Sebze");

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
