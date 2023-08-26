package com.hepsiburada.manager;

import com.hepsiburada.config.ConfigFileReader;
import com.hepsiburada.log.Logs;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

/**
 * Created by Fatih Can Oklay
 * Date: 22.08.2023
 */

public class DriverManager {

    public static AppiumDriver driver;
    public JavascriptExecutor js;
    public String baseURL;
    Logger logger = LogManager.getLogger(Logs.class.getName());
    ConfigFileReader configFileReader = new ConfigFileReader();

    public static AppiumDriver getDriver() {
        return driver;
    }

    public void setDriver(String testPlatform) throws MalformedURLException {
        switch (testPlatform) {
            case "ios": {
                //TODO
                logger.info("****** iOS App Test Started ******");
                break;
            }
            case "chrome": {
                //TODO
                logger.info("****** Android Mobile Web - Chrome Test Started ******");
                break;
            }
            case "safari": {
                DesiredCapabilities iosSafariCapabilities = new DesiredCapabilities();
                iosSafariCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
                iosSafariCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                iosSafariCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12");
                iosSafariCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.2");
                iosSafariCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                driver = new AppiumDriver(new URL(configFileReader.getHubUrl()), iosSafariCapabilities);
                baseURL = configFileReader.getBaseUrl();
                driver.get(baseURL);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configFileReader.getImplicityWait()));
                logger.info("****** iOS Mobile Web - Safari Test Started ******");
                break;
            }
            default: {
                MutableCapabilities androidCapabilities = new MutableCapabilities();
                androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                androidCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
                androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, configFileReader.getAndroidEmulatorVersion());
                androidCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, configFileReader.getAndroidEmulatorName());
                androidCapabilities.setCapability(MobileCapabilityType.UDID, configFileReader.getAndroidEmulator());
                androidCapabilities.setCapability("appium:appPackage", "com.pozitron.hepsiburada");
                androidCapabilities.setCapability("appium:appActivity", "com.hepsiburada.ui.startup.SplashActivity");
                driver = new AppiumDriver(new URL(configFileReader.getHubUrl()), androidCapabilities);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configFileReader.getImplicityWait()));
                logger.info("****** Android App Test Started ******");
                break;
            }
        }
        js = driver;
    }
}
