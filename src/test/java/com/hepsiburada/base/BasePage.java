package com.hepsiburada.base;

import com.hepsiburada.test.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Fatih Can Oklay
 * Date: 23.08.2023
 */

public class BasePage extends BaseTest {

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
}
