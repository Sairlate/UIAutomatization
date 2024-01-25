package org.example.pages.elemetsPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RadioButtonPage {
    private final SelenideElement yesButton = $("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(2) > label");
    private final SelenideElement impressiveButton = $("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3) > label");
    private final SelenideElement noButton = $("#noRadio");
    private final SelenideElement result = $("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > p > span");

    public void clickYesButton() {
        yesButton.click();
        result.shouldHave(text("Yes"));
    }

    public void clickImpressiveButton(){
        impressiveButton.click();
        result.shouldHave(text("Impressive"));
    }
    public void clickNoButton(){
        noButton.shouldBe(disabled);
    }
}
