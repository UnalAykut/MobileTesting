package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static AppiumDriver driver;
    private static Properties properties;
    private static DesiredCapabilities capabilities;
    public static AppiumDriver initialize_Driver(String browser) throws MalformedURLException {
        properties=ConfigReader.getProperties();
        capabilities=new DesiredCapabilities();
        if(browser.equals( "Android" )){
            capabilities.setCapability( "platformName","Android" );
            capabilities.setCapability( "udid","" );
            capabilities.setCapability( "appPAckage","" );
            capabilities.setCapability( "appActivity","" );
        }else if(browser.equals( "IOS" )){
            capabilities.setCapability( "platformName","IOS" );
            capabilities.setCapability( "udid","" );
            capabilities.setCapability( "appPAckage","" );
            capabilities.setCapability( "appActivity","" );
        }
        driver=new AppiumDriver( new URL( "https://0.0.0.0:4273/wd/hub"),capabilities);
        int impWait= Integer.parseInt( properties.getProperty( "implicityWait" ) );
        driver.manage().timeouts().implicitlyWait( impWait, TimeUnit.SECONDS);
        return getDriver();
    }
    public static AppiumDriver getDriver(){
        return driver;
    }

}
