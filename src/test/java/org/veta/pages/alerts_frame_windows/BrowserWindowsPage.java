package org.veta.pages.alerts_frame_windows;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BrowserWindowsPage {

    @Step("Нажимаем кнопку Browser Windows")
    public BrowserWindowsPage clickBrowserWindowsButton() {
        open("/browser-windows");
        zoom(0.7);
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


