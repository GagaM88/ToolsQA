package baseDemoqa;

import demoqaPages.DemoqaHomePage;
import demoqaPages.DemoqaMenuPage;
import demoqaPages.ElementsPage;
import elementsFormPage.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import practiceFormPage.PracticePage;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public String HomeURL;
    public ExcelReader excelReader;
    public JavascriptExecutor js;
    public ElementsPage elementsPage;
    public DemoqaHomePage demoqaHomePage;
    public DemoqaMenuPage demoqaMenuPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablePage webTablePage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenImageLinksPage brokenImageLinksPage;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public PracticePage practicePage;



    @BeforeClass
    public void setup () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("/Users/draganamitrovic/DemoQa.xlsx");
        HomeURL = excelReader.getStringData("HomeURL", 1, 0);
        elementsPage = new ElementsPage(driver);
        demoqaHomePage = new DemoqaHomePage(driver);
        demoqaMenuPage = new DemoqaMenuPage(driver);
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        webTablePage = new WebTablePage(driver);
        buttonsPage = new ButtonsPage(driver);
        linksPage = new LinksPage(driver);
        brokenImageLinksPage = new BrokenImageLinksPage(driver);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver);
        practicePage = new PracticePage(driver);



    }
    public void waitVisibility(WebElement element){ //metoda koja me vodi da neki lokator bude vidljiv
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitandClick(WebElement element) { //metoda koja me vodi na to da neki locator bude vidljiv pa da se klikne na njega
        wdwait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public WebElement waitAlertPresent(WebElement element){ //metoda koja me vodi da neka alert poruka bude vidljiva
        return wdwait.until(ExpectedConditions.visibilityOf(element));

    }
    public void scroll(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void actionDoubleClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }

    public void actionRightClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
    }

    @AfterClass
    public void tearDown () {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}


