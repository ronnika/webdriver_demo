package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage extends BasePage{
    private String editoriFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaceIndentButton = By.cssSelector("button[aria-label=\"Increase indent\"]");
    public WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    private void  switchToEditorIframe() {
        driver.switchTo().frame(editoriFrameId);
    }

    public void clearTextArea() {
        switchToEditorIframe();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditorIframe();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void clickIncreaseIndentButton() {
        driver.findElement(increaceIndentButton).click();
    }

    public String getTextFromEditor() {
        switchToEditorIframe();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

}
