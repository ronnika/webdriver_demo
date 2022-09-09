package dropdown;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectedOption() {
        var dropdownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(1, selectedOptions.size(), "Incorrect number of options");
        assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}
