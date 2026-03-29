package org.example.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Form components\")")
    private WebElement formsTitle;
    @AndroidFindBy(uiAutomator = "description(\"text-input\")")
    private WebElement textInput;
    @AndroidFindBy(uiAutomator = "description(\"switch\")")
    private WebElement switchBtn;
    @AndroidFindBy(uiAutomator = "description(\"switch-text\")")
    private WebElement switchText;
    @AndroidFindBy(uiAutomator = "description(\"Dropdown\")")
    private WebElement dropdownMenu;
    @AndroidFindBy(uiAutomator = "text(\"Active\")")
    private WebElement activeBtn;

    public FormsScreen(AppiumDriver driver) {
        super(driver);
    }

    public String getFormsTitle() {
        return formsTitle.getText();
    }
    public boolean isTextInputVisible() {
        return isElementDisplayed(textInput);
    }
    public boolean isSwitchVisible() {
        return isElementDisplayed(switchBtn);
    }
    public String getSwitchText() {
        return switchText.getText();
    }

    public boolean isDropdownVisible() {
        return isElementDisplayed(dropdownMenu);
    }
    public String activeBtnText() {
        return activeBtn.getText();
    }

    public boolean isActiveBtnVisible() {
        return isElementDisplayed(activeBtn);
    }
}