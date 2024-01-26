package org.example.steps;

import org.example.pages.elemetsPage.WebTablesPage;
import org.example.utils.StringBuilder;

public class WebTablesPageSteps {
    private final String firstName = StringBuilder.genLatin(5);
    private final String lastName = StringBuilder.genLatin(5);
    private final String email = StringBuilder.generateRandomEmail(10);
    private final int age = StringBuilder.genNumeric(2);
    private final int salary = StringBuilder.genNumeric(5);
    private final String department = StringBuilder.genLatin(5);

    public void addNewRow(WebTablesPage webTablesPage, int quantity){
        for (int i = 0; i < quantity; i++) {
            webTablesPage.clickAdd();
            webTablesPage.insertFirstName(firstName);
            webTablesPage.insertLastName(lastName);
            webTablesPage.insertEmail(email);
            webTablesPage.insertAge(age);
            webTablesPage.insertSalary(salary);
            webTablesPage.insertDepartment(department);
            webTablesPage.clickSubmit();
        }
    }
    public void search(WebTablesPage webTablesPage){
        webTablesPage.insertSearchText(firstName);
    }

    public void editRow(WebTablesPage webTablesPage){
        webTablesPage.clickEditRow("qwerty");
    }

    public void deleteRow(WebTablesPage webTablesPage){
        webTablesPage.clickDeleteRow();
    }

    public void selectNumberOfRows(WebTablesPage webTablesPage, String str){
        webTablesPage.selectNumberOfRows(str);
    }

    public void clickNextBtn(WebTablesPage webTablesPage){
        webTablesPage.clickNext();
    }

    public void clickPreviousBtn(WebTablesPage webTablesPage){
        webTablesPage.clickPrevious();
    }

    public void clickExitBtn(WebTablesPage webTablesPage){
        webTablesPage.clickExitBtn();
    }

    public void changePageNumber(WebTablesPage webTablesPage, String str){
        webTablesPage.changePageNumber(str);
    }
}
