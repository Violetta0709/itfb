package org.veta.pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.veta.pages.elements.ElementsPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    @Step("Открываем страницу Elements")
    public HomePage openPage() {
        open("https://demoqa.com");
        Selenide.zoom(0.7);
        return this;
    }
}


