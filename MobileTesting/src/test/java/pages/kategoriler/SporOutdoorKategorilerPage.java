package pages.kategoriler;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;
import pages.PageActions;

import java.util.List;

public class SporOutdoorKategorilerPage extends BasePage implements PageActions<SporOutdoorKategorilerPage.Kategori> {
    public SporOutdoorKategorilerPage(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        FITNESS_KONDISYON("Fitness & Kondisyon"),
        SPOR_GIYIM_AYAKKABI("Spor Giyim & Ayakkabı"),
        OUTDOOR_KAMP("Outdoor & Kamp"),
        BIREYSEL_TAKIM_SPORLARI("Bireysel & Takım Sporları"),
        AVCILIK_BALIKCILIK("Avcılık & Balıkçılık"),
        KIS_SPORLARI("Kış Sporları"),
        BISIKLET_SCOOTER("Bisiklet & Scooter"),
        TEKNE_YAT_MALZEMELERI("Tekne & Yat Malzemeleri"),
        SU_SPORLARI("Su Sporları");

        private String displayName;

        Kategori(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String getDisplayName() {
            return displayName;
        }
    }
    @Override
    public void loadCategories() {
        kategoriMap = loadCategories(kategoriElements, categoryTextXPath,Kategori.class);
    }
    @Override
    public void clickOnCategory(SporOutdoorKategorilerPage.Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }
    @Override
    public List<WebElement> categoryList() {
        return getCategoryElements(kategoriElements);
    }
}
