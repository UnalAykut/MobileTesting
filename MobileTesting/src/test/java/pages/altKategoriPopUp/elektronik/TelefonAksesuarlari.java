package pages.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class TelefonAksesuarlari extends BasePage {
    public TelefonAksesuarlari(AppiumDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//*[contains(@resource-id, 'com.dmall.mfandroid:id/ivCategoryItem')]")
    private List<WebElement> telefonAksesuarKategorileri;
    public enum TelefonAksesuarKategori{
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
        TelefonAksesuarKategori(String displayName) {
            this.displayName = displayName;
        }
        public String getDisplayName() {
            return displayName;
        }
    }

    public List<WebElement> categoryList(){
        return getCategoryElements(telefonAksesuarKategorileri);
    }

    public void telefonAksesuarKategorileri(TelefonAksesuarlari.TelefonAksesuarKategori kategori){
                clickOnCategory( telefonAksesuarKategorileri,kategori.getDisplayName() );
            }
        }





