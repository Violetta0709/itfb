package org.veta.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UserAgreementPage {

    private SelenideElement
            link = $("a[href*='https://sberlogistics.ru/uploads/documents/Пользовательское_соглашение.pdf']");

    public SelenideElement getLink() {
        return link;
    }

    public void setLink(SelenideElement link) {
        this.link = link;
    }

    public UserAgreementPage openPage() {
        open("/about/documents/terms_of_use");
        return this;
    }
}


