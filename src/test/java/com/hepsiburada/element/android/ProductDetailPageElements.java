package com.hepsiburada.element.android;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 24.08.2023
 */

public class ProductDetailPageElements {

    public static final By TURN_BACK_BUTTON = By.id("leftIcon");
    public static final By SHARE_BUTTON = By.id("share");
    public static final By COMPARE_BUTTON_PRODUCT_DETAIL = By.id("compareIcon");
    public static final By COMPARE_TITLE = By.id("compareTitleTxt");
    public static final By COMPARE_BUTTON = By.id("compareTxt");
    public static final By SHARE_TITLE = By.id("android:id/title");
    public static final By ALL_FEATURES_BUTTON = By.id("com.pozitron.hepsiburada:id/tvAllKeyFeatures");
    public static final By PRODUCT_FEATURES_TITLE = By.xpath("//android.widget.LinearLayout[@content-desc=\"Ürün Özellikleri\"]/android.widget.TextView");
    public static final By PRODUCT_FEATURES = By.xpath("//android.widget.LinearLayout[@content-desc=\"Ürün Özellikleri\"]");
    public static final By PRODUCT_STATEMENT_BUTTON = By.xpath("//android.widget.LinearLayout[@content-desc=\"Ürün Açıklamaları\"]");
    public static final By FIRST_FEATURE_TITLE = By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]");
    public static final By PRODUCT_STATEMENT_DESCRIPTION = By.id("productDescContent");
    public static final By CANCELLATION_TERMS_BUTTON = By.xpath("//android.widget.LinearLayout[@content-desc=\"İptal ve İade Koşulları\"]");
    public static final By REFUND_TERMS_TITLE = By.xpath("//android.view.View[contains(@text, 'Kolay iade süreci nasıl başlatılır?')]");
    public static final By ADD_FAVORITES_BUTTON = By.id("selectorIconFavorite");
}
