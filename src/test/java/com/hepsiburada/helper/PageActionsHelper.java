package com.hepsiburada.helper;

import com.hepsiburada.base.BasePage;
import com.hepsiburada.manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

import static com.hepsiburada.constant.PageActionsHelperConstants.FIRST_FINGER;

/**
 * Created by Fatih Can Oklay
 * Date: 24.08.2023
 */

public class PageActionsHelper extends BasePage {

    public void scrollForMobile(By by) {
        String previousPageSource = "";
        while (isElementNotEnabled(findElement(by)) && isNotEndofPage(previousPageSource)) {
            previousPageSource = DriverManager.getDriver().getPageSource();
            performScroll();
        }
    }

    private static void performScrollUsingSequence(int startX, int startY, int endX, int endY) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, FIRST_FINGER);
        Sequence sequence = new Sequence(finger, 0)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
        ((DriverManager.getDriver())).perform(Collections.singletonList(sequence));
    }

    private static void performScroll() {
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int startX = size.getWidth() / 2;
        int endX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endY = (int) (size.getHeight() * 0.25);
        performScrollUsingSequence(startX, startY, endX, endY);
    }

    private static boolean isNotEndofPage(String previousPageSource) {
        return !previousPageSource.equals(DriverManager.getDriver().getPageSource());
    }

    private static boolean isElementNotEnabled(WebElement element) {
        try {
            return !element.isDisplayed();
        } catch (NoSuchElementException e) {
            return true;
        }
    }
}
