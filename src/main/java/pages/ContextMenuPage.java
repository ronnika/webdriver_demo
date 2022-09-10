package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    private By contexMenuBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void contexClick() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(contexMenuBox))
                .contextClick()
                .perform();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void clickToAcceptAlert() {
        driver.switchTo().alert().accept();
    }

}
