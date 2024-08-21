package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.ElektrikliEvAletleriPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class ElektrikliEvAletleriPageTest extends BaseTest {
    private ElektrikliEvAletleriPage elektrikliEvAletleriPage;
    @Override
    public void intializePages() {
        super.intializePages();
        elektrikliEvAletleriPage=new ElektrikliEvAletleriPage( driver );
    }
    @Test
    public void bilgisayarKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.ELEKRIKLI_EV_ALETLERI);
        for (int i = 0; i < elektrikliEvAletleriPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = elektrikliEvAletleriPage.categoryList(); // Her seferinde elementleri yeniden al
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep( 2000 );
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility(elektrikliEvAletleriPage.categoryList().get(0));
            elektronikKategorilerPage.loadCategories();
            elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.ELEKRIKLI_EV_ALETLERI);
        }
    }

}
