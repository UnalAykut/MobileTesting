package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class KategorilerElektronikPage extends BasePage{

    public KategorilerElektronikPage(AppiumDriver driver) {
        super( driver );
    }

    @FindBy(xpath = "//*[contains(@resource-id,'com.dmall.mfandroid:id/ivCategoryItem')]/following-sibling::android.widget.TextView[contains(@resource-id,'com.dmall.mfandroid:id/tvCategoryItem')]\n")
    private List<WebElement> elektronikKategorileri;

    public enum ElektrikKategori{
        TELEFON_AKSESUARLARI("Telefon & Aksesuarları"),
        BILGISAYAR("Bilgisayar"),
        TELEVİZYON_SES_SISTEMLERI("Televizyon & Ses Sistemleri"),
        ELEKRIKLI_EV_ALETLERI("Elektrikli Ev Aletleri"),
        BEYAZ_ESYA("Beyaz Esya"),
        FOTOGRAF_KAMERA("Fotoğraf & Kamera"),
        VİDEO_OYUN_KONSOL("Video Oyun & Konsol");
    private String displayName;
        ElektrikKategori(String displayName) {
            this.displayName = displayName; // Parametre olarak verilen gösterim adı, ilgili enum değerine atanır.
        }
        public String getDisplayName() {
            return displayName;
        }
    }
    public void clickOnElektronikCategory(KategorilerElektronikPage.ElektrikKategori kategori){
        for (WebElement element:elektronikKategorileri){
            elementHelper.waitForVisibility( element );
            if(element.getText().equalsIgnoreCase(kategori.getDisplayName())){
                elementHelper.clickElement(element);
                break;
            }
        }
    }


    public List<WebElement> elektronikKategoriGez(){
        return getCategoryElements(elektronikKategorileri);
    }

}
