package com.hepsiburada.base;

import com.hepsiburada.helper.PageActionsHelper;
import com.hepsiburada.log.Logs;
import com.hepsiburada.reports.ExtentLogger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StepImplementations extends BasePage {

    Logger logger = LogManager.getLogger(Logs.class.getName());
    PageActionsHelper pageActionsHelper = new PageActionsHelper();

    public void click(By by) {
        try {
            clickElement(by);
            logger.info("Clicked " + by + " element successfully");
            ExtentLogger.info("Clicked " + by + " element successfully");
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Can not clicked " + by + " element successfully");
            ExtentLogger.info("Can not clicked " + by + " element successfully");
            assertFail();
        }
    }

    public void writeText(By by, String text) {
        try {
            sendKeys(by, text);
            logger.info(text + " text is written successfully");
            ExtentLogger.info(text + " text is written successfully");
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info(text + " text could not be written successfully");
            ExtentLogger.info(text + " text could not be written successfully");
            assertFail();
        }
    }

    public void scrollDown(By element) {
        try {
            pageActionsHelper.scrollForMobile(element);
            logger.info("Scrolled successfully");
            ExtentLogger.info("Scrolled successfully");
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Can not scrolled successfully");
            ExtentLogger.info("Can not scrolled successfully");
            assertFail();
        }
    }

    public void selectInList(int select, By list) {
        try {
            List<WebElement> products = findElements(list);
            products.forEach(p -> products.get(select).click());
            ExtentLogger.info("Product is selected successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            ExtentLogger.info("Product is not selected successfully");
            assertFail();
        }
    }

    public void isDisplayed(By by) {
        try {
            isElementDisplayed(by);
            logger.info("Element is checked successfully");
            ExtentLogger.info("Element is checked successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            logger.error(e.getMessage());
            logger.info("Element is NOT checked successfully");
            ExtentLogger.info("Element is NOT checked successfully");
            assertFail();
        }
    }
}
