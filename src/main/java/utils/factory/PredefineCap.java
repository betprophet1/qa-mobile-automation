package utils.factory;

import org.openqa.selenium.remote.DesiredCapabilities;

public class PredefineCap {

    public static final DesiredCapabilities DESKTOP_WEB = new DesiredCapabilities() {
        {
            setBrowserName("Chrome");
        }
    };

    public static final DesiredCapabilities IOS = new DesiredCapabilities() {
        {
            setCapability("automationName", "XCUITest");
            setCapability("platformName", "iOS");
            setCapability("bundleId", "com.prophetexchange.staging");
            setCapability("platformVersion", "15.5");
            setCapability("deviceName", "iPhone 13 Pro");
        }
    };

    public static final DesiredCapabilities ANDROID = new DesiredCapabilities() {
        {
            setCapability("platformName", "Android");
            setCapability("platformVersion", "11.0");
            setCapability("deviceName", "emulator-5554");
            setCapability("appPackage", "com.prophetexchange.staging");
            setCapability("appActivity", "com.prophetexchange.MainActivity");
        }
    };

    public static final DesiredCapabilities BS_ANDROID = new DesiredCapabilities() {
        {
            setCapability("browserstack.appium_version", "1.21.0");
            setCapability("automationName", "UiAutomator2");
            setCapability("device", "Samsung Galaxy S22 Ultra");
            setCapability("project", "Prophet Test Android");
            setCapability("build", "Prophet Android Testing");
            setCapability("browserstack.idleTimeout", "300");
            setCapability("os_version", "12.0");
            setCapability("app","bs://7d20a678bc53bb96245901c484eb5a54f57ce5b3");
            setCapability("autoDismissAlerts", "true");
        }
    };

    public static final DesiredCapabilities BS_IOS = new DesiredCapabilities() {
        {
            setCapability("browserstack.appium_version", "1.21.0");
            setCapability("automationName", "XCUITest");
            setCapability("build", "Prophet iOS Testing");
            setCapability("device", "iPhone 13 Pro Max");
            setCapability("project", "Prophet");
            setCapability("browserstack.idleTimeout", "300");
            setCapability("os_version", "15");
            setCapability("app", "bs://69b362bf4dce9d2d088bed3f1f6c623dc5172f95");
        }
    };

    public static final DesiredCapabilities LD_IOS = new DesiredCapabilities() {
        {
            setCapability("deviceName", "iPhone 13 Pro Max");
            setCapability("platformVersion", "15.0");
            setCapability("platformName", "iOS");
            setCapability("isRealMobile", true);
            setCapability("app", "lt://APP10160532421664803924871883"); //Enter your app url
            setCapability("deviceOrientation", "PORTRAIT");
            setCapability("build", "Test");
            setCapability("name", "Test");
            setCapability("console", true);
            setCapability("network", false);
            setCapability("visual", true);
            setCapability("devicelog", true);
        }
    };
}
