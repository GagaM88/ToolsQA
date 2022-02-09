package demoqaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class DemoqaMenuPage {

    WebDriver driver;
    WebElement menuCardsLinks;
    WebElement seleniumImage;

    public DemoqaMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getMenuCardsLinks(){
        return driver.findElements(By.className("card-body"));

    }
    public WebElement getSeleniumImage(){
        return driver.findElement(By.className("banner-image"));
    }

    //---------------------------------
    //pravimo metode da se klikne na ove elemente

    public void clickMenuCardsLinks(int i){
        this.getMenuCardsLinks().get(i).click();

    }
    public String menuCardTitle(int i){
        return this.getMenuCardsLinks().get(i).getText();
    }
    public void clickOnSeleniumImage(){
        this.getSeleniumImage().click();

    }
}
