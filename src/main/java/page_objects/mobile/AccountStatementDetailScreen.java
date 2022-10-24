package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class AccountStatementDetailScreen extends BaseScreen{

    private AccountStatementDetailScreen() {
        initializePage(this);
    }

    public static AccountStatementDetailScreen INSTANCE() {
        return new AccountStatementDetailScreen();
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"ios_touchable_wrapper\"])[1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement transactionType;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"ios_touchable_wrapper\"])[2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement transactionPagination;
}
