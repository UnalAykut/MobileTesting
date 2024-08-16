package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import util.DriverFactory;

public abstract class BasePage {
    protected AppiumDriver driver;
    public BasePage() {
        this.driver= DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }
}

