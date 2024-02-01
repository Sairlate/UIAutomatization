package org.example.steps;

import org.example.pages.BasePage;

public class ButtonsPageSteps extends BasePage {
    public void clickOnEveryPresentedBtn(){
        elementsPage.buttonsFrame.clickDoubleClickButton();
        elementsPage.buttonsFrame.clickRightClickButton();
        elementsPage.buttonsFrame.clickDynamicButton();
    }
}
