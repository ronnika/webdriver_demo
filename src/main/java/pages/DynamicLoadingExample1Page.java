package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample1Page extends BasePage {
    private By startButton = By.cssSelector("#start button");
    private By loadedText = By.cssSelector("#finish h4");
    private By loadingIndicator = By.id("loading");
    public DynamicLoadingExample1Page(WebDriver driver) {
        super(driver);
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions
//                .invisibilityOf(driver.findElement(loadingIndicator)));
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions
                .invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }

    public String getStartButtonText() {
        return driver.findElement(startButton).getText();
    }


}
