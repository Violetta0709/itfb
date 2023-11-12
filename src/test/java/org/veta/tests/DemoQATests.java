package org.veta.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.veta.pages.alerts_frame_windows.AlertsFrameWindowsPage;
import org.veta.pages.alerts_frame_windows.AlertsPage;
import org.veta.pages.alerts_frame_windows.BrowserWindowsPage;
import org.veta.pages.elements.ButtonsPage;
import org.veta.pages.elements.ElementsPage;
import org.veta.pages.elements.TextBoxPage;

import static org.veta.tests.TestData.*;

public class DemoQATests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    ElementsPage elementsPage = new ElementsPage();
    ButtonsPage buttonsPage = new ButtonsPage();
    AlertsFrameWindowsPage alertsFrameWindowsPage = new AlertsFrameWindowsPage();
    BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage();
    AlertsPage alertsPage = new AlertsPage();


    @Owner("V.Yuzykhovich")
    @DisplayName("Testing DemoQA")
    @Test
    void checkDemoQATest() {
        elementsPage.openElements().
                clickElements("Elements");
        textBoxPage.clickTextBox()
                .fillFullName(fullName)
                .fillEmail(email)
                .fillCurrentAddress(currentAddress)
                .fillPermanentAddress(permanentAddress)
                .clickSubmit()
                .checkNameSavedCorrect(fullName)
                .checkEmailSavedCorrect(email)
                .checkCurrentAddressSavedCorrect(currentAddress)
                .checkPermanentAddressSavedCorrect(permanentAddress);
        buttonsPage.clickButtons()
                .clickClickButton()
                .checkDynamicClickMessage()
                .clickRightClickButton()
                .checkRightClickMessage()
                .clickDoubleClickButton()
                .checkDoubleClickMessage();
        alertsFrameWindowsPage.clickAlertsFramesWindowsButton();
        browserWindowsPage.clickBrowserWindowsButton()
                .clickNewTabButton()
                .closeNewTab_Or_Window()
                .clickNewWindowButton()
                .closeNewTab_Or_Window();
        alertsPage.clickAlertsButton()
                .clickButtonToSeeAlert()
                .closeNotification()
                .clickButtonToSeeAllertAppearAfterFiveSec()
                .closeNotification()
                .clickButtonConfirmBoxAppear()
                .checkConfirmBoxOkMessage()
                .clickButtonPromptBoxAppear(testName)
                .checkPromptBoxOkMessage();
    }
}
