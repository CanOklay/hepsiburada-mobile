package com.hepsiburada.element.android;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 24.08.2023
 */

public class ProductsPageElements {

    public static final By FIRST_COMPUTER_PRODUCT = By.xpath("//androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView");
    public static final By SECOND_COMPUTER_PRODUCT = By.xpath("//androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView");
    public static final By COMPUTERS_TITLE = By.id("com.pozitron.hepsiburada:id/tvToolbarTitle");
}
