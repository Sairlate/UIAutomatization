package org.example.pages.elemetsPage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage {
    private final SelenideElement textBoxPage = $("#item-0");
    private final SelenideElement checkBoxPage = $("#item-1");
    private final SelenideElement radioButtonPage = $("#item-2");
    private final SelenideElement webTablesPage = $("#item-3");
    private final SelenideElement buttonsPage = $("#item-4");
    private final SelenideElement linksPage = $("#item-5");
    private final SelenideElement brokenLinksPage = $("#item-6");
    private final SelenideElement uploadPage = $("#item-7");
    private final SelenideElement propertiesPage = $("#item-8");


    public ElementsPage(){
    }

    public TextBoxPage openTextBox(){
        textBoxPage.click();
        return new TextBoxPage();
    }

    public CheckBoxPage openCheckBox(){
        checkBoxPage.click();
        return new CheckBoxPage();
    }

    public RadioButtonPage openRadioButton(){
        radioButtonPage.click();
        return new RadioButtonPage();
    }

    public WebTablesPage openWebTables(){
        webTablesPage.click();
        return new WebTablesPage();
    }

    public ButtonsPage openButtons(){
        buttonsPage.click();
        return new ButtonsPage();
    }

    public LinksPage openLinksPage(){
        linksPage.click();
        return new LinksPage();
    }

    public BrokenLinksPage openBrokenLinksPage(){
        brokenLinksPage.click();
        return new BrokenLinksPage();
    }

    public UploadPage openUploadPage(){
        uploadPage.click();
        return new UploadPage();
    }

    public PropertiesPage openPropertiesPage(){
        propertiesPage.click();
        return new PropertiesPage();
    }
}
