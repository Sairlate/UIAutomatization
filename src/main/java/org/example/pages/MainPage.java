package org.example.pages;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.pages.alertsPage.AlertsPage;
import org.example.pages.bookStorePage.BookStorePage;
import org.example.pages.elemetsPage.ElementsPage;
import org.example.pages.formsPage.FormsPage;
import org.example.pages.interactionsPage.InteractionsPage;
import org.example.pages.widgetsPage.WidgetsPage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement elementsPage = $("[class='card mt-4 top-card']:nth-child(1)");
    private final SelenideElement formsPage = $("[class='card mt-4 top-card']:nth-child(2)");
    private final SelenideElement alertsPage = $("[class='card mt-4 top-card']:nth-child(3)");
    private final SelenideElement widgetsPage = $("[class='card mt-4 top-card']:nth-child(4)");
    private final SelenideElement interactionsPage = $("[class='card mt-4 top-card']:nth-child(5)");
    private final SelenideElement bookstorePage = $("[class='card mt-4 top-card']:nth-child(6)");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public ElementsPage openElementsPage() {
        elementsPage.click(ClickOptions.withTimeout(Duration.ofSeconds(10)));
        return new ElementsPage();
    }

    public FormsPage openFormsPage() {
        formsPage.click();
        return new FormsPage();
    }

    public AlertsPage openAlertsPage() {
        alertsPage.click();
        return new AlertsPage();
    }

    public WidgetsPage openWidgetsPage() {
        widgetsPage.click();
        return new WidgetsPage();
    }

    public InteractionsPage openInteractionsPage() {
        interactionsPage.click();
        return new InteractionsPage();
    }

    public BookStorePage openBookStorePage() {
        bookstorePage.click();
        return new BookStorePage();
    }
}
