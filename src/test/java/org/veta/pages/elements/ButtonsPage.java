package org.veta.pages.elements;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ButtonsPage extends ElementsPage {

    private final static String DYNAMIC_CLICK_MESSAGE = "You have done a dynamic click";
    private final static String RIGHT_CLICK_MESSAGE = "You have done a right click";
    private final static String DOUBLE_CLICK_MESSAGE = "You have done a double click";

    @Step("Нажимаем Buttons")
    public ButtonsPage clickButtons() {
        open("/buttons");
        $("#item-4").click();
        return this;
    }

    @Step("Нажимаем кнопку Click me")
    public ButtonsPage clickClickButton() {
        $(byText("Click Me")).click();
        return this;
    }

    @Step("Проверяем, что появился текст - You have done a dynamic click")
    public ButtonsPage checkDynamicClickMessage() {
        $("#dynamicClickMessage").shouldHave(text(DYNAMIC_CLICK_MESSAGE));
        return this;
    }

    @Step("Нажимаем кнопку Right click me")
    public ButtonsPage clickRightClickButton() {
        $(byText("Right Click Me")).contextClick();
        return this;
    }

    @Step("Проверяем, что появился текст - You have done a right click")
    public ButtonsPage checkRightClickMessage() {
        $("#rightClickMessage").shouldHave(text(RIGHT_CLICK_MESSAGE));
        return this;
    }

    @Step("Нажимаем кнопку Double Click Me")
    public ButtonsPage clickDoubleClickButton() {
        $(byText("Double Click Me")).doubleClick();
        return this;
    }

    @Step("Проверяем, что появился текст - You have done a double click")
    public ButtonsPage checkDoubleClickMessage() {
        $("#doubleClickMessage").shouldHave(text(DOUBLE_CLICK_MESSAGE));
        return this;
    }
}


