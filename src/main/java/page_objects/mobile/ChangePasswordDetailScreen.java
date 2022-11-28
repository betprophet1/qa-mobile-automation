package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class ChangePasswordDetailScreen extends BaseScreen {

    private ChangePasswordDetailScreen() {
        initializePage(this);
    }

    public static ChangePasswordDetailScreen INSTANCE() {
        return new ChangePasswordDetailScreen();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Change password')]")
    @iOSXCUITFindBy(accessibility = "Change password")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Change_Password_Button;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Old Password')]")
    @iOSXCUITFindBy(accessibility = "Old Password")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Old_Password_Texbox;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'New Password')]")
    @iOSXCUITFindBy(accessibility = "New Password")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement New_Password_Texbox;


    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Confirm New Password')]")
    @iOSXCUITFindBy(accessibility = "Confirm New Password")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Confirm_New_Password_Texbox;
}
