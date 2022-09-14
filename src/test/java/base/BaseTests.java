package base;

import com.google.common.io.Files;
import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private static WebDriver driver;
    protected static HomePage homePage;




    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().getPageLoadTimeout();
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterEach
    public void takeScreenshot() {
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
        try {
            Files.move(screenshot, new File("src/resources/screenshots/test.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

}
