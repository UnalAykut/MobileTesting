package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class N11Pages extends BasePage{
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.FrameLayout/android.widget.ImageView\n")
    private WebElement kategoriButton;

    public N11Pages(AppiumDriver driver) {
        super( driver );
    }

    public void clickKategoriler() {
        kategoriButton.click();
    }



}
