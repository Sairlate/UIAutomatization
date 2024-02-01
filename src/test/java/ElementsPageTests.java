import org.example.service.BaseTest;
import org.example.utils.StringBuilder;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ElementsPageTests extends BaseTest {
    private String firstName, lastName, email, department, currAddress, permAddress;
    private int age, salary;

    @BeforeMethod
    public void generateData(){
        firstName = StringBuilder.genLatin(5);
        lastName = StringBuilder.genLatin(5);
        email = StringBuilder.generateRandomEmail(10);
        age = StringBuilder.genNumeric(2);
        salary = StringBuilder.genNumeric(5);
        department = StringBuilder.genLatin(5);
        currAddress = StringBuilder.genLatin(10);
        permAddress = StringBuilder.genLatin(10);
    }

    @Test
    public void fillTextBoxPage() {
        //Открываем страницу TextBox
        mainPage.elementsCard.cardClick();
        menu.openFrame("Text Box");

        //В открывшейся странице вносим в поля соответсвующие данные
        TEXT_BOX_PAGE_STEPS.fillBlanks(firstName, email, currAddress, permAddress);

        //Кликаем на кнопку Submit и в появившемся поле сверяем полученные данные с внесенными
        TEXT_BOX_PAGE_STEPS.clickOnSubmitBtn();
        TEXT_BOX_PAGE_STEPS.checkIfDataAreCorrect(firstName, email, currAddress, permAddress);
    }

    @Test
    public void radioButtonWork() {
        //Открываем страницу RadioButton
        mainPage.elementsCard.cardClick();
        menu.openFrame("Radio Button");

        //Кликаем по всем кнопкам и проверяем результат
        RADIO_BUTTON_PAGE_STEPS.clickOnEveryPresentedBtn();
    }

    @Test
    public void buttonsWork(){
        //Открываем страницу Buttons
        mainPage.elementsCard.cardClick();
        menu.openFrame("Buttons");

        //Кликаем на все кнопки по очереди и проверяем результат
        BUTTONS_PAGE_STEPS.clickOnEveryPresentedBtn();
    }

    @Test
    public void linksWork() throws InterruptedException {
        //Открываем страницу Links
        mainPage.elementsCard.cardClick();
        menu.openFrame("Links");
        String originalWindow = getWebDriver().getWindowHandle();

        //Кликаем по ссылкам по очереди, если открылась новая вкладка,
        //переходим обратно на основную и проверяем результат
        LINKS_PAGE_STEPS.clickOnEveryLinkToNewWindow(originalWindow);

        //Так же кликаем по ссылкам и проверяем результат
        LINKS_PAGE_STEPS.clickOnEveryLinkOnThisWindow();
    }

    @Test
    public void webTablesWork(){
        //Открываем страницу WebTables
        mainPage.elementsCard.cardClick();
        menu.openFrame("Web Tables");

        //Добавляем новые поля
        WEB_TABLES_PAGE_STEPS.addNewRow(4, firstName, lastName, email, age, salary, department);
        WEB_TABLES_PAGE_STEPS.clickExitBtn();
        //Изменяем и удаляем первое поле
        WEB_TABLES_PAGE_STEPS.editRow();
        WEB_TABLES_PAGE_STEPS.deleteRow();
        //Меняем количество отображаемых полей и передвигаемся по страницам с помощью кнопок
        WEB_TABLES_PAGE_STEPS.selectNumberOfRows("5");
        WEB_TABLES_PAGE_STEPS.clickNextBtn();
        WEB_TABLES_PAGE_STEPS.clickPreviousBtn();
        //Передвигаемся по страницам, вводя необходимую страницу
        WEB_TABLES_PAGE_STEPS.changePageNumber("2");
        WEB_TABLES_PAGE_STEPS.search(firstName);
    }
}
