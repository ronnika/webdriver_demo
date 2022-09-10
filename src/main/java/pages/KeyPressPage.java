package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage extends BasePage {
    private By keyInput = By.id("target");
    private By result = By.id("result");

    KeyPressPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String text) {
        driver.findElement(keyInput).sendKeys(text);
    }

    public void enterPi() {
        enterText(Keys.chord(Keys.SHIFT, Keys.CONTROL, "U", "03C0") + "=3,14");
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }
}
