package test.kategorilerTest.altKategoriPopUpTest.elektronikTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.FotografKameraPage;
import test.kategorilerTest.BaseTest;

import java.util.List;

public class FotografKameraPageTest extends BaseTest {
    private FotografKameraPage fotografKameraPage;

    @Override
    public void intializePages() {
        super.intializePages();
        fotografKameraPage=new FotografKameraPage( driver );
    }
    @Test
    public void fotografKameraKategorilerTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ELEKTRONIK);
        elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.FOTOGRAF_KAMERA);
        for (int i = 0; i < fotografKameraPage.categoryList().size(); i++) {
            List<WebElement> kategoriler = fotografKameraPage.categoryList(); // Her seferinde elementleri yeniden al
            WebElement kategoriGez = kategoriler.get(i);
            elementHelper.waitForVisibility(kategoriGez);
            elementHelper.clickElement(kategoriGez);
            Thread.sleep( 2000 );
            elementHelper.searchBackButton();
            elementHelper.waitForVisibility( elektronikKategorilerPage.categoryList().get(0));
            elektronikKategorilerPage.loadCategories();
            elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.FOTOGRAF_KAMERA);
        }
    }
}
