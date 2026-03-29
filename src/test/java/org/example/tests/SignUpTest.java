package org.example.tests;

import org.example.screens.HomeScreen;
import org.example.screens.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void testSuccessfulSignUp() {
        HomeScreen home = new HomeScreen(appiumDriver);
        home.tapLogin();
        LoginScreen login = new LoginScreen(appiumDriver);
        login.tapSignUpTab();
        String uniqueEmail = "user" + System.currentTimeMillis() + "@mail.com";
        login.fillSignUpForm(uniqueEmail, "Password123!");
        login.tapSignUpButton();
        Assert.assertEquals(login.getAlertText(), "You successfully signed up!", "The success message is not correct or not displayed");

        login.closeAlert();
    }
}