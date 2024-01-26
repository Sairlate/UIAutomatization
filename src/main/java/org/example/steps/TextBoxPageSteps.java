package org.example.steps;
import org.example.pages.elemetsPage.TextBoxPage;
import org.example.utils.StringBuilder;

public class TextBoxPageSteps {
    private final String name = StringBuilder.genLatin(5);
    private final String email = StringBuilder.generateRandomEmail(10);
    private final String currAddress = StringBuilder.genLatin(10);
    private final String permAddress = StringBuilder.genLatin(10);
    public void fillBlanks(TextBoxPage textBoxPage){
        textBoxPage.insertFullName(name);
        textBoxPage.insertEmail(email);
        textBoxPage.insertCurrentAddress(currAddress);
        textBoxPage.insertPermanentAddress(permAddress);
    }
    public void clickOnSubmitBtn(TextBoxPage textBoxPage){
        textBoxPage.clickOnSubmitButton();
    }
    public void checkIfDataAreCorrect(TextBoxPage textBoxPage){
        textBoxPage.checkOutputIsPresent(name, email, currAddress, permAddress);
    }
}
