package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11Pages {
    private AppiumDriver driver;
    public N11Pages(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver,this );
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.FrameLayout/android.widget.ImageView\n")
    private WebElement kategoriler;

    public void clickKategoriler(){
        kategoriler.click();
    }

}
