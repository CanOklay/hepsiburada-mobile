package com.hepsiburada.util;

import com.hepsiburada.manager.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Created by Fatih Can Oklay
 * Date: 24.08.2023
 */

public final class ScreenshotUtils {

    private ScreenshotUtils() {
    }

    public static String getBase64Image() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
