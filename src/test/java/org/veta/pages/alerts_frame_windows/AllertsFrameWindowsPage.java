package org.veta.pages.alerts_frame_windows;

import io.qameta.allure.Step;
import org.veta.pages.elements.ElementsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AllertsFrameWindowsPage extends ElementsPage {

    @Step("Нажимаем Alerts, Frame & Windows")
    public AllertsFrameWindowsPage clickAlertsFramesWindowsButton() {
        open("/elements");
        zoom(0.7);
        $(byText("Alerts, Frame & Windows")).scrollIntoView(true).click();
        return this;
    }
}


