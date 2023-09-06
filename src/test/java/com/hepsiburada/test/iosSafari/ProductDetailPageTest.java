package com.hepsiburada.test.iosSafari;

import com.hepsiburada.base.StepImplementations;
import org.testng.annotations.Test;

import static com.hepsiburada.element.ios.HomePageElements.*;
import static com.hepsiburada.element.ios.ProductDetailPageElements.ADD_TO_CART_BUTTON;

/**
 * Created by Fatih Can Oklay
 * Date: 23.08.2023
 */

public class ProductDetailPageTest extends StepImplementations {

    @Test(testName = "User should turn back from the product detail page",
            groups = {"safari"})
    public void user_should_turn_back_from_product_detail_page() {
        clickIfExist(APP_NAVIGATION_CLOSE_BUTTON);
        selectInList(0, SUGGESTED_PRODUCTS);
        isDisplayed(ADD_TO_CART_BUTTON);
        goBack();
        isDisplayed(HOME_PAGE_SEARCH_BOX);
    }
}
