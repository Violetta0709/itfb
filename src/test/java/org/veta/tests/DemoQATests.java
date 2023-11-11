package org.veta.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.veta.pages.ElementsPage;

import static org.veta.tests.TestData.*;

public class DemoQATests extends TestBase {
    ElementsPage elements = new ElementsPage();
    @Owner("V.Yuzykhovich")
    @DisplayName("Checking DemoQA")
    @Test
    void checkDemoQATest() {
        elements.openPage()
                .clickElements()
                .clickTextBox()
                .fillFullName(fullName)
                .fillEmail(email)
                .fillCurrentAddress(currentAddress)
                .fillPermanentAddress(permanentAddress)
                .clickSubmit();
                //.checkResult();

    }
}
