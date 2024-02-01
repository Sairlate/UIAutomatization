package org.example.steps;

import org.example.pages.BasePage;

import java.io.IOException;

public class BrokenLinksSteps extends BasePage {
    public void checkAllPresentedImg(){
        elementsPage.brokenLinksFrame.checkValidImg();
        elementsPage.brokenLinksFrame.checkBrokenImg();
    }
    public void checkAllPresentedLinks(String window){
        elementsPage.brokenLinksFrame.checkValidLink(window);
        try {
            elementsPage.brokenLinksFrame.checkBrokenLink();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
