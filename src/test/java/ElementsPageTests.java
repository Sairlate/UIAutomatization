import org.example.pages.elemetsPage.ButtonsPage;
import org.example.pages.elemetsPage.LinksPage;
import org.example.pages.elemetsPage.RadioButtonPage;
import org.example.pages.elemetsPage.TextBoxPage;
import org.example.service.Config;
import org.example.pages.MainPage;
import org.example.service.BaseTest;
import org.example.utils.StringBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ElementsPageTests extends BaseTest {
    static Config config = org.aeonbits.owner.ConfigFactory.create(Config.class);
    private final String name = StringBuilder.genLatin(5);
    private final String email = StringBuilder.generateRandomEmail(10);
    private final String currAddress = StringBuilder.genLatin(10);
    private final String permAddress = StringBuilder.genLatin(10);

    @Test
    public void fillTextBoxPage() {
        //Открываем страницу TextBox
        TextBoxPage textBoxPage = new MainPage(config.baseURI()).openElementsPage().openTextBox();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/text-box");

        //В открывшейся странице вносим в поля соответсвующие данные
        textBoxPage.insertFullName(name);
        textBoxPage.insertEmail(email);
        textBoxPage.insertCurrentAddress(currAddress);
        textBoxPage.insertPermanentAddress(permAddress);

        //Кликаем на кнопку Submit и в появившемся поле сверяем полученные данные с внесенными
        textBoxPage.clickOnSubmitButton();
        textBoxPage.checkOutputIsPresent(name, email, currAddress, permAddress);
    }

    @Test
    public void RadioButtonWork() {
        //Открываем страницу RadioButton
        RadioButtonPage radioButtonPage = new MainPage(config.baseURI()).openElementsPage().openRadioButton();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/radio-button");

        //Кликаем по всем кнопкам и проверяем результат
        radioButtonPage.clickYesButton();
        radioButtonPage.clickImpressiveButton();
        radioButtonPage.clickNoButton();
    }

    @Test
    public void ButtonsWork(){
        //Открываем страницу Buttons
        ButtonsPage buttonsPage = new MainPage(config.baseURI()).openElementsPage().openButtons();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/buttons");

        //Кликаем на все кнопки по очереди и проверяем результат
        buttonsPage.clickDoubleClickButton();
        buttonsPage.clickRightClickButton();
        buttonsPage.clickDynamicButton();
    }

    @Test
    public void LinksWork() throws InterruptedException {
        //Открываем страницу Links
        LinksPage linksPage = new MainPage(config.baseURI()).openElementsPage().openLinksPage();
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "https://demoqa.com/links");
        String originalWindow = getWebDriver().getWindowHandle();

        //Кликаем по всем ссылкам по очереди, если открылась новая вкладка,
        //переходим обратно на основную и проверяем результат
        linksPage.clickOnHomeLink(originalWindow);
        linksPage.clickOnDynamicHomeLink(originalWindow);
        linksPage.clickOnCreated();
        linksPage.clickOnNoContent();
        linksPage.clickOnMoved();
        linksPage.clickOnBadRequest();
        linksPage.clickOnUnauthorized();
        linksPage.clickOnForbidden();
        linksPage.clickOnNotFound();
    }
}
