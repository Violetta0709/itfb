package org.veta.pages.alerts_frame_windows;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class AlertsPage {

    @Step("Нажимаем кнопку Alerts")
    public AlertsPage clickAlertsButton() {
        $(byText("Alerts")).click();
        return this;
    }

    @Step("Нажимаем Click me рядом с Click button to see alert")
    public AlertsPage clickButtonToSeeAlert() {
        $("#alertButton").click();
        return this;
    }

    @Step("Нажимаем Click me рядом с On button click, alert will appear after 5 seconds")
    public AlertsPage clickButtonToSeeAlertAfterFiveSec() {
        $("#timerAlertButton").click();
        sleep(5000);
        return this;
    }

    @Step("Нажимаем Click me рядом с On button click, confirm box will appear")
    public AlertsPage clickButtonConfirmBoxAppear() {
        $("#confirmButton").click();
        return this;
    }

    @Step("Нажимаем Click me рядом с On button click, prompt box will appear")
    public AlertsPage clickButtonPromptBoxAppear() {
        $("#promtButton").click();
        return this;
    }

    @Step("Заполняем поле в уведомлении данными")
    public AlertsPage fillDataInPromptBox(String name) {
        Selenide.prompt(name);
        return this;
    }

    @Step("Проверяем текст уведомления после нажатия ок в confirm box")
    public AlertsPage checkConfirmBoxOkMessage() {
        $("#confirmResult").shouldHave(text("You selected Ok"));
        return this;
    }

    @Step("Проверяем текст уведомления после заполнения prompt box")
    public void checkPromptBoxMessage() {
        $("#promptResult").shouldHave(text("You entered Test name"));
    }

    @Step("Закрываем уведомление")
    public AlertsPage closeNotification() {
        Selenide.confirm();
        return this;
    }
}


