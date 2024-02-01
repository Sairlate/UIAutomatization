package org.example.elements;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Card extends BaseElement {
    public Card(SelenideElement container, String cardName) {
        super(container.as("Карточка страницы: " + cardName));
    }

    public Card(String cardName) {
        this($x("//*[text()='" + cardName + "']//ancestor::div[@class='card mt-4 top-card']"), cardName);
    }

    public void cardClick() {
        container.click();
    }
}
