package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDomPage extends BasePage {

    private By table = By.id("large-table");
    public LargeDeepDomPage(WebDriver driver) {
        super(driver);
    }

    public void scrollToTable() {
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }
}
