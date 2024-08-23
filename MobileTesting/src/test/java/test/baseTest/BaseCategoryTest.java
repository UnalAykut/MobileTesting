/*package test.baseTest;

import org.testng.annotations.Test;
import pages.AbstractCategoryPage;
import pages.kategoriler.KategorilerPage;

import java.net.MalformedURLException;

public abstract class BaseCategoryTest<T extends AbstractCategoryPage<C>, C> extends BaseTest {
    protected T kategoriPage;

    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        kategoriPage = createCategoryPage();
    }

    protected abstract T createCategoryPage();

    @Test
    public void categoryTest() throws InterruptedException {
        n11Pages.clickKategoriler();
        kategorilerPage.loadCategories();
        kategorilerPage.clickOnCategory(getMainCategory());
        kategoriPage.loadCategories();
        kategoriPage.clickOnCategory(getCategory());
        kategoriPage.gezAndValidateCategories(kategorilerPage, kategoriPage, getCategory());
    }

    protected abstract KategorilerPage.Kategori getMainCategory();
    protected abstract Kategori getCategory();
}
*/
