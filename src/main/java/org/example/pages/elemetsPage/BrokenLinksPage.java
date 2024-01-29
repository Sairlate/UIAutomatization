package org.example.pages.elemetsPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BrokenLinksPage {
    private final SelenideElement validImg = $("div.col-12.mt-4.col-md-6 img");
    private final SelenideElement brokenImg = $("div.col-12.mt-4.col-md-6 img");
}
