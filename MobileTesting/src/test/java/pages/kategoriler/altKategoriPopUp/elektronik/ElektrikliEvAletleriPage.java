package pages.kategoriler.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ElektrikliEvAletleriPage extends BasePage {
    public ElektrikliEvAletleriPage(AppiumDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//*[contains(@resource-id, 'com.dmall.mfandroid:id/ivCategoryItem')]")
    public List<WebElement> elektrikliEvAletleriKategoriler;
    public enum ElektrikliEvAletleriKategori {
        ELEKTRIKLI_MUTFAK_ALETLERI("Elektrikli Mutfak Aletleri"),
        UTU("Ütü"),
        DIKIS_MAKINESI_VE_AKSESUARLARI("Dikiş Makinesi ve Aksesuarları"),
        ELEKTRIKLI_SUPURGE_YIKAMA("Elektrikli Süpürge & Yıkama"),
        TESHIR_OUTLET_URUNLERI("Teşhir & Outlet Ürünleri");

        private final String displayName;

        ElektrikliEvAletleriKategori(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
    public List<WebElement> categoryList(){
        return getCategoryElements(elektrikliEvAletleriKategoriler);
    }
    public void bilgisayarKategorileri(ElektrikliEvAletleriPage.ElektrikliEvAletleriKategori kategori){
        //clickOnCategory( elektrikliEvAletleriKategoriler,kategori.getDisplayName() );
    }
    public void selectCategory(ElektrikliEvAletleriPage.ElektrikliEvAletleriKategori kategori) {
        //clickOnCategory(elektrikliEvAletleriKategoriler, kategori.getDisplayName());
    }
}
