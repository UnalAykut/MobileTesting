package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import util.ElementHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BasePage {
    protected AppiumDriver driver;
    protected static ElementHelper elementHelper;
    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        elementHelper=new ElementHelper( driver );
        PageFactory.initElements( driver, this );
    }

    public List<WebElement> getCategoryElements(List<WebElement> categoryList) {
        return categoryList;
    }
    public static Map<String, WebElement> initializeKategoriMap(List<WebElement> kategoriElements, String textViewXPath) {
        Map<String, WebElement> kategoriMap = new HashMap<>();
        System.out.println("Kategori eleman sayısı: " + kategoriElements.size());
        for (WebElement element : kategoriElements) {
            WebElement textElement = element.findElement( By.xpath(textViewXPath));
            System.out.println("Text Element: " + textElement);
            if (textElement != null) {
                String categoryText = textElement.getText().trim();
                System.out.println("Kategori metni: " + categoryText);
                kategoriMap.put(categoryText.toLowerCase(), element);
            } else {
                System.out.println("Text element bulunamadı.");
            }
        }
        return kategoriMap;
    }

    public static void clickOnCategory(Map<String, WebElement> kategoriMap, KategorilerPage.Kategori kategori, String textViewXPath) {
        String categoryName = kategori.getDisplayName().toLowerCase().trim();
        WebElement categoryElement = kategoriMap.get(categoryName);
        if (categoryElement != null) {
            WebElement textElement = categoryElement.findElement(By.xpath(textViewXPath));
            System.out.println("Aranan category element=>" + textElement.getText());
            elementHelper.clickElement(textElement);
        } else {
            System.out.println("Kategori bulunamadı: " + kategori.getDisplayName());
        }
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


