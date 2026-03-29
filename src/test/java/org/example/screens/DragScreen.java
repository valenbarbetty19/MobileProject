package org.example.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = "text(\"Drag and Drop\")")
    private WebElement dragTitle;
    @AndroidFindBy(uiAutomator = "description(\"renew\")")
    private WebElement renewBtn;
    @AndroidFindBy(uiAutomator = "description(\"drag-l1\")")
    private WebElement pieceL1;
    @AndroidFindBy(uiAutomator = "description(\"drag-c1\")")
    private WebElement pieceC1;
    @AndroidFindBy(uiAutomator = "description(\"drag-r1\")")
    private WebElement pieceR1;
    @AndroidFindBy(uiAutomator = "description(\"drop-l1\")")
    private WebElement dropZoneL1;
    @AndroidFindBy(uiAutomator = "description(\"drop-c1\")")
    private WebElement dropZoneC1;
    @AndroidFindBy(uiAutomator = "description(\"drop-r1\")")
    private WebElement dropZoneR1;

    public DragScreen(AppiumDriver driver) {
        super(driver);
    }
    public String getDragTitleText() {
        return dragTitle.getText();
    }
    public boolean isRenewButtonDisplayed() {
        return isElementDisplayed(renewBtn);
    }
    public boolean arePuzzlePiecesVisible() {
        return isElementDisplayed(pieceL1) && isElementDisplayed(pieceC1) && isElementDisplayed(pieceR1);
    }

    public boolean areDropZonesVisible() {
        return isElementDisplayed(dropZoneL1) && isElementDisplayed(dropZoneC1) && isElementDisplayed(dropZoneR1);
    }
}