package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilesUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("/home/ronnie/Downloads/webDriver_course/src/resources/chromedriver");
        assertEquals("chromedriver", fileUploadPage.getUploadedFileName(),
                        "Uploaded file name is not correct");
    }
}
