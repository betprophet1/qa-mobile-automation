package page_objects.mobile;

import io.appium.java_client.MobileElement;
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

    @iOSXCUITFindBy(accessibility = "Profile \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Profile;

    @iOSXCUITFindBy(accessibility = "Account Statement \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Account_Statement;

    @iOSXCUITFindBy(accessibility = "Change Password \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Change_Password;

    @iOSXCUITFindBy(accessibility = "Betting Limits \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Betting_Limits;

    @iOSXCUITFindBy(accessibility = "Self-Exclusion \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Self_Exclusion;

    @iOSXCUITFindBy(accessibility = "Close My Account \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Close_My_Account;

    @iOSXCUITFindBy(accessibility = "Logout \uF105")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Log_Out;
}
