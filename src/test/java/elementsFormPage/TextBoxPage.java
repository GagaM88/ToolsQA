package elementsFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BasePage {

    WebDriver driver;

    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement btnSubmit;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getBtnSubmit() {
        return driver.findElement(By.id("submit"));
    }

    //------------------------------------------------------
    public void inputFullName(String  fullName){
        this.getFullName().clear();
        this.getFullName().sendKeys(fullName);
    }
    public void inputEmail(String email){
        this.getEmail().clear();
        this.getEmail().sendKeys(email);

    }
    public void inputCurrentAddress(String validCurrentAddress){
        this.getCurrentAddress().clear();
        this.getCurrentAddress().sendKeys(validCurrentAddress);
    }
    public void inputPermanentAddress(String validPermanentAddress){
        this.getPermanentAddress().clear();
        this.getPermanentAddress().sendKeys(validPermanentAddress);
}
    public void clickBtnSubmit(){
        this.getBtnSubmit().click();
    }

    }
