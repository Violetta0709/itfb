package org.veta.pages.elements;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ElementsPage {

    @Step("Выбираем раздел меню")
    public ElementsPage openElements() {
        open("/elements");
        zoom(0.7);
        return this;
    }

    @Step("Выбираем раздел меню")
    public ElementsPage clickElements(String menuItem) {
        $(byText(menuItem)).click();
        return this;
    }
}


