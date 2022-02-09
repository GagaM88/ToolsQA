package elementsFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class CheckBoxPage extends BasePage {

    WebDriver driver;
    WebElement checkBoxHome;
    WebElement homeDropCheckBox;
    WebElement desktopDropCheckBox;
    WebElement desktop;
    WebElement plusIcon;
    WebElement notification;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCheckBoxHome() {
        return driver.findElement(By.cssSelector("[for=tree-node-home]"));
    }

    public WebElement getHomeDropCheckBox() {
        return driver.findElement(By.cssSelector("button[title=Toggle]"));
    }

    public WebElement getDesktopDropCheckBox() {
        return driver.findElement(By.cssSelector(".rct-collapse.rct-collapse-btn"));
    }

    public WebElement getDesktop() {
        return driver.findElement(By.cssSelector("[for=tree-node-desktop]"));
    }

    public WebElement getPlusIcon() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-all"));
    }

    public WebElement getNotification() {
        return driver.findElement(By.id("result"));
    }
    //----------------------------
    public void selectCheckBoxHome(){
        this.getCheckBoxHome().click();
    }
    public void selectHomeDropChekBox(){
        this.getHomeDropCheckBox().click();
    }
    public void selectDesktopDropCheckBox(){
        this.getDesktopDropCheckBox().click();
    }
    public void selectDesktop(int index){
       this.getDesktop().click();
    }
    public void clickOnPlusIcon(){
        this.getPlusIcon().click();
    }
    public String getNotificationSucc(){
      return getNotification().getText();
    }

}

