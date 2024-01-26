package org.example.steps;

import org.example.pages.elemetsPage.LinksPage;

public class LinksPageSteps {
    public void clickOnEveryLinkToNewWindow(LinksPage linksPage, String originalWindow) throws InterruptedException {
        linksPage.clickOnHomeLink(originalWindow);
        linksPage.clickOnDynamicHomeLink(originalWindow);
    }
    public void clickOnEveryLinkOnThisWindow(LinksPage linksPage){
        linksPage.clickOnCreated();
        linksPage.clickOnNoContent();
        linksPage.clickOnMoved();
        linksPage.clickOnBadRequest();
        linksPage.clickOnUnauthorized();
        linksPage.clickOnForbidden();
        linksPage.clickOnNotFound();
    }
}
