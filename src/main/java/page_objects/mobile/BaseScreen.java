package page_objects.mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import utils.Config;
import utils.factory.DriverFactory;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static utils.Config.LOGGER;

public class BaseScreen {

    public static List<Object> Screen_List = new ArrayList<>();

    static <T> T initializePage(T page) {
        if (DriverFactory.isAndroidRun) {
            PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.getAndroidDriver(), Duration.ofSeconds(Config.ENV.TIME_OUTS())), page);
        }
        if (DriverFactory.isIOSRun) {
            PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.getIOSDriver(), Duration.ofSeconds(Config.ENV.TIME_OUTS())), page);
        }
        Screen_List.add(page);
        return page;
    }

    public static void dismissScreens() {
        LOGGER.info("Dismissing page instances");
        Screen_List.forEach(x->{
            x = null;
        } );
        Screen_List.clear();
    }

    @iOSXCUITFindBy(accessibility = "Sports")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Sport_Tab;

    @iOSXCUITFindBy(accessibility = "Bets")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Bets_Tab;

    @iOSXCUITFindBy(accessibility = "Home")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Home_Tab;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Account')]")
    @iOSXCUITFindBy(accessibility = "Account")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Account_Tab;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'\uDB80\uDD41')]")
    @iOSXCUITFindBy(accessibility = "Account")
    @WithTimeout(time = 10, chronoUnit = ChronoUnit.SECONDS)
    public MobileElement Back_Button;

    public void swipeFromTopToBottom(){
        Dimension size = DriverFactory.getCurrentAppiumDriver().manage().window().getSize();
        int x = size.getWidth() / 2;
        int starty = (int) (size.getHeight() * 0.60);
        int endy = (int) (size.getHeight() * 0.10);
        new TouchAction(DriverFactory.getCurrentAppiumDriver()).press(PointOption.point(x, starty)).waitAction(waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(x, endy)).release().perform();
    }

}
