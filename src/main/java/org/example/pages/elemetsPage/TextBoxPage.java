package org.example.pages.elemetsPage;

import com.codeborne.selenide.SelenideElement;
import org.example.elements.Button;
import org.example.elements.Input;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    private final Input fullName = new Input("Full Name");
    private final Input email = new Input("name@example.com");
    private final Input currentAddress = new Input("Current Address");
    private final SelenideElement permanentAddress = $("#permanentAddress");
    private final Button submitButton = new Button("Submit");
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
