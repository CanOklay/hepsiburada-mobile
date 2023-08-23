package com.hepsiburada.test;

import com.hepsiburada.driver.DriverManager;
import com.hepsiburada.log.Logs;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class WebAppTest extends DriverManager {

    Logger logger = LogManager.getLogger(Logs.class.getName());

    @Parameters("platform")
    @BeforeMethod(groups = {"hook"})
    public void setUpAppium(@Optional("platform") String platform, Method method) throws MalformedURLException {
        setDriver(platform);
    }

    @AfterMethod(groups = {"hook"})
    public void tearDownAppium(ITestResult result) {
        logger.info("**** iOS App Test Finished ****");
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(groups = {"safari"})
    public void firstTest() {
    }
}
