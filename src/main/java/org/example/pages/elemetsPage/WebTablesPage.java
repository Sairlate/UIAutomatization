package org.example.pages.elemetsPage;

import com.codeborne.selenide.SelenideElement;

import java.util.Objects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage {
    private final SelenideElement addBtn = $("#addNewRecordButton");
    private final SelenideElement firstName = $("#firstName");
    private final SelenideElement lastName = $("#lastName");
    private final SelenideElement email = $("#userEmail");
    private final SelenideElement age = $("#age");
    private final SelenideElement salary = $("#salary");
    private final SelenideElement department = $("#department");
    private final SelenideElement submitBtn = $("#submit");
    private final SelenideElement search = $("#searchBox");
    private final SelenideElement row = $("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > " +
            "div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > div");
    private final SelenideElement editBtn = $("#edit-record-");
    private final SelenideElement deleteBtn = $("#delete-record-");
    private final SelenideElement previousBtn = $("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > " +
            "div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.pagination-bottom > div > div.-previous > button");
    private final SelenideElement nextBtn = $("#app > div > div > div.row > " +
            "div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.pagination-bottom" +
            " > div > div.-next > button");
    private final SelenideElement selectWrap = $("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > " +
            "div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.pagination-bottom > div > div.-center > " +
            "span.select-wrap.-pageSizeOptions > select");
    private final SelenideElement exitBtn = $("body > div.fade.modal.show > div > div > div.modal-header > button");

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
        $("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table" +
                " > div.rt-tbody > div:nth-child(1) > div").shouldHave(text(str));
    }
    public void clickEditRow(String str){
        $(editBtn.getSearchCriteria()+"1").click();
        firstName.setValue(str);
        submitBtn.click();
        $("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.rt-table" +
                " > div.rt-tbody > div:nth-child(1) > div").shouldHave(text(str));
    }
    public void clickDeleteRow(){
        $(deleteBtn.getSearchCriteria()+"1").click();
    }
    public void selectNumberOfRows(String str){
        selectWrap.click();
        switch (str){
            case "5":
                selectWrap.selectOptionByValue("5");
                row.$(":nth-child(6)").shouldNotBe();
                break;
            case "10":
                selectWrap.selectOptionByValue("10");
                row.$(":nth-child(10)").shouldBe();
                break;
            case "20":
                selectWrap.selectOptionByValue("20");
                row.$(":nth-child(20)").shouldBe();
                break;
            case "25":
                selectWrap.selectOptionByValue("25");
                row.$(":nth-child(25)").shouldBe();
                break;
            case "50":
                selectWrap.selectOptionByValue("50");
                row.$(":nth-child(50)").shouldBe();
                break;
            case "100":
                selectWrap.selectOptionByValue("100");
                row.$(":nth-child(100)").shouldBe();
                break;
        }


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
