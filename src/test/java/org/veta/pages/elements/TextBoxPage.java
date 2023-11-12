package org.veta.pages.elements;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TextBoxPage {

    @Step("Нажимаем TextBox")
    public TextBoxPage clickTextBox() {
        $(byText("Text Box")).click();
        return this;
    }

    @Step("Заполняем имя")
    public TextBoxPage fillFullName(String fullName) {
        $("#userName").setValue(fullName);
        return this;
    }

    @Step("Заполняем email")
    public TextBoxPage fillEmail(String email) {
        $("#userEmail").setValue(email);
        return this;
    }

    @Step("Заполняем текущий адрес")
    public TextBoxPage fillCurrentAddress(String currentAddress) {
        $("#currentAddress").setValue(currentAddress);
        return this;
    }

    @Step("Заполняем постоянный адрес")
    public TextBoxPage fillPermanentAddress(String permanentAddress) {
        $("#permanentAddress").setValue(permanentAddress);
        return this;
    }

    @Step("Нажимаем кнопку submit")
    public TextBoxPage clickSubmit() {
        $("#submit").click();
        return this;
    }

    @Step("Проверяем, что имя сохранено корректно")
    public TextBoxPage checkNameSavedCorrect(String name) {
        $("#name").shouldHave(text(name));
        return this;
    }

    @Step("Проверяем, что email сохранен корректно")
    public TextBoxPage checkEmailSavedCorrect(String email) {
        $("#email").shouldHave(text(email));
        return this;
    }

    @Step("Проверяем, что текущий адрес сохранен корректно")
    public TextBoxPage checkCurrentAddressSavedCorrect(String currentAddress) {
        $$("#currentAddress").last().shouldHave(text(currentAddress));
        return this;
    }

    @Step("Проверяем, что постоянный адрес сохранен корректно")
    public void checkPermanentAddressSavedCorrect(String permanentAddress) {
        $$("#permanentAddress").last().shouldHave(text(permanentAddress));
    }
}


