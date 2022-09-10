package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage extends BasePage{

    private By fileInput = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadFiles = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of file to the form then clicks Upload button
     * @param absolutePathOfFile the absolute path of the file to upload
     */
    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(fileInput).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFileName() {
        return driver.findElement(uploadFiles).getText();
    }
}
