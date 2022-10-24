package page_objects.mobile;

import io.appium.java_client.MobileElement;
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

    @iOSXCUITFindBy(accessibility = "First Name")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement firstName;

    @iOSXCUITFindBy(accessibility = "Last Name")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement lastName;

    @iOSXCUITFindBy(accessibility = "Email")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement emailInfo;

    @iOSXCUITFindBy(accessibility = "Date of Birth")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement dateOfBirth;

    @iOSXCUITFindBy(accessibility = "Phone Number")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement phoneNumber;

    @iOSXCUITFindBy(accessibility = "Address")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement addressInfo;

    @iOSXCUITFindBy(accessibility = "City")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement cityInfo;

    @iOSXCUITFindBy(accessibility = "State")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement stateInfo;

    @iOSXCUITFindBy(accessibility = "Zip Code")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement zipCode;

    @iOSXCUITFindBy(accessibility = "Country")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement countryInfo;


}
