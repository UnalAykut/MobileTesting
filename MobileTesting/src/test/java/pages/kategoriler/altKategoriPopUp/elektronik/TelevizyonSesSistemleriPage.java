package pages.kategoriler.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;
import pages.kategoriler.KategorilerElektronikPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelevizyonSesSistemleriPage extends BasePage {

    public TelevizyonSesSistemleriPage(AppiumDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
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

        Kategori(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
    public void loadCategories() {
        kategoriMap = loadCategories(kategoriElements, categoryTextXPath);
    }
    public void clickOnCategory(TelevizyonSesSistemleriPage.Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }
    public List<WebElement> categoryList(){
        return getCategoryElements(kategoriElements);
    }


}
