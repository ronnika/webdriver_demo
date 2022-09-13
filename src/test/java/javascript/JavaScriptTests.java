package javascript;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testDropdownMultiple() {
        var dropdownPage = homePage.clickDropdown();
        String option1 = "Option 1";
        String option2 = "Option 2";
        List<String> optionsToSelect = List.of(option1,option2);

        dropdownPage.addMultipleAttribute();
        optionsToSelect.forEach(dropdownPage::selectFromDropdown);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "Not all options are selected");
        assertEquals(optionsToSelect.size(), selectedOptions.size(), "Number of selected items is not correct");
    }
}
