package org.example.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen{

    @AndroidFindBy(uiAutomator = "description(\"Home\")")
    WebElement homeBtn;
    @AndroidFindBy(uiAutomator = "description(\"Webview\")")
    WebElement webBtn;
    @AndroidFindBy(uiAutomator = "description(\"Login\")")
    WebElement loginBtn;
    @AndroidFindBy(uiAutomator = "description(\"Forms\")")
    WebElement formsBtn;
    @AndroidFindBy(uiAutomator = "description(\"Swipe\")")
    WebElement swipeBtn;
    @AndroidFindBy(uiAutomator = "description(\"Drag\")")
    WebElement dragBtn;
    @AndroidFindBy(uiAutomator = "description(\"Menu\")")
    WebElement menuBtn;

    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }

    public void tapHome() {
        click(homeBtn, "Icono Home");
    }

    public void tapWebview() {
        click(webBtn, "Icono Webview");
    }

    public void tapLogin() {
        click(loginBtn, "Icono Login");
    }

    public void tapForms() {
        click(formsBtn, "Icono Forms");
    }

    public void tapSwipe() {
        click(swipeBtn, "Icono Swipe");
    }

    public void tapDrag() {
        click(dragBtn, "Icono Drag");
    }
}
