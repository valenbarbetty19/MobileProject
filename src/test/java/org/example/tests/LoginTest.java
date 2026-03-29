package org.example.tests;

import org.example.screens.HomeScreen;
import org.example.screens.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        HomeScreen home = new HomeScreen(appiumDriver);
        home.tapLogin();
        LoginScreen login = new LoginScreen(appiumDriver);
        login.tapLoginTab();
        login.fillLoginForm("test@mail.com", "Password123!");
        login.tapLoginButton();
        Assert.assertEquals(login.getAlertText(), "You are logged in!", "The login success message is incorrect or not displayed");
        login.closeAlert();

    }
}