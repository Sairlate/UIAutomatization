import org.example.pages.MainPage;
import org.example.service.BaseTest;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest {
    @Test
    public void openElementsPage(){
        new MainPage("https://demoqa.com").openElementsPage();
    }
}
