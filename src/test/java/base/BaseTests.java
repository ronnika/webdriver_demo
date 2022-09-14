package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import utils.WindowManager;

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
        setCookie();
    }

//    @AfterEach
//    public void takeScreenshot() {
//        var camera = (TakesScreenshot)driver;
//        File screenshot = camera.getScreenshotAs(OutputType.FILE);
//        System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
//        try {
//            Files.move(screenshot, new File("src/resources/screenshots/test.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    private static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.setHeadless(true);
        return options;
    }

    private void setCookie() {
        Cookie cookie = new Cookie.Builder("Tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

}
