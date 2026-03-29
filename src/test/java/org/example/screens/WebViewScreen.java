package org.example.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebViewScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Next-gen browser and mobile automation test framework for Node.js\")")
    private WebElement mainWebTitle;

    @AndroidFindBy(uiAutomator = "description(\"WebdriverIO\")")
    private WebElement webViewLogo;

    public WebViewScreen(AppiumDriver driver) {
        super(driver);
    }

    public boolean isWebTitleDisplayed() {
        return isElementDisplayed(mainWebTitle);
    }

    public boolean isWebLogoDisplayed() {
        return isElementDisplayed(webViewLogo);
    }
    public WebElement getWebLogo() {
        return webViewLogo;
    }
}