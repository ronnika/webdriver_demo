package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManager {
    private WebDriver driver;

    public CookieManager(WebDriver driver) {
        this.driver = driver;
    }

    public void setCookie() {
        Cookie cookie = new Cookie.Builder("Tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

    public void deleteCookie(String name, String value) {
        Cookie cookie = new Cookie.Builder(name, value)
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().deleteCookie(cookie);
    }

    public boolean isCookiePresent(String cookieName) {
        return driver.manage().getCookieNamed(cookieName) != null;
    }
}
