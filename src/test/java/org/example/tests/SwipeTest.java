package org.example.tests;

import org.example.screens.HomeScreen;
import org.example.screens.SwipeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {

    @Test
    public void testSwipeCardsAndVerticalScroll() {
        HomeScreen home = new HomeScreen(appiumDriver);
        home.tapSwipe();
        SwipeScreen swipe = new SwipeScreen(appiumDriver);
        Assert.assertTrue(swipe.isFirstCardVisible(), "First card should be visible.");
        swipe.swipeRight();
        Assert.assertFalse(swipe.isFirstCardVisible(), "The first card should be hidden after swiping right.");
        int maxSwipes = 6;
        for (int i = 0; i < maxSwipes && !swipe.isLastCardVisible(); i++) {
            swipe.swipeRight();
        }
        Assert.assertTrue(swipe.isLastCardVisible(), "The last card was not found.");
        swipe.scrollToHiddenText();
        Assert.assertTrue(swipe.isHiddenTextDisplayed(), "The hidden text 'You found me!!!' is not displayed.");
        Assert.assertTrue(swipe.isHiddenLogoDisplayed(), "The WebdriverIO logo at the bottom is not visible.");

    }
}