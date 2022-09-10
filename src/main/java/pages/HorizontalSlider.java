package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider extends BasePage {

    private By inputSlider = By.tagName("input");
    private By rangeResult = By.id("range");

    public HorizontalSlider(WebDriver driver) {
        super(driver);
    }

    /**
     *
     * @param number is in range from 2,5 to 5
     */
    public void moveSliderToNumber(int number) {
        var slider = driver.findElement(inputSlider);
        slider.click();
        for (int i = 0; i < number - 1; i++) {
            slider.sendKeys(Keys.ARROW_UP);
        }
    }

    public String getResult() {
        return driver.findElement(rangeResult).getText();
    }
}
