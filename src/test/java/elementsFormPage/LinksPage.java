package elementsFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage extends BasePage {

    WebDriver driver;
    WebElement headerLinks;
    WebElement homeLink;
    WebElement moved;
    WebElement status;

    public LinksPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHeaderLinks() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.id("simpleLink"));
    }

    public WebElement getMoved() {
        return driver.findElement(By.id("moved"));
    }

    public WebElement getStatus() {
        return driver.findElement(By.id("linkResponse"));
    }
    //------------------------------

}
