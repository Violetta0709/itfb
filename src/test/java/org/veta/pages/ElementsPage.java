package org.veta.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ElementsPage {


    @Step("Открываем страницу Elements")
    public ElementsPage openPage() {
        open("/elements");
        return this;
    }

    @Step("Нажимаем Elements")
    public ElementsPage clickElements() {
        $(byText("Elements")).click();
        return this;
    }


    @Step("Нажимаем TextBox")
    public ElementsPage clickTextBox() {
        $("#item-0").click();
        return this;
    }

    @Step("Заполняем имя")
    public ElementsPage fillFullName(String fullName) {
        $("#userName").setValue(fullName);
        return this;
    }

    @Step("Заполняем email")
    public ElementsPage fillEmail(String email) {
        $("#userEmail").setValue(email);
        return this;
    }

    @Step("Заполняем текущий адрес")
    public ElementsPage fillCurrentAddress(String currentAddress) {
        $("#currentAddress").setValue(currentAddress);
        return this;
    }

    @Step("Заполняем постоянный адрес")
    public ElementsPage fillPermanentAddress(String permanentAddress) {
        $("#permanentAddress").setValue(permanentAddress);
        return this;
    }

    @Step("Нажимаем кнопку submit")
    public ElementsPage clickSubmit() {
        $("#submit").click();
        return this;
    }

    @Step("Проверяем, что данные в блоке сохранены корректно")
    public void checkResult() {
        $("#name").shouldHave(text(""));
        $("#email").shouldHave(text(""));
        $$("#currentAddress").last().shouldHave(text(""));
        $$("#permanentAddress").last().shouldHave(text(""));
    }
}


