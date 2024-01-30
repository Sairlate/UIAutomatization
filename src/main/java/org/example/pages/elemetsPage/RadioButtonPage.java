package org.example.pages.elemetsPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.elements.RadioButton;
import org.example.elements.TextArea;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RadioButtonPage {
    private final RadioButton yesButton = new RadioButton("Yes");
    private final RadioButton impressiveButton = new RadioButton("Impressive");
    private final RadioButton noButton = new RadioButton("No");
    private final SelenideElement result = $("p > span");

    public void clickYesButton() {
        yesButton.click();
        result.shouldHave(text("Yes"));
    }

    public void clickImpressiveButton(){
        impressiveButton.click();
        result.shouldHave(text("Impressive"));
    }
    public void clickNoButton(){
        noButton.isEnabled(false);
    }
}
