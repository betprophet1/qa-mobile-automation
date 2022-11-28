package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class ProfileDetailScreen extends BaseScreen{

    private ProfileDetailScreen() {
        initializePage(this);
    }

    public static ProfileDetailScreen INSTANCE() {
        return new ProfileDetailScreen();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'First Name')]")
    @iOSXCUITFindBy(accessibility = "First Name")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement firstName;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Last Name')]")
    @iOSXCUITFindBy(accessibility = "Last Name")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement lastName;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email')]")
    @iOSXCUITFindBy(accessibility = "Email")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement emailInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Date of Birth')]")
    @iOSXCUITFindBy(accessibility = "Date of Birth")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement dateOfBirth;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Phone Number')]")
    @iOSXCUITFindBy(accessibility = "Phone Number")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement phoneNumber;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Address')]")
    @iOSXCUITFindBy(accessibility = "Address")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement addressInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'City')]")
    @iOSXCUITFindBy(accessibility = "City")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement cityInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'State')]")
    @iOSXCUITFindBy(accessibility = "State")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement stateInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Zip Code')]")
    @iOSXCUITFindBy(accessibility = "Zip Code")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement zipCode;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Country')]")
    @iOSXCUITFindBy(accessibility = "Country")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement countryInfo;


}
