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

    public SelenideElement insertFullName(String str) {
        return fullName.setValue(str);
    }

    public SelenideElement insertEmail(String str) {
        return email.setValue(str);
    }

    public SelenideElement insertCurrentAddress(String str) {
        return currentAddress.setValue(str);
    }

    public SelenideElement insertPermanentAddress(String str) {
        return permanentAddress.setValue(str);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public boolean checkOutputIsPresent(String name, String email, String currAddress, String permAddress) {
        if (output.isDisplayed()) {
            outputName.shouldHave(text(name));
            outputEmail.shouldHave(text(email));
            outputCurrentAddress.shouldHave(text(currAddress));
            outputPermanentAddress.shouldHave(text(permAddress));
            return true;
        } else {
            return false;
        }
    }
}
