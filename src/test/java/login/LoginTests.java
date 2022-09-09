package login;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin() {
        var loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        var secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }
}
