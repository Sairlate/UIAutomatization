package org.example.steps;

import org.example.pages.BasePage;
import org.example.pages.elemetsPage.frames.RadioButtonFrame;

public class RadioButtonPageSteps extends BasePage {
    public void clickOnEveryPresentedBtn(){
        elementsPage.radioButtonFrame.clickYesButton();
        elementsPage.radioButtonFrame.clickImpressiveButton();
        elementsPage.radioButtonFrame.clickNoButton();
    }
}
