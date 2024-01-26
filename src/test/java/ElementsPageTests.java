import org.example.pages.elemetsPage.*;
import org.example.service.Config;
import org.example.pages.MainPage;
import org.example.service.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ElementsPageTests extends BaseTest {
    static Config config = org.aeonbits.owner.ConfigFactory.create(Config.class);

    @Test
    public void fillTextBoxPage() {
        //Открываем страницу TextBox
        TextBoxPage textBoxPage = new MainPage(config.baseURI()).openElementsPage().openTextBox();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/text-box");

        //В открывшейся странице вносим в поля соответсвующие данные
        TEXT_BOX_PAGE_STEPS.fillBlanks(textBoxPage);

        //Кликаем на кнопку Submit и в появившемся поле сверяем полученные данные с внесенными
        TEXT_BOX_PAGE_STEPS.clickOnSubmitBtn(textBoxPage);
        TEXT_BOX_PAGE_STEPS.checkIfDataAreCorrect(textBoxPage);
    }

    @Test
    public void radioButtonWork() {
        //Открываем страницу RadioButton
        RadioButtonPage radioButtonPage = new MainPage(config.baseURI()).openElementsPage().openRadioButton();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/radio-button");

        //Кликаем по всем кнопкам и проверяем результат
        RADIO_BUTTON_PAGE_STEPS.clickOnEveryPresentedBtn(radioButtonPage);
    }

    @Test
    public void buttonsWork(){
        //Открываем страницу Buttons
        ButtonsPage buttonsPage = new MainPage(config.baseURI()).openElementsPage().openButtons();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/buttons");

        //Кликаем на все кнопки по очереди и проверяем результат
        BUTTONS_PAGE_STEPS.clickOnEveryPresentedBtn(buttonsPage);
    }

    @Test
    public void linksWork() throws InterruptedException {
        //Открываем страницу Links
        LinksPage linksPage = new MainPage(config.baseURI()).openElementsPage().openLinksPage();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/links");
        String originalWindow = getWebDriver().getWindowHandle();

        //Кликаем по ссылкам по очереди, если открылась новая вкладка,
        //переходим обратно на основную и проверяем результат
        LINKS_PAGE_STEPS.clickOnEveryLinkToNewWindow(linksPage, originalWindow);

        //Так же кликаем по ссылкам и проверяем результат
        LINKS_PAGE_STEPS.clickOnEveryLinkOnThisWindow(linksPage);
    }

    @Test
    public void webTablesWork(){
        //Открываем страницу WebTables
        WebTablesPage webTablesPage = new MainPage(config.baseURI()).openElementsPage().openWebTables();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/webtables");

        //Добавляем новые поля
        WEB_TABLES_PAGE_STEPS.addNewRow(webTablesPage,4);
        WEB_TABLES_PAGE_STEPS.clickExitBtn(webTablesPage);
        //Изменяем и удаляем первое поле
        WEB_TABLES_PAGE_STEPS.editRow(webTablesPage);
        WEB_TABLES_PAGE_STEPS.deleteRow(webTablesPage);
        //Меняем количество отображаемых полей и передвигаемся по страницам с помощью кнопок
        WEB_TABLES_PAGE_STEPS.selectNumberOfRows(webTablesPage,"5");
        WEB_TABLES_PAGE_STEPS.clickNextBtn(webTablesPage);
        WEB_TABLES_PAGE_STEPS.clickPreviousBtn(webTablesPage);
        //Передвигаемся по страницам, вводя необходимую страницу
        WEB_TABLES_PAGE_STEPS.changePageNumber(webTablesPage, "2");
        WEB_TABLES_PAGE_STEPS.search(webTablesPage);
    }
}
