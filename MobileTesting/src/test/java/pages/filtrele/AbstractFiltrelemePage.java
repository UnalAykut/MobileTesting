package pages.filtrele;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.DisplayNameEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractFiltrelemePage<T extends Enum<T> & DisplayNameEnum> extends BasePage {

    @FindBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat[.//android.widget.TextView[@resource-id='com.dmall.mfandroid:id/nameTV'] and .//android.widget.CheckBox[@resource-id='com.dmall.mfandroid:id/selectionStatusCB']]")
    private List<WebElement> checkBoxAndTextView; // TextView ve CheckBox içeren öğelerin listesi

    protected String selectBoxPath = "//android.widget.TextView[@resource-id='com.dmall.mfandroid:id/nameTV']"; // Markanın TextView'ının XPath'i
    protected String filterTextXPath = "//android.widget.CheckBox[@resource-id='com.dmall.mfandroid:id/selectionStatusCB']"; // CheckBox'ın XPath'i
    protected Map<String, WebElement> kategoriMap = new HashMap<>(); // Filtrelenen öğeleri saklamak için Map

    // Constructor, BasePage'den gelen driver'ı alır
    public AbstractFiltrelemePage(AppiumDriver driver) {
        super(driver);
    }

    // Filtre metinlerini ve CheckBox öğelerini map'e eklemek için kullanılan metod
    private void updateKategoriMap(Map<String, WebElement> kategoriMap, List<WebElement> checkBoxAndTextView, String filterTextXPath) {
        System.out.println("-------------------Filtre Metinleri Ekleniyor---------------------");
        for (WebElement element : checkBoxAndTextView) {
            WebElement textElement = element.findElement(By.xpath(filterTextXPath));
            if (textElement != null) {
                String filterText = textElement.getText().trim().toLowerCase();
                if (!kategoriMap.containsKey(filterText)) {
                    kategoriMap.put(filterText, element);
                    System.out.println("Filtre metni eklendi: " + filterText);
                } else {
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("Text element bulunamadı.");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            }
        }
        System.out.println("----------------------------------------");
    }

    // Belirli bir filtreyi seçmek için kullanılan metod
    public void selectFilter(T filterEnum) {
        // Filtre map'ini güncelle
        updateKategoriMap(kategoriMap, checkBoxAndTextView, selectBoxPath);

        // Seçilen filtreyi map'ten bul ve seç
        WebElement filterElement = kategoriMap.get(filterEnum.getDisplayName().toLowerCase());
        if (filterElement != null) {
            WebElement checkBox = filterElement.findElement(By.xpath(filterTextXPath));
            if (!checkBox.isSelected()) {
                checkBox.click();
            }
        } else {
            System.out.println("Filtre seçeneği bulunamadı: " + filterEnum.getDisplayName());
        }
    }

    // Belirtilen filtre seçeneğini bulup tıklamak için genel metod
    public void selectFilterOption(T option) {
        WebElement filterElement = scrollToFilterOption(option);
        if (filterElement != null) {
            filterElement.click();
        } else {
            System.out.println("Filtre seçeneği bulunamadı: " + option.getDisplayName());
        }
    }

    // Belirtilen filtre seçeneğiyle filtreleme yapmak için genel metod
    public void filterByOption(T option) {
        // Markayı seç
        selectFilterOption(option);

        // Seçilen markayı bul ve checkbox'ı işaretle
        WebElement selectedBrand = driver.findElement(By.xpath(filterTextXPath + option.getDisplayName() + "']"));
        WebElement checkBox = selectedBrand.findElement(By.xpath(selectBoxPath));
        if (!checkBox.isSelected()) {
            checkBox.click();
        }

        // "Uygula" butonuna bas
        WebElement applyButton = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.dmall.mfandroid:id/tv_name' and @text='Uygula']"));
        applyButton.click();
    }

    // Filtre seçeneğini bulmak için kaydırma işlemi yapan metod
    private WebElement scrollToFilterOption(T option) {
        List<WebElement> filterOptions = getFilterOptions();
        for (WebElement filter : filterOptions) {
            if (filter.getText().toLowerCase().equalsIgnoreCase(option.getDisplayName())) {
                return filter;
            }
        }

        // Kaydırma işlemi gerçekleştir
        int maxScrollAttempts = 5;  // Belirli sayıda kaydırma işlemi yapabilir
        int scrollAttempt = 0;
        while (scrollAttempt < maxScrollAttempts) {
            scrollDown();
            filterOptions = getFilterOptions();
            for (WebElement filter : filterOptions) {
                if (filter.getText().equalsIgnoreCase(option.getDisplayName())) {
                    return filter;
                }
            }
            scrollAttempt++;
        }
        return null;
    }

    // Sayfadaki tüm filtre seçeneklerini bulur ve döndürür
    private List<WebElement> getFilterOptions() {
        return driver.findElements(By.xpath("//android.widget.TextView"));
    }
}
