package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class SelfExclusionDetailScreen extends BaseScreen {

    private SelfExclusionDetailScreen() {
        initializePage(this);
    }

    public static SelfExclusionDetailScreen INSTANCE() {
        return new SelfExclusionDetailScreen();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Self Exclude')]")
    @iOSXCUITFindBy(accessibility = "Daily Deposit Limit")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Self_Exclude_Button;

}
