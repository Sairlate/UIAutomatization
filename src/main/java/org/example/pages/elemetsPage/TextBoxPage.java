package org.example.pages.elemetsPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    private final SelenideElement fullName = $("#userName");
    private final SelenideElement email = $("#userEmail");
    private final SelenideElement currentAddress = $("#currentAddress");
    private final SelenideElement permanentAddress = $("#permanentAddress");
    private final SelenideElement submitButton = $("#submit");
    private final SelenideElement output = $("#output");
    private final SelenideElement outputName = $("#output #name");
    private final SelenideElement outputEmail = $("#output #email");
    private final SelenideElement outputCurrentAddress = $("#output #currentAddress");
    private final SelenideElement outputPermanentAddress = $("#output #permanentAddress");

    public void insertFullName(String str) {
        fullName.setValue(str);
    }

    public void insertEmail(String str) {
        email.setValue(str);
    }

    public void insertCurrentAddress(String str) {
        currentAddress.setValue(str);
    }

    public void insertPermanentAddress(String str) {
        permanentAddress.setValue(str);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public void checkOutputIsPresent(String name, String email, String currAddress, String permAddress) {
        if (output.isDisplayed()) {
            outputName.shouldHave(text(name));
            outputEmail.shouldHave(text(email));
            outputCurrentAddress.shouldHave(text(currAddress));
            outputPermanentAddress.shouldHave(text(permAddress));
        }
    }
}
