package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import util.ElementHelper;

import java.util.List;

public abstract class BasePage {
    protected AppiumDriver driver;
    private ElementHelper elementHelper =new ElementHelper( driver );
    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this );
    }
    public void selectCategory(List<WebElement> categoryList, Enum<?> kategoriEnum) {
        String categoryName = kategoriEnum.toString().replace("_", " ");
        clickOnCategory(categoryList, categoryName);
    }
    public List<WebElement> getCategoryElements(List<WebElement> categoryList) {
        return categoryList;
    }
    public void clickOnCategory(List<WebElement> categoryList, String categoryName) {
        for (WebElement element : categoryList) {
            if (element.getText().equalsIgnoreCase( categoryName )) {
                element.click();
                break; // Kategori bulundu ve tıklandı, döngüden çık
            }
        }
    }
}


