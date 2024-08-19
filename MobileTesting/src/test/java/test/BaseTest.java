package test;

import com.google.common.io.BaseEncoding;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasePage;
import pages.KategorilerPage;
import pages.N11Pages;
import util.DriverFactory;
import util.ElementHelper;
import util.Hooks;

import java.net.MalformedURLException;

public class BaseTest {
    protected AppiumDriver driver;
    protected KategorilerPage kategorilerPage;
    protected N11Pages n11Pages;

    protected ElementHelper elementHelper;
    private Hooks hooks;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.out.println("setUp() metodu çalışıyor");
        this.driver = DriverFactory.initializeDriver( "Android","emulator-5554","com.dmall.mfandroid","com.dmall.mfandroid.activity.base.SplashActivity" );
        if (this.driver == null) {
            throw new RuntimeException("Driver başlatılamadı, driver null!");
        }
        intializePages();
    }

    private void intializePages(){
        kategorilerPage = new KategorilerPage(driver);
        n11Pages = new N11Pages(driver);
        elementHelper= new ElementHelper(driver);
    }
    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
