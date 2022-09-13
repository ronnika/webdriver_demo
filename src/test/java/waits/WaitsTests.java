package waits;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaitsTests extends BaseTests {

    @Test
    public void testWaitExample1() {
        var example1Page = homePage.clickDynamicLoading().clickExample1();
        example1Page.clickStartButton();
        String text = example1Page.getLoadedText();

        assertEquals("Hello World!", text, "Loaded text is not correct!");
    }

    @Test
    public void testWaitExample2() {
        var example2Page = homePage.clickDynamicLoading().clickExample2();
        example2Page.clickStartButton();
        String text = example2Page.getLoadedText();

        assertEquals("Hello World!", text, "Loaded text is not correct!");
    }
}
