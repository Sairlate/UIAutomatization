package org.example.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;

public abstract class BaseElement {
    protected SelenideElement container;

    public BaseElement(SelenideElement container) {
        this.container = container;
    }

    public void isVisible(Boolean isVisible) {
        if (isVisible) {
            container.shouldBe(visible);
        } else {
            container.shouldNotBe(visible);
        }
    }

    public void isEnabled(Boolean isEnabled) {
        if (isEnabled) {
            container.shouldBe(enabled);
        } else {
            container.shouldBe(disabled);
        }
    }

    public void isDisplayed(Boolean isDisplayed) {
        if (isDisplayed) {
            container.isDisplayed();
        } else {
            container.shouldNotBe().isDisplayed();
        }
    }

    public String getText() {
        return container.text();
    }

    public String getValue() {
        return container.getValue();
    }

}
