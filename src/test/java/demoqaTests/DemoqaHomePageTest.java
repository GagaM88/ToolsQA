package demoqaTests;

import baseDemoqa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoqaHomePageTest extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to(HomeURL); //pozivamo URL
    }
    @Test (priority = 5)
    public void getTitle() {
        setUpPage();
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("ToolsQA"));
    }
    @Test (priority = 10)
    public void checkIfElementExistsOnPage() {
        setUpPage();
        boolean status = wdwait.until(ExpectedConditions.elementToBeClickable(By.className("banner-image"))).isDisplayed();
        Assert.assertTrue(status);

    }
    @Test (priority = 15)
    public void VerifyThatallMainsectionsFromaccordionMenuCanBeOpen(){
        setUpPage();
        demoqaHomePage.clickElements();
        demoqaHomePage.clickBackOnMainPage();
        demoqaHomePage.clickForm();
        demoqaHomePage.clickBackOnMainPage();
        demoqaHomePage.getAlertsFramesAndWindowsButton();
        demoqaHomePage.clickBackOnMainPage();
        demoqaHomePage.clickWidgetsButton();
        demoqaHomePage.clickBackOnMainPage();
        demoqaHomePage.clickBackOnMainPage();
        demoqaHomePage.clickInteractionButton();
        demoqaHomePage.clickBackOnMainPage();
        demoqaHomePage.clickBookStoreApplicationButton();
        demoqaHomePage.clickBackOnMainPage();
        Assert.assertTrue(demoqaHomePage.getSeleniumImage().isDisplayed());

    }
    @Test (priority = 20)
    public void testSimpleHomePage () {
        setUpPage();

        String expectedUrl = "https://demoqa.com/";


        Assert.assertEquals(HomeURL, expectedUrl);

        demoqaHomePage.clickElements();
        Assert.assertEquals(excelReader.getStringData("HomeURL", 1,3), "https://demoqa.com/elements");
        driver.navigate().back();

        demoqaHomePage.clickForm();
        Assert.assertEquals(excelReader.getStringData("HomeURL", 2, 3), "https://demoqa.com/forms");
        driver.navigate().back();


        demoqaHomePage.clickAlertsFramesAndWindows();
        Assert.assertEquals(excelReader.getStringData("HomeURL", 3, 3), "https://demoqa.com/alertsWindows");
        driver.navigate().back();


        demoqaHomePage.clickWidgetsButton();
        Assert.assertEquals(excelReader.getStringData("HomeURL", 4, 3), "https://demoqa.com/widgets");
        driver.navigate().back();


        demoqaHomePage.clickInteractionButton();
        Assert.assertEquals(excelReader.getStringData("HomeURL", 5, 3), "https://demoqa.com/interaction");
        driver.navigate().back();

        demoqaHomePage.clickBookStoreApplicationButton();
        Assert.assertEquals(excelReader.getStringData("HomeURL", 6, 3), "https://demoqa.com/books");
        driver.navigate().back();
        
    }
    }


