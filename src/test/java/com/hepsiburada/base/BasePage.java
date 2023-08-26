package com.hepsiburada.base;

import com.hepsiburada.test.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Fatih Can Oklay
 * Date: 23.08.2023
 */

public class BasePage extends BaseTest {

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void clickElement(By by) {
        Actions action = new Actions(driver);
        action.moveToElement(findElement(by))
                .click()
                .build()
                .perform();
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public void turnBack() {
        driver.navigate().back();
    }

    public void waitSeconds(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public void isElementDisplayed(By by) {
        findElement(by).isDisplayed();
    }

    public void assertFail() {
        Assert.fail();
    }

    public void assertEquals(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

    public String screenShot(String screenshotName) throws IOException {
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        String date = dateFormat.format(new Date());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/report/screenshot/" + screenshotName + date + ".png";
        File destination = new File(path);
        FileUtils.copyFile(scrFile, destination);
        return path;
    }

    @DataProvider
    public Object[][] correctData() {
        Object[][] data = new Object[1][2];
        data[0][0] = "canvivoo66@gmail.com";
        data[0][1] = "Can12345.!";
        return data;
    }
}
