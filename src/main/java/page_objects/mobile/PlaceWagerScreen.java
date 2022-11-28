package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class PlaceWagerScreen extends BaseScreen {

    private PlaceWagerScreen() {
        initializePage(this);
    }

    public static PlaceWagerScreen INSTANCE() {
        return new PlaceWagerScreen();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Continue')]")
    @iOSXCUITFindBy(accessibility = "Close")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Close_Button;

}
