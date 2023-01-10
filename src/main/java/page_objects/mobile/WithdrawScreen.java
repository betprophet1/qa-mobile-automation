package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.temporal.ChronoUnit;

public class WithdrawScreen extends BaseScreen {

    private WithdrawScreen() {
        initializePage(this);
    }

    public static WithdrawScreen INSTANCE() {
        return new WithdrawScreen();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='withdraw-amount-input']//android.widget.EditText")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Amount_Txb;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='onlinebanking']/parent::android.view.ViewGroup/android.widget.TextView[1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Current_Balance_Lbl;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='onlinebanking']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Online_Banking_Via_Trustly_Cxb;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='worldpay']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement CreditOrDebit_Cxb;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='wiretransfer']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Wire_Tranfer_Cxb;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='cash']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Cash_At_Counter_Cxb;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Withdraw']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Withdraw_Btn;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='trustly-widget']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Loading_Trustly;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='widgetSearchField']")
    @WithTimeout(time = 30, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Search_Bank_Txb;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='widgetBankOptions']/android.widget.Button[1]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement First_Bank_Result;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='slider-button']")
    @WithTimeout(time = 20, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Ok_Got_It_Btn;

    @AndroidFindBy(xpath = "//*[@resource-id='lbx-formAuthenticate-authFields-inputusername']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Username_Bank_Auth_Txb;

    @AndroidFindBy(xpath = "//*[@resource-id='lbx-formAuthenticate-authFields-inputpassword']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Password_Bank_Auth_Txb;

    @AndroidFindBy(xpath = "//*[@resource-id='lbx-formLogin-submit']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Agree_And_Sign_In_Bank_Btn;

    @AndroidFindBy(xpath = "//*[@resource-id='lbx-accountList-submit']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Continue_Btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Balance']/parent::android.view.ViewGroup/android.widget.TextView[2]")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Balance_Number;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Withdrawal Successful']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Withdraw_Successful_Lbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Withdraw Again']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Withdraw_Again_Btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Return Home']")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Returm_Home_Btn;


}
