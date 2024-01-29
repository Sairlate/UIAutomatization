package org.example.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class Button extends BaseElement{
    public Button(SelenideElement container, String buttonName) {
        super(container.as("Кнопка: " + buttonName));
    }
    public Button(String buttonName) {
        this($x("//button[.='" + buttonName + "']"), buttonName);
    }

    public void click(){
        container.shouldBe(visible).click();
    }
    public void doubleClick(){
        container.shouldBe(visible).doubleClick();
    }
    public void contextClick(){
        container.shouldBe(visible).contextClick();
    }
    public void isEnabled(){
        container.isEnabled();
    }
    public void isDisplayed(){
        container.isDisplayed();
    }
}
