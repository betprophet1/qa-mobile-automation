package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class AccountScreen extends BaseScreen {

    private AccountScreen() {
        initializePage(this);
    }

    public static AccountScreen INSTANCE() {
        return new AccountScreen();
    }

    @iOSXCUITFindBy(accessibility = "(//XCUIElementTypeStaticText[@name=\"$ 0.00\"])[1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Balance;

    @iOSXCUITFindBy(accessibility = "(//XCUIElementTypeStaticText[@name=\"$ 0.00\"])[2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Cash;

    @iOSXCUITFindBy(accessibility = "(//XCUIElementTypeStaticText[@name=\"$ 0.00\"])[3]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Promotional;

    @iOSXCUITFindBy(accessibility = "Withdraw")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Withdraw_Button;

    @iOSXCUITFindBy(accessibility = "Deposit")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Deposit_Button;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Profile')]")
    @iOSXCUITFindBy(accessibility = "Profile \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Profile;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Account Statement')]")
    @iOSXCUITFindBy(accessibility = "Account Statement \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Account_Statement;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Communication Preferences')]")
    @iOSXCUITFindBy(accessibility = "Communication Preferences \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Communication_Preferences;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Change Password')]")
    @iOSXCUITFindBy(accessibility = "Change Password \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Change_Password;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Betting Limits')]")
    @iOSXCUITFindBy(accessibility = "Betting Limits \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Betting_Limits;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Cool-Off')]")
    @iOSXCUITFindBy(accessibility = "Cool-Off \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Cool_Off;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Self-Exclusion')]")
    @iOSXCUITFindBy(accessibility = "Self-Exclusion \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Self_Exclusion;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Self-Exclusion')]")
    @iOSXCUITFindBy(accessibility = "Close My Account \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Close_My_Account;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Logout')]")
    @iOSXCUITFindBy(accessibility = "Logout \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Log_Out;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Confirm')]")
    @iOSXCUITFindBy(accessibility = "Confirm \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Confirm_Button;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Login')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Login_Button;

    //android.widget.TextView[contains(@text,'󰅁')]
}
