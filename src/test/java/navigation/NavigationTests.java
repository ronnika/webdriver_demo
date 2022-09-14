package navigation;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testNavigatorSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchTo("New window");
    }

    @Test
    public void testExample1Tab() {
        var example1Page = homePage.clickDynamicLoading()
                        .contextClickExample1();
        getWindowManager().switchToNewTab();
        assertEquals("Start", example1Page.getStartButtonText(), "Text is not correct");
    }
}
