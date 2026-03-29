package org.example.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "text(\"Login / Sign up Form\")")
    private WebElement loginFormTitle;

    @AndroidFindBy(uiAutomator = "description(\"button-login-container\")")
    private WebElement loginTab;

    @AndroidFindBy(uiAutomator = "description(\"button-sign-up-container\")")
    private WebElement signUpTab;

    @AndroidFindBy(uiAutomator = "text(\"Email\")")
    private WebElement emailField;

    @AndroidFindBy(uiAutomator = "text(\"Password\")")
    private WebElement passwordField;

    @AndroidFindBy(uiAutomator = "text(\"Confirm password\")")
    private WebElement confirmPasswordField;

    @AndroidFindBy(uiAutomator = "text(\"LOGIN\")")
    private WebElement loginBtn;

    @AndroidFindBy(uiAutomator = "text(\"SIGN UP\")")
    private WebElement signUpBtn;
    @AndroidFindBy(uiAutomator = "resourceId(\"android:id/message\")")
    private WebElement alertMessage;

    @AndroidFindBy(uiAutomator = "resourceId(\"android:id/button1\")")
    private WebElement alertOkBtn;
    public LoginScreen(AppiumDriver driver) {
        super(driver);
    }

    public void tapSignUpTab() {
        click(signUpTab, "Tab sign up");
    }

    public String getLoginSignUpTitle() {
        return loginFormTitle.getText();
    }

    public String getLoginBtnText() {
        return loginBtn.getText();
    }

    public String getSignUpBtnText(){
        return signUpBtn.getText();
    }
    public boolean inputsVisible() {
        return isElementDisplayed(emailField) && isElementDisplayed(passwordField);
    }

    public void fillSignUpForm(String email, String pass) {
        emailField.sendKeys(email);
        passwordField.sendKeys(pass);
        confirmPasswordField.sendKeys(pass);
    }

    public void tapSignUpButton() {
        click(signUpBtn, "Btn SIGN UP");
    }

    public String getAlertText() {
        return alertMessage.getText();
    }

    public void closeAlert() {
        click(alertOkBtn, "Close success alert");
    }

    public void fillLoginForm(String email, String pass) {
        emailField.sendKeys(email);
        passwordField.sendKeys(pass);
    }

    public void tapLoginButton() {
        click(loginBtn, "clic LOGIN btn");
    }

    public void tapLoginTab() {
        click(loginTab, "Switching to login tab");
    }
}