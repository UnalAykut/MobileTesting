package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;
import java.util.*;

public abstract class BasePage {
    protected static AppiumDriver driver;
    protected static ElementHelper elementHelper;
    protected String categoryTextXPath = ".//android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryItem']";
    protected Map<String, WebElement> kategoriMap = new HashMap<>();
    private static int clickCounter = 0;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        PageFactory.initElements(driver, this);
    }
    public List<WebElement> getCategoryElements(List<WebElement> categoryList) {
        return categoryList;
    }

    public <T extends Enum<T> & DisplayNameEnum> Map<String, WebElement> loadCategories(List<WebElement> kategoriElements, String categoryTextXPath, Class<T> enumClass) {
        int expectedCategoryCount = enumClass.getEnumConstants().length;
        return initializeKategoriMap(kategoriElements, categoryTextXPath, expectedCategoryCount);
    }

    public Map<String, WebElement> initializeKategoriMap(List<WebElement> kategoriElements, String textViewXPath, int expectedCategoryCount) {
        Map<String, WebElement> kategoriMap = new HashMap<>();
        int previousSize = 0;

        while (kategoriMap.size() < expectedCategoryCount) {
            updateKategoriMap(kategoriMap, kategoriElements, textViewXPath);

            if (kategoriMap.size() == expectedCategoryCount) {
                break;
            }

            if (kategoriElements.size() > previousSize) {
                previousSize = kategoriElements.size();
                scrollDown();
            } else {
                break;
            }
        }

        return kategoriMap;
    }

    private void updateKategoriMap(Map<String, WebElement> kategoriMap, List<WebElement> kategoriElements, String textViewXPath) {
        for (WebElement element : kategoriElements) {
            WebElement textElement = element.findElement(By.xpath(textViewXPath));
            if (textElement != null) {
                String categoryText = textElement.getText().trim().toLowerCase();
                if (!kategoriMap.containsKey(categoryText)) {
                    kategoriMap.put(categoryText, element);
                    System.out.println("Kategori metni eklendi: " + categoryText);
                }
            } else {
                System.out.println("Text element bulunamadı.");
            }
        }
    }

    public static <T extends Enum<T> & DisplayNameEnum> void clickOnCategory(Map<String, WebElement> kategoriMap, T kategori, String textViewXPath) {
        clickCounter++;
        String categoryName = kategori.getDisplayName().trim().toLowerCase();
        WebElement categoryElement = kategoriMap.get(categoryName);

        if (categoryElement == null) {
            categoryElement = scrollToCategory(categoryName, kategoriMap, textViewXPath);
        }

        if (categoryElement != null) {
            clickAndValidateCategory(categoryElement, kategori, textViewXPath);
        } else {
            handleCategoryNotFound(kategori);
        }
    }

    private static <T extends Enum<T> & DisplayNameEnum> void clickAndValidateCategory(WebElement categoryElement, T kategori, String textViewXPath) {
        WebElement textElement = categoryElement.findElement(By.xpath(textViewXPath));
        elementHelper.clickElement(textElement);

        if (clickCounter <= 2) {
            validateCategorySelection(kategori);
        } else {
            System.out.println("2. tıklamadan sonra metin kontrolü yapılmadı.");
            clickCounter=0;
        }
    }

    private static <T extends Enum<T> & DisplayNameEnum> void validateCategorySelection(T kategori) {
        WebElement textViewElement = elementHelper.waitForVisibility(
                driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryTitle']"))
        );
        String expectedTextViewText = kategori.getDisplayName();
        String actualTextViewText = textViewElement.getText();

        try {
            Assert.assertEquals(actualTextViewText, expectedTextViewText, "TextView'de beklenen metin bulunamadı!");
            System.out.println("Metinler eşleşti => ActualData: " + actualTextViewText + " ExpectedData: " + expectedTextViewText);
            System.out.println("Tıklama işlemi başarılı");
        } catch (AssertionError e) {
            System.err.println("TextView'de beklenen metin bulunamadı! Beklenen: " + expectedTextViewText + ", Gerçek: " + actualTextViewText);
            throw e;
        }
    }

    private static <T extends Enum<T> & DisplayNameEnum> void validateCategoryPopUpSelection(T kategori) {
        WebElement textViewElement = elementHelper.waitForVisibility(
                driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tvCategoryTitle']"))
        );
        String expectedTextViewText = kategori.getDisplayName(); // Beklenen metin alınır.
        String actualTextViewText = textViewElement.getText(); // Gerçek metin alınır.

        try {
            Assert.assertEquals(actualTextViewText, expectedTextViewText, "TextView'de beklenen metin bulunamadı!"); // Metinler karşılaştırılır.
            System.out.println("Metinler eşleşti => ActualData: " + actualTextViewText + " ExpectedData: " + expectedTextViewText);
            System.out.println("Tıklama işlemi başarılı");
        } catch (AssertionError e) {
            System.err.println("TextView'de beklenen metin bulunamadı! Beklenen: " + expectedTextViewText + ", Gerçek: " + actualTextViewText);
            throw e; // Hata fırlatılır.
        }
    }

    private static <T extends Enum<T> & DisplayNameEnum> void handleCategoryNotFound(T kategori) {
        System.out.println("Kategori bulunamadı: " + kategori.getDisplayName());
        System.out.println("Enum değerlerini kontrol edin!!");
        System.out.println("Mobil uygulamadaki isimleri kontrol edin!!");
        System.out.println("XPath'leri kontrol edin!!");
    }

    private static WebElement scrollToCategory(String categoryName, Map<String, WebElement> kategoriMap, String textViewXPath) {
        while (!kategoriMap.containsKey(categoryName)) {
            scrollDown();
            for (Map.Entry<String, WebElement> entry : kategoriMap.entrySet()) {
                WebElement element = entry.getValue();
                WebElement textElement = element.findElement(By.xpath(textViewXPath));
                if (textElement.getText().trim().equalsIgnoreCase(categoryName)) {
                    return element;
                }
            }
        }
        return kategoriMap.get(categoryName);
    }

    public static void scrollDown() {
        int startX = driver.manage().window().getSize().width / 2;
        int startY = (int) (driver.manage().window().getSize().height * 0.8);
        int endY = (int) (driver.manage().window().getSize().height * 0.2);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(swipe));
    }
}
