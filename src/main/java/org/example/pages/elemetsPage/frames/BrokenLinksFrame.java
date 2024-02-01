package org.example.pages.elemetsPage.frames;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.elements.Link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;

public class BrokenLinksFrame {
    private final SelenideElement validImg = $(".col-12.mt-4.col-md-6 img[src='/images/Toolsqa.jpg']");
    private final SelenideElement brokenImg = $(".col-12.mt-4.col-md-6 img[src='/images/Toolsqa_1.jpg']");
    private final Link validLink = new Link("Click Here for Valid Link");
    private final SelenideElement brokenLink = $("a[href='http://the-internet.herokuapp.com/status_codes/500']");

    public void checkValidImg(){
        validImg.shouldBe(Condition.image);
    }
    public void checkBrokenImg(){
        brokenImg.shouldNotBe(Condition.image);
    }
    public void checkValidLink(String window){
        validLink.click();
        Selenide.sleep(1000);
        for(String windowHandle : getWebDriver().getWindowHandles()){
            if(!windowHandle.equals(window)) {
                getWebDriver().switchTo().window(windowHandle);
                assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/", "URL не соответствует ожидаемому значению");
            }
        }
        getWebDriver().navigate().back();
    }
    public void checkBrokenLink() throws IOException {
        String url = brokenLink.getAttribute("href");
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "is a broken link");
        }
    }
}
