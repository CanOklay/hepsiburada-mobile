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

    @Test(testName = "Turning back from the product detail page",
            groups = {"android"})
    public void turning_back_from_product_detail_page() {
        click(SEARCH_BOX);
        writeText(SEARCH_BOX, SEARCH_COMPUTER_TEXT);
        selectInList(0, SUGGESTIONS);
        click(FIRST_COMPUTER_PRODUCT);
        click(TURN_BACK_BUTTON);
        isDisplayed(PRODUCT_LIST);
    }
}
