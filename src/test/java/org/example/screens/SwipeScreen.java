package org.example.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Swipe horizontal\")")
    private WebElement swipeTitle;
    @AndroidFindBy(uiAutomator = "text(\"Or swipe vertical to find what I'm hiding.\")")
    private WebElement swipeSubtitle;
    @AndroidFindBy(uiAutomator = "text(\"FULLY OPEN SOURCE\")")
    private WebElement firstCardText;
    @AndroidFindBy(uiAutomator = "description(\"WebdriverIO logo\")")
    private WebElement hiddenLogo;
    @AndroidFindBy(uiAutomator = "text(\"COMPATIBLE\")")
    private WebElement lastCardText;

    public SwipeScreen(AppiumDriver driver) {
        super(driver);
    }

    public String getSwipeTitle() {
        return swipeTitle.getText();
    }
    public String getSwipeSubtitle() {
        return swipeSubtitle.getText();
    }
    public boolean isFirstCardVisible() {
        return isElementDisplayed(firstCardText);
    }
    public boolean isHiddenLogoDisplayed() {
        return isElementDisplayed(hiddenLogo);
    }

    public void swipeRight() {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollForward()"
        ));
    }

    public boolean isLastCardVisible() {
        return isElementDisplayed(lastCardText);
    }

    public void scrollToHiddenText() {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"You found me!!!\"))"
        ));
    }

    public boolean isHiddenTextDisplayed() {
        WebElement hiddenText = driver.findElement(AppiumBy.androidUIAutomator("text(\"You found me!!!\")"));
        return isElementDisplayed(hiddenText);
    }
}