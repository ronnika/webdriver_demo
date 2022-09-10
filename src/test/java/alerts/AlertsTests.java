package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.clickToAcceptAlert();
        assertEquals("You successfully clicked an alert",
                        alertPage.getAlertResult(),
                        "Alert is not accepted");
    }

    @Test
    public void testDismissConfirmAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        assertEquals("I am a JS Confirm",
                alertPage.getAlertText(),
                "Alert text is not correct");
        alertPage.clickToCancelAlert();
        assertEquals("You clicked: Cancel",
                alertPage.getAlertResult(),
                "Cancel is not clicked");
    }

    @Test
    public void testEnterTextPromptAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        assertEquals("I am a JS prompt",
                alertPage.getAlertText(),
                "Alert text is not correct");
        String text = "Text";
        alertPage.enterTextToPromptAlert(text);
        alertPage.clickToAcceptAlert();
        assertEquals("You entered: " + text,
                alertPage.getAlertResult(),
                "Result text is not correct");
    }
}
