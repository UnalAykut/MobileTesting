package test;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import pages.KategorilerPage;
import pages.N11Pages;
import util.DriverFactory;

public class BaseTest {
    protected AppiumDriver driver;
    protected KategorilerPage kategorilerPage;
    protected N11Pages n11Pages;
    @BeforeClass
    public void setUp(){
     driver = DriverFactory.getDriver();
     intializePages();
    }

    private void intializePages(){
        kategorilerPage = new KategorilerPage(driver);
        n11Pages = new N11Pages(driver);
    }
}
