package com.hepsiburada.element.android;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 24.08.2023
 */

public class ProductDetailPageElements {

    public static final By TURN_BACK_BUTTON = By.id("leftIcon");
    public static final By SHARE_BUTTON = By.id("share");
    public static final By COMPARE_BUTTON = By.id("compareIcon");
    public static final By COMPARE_TITLE = By.id("compareTitleTxt");
    public static final By SHARE_TITLE = By.id("android:id/title");
    public static final By ALL_FEATURES_BUTTON = By.id("tvAllKeyFeatures");
    public static final By PRODUCT_FEATURES_TITLE = By.xpath("//android.widget.LinearLayout[@content-desc=\"Ürün Özellikleri\"]/android.widget.TextView");
    public static final By PRODUCT_STATEMENT_BUTTON = By.xpath("//android.widget.LinearLayout[@content-desc=\"Ürün Açıklamaları\"]");
    public static final By PRODUCT_DIMENSION_TITLE = By.xpath("//android.widget.TextView[contains(@text, 'Boyutlar')]");
    public static final By PRODUCT_STATEMENT_DESCRIPTION = By.id("productDescContent");
    public static final By CANCELLATION_TERMS_BUTTON = By.xpath("//android.widget.LinearLayout[@content-desc=\"İptal ve İade Koşulları\"]");
    public static final By REFUND_TERMS_DESCRIPTION = By.xpath("//android.view.View[contains(@text, 'Kolay iade süreci nasıl başlatılır?')]");
    public static final By ADD_FAVORITES_BUTTON = By.id("selectorIconFavorite");
}
