package demoqaPages;

import baseDemoqa.BasePage;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class DemoqaHomePage extends BasePage {

    WebDriver driver;
    WebElement elementsButton;
    WebElement formsButton;
    WebElement alertsFramesAndWindowsButton;
    WebElement widgetsButton;
    WebElement interactionButton;
    WebElement bookStoreApplicationButton;
    WebElement seleniumImage;
    WebElement BackOnMainPage;


    //Konstruktor za DemoqaPage
    public DemoqaHomePage(WebDriver driver) {
        this.driver = driver;
    }
    //Getteri za ove elemente

    public WebElement getElementsButton() {
        return driver.findElement(By.cssSelector(".top-card:nth-of-type(1)"));
    }

    public WebElement getFormsButton() {
        return driver.findElement(By.cssSelector(".top-card:nth-of-type(2)"));
    }

    public WebElement getAlertsFramesAndWindowsButton() {
        return driver.findElement(By.cssSelector(".top-card:nth-of-type(3)"));
    }

    public WebElement getWidgetsButton() {
        return driver.findElement(By.cssSelector(".top-card:nth-of-type(4)"));
    }

    public WebElement getInteractionButton() {
        return driver.findElement(By.cssSelector(".top-card:nth-of-type(5)"));
    }

    public WebElement getBookStoreApplicationButton() {
        return driver.findElement(By.cssSelector(".top-card:nth-of-type(6)"));
    }

    public WebElement getSeleniumImage() {
        return driver.findElement(By.className("banner-image"));
    }

    public WebElement getBackOnMainPage() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/header/a"));
    }

    //Metoda da kliknemo na elements dugme
    public void clickElements() {
        this.getElementsButton().click();
    }
    //Metoda da kliknemo na formu dugme
    public void clickForm(){
        this.getFormsButton().click();
    }
    //Metoda da kliknemo na AlertsFramesAndWindows dugme
    public void clickAlertsFramesAndWindows() {
        this.getAlertsFramesAndWindowsButton().click();
    }
    //Metoda da kliknemo na Widgets dugme
    public void clickWidgetsButton() {
        this.getWidgetsButton().click();
    }
    //Metoda da kliknemo na Interactions dugme
    public void clickInteractionButton() {
        this.getInteractionButton().click();
    }
    public void clickBookStoreApplicationButton(){
        this.getBookStoreApplicationButton().click();
    }
    public void clickBackOnMainPage(){
        this.getBackOnMainPage().click();
    }

    }


