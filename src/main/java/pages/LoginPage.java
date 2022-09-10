package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
