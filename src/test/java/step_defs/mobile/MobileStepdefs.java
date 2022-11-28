package step_defs.mobile;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.SoftAssertions;
import page_objects.mobile.*;

public class MobileStepdefs {

    @When("^I log in to iOS app$")
    public void iLogIntoIOSApp() throws InterruptedException {
        HomeScreen.INSTANCE().Allow_Button.click();
//        HomeScreen.INSTANCE().Allow_While_Using_App.click();
//        Thread.sleep(10000);
        HomeScreen.INSTANCE().Login_Button.click();
        LoginScreen.INSTANCE().Email_Textbox.sendKeys("quoc.la+1@betprophet.co");
//        LoginScreen.INSTANCE().Hide_Password_Icon.click();
        LoginScreen.INSTANCE().Password_Textbox.sendKeys("Betprophet@123");
        LoginScreen.INSTANCE().Continue_Button.click();
//        LoginScreen.INSTANCE().Continue_Button.click();
        Thread.sleep(5000);
        HomeScreen.INSTANCE().Allow_While_Using_App.click();
    }

    @When("I log in to Android app successfully")
    public void iLogInToAndroidApp() throws InterruptedException {
        HomeScreen.INSTANCE().Account_Tab.click();
        Thread.sleep(1000);
        AccountScreen.INSTANCE().Login_Button.click();
        LoginScreen.INSTANCE().Email_Textbox.sendKeys("quoc.la+1@betprophet.co");
//        LoginScreen.INSTANCE().Hide_Password_Icon.click();
        LoginScreen.INSTANCE().Password_Textbox.sendKeys("Betprophet@123");
        LoginScreen.INSTANCE().Continue_Button.click();
//        LoginScreen.INSTANCE().Continue_Button.click();
        Thread.sleep(5000);
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


    @When("place a request Moneyline bet on {string}")
    public void placeARequestMoneylineBetOn(String platform) {
        if (platform.equalsIgnoreCase("Android")) {
            AccountScreen.INSTANCE().Home_Tab.click();
        }
        HomeScreen.INSTANCE().View_All_Button.click();
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
}
