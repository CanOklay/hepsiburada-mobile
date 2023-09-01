package com.hepsiburada.test;

import com.hepsiburada.config.ConfigFileReader;
import com.hepsiburada.log.Logs;
import com.hepsiburada.manager.DriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

/**
 * Created by Fatih Can Oklay
 * Date: 23.08.2023
 */

public class BaseTest extends DriverManager {

    public String baseURL;
    ConfigFileReader configFileReader = new ConfigFileReader();
    Logger logger = LogManager.getLogger(Logs.class.getName());

    @Parameters("platform")
    @BeforeMethod(groups = {"hook"})
    public void setUpAppium(@Optional("platform") String platform, Method method) throws MalformedURLException {
        setDriver(platform);
        if (platform.equalsIgnoreCase("safari")) {
            baseURL = configFileReader.getBaseUrl();
            driver.get(baseURL);
        }
    }

    @AfterMethod(groups = {"hook"})
    public void tearDownAppium(ITestResult result) {
        logger.info("**** Android App Test Finished ****");
        if (driver != null) {
            driver.quit();
        }
    }
}
