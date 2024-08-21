package pages.kategoriler.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;

import java.util.List;

public class TelefonAksesuarlariPage extends BasePage {
    public TelefonAksesuarlariPage(AppiumDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;
    public enum Kategori implements DisplayNameEnum {
        CEP_TELEFONU ("Cep Telefonu"),
        CEP_TELEFONU_AKSESUARLARI ("Cep Telefonu Aksesuarları"),
        CEP_TELEFONU_YEDEK_PARCA("Cep Telefonu Yedek Parca"),
        SIM_KART_HAFIZA_PAKETLER("Sım Kart, Hat, Paketler"),
        TELSİZ_MASAUSTU_TELEFON("Telsiz ve Masaüstü Telefonlar"),
        GIYILEBILIR_TEKNOLOJI("Giyilebilir Teknoloji"),
        OUTLET_TESHIR_CEP_TELEFONU("Outlet-Teşhir Cep Telefonu"),
        TUSLU_TELEFON("Tuşlu Telefonu"),
        YENİLENMİS_TELEFON_AKSESUAR("Yenilenmiş Telefon & Aksesuarları");
        private  String displayName;
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
    public void clickOnCategory(TelefonAksesuarlariPage.Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }
    public List<WebElement> categoryList(){
        return getCategoryElements(kategoriElements);
    }
        }





