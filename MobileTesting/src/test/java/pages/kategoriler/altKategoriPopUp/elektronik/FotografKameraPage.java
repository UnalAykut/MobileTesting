package pages.kategoriler.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class FotografKameraPage extends BasePage {
    public FotografKameraPage(AppiumDriver driver) {
        super( driver );

    }
    @FindBy(xpath = "//*[contains(@resource-id, 'com.dmall.mfandroid:id/ivCategoryItem')]")
    private List<WebElement> fotografKameraKategorileri;

    public enum FotografKameraKategori {
        CANTA_KILIF("Çanta & Kılıf"),
        FOTOGRAF_MAKINESI("Fotoğraf Makinesi"),
        FOTOGRAF_MAKINESI_AKSESUARLARI("Fotoğraf Makinesi Aksesuarları"),
        LENS_OBJEKTIF_FILTRE("Lens, Objektif, Filtre"),
        TRIPOD_MONOPOD("Tripod & Monopod"),
        VIDEO_KAMERA("Video Kamera"),
        VIDEO_KAMERA_AKSESUARLARI("Video Kamera Aksesuarları"),
        FOTOGRAF_YAZICILAR("Fotoğraf Yazıcılar");

        private final String displayName;

        FotografKameraKategori(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}
