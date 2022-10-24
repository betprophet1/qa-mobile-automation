package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utils.factory.DriverFactory;

import java.time.temporal.ChronoUnit;

public class HomeScreen extends BaseScreen {
    private HomeScreen() {
        initializePage(this);
    }

    public static HomeScreen INSTANCE() {
        return new HomeScreen();
    }

    @iOSXCUITFindBy(accessibility = "Allow")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Allow_Button;

    @iOSXCUITFindBy(accessibility = "Allow While Using App")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Allow_While_Using_App;

    @iOSXCUITFindBy(accessibility = "Keep Only While Using")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Keep_Only_While_Using;

    @iOSXCUITFindBy(accessibility = "Login \uF456")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Login_Button;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[contains(@text,'Update')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Update_Button;

    @iOSXCUITFindBy(accessibility = "Sports")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Sport_Tab;

    @iOSXCUITFindBy(accessibility = "Bets")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Bets_Tab;

    @iOSXCUITFindBy(accessibility = "Home")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Home_Tab;

    @iOSXCUITFindBy(accessibility = "Account")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Account_Tab;

}
