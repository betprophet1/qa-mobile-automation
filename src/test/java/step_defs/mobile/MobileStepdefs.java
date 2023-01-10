package step_defs.mobile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.assertj.core.api.SoftAssertions;
import page_objects.mobile.*;
import utils.Config;
import utils.factory.DriverUtils;

import java.util.List;
import java.util.Map;

public class MobileStepdefs {

    @When("^I log in to iOS app$")
    public void iLogIntoIOSApp() throws InterruptedException {
        HomeScreen.INSTANCE().Allow_Button.click();
        HomeScreen.INSTANCE().Login_Button.click();
        LoginScreen.INSTANCE().Email_Textbox.sendKeys(Config.ENV.USERNAME());
        LoginScreen.INSTANCE().Password_Textbox.sendKeys(Config.ENV.PASSWORD());
        LoginScreen.INSTANCE().Continue_Button.click();
        Thread.sleep(5000);
        HomeScreen.INSTANCE().Allow_While_Using_App.click();
    }

    @When("I log in to Android app successfully")
    public void iLogInToAndroidApp() throws InterruptedException {
        HomeScreen.INSTANCE().Account_Tab.click();
        AccountScreen.INSTANCE().Login_Button.click();
        LoginScreen.INSTANCE().Email_Textbox.sendKeys(Config.ENV.USERNAME());
        LoginScreen.INSTANCE().Password_Textbox.sendKeys(Config.ENV.PASSWORD());
        LoginScreen.INSTANCE().Continue_Button.click();
        HomeScreen.INSTANCE().Allow_While_Using_App.click();
    }

    @And("go to Account tab")
    public void goToAccountTab() {
        HomeScreen.INSTANCE().Account_Tab.click();
    }

    @Then("verify user can view Profile successfully")
    public void verifyUserCanViewProfileSuccessfully() {
        SoftAssertions softly = new SoftAssertions();
        AccountScreen.INSTANCE().Profile.click();
        softly.assertThat(ProfileDetailScreen.INSTANCE().firstName.isDisplayed()).isTrue();
        softly.assertThat(ProfileDetailScreen.INSTANCE().lastName.isDisplayed()).isTrue();
        softly.assertThat(ProfileDetailScreen.INSTANCE().emailInfo.isDisplayed()).isTrue();
        softly.assertThat(ProfileDetailScreen.INSTANCE().dateOfBirth.isDisplayed()).isTrue();
        softly.assertThat(ProfileDetailScreen.INSTANCE().phoneNumber.isDisplayed()).isTrue();
        softly.assertThat(ProfileDetailScreen.INSTANCE().addressInfo.isDisplayed()).isTrue();
        softly.assertThat(ProfileDetailScreen.INSTANCE().cityInfo.isDisplayed()).isTrue();
        softly.assertThat(ProfileDetailScreen.INSTANCE().stateInfo.isDisplayed()).isTrue();
        softly.assertThat(ProfileDetailScreen.INSTANCE().zipCode.isDisplayed()).isTrue();
        softly.assertThat(ProfileDetailScreen.INSTANCE().countryInfo.isDisplayed()).isTrue();
    }

    @Then("verify user can view Account Statement successfully")
    public void verifyUserCanViewAccountStatementSuccessfully() {
        SoftAssertions softly = new SoftAssertions();
        AccountScreen.INSTANCE().Account_Statement.click();
        softly.assertThat(AccountStatementDetailScreen.INSTANCE().transactionType.isDisplayed()).isTrue();
        softly.assertThat(AccountStatementDetailScreen.INSTANCE().transactionPagination.isDisplayed()).isTrue();
    }


    @When("place a request Moneyline bet with")
    public void placeARequestMoneylineBetOn(DataTable data) {
        List<Map<String, String>> list = data.asMaps(String.class, String.class);
        String stake = list.get(0).get("Stake");
        String odds = list.get(0).get("Odds");
        HomeScreen.INSTANCE().First_Match.click();
        PlaceWagerScreen.INSTANCE().Close_Button.click();
        PlaceWagerScreen.INSTANCE().Request_Moneyline_Left_Level_1.click();
        PlaceWagerScreen.INSTANCE().Stake_Input.sendKeys(stake);
        PlaceWagerScreen.INSTANCE().Odds_Input.sendKeys(odds);
        PlaceWagerScreen.INSTANCE().Place_Bet_Button.click();
    }

    @And("place a request Spread bet with")
    public void placeARequestSpreadBetOnWith(String platform, DataTable data) {
        List<Map<String, String>> list = data.asMaps(String.class, String.class);
        String stake = list.get(0).get("Stake");
        String odds = list.get(0).get("Odds");
        HomeScreen.INSTANCE().First_Match.click();
        PlaceWagerScreen.INSTANCE().Close_Button.click();
        PlaceWagerScreen.INSTANCE().Request_Spread_Left_Level_1.click();
        PlaceWagerScreen.INSTANCE().Stake_Input.sendKeys(stake);
        PlaceWagerScreen.INSTANCE().Odds_Input.sendKeys(odds);
        PlaceWagerScreen.INSTANCE().Place_Bet_Button.click();
    }

    @And("place a request Total bet with")
    public void placeARequestTotalBetWith(DataTable data) {
        List<Map<String, String>> list = data.asMaps(String.class, String.class);
        String stake = list.get(0).get("Stake");
        String odds = list.get(0).get("Odds");
        HomeScreen.INSTANCE().swipeFromTopToBottom();
        HomeScreen.INSTANCE().First_Match.click();
        PlaceWagerScreen.INSTANCE().Close_Button.click();
        PlaceWagerScreen.INSTANCE().Request_Total_Left_Level_1.click();
        PlaceWagerScreen.INSTANCE().Stake_Input.sendKeys(stake);
        PlaceWagerScreen.INSTANCE().Odds_Input.sendKeys(odds);
        PlaceWagerScreen.INSTANCE().Place_Bet_Button.click();
    }

    @When("I log out to Android app successfully")
    public void iLogOutToAndroidAppSuccessfully() {
        AccountScreen.INSTANCE().swipeFromTopToBottom();
        AccountScreen.INSTANCE().Log_Out.click();
        AccountScreen.INSTANCE().Confirm_Button.click();
    }

    @Then("verify user can view Communication Preferences successfully")
    public void verifyUserCanViewCommunicationPreferencesSuccessfully() {
        SoftAssertions softly = new SoftAssertions();
        AccountScreen.INSTANCE().Communication_Preferences.click();
        softly.assertThat(CommunicationPreferenceDetailScreen.INSTANCE().Email_Notification_Every_Login.isDisplayed()).isTrue();
        softly.assertThat(CommunicationPreferenceDetailScreen.INSTANCE().Marketting_Email.isDisplayed()).isTrue();
        softly.assertThat(CommunicationPreferenceDetailScreen.INSTANCE().Save_Button.isDisplayed()).isTrue();
    }

    @Then("verify user can view Change Password successfully")
    public void verifyUserCanViewChangePasswordSuccessfully() {
        SoftAssertions softly = new SoftAssertions();
        AccountScreen.INSTANCE().Change_Password.click();
        ChangePasswordDetailScreen.INSTANCE().Change_Password_Button.click();
        softly.assertThat(ChangePasswordDetailScreen.INSTANCE().Old_Password_Texbox.isDisplayed()).isTrue();
        softly.assertThat(ChangePasswordDetailScreen.INSTANCE().New_Password_Texbox.isDisplayed()).isTrue();
        softly.assertThat(ChangePasswordDetailScreen.INSTANCE().Confirm_New_Password_Texbox.isDisplayed()).isTrue();
    }

    @Then("verify user can view Betting Limits successfully")
    public void verifyUserCanViewBettingLimitsSuccessfully() {
        SoftAssertions softly = new SoftAssertions();
        AccountScreen.INSTANCE().Betting_Limits.click();
        softly.assertThat(BettingLimitDetailScreen.INSTANCE().Daily_Deposit_Limit.isDisplayed()).isTrue();
        softly.assertThat(BettingLimitDetailScreen.INSTANCE().Weekly_Deposit_Limit.isDisplayed()).isTrue();
        softly.assertThat(BettingLimitDetailScreen.INSTANCE().Monthly_Deposit_Limit.isDisplayed()).isTrue();
    }

    @Then("verify user can view Cool Off successfully")
    public void verifyUserCanViewCoolOffSuccessfully() {
        SoftAssertions softly = new SoftAssertions();
        AccountScreen.INSTANCE().Cool_Off.click();
        softly.assertThat(CoolOffDetailScreen.INSTANCE().Cool_Me_Off_Button.isDisplayed()).isTrue();
    }

    @Then("verify user can view Self Exclusion successfully")
    public void verifyUserCanViewSelfExclusionSuccessfully() {
        SoftAssertions softly = new SoftAssertions();
        AccountScreen.INSTANCE().Self_Exclusion.click();
        softly.assertThat(SelfExclusionDetailScreen.INSTANCE().Self_Exclude_Button.isDisplayed()).isTrue();
    }

    @When("click Confirm place wager")
    public void clickConfirmPlaceWager() {
        PlaceWagerScreen.INSTANCE().Confirm_Button.click();
    }

    @When("click View ALl Bets")
    public void clickViewALlBets() {
        PlaceWagerScreen.INSTANCE().View_My_Bet_Button.click();
    }

    @Then("verify your bets displaying in Bet Tab with infomation")
    public void verifyYourBetsDisplayingInBetTabWithInfomation(DataTable data) {
        List<Map<String, String>> list = data.asMaps(String.class, String.class);
        SoftAssertions softly = new SoftAssertions();
        String stake = list.get(0).get("Stake");
        String odds = list.get(0).get("Odds");
        softly.assertThat(BetScreen.INSTANCE().Unmatch_Bet_Market_Stake_1.getText()).isEqualTo(stake);
        softly.assertThat(BetScreen.INSTANCE().Unmatch_Bet_Market_Stake_1.getText()).isEqualTo(odds);
    }

    @When("select Account tab")
    public void selectAccountTab() {
        HomeScreen.INSTANCE().Account_Tab.click();
    }

    @Then("verify withdraw money successfully with amount {string}")
    public void verifyWithdrawMoneySuccessfullyWithAmount(String amount) {
        AccountScreen.INSTANCE().Withdraw_Button.click();
        WithdrawScreen.INSTANCE().Amount_Txb.sendKeys(amount);
        WithdrawScreen.INSTANCE().Online_Banking_Via_Trustly_Cxb.click();
        WithdrawScreen.INSTANCE().Withdraw_Btn.click();
        WithdrawScreen.INSTANCE().Search_Bank_Txb.click();
        WithdrawScreen.INSTANCE().Search_Bank_Txb.sendKeys("DemoBank");
        WithdrawScreen.INSTANCE().First_Bank_Result.click();
        WithdrawScreen.INSTANCE().Ok_Got_It_Btn.click();
        WithdrawScreen.INSTANCE().Username_Bank_Auth_Txb.sendKeys("test");
        WithdrawScreen.INSTANCE().Password_Bank_Auth_Txb.sendKeys("test");
        WithdrawScreen.INSTANCE().Agree_And_Sign_In_Bank_Btn.click();
        WithdrawScreen.INSTANCE().Continue_Btn.click();
        WithdrawScreen.INSTANCE().Returm_Home_Btn.click();
    }

    @Then("verify deposit money successfully with amount {string}")
    public void verifyDepositMoneySuccessfullyWithAmount(String amount) {
        AccountScreen.INSTANCE().Deposit_Button.click();
        WithdrawScreen.INSTANCE().Amount_Txb.sendKeys(amount);
        WithdrawScreen.INSTANCE().Online_Banking_Via_Trustly_Cxb.click();
        WithdrawScreen.INSTANCE().Withdraw_Btn.click();
        WithdrawScreen.INSTANCE().Search_Bank_Txb.click();
        WithdrawScreen.INSTANCE().Search_Bank_Txb.sendKeys("DemoBank");
        WithdrawScreen.INSTANCE().First_Bank_Result.click();
        WithdrawScreen.INSTANCE().Ok_Got_It_Btn.click();
        WithdrawScreen.INSTANCE().Username_Bank_Auth_Txb.sendKeys("test");
        WithdrawScreen.INSTANCE().Password_Bank_Auth_Txb.sendKeys("test");
        WithdrawScreen.INSTANCE().Agree_And_Sign_In_Bank_Btn.click();
        WithdrawScreen.INSTANCE().Continue_Btn.click();
        WithdrawScreen.INSTANCE().Returm_Home_Btn.click();
    }
}
