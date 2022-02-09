package elementsFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicPropertiesPage extends BasePage {

    WebDriver driver;
    WebElement randomText;
    WebElement enableButt;
    WebElement colorChangeButt;
    WebElement visibleButt;

    public DynamicPropertiesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getRandomText() {
        return driver.findElement(By.xpath("//*[.='This text has random Id']"));
    }

    public WebElement getEnableButt() {
        return driver.findElement(By.id("enableAfter"));
    }

    public WebElement getColorChangeButt() {
        return driver.findElement(By.id("colorChange"));
    }

    public WebElement getVisibleButt() {
        return driver.findElement(By.id("visibleAfter"));
    }
}
