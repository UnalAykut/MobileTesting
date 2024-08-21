package test.kategorilerTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.kategoriler.AnneBebekKategorilerPage;
import pages.kategoriler.ElektronikKategorilerPage;
import pages.kategoriler.KategorilerPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BeyazEsyaPage;
import pages.kategoriler.altKategoriPopUp.elektronik.BilgisayarPage;

public class AnneBebekKategorilerPageTest extends BaseTest {
    private AnneBebekKategorilerPage anneBebekKategorilerPage;
    @Override
    public void intializePages() {
        super.intializePages();
        anneBebekKategorilerPage=new AnneBebekKategorilerPage( driver );
    }
    @Test
    public void anneBebekKategorilerKategorilerValueTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        Thread.sleep(2000);
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory( KategorilerPage.Kategori.ANNE_BEBEK);
        Thread.sleep(2000);
       /* elektronikKategorilerPage.loadCategories();
        elektronikKategorilerPage.clickOnCategory( ElektronikKategorilerPage.Kategori.BILGISAYAR );
        Thread.sleep( 2000 );
        bilgisayarPage.loadCategories();
        bilgisayarPage.clickOnCategory( BilgisayarPage.Kategori.DIZUSTU_BILGISAYAR );*/
    }

}
