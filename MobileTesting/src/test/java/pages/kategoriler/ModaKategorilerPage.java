package pages.kategoriler;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;

import java.util.List;

public class ModaKategorilerPage extends BasePage {
    public ModaKategorilerPage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        AYAKKABI_CANTA("Ayakkabı & Çanta"),
        KADIN_GIYIM_AKSESUAR("Kadın Giyim & Aksesuar"),
        ERKEK_GIYIM_AKSESUAR("Erkek Giyim & Aksesuar"),
        COCUK_GIYIM_AKSESUAR("Çocuk Giyim & Aksesuar");

        private String displayName;

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

    public void clickOnCategory(ModaKategorilerPage.Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }

    public List<WebElement> categoryList() {
        return getCategoryElements(kategoriElements);
    }
}
