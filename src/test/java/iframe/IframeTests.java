package iframe;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IframeTests extends BaseTests {

    @Test
    public void testTextAfterIncreasedIndent() {
        var editorPage = homePage.clickWysiwygEditor();
        String text1 = "Hello";
        String text2 = " world";
        editorPage.clearTextArea();
        editorPage.setTextArea(text1);
        editorPage.clickIncreaseIndentButton();
        editorPage.setTextArea(text2);

        assertEquals(text1+text2, editorPage.getTextFromEditor(), "Text is not correct");
    }
}
