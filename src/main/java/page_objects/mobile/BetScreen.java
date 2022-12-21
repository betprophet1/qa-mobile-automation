package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

import java.time.temporal.ChronoUnit;

public class BetScreen extends BaseScreen {

    private BetScreen() {
        initializePage(this);
    }

    public static BetScreen INSTANCE() {
        return new BetScreen();
    }

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'unmatched-1')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Unmatch_Bet_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'unmatched-1')]/android.widget.TextView[1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Unmatch_Bet_Market_Name_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'unmatched-1')]/android.widget.TextView[2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Unmatch_Bet_Market_Stake_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'unmatched-1')]/android.widget.TextView[3]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Unmatch_Bet_Market_Odd_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'unmatched-1')]/android.widget.TextView[4]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Unmatch_Bet_To_Win_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'unmatched-1')]//*[starts-with(@resource-id,'icon')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Cancel_Unmatch_Bet_1;

}
