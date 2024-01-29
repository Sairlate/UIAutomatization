package org.example.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Input extends BaseElement{
    public Input(SelenideElement container, String inputName) {
        super(container.as("Текстовое поле: " + inputName));
    }

    public Input(String inputName){
        this($x("[placeholder='"+inputName+"']"), inputName);
    }

    public void setValue(String string){
        container.setValue(string);
    }

    public void isDisplayed(){
        container.isDisplayed();
    }
}
