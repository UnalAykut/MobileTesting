package pages.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Telefon_Aksesuarlari extends BasePage {

    public Telefon_Aksesuarlari(AppiumDriver driver) {
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

        private  String kategoriName;
        TelefonAksesuarKategori(String displayName) {
            this.kategoriName = displayName;
        }
        public String getkategoriName() {
            return kategoriName;
        }
    }

    public List<WebElement> categoryList(){
        return  telefonAksesuarKategorileri;
    }

    public void clickOnCategory(Telefon_Aksesuarlari.TelefonAksesuarKategori kategori){
        for (WebElement element:telefonAksesuarKategorileri){
            if (element.getText().equalsIgnoreCase(kategori.getkategoriName())) {
                element.click();
                break;
            }
        }
    }




}
