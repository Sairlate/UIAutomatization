package org.example.steps;

import org.example.pages.elemetsPage.RadioButtonPage;

public class RadioButtonPageSteps {
    public void clickOnEveryPresentedBtn(RadioButtonPage radioButtonPage){
        radioButtonPage.clickYesButton();
        radioButtonPage.clickImpressiveButton();
        radioButtonPage.clickNoButton();
    }
}
