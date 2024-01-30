package org.example.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DropDown extends BaseElement {
    private final ElementsCollection rows;

    public DropDown(SelenideElement container, String selectName) {
        super(container.as("Выпадающий список: " + selectName));
        rows = this.container.$$("select > option").as("Опции");
    }

    public void selectOption(String optionName) {
        $(".-pageSizeOptions").click();
        rows.find(Condition.text(optionName)).click();
        SelenideElement selenideElement = $(".rt-tbody >:nth-child(" + optionName + ")");
        if(optionName.equals("5")){
            selenideElement.shouldNotBe();
        }else {
            selenideElement.shouldBe();
        }
    }
}
