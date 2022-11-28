package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class CoolOffDetailScreen extends BaseScreen {

    private CoolOffDetailScreen() {
        initializePage(this);
    }

    public static CoolOffDetailScreen INSTANCE() {
        return new CoolOffDetailScreen();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Cool Me Off')]")
    @iOSXCUITFindBy(accessibility = "Cool Me Off")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Cool_Me_Off_Button;
}
