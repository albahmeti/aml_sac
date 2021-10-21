package com.sqa.ui.pages.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignOut {
    public static final SelenideElement btnSigOut= $(By.xpath("//button[normalize-space(text())='SIGN OUT']"));

}
