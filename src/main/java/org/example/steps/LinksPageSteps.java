package org.example.steps;

import org.example.pages.BasePage;
import org.example.pages.elemetsPage.frames.LinksFrame;

public class LinksPageSteps extends BasePage {
    public void clickOnEveryLinkToNewWindow(String originalWindow) throws InterruptedException {
        elementsPage.linksFrame.clickOnHomeLink(originalWindow);
        elementsPage.linksFrame.clickOnDynamicHomeLink(originalWindow);
    }
    public void clickOnEveryLinkOnThisWindow(){
        elementsPage.linksFrame.clickOnCreated();
        elementsPage.linksFrame.clickOnNoContent();
        elementsPage.linksFrame.clickOnMoved();
        elementsPage.linksFrame.clickOnBadRequest();
        elementsPage.linksFrame.clickOnUnauthorized();
        elementsPage.linksFrame.clickOnForbidden();
        elementsPage.linksFrame.clickOnNotFound();
    }
}
