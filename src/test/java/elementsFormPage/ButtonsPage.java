package elementsFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonsPage extends BasePage {

    WebDriver driver;
    WebElement doubleClickButt;
    WebElement rightClickButt;
    WebElement clickMeButt;
    WebElement doubleClickNotification;
    WebElement rightClickNotification;
    WebElement notification;

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDoubleClickButt() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getRightClickButt() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getClickMeButt() {
        return driver.findElement(By.cssSelector("div[class=\"col-12 mt-4 col-md-6\"] div:nth-last-of-type(1) button"));
    }

    public WebElement getDoubleClickNotification() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getRightClickNotification() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getNotification() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    //--------------------
    public void clickOnDoubleClickButt() {
        this.getDoubleClickButt().click();
    }

    public void clickOnRightClickButt() {
        this.getRightClickButt().click();
    }

    public void clickOnClickMeButt() {
        this.getClickMeButt().click();
    }

    public String clickNotificatiion() {
        return getNotification().getText();
    }

    public String doubleNotification() {
       return getDoubleClickNotification().getText();
    }

    public String rightNotification() {
        return getRightClickNotification().getText();
    }
}
