package com.hepsiburada.base;

import com.hepsiburada.log.Logs;
import com.hepsiburada.reports.ExtentLogger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.hepsiburada.constant.SearchConstant.SEARCH_COMPUTER_TEXT;
import static com.hepsiburada.element.android.HomePageElements.SEARCH_BOX;
import static com.hepsiburada.element.android.ProductsPageElements.FIRST_COMPUTER_PRODUCT;
import static com.hepsiburada.element.android.SearchElements.SUGGESTIONS;

/**
 * Created by Fatih Can Oklay
 * Date: 23.08.2023
 */

public class StepImplementations extends BasePage {

    Logger logger = LogManager.getLogger(Logs.class.getName());

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

    public void scrollDown() {
        try {
            scrollDownBy();
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

    public void goToProductDetailPage() {
        try {
            click(SEARCH_BOX);
            writeText(SEARCH_BOX, SEARCH_COMPUTER_TEXT);
            selectInList(0, SUGGESTIONS);
            click(FIRST_COMPUTER_PRODUCT);
            logger.info("Gone to the product detail page successfully");
            ExtentLogger.info("Gone to the product detail page successfully");
        } catch (Exception e) {
            ExtentLogger.info(e.getMessage());
            logger.error(e.getMessage());
            logger.info("Can not go to the product detail page successfully");
            ExtentLogger.info("Can not go to the product detail page successfully");
            assertFail();
        }
    }

    public void verifyText(By by, String text) {
        try {
            assertEquals(getText(by), text);
            logger.info(by + " text is checked successfully");
            ExtentLogger.info(by + " text is checked successfully");
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info(by + " text is not checked successfully");
            ExtentLogger.info(by + " text is not checked successfully");
            assertFail();
        }
    }

    public void goBack() {
        try {
            turnBack();
            logger.info("Gone back successfully");
            ExtentLogger.info("Gone back successfully");
        } catch (Exception e) {
            logger.error(e.getMessage());
            logger.info("Could not go back successfully");
            ExtentLogger.info("Could not go back successfully");
            assertFail();
        }
    }
}
