package base;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver;

    @Test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(375, 812));
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
