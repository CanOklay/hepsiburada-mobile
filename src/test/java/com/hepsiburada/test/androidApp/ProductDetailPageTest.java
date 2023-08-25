package com.hepsiburada.test.androidApp;

import com.hepsiburada.base.StepImplementations;
import org.testng.annotations.Test;

import static com.hepsiburada.constant.ComparePageConstants.COMPARE_LIST_TITLE_TEXT;
import static com.hepsiburada.constant.ProductDetailPageConstants.*;
import static com.hepsiburada.element.android.ComparePageElements.*;
import static com.hepsiburada.element.android.HomePageElements.*;
import static com.hepsiburada.element.android.ProductDetailPageElements.*;
import static com.hepsiburada.element.android.ProductsPageElements.SECOND_COMPUTER_PRODUCT;

/**
 * Created by Fatih Can Oklay
 * Date: 22.08.2023
 */

public class ProductDetailPageTest extends StepImplementations {

    @Test(testName = "User should turn back from the product detail page",
            groups = {"android"})
    public void user_should_turn_back_from_product_detail_page() {
        goToProductDetailPage();
        click(TURN_BACK_BUTTON);
        isDisplayed(PRODUCT_LIST);
    }

    @Test(testName = "User should share product on the product detail page",
            groups = {"android"})
    public void user_should_share_product_on_product_detail_page() {
        goToProductDetailPage();
        click(SHARE_BUTTON);
        isDisplayed(SHARE_TITLE);
    }

    @Test(testName = "User should compare products on the product detail page",
            groups = {"android"})
    public void user_should_compare_products_on_product_detail_page() {
        goToProductDetailPage();
        click(COMPARE_BUTTON_PRODUCT_DETAIL);
        verifyText(COMPARE_TITLE, COMPARE_PRODUCTS_TITLE_TEXT);
        goBack();
        click(TURN_BACK_BUTTON);
        isDisplayed(PRODUCT_LIST);
        click(SECOND_COMPUTER_PRODUCT);
        click(COMPARE_BUTTON_PRODUCT_DETAIL);
        verifyText(COMPARE_TITLE, COMPARE_PRODUCTS_TITLE_TEXT);
        click(COMPARE_BUTTON);
        verifyText(COMPARE_LIST_TITLE, COMPARE_LIST_TITLE_TEXT);
        isDisplayed(COMPARE_LIST_FIRST_PRODUCT_TITLE);
        isDisplayed(COMPARE_LIST_SECOND_PRODUCT_TITLE);
    }
}
