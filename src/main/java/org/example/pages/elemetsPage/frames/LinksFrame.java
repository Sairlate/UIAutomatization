package org.example.pages.elemetsPage.frames;

import com.codeborne.selenide.SelenideElement;
import org.example.elements.Link;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LinksFrame {
    private final Link homeLink = new Link("Home");
    private final SelenideElement dynamicHomeLink = $("#dynamicLink");
    private final Link created = new Link("Created");
    private final Link noContent = new Link("No Content");
    private final Link moved = new Link("Moved");
    private final Link badRequest = new Link("Bad Request");
    private final Link unauthorized = new Link("Unauthorized");
    private final Link forbidden = new Link("Forbidden");
    private final Link notFound = new Link("Not Found");
    private final SelenideElement linkResponse = $("#linkResponse");

    public void clickOnHomeLink(String window) throws InterruptedException {
        homeLink.click();
        Thread.sleep(1000);
        for(String windowHandle : getWebDriver().getWindowHandles()){
            if(!windowHandle.equals(window)) {
                getWebDriver().switchTo().window(windowHandle);
                Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/", "URL не соответствует ожидаемому значению");
            }
        }
        getWebDriver().switchTo().window(window);
    }

    public void clickOnDynamicHomeLink(String window) throws InterruptedException {
        dynamicHomeLink.click();
        Thread.sleep(1000);
        for(String windowHandle : getWebDriver().getWindowHandles()){
            if(!windowHandle.equals(window)) {
                getWebDriver().switchTo().window(windowHandle);
                Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/", "URL не соответствует ожидаемому значению");
            }
        }
        getWebDriver().switchTo().window(window);
    }

    public void clickOnCreated(){
        created.click();
        linkResponse.shouldHave(text("Created"));
    }

    public void clickOnNoContent(){
        noContent.click();
        linkResponse.shouldHave(text("No Content"));
    }

    public void clickOnMoved(){
        moved.click();
        linkResponse.shouldHave(text("Moved"));
    }

    public void clickOnBadRequest(){
        badRequest.click();
        linkResponse.shouldHave(text("Bad Request"));
    }

    public void clickOnUnauthorized(){
        unauthorized.click();
        linkResponse.shouldHave(text("Unauthorized"));
    }

    public void clickOnForbidden(){
        forbidden.click();
        linkResponse.shouldHave(text("Forbidden"));
    }

    public void clickOnNotFound(){
        notFound.click();
        linkResponse.shouldHave(text("Not Found"));
    }
}
