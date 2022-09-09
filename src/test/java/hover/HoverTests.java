package hover;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        assertTrue(caption.getTitle().contains("name: user1"));
        assertTrue(caption.getLink().endsWith("/users/1"), "Caption link is not correct");
        assertEquals("View profile",
                        caption.getLinkText(),
                         "Caption link text is not correct");
    }
}
