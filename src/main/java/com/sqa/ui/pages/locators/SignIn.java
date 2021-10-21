package com.sqa.ui.pages.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class SignIn {
    public static final SelenideElement btnSigIn= $(By.xpath("(//button[normalize-space(text())='SIGN IN'])[1]"));
    public static final SelenideElement inpEmailMs= $(By.xpath("//input[@type='email']"));
    public static final SelenideElement btnNextMs= $(By.xpath("//input[@type='submit']"));
    public static final SelenideElement inpPasswordMs= $(By.xpath("//input[@type='password']"));
    public static final SelenideElement btnYesStaySignedInMs= $(By.xpath("//div[text()='Stay signed in?']/parent::div//input[@type='submit']"));
    public static final SelenideElement btnSignInMs= $(By.xpath("//input[@type='submit']"));

}
