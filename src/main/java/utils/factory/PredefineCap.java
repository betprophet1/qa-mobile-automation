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
            setCapability("bundleId", "");
            setCapability("platformVersion", "15.5");
            setCapability("deviceName", "iPhone 13 Pro Max");
        }
    };

    public static final DesiredCapabilities BS_ANDROID = new DesiredCapabilities() {
        {
            setCapability("browserstack.appium_version", "1.21.0");
            setCapability("automationName", "UiAutomator2");
            setCapability("device", "Samsung Galaxy S22 Ultra");
            setCapability("project", "Test");
            setCapability("build", "Android Integration Test");
            setCapability("browserstack.idleTimeout", "300");
            setCapability("os_version", "12.0");
            setCapability("app","bs://a82b6b6b66e983ec9e87243fb6a00bd8fea85d0a");
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
            setCapability("app", "bs://1af1d06d47e2917b94e3120f7fb3cf91ac457895");
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
