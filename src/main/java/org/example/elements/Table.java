package org.example.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class Table extends BaseElement{
    private final ElementsCollection rows;

    public Table(SelenideElement container, String tableName) {
        super(container.as("Таблица: " + tableName));
        rows = this.container.$$(".rt-tr-group").as("Строки таблицы");
    }

    public void deleteRow(String rowName){
        rows.find(Condition.text(rowName)).$(".action-buttons :nth-child(2)").click();
        rows.find(Condition.text(rowName)).shouldNotBe();
    }

    public void editRow(String rowName){
        rows.find(Condition.text(rowName)).$(".action-buttons :nth-child(1)").click();
    }

    public void findRow(int rowId){
        rows.find(Condition.id(String.valueOf(rowId))).shouldBe();
    }
}
