package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this );
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


