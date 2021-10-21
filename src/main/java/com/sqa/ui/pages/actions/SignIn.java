package com.sqa.ui.pages.actions;

import com.codeborne.selenide.Condition;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

import static com.sqa.ui.pages.locators.SignIn.*;

@Configuration
public class SignIn {

    public void clickSignIn() {
        btnSigIn.click();
    }
    public void enterEmail(String email) {
        inpEmailMs.setValue(email.trim());
    }
    public void clickNext() {
        btnNextMs.click();
    }
    public void enterPassword(String password) {
        inpPasswordMs.should(Condition.appear, Duration.ofMillis(3000));
        inpPasswordMs.setValue(password.trim());
    }
    public boolean isStaySignedIn(){
        return btnYesStaySignedInMs.exists();
    }
    public void clickYesAtStaySingedIn(){
        btnYesStaySignedInMs.click();
    }
    public void clickSignInMs(){
        btnSignInMs.click();
    }
}
