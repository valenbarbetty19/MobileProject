package org.example.tests;

import org.example.screens.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{

    @Test
    public void webNavigation() {
        HomeScreen home = new HomeScreen(appiumDriver);
        home.tapWebview();

        WebViewScreen webview = new WebViewScreen(appiumDriver);
        boolean isLoaded = webview.isElementVisibleWithCustomWait(webview.getWebLogo(), 30);

        Assert.assertTrue(isLoaded, "Webview did not load in 30 secs");
        Assert.assertTrue(webview.isWebLogoDisplayed(), "The WebdriverIO logo did not load");
        Assert.assertTrue(webview.isWebTitleDisplayed(), "The framework title is not visible");
    }

    @Test
    public void loginNavigation() {
        HomeScreen home = new HomeScreen(appiumDriver);
        home.tapLogin();
        LoginScreen login = new LoginScreen(appiumDriver);
        Assert.assertEquals(login.getLoginSignUpTitle(), "Login / Sign up Form", "The title of the section is not shown");
        Assert.assertTrue(login.inputsVisible(), "Email and password fields are not shown");
        Assert.assertEquals(login.getLoginBtnText(), "LOGIN", "The text of the login btn is not correct");
        login.tapSignUpTab();
        Assert.assertEquals(login.getSignUpBtnText(), "SIGN UP", "The sign up btn is not available");
        Assert.assertTrue(login.inputsVisible(), "Email and password fields are not shown");

    }

    @Test
    public void testFormsNavigation() {
        HomeScreen home = new HomeScreen(appiumDriver);
        home.tapForms();
        FormsScreen forms = new FormsScreen(appiumDriver);
        Assert.assertEquals(forms.getFormsTitle(), "Form components", "The title of the section is not correct");
        Assert.assertTrue(forms.isTextInputVisible(), "The input field is not shown");
        Assert.assertTrue(forms.isSwitchVisible(), "The switch button is not visible");
        Assert.assertTrue(forms.isDropdownVisible(), "The dropdown menu is not visible");
        Assert.assertEquals(forms.activeBtnText(), "Active", "The active button text should be 'Active'");
        Assert.assertTrue(forms.isActiveBtnVisible(), "The Active button is not visible");
    }

    @Test
    public void testSwipeNavigation() {
        HomeScreen home = new HomeScreen(appiumDriver);
        home.tapSwipe();
        SwipeScreen swipe = new SwipeScreen(appiumDriver);
        Assert.assertEquals(swipe.getSwipeTitle(), "Swipe horizontal", "The title of the Swipe section is incorrect");
        Assert.assertTrue(swipe.getSwipeSubtitle().contains("vertical"), "The subtitle does not mention vertical scroll");
        Assert.assertTrue(swipe.isFirstCardVisible(), "The first card 'FULLY OPEN SOURCE' is not visible");
    }


    @Test
    public void testDragSectionProperties() {
        HomeScreen home = new HomeScreen(appiumDriver);
        home.tapDrag();
        DragScreen drag = new DragScreen(appiumDriver);
        Assert.assertEquals(drag.getDragTitleText(), "Drag and Drop", "The drag and drop section title is incorrect");
        Assert.assertTrue(drag.isRenewButtonDisplayed(), "The renew btn should be visible in the drag section");
        Assert.assertTrue(drag.arePuzzlePiecesVisible(), "The puzzle pieces and drop zones were not found on the screen");
        Assert.assertTrue(drag.areDropZonesVisible(), "Some drop zones are missing");
    }



}
