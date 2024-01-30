package org.example.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Link extends BaseElement{
    public Link(SelenideElement container, String linkName) {
        super(container.as("Ссылка: " + linkName));
    }
    public Link(String linkName){
        this($x("//a[text()='"+ linkName +"']"), linkName);
    }

    public void click(){
        container.shouldBe(Condition.visible).click();
    }
}
