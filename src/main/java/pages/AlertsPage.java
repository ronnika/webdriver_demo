package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage {

    private By triggerAlertButton = By.xpath("//button[text()=\"Click for JS Alert\"]");
    private By confirmAlertButton = By.xpath("//button[text()=\"Click for JS Confirm\"]");
    private By promptAlertButton = By.xpath("//button[text()=\"Click for JS Prompt\"]");
    private By alertResult = By.id("result");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm() {
        driver.findElement(confirmAlertButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(promptAlertButton).click();
    }

    public void clickToAcceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void clickToCancelAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void enterTextToPromptAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public String getAlertResult() {
        return driver.findElement(alertResult).getText();
    }
}
