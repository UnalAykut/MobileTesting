package pages.filtrele;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.DisplayNameEnum;

import java.util.List;

public class CepTelefonuFiltrelemeMarka extends AbstractFiltrelemePage<CepTelefonuFiltrelemeMarka.FilterOption> {


    public CepTelefonuFiltrelemeMarka(AppiumDriver driver) {
        super( driver );
    }
    public enum FilterOption implements DisplayNameEnum {
        SAMSUNG("Samsung"),
        APPLE("Apple"),
        XIAOMI("Xiaomi"),
        POCO("Poco"),
        OPPO("Oppo"),
        REALME("Realme"),
        OMIX("Omix"),
        TECNO("Tecno"),
        INFINIX("Infinix"),
        GENERAL_MOBILE("General Mobile"),
        REEDER("Reeder"),
        CASPER("Casper"),
        VIVO("Vivo"),
        OUKITEL("Oukitel"),
        HONOR("Honor"),
        NOTHING("Nothing"),
        TCL("Tcl"),
        HIKING("Hiking"),
        ONEPLUS("Oneplus");

        private String displayName;

        FilterOption(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String getDisplayName() {
            return displayName;
        }
    }

}
