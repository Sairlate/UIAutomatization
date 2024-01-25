package org.example.pages.elemetsPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage {
    private final SelenideElement doubleClickButton = $("#doubleClickBtn");
    private final SelenideElement rightClickButton = $("#rightClickBtn");
    private final SelenideElement clickButton = $("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3) > [type=\"button\"]");
    private final SelenideElement doubleClickMessage = $("#doubleClickMessage");
    private final SelenideElement rightClickMessage = $("#rightClickMessage");
    private final SelenideElement dynamicClickMessage = $("#dynamicClickMessage");


    public void clickDoubleClickButton(){
        doubleClickButton.doubleClick();
        doubleClickMessage.shouldBe(visible);
    }

    public void clickRightClickButton(){
        rightClickButton.contextClick();
        rightClickMessage.shouldBe(visible);
    }

    public void clickClickButton(){
        clickButton.click();
        dynamicClickMessage.shouldBe(visible);
    }

}
