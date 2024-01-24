package org.example.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement elementsPage = $("[class='card mt-4 top-card']:nth-child(1)");
    public MainPage(String url){
        Selenide.open(url);
    }

    public ElementsPage openElementsPage(){
        elementsPage.click();
        return new ElementsPage();
    }
}
