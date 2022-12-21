package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class PlaceWagerScreen extends BaseScreen {

    private PlaceWagerScreen() {
        initializePage(this);
    }

    public static PlaceWagerScreen INSTANCE() {
        return new PlaceWagerScreen();
    }

    @AndroidFindBy(id = "iconIcon")
    @iOSXCUITFindBy(id = "Close")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Close_Button;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'moneyline')]//*[contains(@resource-id,'moneyline-0')][1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Moneyline_Left_Level_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'moneyline')]//*[contains(@resource-id,'moneyline-0')][2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Moneyline_Right_Level_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'moneyline')]//*[contains(@resource-id,'moneyline-1')][1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Moneyline_Left_Level_2;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'moneyline')]//*[contains(@resource-id,'moneyline-1')][2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Moneyline_Right_Level_2;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'spread')]//*[contains(@resource-id,'spread-0')][1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Spread_Left_Level_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'spread')]//*[contains(@resource-id,'spread-0')][2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Spread_Right_Level_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'spread')]//*[contains(@resource-id,'spread-1')][1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Spread_Left_Level_2;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'spread')]//*[contains(@resource-id,'spread-1')][2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Spread_Right_Level_2;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'total')]//*[contains(@resource-id,'total-0')][1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Total_Left_Level_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'total')]//*[contains(@resource-id,'total-0')][2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Total_Right_Level_1;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'total')]//*[contains(@resource-id,'total-1')][1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Total_Left_Level_2;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'total')]//*[contains(@resource-id,'total-1')][2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Request_Total_Right_Level_2;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'stake')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Stake_Input;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'number')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Odds_Input;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'to-win')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement To_Win_Label;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'place-bet-screen')]//*[starts-with(@resource-id,'place-bet')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Place_Bet_Button;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'confirm')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Confirm_Button;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'edit')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Edit_Button;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'view-my-bets')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement View_My_Bet_Button;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'event-type')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Event_Type;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'event-name')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Event_Name;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'event-status')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Event_Status;

    @AndroidFindBy(xpath = "//*[starts-with(@resource-id,'event-note')]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Event_Note;
}
