package org.example.service;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.BasePage;
import org.example.steps.Steps;
import org.openqa.selenium.PageLoadStrategy;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;


abstract public class BaseTest extends BasePage implements Steps{

    static Config config = org.aeonbits.owner.ConfigFactory.create(Config.class);
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = config.baseURI();
        Configuration.pageLoadStrategy = String.valueOf(PageLoadStrategy.NONE);
        Configuration.timeout = 8000;
        Configuration.webdriverLogsEnabled = true;
        Configuration.fastSetValue = false;
        Configuration.headless = false;
    }

    @BeforeMethod
    public void init(){
        open("https://demoqa.com/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
