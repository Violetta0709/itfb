package org.veta.pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    @Step("Открываем страницу Elements")
    public HomePage openPage() {
        open("https://demoqa.com");
        Selenide.zoom(0.7);
        return this;
    }
}


