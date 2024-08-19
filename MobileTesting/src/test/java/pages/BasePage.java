package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected AppiumDriver driver;
    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}

