package elementsFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownloadPage extends BasePage {

    WebDriver driver;
    WebElement mainHeader;
    WebElement uploadedFile;
    WebElement downloadButton;
    WebElement selectFile;

    public UploadAndDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMainHeader() {
        return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
    }

    public WebElement getUploadedFile() {
        return driver.findElement(By.id("uploadedFilePath"));
    }

    public WebElement getDownloadButton() {
        return driver.findElement(By.cssSelector(".btn.btn-primary"));
    }
    public WebElement getSelectFile(){
        return driver.findElement(By.xpath("//input"));
    }
}
