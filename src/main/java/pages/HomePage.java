package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By dropdownLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
}