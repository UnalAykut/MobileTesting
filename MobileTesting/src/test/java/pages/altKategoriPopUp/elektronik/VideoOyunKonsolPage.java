package pages.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class VideoOyunKonsolPage extends BasePage {
    public VideoOyunKonsolPage(AppiumDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//*[contains(@resource-id, 'com.dmall.mfandroid:id/ivCategoryItem')]")
    private List<WebElement> videoOyunKonsolKategorileri;

    public enum VideoOyunKonsolKategori {
        PLAYSTATION_5("PlayStation 5"),
        XBOX_SERIES_X_SERIES_S("Xbox Series X & Series S"),
        PLAYSTATION_4("PlayStation 4"),
        XBOX_ONE_ONE_S_ONE_X("Microsoft Xbox One, One S & One X"),
        NINTENDO_SWITCH("Nintendo Switch"),
        MINI_OYUN_KONSOLLARI("Mini Oyun Konsolları"),
        PLAYSTATION_3("PlayStation 3"),
        XBOX_360("Xbox 360"),
        ESKI_SISTEM_KONSOLLAR("Eski Sistem Konsollar"),
        IKINCI_EL_YENILENMIS_KONSOLLAR("İkinci El-Yenilenmiş Konsollar");

        private final String displayName;

        VideoOyunKonsolKategori(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

}
