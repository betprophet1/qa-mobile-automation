package page_objects.mobile;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Config;
import utils.factory.DriverFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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

}
