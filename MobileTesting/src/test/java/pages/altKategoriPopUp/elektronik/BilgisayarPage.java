package pages.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class BilgisayarPage extends BasePage {
    @FindBy(xpath = "//*[contains(@resource-id, 'com.dmall.mfandroid:id/ivCategoryItem')]")
    private List<WebElement> bilgisayarKategorileri;
    public BilgisayarPage(AppiumDriver driver) {
        super( driver );
    }
    public enum BilgisayarKategori {
        TABLET("Tablet"),
        DIZUSTU_BILGISAYAR("Dizüstü Bilgisayar"),
        MASAUSTU_BILGISAYAR("Masaüstü Bilgisayar"),
        SUNUCU_VE_AKSESUARLARI("Sunucu ve Aksesuarları"),
        YEDEKLEME_URUNLERI("Yedekleme Ürünleri"),
        MODEM_VE_AG_URUNLERI("Modem & Ağ Ürünleri"),
        CEVRE_BIRIMLERI("Çevre Birimleri"),
        BILGISAYAR_BILESENLERI("Bilgisayar Bileşenleri"),
        YAZICI_TARAYICI_AKSESUARLARI("Yazıcı, Tarayıcı ve Aksesuarları"),
        E_KITAP_OKUYUCU("E-Kitap Okuyucu ve Aksesuarları"),
        AKSESUAR_VE_YEDEK_PARCA("Aksesuar & Yedek Parça"),
        OFIS_ELEKTRONIGI("Ofis Elektroniği"),
        OYUN_VE_YAZILIM("Oyun & Yazılım"),
        YENILENMIS_ILK_KEZ_TEHSIR_URUNLERI("Yenilenmiş İkinci El & Teşhir Ürünleri");

        private final String displayName;

        BilgisayarKategori(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
    public List<WebElement> categoryList(){
        return getCategoryElements(bilgisayarKategorileri);
    }
    public void bilgisayarKategorileri(BilgisayarPage.BilgisayarKategori kategori){
        clickOnCategory( bilgisayarKategorileri,kategori.getDisplayName() );
    }


}
