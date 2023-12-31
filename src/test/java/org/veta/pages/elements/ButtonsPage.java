package org.veta.pages.elements;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ButtonsPage {

    private final static String DYNAMIC_CLICK_MESSAGE = "You have done a dynamic click";
    private final static String RIGHT_CLICK_MESSAGE = "You have done a right click";
    private final static String DOUBLE_CLICK_MESSAGE = "You have done a double click";

    @Step("Нажимаем Buttons")
    public ButtonsPage clickButtons() {
        $(byText("Buttons")).click();
        return this;
    }

    @Step("Нажимаем кнопку Click me")
    public ButtonsPage clickClickMeButton() {
        $(byText("Click Me")).click();
        return this;
    }

    @Step("Проверяем, что появился текст - You have done a dynamic click")
    public ButtonsPage checkDynamicClickMessage() {
        $("#dynamicClickMessage").shouldHave(text(DYNAMIC_CLICK_MESSAGE));
        return this;
    }

    @Step("Нажимаем кнопку Right click me")
    public ButtonsPage clickRightClickMeButton() {
        $("#rightClickBtn").contextClick();
        return this;
    }

    @Step("Проверяем, что появился текст - You have done a right click")
    public ButtonsPage checkRightClickMessage() {
        $("#rightClickMessage").shouldHave(text(RIGHT_CLICK_MESSAGE));
        return this;
    }

    @Step("Нажимаем кнопку Double Click Me")
    public ButtonsPage clickDoubleClickMeButton() {
        $("#doubleClickBtn").doubleClick();
        return this;
    }

    @Step("Проверяем, что появился текст - You have done a double click")
    public void checkDoubleClickMessage() {
        $("#doubleClickMessage").shouldHave(text(DOUBLE_CLICK_MESSAGE));
    }
}


