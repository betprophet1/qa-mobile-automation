package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class LoginScreen extends BaseScreen {

    private LoginScreen() {
        initializePage(this);
    }

    public static LoginScreen INSTANCE() {
        return new LoginScreen();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Email Address')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Email Address\"])[6]/XCUIElementTypeTextField")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Email_Textbox;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Password')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Password\"])[2]/XCUIElementTypeSecureTextField")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Password_Textbox;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"\uF070\"])[1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Hide_Password_Icon;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Continue')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Continue\"])[2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Continue_Button;
}
