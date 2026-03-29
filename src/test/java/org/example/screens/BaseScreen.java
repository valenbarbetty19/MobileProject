package org.example.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseScreen {
    public AppiumDriver driver;

        public BaseScreen(AppiumDriver appiumDriver){
            this.driver = appiumDriver;
            PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);

    }

    public void click(WebElement element, String desc){
            element.click();
    }
    public boolean isElementDisplayed(WebElement element) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOf(element))
                    .isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isElementVisibleWithCustomWait(WebElement element, int seconds) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(seconds))
                    .until(ExpectedConditions.visibilityOf(element))
                    .isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
