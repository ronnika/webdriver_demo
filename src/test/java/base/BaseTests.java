package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private static WebDriver driver;
    protected HomePage homePage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
    }
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
