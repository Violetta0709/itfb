package org.veta.pages.alerts_frame_windows;

import io.qameta.allure.Step;
import org.veta.pages.elements.ElementsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

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

    public BrowserWindowsPage closeNewWindow() {
        closeWindow();
        return this;
    }

    public BrowserWindowsPage closeNewTab() {
        switchTo().window(1);
        closeWindow();
        return this;
    }

}


