package base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private static WebDriver driver;
    protected static HomePage homePage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}
