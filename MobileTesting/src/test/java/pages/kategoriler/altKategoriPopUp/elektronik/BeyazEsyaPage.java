package pages.kategoriler.altKategoriPopUp.elektronik;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;
import java.util.List;

public class BeyazEsyaPage extends BasePage {
    public BeyazEsyaPage(AppiumDriver driver) {
        super( driver );
    }
    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        ENDUSTRIYEL_BEYAZ_ESYALAR("Endüstriyel Beyaz Eşyalar"),
        ANKASTRE("Ankastre"),
        ASPIRATOR("Aspiratör"),
        BULASIK_MAKINESI("Bulaşık Makinesi"),
        BUZDOLABI("Buzdolabı"),
        CAMASIR_MAKINESI("Çamaşır Makinesi"),
        DERIN_DONDURUCU("Derin Dondurucu"),
        KURUTMA_MAKINESI("Kurutma Makinesi"),
        PISIRME_GRUBU("Pişirme Grubu"),
        SU_SEBILI("Su Sebili"),
        SARAP_SOGUTUCU("Şarap Soğutucu"),
        YEDEK_PARCA_AKSESUAR("Yedek Parça & Aksesuar"),
        DIGER_BEYAZ_ESYALAR("Diğer Beyaz Eşyalar"),
        ISITMA_SOGUTMA("Isıtma & Soğutma");

        private final String displayName;

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
    public void clickOnCategory(BeyazEsyaPage.Kategori kategori) {
        BasePage.clickOnCategory(kategoriMap, kategori, categoryTextXPath);
    }
    public List<WebElement> categoryList(){
        return getCategoryElements(kategoriElements);
    }

}
