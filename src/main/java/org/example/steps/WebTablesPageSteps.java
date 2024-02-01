package org.example.steps;

import org.example.elements.BaseElement;
import org.example.pages.BasePage;
import org.example.pages.elemetsPage.frames.WebTablesFrame;
import org.example.utils.StringBuilder;

public class WebTablesPageSteps extends BasePage {

    public void addNewRow(int quantity, String firstName, String lastName, String email, int age, int salary, String department) {
        for (int i = 0; i < quantity; i++) {
            elementsPage.webTablesFrame.clickAdd();
            elementsPage.webTablesFrame.insertFirstName(firstName);
            elementsPage.webTablesFrame.insertLastName(lastName);
            elementsPage.webTablesFrame.insertEmail(email);
            elementsPage.webTablesFrame.insertAge(age);
            elementsPage.webTablesFrame.insertSalary(salary);
            elementsPage.webTablesFrame.insertDepartment(department);
            elementsPage.webTablesFrame.clickSubmit();
        }
    }

    public void search(String firstName) {
        elementsPage.webTablesFrame.insertSearchText(firstName);
    }

    public void editRow() {
        elementsPage.webTablesFrame.clickEditRow("qwerty");
    }

    public void deleteRow() {
        elementsPage.webTablesFrame.clickDeleteRow();
    }

    public void selectNumberOfRows(String str) {
        elementsPage.webTablesFrame.selectNumberOfRows(str);
    }

    public void clickNextBtn() {
        elementsPage.webTablesFrame.clickNext();
    }

    public void clickPreviousBtn() {
        elementsPage.webTablesFrame.clickPrevious();
    }

    public void clickExitBtn() {
        elementsPage.webTablesFrame.clickExitBtn();
    }

    public void changePageNumber(String str) {
        elementsPage.webTablesFrame.changePageNumber(str);
    }
}
