package demoqaPages;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ElementsPage extends BasePage {

    WebDriver driver;
    WebElement textBoxElementButton;
    WebElement checkBoxElementButton;
    WebElement radioElementButton;
    WebElement webTablesElementButton;
    WebElement buttonsElement;
    WebElement linksElementButton;
    WebElement brokenLinksElementButton;
    WebElement uploadAndDownloadButton;
    WebElement dynamicPropertiesButton;


    //Konstruktor za driver

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    //getteri za ove elemente
    public WebElement getTextBoxElementButton(){
        return driver.findElement(By.cssSelector(".element-group:first-child #item-0"));
    }

    public WebElement getCheckBoxElementButton(){
        return driver.findElement(By.cssSelector(".element-group:first-child #item-1"));
    }

    public WebElement getRadioElementButton() {
        return driver.findElement(By.cssSelector(".element-group:first-child #item-2"));
    }

    public WebElement getWebTablesElementButton() {
        return driver.findElement(By.cssSelector(".element-group:first-child #item-3"));
    }

    public WebElement getButtonsElement() {
        return driver.findElement(By.cssSelector(".element-group:first-child #item-4"));
    }

    public WebElement getLinksElementButton() {
        return driver.findElement(By.cssSelector(".element-group:first-child #item-5"));
    }

    public WebElement getBrokenLinksElementButton() {
        return driver.findElement(By.cssSelector(".element-group:first-child #item-6"));
    }

    public WebElement getUploadAndDownloadButton() {
        return driver.findElement(By.cssSelector(".element-group:first-child #item-7"));
    }

    public WebElement getDynamicPropertiesButton() {
        return driver.findElement(By.cssSelector(".element-group:first-child #item-8"));
    }
    //---------------------------------------------------

    //Metode da se klikne na ove elemente
    public void clickTextBoxButton() {
        this.getTextBoxElementButton().click();
    }

    public void clickCheckBoxButton() {
        this.getCheckBoxElementButton().click();
    }

    public void clickRadioElementsButton() {
        this.getRadioElementButton().click();
    }

    public void clickWebTablesElementButton() {
        this.getWebTablesElementButton().click();
    }

    public void clickButtonElements() {
        this.getButtonsElement().click();
    }

    public void clickLinksElement() {
        this.getLinksElementButton().click();
    }

    public void clickBrokenLinksButton() {
        this.getBrokenLinksElementButton().click();
    }

    public void clickUploadAndDownloadButton() {
        this.getUploadAndDownloadButton().click();
    }

    public void clickdynamicPropertiesButton() {
        this.getDynamicPropertiesButton().click();

    }
}



