package com.sqa.ui.pages.actions;

import com.codeborne.selenide.Condition;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

import static com.sqa.ui.pages.locators.SignIn.*;

@Configuration
public class SignIn {

    public void signIn(String email, String password){
        btnSigIn.click();
        inpEmailMs.setValue(email.trim());
        btnNextMs.click();
        inpPasswordMs.should(Condition.appear, Duration.ofMillis(3000));
        inpPasswordMs.setValue(password.trim());
        if(btnYesStaySignedInMs.exists())
            btnYesStaySignedInMs.click();
        btnSignInMs.click();
    }
}
