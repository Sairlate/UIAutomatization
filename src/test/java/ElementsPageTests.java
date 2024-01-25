import com.codeborne.selenide.WebDriverRunner;
import org.example.pages.elemetsPage.RadioButtonPage;
import org.example.pages.elemetsPage.TextBoxPage;
import org.example.service.Config;
import org.example.pages.MainPage;
import org.example.service.BaseTest;
import org.example.utils.StringBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTests extends BaseTest {
    static Config config = org.aeonbits.owner.ConfigFactory.create(Config.class);
    private final String name = StringBuilder.genLatin(5);
    private final String email = StringBuilder.generateRandomEmail(10);
    private final String currAddress = StringBuilder.genLatin(10);
    private final String permAddress = StringBuilder.genLatin(10);

    @Test
    public void fillTextBoxPage(){
        //Открываем страницу TextBox
        TextBoxPage textBoxPage = new MainPage(config.baseURI()).openElementsPage().openTextBox();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/text-box");

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
        public void RadioButtonWork(){
        RadioButtonPage radioButtonPage = new MainPage(config.baseURI()).openElementsPage().openRadioButton();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),"https://demoqa.com/radio-button");

        radioButtonPage.clickYesButton();
        radioButtonPage.clickImpressiveButton();
        radioButtonPage.clickNoButton();
    }
}
