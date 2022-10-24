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
        HomeScreen.INSTANCE().Login_Button.click();
        LoginScreen.INSTANCE().Email_Textbox.sendKeys("quoc.la+1@betprophet.co");
//        LoginScreen.INSTANCE().Hide_Password_Icon.click();
        LoginScreen.INSTANCE().Password_Textbox.sendKeys("Betprophet@123");
        LoginScreen.INSTANCE().Continue_Button.click();
        LoginScreen.INSTANCE().Continue_Button.click();
        Thread.sleep(5000);
    }

    @When("I log in to Android app")
    public void iLogInToAndroidApp() {
        HomeScreen.INSTANCE().Update_Button.click();
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
        AccountScreen.INSTANCE().Profile.click();
        softly.assertThat(AccountStatementDetailScreen.INSTANCE().transactionType.isDisplayed()).isTrue();
        softly.assertThat(AccountStatementDetailScreen.INSTANCE().transactionPagination.isDisplayed()).isTrue();
    }
}
