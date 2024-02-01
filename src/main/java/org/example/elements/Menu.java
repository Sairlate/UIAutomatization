package org.example.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class Menu extends BaseElement{
    private final ElementsCollection items;
    public Menu(SelenideElement container) {
        super(container);
        items = $$(".element-group .menu-list [class]");
    }

    public void openFrame(String frameName) {
        for (SelenideElement item : items) {
            if (item.text().equals(frameName)) item.click();
        }
    }
}
