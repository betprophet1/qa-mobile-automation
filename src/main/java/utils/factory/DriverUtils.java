package utils.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DriverUtils {

    private final static Logger LOGGER = LogManager.getLogger("DriverUtil");

    public static void waitForAWhile(long timeToWait, String reason) {
        try {
            LOGGER.info(String.format("Wait %d second(s) %s", timeToWait, reason));
            int numberOfBreak = (int) Math.floor(timeToWait / 60);
            int restTime = (int) (timeToWait % 60);
            for (int i = 1; i <= numberOfBreak; i++) {
                Thread.sleep(60 * 1000);
                if (DriverFactory.isWebDriverRun) {
                    DriverFactory.getWebDriver().getCurrentUrl();
                }
                if (DriverFactory.isAndroidRun) {
                    DriverFactory.getAndroidDriver().getSessionId();
                }
                if (DriverFactory.isIOSRun) {
                    DriverFactory.getIOSDriver().getSessionId();
                }
            }
            Thread.sleep(restTime * 1000);
        } catch (Exception e) {
            LOGGER.error(String.format("Unable to wait %s(s)", timeToWait));
        }
    }
}
