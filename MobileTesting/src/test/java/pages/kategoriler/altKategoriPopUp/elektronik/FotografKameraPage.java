package pages.kategoriler.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;

import java.util.List;

public class FotografKameraPage extends BasePage {
    public FotografKameraPage(AppiumDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        CANTA_KILIF("Çanta & Kılıf"),
        FOTOGRAF_MAKINESI("Fotoğraf Makinesi"),
        FOTOGRAF_MAKINESI_AKSESUARLARI("Fotoğraf Makinesi Aksesuarları"),
        LENS_OBJEKTIF_FILTRE("Lens, Objektif, Filtre"),
        TRIPOD_MONOPOD("Tripod & Monopod"),
        VIDEO_KAMERA("Video Kamera"),
        VIDEO_KAMERA_AKSESUARLARI("Video Kamera Aksesuarları"),
        FOTOGRAF_YAZICILAR("Fotoğraf Yazıcılar");

        private final String displayName;

        Kategori(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
    public void loadCategories() {
        kategoriMap = loadCategories(kategoriElements, categoryTextXPath,Kategori.class);
    }
    public void clickOnCategory(FotografKameraPage.Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }
    public List<WebElement> categoryList(){
        return getCategoryElements(kategoriElements);
    }
}
