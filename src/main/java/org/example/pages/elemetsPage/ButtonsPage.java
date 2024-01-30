package org.example.pages.elemetsPage;

import com.codeborne.selenide.SelenideElement;
import org.example.elements.Button;
import org.example.elements.TextArea;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage {
    private final Button doubleClickButton = new Button("Double Click Me");
    private final Button rightClickButton = new Button("Right Click Me");
    private final Button clickButton = new Button("Click Me");
    private final TextArea doubleClickMessage = new TextArea("You have done a double click");
    private final TextArea rightClickMessage = new TextArea("You have done a right click");
    private final TextArea dynamicClickMessage = new TextArea("You have done a dynamic click");


    public void clickDoubleClickButton(){
        doubleClickButton.doubleClick();
        doubleClickMessage.isVisible(true);
    }

    public void clickRightClickButton(){
        rightClickButton.contextClick();
        rightClickMessage.isVisible(true);
    }

    public void clickDynamicButton(){
        clickButton.click();
        dynamicClickMessage.isVisible(true);
    }

}
