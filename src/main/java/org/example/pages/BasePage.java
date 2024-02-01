package org.example.pages;

import org.example.elements.Menu;
import org.example.pages.elemetsPage.ElementsPage;
import org.example.service.Config;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public Menu menu = new Menu($(".accordion"));
    public ElementsPage elementsPage = new ElementsPage();
    public MainPage mainPage = new MainPage();
}
