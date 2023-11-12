package org.veta.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.veta.pages.HomePage;
import org.veta.pages.alerts_frame_windows.AlertsPage;
import org.veta.pages.alerts_frame_windows.BrowserWindowsPage;
import org.veta.pages.elements.ButtonsPage;
import org.veta.pages.elements.TextBoxPage;

import static org.veta.tests.TestData.*;

public class DemoQATests extends TestBase {
    HomePage homePage = new HomePage();
    TextBoxPage textBoxPage = new TextBoxPage();
    ButtonsPage buttonsPage = new ButtonsPage();
    BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage();
    AlertsPage alertsPage = new AlertsPage();


    @Owner("V.Yuzykhovich")
    @DisplayName("Testing DemoQA")
    @Test
    void checkDemoQATest() {
        homePage.openPage()
                .clickElements();
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
                .clickClickMeButton()
                .checkDynamicClickMessage()
                .clickRightClickMeButton()
                .checkRightClickMessage()
                .clickDoubleClickMeButton()
                .checkDoubleClickMessage();
        browserWindowsPage.clickAlertsFrameWindowsButton()
                .clickBrowserWindowsButton()
                .clickNewTabButton()
                .closeNewTab_Or_Window()
                .clickNewWindowButton()
                .closeNewTab_Or_Window();
        alertsPage.clickAlertsButton()
                .clickButtonToSeeAlert()
                .closeNotification()
                .clickButtonToSeeAlertAfterFiveSec()
                .closeNotification()
                .clickButtonConfirmBoxAppear()
                .checkConfirmBoxOkMessage()
                .clickButtonPromptBoxAppear()
                .fillDataInPromptBox(testName)
                .checkPromptBoxMessage();
    }
}
