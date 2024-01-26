package org.example.steps;

import org.example.pages.elemetsPage.ButtonsPage;

public class ButtonsPageSteps {
    public void clickOnEveryPresentedBtn(ButtonsPage buttonsPage){
        buttonsPage.clickDoubleClickButton();
        buttonsPage.clickRightClickButton();
        buttonsPage.clickDynamicButton();
    }
}
