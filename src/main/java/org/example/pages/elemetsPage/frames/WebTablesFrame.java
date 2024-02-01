package org.example.pages.elemetsPage.frames;

import com.codeborne.selenide.SelenideElement;
import org.example.elements.*;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesFrame {
    private final Button addBtn = new Button("Add");
    private final Input firstName = new Input("First Name");
    private final Input lastName = new Input("Last Name");
    private final Input email = new Input("name@example.com");
    private final Input age = new Input("Age");
    private final Input salary = new Input("Salary");
    private final Input department = new Input("Department");
    private final Button submitBtn = new Button("Submit");
    private final Input search = new Input("Type to search");
    private final Table row = new Table($(".rt-tbody"), "Table");
    private final Button previousBtn = new Button("Previous");
    private final Button nextBtn = new Button("Next");
    private final DropDown selectWrap = new DropDown($(".-pageSizeOptions"), "Rows");
    private final SelenideElement exitBtn = $(".close");

    private final SelenideElement popup = $(".modal-dialog");

    private final SelenideElement pageNumber = $("input[type=number]");


    public void clickAdd(){
        addBtn.click();
    }
    public void insertFirstName(String str){
         firstName.setValue(str);
    }
    public void insertLastName(String str){
         lastName.setValue(str);
    }
    public void insertEmail(String str){
         email.setValue(str);
    }
    public void insertAge(int i){
         age.setValue(String.valueOf(i));
    }
    public void insertSalary(int i){
         salary.setValue(""+i);
    }
    public void insertDepartment(String str){
         department.setValue(str);
    }
    public void clickSubmit(){
        submitBtn.click();
    }
    public void insertSearchText(String str){
        search.setValue(str);
        row.findRow(1);
    }
    public void clickEditRow(String str){
        row.editRow("Cierra");
        firstName.setValue(str);
        submitBtn.click();
        row.findRow(1);;
    }
    public void clickDeleteRow(){
        row.deleteRow("Vega");
    }
    public void selectNumberOfRows(String str){
        selectWrap.selectOption(str);
    }
    public void clickNext(){
        nextBtn.click();
    }
    public void clickPrevious(){
        previousBtn.click();
    }
    public void clickExitBtn(){
        addBtn.click();
        exitBtn.click();
        popup.shouldNotBe();
    }
    public void changePageNumber(String str){
        if(Objects.equals($(".-totalPages").getValue(), str)){
            pageNumber.setValue(str);
        }
    }

}
