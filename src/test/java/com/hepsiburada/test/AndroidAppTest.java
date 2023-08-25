package com.hepsiburada.test;

import com.hepsiburada.base.StepImplementations;
import org.testng.annotations.Test;

import static com.hepsiburada.constant.SearchConstant.*;
import static com.hepsiburada.element.android.HomePageElements.*;
import static com.hepsiburada.element.android.ProductDetailPageElements.*;
import static com.hepsiburada.element.android.ProductsPageElements.*;
import static com.hepsiburada.element.android.SearchElements.*;

/**
 * Created by Fatih Can Oklay
 * Date: 22.08.2023
 */

public class AndroidAppTest extends StepImplementations {

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
}
