package com.hepsiburada.element.android;

import org.openqa.selenium.By;

/**
 * Created by Fatih Can Oklay
 * Date: 25.08.2023
 */

public class LoginPageElements {

    public static final By EMAIL_INPUT = By.xpath("//android.widget.EditText");
    public static final By LOGIN_BUTTON_EMAIL = By.xpath("//android.view.View[3]/android.widget.Button");
    public static final By LOGIN_BUTTON_PASSWORD = By.xpath("//android.view.View[4]/android.widget.Button");
    public static final By PASSWORD_INPUT = By.className("android.widget.EditText");
    public static final By LOGIN_TITLE = By.xpath("//android.view.View[contains(@text, 'Giriş yap')]");
    public static final By WELCOME_TITLE = By.xpath("//android.view.View[contains(@text, 'Hoş geldiniz')]");
}
