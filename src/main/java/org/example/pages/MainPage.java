package org.example.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement elementsPage = $x("[class='card mt-4 top-card']:nth-child(1) .card-body");
    public MainPage(String url){
        Selenide.open(url);
    }

    public void openElemetsPage(){
        elementsPage.click();
    }
}
