package pages.kategoriler.altKategoriPopUp.anneBebek;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;
import pages.PageActions;

import java.util.List;

public class BanyoTuvaletPage extends BasePage implements PageActions<BanyoTuvaletPage.Kategori> {
    public BanyoTuvaletPage(AppiumDriver driver) {
        super( driver );
    }

    @FindBy(xpath = "//android.view.ViewGroup[android.widget.ImageView[@resource-id='com.dmall.mfandroid:id/ivCategoryItem'] and android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']]")
    private List<WebElement> kategoriElements;

    public enum Kategori implements DisplayNameEnum {
        BANYO_GERECLERI_VE_AKSESUARLAR( "Banyo Gereçleri ve Aksesuarlar" ),
        BANYO_SUNGERI_KESE( "Banyo Süngeri & Kese" ),
        HAVLU_BORNOZ( "Havlu & Bornoz" ),
        KUVET_URUNLERI( "Küvet Ürünleri" ),
        MAPRAGA_KOVA( "Maşrapa & Kova" ),
        SABUN( "Sabun" ),
        SAMPUAN_KREM( "Şampuan & Krem" ),
        TUVALET_EGITIMI( "Tuvalet Eğitimi" );

        private final String displayName;

        Kategori(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String getDisplayName() {
            return displayName;
        }
    }
    @Override
    public void loadCategories() {
        kategoriMap = loadCategories( kategoriElements, categoryTextXPath, Kategori.class );
    }
    @Override
    public void clickOnCategory(Kategori kategori) {
        BasePage.clickOnCategory( kategoriMap, kategori, categoryTextXPath );
    }

    @Override
    public List<WebElement> categoryList() {
        return getCategoryElements( kategoriElements );
    }

}