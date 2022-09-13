package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePage {
    private String linkXpathFormat = ".//a[contains(text(), '%s')]";
    private By example1Link = By.xpath(String.format(linkXpathFormat, "Example 1"));
    private By example2Link = By.xpath(String.format(linkXpathFormat, "Example 2"));
    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DynamicLoadingExample1Page clickExample1() {
        driver.findElement(example1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2() {
        driver.findElement(example2Link).click();
        return new DynamicLoadingExample2Page(driver);
    }

}
