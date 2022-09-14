package cookies;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CookiesTests extends BaseTests {

    @Test
    public void testDeleteCookie() {
        String cookieName = "optimizelyBuckets";
        String cookieValue = "%7B%7D";
        getCookieManager().deleteCookie(cookieName, cookieValue);
        assertFalse(getCookieManager().isCookiePresent(cookieName));
    }
}
