package pages.kategoriler.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class TelevizyonSesSistemleriPage extends BasePage {
    public TelevizyonSesSistemleriPage(AppiumDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//*[contains(@resource-id, 'com.dmall.mfandroid:id/ivCategoryItem')]")
    private List<WebElement> televizyonSesSistemleriKategoriler;

    public enum TelevizyonSesKategori {
        DVD_BLU_RAY_MEDYA_OYNATICI("DVD, Blu-Ray, Medya Oynatıcılar"),
        MP3_MP4_CALAR_AKSESUARLARI("MP3, MP4 Çalar & Aksesuarları"),
        MUZIK_SISTEMLERI("Müzik Sistemleri"),
        PIL("Pil"),
        SES_SISTEMLERI("Ses Sistemleri"),
        TELEVIZYON("Televizyon"),
        TELEVIZYON_AKSESUARLARI("Televizyon Aksesuarları"),
        UYDU_SISTEMLERI("Uydu Sistemleri"),
        BLUETOOTH_HOPARLORLER("Bluetooth Hoparlörler"),
        IKINCI_EL_TESHIR_CIHAZLARI("İkinci El & Teşhir Cihazları"),
        PROJEKSIYON_AKSESUARLARI("Projeksiyon ve Aksesuarları");

        private final String displayName;

        TelevizyonSesKategori(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
    public List<WebElement> categoryList(){
        return getCategoryElements(televizyonSesSistemleriKategoriler);
    }
    public void bilgisayarKategorileri(TelevizyonSesSistemleriPage.TelevizyonSesKategori kategori){
        //clickOnCategory( televizyonSesSistemleriKategoriler,kategori.getDisplayName() );
    }


}
