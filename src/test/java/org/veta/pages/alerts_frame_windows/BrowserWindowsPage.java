package org.veta.pages.alerts_frame_windows;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BrowserWindowsPage {

    @Step("Нажимаем Alerts, Frame & Windows")
    public BrowserWindowsPage clickAlertsFrameWindowsButton() {
        zoom(0.7);
        $(byText("Alerts, Frame & Windows")).scrollIntoView(true).click();
        return this;
    }

    @Step("Нажимаем кнопку Browser Windows")
    public BrowserWindowsPage clickBrowserWindowsButton() {
        $(byText("Browser Windows")).click();
        return this;
    }

    @Step("Нажимаем кнопку New Tab")
    public BrowserWindowsPage clickNewTabButton() {
        $("#tabButton").click();
        return this;
    }

    @Step("Нажимаем кнопку New Window")
    public BrowserWindowsPage clickNewWindowButton() {
        $("#windowButton").click();
        return this;
    }

    @Step("Закрываем новое окно/таб")
    public BrowserWindowsPage closeNewTab_Or_Window() {
        switchTo().window(1).close();
        switchTo().window(0);
        return this;
    }
}


