package org.example.elements;

import com.codeborne.selenide.ClickMethod;
import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RadioButton extends BaseElement {
    public RadioButton(SelenideElement container, String radioName) {
        super(container.as("Переключатель: " + radioName));
    }

    public RadioButton(String radioName) {
        this($("#"+radioName.toLowerCase()+"Radio"), radioName);
    }

    public void click() {
        container.shouldBe(Condition.enabled).click(ClickOptions.usingDefaultMethod());
    }

}

