package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import util.ElementHelper;

import java.util.List;

public abstract class BasePage {
    protected AppiumDriver driver;
    protected ElementHelper elementHelper;
    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        elementHelper=new ElementHelper( driver );
        PageFactory.initElements( driver, this );
    }

    public List<WebElement> getCategoryElements(List<WebElement> categoryList) {
        return categoryList;
    }
    /*public void clickOnCategory(List<WebElement> categoryList, String categoryName) {
        for (WebElement element : categoryList) {
            elementHelper.waitForVisibility(element);
            if (element.getText().equalsIgnoreCase(categoryName)){
                elementHelper.clickElement(element);
                break; // Kategori bulundu ve tıklandı, döngüden çık
           }
        }
        }
*/

}


