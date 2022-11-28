package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class BettingLimitDetailScreen extends BaseScreen {

    private BettingLimitDetailScreen() {
        initializePage(this);
    }

    public static BettingLimitDetailScreen INSTANCE() {
        return new BettingLimitDetailScreen();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Daily Deposit Limit')]")
    @iOSXCUITFindBy(accessibility = "Daily Deposit Limit")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Daily_Deposit_Limit;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Weekly Deposit Limit')]")
    @iOSXCUITFindBy(accessibility = "Weekly Deposit Limit")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Weekly_Deposit_Limit;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Monthly Deposit Limit')]")
    @iOSXCUITFindBy(accessibility = "Monthly Deposit Limit")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Monthly_Deposit_Limit;
}
