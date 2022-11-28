package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class CommunicationPreferenceDetailScreen extends BaseScreen {

    private CommunicationPreferenceDetailScreen() {
        initializePage(this);
    }

    public static CommunicationPreferenceDetailScreen INSTANCE() {
        return new CommunicationPreferenceDetailScreen();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email notification every login')]")
    @iOSXCUITFindBy(accessibility = "Email notification every login")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Email_Notification_Every_Login;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Marketing Emails')]")
    @iOSXCUITFindBy(accessibility = "Marketing Emails")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Marketting_Email;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Save')]")
    @iOSXCUITFindBy(accessibility = "Marketing Emails")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Save_Button;
}
