package pages.kategoriler;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;

import java.util.List;

public class AnneBebekKategorilerPage extends BasePage {
    public AnneBebekKategorilerPage(AppiumDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        MODA("Moda"),
        ELEKTRONIK("Elektronik"),
        EV_YASAM("Ev & Yaşam"),
        ANNE_BEBEK("Anne & Bebek"),
        BEBEK_BEZI_ISLAK_MENDIL("Bebek Bezi & Islak Mendil"),
        BEBEK_GIYIM("Bebek Giyim"),
        HAMILE_GIYIM("Hamile Giyim"),
        BEBEK_ARABALARI("Bebek Arabaları"),
        OTO_KOLTUGU_ANA_KUCAGI("Oto Koltuğu & Ana Kucağı"),
        BESLENME_MAMA_SANDALYESI("Beslenme & Mama Sandalyesi"),
        BIBERON_AKSESUARLARI("Biberon ve Aksesuarları"),
        EMZIRME_URUNLERI("Emzirme Ürünleri"),
        YURUTEC_YURUME_YARDIMCILARI("Yürüteç, Yürüme Yardımcıları"),
        BEBEK_ODASI_PARK_YATAK("Bebek Odası & Park Yatak"),
        BEBEK_BAKIM_SAGLIK("Bebek Bakım & Sağlık"),
        BEBEK_GUVENLIK("Bebek Güvenlik"),
        BEBEK_OYUNCAKLARI("Bebek Oyuncakları"),
        BANYO_TUVALET("Banyo & Tuvalet"),
        KOZMETIK("Kozmetik & Kişisel Bakım"),
        MUCEVHER_SAAT("Mücevher & Saat"),
        SPOR_OUTDOOR("Spor & Outdoor"),
        KITAP_MUZIK_FILM_OYUN("Kitap, Müzik, Film ,Oyun"),
        OTOMOTIV_MOTOSIKLET("Otomotiv & Motosiklet"),
        YURT_DISINDAN_URUNLER("Yurt Dışından Ürünler"),
        PET11("pet11");

        private String displayName;

        Kategori(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String getDisplayName() {
            return displayName;
        }
    }

    public void loadCategories() {
        kategoriMap = loadCategories(kategoriElements, categoryTextXPath);
    }
    public void clickOnCategory(AnneBebekKategorilerPage.Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }
    public List<WebElement> categoryList(){
        return getCategoryElements(kategoriElements);
    }


}
