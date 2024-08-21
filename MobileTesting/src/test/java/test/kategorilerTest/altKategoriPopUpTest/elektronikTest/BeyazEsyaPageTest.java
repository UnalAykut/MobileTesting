package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BeyazEsyaPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class BeyazEsyaPageTest extends BaseTest {
    private BeyazEsyaPage beyazEsyaPage;
    @Override
    public void intializePages() {
        super.intializePages();
        beyazEsyaPage=new BeyazEsyaPage( driver );
    }
    @Test
    public void beyazEsyaKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(KategorilerPage.Kategori.ELEKTRONIK);
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.BEYAZ_ESYA);
        for (int i = 0; i < beyazEsyaPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = beyazEsyaPage.categoryList(); // Her seferinde elementleri yeniden al
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep( 2000 );
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility( elektronikKategorilerPage.categoryList().get(0));
            elektronikKategorilerPage.loadCategories();
            elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.BEYAZ_ESYA);
        }
    }


}
