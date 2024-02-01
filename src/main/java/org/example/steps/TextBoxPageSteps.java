package org.example.steps;
import org.example.pages.BasePage;
import org.example.pages.elemetsPage.frames.TextBoxFrame;
import org.example.utils.StringBuilder;

public class TextBoxPageSteps extends BasePage {
    public void fillBlanks(String name, String email, String currAddress, String permAddress){
        elementsPage.textBoxFrame.insertFullName(name);
        elementsPage.textBoxFrame.insertEmail(email);
        elementsPage.textBoxFrame.insertCurrentAddress(currAddress);
        elementsPage.textBoxFrame.insertPermanentAddress(permAddress);
    }
    public void clickOnSubmitBtn(){
        elementsPage.textBoxFrame.clickOnSubmitButton();
    }
    public void checkIfDataAreCorrect(String name, String email, String currAddress, String permAddress){
        elementsPage.textBoxFrame.checkOutputIsPresent(name, email, currAddress, permAddress);
    }
}
