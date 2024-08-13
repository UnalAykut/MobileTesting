package util;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.Reporter;


import java.io.IOException;
import java.util.Properties;

public class Hooks {
   private AppiumDriver driver;
   private Properties properties;
    @Before
    public void setUp() throws IOException {
        String browser= Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter( "browser" );
        properties=ConfigReader.initialize_Properties();
        driver=DriverFactory.initialize_Driver( browser );
    }
    @After
    public void quitDriver(){
        driver.quit();
    }
}
