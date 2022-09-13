package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage  extends BasePage {

    private By dropdown = By.id("dropdown");
    private WebElement dropdownElement = driver.findElement(dropdown);

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectFromDropdown(String option)  {
        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream()
                .map((e -> e.getText()))
                .collect(Collectors.toList());
    }

    public void addMultipleAttribute() {
        String script = "arguments[0].setAttribute(\"multiple\", \"\")";
        ((JavascriptExecutor)driver).executeScript(script, dropdownElement);
    }

    private Select findDropdownElement() {
        return new Select(dropdownElement);
    }
}
