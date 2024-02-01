package org.example.pages;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.elements.Card;
import org.example.pages.alertsPage.AlertsPage;
import org.example.pages.bookStorePage.BookStorePage;
import org.example.pages.elemetsPage.ElementsPage;
import org.example.pages.formsPage.FormsPage;
import org.example.pages.interactionsPage.InteractionsPage;
import org.example.pages.widgetsPage.WidgetsPage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public Card elementsCard = new Card("Elements");
}
