package com.hepsiburada.test;

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

public class BaseTest extends DriverManager {

    Logger logger = LogManager.getLogger(Logs.class.getName());

    @Parameters("platform")
    @BeforeMethod(groups = {"hook"})
    public void setUpAppium(@Optional("platform") String platform, Method method) throws MalformedURLException {
        setDriver(platform);
    }

    @AfterMethod(groups = {"hook"})
    public void tearDownAppium(ITestResult result) {
        logger.info("**** Android App Test Finished ****");
        if (driver != null) {
            driver.quit();
        }
    }
}