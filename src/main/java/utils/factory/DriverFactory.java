package utils.factory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Config;
import utils.Platforms;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;


public class DriverFactory {

    private final static Logger LOGGER = LogManager.getLogger(DriverFactory.class);
    private static final String BS_URL = "https://quocla_THUndl:5ent6jtKrEwiQqwDVJ3T@hub-cloud.browserstack.com/wd/hub";
    private static final String LD_URL = "https://lquoc:WNiUOBTx3G56oIgvpNh0DhL3fC2jzwZkjve0dXbRMVvb3YHwJG@mobile-hub.lambdatest.com/wd/hub";
    private static WebDriver webDriver = null;
    private static AndroidDriver androidDriver = null;
    private static IOSDriver iosDriver = null;
    private static AppiumDriverLocalService service = null;
    private static AppiumServiceBuilder builder;
    public static boolean isWebDriverRun = false;
    public static boolean isIOSRun = false;
    public static boolean isAndroidRun = false;

    private static HashMap<Platforms, DesiredCapabilities> _capabilitiesHashmap = new HashMap<Platforms, DesiredCapabilities>() {
        {
            put(Platforms.BS_ANDROID, PredefineCap.BS_ANDROID);
            put(Platforms.BS_IOS, PredefineCap.BS_IOS);
            put(Platforms.LD_IOS, PredefineCap.LD_IOS);
            put(Platforms.DESKTOP_WEB, PredefineCap.DESKTOP_WEB);
//            put(Platforms.ANDROID, PredefineCap.ANDROID);
            put(Platforms.IOS, PredefineCap.IOS);
        }
    };

    private DriverFactory() {
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static AndroidDriver<MobileElement> getAndroidDriver() {
        return androidDriver;
    }

    public static IOSDriver<MobileElement> getIOSDriver() {
        return iosDriver;
    }

    public static void prepareChromeDriver() {
        LOGGER.info("Prepare the chrome driver");
        WebDriverManager.getInstance(CHROME).setup();
    }

    public static void createWebInstance() throws MalformedURLException {
        createWebInstance(Config.ENV.RUN_LOCATION());
    }

    public static void createWebInstance(String location) throws MalformedURLException {
        isWebDriverRun = true;
        Run _location = Run.fromText(location);
        LOGGER.info(String.format("Creating Web Instance on %s", _location));
        if (webDriver != null) {
            return;
        }
        switch (_location) {
            case LOCAL:
                ChromeOptions options = new ChromeOptions();
                options.setPageLoadStrategy(PageLoadStrategy.NONE);
                webDriver = new ChromeDriver(options);
                webDriver.manage().timeouts().implicitlyWait(Config.ENV.TIME_OUTS(), TimeUnit.SECONDS);
                webDriver.manage().timeouts().pageLoadTimeout(Config.ENV.TIME_OUTS(), TimeUnit.SECONDS);
                webDriver.manage().timeouts().setScriptTimeout(Config.ENV.TIME_OUTS(), TimeUnit.SECONDS);
                break;
            case BROWSER_STACK:
                webDriver = new RemoteWebDriver(new URL(BS_URL), _capabilitiesHashmap.get(Platforms.BS_DESKTOP_WEB));
                webDriver.manage().timeouts().implicitlyWait(Config.ENV.TIME_OUTS(), TimeUnit.SECONDS);
                webDriver.manage().timeouts().pageLoadTimeout(Config.ENV.TIME_OUTS(), TimeUnit.SECONDS);
                webDriver.manage().timeouts().setScriptTimeout(Config.ENV.TIME_OUTS(), TimeUnit.SECONDS);
                ((RemoteWebDriver) webDriver).setFileDetector(new LocalFileDetector());
                break;
            default:
                break;
        }
    }

    public static void startAppiumService() {
        Run _location = Run.fromText(Config.ENV.RUN_LOCATION());
        if (_location == Run.LOCAL) {
            LOGGER.warn("Starting the Appium service");
            builder = new AppiumServiceBuilder();
            builder.usingAnyFreePort();
            service = AppiumDriverLocalService.buildService(builder);
            service.start();
        }
        LOGGER.info(String.format("Appium service is handling from %s", (Object) _location.getText()));
    }

    public static void stopAppiumService() {
        Run _location = Run.fromText(Config.ENV.RUN_LOCATION());
        if (service != null && _location == Run.LOCAL) {
            LOGGER.info("Stopping the Appium service");
            service.stop();
        }
    }

    public static void createMobileInstance(Platforms platforms) throws MalformedURLException {
        createMobileInstance(Config.ENV.RUN_LOCATION(), platforms.getText()[0]);
    }

    public static void createMobileInstance(String location, String platform) throws MalformedURLException {
        Run _location = Run.fromText(location);
        LOGGER.info(String.format("Creating Mobile Instance on %s", _location));
        if (androidDriver != null || iosDriver != null) {
            return;
        }

        Platforms _platform = Platforms.fromText(location.trim() + " " + platform.trim());
        switch (_platform) {
            default:
            case BS_ANDROID:
                androidDriver = new AndroidDriver<AndroidElement>(new URL(BS_URL), _capabilitiesHashmap.get(_platform));
                isAndroidRun = true;
                break;
            case BS_IOS:
                iosDriver = new IOSDriver<IOSElement>(new URL(BS_URL), _capabilitiesHashmap.get(_platform));
                isIOSRun = true;
                break;
            case LD_IOS:
                iosDriver = new IOSDriver<IOSElement>(new URL(LD_URL), _capabilitiesHashmap.get(_platform));
                isIOSRun = true;
                break;
            case ANDROID:
                androidDriver = new AndroidDriver<>(service.getUrl(), _capabilitiesHashmap.get(_platform));
                isAndroidRun = true;
                break;
            case IOS:
                iosDriver = new IOSDriver<>(service.getUrl(), _capabilitiesHashmap.get(_platform));
                isIOSRun = true;
                break;
        }
    }

    public static void dismissInstances() {
        if (webDriver != null) {
            LOGGER.info("Dismissing Web instance");
            webDriver.quit();
            webDriver = null;
            isWebDriverRun = false;
        }
        if (androidDriver != null) {
            LOGGER.info("Dismissing Android instance");
            androidDriver.quit();
            androidDriver = null;
            isAndroidRun = false;
        }
        if (iosDriver != null) {
            LOGGER.info("Dismissing IOS instance");
            iosDriver.quit();
            iosDriver = null;
            isIOSRun = false;
        }
    }

    public static void initPages(String packageName, WebDriver driver) {
        LOGGER.info("Initialize page");
        try {
            Class[] pageClasses = getClasses(packageName);
            for (Class pageClass : pageClasses
            ) {
                PageFactory.initElements(driver, pageClass);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }

    public static void setImplicitWait(long seconds) {
        if (isAndroidRun) {
            androidDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        }
        if (isIOSRun) {
            iosDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        }
        if (isWebDriverRun) {
            webDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        }
    }

    public static void resetImplicitTimeout() {
        setImplicitWait(Config.ENV.TIME_OUTS());
    }

    private static Class[] getClasses(String packageName)
            throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;
        String path = packageName.replace('.', '/');
        Enumeration resources = classLoader.getResources(path);
        List dirs = new ArrayList();
        while (resources.hasMoreElements()) {
            URL resource = (URL) resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList classes = new ArrayList();
        for (Object directory : dirs) {
            classes.addAll(findClasses((File) directory, packageName));
        }
        return (Class[]) classes.toArray(new Class[classes.size()]);
    }

    private static List findClasses(File directory, String packageName) throws ClassNotFoundException {
        List classes = new ArrayList();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }

}


