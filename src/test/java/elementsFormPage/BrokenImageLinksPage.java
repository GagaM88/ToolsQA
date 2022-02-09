package elementsFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokenImageLinksPage extends BasePage {

    WebDriver driver;
    WebElement statusCode;
    WebElement brokenLinksImage;
    WebElement fourObjects;
    WebElement pictures;
    WebElement links;

    public BrokenImageLinksPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getStatusCode() {
        return driver.findElement(By.xpath(" //div/p"));
    }

    public WebElement getBrokenLinksImage() {
        return driver.findElement(By.cssSelector("img:nth-of-type(2)"));
    }

    public List<WebElement> getFourObjects() {
        return driver.findElements(By.xpath("//div/p"));
    }

    public List<WebElement>  getPictures() {
        return driver.findElements(By.xpath("//div/img"));
    }

    public List<WebElement> getLinks() {
        return driver.findElements(By.xpath("//div/a[@href]"));
    }
}
