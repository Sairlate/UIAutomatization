package org.example.pages.elemetsPage.frames;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BrokenLinksFrame {
    private final SelenideElement validImg = $("div.col-12.mt-4.col-md-6 img");
    private final SelenideElement brokenImg = $("div.col-12.mt-4.col-md-6 img");
}
