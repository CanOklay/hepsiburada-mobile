package com.hepsiburada.element.android;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 25.08.2023
 */

public class ComparePageElements {

    public static final By COMPARE_LIST_TITLE = By.id("tv_toolbar_title");
    public static final By COMPARE_LIST_FIRST_PRODUCT_TITLE = By.xpath("//android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.HorizontalScrollView/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.LinearLayout[1]");
    public static final By COMPARE_LIST_SECOND_PRODUCT_TITLE = By.xpath("//android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.HorizontalScrollView/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.LinearLayout[2]");
}
