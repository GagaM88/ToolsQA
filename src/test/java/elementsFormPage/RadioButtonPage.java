package elementsFormPage;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class RadioButtonPage extends BasePage {

    WebDriver driver;
    WebElement allRadioButton;
    WebElement allRadioButtonText;
    WebElement yesImpressiveButtons;
    WebElement buttonSuccesText;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAllRadioButton() {
        return driver.findElement(By.xpath("//input[@type='radio']"));
    }

    public WebElement getAllRadioButtonText() {
        return driver.findElement(By.xpath("//div[contains(@class,'custom-control')]"));
    }

    public List<WebElement> getYesImpressiveButtons() {
        return driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
    }

    public WebElement getButtonSuccesText() {
        return driver.findElement(By.className("text-success"));
    }

    //----------------------

    public void clickAllRadioButton(){
        this.getAllRadioButton().click();
    }
    public void clckAllRadioButtonText() {
        this.getAllRadioButtonText().click();
    }
    public String getResult(){
        return getButtonSuccesText().getText();
    }
    public String clickYesImpressiveButtons(int i){
        return getYesImpressiveButtons().get(i).getText();
}
    }
