package org.example.service;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.steps.Steps;
import org.openqa.selenium.PageLoadStrategy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


abstract public class BaseTest implements Steps{
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = String.valueOf(PageLoadStrategy.NONE);
    }

    @BeforeTest
    public void init(){
        setUp();
    }

    @AfterTest
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
