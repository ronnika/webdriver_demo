package keys;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals("You entered: BACK_SPACE",
                            keyPage.getResult(),
                    "Result is not correct");
    }

    @Test
    public void testPi() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
        assertEquals("You entered: 4",
                keyPage.getResult(),
                "Result is not correct");
    }

}
