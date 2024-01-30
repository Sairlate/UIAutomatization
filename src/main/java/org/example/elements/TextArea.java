package org.example.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TextArea extends BaseElement {
    public TextArea(SelenideElement container, String textArea) {
        super(container.as("Текстовое поле: " + textArea));
    }

    public TextArea(String textArea) {
        this($x("//p[text()='" + textArea + "']"), textArea);
    }
}
